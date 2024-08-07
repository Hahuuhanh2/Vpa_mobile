package d1;

import android.support.v4.media.a;
import c1.e;
import v.v;

/* compiled from: VerticalWidgetRun */
public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f8520k;

    /* renamed from: l  reason: collision with root package name */
    public a f8521l = null;

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f8520k = fVar;
        this.f8535h.f8507e = 6;
        this.f8536i.f8507e = 7;
        fVar.f8507e = 8;
        this.f8533f = 1;
    }

    public final void a(d dVar) {
        int i10;
        float f10;
        float f11;
        float f12;
        e.a aVar = e.a.MATCH_CONSTRAINT;
        if (v.g(this.f8537j) != 3) {
            g gVar = this.f8532e;
            if (gVar.f8505c && !gVar.f8512j && this.f8531d == aVar) {
                e eVar = this.f8529b;
                int i11 = eVar.f4457t;
                if (i11 == 2) {
                    e eVar2 = eVar.W;
                    if (eVar2 != null) {
                        g gVar2 = eVar2.f4427e.f8532e;
                        if (gVar2.f8512j) {
                            gVar.d((int) ((((float) gVar2.f8509g) * eVar.A) + 0.5f));
                        }
                    }
                } else if (i11 == 3) {
                    g gVar3 = eVar.f4425d.f8532e;
                    if (gVar3.f8512j) {
                        int i12 = eVar.f4420a0;
                        if (i12 == -1) {
                            f12 = (float) gVar3.f8509g;
                            f11 = eVar.Z;
                        } else if (i12 == 0) {
                            f10 = ((float) gVar3.f8509g) * eVar.Z;
                            i10 = (int) (f10 + 0.5f);
                            gVar.d(i10);
                        } else if (i12 != 1) {
                            i10 = 0;
                            gVar.d(i10);
                        } else {
                            f12 = (float) gVar3.f8509g;
                            f11 = eVar.Z;
                        }
                        f10 = f12 / f11;
                        i10 = (int) (f10 + 0.5f);
                        gVar.d(i10);
                    }
                }
            }
            f fVar = this.f8535h;
            if (fVar.f8505c) {
                f fVar2 = this.f8536i;
                if (fVar2.f8505c) {
                    if (!fVar.f8512j || !fVar2.f8512j || !this.f8532e.f8512j) {
                        if (!this.f8532e.f8512j && this.f8531d == aVar) {
                            e eVar3 = this.f8529b;
                            if (eVar3.f4455s == 0 && !eVar3.C()) {
                                int i13 = ((f) this.f8535h.f8514l.get(0)).f8509g;
                                f fVar3 = this.f8535h;
                                int i14 = i13 + fVar3.f8508f;
                                int i15 = ((f) this.f8536i.f8514l.get(0)).f8509g + this.f8536i.f8508f;
                                fVar3.d(i14);
                                this.f8536i.d(i15);
                                this.f8532e.d(i15 - i14);
                                return;
                            }
                        }
                        if (!this.f8532e.f8512j && this.f8531d == aVar && this.f8528a == 1 && this.f8535h.f8514l.size() > 0 && this.f8536i.f8514l.size() > 0) {
                            int i16 = (((f) this.f8536i.f8514l.get(0)).f8509g + this.f8536i.f8508f) - (((f) this.f8535h.f8514l.get(0)).f8509g + this.f8535h.f8508f);
                            g gVar4 = this.f8532e;
                            int i17 = gVar4.f8515m;
                            if (i16 < i17) {
                                gVar4.d(i16);
                            } else {
                                gVar4.d(i17);
                            }
                        }
                        if (this.f8532e.f8512j && this.f8535h.f8514l.size() > 0 && this.f8536i.f8514l.size() > 0) {
                            f fVar4 = (f) this.f8535h.f8514l.get(0);
                            f fVar5 = (f) this.f8536i.f8514l.get(0);
                            int i18 = fVar4.f8509g;
                            f fVar6 = this.f8535h;
                            int i19 = fVar6.f8508f + i18;
                            int i20 = fVar5.f8509g;
                            int i21 = this.f8536i.f8508f + i20;
                            float f13 = this.f8529b.f4434h0;
                            if (fVar4 == fVar5) {
                                f13 = 0.5f;
                            } else {
                                i18 = i19;
                                i20 = i21;
                            }
                            fVar6.d((int) ((((float) ((i20 - i18) - this.f8532e.f8509g)) * f13) + ((float) i18) + 0.5f));
                            this.f8536i.d(this.f8535h.f8509g + this.f8532e.f8509g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar4 = this.f8529b;
        l(eVar4.L, eVar4.N, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        r0 = r11.f8529b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            c1.e$a r0 = c1.e.a.MATCH_PARENT
            c1.e$a r1 = c1.e.a.FIXED
            c1.e$a r2 = c1.e.a.MATCH_CONSTRAINT
            c1.e r3 = r11.f8529b
            boolean r4 = r3.f4419a
            if (r4 == 0) goto L_0x0015
            d1.g r4 = r11.f8532e
            int r3 = r3.o()
            r4.d(r3)
        L_0x0015:
            d1.g r3 = r11.f8532e
            boolean r3 = r3.f8512j
            r4 = 1
            if (r3 != 0) goto L_0x008e
            c1.e r3 = r11.f8529b
            c1.e$a[] r5 = r3.V
            r5 = r5[r4]
            r11.f8531d = r5
            boolean r3 = r3.F
            if (r3 == 0) goto L_0x002f
            d1.a r3 = new d1.a
            r3.<init>(r11)
            r11.f8521l = r3
        L_0x002f:
            c1.e$a r3 = r11.f8531d
            if (r3 == r2) goto L_0x00c0
            if (r3 != r0) goto L_0x0080
            c1.e r0 = r11.f8529b
            c1.e r0 = r0.W
            if (r0 == 0) goto L_0x0080
            c1.e$a[] r5 = r0.V
            r5 = r5[r4]
            if (r5 != r1) goto L_0x0080
            int r1 = r0.o()
            c1.e r2 = r11.f8529b
            c1.d r2 = r2.L
            int r2 = r2.e()
            int r1 = r1 - r2
            c1.e r2 = r11.f8529b
            c1.d r2 = r2.N
            int r2 = r2.e()
            int r1 = r1 - r2
            d1.f r2 = r11.f8535h
            d1.n r3 = r0.f4427e
            d1.f r3 = r3.f8535h
            c1.e r4 = r11.f8529b
            c1.d r4 = r4.L
            int r4 = r4.e()
            d1.p.b(r2, r3, r4)
            d1.f r2 = r11.f8536i
            d1.n r0 = r0.f4427e
            d1.f r0 = r0.f8536i
            c1.e r3 = r11.f8529b
            c1.d r3 = r3.N
            int r3 = r3.e()
            int r3 = -r3
            d1.p.b(r2, r0, r3)
            d1.g r0 = r11.f8532e
            r0.d(r1)
            return
        L_0x0080:
            if (r3 != r1) goto L_0x00c0
            d1.g r0 = r11.f8532e
            c1.e r1 = r11.f8529b
            int r1 = r1.o()
            r0.d(r1)
            goto L_0x00c0
        L_0x008e:
            c1.e$a r3 = r11.f8531d
            if (r3 != r0) goto L_0x00c0
            c1.e r0 = r11.f8529b
            c1.e r3 = r0.W
            if (r3 == 0) goto L_0x00c0
            c1.e$a[] r5 = r3.V
            r5 = r5[r4]
            if (r5 != r1) goto L_0x00c0
            d1.f r1 = r11.f8535h
            d1.n r2 = r3.f4427e
            d1.f r2 = r2.f8535h
            c1.d r0 = r0.L
            int r0 = r0.e()
            d1.p.b(r1, r2, r0)
            d1.f r0 = r11.f8536i
            d1.n r1 = r3.f4427e
            d1.f r1 = r1.f8536i
            c1.e r2 = r11.f8529b
            c1.d r2 = r2.N
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r0, r1, r2)
            return
        L_0x00c0:
            d1.g r0 = r11.f8532e
            boolean r1 = r0.f8512j
            r3 = 0
            r5 = 2
            r6 = 3
            r7 = 4
            if (r1 == 0) goto L_0x0227
            c1.e r8 = r11.f8529b
            boolean r9 = r8.f4419a
            if (r9 == 0) goto L_0x0227
            c1.d[] r0 = r8.S
            r1 = r0[r5]
            c1.d r2 = r1.f4406f
            if (r2 == 0) goto L_0x0152
            r9 = r0[r6]
            c1.d r9 = r9.f4406f
            if (r9 == 0) goto L_0x0152
            boolean r0 = r8.C()
            if (r0 == 0) goto L_0x0102
            d1.f r0 = r11.f8535h
            c1.e r1 = r11.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r5]
            int r1 = r1.e()
            r0.f8508f = r1
            d1.f r0 = r11.f8536i
            c1.e r1 = r11.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r6]
            int r1 = r1.e()
            int r1 = -r1
            r0.f8508f = r1
            goto L_0x0141
        L_0x0102:
            c1.e r0 = r11.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r5]
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x011d
            d1.f r1 = r11.f8535h
            c1.e r2 = r11.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r5]
            int r2 = r2.e()
            d1.p.b(r1, r0, r2)
        L_0x011d:
            c1.e r0 = r11.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r6]
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x0139
            d1.f r1 = r11.f8536i
            c1.e r2 = r11.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r6]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
        L_0x0139:
            d1.f r0 = r11.f8535h
            r0.f8504b = r4
            d1.f r0 = r11.f8536i
            r0.f8504b = r4
        L_0x0141:
            c1.e r0 = r11.f8529b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x041c
            d1.f r1 = r11.f8520k
            d1.f r2 = r11.f8535h
            int r0 = r0.f4426d0
            d1.p.b(r1, r2, r0)
            goto L_0x041c
        L_0x0152:
            if (r2 == 0) goto L_0x0185
            d1.f r0 = d1.p.h(r1)
            if (r0 == 0) goto L_0x041c
            d1.f r1 = r11.f8535h
            c1.e r2 = r11.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r5]
            int r2 = r2.e()
            d1.p.b(r1, r0, r2)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r2 = r11.f8532e
            int r2 = r2.f8509g
            d1.p.b(r0, r1, r2)
            c1.e r0 = r11.f8529b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x041c
            d1.f r1 = r11.f8520k
            d1.f r2 = r11.f8535h
            int r0 = r0.f4426d0
            d1.p.b(r1, r2, r0)
            goto L_0x041c
        L_0x0185:
            r1 = r0[r6]
            c1.d r2 = r1.f4406f
            if (r2 == 0) goto L_0x01be
            d1.f r0 = d1.p.h(r1)
            if (r0 == 0) goto L_0x01ad
            d1.f r1 = r11.f8536i
            c1.e r2 = r11.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r6]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
            d1.f r0 = r11.f8535h
            d1.f r1 = r11.f8536i
            d1.g r2 = r11.f8532e
            int r2 = r2.f8509g
            int r2 = -r2
            d1.p.b(r0, r1, r2)
        L_0x01ad:
            c1.e r0 = r11.f8529b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x041c
            d1.f r1 = r11.f8520k
            d1.f r2 = r11.f8535h
            int r0 = r0.f4426d0
            d1.p.b(r1, r2, r0)
            goto L_0x041c
        L_0x01be:
            r0 = r0[r7]
            c1.d r1 = r0.f4406f
            if (r1 == 0) goto L_0x01e8
            d1.f r0 = d1.p.h(r0)
            if (r0 == 0) goto L_0x041c
            d1.f r1 = r11.f8520k
            d1.p.b(r1, r0, r3)
            d1.f r0 = r11.f8535h
            d1.f r1 = r11.f8520k
            c1.e r2 = r11.f8529b
            int r2 = r2.f4426d0
            int r2 = -r2
            d1.p.b(r0, r1, r2)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r2 = r11.f8532e
            int r2 = r2.f8509g
            d1.p.b(r0, r1, r2)
            goto L_0x041c
        L_0x01e8:
            boolean r0 = r8 instanceof c1.i
            if (r0 != 0) goto L_0x041c
            c1.e r0 = r8.W
            if (r0 == 0) goto L_0x041c
            c1.d$a r0 = c1.d.a.CENTER
            c1.d r0 = r8.m(r0)
            c1.d r0 = r0.f4406f
            if (r0 != 0) goto L_0x041c
            c1.e r0 = r11.f8529b
            c1.e r1 = r0.W
            d1.n r1 = r1.f4427e
            d1.f r1 = r1.f8535h
            d1.f r2 = r11.f8535h
            int r0 = r0.w()
            d1.p.b(r2, r1, r0)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r2 = r11.f8532e
            int r2 = r2.f8509g
            d1.p.b(r0, r1, r2)
            c1.e r0 = r11.f8529b
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x041c
            d1.f r1 = r11.f8520k
            d1.f r2 = r11.f8535h
            int r0 = r0.f4426d0
            d1.p.b(r1, r2, r0)
            goto L_0x041c
        L_0x0227:
            if (r1 != 0) goto L_0x0294
            c1.e$a r1 = r11.f8531d
            if (r1 != r2) goto L_0x0294
            c1.e r1 = r11.f8529b
            int r8 = r1.f4457t
            if (r8 == r5) goto L_0x026a
            if (r8 == r6) goto L_0x0236
            goto L_0x0297
        L_0x0236:
            boolean r0 = r1.C()
            if (r0 != 0) goto L_0x0297
            c1.e r0 = r11.f8529b
            int r1 = r0.f4455s
            if (r1 != r6) goto L_0x0243
            goto L_0x0297
        L_0x0243:
            d1.l r0 = r0.f4425d
            d1.g r0 = r0.f8532e
            d1.g r1 = r11.f8532e
            java.util.ArrayList r1 = r1.f8514l
            r1.add(r0)
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r11.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            r0.f8504b = r4
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r11.f8535h
            r0.add(r1)
            d1.g r0 = r11.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r11.f8536i
            r0.add(r1)
            goto L_0x0297
        L_0x026a:
            c1.e r1 = r1.W
            if (r1 != 0) goto L_0x026f
            goto L_0x0297
        L_0x026f:
            d1.n r1 = r1.f4427e
            d1.g r1 = r1.f8532e
            java.util.ArrayList r0 = r0.f8514l
            r0.add(r1)
            java.util.ArrayList r0 = r1.f8513k
            d1.g r1 = r11.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            r0.f8504b = r4
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r11.f8535h
            r0.add(r1)
            d1.g r0 = r11.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.f r1 = r11.f8536i
            r0.add(r1)
            goto L_0x0297
        L_0x0294:
            r0.b(r11)
        L_0x0297:
            c1.e r0 = r11.f8529b
            c1.d[] r1 = r0.S
            r8 = r1[r5]
            c1.d r9 = r8.f4406f
            if (r9 == 0) goto L_0x02fc
            r10 = r1[r6]
            c1.d r10 = r10.f4406f
            if (r10 == 0) goto L_0x02fc
            boolean r0 = r0.C()
            if (r0 == 0) goto L_0x02cb
            d1.f r0 = r11.f8535h
            c1.e r1 = r11.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r5]
            int r1 = r1.e()
            r0.f8508f = r1
            d1.f r0 = r11.f8536i
            c1.e r1 = r11.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r6]
            int r1 = r1.e()
            int r1 = -r1
            r0.f8508f = r1
            goto L_0x02eb
        L_0x02cb:
            c1.e r0 = r11.f8529b
            c1.d[] r0 = r0.S
            r0 = r0[r5]
            d1.f r0 = d1.p.h(r0)
            c1.e r1 = r11.f8529b
            c1.d[] r1 = r1.S
            r1 = r1[r6]
            d1.f r1 = d1.p.h(r1)
            if (r0 == 0) goto L_0x02e4
            r0.b(r11)
        L_0x02e4:
            if (r1 == 0) goto L_0x02e9
            r1.b(r11)
        L_0x02e9:
            r11.f8537j = r7
        L_0x02eb:
            c1.e r0 = r11.f8529b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x040e
            d1.f r0 = r11.f8520k
            d1.f r1 = r11.f8535h
            d1.a r2 = r11.f8521l
            r11.c(r0, r1, r4, r2)
            goto L_0x040e
        L_0x02fc:
            r10 = 0
            if (r9 == 0) goto L_0x035a
            d1.f r0 = d1.p.h(r8)
            if (r0 == 0) goto L_0x040e
            d1.f r1 = r11.f8535h
            c1.e r3 = r11.f8529b
            c1.d[] r3 = r3.S
            r3 = r3[r5]
            int r3 = r3.e()
            d1.p.b(r1, r0, r3)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r3 = r11.f8532e
            r11.c(r0, r1, r4, r3)
            c1.e r0 = r11.f8529b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x032c
            d1.f r0 = r11.f8520k
            d1.f r1 = r11.f8535h
            d1.a r3 = r11.f8521l
            r11.c(r0, r1, r4, r3)
        L_0x032c:
            c1.e$a r0 = r11.f8531d
            if (r0 != r2) goto L_0x040e
            c1.e r0 = r11.f8529b
            float r1 = r0.Z
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x040e
            d1.l r0 = r0.f4425d
            c1.e$a r1 = r0.f8531d
            if (r1 != r2) goto L_0x040e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r11.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            java.util.ArrayList r0 = r0.f8514l
            c1.e r1 = r11.f8529b
            d1.l r1 = r1.f4425d
            d1.g r1 = r1.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            r0.f8503a = r11
            goto L_0x040e
        L_0x035a:
            r5 = r1[r6]
            c1.d r8 = r5.f4406f
            r9 = -1
            if (r8 == 0) goto L_0x0391
            d1.f r0 = d1.p.h(r5)
            if (r0 == 0) goto L_0x040e
            d1.f r1 = r11.f8536i
            c1.e r2 = r11.f8529b
            c1.d[] r2 = r2.S
            r2 = r2[r6]
            int r2 = r2.e()
            int r2 = -r2
            d1.p.b(r1, r0, r2)
            d1.f r0 = r11.f8535h
            d1.f r1 = r11.f8536i
            d1.g r2 = r11.f8532e
            r11.c(r0, r1, r9, r2)
            c1.e r0 = r11.f8529b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x040e
            d1.f r0 = r11.f8520k
            d1.f r1 = r11.f8535h
            d1.a r2 = r11.f8521l
            r11.c(r0, r1, r4, r2)
            goto L_0x040e
        L_0x0391:
            r1 = r1[r7]
            c1.d r5 = r1.f4406f
            if (r5 == 0) goto L_0x03b5
            d1.f r0 = d1.p.h(r1)
            if (r0 == 0) goto L_0x040e
            d1.f r1 = r11.f8520k
            d1.p.b(r1, r0, r3)
            d1.f r0 = r11.f8535h
            d1.f r1 = r11.f8520k
            d1.a r2 = r11.f8521l
            r11.c(r0, r1, r9, r2)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r2 = r11.f8532e
            r11.c(r0, r1, r4, r2)
            goto L_0x040e
        L_0x03b5:
            boolean r1 = r0 instanceof c1.i
            if (r1 != 0) goto L_0x040e
            c1.e r1 = r0.W
            if (r1 == 0) goto L_0x040e
            d1.n r1 = r1.f4427e
            d1.f r1 = r1.f8535h
            d1.f r3 = r11.f8535h
            int r0 = r0.w()
            d1.p.b(r3, r1, r0)
            d1.f r0 = r11.f8536i
            d1.f r1 = r11.f8535h
            d1.g r3 = r11.f8532e
            r11.c(r0, r1, r4, r3)
            c1.e r0 = r11.f8529b
            boolean r0 = r0.F
            if (r0 == 0) goto L_0x03e2
            d1.f r0 = r11.f8520k
            d1.f r1 = r11.f8535h
            d1.a r3 = r11.f8521l
            r11.c(r0, r1, r4, r3)
        L_0x03e2:
            c1.e$a r0 = r11.f8531d
            if (r0 != r2) goto L_0x040e
            c1.e r0 = r11.f8529b
            float r1 = r0.Z
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x040e
            d1.l r0 = r0.f4425d
            c1.e$a r1 = r0.f8531d
            if (r1 != r2) goto L_0x040e
            d1.g r0 = r0.f8532e
            java.util.ArrayList r0 = r0.f8513k
            d1.g r1 = r11.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            java.util.ArrayList r0 = r0.f8514l
            c1.e r1 = r11.f8529b
            d1.l r1 = r1.f4425d
            d1.g r1 = r1.f8532e
            r0.add(r1)
            d1.g r0 = r11.f8532e
            r0.f8503a = r11
        L_0x040e:
            d1.g r0 = r11.f8532e
            java.util.ArrayList r0 = r0.f8514l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x041c
            d1.g r0 = r11.f8532e
            r0.f8505c = r4
        L_0x041c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.n.d():void");
    }

    public final void e() {
        f fVar = this.f8535h;
        if (fVar.f8512j) {
            this.f8529b.f4424c0 = fVar.f8509g;
        }
    }

    public final void f() {
        this.f8530c = null;
        this.f8535h.c();
        this.f8536i.c();
        this.f8520k.c();
        this.f8532e.c();
        this.f8534g = false;
    }

    public final boolean k() {
        if (this.f8531d != e.a.MATCH_CONSTRAINT || this.f8529b.f4457t == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f8534g = false;
        this.f8535h.c();
        this.f8535h.f8512j = false;
        this.f8536i.c();
        this.f8536i.f8512j = false;
        this.f8520k.c();
        this.f8520k.f8512j = false;
        this.f8532e.f8512j = false;
    }

    public final String toString() {
        StringBuilder q10 = a.q("VerticalRun ");
        q10.append(this.f8529b.f4442l0);
        return q10.toString();
    }
}
