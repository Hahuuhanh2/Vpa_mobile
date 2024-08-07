package j$.util.stream;

import j$.util.function.IntFunction;
import j$.util.function.L;
import j$.util.function.N;
import j$.util.function.P;
import j$.util.function.Q;
import j$.util.function.T;
import j$.util.function.W;
import j$.util.function.Z;

final class X extends Z1 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18738b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0423c f18739c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(C0423c cVar, C0440f2 f2Var, int i10) {
        super(f2Var);
        this.f18738b = i10;
        this.f18739c = cVar;
    }

    public final void accept(int i10) {
        switch (this.f18738b) {
            case 0:
                this.f18745a.accept((long) i10);
                return;
            case 1:
                ((L) ((C0504w) this.f18739c).f18924u).accept(i10);
                this.f18745a.accept(i10);
                return;
            case 2:
                this.f18745a.accept((double) i10);
                return;
            case 3:
                this.f18745a.accept(((j$.util.function.X) ((Z) ((C0504w) this.f18739c).f18924u)).b(i10));
                return;
            case 4:
                this.f18745a.accept(((IntFunction) ((C0500v) this.f18739c).f18909u).apply(i10));
                return;
            case 5:
                this.f18745a.accept(((W) ((C0508x) this.f18739c).f18934u).applyAsLong(i10));
                return;
            case 6:
                this.f18745a.accept(((Q) ((T) ((C0496u) this.f18739c).f18903u)).a(i10));
                return;
            case 7:
                IntStream intStream = (IntStream) ((IntFunction) ((C0504w) this.f18739c).f18924u).apply(i10);
                if (intStream != null) {
                    try {
                        intStream.sequential().Y(new W(1, this));
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((N) ((P) ((C0504w) this.f18739c).f18924u)).e(i10)) {
                    this.f18745a.accept(i10);
                    return;
                }
                return;
        }
        throw th;
    }

    public final void f(long j10) {
        switch (this.f18738b) {
            case 7:
                this.f18745a.f(-1);
                return;
            case 8:
                this.f18745a.f(-1);
                return;
            default:
                this.f18745a.f(j10);
                return;
        }
    }
}
