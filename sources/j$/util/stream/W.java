package j$.util.stream;

import j$.util.function.I;
import j$.util.function.L;

public final /* synthetic */ class W implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18735a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0440f2 f18736b;

    public /* synthetic */ W(int i10, C0440f2 f2Var) {
        this.f18735a = i10;
        this.f18736b = f2Var;
    }

    public final void accept(int i10) {
        switch (this.f18735a) {
            case 0:
                this.f18736b.accept(i10);
                return;
            default:
                ((X) this.f18736b).f18745a.accept(i10);
                return;
        }
    }

    public final L n(L l10) {
        switch (this.f18735a) {
            case 0:
                l10.getClass();
                return new I(this, l10);
            default:
                l10.getClass();
                return new I(this, l10);
        }
    }
}
