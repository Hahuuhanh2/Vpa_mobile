package v9;

import androidx.appcompat.app.p;
import androidx.fragment.app.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import r9.c;
import s9.b;
import xa.d;
import y6.j;

/* compiled from: DefaultFirebaseAppCheck */
public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public final za.b<d> f16095a;

    /* renamed from: b  reason: collision with root package name */
    public final k f16096b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16097c;

    /* renamed from: d  reason: collision with root package name */
    public final Task<Void> f16098d;

    /* renamed from: e  reason: collision with root package name */
    public final a f16099e = new a();

    /* renamed from: f  reason: collision with root package name */
    public o f16100f;

    public e(m9.d dVar, za.b<d> bVar, @r9.d Executor executor, @c Executor executor2, @r9.a Executor executor3, @r9.b ScheduledExecutorService scheduledExecutorService) {
        j.f(dVar);
        j.f(bVar);
        this.f16095a = bVar;
        new ArrayList();
        new ArrayList();
        dVar.a();
        this.f16096b = new k(dVar.f13218a, dVar.f());
        dVar.a();
        new m(dVar.f13218a, this, executor2, scheduledExecutorService);
        this.f16097c = executor2;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new p(25, this, taskCompletionSource));
        this.f16098d = taskCompletionSource.getTask();
    }

    public final Task a() {
        return this.f16098d.continueWithTask(this.f16097c, new d(this));
    }
}
