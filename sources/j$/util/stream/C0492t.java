package j$.util.stream;

import j$.util.function.A;
import j$.util.function.C;
import j$.util.function.C0388n;
import j$.util.function.C0392q;
import j$.util.function.C0394t;
import j$.util.function.C0395u;
import j$.util.function.C0397w;
import j$.util.function.C0400z;
import j$.util.function.r;

/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
final class C0492t extends Y1 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18893b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0423c f18894c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0492t(C0423c cVar, C0440f2 f2Var, int i10) {
        super(f2Var);
        this.f18893b = i10;
        this.f18894c = cVar;
    }

    public final void accept(double d10) {
        switch (this.f18893b) {
            case 0:
                this.f18743a.accept(((A) ((C) ((C0496u) this.f18894c).f18903u)).b(d10));
                return;
            case 1:
                this.f18743a.accept(((C0392q) ((C0500v) this.f18894c).f18909u).apply(d10));
                return;
            case 2:
                this.f18743a.accept(((C0395u) ((C0397w) ((C0504w) this.f18894c).f18924u)).a(d10));
                return;
            case 3:
                this.f18743a.accept(((C0400z) ((C0508x) this.f18894c).f18934u).applyAsLong(d10));
                return;
            case 4:
                F f10 = (F) ((C0392q) ((C0496u) this.f18894c).f18903u).apply(d10);
                if (f10 != null) {
                    try {
                        f10.sequential().H(new C0488s(1, this));
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        break;
                    }
                }
                if (f10 != null) {
                    f10.close();
                    return;
                }
                return;
            case 5:
                if (((r) ((C0394t) ((C0496u) this.f18894c).f18903u)).e(d10)) {
                    this.f18743a.accept(d10);
                    return;
                }
                return;
            default:
                ((C0388n) ((C0496u) this.f18894c).f18903u).accept(d10);
                this.f18743a.accept(d10);
                return;
        }
        throw th;
    }

    public final void f(long j10) {
        switch (this.f18893b) {
            case 4:
                this.f18743a.f(-1);
                return;
            case 5:
                this.f18743a.f(-1);
                return;
            default:
                this.f18743a.f(j10);
                return;
        }
    }
}
