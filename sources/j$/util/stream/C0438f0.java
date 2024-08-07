package j$.util.stream;

import j$.util.function.C0375g0;
import j$.util.function.C0381j0;
import j$.util.function.C0383k0;
import j$.util.function.C0387m0;
import j$.util.function.C0389n0;
import j$.util.function.p0;
import j$.util.function.q0;
import j$.util.function.s0;
import j$.util.function.w0;

/* renamed from: j$.util.stream.f0  reason: case insensitive filesystem */
final class C0438f0 extends C0416a2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18790b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0423c f18791c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0438f0(C0423c cVar, C0440f2 f2Var, int i10) {
        super(f2Var);
        this.f18790b = i10;
        this.f18791c = cVar;
    }

    public final void accept(long j10) {
        switch (this.f18790b) {
            case 0:
                this.f18751a.accept((double) j10);
                return;
            case 1:
                this.f18751a.accept(((w0) ((C0508x) this.f18791c).f18934u).applyAsLong(j10));
                return;
            case 2:
                this.f18751a.accept(((C0381j0) ((C0500v) this.f18791c).f18909u).apply(j10));
                return;
            case 3:
                this.f18751a.accept(((q0) ((s0) ((C0504w) this.f18791c).f18924u)).a(j10));
                return;
            case 4:
                this.f18751a.accept(((C0389n0) ((p0) ((C0496u) this.f18791c).f18903u)).a(j10));
                return;
            case 5:
                C0466m0 m0Var = (C0466m0) ((C0381j0) ((C0508x) this.f18791c).f18934u).apply(j10);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().E(new C0434e0(1, this));
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (m0Var != null) {
                    m0Var.close();
                    return;
                }
                return;
            case 6:
                if (((C0383k0) ((C0387m0) ((C0508x) this.f18791c).f18934u)).e(j10)) {
                    this.f18751a.accept(j10);
                    return;
                }
                return;
            default:
                ((C0375g0) ((C0508x) this.f18791c).f18934u).accept(j10);
                this.f18751a.accept(j10);
                return;
        }
        throw th;
    }

    public final void f(long j10) {
        switch (this.f18790b) {
            case 5:
                this.f18751a.f(-1);
                return;
            case 6:
                this.f18751a.f(-1);
                return;
            default:
                this.f18751a.f(j10);
                return;
        }
    }
}
