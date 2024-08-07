package t6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import i7.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class q {

    /* renamed from: e  reason: collision with root package name */
    public static q f14873e;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14874a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f14875b;

    /* renamed from: c  reason: collision with root package name */
    public m f14876c = new m(this);

    /* renamed from: d  reason: collision with root package name */
    public int f14877d = 1;

    public q(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14875b = scheduledExecutorService;
        this.f14874a = context.getApplicationContext();
    }

    public static synchronized q a(Context context) {
        q qVar;
        synchronized (q.class) {
            if (f14873e == null) {
                zze.zza();
                f14873e = new q(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a("MessengerIpcClient"))));
            }
            qVar = f14873e;
        }
        return qVar;
    }

    public final synchronized <T> Task<T> b(o<T> oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(String.valueOf(oVar).length() + 9);
        }
        if (!this.f14876c.d(oVar)) {
            m mVar = new m(this);
            this.f14876c = mVar;
            mVar.d(oVar);
        }
        return oVar.f14870b.getTask();
    }
}
