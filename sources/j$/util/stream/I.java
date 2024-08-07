package j$.util.stream;

import j$.util.C0403i;
import j$.util.function.C0382k;
import j$.util.function.C0388n;

final class I extends M implements C0426c2 {
    I() {
    }

    public final void accept(double d10) {
        p((Object) Double.valueOf(d10));
    }

    public final Object get() {
        if (this.f18655a) {
            return C0403i.d(((Double) this.f18656b).doubleValue());
        }
        return null;
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }
}
