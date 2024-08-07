package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.e;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.s;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class B implements p, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final B f18047d;

    /* renamed from: e  reason: collision with root package name */
    private static final B[] f18048e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f18049a;

    /* renamed from: b  reason: collision with root package name */
    private final transient LocalDate f18050b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f18051c;

    static {
        B b10 = new B(-1, LocalDate.f0(1868, 1, 1), "Meiji");
        f18047d = b10;
        B b11 = new B(0, LocalDate.f0(1912, 7, 30), "Taisho");
        B b12 = new B(1, LocalDate.f0(1926, 12, 25), "Showa");
        B b13 = new B(2, LocalDate.f0(1989, 1, 8), "Heisei");
        B b14 = new B(3, LocalDate.f0(2019, 5, 1), "Reiwa");
        B[] bArr = new B[5];
        f18048e = bArr;
        bArr[0] = b10;
        bArr[1] = b11;
        bArr[2] = b12;
        bArr[3] = b13;
        bArr[4] = b14;
    }

    private B(int i10, LocalDate localDate, String str) {
        this.f18049a = i10;
        this.f18050b = localDate;
        this.f18051c = str;
    }

    static B k(LocalDate localDate) {
        B b10;
        if (!localDate.a0(A.f18043d)) {
            int length = f18048e.length;
            do {
                length--;
                if (length < 0) {
                    return null;
                }
                b10 = f18048e[length];
            } while (localDate.compareTo((ChronoLocalDate) b10.f18050b) < 0);
            return b10;
        }
        throw new e("JapaneseDate before Meiji 6 are not supported");
    }

    static B l() {
        B[] bArr = f18048e;
        return bArr[bArr.length - 1];
    }

    public static B r(int i10) {
        if (i10 >= f18047d.f18049a) {
            int i11 = i10 + 2;
            B[] bArr = f18048e;
            if (i11 <= bArr.length) {
                return bArr[i11 - 1];
            }
        }
        throw new e("Invalid era: " + i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static long w() {
        long f10 = a.DAY_OF_YEAR.o().f();
        for (B b10 : f18048e) {
            f10 = Math.min(f10, (long) ((b10.f18050b.Q() - b10.f18050b.X()) + 1));
            if (b10.q() != null) {
                f10 = Math.min(f10, (long) (b10.q().f18050b.X() - 1));
            }
        }
        return f10;
    }

    private Object writeReplace() {
        return new H((byte) 5, this);
    }

    static long y() {
        int year = (999999999 - l().f18050b.getYear()) + 1;
        int year2 = f18048e[0].f18050b.getYear();
        int i10 = 1;
        while (true) {
            B[] bArr = f18048e;
            if (i10 >= bArr.length) {
                return (long) year;
            }
            B b10 = bArr[i10];
            year = Math.min(year, (b10.f18050b.getYear() - year2) + 1);
            year2 = b10.f18050b.getYear();
            i10++;
        }
    }

    public static B[] z() {
        B[] bArr = f18048e;
        return (B[]) Arrays.copyOf(bArr, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public final void A(DataOutput dataOutput) {
        dataOutput.writeByte(this.f18049a);
    }

    public final /* synthetic */ Object K(p pVar) {
        return C0338e.o(this, pVar);
    }

    public final /* synthetic */ boolean e(o oVar) {
        return C0338e.k(this, oVar);
    }

    public final int getValue() {
        return this.f18049a;
    }

    public final /* synthetic */ long h(o oVar) {
        return C0338e.i(this, oVar);
    }

    public final /* synthetic */ int m(o oVar) {
        return C0338e.h(this, (a) oVar);
    }

    public final s o(o oVar) {
        a aVar = a.ERA;
        return oVar == aVar ? y.f18103d.w(aVar) : n.d(this, oVar);
    }

    /* access modifiers changed from: package-private */
    public final LocalDate p() {
        return this.f18050b;
    }

    /* access modifiers changed from: package-private */
    public final B q() {
        if (this == l()) {
            return null;
        }
        return r(this.f18049a + 1);
    }

    public final /* synthetic */ Temporal t(Temporal temporal) {
        return C0338e.c(this, temporal);
    }

    public final String toString() {
        return this.f18051c;
    }
}
