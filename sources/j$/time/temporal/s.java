package j$.time.temporal;

import j$.time.e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f18275a;

    /* renamed from: b  reason: collision with root package name */
    private final long f18276b;

    /* renamed from: c  reason: collision with root package name */
    private final long f18277c;

    /* renamed from: d  reason: collision with root package name */
    private final long f18278d;

    private s(long j10, long j11, long j12, long j13) {
        this.f18275a = j10;
        this.f18276b = j11;
        this.f18277c = j12;
        this.f18278d = j13;
    }

    private String c(long j10, o oVar) {
        if (oVar != null) {
            return "Invalid value for " + oVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    public static s j(long j10, long j11) {
        if (j10 <= j11) {
            return new s(j10, j10, j11, j11);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static s k(long j10, long j11, long j12) {
        if (j10 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j11 > j12) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (1 <= j12) {
            return new s(j10, 1, j11, j12);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public static s l(long j10, long j11) {
        return k(1, j10, j11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j10 = this.f18275a;
        long j11 = this.f18276b;
        if (j10 <= j11) {
            long j12 = this.f18277c;
            long j13 = this.f18278d;
            if (j12 > j13) {
                throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
            } else if (j11 > j13) {
                throw new InvalidObjectException("Minimum value must be less than maximum value");
            }
        } else {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
    }

    public final int a(long j10, o oVar) {
        if (h() && i(j10)) {
            return (int) j10;
        }
        throw new e(c(j10, oVar));
    }

    public final void b(long j10, o oVar) {
        if (!i(j10)) {
            throw new e(c(j10, oVar));
        }
    }

    public final long d() {
        return this.f18278d;
    }

    public final long e() {
        return this.f18275a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18275a == sVar.f18275a && this.f18276b == sVar.f18276b && this.f18277c == sVar.f18277c && this.f18278d == sVar.f18278d;
    }

    public final long f() {
        return this.f18277c;
    }

    public final boolean g() {
        return this.f18275a == this.f18276b && this.f18277c == this.f18278d;
    }

    public final boolean h() {
        return this.f18275a >= -2147483648L && this.f18278d <= 2147483647L;
    }

    public final int hashCode() {
        long j10 = this.f18275a;
        long j11 = this.f18276b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f18277c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f18278d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final boolean i(long j10) {
        return j10 >= this.f18275a && j10 <= this.f18278d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18275a);
        if (this.f18275a != this.f18276b) {
            sb2.append('/');
            sb2.append(this.f18276b);
        }
        sb2.append(" - ");
        sb2.append(this.f18277c);
        if (this.f18277c != this.f18278d) {
            sb2.append('/');
            sb2.append(this.f18278d);
        }
        return sb2.toString();
    }
}
