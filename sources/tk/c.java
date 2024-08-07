package tk;

import java.io.Serializable;
import mk.b;
import ok.a;
import sk.j;

/* compiled from: Random.kt */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23024a = new a(0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f23025b;

    /* compiled from: Random.kt */
    public static final class a extends c implements Serializable {
        public a(int i10) {
        }

        public final int a(int i10) {
            return c.f23025b.a(i10);
        }

        public final int b() {
            return c.f23025b.b();
        }

        public final int c(int i10, int i11) {
            return c.f23025b.c(i10, i11);
        }
    }

    static {
        a aVar;
        boolean z10 = false;
        b.f21570a.getClass();
        Integer num = a.C0301a.f21892a;
        if (num == null || num.intValue() >= 34) {
            z10 = true;
        }
        if (z10) {
            aVar = new uk.a();
        } else {
            aVar = new b();
        }
        f23025b = aVar;
    }

    public abstract int a(int i10);

    public abstract int b();

    public int c(int i10, int i11) {
        boolean z10;
        int i12;
        int b10;
        int i13;
        int b11;
        boolean z11;
        if (i11 > i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i14 = i11 - i10;
            if (i14 > 0 || i14 == Integer.MIN_VALUE) {
                if (((-i14) & i14) == i14) {
                    i12 = a(31 - Integer.numberOfLeadingZeros(i14));
                } else {
                    do {
                        b10 = b() >>> 1;
                        i13 = b10 % i14;
                    } while ((i14 - 1) + (b10 - i13) < 0);
                    i12 = i13;
                }
                return i10 + i12;
            }
            do {
                b11 = b();
                if (i10 > b11 || b11 >= i11) {
                    z11 = false;
                    continue;
                } else {
                    z11 = true;
                    continue;
                }
            } while (!z11);
            return b11;
        }
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        j.f(valueOf, "from");
        j.f(valueOf2, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
    }
}
