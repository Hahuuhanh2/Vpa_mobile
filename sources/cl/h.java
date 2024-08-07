package cl;

import cl.e;
import rk.l;

/* compiled from: Channel.kt */
public final class h {
    public static a a(int i10, int i11, int i12) {
        a aVar;
        boolean z10 = false;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if (i10 != -2) {
            if (i10 == -1) {
                if (i11 == 1) {
                    z10 = true;
                }
                if (z10) {
                    return new k(1, 2, (l) null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            } else if (i10 != 0) {
                if (i10 == Integer.MAX_VALUE) {
                    return new a(Integer.MAX_VALUE, (l) null);
                }
                if (i11 == 1) {
                    return new a(i10, (l) null);
                }
                return new k(i10, i11, (l) null);
            } else if (i11 == 1) {
                aVar = new a(0, (l) null);
            } else {
                aVar = new k(1, i11, (l) null);
            }
        } else if (i11 == 1) {
            e.f19251i.getClass();
            aVar = new a(e.a.f19253b, (l) null);
        } else {
            aVar = new k(1, i11, (l) null);
        }
        return aVar;
    }
}
