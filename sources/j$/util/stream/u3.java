package j$.util.stream;

import j$.util.C0407m;
import j$.util.L;
import java.util.Comparator;

abstract class u3 extends w3 implements L {
    u3(L l10, long j10, long j11) {
        super(l10, j10, j11);
    }

    u3(L l10, u3 u3Var) {
        super(l10, u3Var);
    }

    /* renamed from: forEachRemaining */
    public final void d(Object obj) {
        obj.getClass();
        Y2 y22 = null;
        while (true) {
            int s10 = s();
            if (s10 == 1) {
                return;
            }
            if (s10 == 2) {
                if (y22 == null) {
                    y22 = u();
                } else {
                    y22.f18744b = 0;
                }
                long j10 = 0;
                while (((L) this.f18929a).tryAdvance(y22)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 != 0) {
                    y22.a(obj, q(j10));
                } else {
                    return;
                }
            } else {
                ((L) this.f18929a).forEachRemaining(obj);
                return;
            }
        }
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* access modifiers changed from: protected */
    public abstract void t(Object obj);

    /* renamed from: tryAdvance */
    public final boolean o(Object obj) {
        obj.getClass();
        while (s() != 1 && ((L) this.f18929a).tryAdvance(this)) {
            if (q(1) == 1) {
                t(obj);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Y2 u();
}
