package j$.util.stream;

import j$.util.C0404j;
import j$.util.function.I;
import j$.util.function.L;

final class J extends M implements C0431d2 {
    J() {
    }

    public final void accept(int i10) {
        p((Object) Integer.valueOf(i10));
    }

    public final Object get() {
        if (this.f18655a) {
            return C0404j.d(((Integer) this.f18656b).intValue());
        }
        return null;
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }
}
