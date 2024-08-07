package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.b;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.a;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.temporal.s;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

final class n implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C0343j f18078a;

    /* renamed from: b  reason: collision with root package name */
    private final transient ZoneOffset f18079b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f18080c;

    private n(ZoneId zoneId, ZoneOffset zoneOffset, C0343j jVar) {
        if (jVar != null) {
            this.f18078a = jVar;
            if (zoneOffset != null) {
                this.f18079b = zoneOffset;
                if (zoneId != null) {
                    this.f18080c = zoneId;
                    return;
                }
                throw new NullPointerException("zone");
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("dateTime");
    }

    static n R(o oVar, Temporal temporal) {
        n nVar = (n) temporal;
        C0337d dVar = (C0337d) oVar;
        if (dVar.equals(nVar.a())) {
            return nVar;
        }
        StringBuilder b10 = b.b("Chronology mismatch, required: ");
        b10.append(dVar.l());
        b10.append(", actual: ");
        b10.append(nVar.a().l());
        throw new ClassCastException(b10.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r2.contains(r7) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static j$.time.chrono.ChronoZonedDateTime V(j$.time.ZoneId r6, j$.time.ZoneOffset r7, j$.time.chrono.C0343j r8) {
        /*
            if (r8 == 0) goto L_0x0068
            if (r6 == 0) goto L_0x0060
            boolean r0 = r6 instanceof j$.time.ZoneOffset
            if (r0 == 0) goto L_0x0011
            j$.time.chrono.n r7 = new j$.time.chrono.n
            r0 = r6
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            r7.<init>(r6, r0, r8)
            return r7
        L_0x0011:
            j$.time.zone.e r0 = r6.U()
            j$.time.LocalDateTime r1 = j$.time.LocalDateTime.U(r8)
            java.util.List r2 = r0.g(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x0026
            goto L_0x004a
        L_0x0026:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x0041
            j$.time.zone.b r7 = r0.f(r1)
            j$.time.Duration r0 = r7.o()
            long r0 = r0.o()
            j$.time.chrono.j r8 = r8.X(r0)
            j$.time.ZoneOffset r7 = r7.t()
            goto L_0x0050
        L_0x0041:
            if (r7 == 0) goto L_0x004a
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            java.lang.Object r7 = r2.get(r5)
            j$.time.ZoneOffset r7 = (j$.time.ZoneOffset) r7
        L_0x0050:
            if (r7 == 0) goto L_0x0058
            j$.time.chrono.n r0 = new j$.time.chrono.n
            r0.<init>(r6, r7, r8)
            return r0
        L_0x0058:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "offset"
            r6.<init>(r7)
            throw r6
        L_0x0060:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "zone"
            r6.<init>(r7)
            throw r6
        L_0x0068:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "localDateTime"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.n.V(j$.time.ZoneId, j$.time.ZoneOffset, j$.time.chrono.j):j$.time.chrono.ChronoZonedDateTime");
    }

    static n W(o oVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.U().d(instant);
        if (d10 != null) {
            return new n(zoneId, d10, (C0343j) oVar.L(LocalDateTime.d0(instant.W(), instant.X(), d10)));
        }
        throw new NullPointerException("offset");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new H((byte) 3, this);
    }

    public final ChronoZonedDateTime D(ZoneId zoneId) {
        return V(zoneId, this.f18079b, this.f18078a);
    }

    public final ZoneId H() {
        return this.f18080c;
    }

    public final /* synthetic */ Object K(p pVar) {
        return C0338e.n(this, pVar);
    }

    public final /* synthetic */ long T() {
        return C0338e.q(this);
    }

    /* renamed from: U */
    public final ChronoZonedDateTime g(long j10, q qVar) {
        return R(a(), j$.time.temporal.n.b(this, j10, (ChronoUnit) qVar));
    }

    /* renamed from: X */
    public final ChronoZonedDateTime d(long j10, q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return R(a(), qVar.m(this, j10));
        }
        return R(a(), this.f18078a.d(j10, qVar).t(this));
    }

    public final o a() {
        return f().a();
    }

    public final k b() {
        return ((C0343j) u()).b();
    }

    public final Temporal c(long j10, o oVar) {
        if (!(oVar instanceof a)) {
            return R(a(), oVar.R(this, j10));
        }
        a aVar = (a) oVar;
        int i10 = C0346m.f18077a[aVar.ordinal()];
        if (i10 == 1) {
            return d(j10 - C0338e.q(this), ChronoUnit.SECONDS);
        }
        if (i10 != 2) {
            return V(this.f18080c, this.f18079b, this.f18078a.c(j10, oVar));
        }
        ZoneOffset e02 = ZoneOffset.e0(aVar.U(j10));
        C0343j jVar = this.f18078a;
        jVar.getClass();
        return W(a(), C0338e.r(jVar, e02), this.f18080c);
    }

    public final boolean e(o oVar) {
        return (oVar instanceof a) || (oVar != null && oVar.m(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoZonedDateTime) {
            return C0338e.f(this, (ChronoZonedDateTime) obj) == 0;
        }
        return false;
    }

    public final ChronoLocalDate f() {
        return ((C0343j) u()).f();
    }

    public final long h(o oVar) {
        if (!(oVar instanceof a)) {
            return oVar.K(this);
        }
        int i10 = C0345l.f18076a[((a) oVar).ordinal()];
        return i10 != 1 ? i10 != 2 ? ((C0343j) u()).h(oVar) : (long) j().b0() : T();
    }

    public final int hashCode() {
        return (this.f18078a.hashCode() ^ this.f18079b.hashCode()) ^ Integer.rotateLeft(this.f18080c.hashCode(), 3);
    }

    public final long i(Temporal temporal, q qVar) {
        if (temporal != null) {
            ChronoZonedDateTime q10 = a().q(temporal);
            if (qVar instanceof ChronoUnit) {
                return this.f18078a.i(q10.x(this.f18079b).u(), qVar);
            } else if (qVar != null) {
                return qVar.between(this, q10);
            } else {
                throw new NullPointerException("unit");
            }
        } else {
            throw new NullPointerException("endExclusive");
        }
    }

    public final ZoneOffset j() {
        return this.f18079b;
    }

    public final /* synthetic */ int m(o oVar) {
        return C0338e.g(this, oVar);
    }

    public final Temporal n(LocalDate localDate) {
        return R(a(), localDate.t(this));
    }

    public final s o(o oVar) {
        return oVar instanceof a ? (oVar == a.INSTANT_SECONDS || oVar == a.OFFSET_SECONDS) ? oVar.o() : ((C0343j) u()).o(oVar) : oVar.n(this);
    }

    /* renamed from: t */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return C0338e.f(this, chronoZonedDateTime);
    }

    public final Instant toInstant() {
        return Instant.Z(T(), (long) b().Y());
    }

    public final String toString() {
        String str = this.f18078a.toString() + this.f18079b.toString();
        if (this.f18079b == this.f18080c) {
            return str;
        }
        return str + '[' + this.f18080c.toString() + ']';
    }

    public final C0341h u() {
        return this.f18078a;
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f18078a);
        objectOutput.writeObject(this.f18079b);
        objectOutput.writeObject(this.f18080c);
    }

    public final ChronoZonedDateTime x(ZoneOffset zoneOffset) {
        if (zoneOffset == null) {
            throw new NullPointerException("zone");
        } else if (this.f18080c.equals(zoneOffset)) {
            return this;
        } else {
            C0343j jVar = this.f18078a;
            ZoneOffset zoneOffset2 = this.f18079b;
            jVar.getClass();
            return W(a(), C0338e.r(jVar, zoneOffset2), zoneOffset);
        }
    }
}
