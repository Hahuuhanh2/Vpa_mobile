package s8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class e0 extends b0 {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f14683n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f14684o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ e f14685p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, b0 b0Var) {
        super(taskCompletionSource);
        this.f14685p = eVar;
        this.f14683n = taskCompletionSource2;
        this.f14684o = b0Var;
    }

    public final void b() {
        synchronized (this.f14685p.f14674f) {
            e eVar = this.f14685p;
            TaskCompletionSource taskCompletionSource = this.f14683n;
            eVar.f14673e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new d0(eVar, taskCompletionSource));
            if (this.f14685p.f14680l.getAndIncrement() > 0) {
                this.f14685p.f14670b.b("Already connected to the service.", new Object[0]);
            }
            e.b(this.f14685p, this.f14684o);
        }
    }
}
