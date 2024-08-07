package fb;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f10095a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f10096b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f10097c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q f10098d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f10099e;

    public /* synthetic */ a0(Context context, FirebaseMessaging firebaseMessaging, n nVar, q qVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f10095a = context;
        this.f10096b = scheduledThreadPoolExecutor;
        this.f10097c = firebaseMessaging;
        this.f10098d = qVar;
        this.f10099e = nVar;
    }

    public final Object call() {
        z zVar;
        Context context = this.f10095a;
        ScheduledExecutorService scheduledExecutorService = this.f10096b;
        FirebaseMessaging firebaseMessaging = this.f10097c;
        q qVar = this.f10098d;
        n nVar = this.f10099e;
        synchronized (z.class) {
            WeakReference<z> weakReference = z.f10185b;
            if (weakReference != null) {
                zVar = weakReference.get();
            } else {
                zVar = null;
            }
            if (zVar == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                z zVar2 = new z(sharedPreferences, scheduledExecutorService);
                synchronized (zVar2) {
                    zVar2.f10186a = w.a(sharedPreferences, scheduledExecutorService);
                }
                z.f10185b = new WeakReference<>(zVar2);
                zVar = zVar2;
            }
        }
        return new b0(firebaseMessaging, qVar, zVar, nVar, context, scheduledExecutorService);
    }
}
