package nl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import p3.l0;

/* compiled from: Duration */
public final class c implements Comparable<c>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final c f21746c = new c(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f21747a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21748b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public c(int i10, long j10) {
        this.f21747a = j10;
        this.f21748b = i10;
    }

    public static c b(int i10, long j10) {
        if ((((long) i10) | j10) == 0) {
            return f21746c;
        }
        return new c(i10, j10);
    }

    public static c c(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 += 1000000000;
            j11--;
        }
        return b(i10, j11);
    }

    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int x10 = l0.x(this.f21747a, cVar.f21747a);
        if (x10 != 0) {
            return x10;
        }
        return this.f21748b - cVar.f21748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f21747a == cVar.f21747a && this.f21748b == cVar.f21748b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f21747a;
        return (this.f21748b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f21746c) {
            return "PT0S";
        }
        long j10 = this.f21747a;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && this.f21748b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 >= 0 || this.f21748b <= 0) {
            sb2.append(i11);
        } else if (i11 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i11 + 1);
        }
        if (this.f21748b > 0) {
            int length = sb2.length();
            if (i11 < 0) {
                sb2.append(2000000000 - this.f21748b);
            } else {
                sb2.append(this.f21748b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
