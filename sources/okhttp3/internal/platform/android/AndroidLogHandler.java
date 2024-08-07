package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import sk.j;
import yk.l;
import yk.m;

/* compiled from: AndroidLog.kt */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidLogHandler f22572a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int i10;
        int min;
        j.f(logRecord, "record");
        AndroidLog androidLog = AndroidLog.f22569a;
        String loggerName = logRecord.getLoggerName();
        j.e(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i10 = 5;
        } else if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = logRecord.getMessage();
        j.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        androidLog.getClass();
        String str = AndroidLog.f22571c.get(loggerName);
        if (str == null) {
            str = m.l1(23, loggerName);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                message = message + 10 + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int R0 = l.R0(message, 10, i11, false, 4);
                if (R0 == -1) {
                    R0 = length;
                }
                while (true) {
                    min = Math.min(R0, i11 + 4000);
                    String substring = message.substring(i11, min);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, str, substring);
                    if (min >= R0) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }
}
