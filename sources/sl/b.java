package sl;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nl.d;
import nl.e;
import nl.f;
import nl.h;
import nl.k;
import p3.l0;
import rl.a;
import sl.f;
import v.v;

/* compiled from: StandardZoneRules */
public final class b extends f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f22934a;

    /* renamed from: b  reason: collision with root package name */
    public final k[] f22935b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f22936c;

    /* renamed from: d  reason: collision with root package name */
    public final f[] f22937d;

    /* renamed from: e  reason: collision with root package name */
    public final k[] f22938e;

    /* renamed from: f  reason: collision with root package name */
    public final e[] f22939f;

    /* renamed from: n  reason: collision with root package name */
    public final ConcurrentHashMap f22940n = new ConcurrentHashMap();

    public b(long[] jArr, k[] kVarArr, long[] jArr2, k[] kVarArr2, e[] eVarArr) {
        boolean z10;
        this.f22934a = jArr;
        this.f22935b = kVarArr;
        this.f22936c = jArr2;
        this.f22938e = kVarArr2;
        this.f22939f = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jArr2.length) {
            k kVar = kVarArr2[i10];
            int i11 = i10 + 1;
            k kVar2 = kVarArr2[i11];
            f E = f.E(jArr2[i10], 0, kVar);
            int i12 = kVar2.f21779b;
            int i13 = kVar.f21779b;
            if (i12 > i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(E);
                arrayList.add(E.G((long) (kVar2.f21779b - kVar.f21779b)));
            } else {
                arrayList.add(E.G((long) (i12 - i13)));
                arrayList.add(E);
            }
            i10 = i11;
        }
        this.f22937d = (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    public final k a(d dVar) {
        long j10 = dVar.f21750a;
        if (this.f22939f.length > 0) {
            long[] jArr = this.f22936c;
            if (j10 > jArr[jArr.length - 1]) {
                k[] kVarArr = this.f22938e;
                d[] f10 = f(e.G(l0.T(((long) kVarArr[kVarArr.length - 1].f21779b) + j10, 86400)).f21754a);
                d dVar2 = null;
                for (int i10 = 0; i10 < f10.length; i10++) {
                    dVar2 = f10[i10];
                    if (j10 < dVar2.f22948a.v(dVar2.f22949b)) {
                        return dVar2.f22949b;
                    }
                }
                return dVar2.f22950c;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f22936c, j10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f22938e[binarySearch + 1];
    }

    public final d b(f fVar) {
        Object g2 = g(fVar);
        if (g2 instanceof d) {
            return (d) g2;
        }
        return null;
    }

    public final List<k> c(f fVar) {
        boolean z10;
        Object g2 = g(fVar);
        if (!(g2 instanceof d)) {
            return Collections.singletonList((k) g2);
        }
        d dVar = (d) g2;
        k kVar = dVar.f22950c;
        int i10 = kVar.f21779b;
        k kVar2 = dVar.f22949b;
        if (i10 > kVar2.f21779b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Collections.emptyList();
        }
        return Arrays.asList(new k[]{kVar2, kVar});
    }

    public final boolean d() {
        if (this.f22936c.length == 0) {
            return true;
        }
        return false;
    }

    public final boolean e(f fVar, k kVar) {
        return c(fVar).contains(kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (!Arrays.equals(this.f22934a, bVar.f22934a) || !Arrays.equals(this.f22935b, bVar.f22935b) || !Arrays.equals(this.f22936c, bVar.f22936c) || !Arrays.equals(this.f22938e, bVar.f22938e) || !Arrays.equals(this.f22939f, bVar.f22939f)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof f.a)) {
            return false;
        } else {
            if (!d() || !a(d.f21749c).equals(((f.a) obj).f22960a)) {
                return false;
            }
            return true;
        }
    }

    public final d[] f(int i10) {
        e eVar;
        Integer valueOf = Integer.valueOf(i10);
        d[] dVarArr = (d[]) this.f22940n.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f22939f;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            e eVar2 = eVarArr[i11];
            byte b10 = eVar2.f22952b;
            if (b10 < 0) {
                h hVar = eVar2.f22951a;
                long j10 = (long) i10;
                ol.h.f22637a.getClass();
                int u10 = hVar.u(ol.h.isLeapYear(j10)) + 1 + eVar2.f22952b;
                e eVar3 = e.f21752d;
                a.YEAR.m(j10);
                a.DAY_OF_MONTH.m((long) u10);
                eVar = e.A(i10, hVar, u10);
                nl.b bVar = eVar2.f22953c;
                if (bVar != null) {
                    eVar = eVar.x(new nd.k(1, bVar));
                }
            } else {
                h hVar2 = eVar2.f22951a;
                e eVar4 = e.f21752d;
                a.YEAR.m((long) i10);
                l0.y0(hVar2, "month");
                a.DAY_OF_MONTH.m((long) b10);
                eVar = e.A(i10, hVar2, b10);
                nl.b bVar2 = eVar2.f22953c;
                if (bVar2 != null) {
                    eVar = eVar.x(new nd.k(0, bVar2));
                }
            }
            nl.f D = nl.f.D(eVar.I((long) eVar2.f22955e), eVar2.f22954d);
            int i12 = eVar2.f22956f;
            k kVar = eVar2.f22957n;
            k kVar2 = eVar2.f22958o;
            int g2 = v.g(i12);
            if (g2 == 0) {
                D = D.G((long) (kVar2.f21779b - k.f21776f.f21779b));
            } else if (g2 == 2) {
                D = D.G((long) (kVar2.f21779b - kVar.f21779b));
            }
            dVarArr2[i11] = new d(D, eVar2.f22958o, eVar2.f22959p);
        }
        if (i10 < 2100) {
            this.f22940n.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6 A[LOOP:0: B:15:0x004e->B:38:0x00b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(nl.f r10) {
        /*
            r9 = this;
            sl.e[] r0 = r9.f22939f
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x00bc
            nl.f[] r0 = r9.f22937d
            int r3 = r0.length
            int r3 = r3 - r2
            r0 = r0[r3]
            r10.getClass()
            boolean r3 = r0 instanceof nl.f
            if (r3 == 0) goto L_0x001b
            int r0 = r10.A(r0)
            if (r0 <= 0) goto L_0x003e
            goto L_0x0040
        L_0x001b:
            nl.e r3 = r10.f21759a
            long r3 = r3.toEpochDay()
            nl.e r5 = r0.f21759a
            long r5 = r5.toEpochDay()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0040
            if (r3 != 0) goto L_0x003e
            nl.g r3 = r10.f21760b
            long r3 = r3.D()
            nl.g r0 = r0.f21760b
            long r5 = r0.D()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r0 = r1
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 == 0) goto L_0x00bc
            nl.e r0 = r10.f21759a
            int r0 = r0.f21754a
            sl.d[] r0 = r9.f(r0)
            r3 = 0
            int r4 = r0.length
            r5 = r1
        L_0x004e:
            if (r5 >= r4) goto L_0x00bb
            r3 = r0[r5]
            nl.f r6 = r3.f22948a
            nl.k r7 = r3.f22950c
            int r7 = r7.f21779b
            nl.k r8 = r3.f22949b
            int r8 = r8.f21779b
            if (r7 <= r8) goto L_0x0060
            r7 = r2
            goto L_0x0061
        L_0x0060:
            r7 = r1
        L_0x0061:
            if (r7 == 0) goto L_0x0086
            boolean r6 = r10.C(r6)
            if (r6 == 0) goto L_0x006c
            nl.k r6 = r3.f22949b
            goto L_0x00a9
        L_0x006c:
            nl.f r6 = r3.f22948a
            nl.k r7 = r3.f22950c
            int r7 = r7.f21779b
            nl.k r8 = r3.f22949b
            int r8 = r8.f21779b
            int r7 = r7 - r8
            long r7 = (long) r7
            nl.f r6 = r6.G(r7)
            boolean r6 = r10.C(r6)
            if (r6 == 0) goto L_0x0083
            goto L_0x00a8
        L_0x0083:
            nl.k r6 = r3.f22950c
            goto L_0x00a9
        L_0x0086:
            boolean r6 = r10.C(r6)
            if (r6 != 0) goto L_0x008f
            nl.k r6 = r3.f22950c
            goto L_0x00a9
        L_0x008f:
            nl.f r6 = r3.f22948a
            nl.k r7 = r3.f22950c
            int r7 = r7.f21779b
            nl.k r8 = r3.f22949b
            int r8 = r8.f21779b
            int r7 = r7 - r8
            long r7 = (long) r7
            nl.f r6 = r6.G(r7)
            boolean r6 = r10.C(r6)
            if (r6 == 0) goto L_0x00a8
            nl.k r6 = r3.f22949b
            goto L_0x00a9
        L_0x00a8:
            r6 = r3
        L_0x00a9:
            boolean r7 = r6 instanceof sl.d
            if (r7 != 0) goto L_0x00ba
            nl.k r3 = r3.f22949b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            int r5 = r5 + 1
            r3 = r6
            goto L_0x004e
        L_0x00ba:
            return r6
        L_0x00bb:
            return r3
        L_0x00bc:
            nl.f[] r0 = r9.f22937d
            int r10 = java.util.Arrays.binarySearch(r0, r10)
            r0 = -1
            if (r10 != r0) goto L_0x00ca
            nl.k[] r10 = r9.f22938e
            r10 = r10[r1]
            return r10
        L_0x00ca:
            if (r10 >= 0) goto L_0x00d0
            int r10 = -r10
            int r10 = r10 + -2
            goto L_0x00e3
        L_0x00d0:
            nl.f[] r0 = r9.f22937d
            int r1 = r0.length
            int r1 = r1 - r2
            if (r10 >= r1) goto L_0x00e3
            r1 = r0[r10]
            int r3 = r10 + 1
            r0 = r0[r3]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e3
            r10 = r3
        L_0x00e3:
            r0 = r10 & 1
            if (r0 != 0) goto L_0x010a
            nl.f[] r0 = r9.f22937d
            r1 = r0[r10]
            int r3 = r10 + 1
            r0 = r0[r3]
            nl.k[] r3 = r9.f22938e
            int r10 = r10 / 2
            r4 = r3[r10]
            int r10 = r10 + r2
            r10 = r3[r10]
            int r2 = r10.f21779b
            int r3 = r4.f21779b
            if (r2 <= r3) goto L_0x0104
            sl.d r0 = new sl.d
            r0.<init>((nl.f) r1, (nl.k) r4, (nl.k) r10)
            return r0
        L_0x0104:
            sl.d r1 = new sl.d
            r1.<init>((nl.f) r0, (nl.k) r4, (nl.k) r10)
            return r1
        L_0x010a:
            nl.k[] r0 = r9.f22938e
            int r10 = r10 / 2
            int r10 = r10 + r2
            r10 = r0[r10]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.b.g(nl.f):java.lang.Object");
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f22934a) ^ Arrays.hashCode(this.f22935b)) ^ Arrays.hashCode(this.f22936c)) ^ Arrays.hashCode(this.f22938e)) ^ Arrays.hashCode(this.f22939f);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("StandardZoneRules[currentStandardOffset=");
        k[] kVarArr = this.f22935b;
        q10.append(kVarArr[kVarArr.length - 1]);
        q10.append("]");
        return q10.toString();
    }
}
