package j$.time;

import j$.time.chrono.C0338e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.j;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.r;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class q implements Temporal, k, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final k f18233a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f18234b;

    static {
        k kVar = k.f18219e;
        ZoneOffset zoneOffset = ZoneOffset.f18036g;
        kVar.getClass();
        R(kVar, zoneOffset);
        k kVar2 = k.f18220f;
        ZoneOffset zoneOffset2 = ZoneOffset.f18035f;
        kVar2.getClass();
        R(kVar2, zoneOffset2);
    }

    private q(k kVar, ZoneOffset zoneOffset) {
        if (kVar != null) {
            this.f18233a = kVar;
            if (zoneOffset != null) {
                this.f18234b = zoneOffset;
                return;
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("time");
    }

    public static q R(k kVar, ZoneOffset zoneOffset) {
        return new q(kVar, zoneOffset);
    }

    static q V(ObjectInput objectInput) {
        return new q(k.j0(objectInput), ZoneOffset.g0(objectInput));
    }

    private long W() {
        return this.f18233a.k0() - (((long) this.f18234b.b0()) * 1000000000);
    }

    private q X(k kVar, ZoneOffset zoneOffset) {
        return (this.f18233a != kVar || !this.f18234b.equals(zoneOffset)) ? new q(kVar, zoneOffset) : this;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    public final Object K(p pVar) {
        if (pVar == n.i() || pVar == n.k()) {
            return this.f18234b;
        }
        boolean z10 = true;
        boolean z11 = pVar == n.l();
        if (pVar != n.e()) {
            z10 = false;
        }
        if ((z11 || z10) || pVar == n.f()) {
            return null;
        }
        return pVar == n.g() ? this.f18233a : pVar == n.j() ? ChronoUnit.NANOS : pVar.h(this);
    }

    /* renamed from: U */
    public final q d(long j10, j$.time.temporal.q qVar) {
        return qVar instanceof ChronoUnit ? X(this.f18233a.d(j10, qVar), this.f18234b) : (q) qVar.m(this, j10);
    }

    public final Temporal c(long j10, o oVar) {
        return oVar instanceof a ? oVar == a.OFFSET_SECONDS ? X(this.f18233a, ZoneOffset.e0(((a) oVar).U(j10))) : X(this.f18233a.c(j10, oVar), this.f18234b) : (q) oVar.R(this, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = java.lang.Long.compare(W(), r5.W());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            j$.time.q r5 = (j$.time.q) r5
            j$.time.ZoneOffset r0 = r4.f18234b
            j$.time.ZoneOffset r1 = r5.f18234b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000d
            goto L_0x001b
        L_0x000d:
            long r0 = r4.W()
            long r2 = r5.W()
            int r0 = java.lang.Long.compare(r0, r2)
            if (r0 != 0) goto L_0x0024
        L_0x001b:
            j$.time.k r0 = r4.f18233a
            j$.time.k r5 = r5.f18233a
            int r5 = r0.compareTo(r5)
            goto L_0x0025
        L_0x0024:
            r5 = r0
        L_0x0025:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.q.compareTo(java.lang.Object):int");
    }

    public final boolean e(o oVar) {
        return oVar instanceof a ? oVar.isTimeBased() || oVar == a.OFFSET_SECONDS : oVar != null && oVar.m(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f18233a.equals(qVar.f18233a) && this.f18234b.equals(qVar.f18234b);
    }

    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1, chronoUnit) : d(-j10, chronoUnit);
    }

    public final long h(o oVar) {
        return oVar instanceof a ? oVar == a.OFFSET_SECONDS ? (long) this.f18234b.b0() : this.f18233a.h(oVar) : oVar.K(this);
    }

    public final int hashCode() {
        return this.f18233a.hashCode() ^ this.f18234b.hashCode();
    }

    public final long i(Temporal temporal, j$.time.temporal.q qVar) {
        q qVar2;
        long j10;
        if (temporal instanceof q) {
            qVar2 = (q) temporal;
        } else {
            try {
                qVar2 = new q(k.V(temporal), ZoneOffset.a0(temporal));
            } catch (e e10) {
                throw new e("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, qVar2);
        }
        long W = qVar2.W() - W();
        switch (p.f18232a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return W;
            case 2:
                j10 = 1000;
                break;
            case 3:
                j10 = 1000000;
                break;
            case 4:
                j10 = 1000000000;
                break;
            case 5:
                j10 = 60000000000L;
                break;
            case 6:
                j10 = 3600000000000L;
                break;
            case 7:
                j10 = 43200000000000L;
                break;
            default:
                throw new r("Unsupported unit: " + qVar);
        }
        return W / j10;
    }

    public final int m(o oVar) {
        return n.a(this, oVar);
    }

    public final Temporal n(LocalDate localDate) {
        if (localDate instanceof k) {
            return X((k) localDate, this.f18234b);
        }
        if (localDate instanceof ZoneOffset) {
            return X(this.f18233a, (ZoneOffset) localDate);
        }
        boolean z10 = localDate instanceof q;
        j jVar = localDate;
        if (!z10) {
            localDate.getClass();
            jVar = C0338e.a(localDate, this);
        }
        return (q) jVar;
    }

    public final s o(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.n(this);
        }
        if (oVar == a.OFFSET_SECONDS) {
            return oVar.o();
        }
        k kVar = this.f18233a;
        kVar.getClass();
        return n.d(kVar, oVar);
    }

    public final Temporal t(Temporal temporal) {
        return temporal.c(this.f18233a.k0(), a.NANO_OF_DAY).c((long) this.f18234b.b0(), a.OFFSET_SECONDS);
    }

    public final String toString() {
        return this.f18233a.toString() + this.f18234b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f18233a.o0(objectOutput);
        this.f18234b.h0(objectOutput);
    }
}
