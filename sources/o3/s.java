package o3;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.d;

/* compiled from: WorkerFactory */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13702a = 0;

    static {
        j.b("WorkerFactory");
    }

    public final d a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        d dVar = null;
        try {
            cls = Class.forName(str).asSubclass(d.class);
        } catch (Throwable unused) {
            j.a().getClass();
            cls = null;
        }
        if (cls != null) {
            try {
                dVar = (d) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Throwable unused2) {
                j.a().getClass();
            }
        }
        if (dVar == null || !dVar.f3759d) {
            return dVar;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
