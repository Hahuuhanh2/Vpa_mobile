package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f18010c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f18011a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18012b;

    static {
        BigInteger.valueOf(1000000000);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j10, int i10) {
        this.f18011a = j10;
        this.f18012b = i10;
    }

    public static Duration K(long j10) {
        return m(j10, 0);
    }

    public static Duration R(long j10, long j11) {
        return m(a.d(j10, a.g(j11, 1000000000)), (int) a.e(j11, 1000000000));
    }

    private static Duration m(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? f18010c : new Duration(j10, i10);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return m(j11, i10 * 1000000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Duration t(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (((long) i10) + 1000000000);
            j11--;
        }
        return m(j11, i10);
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    /* access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        dataOutput.writeLong(this.f18011a);
        dataOutput.writeInt(this.f18012b);
    }

    public final int compareTo(Object obj) {
        Duration duration = (Duration) obj;
        int compare = Long.compare(this.f18011a, duration.f18011a);
        return compare != 0 ? compare : this.f18012b - duration.f18012b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f18011a == duration.f18011a && this.f18012b == duration.f18012b;
    }

    public final int hashCode() {
        long j10 = this.f18011a;
        return (this.f18012b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final int n() {
        return this.f18012b;
    }

    public final long o() {
        return this.f18011a;
    }

    public long toMillis() {
        return a.d(a.f(this.f18011a, (long) 1000), (long) (this.f18012b / 1000000));
    }

    public final String toString() {
        if (this == f18010c) {
            return "PT0S";
        }
        long j10 = this.f18011a;
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
        if (i11 == 0 && this.f18012b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 >= 0 || this.f18012b <= 0) {
            sb2.append(i11);
        } else if (i11 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i11 + 1);
        }
        if (this.f18012b > 0) {
            int length = sb2.length();
            sb2.append(i11 < 0 ? 2000000000 - ((long) this.f18012b) : ((long) this.f18012b) + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
