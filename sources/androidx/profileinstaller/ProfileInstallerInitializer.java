package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import v.f;

public class ProfileInstallerInitializer implements f3.b<c> {

    public static class a {
        public static void a(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new w2.c(runnable));
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public final List<Class<? extends f3.b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        a.a(new f(17, this, context.getApplicationContext()));
        return new c();
    }
}
