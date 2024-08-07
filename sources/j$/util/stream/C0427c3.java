package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
public final /* synthetic */ class C0427c3 implements C0426c2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0388n f18771b;

    public /* synthetic */ C0427c3(C0388n nVar, int i10) {
        this.f18770a = i10;
        this.f18771b = nVar;
    }

    public final void accept(double d10) {
        switch (this.f18770a) {
            case 0:
                ((I2) this.f18771b).accept(d10);
                return;
            default:
                this.f18771b.accept(d10);
                return;
        }
    }

    public final /* synthetic */ void accept(int i10) {
        switch (this.f18770a) {
            case 0:
                C0501v0.u0();
                throw null;
            default:
                C0501v0.u0();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j10) {
        switch (this.f18770a) {
            case 0:
                C0501v0.v0();
                throw null;
            default:
                C0501v0.v0();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f18770a) {
            case 0:
                p((Double) obj);
                return;
            default:
                p((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18770a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ void end() {
    }

    public final /* synthetic */ void f(long j10) {
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0388n m(C0388n nVar) {
        switch (this.f18770a) {
            case 0:
                nVar.getClass();
                return new C0382k(this, nVar);
            default:
                nVar.getClass();
                return new C0382k(this, nVar);
        }
    }

    public final /* synthetic */ void p(Double d10) {
        switch (this.f18770a) {
            case 0:
                C0501v0.o0(this, d10);
                return;
            default:
                C0501v0.o0(this, d10);
                return;
        }
    }
}
