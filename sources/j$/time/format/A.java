package j$.time.format;

import j$.time.b;
import j$.time.e;
import j$.time.temporal.j;
import j$.time.temporal.o;
import j$.time.temporal.p;
import java.util.Locale;

final class A {

    /* renamed from: a  reason: collision with root package name */
    private j f18107a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f18108b;

    /* renamed from: c  reason: collision with root package name */
    private int f18109c;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    A(j$.time.temporal.j r10, j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.o r0 = r11.b()
            j$.time.ZoneId r1 = r11.e()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x0101
        L_0x0011:
            j$.time.temporal.m r2 = j$.time.temporal.n.e()
            java.lang.Object r2 = r10.K(r2)
            j$.time.chrono.o r2 = (j$.time.chrono.o) r2
            j$.time.temporal.m r3 = j$.time.temporal.n.l()
            java.lang.Object r3 = r10.K(r3)
            j$.time.ZoneId r3 = (j$.time.ZoneId) r3
            boolean r4 = j$.util.C0407m.p(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            r0 = r5
        L_0x002d:
            boolean r4 = j$.util.C0407m.p(r1, r3)
            if (r4 == 0) goto L_0x0034
            r1 = r5
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            goto L_0x0101
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r4 = r0
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x00aa
            j$.time.temporal.a r6 = j$.time.temporal.a.INSTANT_SECONDS
            boolean r6 = r10.e(r6)
            if (r6 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            j$.time.chrono.v r4 = j$.time.chrono.v.f18100d
        L_0x004e:
            j$.time.Instant r10 = j$.time.Instant.V(r10)
            j$.time.chrono.ChronoZonedDateTime r10 = r4.P(r10, r1)
            goto L_0x0101
        L_0x0058:
            j$.time.zone.e r6 = r1.U()     // Catch:{ f -> 0x0069 }
            boolean r7 = r6.i()     // Catch:{ f -> 0x0069 }
            if (r7 == 0) goto L_0x0069
            j$.time.Instant r7 = j$.time.Instant.f18013c     // Catch:{ f -> 0x0069 }
            j$.time.ZoneOffset r6 = r6.d(r7)     // Catch:{ f -> 0x0069 }
            goto L_0x006a
        L_0x0069:
            r6 = r1
        L_0x006a:
            boolean r6 = r6 instanceof j$.time.ZoneOffset
            if (r6 == 0) goto L_0x00aa
            j$.time.temporal.a r6 = j$.time.temporal.a.OFFSET_SECONDS
            boolean r7 = r10.e(r6)
            if (r7 == 0) goto L_0x00aa
            int r6 = r10.m(r6)
            j$.time.zone.e r7 = r1.U()
            j$.time.Instant r8 = j$.time.Instant.f18013c
            j$.time.ZoneOffset r7 = r7.d(r8)
            int r7 = r7.b0()
            if (r6 != r7) goto L_0x008b
            goto L_0x00aa
        L_0x008b:
            j$.time.e r11 = new j$.time.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unable to apply override zone '"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x00aa:
            if (r1 == 0) goto L_0x00ad
            r3 = r1
        L_0x00ad:
            if (r0 == 0) goto L_0x00fb
            j$.time.temporal.a r1 = j$.time.temporal.a.EPOCH_DAY
            boolean r1 = r10.e(r1)
            if (r1 == 0) goto L_0x00bc
            j$.time.chrono.ChronoLocalDate r5 = r4.G(r10)
            goto L_0x00fb
        L_0x00bc:
            j$.time.chrono.v r1 = j$.time.chrono.v.f18100d
            if (r0 != r1) goto L_0x00c2
            if (r2 == 0) goto L_0x00fb
        L_0x00c2:
            j$.time.temporal.a[] r1 = j$.time.temporal.a.values()
            int r2 = r1.length
            r6 = 0
        L_0x00c8:
            if (r6 >= r2) goto L_0x00fb
            r7 = r1[r6]
            boolean r8 = r7.isDateBased()
            if (r8 == 0) goto L_0x00f8
            boolean r7 = r10.e(r7)
            if (r7 != 0) goto L_0x00d9
            goto L_0x00f8
        L_0x00d9:
            j$.time.e r11 = new j$.time.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00f8:
            int r6 = r6 + 1
            goto L_0x00c8
        L_0x00fb:
            j$.time.format.z r0 = new j$.time.format.z
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x0101:
            r9.f18107a = r10
            r9.f18108b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.A.<init>(j$.time.temporal.j, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f18109c--;
    }

    /* access modifiers changed from: package-private */
    public final D b() {
        return this.f18108b.c();
    }

    /* access modifiers changed from: package-private */
    public final Locale c() {
        return this.f18108b.d();
    }

    /* access modifiers changed from: package-private */
    public final j d() {
        return this.f18107a;
    }

    /* access modifiers changed from: package-private */
    public final Long e(o oVar) {
        try {
            return Long.valueOf(this.f18107a.h(oVar));
        } catch (e e10) {
            if (this.f18109c > 0) {
                return null;
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object f(p pVar) {
        Object K = this.f18107a.K(pVar);
        if (K != null || this.f18109c != 0) {
            return K;
        }
        StringBuilder b10 = b.b("Unable to extract value: ");
        b10.append(this.f18107a.getClass());
        throw new e(b10.toString());
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f18109c++;
    }

    public final String toString() {
        return this.f18107a.toString();
    }
}
