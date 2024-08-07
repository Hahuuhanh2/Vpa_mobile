package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import na.c;
import pa.e;
import pa.g;
import vl.d;

/* compiled from: CrashlyticsController */
public final class q implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f11352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f11353b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f11354c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f11355d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f11356e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f11357f;

    public q(t tVar, long j10, Throwable th2, Thread thread, g gVar) {
        this.f11357f = tVar;
        this.f11352a = j10;
        this.f11353b = th2;
        this.f11354c = thread;
        this.f11355d = gVar;
    }

    public final Object call() {
        long j10 = this.f11352a / 1000;
        String d10 = this.f11357f.d();
        if (d10 == null) {
            return Tasks.forResult(null);
        }
        d dVar = this.f11357f.f11365c;
        dVar.getClass();
        try {
            c cVar = (c) dVar.f23363c;
            cVar.getClass();
            new File(cVar.f13552b, (String) dVar.f23362b).createNewFile();
        } catch (IOException unused) {
        }
        m0 m0Var = this.f11357f.f11375m;
        Throwable th2 = this.f11353b;
        Thread thread = this.f11354c;
        m0Var.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        m0Var.d(th2, thread, d10, "crash", j10, true);
        t tVar = this.f11357f;
        long j11 = this.f11352a;
        tVar.getClass();
        try {
            c cVar2 = tVar.f11369g;
            String str = ".ae" + j11;
            cVar2.getClass();
            if (new File(cVar2.f13552b, str).createNewFile()) {
                this.f11357f.c(false, this.f11355d);
                t tVar2 = this.f11357f;
                new g(this.f11357f.f11368f);
                t.a(tVar2, g.f11298b);
                if (!this.f11357f.f11364b.a()) {
                    return Tasks.forResult(null);
                }
                Executor executor = this.f11357f.f11367e.f11332a;
                return ((e) this.f11355d).f14130i.get().getTask().onSuccessTask(executor, new p(this, executor, d10));
            }
            throw new IOException("Create new file failed.");
        } catch (IOException unused2) {
        }
    }
}
