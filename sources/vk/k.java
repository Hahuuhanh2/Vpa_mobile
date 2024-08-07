package vk;

/* compiled from: PrimitiveRanges.kt */
public final class k extends i implements e<Long> {
    static {
        new k(1, 0);
    }

    public k(long j10, long j11) {
        super(j10, j11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!isEmpty() || !((k) obj).isEmpty()) {
                k kVar = (k) obj;
                if (!(this.f23343a == kVar.f23343a && this.f23344b == kVar.f23344b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Comparable g() {
        return Long.valueOf(this.f23343a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f23343a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f23344b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public final boolean isEmpty() {
        if (this.f23343a > this.f23344b) {
            return true;
        }
        return false;
    }

    public final Comparable l() {
        return Long.valueOf(this.f23344b);
    }

    public final boolean m(long j10) {
        if (this.f23343a > j10 || j10 > this.f23344b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f23343a + ".." + this.f23344b;
    }
}
