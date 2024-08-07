package c1;

import a1.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import c1.e;
import d1.b;
import d1.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer */
public final class f extends n {
    public b.C0085b A0 = null;
    public boolean B0 = false;
    public d C0 = new d();
    public int D0;
    public int E0;
    public int F0 = 0;
    public int G0 = 0;
    public c[] H0 = new c[4];
    public c[] I0 = new c[4];
    public int J0 = 257;
    public boolean K0 = false;
    public boolean L0 = false;
    public WeakReference<d> M0 = null;
    public WeakReference<d> N0 = null;
    public WeakReference<d> O0 = null;
    public WeakReference<d> P0 = null;
    public HashSet<e> Q0 = new HashSet<>();
    public b.a R0 = new b.a();

    /* renamed from: x0  reason: collision with root package name */
    public b f4472x0 = new b(this);

    /* renamed from: y0  reason: collision with root package name */
    public e f4473y0 = new e(this);

    /* renamed from: z0  reason: collision with root package name */
    public int f4474z0;

    public static void Y(e eVar, b.C0085b bVar, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        e.a aVar2 = e.a.WRAP_CONTENT;
        e.a aVar3 = e.a.FIXED;
        if (bVar != null) {
            if (eVar.f4438j0 == 8 || (eVar instanceof h) || (eVar instanceof a)) {
                aVar.f8487e = 0;
                aVar.f8488f = 0;
                return;
            }
            e.a[] aVarArr = eVar.V;
            aVar.f8483a = aVarArr[0];
            boolean z14 = true;
            aVar.f8484b = aVarArr[1];
            aVar.f8485c = eVar.u();
            aVar.f8486d = eVar.o();
            aVar.f8491i = false;
            aVar.f8492j = 0;
            e.a aVar4 = aVar.f8483a;
            e.a aVar5 = e.a.MATCH_CONSTRAINT;
            if (aVar4 == aVar5) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f8484b == aVar5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 || eVar.Z <= 0.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z11 || eVar.Z <= 0.0f) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z10 && eVar.x(0) && eVar.f4455s == 0 && !z12) {
                aVar.f8483a = aVar2;
                if (z11 && eVar.f4457t == 0) {
                    aVar.f8483a = aVar3;
                }
                z10 = false;
            }
            if (z11 && eVar.x(1) && eVar.f4457t == 0 && !z13) {
                aVar.f8484b = aVar2;
                if (z10 && eVar.f4455s == 0) {
                    aVar.f8484b = aVar3;
                }
                z11 = false;
            }
            if (eVar.E()) {
                aVar.f8483a = aVar3;
                z10 = false;
            }
            if (eVar.F()) {
                aVar.f8484b = aVar3;
                z11 = false;
            }
            if (z12) {
                if (eVar.f4459u[0] == 4) {
                    aVar.f8483a = aVar3;
                } else if (!z11) {
                    if (aVar.f8484b == aVar3) {
                        i11 = aVar.f8486d;
                    } else {
                        aVar.f8483a = aVar2;
                        ((ConstraintLayout.a) bVar).b(eVar, aVar);
                        i11 = aVar.f8488f;
                    }
                    aVar.f8483a = aVar3;
                    aVar.f8485c = (int) (eVar.Z * ((float) i11));
                }
            }
            if (z13) {
                if (eVar.f4459u[1] == 4) {
                    aVar.f8484b = aVar3;
                } else if (!z10) {
                    if (aVar.f8483a == aVar3) {
                        i10 = aVar.f8485c;
                    } else {
                        aVar.f8484b = aVar2;
                        ((ConstraintLayout.a) bVar).b(eVar, aVar);
                        i10 = aVar.f8487e;
                    }
                    aVar.f8484b = aVar3;
                    if (eVar.f4420a0 == -1) {
                        aVar.f8486d = (int) (((float) i10) / eVar.Z);
                    } else {
                        aVar.f8486d = (int) (eVar.Z * ((float) i10));
                    }
                }
            }
            ((ConstraintLayout.a) bVar).b(eVar, aVar);
            eVar.R(aVar.f8487e);
            eVar.O(aVar.f8488f);
            eVar.F = aVar.f8490h;
            int i12 = aVar.f8489g;
            eVar.f4426d0 = i12;
            if (i12 <= 0) {
                z14 = false;
            }
            eVar.F = z14;
            aVar.f8492j = 0;
        }
    }

    public final void G() {
        this.C0.t();
        this.D0 = 0;
        this.E0 = 0;
        super.G();
    }

    public final void S(boolean z10, boolean z11) {
        super.S(z10, z11);
        int size = this.f4510w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4510w0.get(i10).S(z10, z11);
        }
    }

    /* JADX WARNING: type inference failed for: r10v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02a3, code lost:
        r25 = r7;
        r24 = r8;
        r0 = false;
        r29 = r3;
        r3 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x087e A[LOOP:34: B:498:0x087c->B:499:0x087e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x08e7  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0903  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0910  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0913  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x0955  */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x0964  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U() {
        /*
            r30 = this;
            r1 = r30
            c1.e$a r0 = c1.e.a.MATCH_CONSTRAINT
            c1.e$a r2 = c1.e.a.WRAP_CONTENT
            c1.e$a r3 = c1.e.a.FIXED
            r4 = 0
            r1.f4422b0 = r4
            r1.f4424c0 = r4
            r1.K0 = r4
            r1.L0 = r4
            java.util.ArrayList<c1.e> r5 = r1.f4510w0
            int r5 = r5.size()
            int r6 = r30.u()
            int r6 = java.lang.Math.max(r4, r6)
            int r7 = r30.o()
            int r7 = java.lang.Math.max(r4, r7)
            c1.e$a[] r8 = r1.V
            r9 = 1
            r10 = r8[r9]
            r8 = r8[r4]
            int r11 = r1.f4474z0
            if (r11 != 0) goto L_0x025a
            int r11 = r1.J0
            boolean r11 = c1.k.b(r11, r9)
            if (r11 == 0) goto L_0x025a
            d1.b$b r11 = r1.A0
            c1.e$a[] r13 = r1.V
            r14 = r13[r4]
            r13 = r13[r9]
            r30.I()
            java.util.ArrayList<c1.e> r15 = r1.f4510w0
            int r12 = r15.size()
            r9 = r4
        L_0x004c:
            if (r9 >= r12) goto L_0x005a
            java.lang.Object r17 = r15.get(r9)
            c1.e r17 = (c1.e) r17
            r17.I()
            int r9 = r9 + 1
            goto L_0x004c
        L_0x005a:
            boolean r9 = r1.B0
            if (r14 != r3) goto L_0x0066
            int r14 = r30.u()
            r1.M(r4, r14)
            goto L_0x006d
        L_0x0066:
            c1.d r14 = r1.K
            r14.l(r4)
            r1.f4422b0 = r4
        L_0x006d:
            r14 = r4
            r18 = r14
        L_0x0070:
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r4 >= r12) goto L_0x00da
            java.lang.Object r20 = r15.get(r4)
            r21 = r7
            r7 = r20
            c1.e r7 = (c1.e) r7
            r20 = r6
            boolean r6 = r7 instanceof c1.h
            if (r6 == 0) goto L_0x00c1
            c1.h r7 = (c1.h) r7
            int r6 = r7.A0
            r22 = r10
            r10 = 1
            if (r6 != r10) goto L_0x00d1
            int r6 = r7.f4502x0
            r10 = -1
            if (r6 == r10) goto L_0x0096
            r7.U(r6)
            goto L_0x00bf
        L_0x0096:
            int r6 = r7.f4503y0
            if (r6 == r10) goto L_0x00ab
            boolean r6 = r30.E()
            if (r6 == 0) goto L_0x00ab
            int r6 = r30.u()
            int r10 = r7.f4503y0
            int r6 = r6 - r10
            r7.U(r6)
            goto L_0x00bf
        L_0x00ab:
            boolean r6 = r30.E()
            if (r6 == 0) goto L_0x00bf
            float r6 = r7.f4501w0
            int r10 = r30.u()
            float r10 = (float) r10
            float r6 = r6 * r10
            float r6 = r6 + r19
            int r6 = (int) r6
            r7.U(r6)
        L_0x00bf:
            r14 = 1
            goto L_0x00d1
        L_0x00c1:
            r22 = r10
            boolean r6 = r7 instanceof c1.a
            if (r6 == 0) goto L_0x00d1
            c1.a r7 = (c1.a) r7
            int r6 = r7.W()
            if (r6 != 0) goto L_0x00d1
            r18 = 1
        L_0x00d1:
            int r4 = r4 + 1
            r6 = r20
            r7 = r21
            r10 = r22
            goto L_0x0070
        L_0x00da:
            r20 = r6
            r21 = r7
            r22 = r10
            if (r14 == 0) goto L_0x00ff
            r4 = 0
        L_0x00e3:
            if (r4 >= r12) goto L_0x00ff
            java.lang.Object r6 = r15.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r7 = r6 instanceof c1.h
            if (r7 == 0) goto L_0x00fb
            c1.h r6 = (c1.h) r6
            int r7 = r6.A0
            r10 = 1
            if (r7 != r10) goto L_0x00fb
            r7 = 0
            d1.h.b(r7, r6, r11, r9)
            goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            int r4 = r4 + 1
            goto L_0x00e3
        L_0x00ff:
            r7 = 0
            d1.h.b(r7, r1, r11, r9)
            if (r18 == 0) goto L_0x0127
            r4 = 0
        L_0x0106:
            if (r4 >= r12) goto L_0x0127
            java.lang.Object r6 = r15.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r7 = r6 instanceof c1.a
            if (r7 == 0) goto L_0x0124
            c1.a r6 = (c1.a) r6
            int r7 = r6.W()
            if (r7 != 0) goto L_0x0124
            boolean r7 = r6.V()
            if (r7 == 0) goto L_0x0124
            r7 = 1
            d1.h.b(r7, r6, r11, r9)
        L_0x0124:
            int r4 = r4 + 1
            goto L_0x0106
        L_0x0127:
            if (r13 != r3) goto L_0x0132
            int r4 = r30.o()
            r6 = 0
            r1.N(r6, r4)
            goto L_0x013a
        L_0x0132:
            r6 = 0
            c1.d r4 = r1.L
            r4.l(r6)
            r1.f4424c0 = r6
        L_0x013a:
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x013d:
            if (r6 >= r12) goto L_0x0194
            java.lang.Object r10 = r15.get(r6)
            c1.e r10 = (c1.e) r10
            boolean r13 = r10 instanceof c1.h
            if (r13 == 0) goto L_0x0183
            c1.h r10 = (c1.h) r10
            int r13 = r10.A0
            if (r13 != 0) goto L_0x0191
            int r4 = r10.f4502x0
            r13 = -1
            if (r4 == r13) goto L_0x0158
            r10.U(r4)
            goto L_0x0181
        L_0x0158:
            int r4 = r10.f4503y0
            if (r4 == r13) goto L_0x016d
            boolean r4 = r30.F()
            if (r4 == 0) goto L_0x016d
            int r4 = r30.o()
            int r13 = r10.f4503y0
            int r4 = r4 - r13
            r10.U(r4)
            goto L_0x0181
        L_0x016d:
            boolean r4 = r30.F()
            if (r4 == 0) goto L_0x0181
            float r4 = r10.f4501w0
            int r13 = r30.o()
            float r13 = (float) r13
            float r4 = r4 * r13
            float r4 = r4 + r19
            int r4 = (int) r4
            r10.U(r4)
        L_0x0181:
            r4 = 1
            goto L_0x0191
        L_0x0183:
            boolean r13 = r10 instanceof c1.a
            if (r13 == 0) goto L_0x0191
            c1.a r10 = (c1.a) r10
            int r10 = r10.W()
            r13 = 1
            if (r10 != r13) goto L_0x0191
            r7 = 1
        L_0x0191:
            int r6 = r6 + 1
            goto L_0x013d
        L_0x0194:
            if (r4 == 0) goto L_0x01b0
            r4 = 0
        L_0x0197:
            if (r4 >= r12) goto L_0x01b0
            java.lang.Object r6 = r15.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r10 = r6 instanceof c1.h
            if (r10 == 0) goto L_0x01ad
            c1.h r6 = (c1.h) r6
            int r10 = r6.A0
            if (r10 != 0) goto L_0x01ad
            r10 = 1
            d1.h.g(r10, r6, r11)
        L_0x01ad:
            int r4 = r4 + 1
            goto L_0x0197
        L_0x01b0:
            r4 = 0
            d1.h.g(r4, r1, r11)
            if (r7 == 0) goto L_0x01d8
            r4 = 0
        L_0x01b7:
            if (r4 >= r12) goto L_0x01d8
            java.lang.Object r6 = r15.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r7 = r6 instanceof c1.a
            if (r7 == 0) goto L_0x01d5
            c1.a r6 = (c1.a) r6
            int r7 = r6.W()
            r10 = 1
            if (r7 != r10) goto L_0x01d5
            boolean r7 = r6.V()
            if (r7 == 0) goto L_0x01d5
            d1.h.g(r10, r6, r11)
        L_0x01d5:
            int r4 = r4 + 1
            goto L_0x01b7
        L_0x01d8:
            r4 = 0
        L_0x01d9:
            if (r4 >= r12) goto L_0x0211
            java.lang.Object r6 = r15.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r7 = r6.D()
            if (r7 == 0) goto L_0x020e
            boolean r7 = d1.h.a(r6)
            if (r7 == 0) goto L_0x020e
            d1.b$a r7 = d1.h.f8516a
            Y(r6, r11, r7)
            boolean r7 = r6 instanceof c1.h
            if (r7 == 0) goto L_0x0207
            r7 = r6
            c1.h r7 = (c1.h) r7
            int r7 = r7.A0
            if (r7 != 0) goto L_0x0202
            r7 = 0
            d1.h.g(r7, r6, r11)
            goto L_0x020e
        L_0x0202:
            r7 = 0
            d1.h.b(r7, r6, r11, r9)
            goto L_0x020e
        L_0x0207:
            r7 = 0
            d1.h.b(r7, r6, r11, r9)
            d1.h.g(r7, r6, r11)
        L_0x020e:
            int r4 = r4 + 1
            goto L_0x01d9
        L_0x0211:
            r4 = 0
        L_0x0212:
            if (r4 >= r5) goto L_0x0260
            java.util.ArrayList<c1.e> r6 = r1.f4510w0
            java.lang.Object r6 = r6.get(r4)
            c1.e r6 = (c1.e) r6
            boolean r7 = r6.D()
            if (r7 == 0) goto L_0x0257
            boolean r7 = r6 instanceof c1.h
            if (r7 != 0) goto L_0x0257
            boolean r7 = r6 instanceof c1.a
            if (r7 != 0) goto L_0x0257
            boolean r7 = r6 instanceof c1.m
            if (r7 != 0) goto L_0x0257
            boolean r7 = r6.H
            if (r7 != 0) goto L_0x0257
            r7 = 0
            c1.e$a r9 = r6.n(r7)
            r7 = 1
            c1.e$a r10 = r6.n(r7)
            if (r9 != r0) goto L_0x024a
            int r9 = r6.f4455s
            if (r9 == r7) goto L_0x024a
            if (r10 != r0) goto L_0x024a
            int r9 = r6.f4457t
            if (r9 == r7) goto L_0x024a
            r7 = 1
            goto L_0x024b
        L_0x024a:
            r7 = 0
        L_0x024b:
            if (r7 != 0) goto L_0x0257
            d1.b$a r7 = new d1.b$a
            r7.<init>()
            d1.b$b r9 = r1.A0
            Y(r6, r9, r7)
        L_0x0257:
            int r4 = r4 + 1
            goto L_0x0212
        L_0x025a:
            r20 = r6
            r21 = r7
            r22 = r10
        L_0x0260:
            r4 = 2
            if (r5 <= r4) goto L_0x0679
            r7 = r22
            if (r8 == r2) goto L_0x0269
            if (r7 != r2) goto L_0x066c
        L_0x0269:
            int r9 = r1.J0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = c1.k.b(r9, r10)
            if (r9 == 0) goto L_0x066c
            d1.b$b r9 = r1.A0
            c1.d$a r10 = c1.d.a.CENTER
            java.util.ArrayList<c1.e> r11 = r1.f4510w0
            int r12 = r11.size()
            r13 = 0
        L_0x027e:
            if (r13 >= r12) goto L_0x02b5
            java.lang.Object r14 = r11.get(r13)
            c1.e r14 = (c1.e) r14
            c1.e$a[] r15 = r1.V
            r17 = 0
            r4 = r15[r17]
            r16 = 1
            r15 = r15[r16]
            c1.e$a[] r6 = r14.V
            r22 = r5
            r5 = r6[r17]
            r6 = r6[r16]
            boolean r4 = d1.i.b(r4, r15, r5, r6)
            if (r4 != 0) goto L_0x029f
            goto L_0x02a3
        L_0x029f:
            boolean r4 = r14 instanceof c1.g
            if (r4 == 0) goto L_0x02af
        L_0x02a3:
            r25 = r7
            r24 = r8
            r0 = 0
            r29 = r3
            r3 = r2
            r2 = r29
            goto L_0x0624
        L_0x02af:
            int r13 = r13 + 1
            r5 = r22
            r4 = 2
            goto L_0x027e
        L_0x02b5:
            r22 = r5
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r23 = 0
        L_0x02bf:
            if (r4 >= r12) goto L_0x03a8
            java.lang.Object r24 = r11.get(r4)
            r25 = r7
            r7 = r24
            c1.e r7 = (c1.e) r7
            r24 = r8
            c1.e$a[] r8 = r1.V
            r26 = r3
            r17 = 0
            r3 = r8[r17]
            r16 = 1
            r8 = r8[r16]
            r27 = r2
            c1.e$a[] r2 = r7.V
            r28 = r0
            r0 = r2[r17]
            r2 = r2[r16]
            boolean r0 = d1.i.b(r3, r8, r0, r2)
            if (r0 != 0) goto L_0x02ee
            d1.b$a r0 = r1.R0
            Y(r7, r9, r0)
        L_0x02ee:
            boolean r0 = r7 instanceof c1.h
            if (r0 == 0) goto L_0x0313
            r2 = r7
            c1.h r2 = (c1.h) r2
            int r3 = r2.A0
            if (r3 != 0) goto L_0x0304
            if (r13 != 0) goto L_0x0301
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r13 = r3
        L_0x0301:
            r13.add(r2)
        L_0x0304:
            int r3 = r2.A0
            r8 = 1
            if (r3 != r8) goto L_0x0313
            if (r5 != 0) goto L_0x0310
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0310:
            r5.add(r2)
        L_0x0313:
            boolean r2 = r7 instanceof c1.j
            if (r2 == 0) goto L_0x0358
            boolean r2 = r7 instanceof c1.a
            if (r2 == 0) goto L_0x0341
            r2 = r7
            c1.a r2 = (c1.a) r2
            int r3 = r2.W()
            if (r3 != 0) goto L_0x032f
            if (r6 != 0) goto L_0x032c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x032c:
            r6.add(r2)
        L_0x032f:
            int r3 = r2.W()
            r8 = 1
            if (r3 != r8) goto L_0x0358
            if (r14 != 0) goto L_0x033d
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x033d:
            r14.add(r2)
            goto L_0x0358
        L_0x0341:
            r2 = r7
            c1.j r2 = (c1.j) r2
            if (r6 != 0) goto L_0x034b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x034b:
            r6.add(r2)
            if (r14 != 0) goto L_0x0355
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0355:
            r14.add(r2)
        L_0x0358:
            c1.d r2 = r7.K
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0374
            c1.d r2 = r7.M
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0374
            if (r0 != 0) goto L_0x0374
            boolean r2 = r7 instanceof c1.a
            if (r2 != 0) goto L_0x0374
            if (r15 != 0) goto L_0x0371
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0371:
            r15.add(r7)
        L_0x0374:
            c1.d r2 = r7.L
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x039a
            c1.d r2 = r7.N
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x039a
            c1.d r2 = r7.O
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x039a
            if (r0 != 0) goto L_0x039a
            boolean r0 = r7 instanceof c1.a
            if (r0 != 0) goto L_0x039a
            if (r23 != 0) goto L_0x0393
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
        L_0x0393:
            r0 = r23
            r0.add(r7)
            r23 = r0
        L_0x039a:
            int r4 = r4 + 1
            r8 = r24
            r7 = r25
            r3 = r26
            r2 = r27
            r0 = r28
            goto L_0x02bf
        L_0x03a8:
            r28 = r0
            r27 = r2
            r26 = r3
            r25 = r7
            r24 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03cf
            java.util.Iterator r2 = r5.iterator()
        L_0x03bd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cf
            java.lang.Object r3 = r2.next()
            c1.h r3 = (c1.h) r3
            r4 = 0
            r5 = 0
            d1.i.a(r3, r5, r0, r4)
            goto L_0x03bd
        L_0x03cf:
            r4 = 0
            r5 = 0
            if (r6 == 0) goto L_0x03f0
            java.util.Iterator r2 = r6.iterator()
        L_0x03d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03f0
            java.lang.Object r3 = r2.next()
            c1.j r3 = (c1.j) r3
            d1.o r6 = d1.i.a(r3, r5, r0, r4)
            r3.U(r5, r6, r0)
            r6.b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03d7
        L_0x03f0:
            c1.d$a r2 = c1.d.a.LEFT
            c1.d r2 = r1.m(r2)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x0412
            java.util.Iterator r2 = r2.iterator()
        L_0x03fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0412
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 0
            d1.i.a(r3, r5, r0, r4)
            goto L_0x03fe
        L_0x0412:
            c1.d$a r2 = c1.d.a.RIGHT
            c1.d r2 = r1.m(r2)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x0434
            java.util.Iterator r2 = r2.iterator()
        L_0x0420:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0434
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 0
            d1.i.a(r3, r5, r0, r4)
            goto L_0x0420
        L_0x0434:
            c1.d r2 = r1.m(r10)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x0454
            java.util.Iterator r2 = r2.iterator()
        L_0x0440:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0454
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 0
            d1.i.a(r3, r5, r0, r4)
            goto L_0x0440
        L_0x0454:
            r4 = 0
            r5 = 0
            if (r15 == 0) goto L_0x046c
            java.util.Iterator r2 = r15.iterator()
        L_0x045c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x046c
            java.lang.Object r3 = r2.next()
            c1.e r3 = (c1.e) r3
            d1.i.a(r3, r5, r0, r4)
            goto L_0x045c
        L_0x046c:
            if (r13 == 0) goto L_0x0483
            java.util.Iterator r2 = r13.iterator()
        L_0x0472:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0483
            java.lang.Object r3 = r2.next()
            c1.h r3 = (c1.h) r3
            r5 = 1
            d1.i.a(r3, r5, r0, r4)
            goto L_0x0472
        L_0x0483:
            r5 = 1
            if (r14 == 0) goto L_0x04a3
            java.util.Iterator r2 = r14.iterator()
        L_0x048a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04a3
            java.lang.Object r3 = r2.next()
            c1.j r3 = (c1.j) r3
            d1.o r6 = d1.i.a(r3, r5, r0, r4)
            r3.U(r5, r6, r0)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x048a
        L_0x04a3:
            c1.d$a r2 = c1.d.a.TOP
            c1.d r2 = r1.m(r2)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x04c5
            java.util.Iterator r2 = r2.iterator()
        L_0x04b1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c5
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 1
            d1.i.a(r3, r5, r0, r4)
            goto L_0x04b1
        L_0x04c5:
            c1.d$a r2 = c1.d.a.BASELINE
            c1.d r2 = r1.m(r2)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x04e7
            java.util.Iterator r2 = r2.iterator()
        L_0x04d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04e7
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 1
            d1.i.a(r3, r5, r0, r4)
            goto L_0x04d3
        L_0x04e7:
            c1.d$a r2 = c1.d.a.BOTTOM
            c1.d r2 = r1.m(r2)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x0509
            java.util.Iterator r2 = r2.iterator()
        L_0x04f5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0509
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 1
            d1.i.a(r3, r5, r0, r4)
            goto L_0x04f5
        L_0x0509:
            c1.d r2 = r1.m(r10)
            java.util.HashSet<c1.d> r2 = r2.f4401a
            if (r2 == 0) goto L_0x0529
            java.util.Iterator r2 = r2.iterator()
        L_0x0515:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0529
            java.lang.Object r3 = r2.next()
            c1.d r3 = (c1.d) r3
            c1.e r3 = r3.f4404d
            r4 = 0
            r5 = 1
            d1.i.a(r3, r5, r0, r4)
            goto L_0x0515
        L_0x0529:
            r4 = 0
            r5 = 1
            if (r23 == 0) goto L_0x0541
            java.util.Iterator r2 = r23.iterator()
        L_0x0531:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0541
            java.lang.Object r3 = r2.next()
            c1.e r3 = (c1.e) r3
            d1.i.a(r3, r5, r0, r4)
            goto L_0x0531
        L_0x0541:
            r2 = 0
        L_0x0542:
            if (r2 >= r12) goto L_0x05a0
            java.lang.Object r3 = r11.get(r2)
            c1.e r3 = (c1.e) r3
            c1.e$a[] r4 = r3.V
            r6 = 0
            r7 = r4[r6]
            r6 = r28
            if (r7 != r6) goto L_0x0559
            r4 = r4[r5]
            if (r4 != r6) goto L_0x0559
            r4 = 1
            goto L_0x055a
        L_0x0559:
            r4 = 0
        L_0x055a:
            if (r4 == 0) goto L_0x059a
            int r4 = r3.f4460u0
            int r5 = r0.size()
            r7 = 0
        L_0x0563:
            if (r7 >= r5) goto L_0x0573
            java.lang.Object r8 = r0.get(r7)
            d1.o r8 = (d1.o) r8
            int r9 = r8.f8524b
            if (r4 != r9) goto L_0x0570
            goto L_0x0574
        L_0x0570:
            int r7 = r7 + 1
            goto L_0x0563
        L_0x0573:
            r8 = 0
        L_0x0574:
            int r3 = r3.f4462v0
            int r4 = r0.size()
            r5 = 0
        L_0x057b:
            if (r5 >= r4) goto L_0x058b
            java.lang.Object r7 = r0.get(r5)
            d1.o r7 = (d1.o) r7
            int r9 = r7.f8524b
            if (r3 != r9) goto L_0x0588
            goto L_0x058c
        L_0x0588:
            int r5 = r5 + 1
            goto L_0x057b
        L_0x058b:
            r7 = 0
        L_0x058c:
            if (r8 == 0) goto L_0x059a
            if (r7 == 0) goto L_0x059a
            r3 = 0
            r8.d(r3, r7)
            r3 = 2
            r7.f8525c = r3
            r0.remove(r8)
        L_0x059a:
            int r2 = r2 + 1
            r28 = r6
            r5 = 1
            goto L_0x0542
        L_0x05a0:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x05ad
            r2 = r26
            r3 = r27
            goto L_0x0621
        L_0x05ad:
            c1.e$a[] r2 = r1.V
            r3 = 0
            r2 = r2[r3]
            r3 = r27
            if (r2 != r3) goto L_0x05e5
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
            r5 = 0
        L_0x05bc:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x05da
            java.lang.Object r6 = r2.next()
            d1.o r6 = (d1.o) r6
            int r7 = r6.f8525c
            r8 = 1
            if (r7 != r8) goto L_0x05ce
            goto L_0x05bc
        L_0x05ce:
            a1.d r7 = r1.C0
            r8 = 0
            int r7 = r6.c(r7, r8)
            if (r7 <= r4) goto L_0x05bc
            r5 = r6
            r4 = r7
            goto L_0x05bc
        L_0x05da:
            if (r5 == 0) goto L_0x05e5
            r2 = r26
            r1.P(r2)
            r1.R(r4)
            goto L_0x05e8
        L_0x05e5:
            r2 = r26
            r5 = 0
        L_0x05e8:
            c1.e$a[] r4 = r1.V
            r6 = 1
            r4 = r4[r6]
            if (r4 != r3) goto L_0x061b
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
            r6 = 0
        L_0x05f5:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0612
            java.lang.Object r7 = r0.next()
            d1.o r7 = (d1.o) r7
            int r8 = r7.f8525c
            if (r8 != 0) goto L_0x0606
            goto L_0x05f5
        L_0x0606:
            a1.d r8 = r1.C0
            r9 = 1
            int r8 = r7.c(r8, r9)
            if (r8 <= r4) goto L_0x05f5
            r6 = r7
            r4 = r8
            goto L_0x05f5
        L_0x0612:
            if (r6 == 0) goto L_0x061b
            r1.Q(r2)
            r1.O(r4)
            goto L_0x061c
        L_0x061b:
            r6 = 0
        L_0x061c:
            if (r5 != 0) goto L_0x0623
            if (r6 == 0) goto L_0x0621
            goto L_0x0623
        L_0x0621:
            r0 = 0
            goto L_0x0624
        L_0x0623:
            r0 = 1
        L_0x0624:
            if (r0 == 0) goto L_0x0663
            r4 = r24
            if (r4 != r3) goto L_0x0640
            int r0 = r30.u()
            r5 = r20
            if (r5 >= r0) goto L_0x063b
            if (r5 <= 0) goto L_0x063b
            r1.R(r5)
            r6 = 1
            r1.K0 = r6
            goto L_0x0642
        L_0x063b:
            int r6 = r30.u()
            goto L_0x0643
        L_0x0640:
            r5 = r20
        L_0x0642:
            r6 = r5
        L_0x0643:
            r7 = r25
            if (r7 != r3) goto L_0x065d
            int r0 = r30.o()
            r8 = r21
            if (r8 >= r0) goto L_0x0658
            if (r8 <= 0) goto L_0x0658
            r1.O(r8)
            r5 = 1
            r1.L0 = r5
            goto L_0x065f
        L_0x0658:
            int r0 = r30.o()
            goto L_0x0660
        L_0x065d:
            r8 = r21
        L_0x065f:
            r0 = r8
        L_0x0660:
            r8 = r0
            r0 = 1
            goto L_0x0685
        L_0x0663:
            r5 = r20
            r8 = r21
            r4 = r24
            r7 = r25
            goto L_0x0683
        L_0x066c:
            r22 = r5
            r4 = r8
            r5 = r20
            r8 = r21
        L_0x0673:
            r29 = r3
            r3 = r2
            r2 = r29
            goto L_0x0683
        L_0x0679:
            r4 = r8
            r8 = r21
            r7 = r22
            r22 = r5
            r5 = r20
            goto L_0x0673
        L_0x0683:
            r6 = r5
            r0 = 0
        L_0x0685:
            r5 = 64
            boolean r9 = r1.Z(r5)
            if (r9 != 0) goto L_0x0698
            r9 = 128(0x80, float:1.794E-43)
            boolean r9 = r1.Z(r9)
            if (r9 == 0) goto L_0x0696
            goto L_0x0698
        L_0x0696:
            r9 = 0
            goto L_0x0699
        L_0x0698:
            r9 = 1
        L_0x0699:
            a1.d r10 = r1.C0
            r10.getClass()
            r11 = 0
            r10.f36g = r11
            int r12 = r1.J0
            if (r12 == 0) goto L_0x06ab
            if (r9 == 0) goto L_0x06ab
            r9 = 1
            r10.f36g = r9
            goto L_0x06ac
        L_0x06ab:
            r9 = 1
        L_0x06ac:
            java.util.ArrayList<c1.e> r10 = r1.f4510w0
            c1.e$a[] r12 = r1.V
            r13 = r12[r11]
            if (r13 == r3) goto L_0x06bb
            r12 = r12[r9]
            if (r12 != r3) goto L_0x06b9
            goto L_0x06bb
        L_0x06b9:
            r9 = r11
            goto L_0x06bc
        L_0x06bb:
            r9 = 1
        L_0x06bc:
            r1.F0 = r11
            r1.G0 = r11
            r12 = r22
            r11 = 0
        L_0x06c3:
            if (r11 >= r12) goto L_0x06d9
            java.util.ArrayList<c1.e> r13 = r1.f4510w0
            java.lang.Object r13 = r13.get(r11)
            c1.e r13 = (c1.e) r13
            boolean r14 = r13 instanceof c1.n
            if (r14 == 0) goto L_0x06d6
            c1.n r13 = (c1.n) r13
            r13.U()
        L_0x06d6:
            int r11 = r11 + 1
            goto L_0x06c3
        L_0x06d9:
            boolean r11 = r1.Z(r5)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x06e0:
            if (r14 == 0) goto L_0x095d
            r15 = 1
            int r5 = r0 + 1
            a1.d r0 = r1.C0     // Catch:{ Exception -> 0x07e7 }
            r0.t()     // Catch:{ Exception -> 0x07e7 }
            r15 = 0
            r1.F0 = r15     // Catch:{ Exception -> 0x07e7 }
            r1.G0 = r15     // Catch:{ Exception -> 0x07e7 }
            a1.d r0 = r1.C0     // Catch:{ Exception -> 0x07e7 }
            r1.k(r0)     // Catch:{ Exception -> 0x07e7 }
            r0 = 0
        L_0x06f5:
            if (r0 >= r12) goto L_0x0710
            java.util.ArrayList<c1.e> r15 = r1.f4510w0     // Catch:{ Exception -> 0x070b }
            java.lang.Object r15 = r15.get(r0)     // Catch:{ Exception -> 0x070b }
            c1.e r15 = (c1.e) r15     // Catch:{ Exception -> 0x070b }
            r21 = r14
            a1.d r14 = r1.C0     // Catch:{ Exception -> 0x07e0 }
            r15.k(r14)     // Catch:{ Exception -> 0x07e0 }
            int r0 = r0 + 1
            r14 = r21
            goto L_0x06f5
        L_0x070b:
            r0 = move-exception
            r21 = r14
            goto L_0x07e1
        L_0x0710:
            r21 = r14
            a1.d r0 = r1.C0     // Catch:{ Exception -> 0x07e0 }
            r1.W(r0)     // Catch:{ Exception -> 0x07e0 }
            java.lang.ref.WeakReference<c1.d> r0 = r1.M0     // Catch:{ Exception -> 0x07d7 }
            if (r0 == 0) goto L_0x0746
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07d7 }
            if (r0 == 0) goto L_0x0746
            java.lang.ref.WeakReference<c1.d> r0 = r1.M0     // Catch:{ Exception -> 0x07d7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07d7 }
            c1.d r0 = (c1.d) r0     // Catch:{ Exception -> 0x07d7 }
            a1.d r15 = r1.C0     // Catch:{ Exception -> 0x07d7 }
            c1.d r14 = r1.L     // Catch:{ Exception -> 0x07d7 }
            a1.g r14 = r15.k(r14)     // Catch:{ Exception -> 0x07d7 }
            a1.d r15 = r1.C0     // Catch:{ Exception -> 0x07d7 }
            a1.g r0 = r15.k(r0)     // Catch:{ Exception -> 0x07d7 }
            a1.d r15 = r1.C0     // Catch:{ Exception -> 0x07d7 }
            r23 = r10
            r22 = r13
            r10 = 0
            r13 = 5
            r15.f(r0, r14, r10, r13)     // Catch:{ Exception -> 0x07c9 }
            r10 = 0
            r1.M0 = r10     // Catch:{ Exception -> 0x07d5 }
            goto L_0x074a
        L_0x0746:
            r23 = r10
            r22 = r13
        L_0x074a:
            java.lang.ref.WeakReference<c1.d> r0 = r1.O0     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x0774
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x0774
            java.lang.ref.WeakReference<c1.d> r0 = r1.O0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            c1.d r0 = (c1.d) r0     // Catch:{ Exception -> 0x07c9 }
            a1.d r10 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            c1.d r13 = r1.N     // Catch:{ Exception -> 0x07c9 }
            a1.g r10 = r10.k(r13)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            a1.g r0 = r13.k(r0)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            r14 = 5
            r15 = 0
            r13.f(r10, r0, r15, r14)     // Catch:{ Exception -> 0x07c9 }
            r10 = 0
            r1.O0 = r10     // Catch:{ Exception -> 0x07d5 }
        L_0x0774:
            java.lang.ref.WeakReference<c1.d> r0 = r1.N0     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x079e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x079e
            java.lang.ref.WeakReference<c1.d> r0 = r1.N0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            c1.d r0 = (c1.d) r0     // Catch:{ Exception -> 0x07c9 }
            a1.d r10 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            c1.d r13 = r1.K     // Catch:{ Exception -> 0x07c9 }
            a1.g r10 = r10.k(r13)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            a1.g r0 = r13.k(r0)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            r14 = 5
            r15 = 0
            r13.f(r0, r10, r15, r14)     // Catch:{ Exception -> 0x07c9 }
            r10 = 0
            r1.N0 = r10     // Catch:{ Exception -> 0x07d5 }
        L_0x079e:
            java.lang.ref.WeakReference<c1.d> r0 = r1.P0     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x07cc
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            if (r0 == 0) goto L_0x07cc
            java.lang.ref.WeakReference<c1.d> r0 = r1.P0     // Catch:{ Exception -> 0x07c9 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07c9 }
            c1.d r0 = (c1.d) r0     // Catch:{ Exception -> 0x07c9 }
            a1.d r10 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            c1.d r13 = r1.M     // Catch:{ Exception -> 0x07c9 }
            a1.g r10 = r10.k(r13)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            a1.g r0 = r13.k(r0)     // Catch:{ Exception -> 0x07c9 }
            a1.d r13 = r1.C0     // Catch:{ Exception -> 0x07c9 }
            r14 = 5
            r15 = 0
            r13.f(r10, r0, r15, r14)     // Catch:{ Exception -> 0x07c9 }
            r10 = 0
            r1.P0 = r10     // Catch:{ Exception -> 0x07d5 }
            goto L_0x07cd
        L_0x07c9:
            r0 = move-exception
        L_0x07ca:
            r10 = 0
            goto L_0x07dd
        L_0x07cc:
            r10 = 0
        L_0x07cd:
            a1.d r0 = r1.C0     // Catch:{ Exception -> 0x07d5 }
            r0.p()     // Catch:{ Exception -> 0x07d5 }
            r21 = 1
            goto L_0x0808
        L_0x07d5:
            r0 = move-exception
            goto L_0x07dd
        L_0x07d7:
            r0 = move-exception
            r23 = r10
            r22 = r13
            goto L_0x07ca
        L_0x07dd:
            r21 = 1
            goto L_0x07ef
        L_0x07e0:
            r0 = move-exception
        L_0x07e1:
            r23 = r10
            r22 = r13
        L_0x07e5:
            r10 = 0
            goto L_0x07ef
        L_0x07e7:
            r0 = move-exception
            r23 = r10
            r22 = r13
            r21 = r14
            goto L_0x07e5
        L_0x07ef:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "EXCEPTION : "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r13.println(r0)
        L_0x0808:
            if (r21 == 0) goto L_0x0851
            a1.d r0 = r1.C0
            boolean[] r13 = c1.k.f4507a
            r14 = 2
            r15 = 0
            r13[r14] = r15
            r13 = 64
            boolean r14 = r1.Z(r13)
            r1.T(r0, r14)
            java.util.ArrayList<c1.e> r15 = r1.f4510w0
            int r15 = r15.size()
            r10 = 0
            r19 = 0
        L_0x0824:
            if (r10 >= r15) goto L_0x084f
            java.util.ArrayList<c1.e> r13 = r1.f4510w0
            java.lang.Object r13 = r13.get(r10)
            c1.e r13 = (c1.e) r13
            r13.T(r0, r14)
            r24 = r0
            int r0 = r13.f4435i
            r25 = r14
            r14 = -1
            if (r0 != r14) goto L_0x0841
            int r0 = r13.f4437j
            if (r0 == r14) goto L_0x083f
            goto L_0x0841
        L_0x083f:
            r0 = 0
            goto L_0x0842
        L_0x0841:
            r0 = 1
        L_0x0842:
            if (r0 == 0) goto L_0x0846
            r19 = 1
        L_0x0846:
            int r10 = r10 + 1
            r0 = r24
            r14 = r25
            r13 = 64
            goto L_0x0824
        L_0x084f:
            r14 = -1
            goto L_0x086c
        L_0x0851:
            r14 = -1
            a1.d r0 = r1.C0
            r1.T(r0, r11)
            r0 = 0
        L_0x0858:
            if (r0 >= r12) goto L_0x086a
            java.util.ArrayList<c1.e> r10 = r1.f4510w0
            java.lang.Object r10 = r10.get(r0)
            c1.e r10 = (c1.e) r10
            a1.d r13 = r1.C0
            r10.T(r13, r11)
            int r0 = r0 + 1
            goto L_0x0858
        L_0x086a:
            r19 = 0
        L_0x086c:
            r0 = 8
            if (r9 == 0) goto L_0x08d7
            if (r5 >= r0) goto L_0x08d7
            boolean[] r10 = c1.k.f4507a
            r13 = 2
            boolean r10 = r10[r13]
            if (r10 == 0) goto L_0x08d7
            r10 = 0
            r13 = 0
            r15 = 0
        L_0x087c:
            if (r10 >= r12) goto L_0x08a3
            java.util.ArrayList<c1.e> r14 = r1.f4510w0
            java.lang.Object r14 = r14.get(r10)
            c1.e r14 = (c1.e) r14
            int r0 = r14.f4422b0
            int r25 = r14.u()
            int r0 = r25 + r0
            int r15 = java.lang.Math.max(r15, r0)
            int r0 = r14.f4424c0
            int r14 = r14.o()
            int r14 = r14 + r0
            int r13 = java.lang.Math.max(r13, r14)
            int r10 = r10 + 1
            r0 = 8
            r14 = -1
            goto L_0x087c
        L_0x08a3:
            int r0 = r1.f4428e0
            int r0 = java.lang.Math.max(r0, r15)
            int r10 = r1.f4430f0
            int r10 = java.lang.Math.max(r10, r13)
            if (r4 != r3) goto L_0x08c3
            int r13 = r30.u()
            if (r13 >= r0) goto L_0x08c3
            r1.R(r0)
            c1.e$a[] r0 = r1.V
            r13 = 0
            r0[r13] = r3
            r19 = 1
            r22 = 1
        L_0x08c3:
            if (r7 != r3) goto L_0x08d7
            int r0 = r30.o()
            if (r0 >= r10) goto L_0x08d7
            r1.O(r10)
            c1.e$a[] r0 = r1.V
            r10 = 1
            r0[r10] = r3
            r19 = 1
            r22 = 1
        L_0x08d7:
            int r0 = r1.f4428e0
            int r10 = r30.u()
            int r0 = java.lang.Math.max(r0, r10)
            int r10 = r30.u()
            if (r0 <= r10) goto L_0x08f3
            r1.R(r0)
            c1.e$a[] r0 = r1.V
            r10 = 0
            r0[r10] = r2
            r19 = 1
            r22 = 1
        L_0x08f3:
            int r0 = r1.f4430f0
            int r10 = r30.o()
            int r0 = java.lang.Math.max(r0, r10)
            int r10 = r30.o()
            if (r0 <= r10) goto L_0x0910
            r1.O(r0)
            c1.e$a[] r0 = r1.V
            r10 = 1
            r0[r10] = r2
            r19 = r10
            r22 = r19
            goto L_0x0911
        L_0x0910:
            r10 = 1
        L_0x0911:
            if (r22 != 0) goto L_0x094b
            c1.e$a[] r0 = r1.V
            r13 = 0
            r0 = r0[r13]
            if (r0 != r3) goto L_0x092f
            if (r6 <= 0) goto L_0x092f
            int r0 = r30.u()
            if (r0 <= r6) goto L_0x092f
            r1.K0 = r10
            c1.e$a[] r0 = r1.V
            r0[r13] = r2
            r1.R(r6)
            r19 = r10
            r22 = r19
        L_0x092f:
            c1.e$a[] r0 = r1.V
            r0 = r0[r10]
            if (r0 != r3) goto L_0x094b
            if (r8 <= 0) goto L_0x094b
            int r0 = r30.o()
            if (r0 <= r8) goto L_0x094b
            r1.L0 = r10
            c1.e$a[] r0 = r1.V
            r0[r10] = r2
            r1.O(r8)
            r0 = 8
            r10 = 1
            r13 = 1
            goto L_0x0951
        L_0x094b:
            r10 = r19
            r13 = r22
            r0 = 8
        L_0x0951:
            if (r5 <= r0) goto L_0x0955
            r14 = 0
            goto L_0x0956
        L_0x0955:
            r14 = r10
        L_0x0956:
            r0 = r5
            r10 = r23
            r5 = 64
            goto L_0x06e0
        L_0x095d:
            r5 = r10
            r22 = r13
            r1.f4510w0 = r5
            if (r22 == 0) goto L_0x096c
            c1.e$a[] r0 = r1.V
            r2 = 0
            r0[r2] = r4
            r2 = 1
            r0[r2] = r7
        L_0x096c:
            a1.d r0 = r1.C0
            a1.c r0 = r0.f41l
            r1.J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.f.U():void");
    }

    public final void V(int i10, e eVar) {
        if (i10 == 0) {
            int i11 = this.F0 + 1;
            c[] cVarArr = this.I0;
            if (i11 >= cVarArr.length) {
                this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.I0;
            int i12 = this.F0;
            cVarArr2[i12] = new c(eVar, 0, this.B0);
            this.F0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.G0 + 1;
            c[] cVarArr3 = this.H0;
            if (i13 >= cVarArr3.length) {
                this.H0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.H0;
            int i14 = this.G0;
            cVarArr4[i14] = new c(eVar, 1, this.B0);
            this.G0 = i14 + 1;
        }
    }

    public final void W(d dVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        e.a aVar = e.a.FIXED;
        e.a aVar2 = e.a.WRAP_CONTENT;
        boolean Z = Z(64);
        e(dVar, Z);
        int size = this.f4510w0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f4510w0.get(i11);
            boolean[] zArr = eVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = this.f4510w0.get(i12);
                if (eVar2 instanceof a) {
                    a aVar3 = (a) eVar2;
                    for (int i13 = 0; i13 < aVar3.f4506x0; i13++) {
                        e eVar3 = aVar3.f4505w0[i13];
                        if (aVar3.f4383z0 || eVar3.f()) {
                            int i14 = aVar3.f4382y0;
                            if (i14 == 0 || i14 == 1) {
                                eVar3.U[0] = true;
                            } else if (i14 == 2 || i14 == 3) {
                                eVar3.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.Q0.clear();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar4 = this.f4510w0.get(i15);
            eVar4.getClass();
            if ((eVar4 instanceof m) || (eVar4 instanceof h)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (eVar4 instanceof m) {
                    this.Q0.add(eVar4);
                } else {
                    eVar4.e(dVar, Z);
                }
            }
        }
        while (this.Q0.size() > 0) {
            int size2 = this.Q0.size();
            Iterator<e> it = this.Q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                HashSet<e> hashSet = this.Q0;
                int i16 = 0;
                while (true) {
                    if (i16 >= mVar.f4506x0) {
                        z12 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(mVar.f4505w0[i16])) {
                        z12 = true;
                        continue;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (z12) {
                    mVar.e(dVar, Z);
                    this.Q0.remove(mVar);
                    break;
                }
            }
            if (size2 == this.Q0.size()) {
                Iterator<e> it2 = this.Q0.iterator();
                while (it2.hasNext()) {
                    it2.next().e(dVar, Z);
                }
                this.Q0.clear();
            }
        }
        if (d.f28p) {
            HashSet hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                e eVar5 = this.f4510w0.get(i17);
                eVar5.getClass();
                if ((eVar5 instanceof m) || (eVar5 instanceof h)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    hashSet2.add(eVar5);
                }
            }
            if (this.V[0] == aVar2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            d(this, dVar, hashSet2, i10, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e eVar6 = (e) it3.next();
                k.a(this, dVar, eVar6);
                eVar6.e(dVar, Z);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                e eVar7 = this.f4510w0.get(i18);
                if (eVar7 instanceof f) {
                    e.a[] aVarArr = eVar7.V;
                    e.a aVar4 = aVarArr[0];
                    e.a aVar5 = aVarArr[1];
                    if (aVar4 == aVar2) {
                        eVar7.P(aVar);
                    }
                    if (aVar5 == aVar2) {
                        eVar7.Q(aVar);
                    }
                    eVar7.e(dVar, Z);
                    if (aVar4 == aVar2) {
                        eVar7.P(aVar4);
                    }
                    if (aVar5 == aVar2) {
                        eVar7.Q(aVar5);
                    }
                } else {
                    k.a(this, dVar, eVar7);
                    if ((eVar7 instanceof m) || (eVar7 instanceof h)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        eVar7.e(dVar, Z);
                    }
                }
            }
        }
        if (this.F0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.G0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0134 A[EDGE_INSN: B:70:0x0134->B:57:0x0134 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(int r14, boolean r15) {
        /*
            r13 = this;
            d1.e r0 = r13.f4473y0
            c1.e$a r1 = c1.e.a.MATCH_PARENT
            c1.e$a r2 = c1.e.a.WRAP_CONTENT
            c1.e$a r3 = c1.e.a.FIXED
            r4 = 1
            r15 = r15 & r4
            c1.f r5 = r0.f8495a
            r6 = 0
            c1.e$a r5 = r5.n(r6)
            c1.f r7 = r0.f8495a
            c1.e$a r7 = r7.n(r4)
            c1.f r8 = r0.f8495a
            int r8 = r8.v()
            c1.f r9 = r0.f8495a
            int r9 = r9.w()
            if (r15 == 0) goto L_0x0087
            if (r5 == r2) goto L_0x0029
            if (r7 != r2) goto L_0x0087
        L_0x0029:
            java.util.ArrayList<d1.p> r10 = r0.f8499e
            java.util.Iterator r10 = r10.iterator()
        L_0x002f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0046
            java.lang.Object r11 = r10.next()
            d1.p r11 = (d1.p) r11
            int r12 = r11.f8533f
            if (r12 != r14) goto L_0x002f
            boolean r11 = r11.k()
            if (r11 != 0) goto L_0x002f
            r15 = r6
        L_0x0046:
            if (r14 != 0) goto L_0x0068
            if (r15 == 0) goto L_0x0087
            if (r5 != r2) goto L_0x0087
            c1.f r15 = r0.f8495a
            r15.P(r3)
            c1.f r15 = r0.f8495a
            int r2 = r0.d(r15, r6)
            r15.R(r2)
            c1.f r15 = r0.f8495a
            d1.l r2 = r15.f4425d
            d1.g r2 = r2.f8532e
            int r15 = r15.u()
            r2.d(r15)
            goto L_0x0087
        L_0x0068:
            if (r15 == 0) goto L_0x0087
            if (r7 != r2) goto L_0x0087
            c1.f r15 = r0.f8495a
            r15.Q(r3)
            c1.f r15 = r0.f8495a
            int r2 = r0.d(r15, r4)
            r15.O(r2)
            c1.f r15 = r0.f8495a
            d1.n r2 = r15.f4427e
            d1.g r2 = r2.f8532e
            int r15 = r15.o()
            r2.d(r15)
        L_0x0087:
            if (r14 != 0) goto L_0x00ac
            c1.f r15 = r0.f8495a
            c1.e$a[] r2 = r15.V
            r2 = r2[r6]
            if (r2 == r3) goto L_0x0093
            if (r2 != r1) goto L_0x00b7
        L_0x0093:
            int r15 = r15.u()
            int r15 = r15 + r8
            c1.f r1 = r0.f8495a
            d1.l r1 = r1.f4425d
            d1.f r1 = r1.f8536i
            r1.d(r15)
            c1.f r1 = r0.f8495a
            d1.l r1 = r1.f4425d
            d1.g r1 = r1.f8532e
            int r15 = r15 - r8
            r1.d(r15)
            goto L_0x00d1
        L_0x00ac:
            c1.f r15 = r0.f8495a
            c1.e$a[] r2 = r15.V
            r2 = r2[r4]
            if (r2 == r3) goto L_0x00b9
            if (r2 != r1) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r15 = r6
            goto L_0x00d2
        L_0x00b9:
            int r15 = r15.o()
            int r15 = r15 + r9
            c1.f r1 = r0.f8495a
            d1.n r1 = r1.f4427e
            d1.f r1 = r1.f8536i
            r1.d(r15)
            c1.f r1 = r0.f8495a
            d1.n r1 = r1.f4427e
            d1.g r1 = r1.f8532e
            int r15 = r15 - r9
            r1.d(r15)
        L_0x00d1:
            r15 = r4
        L_0x00d2:
            r0.g()
            java.util.ArrayList<d1.p> r1 = r0.f8499e
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            d1.p r2 = (d1.p) r2
            int r3 = r2.f8533f
            if (r3 == r14) goto L_0x00ec
            goto L_0x00db
        L_0x00ec:
            c1.e r3 = r2.f8529b
            c1.f r8 = r0.f8495a
            if (r3 != r8) goto L_0x00f7
            boolean r3 = r2.f8534g
            if (r3 != 0) goto L_0x00f7
            goto L_0x00db
        L_0x00f7:
            r2.e()
            goto L_0x00db
        L_0x00fb:
            java.util.ArrayList<d1.p> r1 = r0.f8499e
            java.util.Iterator r1 = r1.iterator()
        L_0x0101:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0134
            java.lang.Object r2 = r1.next()
            d1.p r2 = (d1.p) r2
            int r3 = r2.f8533f
            if (r3 == r14) goto L_0x0112
            goto L_0x0101
        L_0x0112:
            if (r15 != 0) goto L_0x011b
            c1.e r3 = r2.f8529b
            c1.f r8 = r0.f8495a
            if (r3 != r8) goto L_0x011b
            goto L_0x0101
        L_0x011b:
            d1.f r3 = r2.f8535h
            boolean r3 = r3.f8512j
            if (r3 != 0) goto L_0x0122
            goto L_0x0133
        L_0x0122:
            d1.f r3 = r2.f8536i
            boolean r3 = r3.f8512j
            if (r3 != 0) goto L_0x0129
            goto L_0x0133
        L_0x0129:
            boolean r3 = r2 instanceof d1.c
            if (r3 != 0) goto L_0x0101
            d1.g r2 = r2.f8532e
            boolean r2 = r2.f8512j
            if (r2 != 0) goto L_0x0101
        L_0x0133:
            r4 = r6
        L_0x0134:
            c1.f r14 = r0.f8495a
            r14.P(r5)
            c1.f r14 = r0.f8495a
            r14.Q(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.f.X(int, boolean):boolean");
    }

    public final boolean Z(int i10) {
        if ((this.J0 & i10) == i10) {
            return true;
        }
        return false;
    }

    public final void r(StringBuilder sb2) {
        sb2.append(this.f4439k + ":{\n");
        sb2.append("  actualWidth:" + this.X);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<e> it = this.f4510w0.iterator();
        while (it.hasNext()) {
            it.next().r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
