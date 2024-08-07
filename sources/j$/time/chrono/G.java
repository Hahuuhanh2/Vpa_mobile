package j$.time.chrono;

import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.s;

public enum G implements p {
    BEFORE_ROC,
    ROC;

    public final int getValue() {
        return ordinal();
    }

    public final s o(o oVar) {
        return n.d(this, oVar);
    }
}
