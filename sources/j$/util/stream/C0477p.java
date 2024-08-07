package j$.util.stream;

import j$.util.function.C0375g0;
import j$.util.function.C0388n;
import j$.util.function.Function;
import j$.util.function.L;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
final class C0477p extends C0421b2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18853b = 0;

    /* renamed from: c  reason: collision with root package name */
    Object f18854c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0423c f18855d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0477p(C0481q qVar, C0440f2 f2Var) {
        super(f2Var);
        this.f18855d = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0477p(C0496u uVar, C0440f2 f2Var) {
        super(f2Var);
        this.f18855d = uVar;
        this.f18854c = new C0488s(0, f2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0477p(C0504w wVar, C0440f2 f2Var) {
        super(f2Var);
        this.f18855d = wVar;
        this.f18854c = new W(0, f2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0477p(C0508x xVar, C0440f2 f2Var) {
        super(f2Var);
        this.f18855d = xVar;
        this.f18854c = new C0434e0(0, f2Var);
    }

    public final void accept(Object obj) {
        switch (this.f18853b) {
            case 0:
                if (!((Set) this.f18854c).contains(obj)) {
                    ((Set) this.f18854c).add(obj);
                    this.f18754a.accept(obj);
                    return;
                }
                return;
            case 1:
                C0466m0 m0Var = (C0466m0) ((Function) ((C0508x) this.f18855d).f18934u).apply(obj);
                if (m0Var != null) {
                    try {
                        m0Var.sequential().E((C0375g0) this.f18854c);
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
            case 2:
                IntStream intStream = (IntStream) ((Function) ((C0504w) this.f18855d).f18924u).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().Y((L) this.f18854c);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        break;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                F f10 = (F) ((Function) ((C0496u) this.f18855d).f18903u).apply(obj);
                if (f10 != null) {
                    try {
                        f10.sequential().H((C0388n) this.f18854c);
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        break;
                    }
                }
                if (f10 != null) {
                    f10.close();
                    return;
                }
                return;
        }
        throw th;
        throw th;
        throw th;
    }

    public final void end() {
        switch (this.f18853b) {
            case 0:
                this.f18854c = null;
                this.f18754a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    public final void f(long j10) {
        switch (this.f18853b) {
            case 0:
                this.f18854c = new HashSet();
                this.f18754a.f(-1);
                return;
            case 1:
                this.f18754a.f(-1);
                return;
            case 2:
                this.f18754a.f(-1);
                return;
            default:
                this.f18754a.f(-1);
                return;
        }
    }
}
