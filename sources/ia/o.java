package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import ia.f0;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import m9.b;
import pa.g;

/* compiled from: CrashlyticsController */
public final class o implements f0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f11347a;

    public o(t tVar) {
        this.f11347a = tVar;
    }

    public final void a(g gVar, Thread thread, Throwable th2) {
        Task<TContinuationResult> continueWithTask;
        t tVar = this.f11347a;
        synchronized (tVar) {
            Objects.toString(th2);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            long currentTimeMillis = System.currentTimeMillis();
            l lVar = tVar.f11367e;
            q qVar = new q(tVar, currentTimeMillis, th2, thread, gVar);
            synchronized (lVar.f11334c) {
                continueWithTask = lVar.f11333b.continueWithTask(lVar.f11332a, new n(qVar));
                lVar.f11333b = continueWithTask.continueWith(lVar.f11332a, new b());
            }
            try {
                o0.a(continueWithTask);
            } catch (Exception | TimeoutException unused) {
            }
        }
    }
}
