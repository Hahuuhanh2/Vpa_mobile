package y3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.a;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o3.p;
import sk.j;

/* compiled from: ProcessUtils.kt */
public final class o {
    static {
        j.e(o3.j.b("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, a aVar) {
        String str;
        T t10;
        boolean z10;
        j.f(context, "context");
        j.f(aVar, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f17390a.a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, p.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
                j.c(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable unused) {
                o3.j.a().getClass();
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            j.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) t10).pid == myPid) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) t10;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
            str = null;
        }
        return j.a(str, context.getApplicationInfo().processName);
    }
}
