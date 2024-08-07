package j$.time;

import j$.time.chrono.C0337d;
import j$.time.chrono.C0338e;
import j$.time.chrono.v;
import j$.time.format.w;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

public final class n implements j, k, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f18229a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18230b;

    static {
        w wVar = new w();
        wVar.f("--");
        wVar.m(a.MONTH_OF_YEAR, 2);
        wVar.e('-');
        wVar.m(a.DAY_OF_MONTH, 2);
        wVar.v(Locale.getDefault());
    }

    private n(int i10, int i11) {
        this.f18229a = i10;
        this.f18230b = i11;
    }

    static n R(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        Month W = Month.W(readByte);
        if (W != null) {
            a.DAY_OF_MONTH.V((long) readByte2);
            if (readByte2 <= W.V()) {
                return new n(W.getValue(), readByte2);
            }
            throw new e("Illegal value for DayOfMonth field, value " + readByte2 + " is not valid for month " + W.name());
        }
        throw new NullPointerException("month");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    public final Object K(p pVar) {
        return pVar == j$.time.temporal.n.e() ? v.f18100d : j$.time.temporal.n.c(this, pVar);
    }

    /* access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        dataOutput.writeByte(this.f18229a);
        dataOutput.writeByte(this.f18230b);
    }

    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i10 = this.f18229a - nVar.f18229a;
        return i10 == 0 ? this.f18230b - nVar.f18230b : i10;
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar == a.MONTH_OF_YEAR || oVar == a.DAY_OF_MONTH : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f18229a == nVar.f18229a && this.f18230b == nVar.f18230b;
    }

    public final long h(o oVar) {
        int i10;
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i11 = m.f18228a[((a) oVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f18230b;
        } else if (i11 == 2) {
            i10 = this.f18229a;
        } else {
            throw new r(b.a("Unsupported field: ", oVar));
        }
        return (long) i10;
    }

    public final int hashCode() {
        return (this.f18229a << 6) + this.f18230b;
    }

    public final int m(o oVar) {
        return o(oVar).a(h(oVar), oVar);
    }

    public final s o(o oVar) {
        if (oVar == a.MONTH_OF_YEAR) {
            return oVar.o();
        }
        if (oVar != a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, oVar);
        }
        Month W = Month.W(this.f18229a);
        W.getClass();
        int i10 = l.f18227a[W.ordinal()];
        return s.l((long) (i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28), (long) Month.W(this.f18229a).V());
    }

    public final Temporal t(Temporal temporal) {
        if (((C0337d) C0338e.s(temporal)).equals(v.f18100d)) {
            Temporal c10 = temporal.c((long) this.f18229a, a.MONTH_OF_YEAR);
            a aVar = a.DAY_OF_MONTH;
            return c10.c(Math.min(c10.o(aVar).d(), (long) this.f18230b), aVar);
        }
        throw new e("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f18229a < 10 ? "0" : "");
        sb2.append(this.f18229a);
        sb2.append(this.f18230b < 10 ? "-0" : "-");
        sb2.append(this.f18230b);
        return sb2.toString();
    }
}
