package bl;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ek.f;
import p3.l0;
import sk.j;

/* compiled from: HandlerDispatcher.kt */
public final class h {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new f(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            obj = l0.A(th2);
        }
        if (obj instanceof f.a) {
            obj = null;
        }
        g gVar = (g) obj;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            j.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
