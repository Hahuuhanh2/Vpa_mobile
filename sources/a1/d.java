package a1;

import java.util.Arrays;

/* compiled from: LinearSystem */
public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f28p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f29q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30a;

    /* renamed from: b  reason: collision with root package name */
    public int f31b;

    /* renamed from: c  reason: collision with root package name */
    public f f32c;

    /* renamed from: d  reason: collision with root package name */
    public int f33d;

    /* renamed from: e  reason: collision with root package name */
    public int f34e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f35f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f36g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f37h;

    /* renamed from: i  reason: collision with root package name */
    public int f38i;

    /* renamed from: j  reason: collision with root package name */
    public int f39j;

    /* renamed from: k  reason: collision with root package name */
    public int f40k;

    /* renamed from: l  reason: collision with root package name */
    public final c f41l;

    /* renamed from: m  reason: collision with root package name */
    public g[] f42m;

    /* renamed from: n  reason: collision with root package name */
    public int f43n;

    /* renamed from: o  reason: collision with root package name */
    public b f44o;

    /* compiled from: LinearSystem */
    public interface a {
        g a(boolean[] zArr);
    }

    public d() {
        this.f30a = false;
        this.f31b = 0;
        this.f33d = 32;
        this.f34e = 32;
        this.f35f = null;
        this.f36g = false;
        this.f37h = new boolean[32];
        this.f38i = 1;
        this.f39j = 0;
        this.f40k = 32;
        this.f42m = new g[f29q];
        this.f43n = 0;
        this.f35f = new b[32];
        s();
        c cVar = new c(0);
        this.f41l = cVar;
        this.f32c = new f(cVar);
        this.f44o = new b(cVar);
    }

    public static int n(c1.d dVar) {
        g gVar = dVar.f4409i;
        if (gVar != null) {
            return (int) (gVar.f58e + 0.5f);
        }
        return 0;
    }

    public final g a(int i10) {
        g gVar = (g) ((e) this.f41l.f26c).b();
        if (gVar == null) {
            gVar = new g(i10);
            gVar.f62p = i10;
        } else {
            gVar.i();
            gVar.f62p = i10;
        }
        int i11 = this.f43n;
        int i12 = f29q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f29q = i13;
            this.f42m = (g[]) Arrays.copyOf(this.f42m, i13);
        }
        g[] gVarArr = this.f42m;
        int i14 = this.f43n;
        this.f43n = i14 + 1;
        gVarArr[i14] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i10, float f10, g gVar3, g gVar4, int i11, int i12) {
        b l10 = l();
        if (gVar2 == gVar3) {
            l10.f22d.j(gVar, 1.0f);
            l10.f22d.j(gVar4, 1.0f);
            l10.f22d.j(gVar2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f22d.j(gVar, 1.0f);
            l10.f22d.j(gVar2, -1.0f);
            l10.f22d.j(gVar3, -1.0f);
            l10.f22d.j(gVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                l10.f20b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            l10.f22d.j(gVar, -1.0f);
            l10.f22d.j(gVar2, 1.0f);
            l10.f20b = (float) i10;
        } else if (f10 >= 1.0f) {
            l10.f22d.j(gVar4, -1.0f);
            l10.f22d.j(gVar3, 1.0f);
            l10.f20b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            l10.f22d.j(gVar, f11 * 1.0f);
            l10.f22d.j(gVar2, f11 * -1.0f);
            l10.f22d.j(gVar3, -1.0f * f10);
            l10.f22d.j(gVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                l10.f20b = (((float) i11) * f10) + (((float) (-i10)) * f11);
            }
        }
        if (i12 != 8) {
            l10.b(this, i12);
        }
        c(l10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r4.f65s <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r4.f65s <= 1) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e6, code lost:
        if (r4.f65s <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        if (r4.f65s <= 1) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(a1.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f39j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f40k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f38i
            int r2 = r2 + r3
            int r4 = r0.f34e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.f23e
            if (r2 != 0) goto L_0x01bc
            a1.b[] r2 = r0.f35f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            a1.b$a r6 = r1.f22d
            int r6 = r6.b()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            a1.b$a r8 = r1.f22d
            a1.g r8 = r8.c(r7)
            int r9 = r8.f56c
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f59f
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<a1.g> r9 = r1.f21c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<a1.g> r6 = r1.f21c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<a1.g> r8 = r1.f21c
            java.lang.Object r8 = r8.get(r7)
            a1.g r8 = (a1.g) r8
            boolean r9 = r8.f59f
            if (r9 == 0) goto L_0x005f
            r1.h(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            a1.b[] r9 = r0.f35f
            int r8 = r8.f56c
            r8 = r9[r8]
            r1.i(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<a1.g> r6 = r1.f21c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = r3
            goto L_0x0022
        L_0x0073:
            a1.g r2 = r1.f19a
            if (r2 == 0) goto L_0x0083
            a1.b$a r2 = r1.f22d
            int r2 = r2.b()
            if (r2 != 0) goto L_0x0083
            r1.f23e = r3
            r0.f30a = r3
        L_0x0083:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f20b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f20b = r2
            a1.b$a r2 = r1.f22d
            r2.d()
        L_0x009b:
            a1.b$a r2 = r1.f22d
            int r2 = r2.b()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a9:
            if (r8 >= r2) goto L_0x0106
            a1.b$a r15 = r1.f22d
            float r15 = r15.e(r8)
            a1.b$a r4 = r1.f22d
            a1.g r4 = r4.c(r8)
            int r5 = r4.f62p
            if (r5 != r3) goto L_0x00dc
            if (r9 != 0) goto L_0x00c2
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00cb
            goto L_0x00d8
        L_0x00c2:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cd
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00cb
            goto L_0x00d8
        L_0x00cb:
            r12 = 0
            goto L_0x00d9
        L_0x00cd:
            if (r12 != 0) goto L_0x0102
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00d5
            r5 = r3
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            if (r5 == 0) goto L_0x0102
        L_0x00d8:
            r12 = r3
        L_0x00d9:
            r9 = r4
            r11 = r15
            goto L_0x0102
        L_0x00dc:
            if (r9 != 0) goto L_0x0102
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0102
            if (r10 != 0) goto L_0x00e9
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00f2
            goto L_0x00ff
        L_0x00e9:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f4
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00f2
            goto L_0x00ff
        L_0x00f2:
            r14 = 0
            goto L_0x0100
        L_0x00f4:
            if (r14 != 0) goto L_0x0102
            int r5 = r4.f65s
            if (r5 > r3) goto L_0x00fc
            r5 = r3
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            if (r5 == 0) goto L_0x0102
        L_0x00ff:
            r14 = r3
        L_0x0100:
            r10 = r4
            r13 = r15
        L_0x0102:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a9
        L_0x0106:
            if (r9 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r9 = r10
        L_0x010a:
            if (r9 != 0) goto L_0x010e
            r2 = r3
            goto L_0x0112
        L_0x010e:
            r1.g(r9)
            r2 = 0
        L_0x0112:
            a1.b$a r4 = r1.f22d
            int r4 = r4.b()
            if (r4 != 0) goto L_0x011c
            r1.f23e = r3
        L_0x011c:
            if (r2 == 0) goto L_0x01a6
            int r2 = r0.f38i
            int r2 = r2 + r3
            int r4 = r0.f34e
            if (r2 < r4) goto L_0x0128
            r16.o()
        L_0x0128:
            r2 = 3
            a1.g r2 = r0.a(r2)
            int r4 = r0.f31b
            int r4 = r4 + r3
            r0.f31b = r4
            int r5 = r0.f38i
            int r5 = r5 + r3
            r0.f38i = r5
            r2.f55b = r4
            a1.c r5 = r0.f41l
            java.lang.Object r5 = r5.f27d
            a1.g[] r5 = (a1.g[]) r5
            r5[r4] = r2
            r1.f19a = r2
            int r4 = r0.f39j
            r16.h(r17)
            int r5 = r0.f39j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x01a6
            a1.b r4 = r0.f44o
            r4.getClass()
            r4.f19a = r7
            a1.b$a r5 = r4.f22d
            r5.clear()
            r5 = 0
        L_0x015a:
            a1.b$a r8 = r1.f22d
            int r8 = r8.b()
            if (r5 >= r8) goto L_0x0176
            a1.b$a r8 = r1.f22d
            a1.g r8 = r8.c(r5)
            a1.b$a r9 = r1.f22d
            float r9 = r9.e(r5)
            a1.b$a r10 = r4.f22d
            r10.i(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x015a
        L_0x0176:
            a1.b r4 = r0.f44o
            r0.r(r4)
            int r4 = r2.f56c
            r5 = -1
            if (r4 != r5) goto L_0x01a4
            a1.g r4 = r1.f19a
            if (r4 != r2) goto L_0x018d
            a1.g r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x018d
            r1.g(r2)
        L_0x018d:
            boolean r2 = r1.f23e
            if (r2 != 0) goto L_0x0196
            a1.g r2 = r1.f19a
            r2.k(r0, r1)
        L_0x0196:
            a1.c r2 = r0.f41l
            java.lang.Object r2 = r2.f25b
            a1.e r2 = (a1.e) r2
            r2.a(r1)
            int r2 = r0.f39j
            int r2 = r2 - r3
            r0.f39j = r2
        L_0x01a4:
            r2 = r3
            goto L_0x01a7
        L_0x01a6:
            r2 = 0
        L_0x01a7:
            a1.g r4 = r1.f19a
            if (r4 == 0) goto L_0x01b6
            int r4 = r4.f62p
            if (r4 == r3) goto L_0x01b7
            float r4 = r1.f20b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            if (r3 != 0) goto L_0x01ba
            return
        L_0x01ba:
            r4 = r2
            goto L_0x01bd
        L_0x01bc:
            r4 = 0
        L_0x01bd:
            if (r4 != 0) goto L_0x01c2
            r16.h(r17)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.d.c(a1.b):void");
    }

    public final void d(g gVar, int i10) {
        int i11 = gVar.f56c;
        if (i11 == -1) {
            gVar.j(this, (float) i10);
            for (int i12 = 0; i12 < this.f31b + 1; i12++) {
                g gVar2 = ((g[]) this.f41l.f27d)[i12];
            }
        } else if (i11 != -1) {
            b bVar = this.f35f[i11];
            if (bVar.f23e) {
                bVar.f20b = (float) i10;
            } else if (bVar.f22d.b() == 0) {
                bVar.f23e = true;
                bVar.f20b = (float) i10;
            } else {
                b l10 = l();
                if (i10 < 0) {
                    l10.f20b = (float) (i10 * -1);
                    l10.f22d.j(gVar, 1.0f);
                } else {
                    l10.f20b = (float) i10;
                    l10.f22d.j(gVar, -1.0f);
                }
                c(l10);
            }
        } else {
            b l11 = l();
            l11.f19a = gVar;
            float f10 = (float) i10;
            gVar.f58e = f10;
            l11.f20b = f10;
            l11.f23e = true;
            c(l11);
        }
    }

    public final void e(g gVar, g gVar2, int i10, int i11) {
        if (i11 == 8 && gVar2.f59f && gVar.f56c == -1) {
            gVar.j(this, gVar2.f58e + ((float) i10));
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            l10.f20b = (float) i10;
        }
        if (!z10) {
            l10.f22d.j(gVar, -1.0f);
            l10.f22d.j(gVar2, 1.0f);
        } else {
            l10.f22d.j(gVar, 1.0f);
            l10.f22d.j(gVar2, -1.0f);
        }
        if (i11 != 8) {
            l10.b(this, i11);
        }
        c(l10);
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        b l10 = l();
        g m10 = m();
        m10.f57d = 0;
        l10.c(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f22d.j(j(i11), (float) ((int) (l10.f22d.g(m10) * -1.0f)));
        }
        c(l10);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        b l10 = l();
        g m10 = m();
        m10.f57d = 0;
        l10.d(gVar, gVar2, m10, i10);
        if (i11 != 8) {
            l10.f22d.j(j(i11), (float) ((int) (l10.f22d.g(m10) * -1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f23e) {
            bVar.f19a.j(this, bVar.f20b);
        } else {
            b[] bVarArr = this.f35f;
            int i11 = this.f39j;
            bVarArr[i11] = bVar;
            g gVar = bVar.f19a;
            gVar.f56c = i11;
            this.f39j = i11 + 1;
            gVar.k(this, bVar);
        }
        if (this.f30a) {
            int i12 = 0;
            while (i12 < this.f39j) {
                if (this.f35f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f35f[i12];
                if (bVar2 != null && bVar2.f23e) {
                    bVar2.f19a.j(this, bVar2.f20b);
                    ((e) this.f41l.f25b).a(bVar2);
                    this.f35f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f39j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f35f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        g gVar2 = bVar3.f19a;
                        if (gVar2.f56c == i13) {
                            gVar2.f56c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f35f[i14] = null;
                    }
                    this.f39j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f30a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f39j; i10++) {
            b bVar = this.f35f[i10];
            bVar.f19a.f58e = bVar.f20b;
        }
    }

    public final g j(int i10) {
        if (this.f38i + 1 >= this.f34e) {
            o();
        }
        g a10 = a(4);
        int i11 = this.f31b + 1;
        this.f31b = i11;
        this.f38i++;
        a10.f55b = i11;
        a10.f57d = i10;
        ((g[]) this.f41l.f27d)[i11] = a10;
        f fVar = this.f32c;
        fVar.f51i.f52a = a10;
        Arrays.fill(a10.f61o, 0.0f);
        a10.f61o[a10.f57d] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final g k(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f38i + 1 >= this.f34e) {
            o();
        }
        if (obj instanceof c1.d) {
            c1.d dVar = (c1.d) obj;
            gVar = dVar.f4409i;
            if (gVar == null) {
                dVar.k();
                gVar = dVar.f4409i;
            }
            int i10 = gVar.f55b;
            if (i10 == -1 || i10 > this.f31b || ((g[]) this.f41l.f27d)[i10] == null) {
                if (i10 != -1) {
                    gVar.i();
                }
                int i11 = this.f31b + 1;
                this.f31b = i11;
                this.f38i++;
                gVar.f55b = i11;
                gVar.f62p = 1;
                ((g[]) this.f41l.f27d)[i11] = gVar;
            }
        }
        return gVar;
    }

    public final b l() {
        b bVar = (b) ((e) this.f41l.f25b).b();
        if (bVar == null) {
            return new b(this.f41l);
        }
        bVar.f19a = null;
        bVar.f22d.clear();
        bVar.f20b = 0.0f;
        bVar.f23e = false;
        return bVar;
    }

    public final g m() {
        if (this.f38i + 1 >= this.f34e) {
            o();
        }
        g a10 = a(3);
        int i10 = this.f31b + 1;
        this.f31b = i10;
        this.f38i++;
        a10.f55b = i10;
        ((g[]) this.f41l.f27d)[i10] = a10;
        return a10;
    }

    public final void o() {
        int i10 = this.f33d * 2;
        this.f33d = i10;
        this.f35f = (b[]) Arrays.copyOf(this.f35f, i10);
        c cVar = this.f41l;
        cVar.f27d = (g[]) Arrays.copyOf((g[]) cVar.f27d, this.f33d);
        int i11 = this.f33d;
        this.f37h = new boolean[i11];
        this.f34e = i11;
        this.f40k = i11;
    }

    public final void p() {
        if (this.f32c.e()) {
            i();
        } else if (this.f36g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f39j) {
                    z10 = true;
                    break;
                } else if (!this.f35f[i10].f23e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                q(this.f32c);
            } else {
                i();
            }
        } else {
            q(this.f32c);
        }
    }

    public final void q(f fVar) {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f39j) {
                z10 = false;
                break;
            }
            b bVar = this.f35f[i11];
            if (bVar.f19a.f62p != 1 && bVar.f20b < 0.0f) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f39j) {
                    b bVar2 = this.f35f[i15];
                    if (bVar2.f19a.f62p != i10 && !bVar2.f23e && bVar2.f20b < f10) {
                        int b10 = bVar2.f22d.b();
                        int i17 = 0;
                        while (i17 < b10) {
                            g c10 = bVar2.f22d.c(i17);
                            float g2 = bVar2.f22d.g(c10);
                            if (g2 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = c10.f60n[i18] / g2;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = c10.f55b;
                                        i16 = i18;
                                        f11 = f12;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i13 != -1) {
                    b bVar3 = this.f35f[i13];
                    bVar3.f19a.f56c = -1;
                    bVar3.g(((g[]) this.f41l.f27d)[i14]);
                    g gVar = bVar3.f19a;
                    gVar.f56c = i13;
                    gVar.k(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i12 > this.f38i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        r(fVar);
        i();
    }

    public final void r(b bVar) {
        for (int i10 = 0; i10 < this.f38i; i10++) {
            this.f37h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 < this.f38i * 2) {
                g gVar = bVar.f19a;
                if (gVar != null) {
                    this.f37h[gVar.f55b] = true;
                }
                g a10 = bVar.a(this.f37h);
                if (a10 != null) {
                    boolean[] zArr = this.f37h;
                    int i12 = a10.f55b;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (a10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f39j; i14++) {
                        b bVar2 = this.f35f[i14];
                        if (bVar2.f19a.f62p != 1 && !bVar2.f23e && bVar2.f22d.f(a10)) {
                            float g2 = bVar2.f22d.g(a10);
                            if (g2 < 0.0f) {
                                float f11 = (-bVar2.f20b) / g2;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        b bVar3 = this.f35f[i13];
                        bVar3.f19a.f56c = -1;
                        bVar3.g(a10);
                        g gVar2 = bVar3.f19a;
                        gVar2.f56c = i13;
                        gVar2.k(this, bVar3);
                    }
                } else {
                    z10 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f39j; i10++) {
            b bVar = this.f35f[i10];
            if (bVar != null) {
                ((e) this.f41l.f25b).a(bVar);
            }
            this.f35f[i10] = null;
        }
    }

    public final void t() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f41l;
            g[] gVarArr = (g[]) cVar.f27d;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.i();
            }
            i10++;
        }
        e eVar = (e) cVar.f26c;
        g[] gVarArr2 = this.f42m;
        int i11 = this.f43n;
        eVar.getClass();
        if (i11 > gVarArr2.length) {
            i11 = gVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar2 = gVarArr2[i12];
            int i13 = eVar.f47c;
            Object[] objArr = (Object[]) eVar.f46b;
            if (i13 < objArr.length) {
                objArr[i13] = gVar2;
                eVar.f47c = i13 + 1;
            }
        }
        this.f43n = 0;
        Arrays.fill((g[]) this.f41l.f27d, (Object) null);
        this.f31b = 0;
        f fVar = this.f32c;
        fVar.f50h = 0;
        fVar.f20b = 0.0f;
        this.f38i = 1;
        for (int i14 = 0; i14 < this.f39j; i14++) {
            b bVar = this.f35f[i14];
        }
        s();
        this.f39j = 0;
        this.f44o = new b(this.f41l);
    }
}
