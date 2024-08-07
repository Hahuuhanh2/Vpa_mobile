package s8;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import f0.b0;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14658a;

    public a0(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f14658a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return b0.s(str, " : ", str2);
    }

    public final void a(String str, RemoteException remoteException, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            c(this.f14658a, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            c(this.f14658a, str, objArr);
        }
    }
}
