package j$.time;

import j$.util.function.C0388n;

public abstract /* synthetic */ class a {
    public static /* synthetic */ void b(C0388n nVar, C0388n nVar2, double d10) {
        nVar.accept(d10);
        nVar2.accept(d10);
    }

    public static /* synthetic */ int c(long j10) {
        int i10 = (int) j10;
        if (j10 == ((long) i10)) {
            return i10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long d(long j10, long j11) {
        long j12 = j10 + j11;
        boolean z10 = true;
        boolean z11 = (j11 ^ j10) < 0;
        if ((j10 ^ j12) < 0) {
            z10 = false;
        }
        if (z11 || z10) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long e(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    public static /* synthetic */ long f(long j10, long j11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (numberOfLeadingZeros >= 64) {
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            boolean z10 = true;
            boolean z11 = i10 >= 0;
            if (j11 == Long.MIN_VALUE) {
                z10 = false;
            }
            if (z10 || z11) {
                long j12 = j10 * j11;
                if (i10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long g(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    public static /* synthetic */ long h(long j10, long j11) {
        long j12 = j10 - j11;
        boolean z10 = true;
        boolean z11 = (j11 ^ j10) >= 0;
        if ((j10 ^ j12) < 0) {
            z10 = false;
        }
        if (z11 || z10) {
            return j12;
        }
        throw new ArithmeticException();
    }
}
