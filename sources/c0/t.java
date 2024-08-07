package c0;

import f0.w;
import i0.m;
import java.util.concurrent.Executor;
import v8.a;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4329a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f4330b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b.a f4331c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f4332d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4333e;

    public /* synthetic */ t(u uVar, Executor executor, long j10, b.a aVar) {
        this.f4333e = uVar;
        this.f4330b = executor;
        this.f4332d = j10;
        this.f4331c = aVar;
    }

    public /* synthetic */ t(Executor executor, m mVar, b.a aVar, long j10) {
        this.f4330b = executor;
        this.f4333e = mVar;
        this.f4331c = aVar;
        this.f4332d = j10;
    }

    public final void run() {
        switch (this.f4329a) {
            case 0:
                u uVar = (u) this.f4333e;
                Executor executor = this.f4330b;
                long j10 = this.f4332d;
                executor.execute(new s(uVar, uVar.f4354i, executor, this.f4331c, j10));
                return;
            default:
                this.f4330b.execute(new w((a) this.f4333e, this.f4331c, this.f4332d));
                return;
        }
    }
}
