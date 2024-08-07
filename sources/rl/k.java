package rl;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* compiled from: ValueRange */
public final class k implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final long f22846a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22847b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22848c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22849d;

    public k(long j10, long j11, long j12, long j13) {
        this.f22846a = j10;
        this.f22847b = j11;
        this.f22848c = j12;
        this.f22849d = j13;
    }

    public static k c(long j10, long j11) {
        if (j10 <= j11) {
            return new k(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static k d(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j11) {
            return new k(1, 1, j10, j11);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j10, g gVar) {
        boolean z10;
        boolean z11;
        long j11 = this.f22846a;
        boolean z12 = false;
        if (j11 < -2147483648L || this.f22849d > 2147483647L) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (j10 < j11 || j10 > this.f22849d) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            return (int) j10;
        }
        throw new DateTimeException("Invalid int value for " + gVar + ": " + j10);
    }

    public final void b(long j10, g gVar) {
        boolean z10;
        if (j10 < this.f22846a || j10 > this.f22849d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        if (gVar != null) {
            throw new DateTimeException("Invalid value for " + gVar + " (valid values " + this + "): " + j10);
        }
        throw new DateTimeException("Invalid value (valid values " + this + "): " + j10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f22846a == kVar.f22846a && this.f22847b == kVar.f22847b && this.f22848c == kVar.f22848c && this.f22849d == kVar.f22849d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f22846a;
        long j11 = this.f22847b;
        long j12 = (j10 + j11) << ((int) (j11 + 16));
        long j13 = this.f22848c;
        long j14 = (j12 >> ((int) (j13 + 48))) << ((int) (j13 + 32));
        long j15 = this.f22849d;
        long j16 = ((j14 >> ((int) (32 + j15))) << ((int) (j15 + 48))) >> 16;
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22846a);
        if (this.f22846a != this.f22847b) {
            sb2.append('/');
            sb2.append(this.f22847b);
        }
        sb2.append(" - ");
        sb2.append(this.f22848c);
        if (this.f22848c != this.f22849d) {
            sb2.append('/');
            sb2.append(this.f22849d);
        }
        return sb2.toString();
    }
}
