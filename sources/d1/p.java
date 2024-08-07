package d1;

import c1.d;
import c1.e;

/* compiled from: WidgetRun */
public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f8528a;

    /* renamed from: b  reason: collision with root package name */
    public e f8529b;

    /* renamed from: c  reason: collision with root package name */
    public m f8530c;

    /* renamed from: d  reason: collision with root package name */
    public e.a f8531d;

    /* renamed from: e  reason: collision with root package name */
    public g f8532e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f8533f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8534g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f8535h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f8536i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f8537j = 1;

    public p(e eVar) {
        this.f8529b = eVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f8514l.add(fVar2);
        fVar.f8508f = i10;
        fVar2.f8513k.add(fVar);
    }

    public static f h(d dVar) {
        d dVar2 = dVar.f4406f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f4404d;
        int ordinal = dVar2.f4405e.ordinal();
        if (ordinal == 1) {
            return eVar.f4425d.f8535h;
        }
        if (ordinal == 2) {
            return eVar.f4427e.f8535h;
        }
        if (ordinal == 3) {
            return eVar.f4425d.f8536i;
        }
        if (ordinal == 4) {
            return eVar.f4427e.f8536i;
        }
        if (ordinal != 5) {
            return null;
        }
        return eVar.f4427e.f8520k;
    }

    public static f i(d dVar, int i10) {
        p pVar;
        d dVar2 = dVar.f4406f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f4404d;
        if (i10 == 0) {
            pVar = eVar.f4425d;
        } else {
            pVar = eVar.f4427e;
        }
        int ordinal = dVar2.f4405e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f8535h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f8536i;
        }
        return null;
    }

    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f8514l.add(fVar2);
        fVar.f8514l.add(this.f8532e);
        fVar.f8510h = i10;
        fVar.f8511i = gVar;
        fVar2.f8513k.add(fVar);
        gVar.f8513k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f8529b;
            int i13 = eVar.f4463w;
            i12 = Math.max(eVar.f4461v, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f8529b;
            int i14 = eVar2.f4466z;
            int max = Math.max(eVar2.f4465y, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public long j() {
        g gVar = this.f8532e;
        if (gVar.f8512j) {
            return (long) gVar.f8509g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.f8528a == 3) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(c1.d r13, c1.d r14, int r15) {
        /*
            r12 = this;
            d1.f r0 = h(r13)
            d1.f r1 = h(r14)
            boolean r2 = r0.f8512j
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.f8512j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f5
        L_0x0012:
            int r2 = r0.f8509g
            int r13 = r13.e()
            int r13 = r13 + r2
            int r2 = r1.f8509g
            int r14 = r14.e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            d1.g r3 = r12.f8532e
            boolean r4 = r3.f8512j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b4
            c1.e$a r4 = r12.f8531d
            c1.e$a r6 = c1.e.a.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00b4
            int r4 = r12.f8528a
            if (r4 == 0) goto L_0x00ad
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0075
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00b4
        L_0x003f:
            c1.e r4 = r12.f8529b
            d1.l r9 = r4.f4425d
            c1.e$a r10 = r9.f8531d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.f8528a
            if (r10 != r8) goto L_0x0056
            d1.n r10 = r4.f4427e
            c1.e$a r11 = r10.f8531d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.f8528a
            if (r6 != r8) goto L_0x0056
            goto L_0x00b4
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            d1.n r9 = r4.f4427e
        L_0x005a:
            d1.g r6 = r9.f8532e
            boolean r8 = r6.f8512j
            if (r8 == 0) goto L_0x00b4
            float r4 = r4.Z
            if (r15 != r7) goto L_0x006b
            int r6 = r6.f8509g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0071
        L_0x006b:
            int r6 = r6.f8509g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0071:
            r3.d(r4)
            goto L_0x00b4
        L_0x0075:
            c1.e r4 = r12.f8529b
            c1.e r6 = r4.W
            if (r6 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x0080
            d1.l r6 = r6.f4425d
            goto L_0x0082
        L_0x0080:
            d1.n r6 = r6.f4427e
        L_0x0082:
            d1.g r6 = r6.f8532e
            boolean r7 = r6.f8512j
            if (r7 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x008d
            float r4 = r4.f4464x
            goto L_0x008f
        L_0x008d:
            float r4 = r4.A
        L_0x008f:
            int r6 = r6.f8509g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.g(r4, r15)
            r3.d(r4)
            goto L_0x00b4
        L_0x009d:
            int r3 = r3.f8515m
            int r3 = r12.g(r3, r15)
            d1.g r4 = r12.f8532e
            int r3 = java.lang.Math.min(r3, r14)
            r4.d(r3)
            goto L_0x00b4
        L_0x00ad:
            int r4 = r12.g(r14, r15)
            r3.d(r4)
        L_0x00b4:
            d1.g r3 = r12.f8532e
            boolean r4 = r3.f8512j
            if (r4 != 0) goto L_0x00bb
            return
        L_0x00bb:
            int r3 = r3.f8509g
            if (r3 != r14) goto L_0x00ca
            d1.f r14 = r12.f8535h
            r14.d(r13)
            d1.f r13 = r12.f8536i
            r13.d(r2)
            return
        L_0x00ca:
            c1.e r14 = r12.f8529b
            if (r15 != 0) goto L_0x00d1
            float r14 = r14.f4432g0
            goto L_0x00d3
        L_0x00d1:
            float r14 = r14.f4434h0
        L_0x00d3:
            if (r0 != r1) goto L_0x00da
            int r13 = r0.f8509g
            int r2 = r1.f8509g
            r14 = r5
        L_0x00da:
            int r2 = r2 - r13
            int r2 = r2 - r3
            d1.f r15 = r12.f8535h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.d(r13)
            d1.f r13 = r12.f8536i
            d1.f r14 = r12.f8535h
            int r14 = r14.f8509g
            d1.g r15 = r12.f8532e
            int r15 = r15.f8509g
            int r14 = r14 + r15
            r13.d(r14)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.p.l(c1.d, c1.d, int):void");
    }
}
