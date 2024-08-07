package c1;

import a1.d;
import c1.e;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow */
public final class g extends m {
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public int V0 = 0;
    public int W0 = 0;
    public int X0 = 2;
    public int Y0 = 2;
    public int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    public int f4475a1 = -1;

    /* renamed from: b1  reason: collision with root package name */
    public int f4476b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    public ArrayList<a> f4477c1 = new ArrayList<>();

    /* renamed from: d1  reason: collision with root package name */
    public e[] f4478d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public e[] f4479e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public int[] f4480f1 = null;

    /* renamed from: g1  reason: collision with root package name */
    public e[] f4481g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f4482h1 = 0;

    /* compiled from: Flow */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4483a;

        /* renamed from: b  reason: collision with root package name */
        public e f4484b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f4485c = 0;

        /* renamed from: d  reason: collision with root package name */
        public d f4486d;

        /* renamed from: e  reason: collision with root package name */
        public d f4487e;

        /* renamed from: f  reason: collision with root package name */
        public d f4488f;

        /* renamed from: g  reason: collision with root package name */
        public d f4489g;

        /* renamed from: h  reason: collision with root package name */
        public int f4490h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f4491i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f4492j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f4493k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f4494l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f4495m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f4496n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f4497o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f4498p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f4499q = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f4483a = i10;
            this.f4486d = dVar;
            this.f4487e = dVar2;
            this.f4488f = dVar3;
            this.f4489g = dVar4;
            this.f4490h = g.this.C0;
            this.f4491i = g.this.f4508y0;
            this.f4492j = g.this.D0;
            this.f4493k = g.this.f4509z0;
            this.f4499q = i11;
        }

        public final void a(e eVar) {
            e.a aVar = e.a.MATCH_CONSTRAINT;
            int i10 = 0;
            if (this.f4483a == 0) {
                int Y = g.this.Y(this.f4499q, eVar);
                if (eVar.V[0] == aVar) {
                    this.f4498p++;
                    Y = 0;
                }
                g gVar = g.this;
                int i11 = gVar.V0;
                if (eVar.f4438j0 != 8) {
                    i10 = i11;
                }
                this.f4494l = Y + i10 + this.f4494l;
                int X = gVar.X(this.f4499q, eVar);
                if (this.f4484b == null || this.f4485c < X) {
                    this.f4484b = eVar;
                    this.f4485c = X;
                    this.f4495m = X;
                }
            } else {
                int Y2 = g.this.Y(this.f4499q, eVar);
                int X2 = g.this.X(this.f4499q, eVar);
                if (eVar.V[1] == aVar) {
                    this.f4498p++;
                    X2 = 0;
                }
                int i12 = g.this.W0;
                if (eVar.f4438j0 != 8) {
                    i10 = i12;
                }
                this.f4495m = X2 + i10 + this.f4495m;
                if (this.f4484b == null || this.f4485c < Y2) {
                    this.f4484b = eVar;
                    this.f4485c = Y2;
                    this.f4494l = Y2;
                }
            }
            this.f4497o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r17, boolean r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f4497o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x001e
                int r4 = r0.f4496n
                int r4 = r4 + r3
                c1.g r5 = c1.g.this
                int r6 = r5.f4482h1
                if (r4 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                c1.e[] r5 = r5.f4481g1
                r4 = r5[r4]
                if (r4 == 0) goto L_0x001b
                r4.H()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x030d
                c1.e r3 = r0.f4484b
                if (r3 != 0) goto L_0x0026
                goto L_0x030d
            L_0x0026:
                if (r19 == 0) goto L_0x002c
                if (r17 != 0) goto L_0x002c
                r4 = 1
                goto L_0x002d
            L_0x002c:
                r4 = r2
            L_0x002d:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x0031:
                if (r6 >= r1) goto L_0x0055
                if (r18 == 0) goto L_0x0039
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x003a
            L_0x0039:
                r9 = r6
            L_0x003a:
                int r10 = r0.f4496n
                int r10 = r10 + r9
                c1.g r9 = c1.g.this
                int r11 = r9.f4482h1
                if (r10 < r11) goto L_0x0044
                goto L_0x0055
            L_0x0044:
                c1.e[] r9 = r9.f4481g1
                r9 = r9[r10]
                if (r9 == 0) goto L_0x0052
                int r9 = r9.f4438j0
                if (r9 != 0) goto L_0x0052
                if (r7 != r5) goto L_0x0051
                r7 = r6
            L_0x0051:
                r8 = r6
            L_0x0052:
                int r6 = r6 + 1
                goto L_0x0031
            L_0x0055:
                int r6 = r0.f4483a
                r9 = 0
                if (r6 != 0) goto L_0x01b6
                c1.e r6 = r0.f4484b
                c1.g r10 = c1.g.this
                int r11 = r10.K0
                r6.f4448o0 = r11
                int r11 = r0.f4491i
                if (r17 <= 0) goto L_0x0069
                int r10 = r10.W0
                int r11 = r11 + r10
            L_0x0069:
                c1.d r10 = r6.L
                c1.d r12 = r0.f4487e
                r10.a(r12, r11)
                if (r19 == 0) goto L_0x007b
                c1.d r10 = r6.N
                c1.d r11 = r0.f4489g
                int r12 = r0.f4493k
                r10.a(r11, r12)
            L_0x007b:
                if (r17 <= 0) goto L_0x0088
                c1.d r10 = r0.f4487e
                c1.e r10 = r10.f4404d
                c1.d r10 = r10.N
                c1.d r11 = r6.L
                r10.a(r11, r2)
            L_0x0088:
                c1.g r10 = c1.g.this
                int r10 = r10.Y0
                r11 = 3
                if (r10 != r11) goto L_0x00b3
                boolean r10 = r6.F
                if (r10 != 0) goto L_0x00b3
                r10 = r2
            L_0x0094:
                if (r10 >= r1) goto L_0x00b3
                if (r18 == 0) goto L_0x009c
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009d
            L_0x009c:
                r12 = r10
            L_0x009d:
                int r13 = r0.f4496n
                int r13 = r13 + r12
                c1.g r12 = c1.g.this
                int r14 = r12.f4482h1
                if (r13 < r14) goto L_0x00a7
                goto L_0x00b3
            L_0x00a7:
                c1.e[] r12 = r12.f4481g1
                r12 = r12[r13]
                boolean r13 = r12.F
                if (r13 == 0) goto L_0x00b0
                goto L_0x00b4
            L_0x00b0:
                int r10 = r10 + 1
                goto L_0x0094
            L_0x00b3:
                r12 = r6
            L_0x00b4:
                r10 = r2
            L_0x00b5:
                if (r10 >= r1) goto L_0x030d
                if (r18 == 0) goto L_0x00bd
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00be
            L_0x00bd:
                r13 = r10
            L_0x00be:
                int r14 = r0.f4496n
                int r14 = r14 + r13
                c1.g r15 = c1.g.this
                int r11 = r15.f4482h1
                if (r14 < r11) goto L_0x00c9
                goto L_0x030d
            L_0x00c9:
                c1.e[] r11 = r15.f4481g1
                r11 = r11[r14]
                if (r11 != 0) goto L_0x00d2
                r3 = 3
                goto L_0x01b0
            L_0x00d2:
                if (r10 != 0) goto L_0x00dd
                c1.d r14 = r11.K
                c1.d r15 = r0.f4486d
                int r3 = r0.f4490h
                r11.i(r14, r15, r3)
            L_0x00dd:
                if (r13 != 0) goto L_0x0114
                c1.g r3 = c1.g.this
                int r13 = r3.J0
                r14 = 1065353216(0x3f800000, float:1.0)
                if (r18 == 0) goto L_0x00ec
                float r15 = r3.P0
                float r15 = r14 - r15
                goto L_0x00ee
            L_0x00ec:
                float r15 = r3.P0
            L_0x00ee:
                int r2 = r0.f4496n
                if (r2 != 0) goto L_0x00fe
                int r2 = r3.L0
                if (r2 == r5) goto L_0x00fe
                if (r18 == 0) goto L_0x00fb
                float r3 = r3.R0
                goto L_0x0108
            L_0x00fb:
                float r3 = r3.R0
                goto L_0x010e
            L_0x00fe:
                if (r19 == 0) goto L_0x0110
                int r2 = r3.N0
                if (r2 == r5) goto L_0x0110
                if (r18 == 0) goto L_0x010c
                float r3 = r3.T0
            L_0x0108:
                float r14 = r14 - r3
                r13 = r2
                r15 = r14
                goto L_0x0110
            L_0x010c:
                float r3 = r3.T0
            L_0x010e:
                r13 = r2
                r15 = r3
            L_0x0110:
                r11.f4446n0 = r13
                r11.f4432g0 = r15
            L_0x0114:
                int r2 = r1 + -1
                if (r10 != r2) goto L_0x0121
                c1.d r2 = r11.M
                c1.d r3 = r0.f4488f
                int r13 = r0.f4492j
                r11.i(r2, r3, r13)
            L_0x0121:
                if (r9 == 0) goto L_0x0155
                c1.d r2 = r11.K
                c1.d r3 = r9.M
                c1.g r13 = c1.g.this
                int r13 = r13.V0
                r2.a(r3, r13)
                if (r10 != r7) goto L_0x013c
                c1.d r2 = r11.K
                int r3 = r0.f4490h
                boolean r13 = r2.h()
                if (r13 == 0) goto L_0x013c
                r2.f4408h = r3
            L_0x013c:
                c1.d r2 = r9.M
                c1.d r3 = r11.K
                r13 = 0
                r2.a(r3, r13)
                r2 = 1
                int r3 = r8 + 1
                if (r10 != r3) goto L_0x0155
                c1.d r2 = r9.M
                int r3 = r0.f4492j
                boolean r9 = r2.h()
                if (r9 == 0) goto L_0x0155
                r2.f4408h = r3
            L_0x0155:
                if (r11 == r6) goto L_0x01ae
                c1.g r2 = c1.g.this
                int r2 = r2.Y0
                r3 = 3
                if (r2 != r3) goto L_0x0171
                boolean r9 = r12.F
                if (r9 == 0) goto L_0x0171
                if (r11 == r12) goto L_0x0171
                boolean r9 = r11.F
                if (r9 == 0) goto L_0x0171
                c1.d r2 = r11.O
                c1.d r9 = r12.O
                r13 = 0
                r2.a(r9, r13)
                goto L_0x01ac
            L_0x0171:
                if (r2 == 0) goto L_0x01a4
                r9 = 1
                if (r2 == r9) goto L_0x019b
                if (r4 == 0) goto L_0x018b
                c1.d r2 = r11.L
                c1.d r9 = r0.f4487e
                int r13 = r0.f4491i
                r2.a(r9, r13)
                c1.d r2 = r11.N
                c1.d r9 = r0.f4489g
                int r13 = r0.f4493k
                r2.a(r9, r13)
                goto L_0x01ac
            L_0x018b:
                c1.d r2 = r11.L
                c1.d r9 = r6.L
                r13 = 0
                r2.a(r9, r13)
                c1.d r2 = r11.N
                c1.d r9 = r6.N
                r2.a(r9, r13)
                goto L_0x01ac
            L_0x019b:
                r13 = 0
                c1.d r2 = r11.N
                c1.d r9 = r6.N
                r2.a(r9, r13)
                goto L_0x01ac
            L_0x01a4:
                r13 = 0
                c1.d r2 = r11.L
                c1.d r9 = r6.L
                r2.a(r9, r13)
            L_0x01ac:
                r9 = r11
                goto L_0x01b0
            L_0x01ae:
                r3 = 3
                goto L_0x01ac
            L_0x01b0:
                int r10 = r10 + 1
                r11 = r3
                r2 = 0
                goto L_0x00b5
            L_0x01b6:
                c1.e r2 = r0.f4484b
                c1.g r3 = c1.g.this
                int r6 = r3.J0
                r2.f4446n0 = r6
                int r6 = r0.f4490h
                if (r17 <= 0) goto L_0x01c5
                int r3 = r3.V0
                int r6 = r6 + r3
            L_0x01c5:
                if (r18 == 0) goto L_0x01e8
                c1.d r3 = r2.M
                c1.d r10 = r0.f4488f
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01d9
                c1.d r3 = r2.K
                c1.d r6 = r0.f4486d
                int r10 = r0.f4492j
                r3.a(r6, r10)
            L_0x01d9:
                if (r17 <= 0) goto L_0x0208
                c1.d r3 = r0.f4488f
                c1.e r3 = r3.f4404d
                c1.d r3 = r3.K
                c1.d r6 = r2.M
                r10 = 0
                r3.a(r6, r10)
                goto L_0x0208
            L_0x01e8:
                c1.d r3 = r2.K
                c1.d r10 = r0.f4486d
                r3.a(r10, r6)
                if (r19 == 0) goto L_0x01fa
                c1.d r3 = r2.M
                c1.d r6 = r0.f4488f
                int r10 = r0.f4492j
                r3.a(r6, r10)
            L_0x01fa:
                if (r17 <= 0) goto L_0x0208
                c1.d r3 = r0.f4486d
                c1.e r3 = r3.f4404d
                c1.d r3 = r3.M
                c1.d r6 = r2.K
                r10 = 0
                r3.a(r6, r10)
            L_0x0208:
                r13 = 0
            L_0x0209:
                if (r13 >= r1) goto L_0x030d
                int r3 = r0.f4496n
                int r3 = r3 + r13
                c1.g r6 = c1.g.this
                int r10 = r6.f4482h1
                if (r3 < r10) goto L_0x0216
                goto L_0x030d
            L_0x0216:
                c1.e[] r6 = r6.f4481g1
                r3 = r6[r3]
                if (r3 != 0) goto L_0x0220
                r10 = 1
                r11 = 0
                goto L_0x0309
            L_0x0220:
                if (r13 != 0) goto L_0x024b
                c1.d r6 = r3.L
                c1.d r10 = r0.f4487e
                int r11 = r0.f4491i
                r3.i(r6, r10, r11)
                c1.g r6 = c1.g.this
                int r10 = r6.K0
                float r11 = r6.Q0
                int r12 = r0.f4496n
                if (r12 != 0) goto L_0x023e
                int r12 = r6.M0
                if (r12 == r5) goto L_0x023e
                float r6 = r6.S0
            L_0x023b:
                r11 = r6
                r10 = r12
                goto L_0x0247
            L_0x023e:
                if (r19 == 0) goto L_0x0247
                int r12 = r6.O0
                if (r12 == r5) goto L_0x0247
                float r6 = r6.U0
                goto L_0x023b
            L_0x0247:
                r3.f4448o0 = r10
                r3.f4434h0 = r11
            L_0x024b:
                int r6 = r1 + -1
                if (r13 != r6) goto L_0x0258
                c1.d r6 = r3.N
                c1.d r10 = r0.f4489g
                int r11 = r0.f4493k
                r3.i(r6, r10, r11)
            L_0x0258:
                if (r9 == 0) goto L_0x028c
                c1.d r6 = r3.L
                c1.d r10 = r9.N
                c1.g r11 = c1.g.this
                int r11 = r11.W0
                r6.a(r10, r11)
                if (r13 != r7) goto L_0x0273
                c1.d r6 = r3.L
                int r10 = r0.f4491i
                boolean r11 = r6.h()
                if (r11 == 0) goto L_0x0273
                r6.f4408h = r10
            L_0x0273:
                c1.d r6 = r9.N
                c1.d r10 = r3.L
                r11 = 0
                r6.a(r10, r11)
                r6 = 1
                int r10 = r8 + 1
                if (r13 != r10) goto L_0x028c
                c1.d r6 = r9.N
                int r9 = r0.f4493k
                boolean r10 = r6.h()
                if (r10 == 0) goto L_0x028c
                r6.f4408h = r9
            L_0x028c:
                if (r3 == r2) goto L_0x0306
                r6 = 2
                if (r18 == 0) goto L_0x02c2
                c1.g r9 = c1.g.this
                int r9 = r9.X0
                if (r9 == 0) goto L_0x02b7
                r10 = 1
                if (r9 == r10) goto L_0x02ae
                if (r9 == r6) goto L_0x029e
                goto L_0x0306
            L_0x029e:
                c1.d r6 = r3.K
                c1.d r9 = r2.K
                r10 = 0
                r6.a(r9, r10)
                c1.d r6 = r3.M
                c1.d r9 = r2.M
                r6.a(r9, r10)
                goto L_0x02bf
            L_0x02ae:
                r10 = 0
                c1.d r6 = r3.K
                c1.d r9 = r2.K
                r6.a(r9, r10)
                goto L_0x02bf
            L_0x02b7:
                r10 = 0
                c1.d r6 = r3.M
                c1.d r9 = r2.M
                r6.a(r9, r10)
            L_0x02bf:
                r11 = r10
                r10 = 1
                goto L_0x0308
            L_0x02c2:
                c1.g r9 = c1.g.this
                int r9 = r9.X0
                if (r9 == 0) goto L_0x02fc
                r10 = 1
                if (r9 == r10) goto L_0x02f3
                if (r9 == r6) goto L_0x02ce
                goto L_0x0307
            L_0x02ce:
                if (r4 == 0) goto L_0x02e3
                c1.d r6 = r3.K
                c1.d r9 = r0.f4486d
                int r11 = r0.f4490h
                r6.a(r9, r11)
                c1.d r6 = r3.M
                c1.d r9 = r0.f4488f
                int r11 = r0.f4492j
                r6.a(r9, r11)
                goto L_0x0307
            L_0x02e3:
                c1.d r6 = r3.K
                c1.d r9 = r2.K
                r11 = 0
                r6.a(r9, r11)
                c1.d r6 = r3.M
                c1.d r9 = r2.M
                r6.a(r9, r11)
                goto L_0x0308
            L_0x02f3:
                r11 = 0
                c1.d r6 = r3.M
                c1.d r9 = r2.M
                r6.a(r9, r11)
                goto L_0x0308
            L_0x02fc:
                r10 = 1
                r11 = 0
                c1.d r6 = r3.K
                c1.d r9 = r2.K
                r6.a(r9, r11)
                goto L_0x0308
            L_0x0306:
                r10 = 1
            L_0x0307:
                r11 = 0
            L_0x0308:
                r9 = r3
            L_0x0309:
                int r13 = r13 + 1
                goto L_0x0209
            L_0x030d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c1.g.a.b(int, boolean, boolean):void");
        }

        public final int c() {
            if (this.f4483a == 1) {
                return this.f4495m - g.this.W0;
            }
            return this.f4495m;
        }

        public final int d() {
            if (this.f4483a == 0) {
                return this.f4494l - g.this.V0;
            }
            return this.f4494l;
        }

        public final void e(int i10) {
            e.a aVar = e.a.FIXED;
            e.a aVar2 = e.a.MATCH_CONSTRAINT;
            int i11 = this.f4498p;
            if (i11 != 0) {
                int i12 = this.f4497o;
                int i13 = i10 / i11;
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = this.f4496n;
                    int i16 = i15 + i14;
                    g gVar = g.this;
                    if (i16 >= gVar.f4482h1) {
                        break;
                    }
                    e eVar = gVar.f4481g1[i15 + i14];
                    if (this.f4483a == 0) {
                        if (eVar != null) {
                            e.a[] aVarArr = eVar.V;
                            if (aVarArr[0] == aVar2 && eVar.f4455s == 0) {
                                gVar.W(eVar, aVar, i13, aVarArr[1], eVar.o());
                            }
                        }
                    } else if (eVar != null) {
                        e.a[] aVarArr2 = eVar.V;
                        if (aVarArr2[1] == aVar2 && eVar.f4457t == 0) {
                            gVar.W(eVar, aVarArr2[0], eVar.u(), aVar, i13);
                        }
                    }
                }
                this.f4494l = 0;
                this.f4495m = 0;
                this.f4484b = null;
                this.f4485c = 0;
                int i17 = this.f4497o;
                int i18 = 0;
                while (i18 < i17) {
                    int i19 = this.f4496n + i18;
                    g gVar2 = g.this;
                    if (i19 < gVar2.f4482h1) {
                        e eVar2 = gVar2.f4481g1[i19];
                        if (this.f4483a == 0) {
                            int u10 = eVar2.u();
                            g gVar3 = g.this;
                            int i20 = gVar3.V0;
                            if (eVar2.f4438j0 == 8) {
                                i20 = 0;
                            }
                            this.f4494l = u10 + i20 + this.f4494l;
                            int X = gVar3.X(this.f4499q, eVar2);
                            if (this.f4484b == null || this.f4485c < X) {
                                this.f4484b = eVar2;
                                this.f4485c = X;
                                this.f4495m = X;
                            }
                        } else {
                            int Y = gVar2.Y(this.f4499q, eVar2);
                            int X2 = g.this.X(this.f4499q, eVar2);
                            int i21 = g.this.W0;
                            if (eVar2.f4438j0 == 8) {
                                i21 = 0;
                            }
                            this.f4495m = X2 + i21 + this.f4495m;
                            if (this.f4484b == null || this.f4485c < Y) {
                                this.f4484b = eVar2;
                                this.f4485c = Y;
                                this.f4494l = Y;
                            }
                        }
                        i18++;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void f(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f4483a = i10;
            this.f4486d = dVar;
            this.f4487e = dVar2;
            this.f4488f = dVar3;
            this.f4489g = dVar4;
            this.f4490h = i11;
            this.f4491i = i12;
            this.f4492j = i13;
            this.f4493k = i14;
            this.f4499q = i15;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v19, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v22, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r32v5 */
    /* JADX WARNING: type inference failed for: r1v108 */
    /* JADX WARNING: type inference failed for: r4v54 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0526 A[SYNTHETIC] */
    public final void V(int r36, int r37, int r38, int r39) {
        /*
            r35 = this;
            r8 = r35
            c1.e$a r9 = c1.e.a.MATCH_CONSTRAINT
            c1.e$a r10 = c1.e.a.WRAP_CONTENT
            int r0 = r8.f4506x0
            r11 = 1
            r12 = 0
            if (r0 <= 0) goto L_0x0090
            c1.e r0 = r8.W
            if (r0 == 0) goto L_0x0015
            c1.f r0 = (c1.f) r0
            d1.b$b r0 = r0.A0
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001b
            r0 = r12
            goto L_0x0087
        L_0x001b:
            r2 = r12
        L_0x001c:
            int r3 = r8.f4506x0
            if (r2 >= r3) goto L_0x0086
            c1.e[] r3 = r8.f4505w0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0027
            goto L_0x0083
        L_0x0027:
            boolean r4 = r3 instanceof c1.h
            if (r4 == 0) goto L_0x002c
            goto L_0x0083
        L_0x002c:
            c1.e$a r4 = r3.n(r12)
            c1.e$a r5 = r3.n(r11)
            if (r4 != r9) goto L_0x0042
            int r6 = r3.f4455s
            if (r6 == r11) goto L_0x0042
            if (r5 != r9) goto L_0x0042
            int r6 = r3.f4457t
            if (r6 == r11) goto L_0x0042
            r6 = r11
            goto L_0x0043
        L_0x0042:
            r6 = r12
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            if (r4 != r9) goto L_0x0049
            r4 = r10
        L_0x0049:
            if (r5 != r9) goto L_0x004c
            r5 = r10
        L_0x004c:
            d1.b$a r6 = r8.H0
            r6.f8483a = r4
            r6.f8484b = r5
            int r4 = r3.u()
            r6.f8485c = r4
            d1.b$a r4 = r8.H0
            int r5 = r3.o()
            r4.f8486d = r5
            d1.b$a r4 = r8.H0
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$a r5 = (androidx.constraintlayout.widget.ConstraintLayout.a) r5
            r5.b(r3, r4)
            d1.b$a r4 = r8.H0
            int r4 = r4.f8487e
            r3.R(r4)
            d1.b$a r4 = r8.H0
            int r4 = r4.f8488f
            r3.O(r4)
            d1.b$a r4 = r8.H0
            int r4 = r4.f8489g
            r3.f4426d0 = r4
            if (r4 <= 0) goto L_0x0080
            r4 = r11
            goto L_0x0081
        L_0x0080:
            r4 = r12
        L_0x0081:
            r3.F = r4
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0086:
            r0 = r11
        L_0x0087:
            if (r0 != 0) goto L_0x0090
            r8.F0 = r12
            r8.G0 = r12
            r8.E0 = r12
            return
        L_0x0090:
            int r13 = r8.C0
            int r14 = r8.D0
            int r15 = r8.f4508y0
            int r7 = r8.f4509z0
            r0 = 2
            int[] r6 = new int[r0]
            int r2 = r37 - r13
            int r2 = r2 - r14
            int r3 = r8.f4476b1
            if (r3 != r11) goto L_0x00a5
            int r2 = r39 - r15
            int r2 = r2 - r7
        L_0x00a5:
            r5 = r2
            r2 = -1
            if (r3 != 0) goto L_0x00b6
            int r3 = r8.J0
            if (r3 != r2) goto L_0x00af
            r8.J0 = r12
        L_0x00af:
            int r3 = r8.K0
            if (r3 != r2) goto L_0x00c2
            r8.K0 = r12
            goto L_0x00c2
        L_0x00b6:
            int r3 = r8.J0
            if (r3 != r2) goto L_0x00bc
            r8.J0 = r12
        L_0x00bc:
            int r3 = r8.K0
            if (r3 != r2) goto L_0x00c2
            r8.K0 = r12
        L_0x00c2:
            c1.e[] r2 = r8.f4505w0
            r3 = r12
            r4 = r3
        L_0x00c6:
            int r1 = r8.f4506x0
            r12 = 8
            if (r3 >= r1) goto L_0x00da
            c1.e[] r1 = r8.f4505w0
            r1 = r1[r3]
            int r1 = r1.f4438j0
            if (r1 != r12) goto L_0x00d6
            int r4 = r4 + 1
        L_0x00d6:
            int r3 = r3 + 1
            r12 = 0
            goto L_0x00c6
        L_0x00da:
            if (r4 <= 0) goto L_0x00f5
            int r1 = r1 - r4
            c1.e[] r2 = new c1.e[r1]
            r1 = 0
            r3 = 0
        L_0x00e1:
            int r4 = r8.f4506x0
            if (r3 >= r4) goto L_0x00f5
            c1.e[] r4 = r8.f4505w0
            r4 = r4[r3]
            int r0 = r4.f4438j0
            if (r0 == r12) goto L_0x00f1
            r2[r1] = r4
            int r1 = r1 + 1
        L_0x00f1:
            int r3 = r3 + 1
            r0 = 2
            goto L_0x00e1
        L_0x00f5:
            r12 = r1
            r4 = r2
            r8.f4481g1 = r4
            r8.f4482h1 = r12
            int r0 = r8.Z0
            if (r0 == 0) goto L_0x0757
            if (r0 == r11) goto L_0x053e
            r1 = 2
            if (r0 == r1) goto L_0x037b
            r1 = 3
            if (r0 == r1) goto L_0x0114
            r0 = r36
            r2 = r37
            r3 = r38
            r5 = r39
            r9 = r8
            r1 = r11
            r4 = 0
            goto L_0x0812
        L_0x0114:
            int r3 = r8.f4476b1
            if (r12 != 0) goto L_0x0124
            r32 = r6
            r31 = r7
            r27 = r13
            r30 = r14
            r33 = r15
            goto L_0x0768
        L_0x0124:
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.clear()
            c1.g$a r2 = new c1.g$a
            c1.d r1 = r8.K
            c1.d r0 = r8.L
            c1.d r11 = r8.M
            r18 = r6
            c1.d r6 = r8.N
            r16 = r0
            r0 = r2
            r17 = r1
            r1 = r35
            r27 = r13
            r13 = r2
            r2 = r3
            r28 = r3
            r3 = r17
            r29 = r4
            r4 = r16
            r30 = r5
            r5 = r11
            r11 = r18
            r31 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r13)
            if (r28 != 0) goto L_0x01f7
            r2 = r13
            r0 = 0
            r1 = 0
            r3 = 0
            r13 = 0
        L_0x0160:
            if (r13 >= r12) goto L_0x01ed
            r4 = 1
            int r7 = r0 + 1
            r6 = r29[r13]
            r5 = r30
            int r16 = r8.Y(r5, r6)
            c1.e$a[] r0 = r6.V
            r4 = 0
            r0 = r0[r4]
            if (r0 != r9) goto L_0x0176
            int r1 = r1 + 1
        L_0x0176:
            r17 = r1
            if (r3 == r5) goto L_0x0181
            int r0 = r8.V0
            int r0 = r0 + r3
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x0187
        L_0x0181:
            c1.e r0 = r2.f4484b
            if (r0 == 0) goto L_0x0187
            r0 = 1
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            if (r0 != 0) goto L_0x0193
            if (r13 <= 0) goto L_0x0193
            int r1 = r8.f4475a1
            if (r1 <= 0) goto L_0x0193
            if (r7 <= r1) goto L_0x0193
            r0 = 1
        L_0x0193:
            if (r0 == 0) goto L_0x01cc
            c1.g$a r4 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r2 = r8.L
            c1.d r1 = r8.M
            c1.d r0 = r8.N
            r18 = r0
            r0 = r4
            r19 = r1
            r1 = r35
            r20 = r2
            r2 = r28
            r30 = r14
            r14 = r4
            r4 = r20
            r32 = r5
            r5 = r19
            r33 = r15
            r15 = r6
            r6 = r18
            r18 = r7
            r7 = r32
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r14.f4496n = r13
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r14)
            r2 = r14
            r3 = r16
            r0 = r18
            goto L_0x01de
        L_0x01cc:
            r32 = r5
            r30 = r14
            r33 = r15
            r15 = r6
            if (r13 <= 0) goto L_0x01db
            int r0 = r8.V0
            int r0 = r0 + r16
            int r16 = r0 + r3
        L_0x01db:
            r3 = r16
            r0 = 0
        L_0x01de:
            r2.a(r15)
            int r13 = r13 + 1
            r1 = r17
            r14 = r30
            r30 = r32
            r15 = r33
            goto L_0x0160
        L_0x01ed:
            r33 = r15
            r32 = r30
            r30 = r14
            r15 = r32
            goto L_0x026e
        L_0x01f7:
            r33 = r15
            r32 = r30
            r30 = r14
            r2 = r13
            r0 = 0
            r1 = 0
            r13 = 0
        L_0x0201:
            if (r13 >= r12) goto L_0x026b
            r14 = r29[r13]
            r15 = r32
            int r16 = r8.X(r15, r14)
            c1.e$a[] r3 = r14.V
            r4 = 1
            r3 = r3[r4]
            if (r3 != r9) goto L_0x0214
            int r0 = r0 + 1
        L_0x0214:
            r17 = r0
            if (r1 == r15) goto L_0x021f
            int r0 = r8.W0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r15) goto L_0x0225
        L_0x021f:
            c1.e r0 = r2.f4484b
            if (r0 == 0) goto L_0x0225
            r0 = 1
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            if (r0 != 0) goto L_0x0231
            if (r13 <= 0) goto L_0x0231
            int r3 = r8.f4475a1
            if (r3 <= 0) goto L_0x0231
            if (r3 >= 0) goto L_0x0231
            r0 = 1
        L_0x0231:
            if (r0 == 0) goto L_0x0252
            c1.g$a r7 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r4 = r8.L
            c1.d r5 = r8.M
            c1.d r6 = r8.N
            r0 = r7
            r1 = r35
            r2 = r28
            r18 = r9
            r9 = r7
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.f4496n = r13
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r9)
            r2 = r9
            goto L_0x025d
        L_0x0252:
            r18 = r9
            if (r13 <= 0) goto L_0x025d
            int r0 = r8.W0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x025f
        L_0x025d:
            r1 = r16
        L_0x025f:
            r2.a(r14)
            int r13 = r13 + 1
            r32 = r15
            r0 = r17
            r9 = r18
            goto L_0x0201
        L_0x026b:
            r15 = r32
            r1 = r0
        L_0x026e:
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            int r0 = r0.size()
            c1.d r2 = r8.K
            c1.d r3 = r8.L
            c1.d r4 = r8.M
            c1.d r5 = r8.N
            int r6 = r8.C0
            int r7 = r8.f4508y0
            int r9 = r8.D0
            int r12 = r8.f4509z0
            c1.e$a[] r13 = r8.V
            r16 = r2
            r14 = 0
            r2 = r13[r14]
            if (r2 == r10) goto L_0x0295
            r2 = 1
            r13 = r13[r2]
            if (r13 != r10) goto L_0x0293
            goto L_0x0295
        L_0x0293:
            r2 = 0
            goto L_0x0296
        L_0x0295:
            r2 = 1
        L_0x0296:
            if (r1 <= 0) goto L_0x02bd
            if (r2 == 0) goto L_0x02bd
            r1 = 0
        L_0x029b:
            if (r1 >= r0) goto L_0x02bd
            java.util.ArrayList<c1.g$a> r2 = r8.f4477c1
            java.lang.Object r2 = r2.get(r1)
            c1.g$a r2 = (c1.g.a) r2
            if (r28 != 0) goto L_0x02b1
            int r10 = r2.d()
            int r10 = r15 - r10
            r2.e(r10)
            goto L_0x02ba
        L_0x02b1:
            int r10 = r2.c()
            int r10 = r15 - r10
            r2.e(r10)
        L_0x02ba:
            int r1 = r1 + 1
            goto L_0x029b
        L_0x02bd:
            r1 = r16
            r2 = 0
            r10 = 0
            r13 = 0
        L_0x02c2:
            if (r2 >= r0) goto L_0x0371
            java.util.ArrayList<c1.g$a> r14 = r8.f4477c1
            java.lang.Object r14 = r14.get(r2)
            c1.g$a r14 = (c1.g.a) r14
            if (r28 != 0) goto L_0x031e
            int r5 = r0 + -1
            if (r2 >= r5) goto L_0x02e4
            java.util.ArrayList<c1.g$a> r5 = r8.f4477c1
            int r12 = r2 + 1
            java.lang.Object r5 = r5.get(r12)
            c1.g$a r5 = (c1.g.a) r5
            c1.e r5 = r5.f4484b
            c1.d r5 = r5.L
            r32 = r11
            r12 = 0
            goto L_0x02ea
        L_0x02e4:
            c1.d r5 = r8.N
            int r12 = r8.f4509z0
            r32 = r11
        L_0x02ea:
            c1.e r11 = r14.f4484b
            c1.d r11 = r11.N
            r16 = r14
            r17 = r28
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r12
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r14.d()
            int r3 = java.lang.Math.max(r10, r3)
            int r7 = r14.c()
            int r7 = r7 + r13
            if (r2 <= 0) goto L_0x0319
            int r10 = r8.W0
            int r7 = r7 + r10
        L_0x0319:
            r10 = r3
            r13 = r7
            r3 = r11
            r7 = 0
            goto L_0x036b
        L_0x031e:
            r32 = r11
            int r4 = r0 + -1
            if (r2 >= r4) goto L_0x0334
            java.util.ArrayList<c1.g$a> r4 = r8.f4477c1
            int r9 = r2 + 1
            java.lang.Object r4 = r4.get(r9)
            c1.g$a r4 = (c1.g.a) r4
            c1.e r4 = r4.f4484b
            c1.d r4 = r4.K
            r9 = 0
            goto L_0x0338
        L_0x0334:
            c1.d r4 = r8.M
            int r9 = r8.D0
        L_0x0338:
            c1.e r11 = r14.f4484b
            c1.d r11 = r11.M
            r16 = r14
            r17 = r28
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r12
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r1 = r14.d()
            int r1 = r1 + r10
            int r6 = r14.c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r2 <= 0) goto L_0x0367
            int r10 = r8.V0
            int r1 = r1 + r10
        L_0x0367:
            r10 = r1
            r13 = r6
            r1 = r11
            r6 = 0
        L_0x036b:
            int r2 = r2 + 1
            r11 = r32
            goto L_0x02c2
        L_0x0371:
            r32 = r11
            r1 = 0
            r32[r1] = r10
            r0 = 1
            r32[r0] = r13
            goto L_0x0768
        L_0x037b:
            r29 = r4
            r32 = r6
            r31 = r7
            r27 = r13
            r30 = r14
            r33 = r15
            r15 = r5
            int r0 = r8.f4476b1
            if (r0 != 0) goto L_0x03b1
            int r1 = r8.f4475a1
            if (r1 > 0) goto L_0x03ae
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0393:
            if (r1 >= r12) goto L_0x03ad
            if (r1 <= 0) goto L_0x039a
            int r4 = r8.V0
            int r2 = r2 + r4
        L_0x039a:
            r4 = r29[r1]
            if (r4 != 0) goto L_0x039f
            goto L_0x03aa
        L_0x039f:
            int r4 = r8.Y(r15, r4)
            int r4 = r4 + r2
            if (r4 <= r15) goto L_0x03a7
            goto L_0x03ad
        L_0x03a7:
            int r3 = r3 + 1
            r2 = r4
        L_0x03aa:
            int r1 = r1 + 1
            goto L_0x0393
        L_0x03ad:
            r1 = r3
        L_0x03ae:
            r2 = r1
            r1 = 0
            goto L_0x03d4
        L_0x03b1:
            int r1 = r8.f4475a1
            if (r1 > 0) goto L_0x03d3
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x03b8:
            if (r1 >= r12) goto L_0x03d2
            if (r1 <= 0) goto L_0x03bf
            int r4 = r8.W0
            int r2 = r2 + r4
        L_0x03bf:
            r4 = r29[r1]
            if (r4 != 0) goto L_0x03c4
            goto L_0x03cf
        L_0x03c4:
            int r4 = r8.X(r15, r4)
            int r4 = r4 + r2
            if (r4 <= r15) goto L_0x03cc
            goto L_0x03d2
        L_0x03cc:
            int r3 = r3 + 1
            r2 = r4
        L_0x03cf:
            int r1 = r1 + 1
            goto L_0x03b8
        L_0x03d2:
            r1 = r3
        L_0x03d3:
            r2 = 0
        L_0x03d4:
            int[] r3 = r8.f4480f1
            if (r3 != 0) goto L_0x03dd
            r3 = 2
            int[] r3 = new int[r3]
            r8.f4480f1 = r3
        L_0x03dd:
            if (r1 != 0) goto L_0x03e2
            r3 = 1
            if (r0 == r3) goto L_0x03e6
        L_0x03e2:
            if (r2 != 0) goto L_0x03fd
            if (r0 != 0) goto L_0x03fd
        L_0x03e6:
            r3 = r38
            r4 = r39
            r5 = r0
            r6 = r1
            r7 = r2
            r11 = r8
            r17 = r11
            r13 = r27
            r14 = r30
            r9 = r32
            r0 = 1
            r1 = r36
            r2 = r37
            goto L_0x051a
        L_0x03fd:
            r3 = r39
            r4 = r0
            r5 = r1
            r6 = r2
            r11 = r8
            r17 = r11
            r13 = r27
            r7 = r29
            r14 = r30
            r9 = r32
            r10 = 0
            r0 = r36
            r1 = r37
            r2 = r38
        L_0x0414:
            if (r10 != 0) goto L_0x0526
            if (r4 != 0) goto L_0x0427
            float r5 = (float) r12
            r36 = r0
            float r0 = (float) r6
            float r5 = r5 / r0
            r37 = r1
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r5 = r0
            goto L_0x0435
        L_0x0427:
            r36 = r0
            r37 = r1
            float r0 = (float) r12
            float r1 = (float) r5
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6 = r0
        L_0x0435:
            c1.e[] r0 = r11.f4479e1
            if (r0 == 0) goto L_0x0442
            int r1 = r0.length
            if (r1 >= r6) goto L_0x043d
            goto L_0x0442
        L_0x043d:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x0447
        L_0x0442:
            r1 = 0
            c1.e[] r0 = new c1.e[r6]
            r11.f4479e1 = r0
        L_0x0447:
            c1.e[] r0 = r11.f4478d1
            if (r0 == 0) goto L_0x0454
            int r1 = r0.length
            if (r1 >= r5) goto L_0x044f
            goto L_0x0454
        L_0x044f:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x0458
        L_0x0454:
            c1.e[] r0 = new c1.e[r5]
            r11.f4478d1 = r0
        L_0x0458:
            r0 = 0
        L_0x0459:
            if (r0 >= r6) goto L_0x04b6
            r1 = 0
        L_0x045c:
            if (r1 >= r5) goto L_0x04ad
            int r18 = r1 * r6
            int r18 = r18 + r0
            r38 = r2
            r2 = 1
            if (r4 != r2) goto L_0x046b
            int r2 = r0 * r5
            int r18 = r2 + r1
        L_0x046b:
            r39 = r3
            r2 = r18
            int r3 = r7.length
            if (r2 < r3) goto L_0x0475
        L_0x0472:
            r18 = r7
            goto L_0x04a4
        L_0x0475:
            r2 = r7[r2]
            if (r2 != 0) goto L_0x047a
            goto L_0x0472
        L_0x047a:
            int r3 = r11.Y(r15, r2)
            r18 = r7
            c1.e[] r7 = r11.f4479e1
            r7 = r7[r0]
            if (r7 == 0) goto L_0x048c
            int r7 = r7.u()
            if (r7 >= r3) goto L_0x0490
        L_0x048c:
            c1.e[] r3 = r11.f4479e1
            r3[r0] = r2
        L_0x0490:
            int r3 = r11.X(r15, r2)
            c1.e[] r7 = r11.f4478d1
            r7 = r7[r1]
            if (r7 == 0) goto L_0x04a0
            int r7 = r7.o()
            if (r7 >= r3) goto L_0x04a4
        L_0x04a0:
            c1.e[] r3 = r11.f4478d1
            r3[r1] = r2
        L_0x04a4:
            int r1 = r1 + 1
            r2 = r38
            r3 = r39
            r7 = r18
            goto L_0x045c
        L_0x04ad:
            r38 = r2
            r39 = r3
            r18 = r7
            int r0 = r0 + 1
            goto L_0x0459
        L_0x04b6:
            r38 = r2
            r39 = r3
            r18 = r7
            r0 = 0
            r1 = 0
        L_0x04be:
            if (r0 >= r6) goto L_0x04d4
            c1.e[] r2 = r11.f4479e1
            r2 = r2[r0]
            if (r2 == 0) goto L_0x04d1
            if (r0 <= 0) goto L_0x04cb
            int r3 = r11.V0
            int r1 = r1 + r3
        L_0x04cb:
            int r2 = r11.Y(r15, r2)
            int r2 = r2 + r1
            r1 = r2
        L_0x04d1:
            int r0 = r0 + 1
            goto L_0x04be
        L_0x04d4:
            r0 = 0
            r2 = 0
        L_0x04d6:
            if (r0 >= r5) goto L_0x04ec
            c1.e[] r3 = r11.f4478d1
            r3 = r3[r0]
            if (r3 == 0) goto L_0x04e9
            if (r0 <= 0) goto L_0x04e3
            int r7 = r11.W0
            int r2 = r2 + r7
        L_0x04e3:
            int r3 = r11.X(r15, r3)
            int r3 = r3 + r2
            r2 = r3
        L_0x04e9:
            int r0 = r0 + 1
            goto L_0x04d6
        L_0x04ec:
            r0 = 0
            r9[r0] = r1
            r0 = 1
            r9[r0] = r2
            if (r4 != 0) goto L_0x04fb
            if (r1 <= r15) goto L_0x050d
            if (r6 <= r0) goto L_0x050d
            int r6 = r6 + -1
            goto L_0x0501
        L_0x04fb:
            if (r2 <= r15) goto L_0x050d
            if (r5 <= r0) goto L_0x050d
            int r5 = r5 + -1
        L_0x0501:
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            r7 = r18
            goto L_0x0414
        L_0x050d:
            r1 = r36
            r2 = r37
            r3 = r38
            r7 = r6
            r29 = r18
            r6 = r5
            r5 = r4
            r4 = r39
        L_0x051a:
            r10 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r29
            goto L_0x0414
        L_0x0526:
            r36 = r0
            r37 = r1
            r38 = r2
            r39 = r3
            r0 = 1
            int[] r1 = r11.f4480f1
            r2 = 0
            r1[r2] = r6
            r1[r0] = r5
            r0 = r36
            r1 = r37
            r2 = r38
            goto L_0x0776
        L_0x053e:
            r29 = r4
            r32 = r6
            r31 = r7
            r18 = r9
            r27 = r13
            r30 = r14
            r33 = r15
            r15 = r5
            int r9 = r8.f4476b1
            if (r12 != 0) goto L_0x0553
            goto L_0x0768
        L_0x0553:
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.clear()
            c1.g$a r11 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r4 = r8.L
            c1.d r5 = r8.M
            c1.d r6 = r8.N
            r0 = r11
            r1 = r35
            r2 = r9
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r11)
            if (r9 != 0) goto L_0x05e5
            r0 = 0
            r1 = 0
            r13 = 0
        L_0x0574:
            if (r13 >= r12) goto L_0x05e1
            r14 = r29[r13]
            int r16 = r8.Y(r15, r14)
            c1.e$a[] r2 = r14.V
            r3 = 0
            r2 = r2[r3]
            r7 = r18
            if (r2 != r7) goto L_0x0587
            int r0 = r0 + 1
        L_0x0587:
            r17 = r0
            if (r1 == r15) goto L_0x0592
            int r0 = r8.V0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r15) goto L_0x0598
        L_0x0592:
            c1.e r0 = r11.f4484b
            if (r0 == 0) goto L_0x0598
            r0 = 1
            goto L_0x0599
        L_0x0598:
            r0 = 0
        L_0x0599:
            if (r0 != 0) goto L_0x05a6
            if (r13 <= 0) goto L_0x05a6
            int r2 = r8.f4475a1
            if (r2 <= 0) goto L_0x05a6
            int r2 = r13 % r2
            if (r2 != 0) goto L_0x05a6
            r0 = 1
        L_0x05a6:
            if (r0 == 0) goto L_0x05c5
            c1.g$a r11 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r4 = r8.L
            c1.d r5 = r8.M
            c1.d r6 = r8.N
            r0 = r11
            r1 = r35
            r2 = r9
            r18 = r10
            r10 = r7
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.f4496n = r13
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r11)
            goto L_0x05d1
        L_0x05c5:
            r18 = r10
            r10 = r7
            if (r13 <= 0) goto L_0x05d1
            int r0 = r8.V0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x05d3
        L_0x05d1:
            r1 = r16
        L_0x05d3:
            r11.a(r14)
            int r13 = r13 + 1
            r0 = r17
            r34 = r18
            r18 = r10
            r10 = r34
            goto L_0x0574
        L_0x05e1:
            r18 = r10
            goto L_0x064d
        L_0x05e5:
            r34 = r18
            r18 = r10
            r10 = r34
            r0 = 0
            r1 = 0
            r13 = 0
        L_0x05ee:
            if (r13 >= r12) goto L_0x064d
            r14 = r29[r13]
            int r16 = r8.X(r15, r14)
            c1.e$a[] r2 = r14.V
            r3 = 1
            r2 = r2[r3]
            if (r2 != r10) goto L_0x05ff
            int r0 = r0 + 1
        L_0x05ff:
            r17 = r0
            if (r1 == r15) goto L_0x060a
            int r0 = r8.W0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r15) goto L_0x0610
        L_0x060a:
            c1.e r0 = r11.f4484b
            if (r0 == 0) goto L_0x0610
            r0 = 1
            goto L_0x0611
        L_0x0610:
            r0 = 0
        L_0x0611:
            if (r0 != 0) goto L_0x061e
            if (r13 <= 0) goto L_0x061e
            int r2 = r8.f4475a1
            if (r2 <= 0) goto L_0x061e
            int r2 = r13 % r2
            if (r2 != 0) goto L_0x061e
            r0 = 1
        L_0x061e:
            if (r0 == 0) goto L_0x063a
            c1.g$a r11 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r4 = r8.L
            c1.d r5 = r8.M
            c1.d r6 = r8.N
            r0 = r11
            r1 = r35
            r2 = r9
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.f4496n = r13
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r11)
            goto L_0x0643
        L_0x063a:
            if (r13 <= 0) goto L_0x0643
            int r0 = r8.W0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0645
        L_0x0643:
            r1 = r16
        L_0x0645:
            r11.a(r14)
            int r13 = r13 + 1
            r0 = r17
            goto L_0x05ee
        L_0x064d:
            java.util.ArrayList<c1.g$a> r1 = r8.f4477c1
            int r1 = r1.size()
            c1.d r2 = r8.K
            c1.d r3 = r8.L
            c1.d r4 = r8.M
            c1.d r5 = r8.N
            int r6 = r8.C0
            int r7 = r8.f4508y0
            int r10 = r8.D0
            int r11 = r8.f4509z0
            c1.e$a[] r12 = r8.V
            r13 = 0
            r14 = r12[r13]
            r13 = r18
            if (r14 == r13) goto L_0x0674
            r14 = 1
            r12 = r12[r14]
            if (r12 != r13) goto L_0x0672
            goto L_0x0674
        L_0x0672:
            r12 = 0
            goto L_0x0675
        L_0x0674:
            r12 = 1
        L_0x0675:
            if (r0 <= 0) goto L_0x069c
            if (r12 == 0) goto L_0x069c
            r0 = 0
        L_0x067a:
            if (r0 >= r1) goto L_0x069c
            java.util.ArrayList<c1.g$a> r12 = r8.f4477c1
            java.lang.Object r12 = r12.get(r0)
            c1.g$a r12 = (c1.g.a) r12
            if (r9 != 0) goto L_0x0690
            int r13 = r12.d()
            int r13 = r15 - r13
            r12.e(r13)
            goto L_0x0699
        L_0x0690:
            int r13 = r12.c()
            int r13 = r15 - r13
            r12.e(r13)
        L_0x0699:
            int r0 = r0 + 1
            goto L_0x067a
        L_0x069c:
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x069f:
            if (r0 >= r1) goto L_0x0750
            java.util.ArrayList<c1.g$a> r14 = r8.f4477c1
            java.lang.Object r14 = r14.get(r0)
            c1.g$a r14 = (c1.g.a) r14
            if (r9 != 0) goto L_0x06fb
            int r5 = r1 + -1
            if (r0 >= r5) goto L_0x06c1
            java.util.ArrayList<c1.g$a> r5 = r8.f4477c1
            int r11 = r0 + 1
            java.lang.Object r5 = r5.get(r11)
            c1.g$a r5 = (c1.g.a) r5
            c1.e r5 = r5.f4484b
            c1.d r5 = r5.L
            r28 = r1
            r11 = 0
            goto L_0x06c7
        L_0x06c1:
            c1.d r5 = r8.N
            int r11 = r8.f4509z0
            r28 = r1
        L_0x06c7:
            c1.e r1 = r14.f4484b
            c1.d r1 = r1.N
            r16 = r14
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r10
            r25 = r11
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r14.d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r14.c()
            int r7 = r7 + r13
            if (r0 <= 0) goto L_0x06f6
            int r12 = r8.W0
            int r7 = r7 + r12
        L_0x06f6:
            r12 = r3
            r13 = r7
            r7 = 0
            r3 = r1
            goto L_0x074a
        L_0x06fb:
            r28 = r1
            int r1 = r28 + -1
            if (r0 >= r1) goto L_0x0711
            java.util.ArrayList<c1.g$a> r1 = r8.f4477c1
            int r4 = r0 + 1
            java.lang.Object r1 = r1.get(r4)
            c1.g$a r1 = (c1.g.a) r1
            c1.e r1 = r1.f4484b
            c1.d r1 = r1.K
            r4 = 0
            goto L_0x0715
        L_0x0711:
            c1.d r1 = r8.M
            int r4 = r8.D0
        L_0x0715:
            c1.e r10 = r14.f4484b
            c1.d r10 = r10.M
            r16 = r14
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r4
            r25 = r11
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r14.d()
            int r2 = r2 + r12
            int r6 = r14.c()
            int r6 = java.lang.Math.max(r13, r6)
            if (r0 <= 0) goto L_0x0744
            int r12 = r8.V0
            int r2 = r2 + r12
        L_0x0744:
            r12 = r2
            r13 = r6
            r2 = r10
            r6 = 0
            r10 = r4
            r4 = r1
        L_0x074a:
            int r0 = r0 + 1
            r1 = r28
            goto L_0x069f
        L_0x0750:
            r0 = 0
            r32[r0] = r12
            r0 = 1
            r32[r0] = r13
            goto L_0x0768
        L_0x0757:
            r29 = r4
            r32 = r6
            r31 = r7
            r27 = r13
            r30 = r14
            r33 = r15
            r15 = r5
            int r2 = r8.f4476b1
            if (r12 != 0) goto L_0x0785
        L_0x0768:
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            r17 = r8
            r13 = r27
            r14 = r30
        L_0x0776:
            r7 = r31
            r6 = r32
            r15 = r33
            r5 = r3
            r9 = r17
            r4 = 0
            r3 = r2
            r2 = r1
            r1 = 1
            goto L_0x0812
        L_0x0785:
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            int r0 = r0.size()
            if (r0 != 0) goto L_0x07a4
            c1.g$a r9 = new c1.g$a
            c1.d r3 = r8.K
            c1.d r4 = r8.L
            c1.d r5 = r8.M
            c1.d r6 = r8.N
            r0 = r9
            r1 = r35
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r0.add(r9)
            goto L_0x07e6
        L_0x07a4:
            java.util.ArrayList<c1.g$a> r0 = r8.f4477c1
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            c1.g$a r9 = (c1.g.a) r9
            r9.f4485c = r1
            r0 = 0
            r9.f4484b = r0
            r9.f4494l = r1
            r9.f4495m = r1
            r9.f4496n = r1
            r9.f4497o = r1
            r9.f4498p = r1
            c1.d r0 = r8.K
            c1.d r1 = r8.L
            c1.d r3 = r8.M
            c1.d r4 = r8.N
            int r5 = r8.C0
            int r6 = r8.f4508y0
            int r7 = r8.D0
            int r10 = r8.f4509z0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r10
            r26 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x07e6:
            r4 = 0
        L_0x07e7:
            if (r4 >= r12) goto L_0x07f1
            r0 = r29[r4]
            r9.a(r0)
            int r4 = r4 + 1
            goto L_0x07e7
        L_0x07f1:
            int r0 = r9.d()
            r4 = 0
            r32[r4] = r0
            int r0 = r9.c()
            r1 = 1
            r32[r1] = r0
            r0 = r36
            r2 = r37
            r3 = r38
            r5 = r39
            r9 = r8
            r13 = r27
            r14 = r30
            r7 = r31
            r6 = r32
            r15 = r33
        L_0x0812:
            r10 = r6[r4]
            int r10 = r10 + r13
            int r10 = r10 + r14
            r6 = r6[r1]
            int r6 = r6 + r15
            int r6 = r6 + r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != r11) goto L_0x0822
            r0 = r2
            goto L_0x082e
        L_0x0822:
            if (r0 != r7) goto L_0x0829
            int r0 = java.lang.Math.min(r10, r2)
            goto L_0x082e
        L_0x0829:
            if (r0 != 0) goto L_0x082d
            r0 = r10
            goto L_0x082e
        L_0x082d:
            r0 = r4
        L_0x082e:
            if (r3 != r11) goto L_0x0832
            r2 = r5
            goto L_0x083e
        L_0x0832:
            if (r3 != r7) goto L_0x0839
            int r2 = java.lang.Math.min(r6, r5)
            goto L_0x083e
        L_0x0839:
            if (r3 != 0) goto L_0x083d
            r2 = r6
            goto L_0x083e
        L_0x083d:
            r2 = r4
        L_0x083e:
            r9.F0 = r0
            r9.G0 = r2
            r9.R(r0)
            r9.O(r2)
            int r0 = r9.f4506x0
            if (r0 <= 0) goto L_0x084e
            r11 = r1
            goto L_0x084f
        L_0x084e:
            r11 = r4
        L_0x084f:
            r9.E0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.V(int, int, int, int):void");
    }

    public final int X(int i10, e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.V[1] == e.a.MATCH_CONSTRAINT) {
            int i11 = eVar.f4457t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.A * ((float) i10));
                if (i12 != eVar.o()) {
                    eVar.f4431g = true;
                    W(eVar, eVar.V[0], eVar.u(), e.a.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.o();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.u()) * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.o();
    }

    public final int Y(int i10, e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.V[0] == e.a.MATCH_CONSTRAINT) {
            int i11 = eVar.f4455s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f4464x * ((float) i10));
                if (i12 != eVar.u()) {
                    eVar.f4431g = true;
                    W(eVar, e.a.FIXED, i12, eVar.V[1], eVar.o());
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.u();
            } else {
                if (i11 == 3) {
                    return (int) ((((float) eVar.o()) * eVar.Z) + 0.5f);
                }
            }
        }
        return eVar.u();
    }

    public final void e(d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar;
        float f10;
        int i10;
        boolean z13;
        super.e(dVar, z10);
        e eVar2 = this.W;
        if (eVar2 == null || !((f) eVar2).B0) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i11 = this.Z0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = this.f4477c1.size();
                for (int i12 = 0; i12 < size; i12++) {
                    a aVar = this.f4477c1.get(i12);
                    if (i12 == size - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar.b(i12, z11, z12);
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = this.f4477c1.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        a aVar2 = this.f4477c1.get(i13);
                        if (i13 == size2 - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        aVar2.b(i13, z11, z13);
                    }
                }
            } else if (!(this.f4480f1 == null || this.f4479e1 == null || this.f4478d1 == null)) {
                for (int i14 = 0; i14 < this.f4482h1; i14++) {
                    this.f4481g1[i14].H();
                }
                int[] iArr = this.f4480f1;
                int i15 = iArr[0];
                int i16 = iArr[1];
                e eVar3 = null;
                float f11 = this.P0;
                int i17 = 0;
                while (i17 < i15) {
                    if (z11) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.P0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    e eVar4 = this.f4479e1[i10];
                    if (!(eVar4 == null || eVar4.f4438j0 == 8)) {
                        if (i17 == 0) {
                            eVar4.i(eVar4.K, this.K, this.C0);
                            eVar4.f4446n0 = this.J0;
                            eVar4.f4432g0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            eVar4.i(eVar4.M, this.M, this.D0);
                        }
                        if (i17 > 0 && eVar3 != null) {
                            eVar4.i(eVar4.K, eVar3.M, this.V0);
                            eVar3.i(eVar3.M, eVar4.K, 0);
                        }
                        eVar3 = eVar4;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    e eVar5 = this.f4478d1[i18];
                    if (!(eVar5 == null || eVar5.f4438j0 == 8)) {
                        if (i18 == 0) {
                            eVar5.i(eVar5.L, this.L, this.f4508y0);
                            eVar5.f4448o0 = this.K0;
                            eVar5.f4434h0 = this.Q0;
                        }
                        if (i18 == i16 - 1) {
                            eVar5.i(eVar5.N, this.N, this.f4509z0);
                        }
                        if (i18 > 0 && eVar3 != null) {
                            eVar5.i(eVar5.L, eVar3.N, this.W0);
                            eVar3.i(eVar3.N, eVar5.L, 0);
                        }
                        eVar3 = eVar5;
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (int i20 = 0; i20 < i16; i20++) {
                        int i21 = (i20 * i15) + i19;
                        if (this.f4476b1 == 1) {
                            i21 = (i19 * i16) + i20;
                        }
                        e[] eVarArr = this.f4481g1;
                        if (!(i21 >= eVarArr.length || (eVar = eVarArr[i21]) == null || eVar.f4438j0 == 8)) {
                            e eVar6 = this.f4479e1[i19];
                            e eVar7 = this.f4478d1[i20];
                            if (eVar != eVar6) {
                                eVar.i(eVar.K, eVar6.K, 0);
                                eVar.i(eVar.M, eVar6.M, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.i(eVar.L, eVar7.L, 0);
                                eVar.i(eVar.N, eVar7.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.f4477c1.size() > 0) {
            this.f4477c1.get(0).b(0, z11, true);
        }
        this.E0 = false;
    }

    public final void j(e eVar, HashMap<e, e> hashMap) {
        super.j(eVar, hashMap);
        g gVar = (g) eVar;
        this.J0 = gVar.J0;
        this.K0 = gVar.K0;
        this.L0 = gVar.L0;
        this.M0 = gVar.M0;
        this.N0 = gVar.N0;
        this.O0 = gVar.O0;
        this.P0 = gVar.P0;
        this.Q0 = gVar.Q0;
        this.R0 = gVar.R0;
        this.S0 = gVar.S0;
        this.T0 = gVar.T0;
        this.U0 = gVar.U0;
        this.V0 = gVar.V0;
        this.W0 = gVar.W0;
        this.X0 = gVar.X0;
        this.Y0 = gVar.Y0;
        this.Z0 = gVar.Z0;
        this.f4475a1 = gVar.f4475a1;
        this.f4476b1 = gVar.f4476b1;
    }
}
