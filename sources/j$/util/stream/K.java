package j$.util.stream;

import j$.util.C0405k;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;

final class K extends M implements C0436e2 {
    K() {
    }

    public final void accept(long j10) {
        p((Object) Long.valueOf(j10));
    }

    public final Object get() {
        if (this.f18655a) {
            return C0405k.d(((Long) this.f18656b).longValue());
        }
        return null;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }
}
