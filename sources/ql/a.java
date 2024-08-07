package ql;

import rl.b;
import rl.d;

/* compiled from: DefaultInterfaceTemporal */
public abstract class a extends b implements d {
    public d p(long j10, b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return j(Long.MAX_VALUE, bVar).j(1, bVar);
        }
        return j(-j10, bVar);
    }
}
