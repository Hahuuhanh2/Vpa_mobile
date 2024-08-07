package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.q;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public final class r implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final r f18235d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f18236a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18237b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18238c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Collections.unmodifiableList(Arrays.asList(new q[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}));
    }

    private r(int i10, int i11, int i12) {
        this.f18236a = i10;
        this.f18237b = i11;
        this.f18238c = i12;
    }

    public static r c(int i10) {
        return (0 | i10) == 0 ? f18235d : new r(0, 0, i10);
    }

    static r d(DataInput dataInput) {
        int readInt = dataInput.readInt();
        int readInt2 = dataInput.readInt();
        int readInt3 = dataInput.readInt();
        return ((readInt | readInt2) | readInt3) == 0 ? f18235d : new r(readInt, readInt2, readInt3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.time.temporal.Temporal a(j$.time.chrono.ChronoLocalDate r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0056
            j$.time.temporal.m r0 = j$.time.temporal.n.e()
            java.lang.Object r0 = r5.K(r0)
            j$.time.chrono.o r0 = (j$.time.chrono.o) r0
            if (r0 == 0) goto L_0x002e
            j$.time.chrono.v r1 = j$.time.chrono.v.f18100d
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            j$.time.e r5 = new j$.time.e
            java.lang.String r1 = "Chronology mismatch, expected: ISO, actual: "
            java.lang.StringBuilder r1 = j$.time.b.b(r1)
            java.lang.String r0 = r0.l()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L_0x002e:
            int r0 = r4.f18237b
            if (r0 != 0) goto L_0x003a
            int r0 = r4.f18236a
            if (r0 == 0) goto L_0x004a
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.YEARS
            goto L_0x0046
        L_0x003a:
            long r0 = r4.e()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x004a
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.MONTHS
        L_0x0046:
            j$.time.temporal.Temporal r5 = r5.d(r0, r2)
        L_0x004a:
            int r0 = r4.f18238c
            if (r0 == 0) goto L_0x0055
            long r0 = (long) r0
            j$.time.temporal.ChronoUnit r2 = j$.time.temporal.ChronoUnit.DAYS
            j$.time.temporal.Temporal r5 = r5.d(r0, r2)
        L_0x0055:
            return r5
        L_0x0056:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "temporal"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.r.a(j$.time.chrono.ChronoLocalDate):j$.time.temporal.Temporal");
    }

    public final int b() {
        return this.f18238c;
    }

    public final long e() {
        return (((long) this.f18236a) * 12) + ((long) this.f18237b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f18236a == rVar.f18236a && this.f18237b == rVar.f18237b && this.f18238c == rVar.f18238c;
    }

    /* access modifiers changed from: package-private */
    public final void f(DataOutput dataOutput) {
        dataOutput.writeInt(this.f18236a);
        dataOutput.writeInt(this.f18237b);
        dataOutput.writeInt(this.f18238c);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f18238c, 16) + Integer.rotateLeft(this.f18237b, 8) + this.f18236a;
    }

    public final String toString() {
        if (this == f18235d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i10 = this.f18236a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f18237b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f18238c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
