package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;
import u8.f;
import u8.h;
import u8.i;

public final class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends b {
        public final String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            return new StringBuilder(message).toString();
        }
    }

    public class a extends ThreadLocal<ArrayList<c>> {
        public final Object initialValue() {
            j7.a.q(3, "initialArraySize");
            return new ArrayList(3);
        }
    }

    public static class b extends IllegalStateException {
        static {
            f.q(3, CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
        }
    }

    public static class c {
    }

    static {
        boolean z10;
        h hVar = new h();
        i.m.b bVar = i.m.f15363b;
        i.m mVar = hVar.f15330a;
        if (mVar == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            hVar.f15330a = bVar;
            int i10 = i.f15331q;
            if (hVar.a() == i.m.f15362a) {
                new i(hVar, i.n.a.f15366a);
            } else if (hVar.a() == bVar) {
                new i(hVar, i.r.a.f15369a);
            } else {
                throw new AssertionError();
            }
            Logger.getLogger(CycleDetectingLockFactory.class.getName());
            new a();
            return;
        }
        throw new IllegalStateException(m9.b.L("Key strength was already set to %s", mVar));
    }
}
