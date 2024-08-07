package j$.time.chrono;

import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.s;

public enum u implements p {
    ;

    private u() {
    }

    public final int getValue() {
        return 1;
    }

    public final s o(o oVar) {
        return oVar == a.ERA ? s.j(1, 1) : n.d(this, oVar);
    }
}
