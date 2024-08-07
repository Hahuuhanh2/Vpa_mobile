package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;

/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
public final /* synthetic */ class C0488s implements C0388n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0440f2 f18887b;

    public /* synthetic */ C0488s(int i10, C0440f2 f2Var) {
        this.f18886a = i10;
        this.f18887b = f2Var;
    }

    public final void accept(double d10) {
        switch (this.f18886a) {
            case 0:
                this.f18887b.accept(d10);
                return;
            default:
                ((C0492t) this.f18887b).f18743a.accept(d10);
                return;
        }
    }

    public final C0388n m(C0388n nVar) {
        switch (this.f18886a) {
            case 0:
                nVar.getClass();
                return new C0382k(this, nVar);
            default:
                nVar.getClass();
                return new C0382k(this, nVar);
        }
    }
}
