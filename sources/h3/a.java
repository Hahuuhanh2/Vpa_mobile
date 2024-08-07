package h3;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f10542a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f10543b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f10543b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f10543b == null) {
                f10542a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f10543b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f10543b.invoke((Object) null, new Object[]{Long.valueOf(f10542a)})).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
