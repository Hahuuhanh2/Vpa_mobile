package c1;

import c1.d;
import d1.c;
import d1.f;
import d1.l;
import d1.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v.v;

/* compiled from: ConstraintWidget */
public class e {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public d K;
    public d L;
    public d M;
    public d N;
    public d O;
    public d P;
    public d Q;
    public d R;
    public d[] S;
    public ArrayList<d> T;
    public boolean[] U;
    public a[] V;
    public e W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4419a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f4420a0;

    /* renamed from: b  reason: collision with root package name */
    public c f4421b;

    /* renamed from: b0  reason: collision with root package name */
    public int f4422b0;

    /* renamed from: c  reason: collision with root package name */
    public c f4423c;

    /* renamed from: c0  reason: collision with root package name */
    public int f4424c0;

    /* renamed from: d  reason: collision with root package name */
    public l f4425d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f4426d0;

    /* renamed from: e  reason: collision with root package name */
    public n f4427e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f4428e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f4429f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public int f4430f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4431g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f4432g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4433h = true;

    /* renamed from: h0  reason: collision with root package name */
    public float f4434h0;

    /* renamed from: i  reason: collision with root package name */
    public int f4435i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public Object f4436i0;

    /* renamed from: j  reason: collision with root package name */
    public int f4437j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f4438j0;

    /* renamed from: k  reason: collision with root package name */
    public String f4439k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4440k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4441l;

    /* renamed from: l0  reason: collision with root package name */
    public String f4442l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4443m;

    /* renamed from: m0  reason: collision with root package name */
    public String f4444m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4445n;

    /* renamed from: n0  reason: collision with root package name */
    public int f4446n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4447o;

    /* renamed from: o0  reason: collision with root package name */
    public int f4448o0;

    /* renamed from: p  reason: collision with root package name */
    public int f4449p;

    /* renamed from: p0  reason: collision with root package name */
    public float[] f4450p0;

    /* renamed from: q  reason: collision with root package name */
    public int f4451q;

    /* renamed from: q0  reason: collision with root package name */
    public e[] f4452q0;

    /* renamed from: r  reason: collision with root package name */
    public int f4453r;

    /* renamed from: r0  reason: collision with root package name */
    public e[] f4454r0;

    /* renamed from: s  reason: collision with root package name */
    public int f4455s;

    /* renamed from: s0  reason: collision with root package name */
    public e f4456s0;

    /* renamed from: t  reason: collision with root package name */
    public int f4457t;

    /* renamed from: t0  reason: collision with root package name */
    public e f4458t0;

    /* renamed from: u  reason: collision with root package name */
    public int[] f4459u;

    /* renamed from: u0  reason: collision with root package name */
    public int f4460u0;

    /* renamed from: v  reason: collision with root package name */
    public int f4461v;

    /* renamed from: v0  reason: collision with root package name */
    public int f4462v0;

    /* renamed from: w  reason: collision with root package name */
    public int f4463w;

    /* renamed from: x  reason: collision with root package name */
    public float f4464x;

    /* renamed from: y  reason: collision with root package name */
    public int f4465y;

    /* renamed from: z  reason: collision with root package name */
    public int f4466z;

    /* compiled from: ConstraintWidget */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new HashMap();
        this.f4441l = false;
        this.f4443m = false;
        this.f4445n = false;
        this.f4447o = false;
        this.f4449p = -1;
        this.f4451q = -1;
        this.f4453r = 0;
        this.f4455s = 0;
        this.f4457t = 0;
        this.f4459u = new int[2];
        this.f4461v = 0;
        this.f4463w = 0;
        this.f4464x = 1.0f;
        this.f4465y = 0;
        this.f4466z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        d dVar = new d(this, d.a.LEFT);
        this.K = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.L = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.M = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.N = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.O = dVar5;
        this.P = new d(this, d.a.CENTER_X);
        this.Q = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.R = dVar6;
        this.S = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        ArrayList<d> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        a aVar = a.FIXED;
        this.V = new a[]{aVar, aVar};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f4420a0 = -1;
        this.f4422b0 = 0;
        this.f4424c0 = 0;
        this.f4426d0 = 0;
        this.f4432g0 = 0.5f;
        this.f4434h0 = 0.5f;
        this.f4438j0 = 0;
        this.f4440k0 = false;
        this.f4442l0 = null;
        this.f4444m0 = null;
        this.f4446n0 = 0;
        this.f4448o0 = 0;
        this.f4450p0 = new float[]{-1.0f, -1.0f};
        this.f4452q0 = new e[]{null, null};
        this.f4454r0 = new e[]{null, null};
        this.f4456s0 = null;
        this.f4458t0 = null;
        this.f4460u0 = -1;
        this.f4462v0 = -1;
        arrayList.add(this.K);
        this.T.add(this.L);
        this.T.add(this.M);
        this.T.add(this.N);
        this.T.add(this.P);
        this.T.add(this.Q);
        this.T.add(this.R);
        this.T.add(this.O);
    }

    public static void K(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 != i11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i10);
            sb2.append(",\n");
        }
    }

    public static void L(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 != f11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    public static void s(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        K(i10, 0, "      size", sb2);
        K(i11, 0, "      min", sb2);
        K(i12, Integer.MAX_VALUE, "      max", sb2);
        K(i13, 0, "      matchMin", sb2);
        K(i14, 0, "      matchDef", sb2);
        L(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void t(StringBuilder sb2, String str, d dVar) {
        if (dVar.f4406f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(dVar.f4406f);
            sb2.append("'");
            if (!(dVar.f4408h == Integer.MIN_VALUE && dVar.f4407g == 0)) {
                sb2.append(",");
                sb2.append(dVar.f4407g);
                if (dVar.f4408h != Integer.MIN_VALUE) {
                    sb2.append(",");
                    sb2.append(dVar.f4408h);
                    sb2.append(",");
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            c1.d[] r0 = r4.S
            r1 = r0[r5]
            c1.d r2 = r1.f4406f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            c1.d r2 = r2.f4406f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            c1.d r0 = r5.f4406f
            if (r0 == 0) goto L_0x001b
            c1.d r0 = r0.f4406f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e.A(int):boolean");
    }

    public final boolean B() {
        d dVar = this.K;
        d dVar2 = dVar.f4406f;
        if (dVar2 != null && dVar2.f4406f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f4406f;
        if (dVar4 == null || dVar4.f4406f != dVar3) {
            return false;
        }
        return true;
    }

    public final boolean C() {
        d dVar = this.L;
        d dVar2 = dVar.f4406f;
        if (dVar2 != null && dVar2.f4406f == dVar) {
            return true;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f4406f;
        if (dVar4 == null || dVar4.f4406f != dVar3) {
            return false;
        }
        return true;
    }

    public final boolean D() {
        if (!this.f4431g || this.f4438j0 == 8) {
            return false;
        }
        return true;
    }

    public boolean E() {
        if (this.f4441l || (this.K.f4403c && this.M.f4403c)) {
            return true;
        }
        return false;
    }

    public boolean F() {
        if (this.f4443m || (this.L.f4403c && this.N.f4403c)) {
            return true;
        }
        return false;
    }

    public void G() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f4420a0 = -1;
        this.f4422b0 = 0;
        this.f4424c0 = 0;
        this.f4426d0 = 0;
        this.f4428e0 = 0;
        this.f4430f0 = 0;
        this.f4432g0 = 0.5f;
        this.f4434h0 = 0.5f;
        a[] aVarArr = this.V;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f4436i0 = null;
        this.f4438j0 = 0;
        this.f4444m0 = null;
        this.f4446n0 = 0;
        this.f4448o0 = 0;
        float[] fArr = this.f4450p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4449p = -1;
        this.f4451q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4455s = 0;
        this.f4457t = 0;
        this.f4464x = 1.0f;
        this.A = 1.0f;
        this.f4463w = Integer.MAX_VALUE;
        this.f4466z = Integer.MAX_VALUE;
        this.f4461v = 0;
        this.f4465y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f4429f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4431g = true;
        int[] iArr2 = this.f4459u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4435i = -1;
        this.f4437j = -1;
    }

    public final void H() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).j();
        }
    }

    public final void I() {
        this.f4441l = false;
        this.f4443m = false;
        this.f4445n = false;
        this.f4447o = false;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.T.get(i10);
            dVar.f4403c = false;
            dVar.f4402b = 0;
        }
    }

    public void J(a1.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void M(int i10, int i11) {
        if (!this.f4441l) {
            this.K.l(i10);
            this.M.l(i11);
            this.f4422b0 = i10;
            this.X = i11 - i10;
            this.f4441l = true;
        }
    }

    public final void N(int i10, int i11) {
        if (!this.f4443m) {
            this.L.l(i10);
            this.N.l(i11);
            this.f4424c0 = i10;
            this.Y = i11 - i10;
            if (this.F) {
                this.O.l(i10 + this.f4426d0);
            }
            this.f4443m = true;
        }
    }

    public final void O(int i10) {
        this.Y = i10;
        int i11 = this.f4430f0;
        if (i10 < i11) {
            this.Y = i11;
        }
    }

    public final void P(a aVar) {
        this.V[0] = aVar;
    }

    public final void Q(a aVar) {
        this.V[1] = aVar;
    }

    public final void R(int i10) {
        this.X = i10;
        int i11 = this.f4428e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void S(boolean z10, boolean z11) {
        int i10;
        int i11;
        a aVar = a.FIXED;
        l lVar = this.f4425d;
        boolean z12 = z10 & lVar.f8534g;
        n nVar = this.f4427e;
        boolean z13 = z11 & nVar.f8534g;
        int i12 = lVar.f8535h.f8509g;
        int i13 = nVar.f8535h.f8509g;
        int i14 = lVar.f8536i.f8509g;
        int i15 = nVar.f8536i.f8509g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f4422b0 = i12;
        }
        if (z13) {
            this.f4424c0 = i13;
        }
        if (this.f4438j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z12) {
            if (this.V[0] == aVar && i17 < (i11 = this.X)) {
                i17 = i11;
            }
            this.X = i17;
            int i19 = this.f4428e0;
            if (i17 < i19) {
                this.X = i19;
            }
        }
        if (z13) {
            if (this.V[1] == aVar && i18 < (i10 = this.Y)) {
                i18 = i10;
            }
            this.Y = i18;
            int i20 = this.f4430f0;
            if (i18 < i20) {
                this.Y = i20;
            }
        }
    }

    public void T(a1.d dVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        l lVar;
        d dVar2 = this.K;
        dVar.getClass();
        int n10 = a1.d.n(dVar2);
        int n11 = a1.d.n(this.L);
        int n12 = a1.d.n(this.M);
        int n13 = a1.d.n(this.N);
        if (z10 && (lVar = this.f4425d) != null) {
            f fVar = lVar.f8535h;
            if (fVar.f8512j) {
                f fVar2 = lVar.f8536i;
                if (fVar2.f8512j) {
                    n10 = fVar.f8509g;
                    n12 = fVar2.f8509g;
                }
            }
        }
        if (z10 && (nVar = this.f4427e) != null) {
            f fVar3 = nVar.f8535h;
            if (fVar3.f8512j) {
                f fVar4 = nVar.f8536i;
                if (fVar4.f8512j) {
                    n11 = fVar3.f8509g;
                    n13 = fVar4.f8509g;
                }
            }
        }
        int i12 = n13 - n11;
        if (n12 - n10 < 0 || i12 < 0 || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE || n13 == Integer.MIN_VALUE || n13 == Integer.MAX_VALUE) {
            n10 = 0;
            n11 = 0;
            n12 = 0;
            n13 = 0;
        }
        a aVar = a.MATCH_CONSTRAINT;
        int i13 = n12 - n10;
        int i14 = n13 - n11;
        this.f4422b0 = n10;
        this.f4424c0 = n11;
        if (this.f4438j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        a[] aVarArr = this.V;
        a aVar2 = aVarArr[0];
        a aVar3 = a.FIXED;
        if (aVar2 == aVar3 && i13 < (i11 = this.X)) {
            i13 = i11;
        }
        if (aVarArr[1] == aVar3 && i14 < (i10 = this.Y)) {
            i14 = i10;
        }
        this.X = i13;
        this.Y = i14;
        int i15 = this.f4430f0;
        if (i14 < i15) {
            this.Y = i15;
        }
        int i16 = this.f4428e0;
        if (i13 < i16) {
            this.X = i16;
        }
        int i17 = this.f4463w;
        if (i17 > 0 && aVar2 == aVar) {
            this.X = Math.min(this.X, i17);
        }
        int i18 = this.f4466z;
        if (i18 > 0 && this.V[1] == aVar) {
            this.Y = Math.min(this.Y, i18);
        }
        int i19 = this.X;
        if (i13 != i19) {
            this.f4435i = i19;
        }
        int i20 = this.Y;
        if (i14 != i20) {
            this.f4437j = i20;
        }
    }

    public final void d(f fVar, a1.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                k.a(fVar, dVar, this);
                hashSet.remove(this);
                e(dVar, fVar.Z(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet<d> hashSet2 = this.K.f4401a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f4404d.d(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSet3 = this.M.f4401a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f4404d.d(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.L.f4401a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f4404d.d(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet5 = this.N.f4401a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f4404d.d(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet6 = this.O.f4401a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f4404d.d(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0087 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(a1.d r58, boolean r59) {
        /*
            r57 = this;
            r15 = r57
            r14 = r58
            c1.e$a r13 = c1.e.a.WRAP_CONTENT
            c1.d r0 = r15.K
            a1.g r12 = r14.k(r0)
            c1.d r0 = r15.M
            a1.g r11 = r14.k(r0)
            c1.d r0 = r15.L
            a1.g r10 = r14.k(r0)
            c1.d r0 = r15.N
            a1.g r9 = r14.k(r0)
            c1.d r0 = r15.O
            a1.g r8 = r14.k(r0)
            c1.e r0 = r15.W
            r7 = 2
            r1 = 3
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0053
            c1.e$a[] r0 = r0.V
            r2 = r0[r6]
            if (r2 != r13) goto L_0x0034
            r2 = r5
            goto L_0x0035
        L_0x0034:
            r2 = r6
        L_0x0035:
            r0 = r0[r5]
            if (r0 != r13) goto L_0x003b
            r0 = r5
            goto L_0x003c
        L_0x003b:
            r0 = r6
        L_0x003c:
            int r3 = r15.f4453r
            if (r3 == r5) goto L_0x004e
            if (r3 == r7) goto L_0x0049
            if (r3 == r1) goto L_0x0053
            r28 = r0
            r29 = r2
            goto L_0x0057
        L_0x0049:
            r28 = r0
            r29 = r6
            goto L_0x0057
        L_0x004e:
            r29 = r2
            r28 = r6
            goto L_0x0057
        L_0x0053:
            r28 = r6
            r29 = r28
        L_0x0057:
            int r0 = r15.f4438j0
            r4 = 8
            if (r0 != r4) goto L_0x0095
            boolean r0 = r15.f4440k0
            if (r0 != 0) goto L_0x0095
            java.util.ArrayList<c1.d> r0 = r15.T
            int r0 = r0.size()
            r2 = r6
        L_0x0068:
            if (r2 >= r0) goto L_0x0087
            java.util.ArrayList<c1.d> r3 = r15.T
            java.lang.Object r3 = r3.get(r2)
            c1.d r3 = (c1.d) r3
            java.util.HashSet<c1.d> r3 = r3.f4401a
            if (r3 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007f
            r3 = r5
            goto L_0x0080
        L_0x007f:
            r3 = r6
        L_0x0080:
            if (r3 == 0) goto L_0x0084
            r0 = r5
            goto L_0x0088
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x0087:
            r0 = r6
        L_0x0088:
            if (r0 != 0) goto L_0x0095
            boolean[] r0 = r15.U
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0095
            boolean r0 = r0[r5]
            if (r0 != 0) goto L_0x0095
            return
        L_0x0095:
            boolean r0 = r15.f4441l
            r3 = 5
            if (r0 != 0) goto L_0x009e
            boolean r2 = r15.f4443m
            if (r2 == 0) goto L_0x01a5
        L_0x009e:
            if (r0 == 0) goto L_0x010d
            int r0 = r15.f4422b0
            r14.d(r12, r0)
            int r0 = r15.f4422b0
            int r2 = r15.X
            int r0 = r0 + r2
            r14.d(r11, r0)
            if (r29 == 0) goto L_0x010d
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x010d
            boolean r2 = r15.f4433h
            if (r2 == 0) goto L_0x0104
            c1.f r0 = (c1.f) r0
            c1.d r2 = r15.K
            java.lang.ref.WeakReference<c1.d> r7 = r0.N0
            if (r7 == 0) goto L_0x00d7
            java.lang.Object r7 = r7.get()
            if (r7 == 0) goto L_0x00d7
            int r7 = r2.d()
            java.lang.ref.WeakReference<c1.d> r1 = r0.N0
            java.lang.Object r1 = r1.get()
            c1.d r1 = (c1.d) r1
            int r1 = r1.d()
            if (r7 <= r1) goto L_0x00de
        L_0x00d7:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            r0.N0 = r1
        L_0x00de:
            c1.d r1 = r15.M
            java.lang.ref.WeakReference<c1.d> r2 = r0.P0
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x00fc
            int r2 = r1.d()
            java.lang.ref.WeakReference<c1.d> r7 = r0.P0
            java.lang.Object r7 = r7.get()
            c1.d r7 = (c1.d) r7
            int r7 = r7.d()
            if (r2 <= r7) goto L_0x010d
        L_0x00fc:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.P0 = r2
            goto L_0x010d
        L_0x0104:
            c1.d r0 = r0.M
            a1.g r0 = r14.k(r0)
            r14.f(r0, r11, r6, r3)
        L_0x010d:
            boolean r0 = r15.f4443m
            if (r0 == 0) goto L_0x0198
            int r0 = r15.f4424c0
            r14.d(r10, r0)
            int r0 = r15.f4424c0
            int r1 = r15.Y
            int r0 = r0 + r1
            r14.d(r9, r0)
            c1.d r0 = r15.O
            java.util.HashSet<c1.d> r0 = r0.f4401a
            if (r0 != 0) goto L_0x0125
            goto L_0x012d
        L_0x0125:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x012d
            r0 = r5
            goto L_0x012e
        L_0x012d:
            r0 = r6
        L_0x012e:
            if (r0 == 0) goto L_0x0138
            int r0 = r15.f4424c0
            int r1 = r15.f4426d0
            int r0 = r0 + r1
            r14.d(r8, r0)
        L_0x0138:
            if (r28 == 0) goto L_0x0198
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x0198
            boolean r1 = r15.f4433h
            if (r1 == 0) goto L_0x018f
            c1.f r0 = (c1.f) r0
            c1.d r1 = r15.L
            java.lang.ref.WeakReference<c1.d> r2 = r0.M0
            if (r2 == 0) goto L_0x0162
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x0162
            int r2 = r1.d()
            java.lang.ref.WeakReference<c1.d> r7 = r0.M0
            java.lang.Object r7 = r7.get()
            c1.d r7 = (c1.d) r7
            int r7 = r7.d()
            if (r2 <= r7) goto L_0x0169
        L_0x0162:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.M0 = r2
        L_0x0169:
            c1.d r1 = r15.N
            java.lang.ref.WeakReference<c1.d> r2 = r0.O0
            if (r2 == 0) goto L_0x0187
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x0187
            int r2 = r1.d()
            java.lang.ref.WeakReference<c1.d> r7 = r0.O0
            java.lang.Object r7 = r7.get()
            c1.d r7 = (c1.d) r7
            int r7 = r7.d()
            if (r2 <= r7) goto L_0x0198
        L_0x0187:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.O0 = r2
            goto L_0x0198
        L_0x018f:
            c1.d r0 = r0.N
            a1.g r0 = r14.k(r0)
            r14.f(r0, r9, r6, r3)
        L_0x0198:
            boolean r0 = r15.f4441l
            if (r0 == 0) goto L_0x01a5
            boolean r0 = r15.f4443m
            if (r0 == 0) goto L_0x01a5
            r15.f4441l = r6
            r15.f4443m = r6
            return
        L_0x01a5:
            if (r59 == 0) goto L_0x022b
            d1.l r0 = r15.f4425d
            if (r0 == 0) goto L_0x022b
            d1.n r1 = r15.f4427e
            if (r1 == 0) goto L_0x022b
            d1.f r2 = r0.f8535h
            boolean r7 = r2.f8512j
            if (r7 == 0) goto L_0x022b
            d1.f r0 = r0.f8536i
            boolean r0 = r0.f8512j
            if (r0 == 0) goto L_0x022b
            d1.f r0 = r1.f8535h
            boolean r0 = r0.f8512j
            if (r0 == 0) goto L_0x022b
            d1.f r0 = r1.f8536i
            boolean r0 = r0.f8512j
            if (r0 == 0) goto L_0x022b
            int r0 = r2.f8509g
            r14.d(r12, r0)
            d1.l r0 = r15.f4425d
            d1.f r0 = r0.f8536i
            int r0 = r0.f8509g
            r14.d(r11, r0)
            d1.n r0 = r15.f4427e
            d1.f r0 = r0.f8535h
            int r0 = r0.f8509g
            r14.d(r10, r0)
            d1.n r0 = r15.f4427e
            d1.f r0 = r0.f8536i
            int r0 = r0.f8509g
            r14.d(r9, r0)
            d1.n r0 = r15.f4427e
            d1.f r0 = r0.f8520k
            int r0 = r0.f8509g
            r14.d(r8, r0)
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x0226
            if (r29 == 0) goto L_0x020d
            boolean[] r0 = r15.f4429f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x020d
            boolean r0 = r57.B()
            if (r0 != 0) goto L_0x020d
            c1.e r0 = r15.W
            c1.d r0 = r0.M
            a1.g r0 = r14.k(r0)
            r14.f(r0, r11, r6, r4)
        L_0x020d:
            if (r28 == 0) goto L_0x0226
            boolean[] r0 = r15.f4429f
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x0226
            boolean r0 = r57.C()
            if (r0 != 0) goto L_0x0226
            c1.e r0 = r15.W
            c1.d r0 = r0.N
            a1.g r0 = r14.k(r0)
            r14.f(r0, r9, r6, r4)
        L_0x0226:
            r15.f4441l = r6
            r15.f4443m = r6
            return
        L_0x022b:
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x029c
            boolean r0 = r15.A(r6)
            if (r0 == 0) goto L_0x023e
            c1.e r0 = r15.W
            c1.f r0 = (c1.f) r0
            r0.V(r6, r15)
            r0 = r5
            goto L_0x0242
        L_0x023e:
            boolean r0 = r57.B()
        L_0x0242:
            boolean r1 = r15.A(r5)
            if (r1 == 0) goto L_0x0251
            c1.e r1 = r15.W
            c1.f r1 = (c1.f) r1
            r1.V(r5, r15)
            r1 = r5
            goto L_0x0255
        L_0x0251:
            boolean r1 = r57.C()
        L_0x0255:
            if (r0 != 0) goto L_0x0274
            if (r29 == 0) goto L_0x0274
            int r2 = r15.f4438j0
            if (r2 == r4) goto L_0x0274
            c1.d r2 = r15.K
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0274
            c1.d r2 = r15.M
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0274
            c1.e r2 = r15.W
            c1.d r2 = r2.M
            a1.g r2 = r14.k(r2)
            r14.f(r2, r11, r6, r5)
        L_0x0274:
            if (r1 != 0) goto L_0x0297
            if (r28 == 0) goto L_0x0297
            int r2 = r15.f4438j0
            if (r2 == r4) goto L_0x0297
            c1.d r2 = r15.L
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0297
            c1.d r2 = r15.N
            c1.d r2 = r2.f4406f
            if (r2 != 0) goto L_0x0297
            c1.d r2 = r15.O
            if (r2 != 0) goto L_0x0297
            c1.e r2 = r15.W
            c1.d r2 = r2.N
            a1.g r2 = r14.k(r2)
            r14.f(r2, r9, r6, r5)
        L_0x0297:
            r31 = r0
            r30 = r1
            goto L_0x02a0
        L_0x029c:
            r30 = r6
            r31 = r30
        L_0x02a0:
            int r0 = r15.X
            int r1 = r15.f4428e0
            if (r0 >= r1) goto L_0x02a7
            goto L_0x02a8
        L_0x02a7:
            r1 = r0
        L_0x02a8:
            int r2 = r15.Y
            int r7 = r15.f4430f0
            if (r2 >= r7) goto L_0x02af
            goto L_0x02b0
        L_0x02af:
            r7 = r2
        L_0x02b0:
            c1.e$a[] r3 = r15.V
            r4 = r3[r6]
            c1.e$a r6 = c1.e.a.MATCH_CONSTRAINT
            if (r4 == r6) goto L_0x02bb
            r21 = r5
            goto L_0x02bd
        L_0x02bb:
            r21 = 0
        L_0x02bd:
            r3 = r3[r5]
            if (r3 == r6) goto L_0x02c4
            r22 = r5
            goto L_0x02c6
        L_0x02c4:
            r22 = 0
        L_0x02c6:
            int r5 = r15.f4420a0
            r15.B = r5
            r24 = r1
            float r1 = r15.Z
            r15.C = r1
            r25 = r7
            int r7 = r15.f4455s
            r27 = r8
            int r8 = r15.f4457t
            r26 = 0
            int r26 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            r32 = 4
            r33 = r10
            if (r26 <= 0) goto L_0x0403
            int r10 = r15.f4438j0
            r35 = r9
            r9 = 8
            if (r10 == r9) goto L_0x0405
            if (r4 != r6) goto L_0x02ef
            if (r7 != 0) goto L_0x02ef
            r7 = 3
        L_0x02ef:
            if (r3 != r6) goto L_0x02f4
            if (r8 != 0) goto L_0x02f4
            r8 = 3
        L_0x02f4:
            if (r4 != r6) goto L_0x03be
            if (r3 != r6) goto L_0x03be
            r9 = 3
            if (r7 != r9) goto L_0x03be
            if (r8 != r9) goto L_0x03be
            r9 = -1
            if (r5 != r9) goto L_0x0317
            if (r21 == 0) goto L_0x0308
            if (r22 != 0) goto L_0x0308
            r0 = 0
            r15.B = r0
            goto L_0x0317
        L_0x0308:
            if (r21 != 0) goto L_0x0317
            if (r22 == 0) goto L_0x0317
            r0 = 1
            r15.B = r0
            if (r5 != r9) goto L_0x0317
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r0 / r1
            r15.C = r10
        L_0x0317:
            int r0 = r15.B
            if (r0 != 0) goto L_0x032f
            c1.d r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x032b
            c1.d r0 = r15.N
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x032f
        L_0x032b:
            r0 = 1
            r15.B = r0
            goto L_0x0347
        L_0x032f:
            r0 = 1
            int r1 = r15.B
            if (r1 != r0) goto L_0x0347
            c1.d r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0344
            c1.d r0 = r15.M
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x0347
        L_0x0344:
            r0 = 0
            r15.B = r0
        L_0x0347:
            int r0 = r15.B
            r1 = -1
            if (r0 != r1) goto L_0x039b
            c1.d r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x036c
            c1.d r0 = r15.N
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x036c
            c1.d r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x036c
            c1.d r0 = r15.M
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x039b
        L_0x036c:
            c1.d r0 = r15.L
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0380
            c1.d r0 = r15.N
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0380
            r0 = 0
            r15.B = r0
            goto L_0x039b
        L_0x0380:
            c1.d r0 = r15.K
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x039b
            c1.d r0 = r15.M
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x039b
            float r0 = r15.C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r10 = r1 / r0
            r15.C = r10
            r0 = 1
            r15.B = r0
        L_0x039b:
            int r0 = r15.B
            r1 = -1
            if (r0 != r1) goto L_0x03f4
            int r0 = r15.f4461v
            if (r0 <= 0) goto L_0x03ac
            int r1 = r15.f4465y
            if (r1 != 0) goto L_0x03ac
            r1 = 0
            r15.B = r1
            goto L_0x03f4
        L_0x03ac:
            if (r0 != 0) goto L_0x03f4
            int r0 = r15.f4465y
            if (r0 <= 0) goto L_0x03f4
            float r0 = r15.C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r10 = r1 / r0
            r15.C = r10
            r0 = 1
            r15.B = r0
            goto L_0x03f4
        L_0x03be:
            r9 = 3
            if (r4 != r6) goto L_0x03d3
            if (r7 != r9) goto L_0x03d3
            r10 = 0
            r15.B = r10
            float r0 = (float) r2
            float r1 = r1 * r0
            int r1 = (int) r1
            if (r3 == r6) goto L_0x03d0
            r7 = r32
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0409
        L_0x03d0:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03f8
        L_0x03d3:
            if (r3 != r6) goto L_0x03f4
            if (r8 != r9) goto L_0x03f4
            r2 = 1
            r15.B = r2
            r2 = -1
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r2) goto L_0x03e3
            float r1 = r10 / r1
            r15.C = r1
        L_0x03e3:
            float r1 = r15.C
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r4 == r6) goto L_0x03f1
            r25 = r0
            r1 = r24
            r8 = r32
            goto L_0x0409
        L_0x03f1:
            r1 = r24
            goto L_0x03fa
        L_0x03f4:
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r24
        L_0x03f8:
            r0 = r25
        L_0x03fa:
            r34 = r0
            r37 = r7
            r36 = r8
            r32 = 1
            goto L_0x0411
        L_0x0403:
            r35 = r9
        L_0x0405:
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r24
        L_0x0409:
            r37 = r7
            r36 = r8
            r34 = r25
            r32 = 0
        L_0x0411:
            int[] r0 = r15.f4459u
            r2 = 0
            r0[r2] = r37
            r2 = 1
            r0[r2] = r36
            if (r32 == 0) goto L_0x0425
            int r0 = r15.B
            r2 = -1
            if (r0 == 0) goto L_0x0422
            if (r0 != r2) goto L_0x0426
        L_0x0422:
            r17 = 1
            goto L_0x0428
        L_0x0425:
            r2 = -1
        L_0x0426:
            r17 = 0
        L_0x0428:
            if (r32 == 0) goto L_0x0434
            int r0 = r15.B
            r3 = 1
            if (r0 == r3) goto L_0x0431
            if (r0 != r2) goto L_0x0434
        L_0x0431:
            r38 = 1
            goto L_0x0436
        L_0x0434:
            r38 = 0
        L_0x0436:
            c1.e$a[] r0 = r15.V
            r2 = 0
            r0 = r0[r2]
            if (r0 != r13) goto L_0x0443
            boolean r0 = r15 instanceof c1.f
            if (r0 == 0) goto L_0x0443
            r9 = 1
            goto L_0x0444
        L_0x0443:
            r9 = 0
        L_0x0444:
            if (r9 == 0) goto L_0x0449
            r21 = 0
            goto L_0x044b
        L_0x0449:
            r21 = r1
        L_0x044b:
            c1.d r0 = r15.R
            boolean r0 = r0.h()
            r1 = 1
            r39 = r0 ^ 1
            boolean[] r0 = r15.U
            r2 = 0
            boolean r22 = r0[r2]
            boolean r40 = r0[r1]
            int r0 = r15.f4449p
            r41 = 0
            r7 = 2
            if (r0 == r7) goto L_0x0540
            boolean r0 = r15.f4441l
            if (r0 != 0) goto L_0x0540
            if (r59 == 0) goto L_0x04ab
            d1.l r0 = r15.f4425d
            if (r0 == 0) goto L_0x04ab
            d1.f r1 = r0.f8535h
            boolean r2 = r1.f8512j
            if (r2 == 0) goto L_0x04ab
            d1.f r0 = r0.f8536i
            boolean r0 = r0.f8512j
            if (r0 != 0) goto L_0x0479
            goto L_0x04ab
        L_0x0479:
            if (r59 == 0) goto L_0x0540
            int r0 = r1.f8509g
            r14.d(r12, r0)
            d1.l r0 = r15.f4425d
            d1.f r0 = r0.f8536i
            int r0 = r0.f8509g
            r14.d(r11, r0)
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x0540
            if (r29 == 0) goto L_0x0540
            boolean[] r0 = r15.f4429f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0540
            boolean r0 = r57.B()
            if (r0 != 0) goto L_0x0540
            c1.e r0 = r15.W
            c1.d r0 = r0.M
            a1.g r0 = r14.k(r0)
            r4 = 8
            r14.f(r0, r11, r1, r4)
            goto L_0x0540
        L_0x04ab:
            r4 = 8
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x04b9
            c1.d r0 = r0.M
            a1.g r0 = r14.k(r0)
            r8 = r0
            goto L_0x04bb
        L_0x04b9:
            r8 = r41
        L_0x04bb:
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x04c8
            c1.d r0 = r0.K
            a1.g r0 = r14.k(r0)
            r16 = r0
            goto L_0x04ca
        L_0x04c8:
            r16 = r41
        L_0x04ca:
            boolean[] r0 = r15.f4429f
            r19 = 0
            boolean r5 = r0[r19]
            c1.e$a[] r0 = r15.V
            r20 = r0[r19]
            c1.d r3 = r15.K
            c1.d r1 = r15.M
            int r2 = r15.f4422b0
            r42 = r2
            int r2 = r15.f4428e0
            int[] r4 = r15.D
            r44 = r4[r19]
            float r4 = r15.f4432g0
            r23 = 1
            r0 = r0[r23]
            if (r0 != r6) goto L_0x04ed
            r45 = r23
            goto L_0x04ef
        L_0x04ed:
            r45 = r19
        L_0x04ef:
            int r0 = r15.f4461v
            r24 = r0
            int r0 = r15.f4463w
            r25 = r0
            float r0 = r15.f4464x
            r26 = r0
            r0 = 1
            r46 = r2
            r2 = r0
            r0 = r57
            r47 = r1
            r1 = r58
            r18 = r3
            r3 = r29
            r43 = r4
            r4 = r28
            r48 = r6
            r6 = r16
            r7 = r8
            r49 = r27
            r8 = r20
            r50 = r35
            r51 = r33
            r10 = r18
            r52 = r11
            r11 = r47
            r53 = r12
            r12 = r42
            r54 = r13
            r13 = r21
            r14 = r46
            r15 = r44
            r16 = r43
            r18 = r45
            r19 = r31
            r20 = r30
            r21 = r22
            r22 = r37
            r23 = r36
            r27 = r39
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x054e
        L_0x0540:
            r48 = r6
            r52 = r11
            r53 = r12
            r54 = r13
            r49 = r27
            r51 = r33
            r50 = r35
        L_0x054e:
            if (r59 == 0) goto L_0x05b4
            r15 = r57
            d1.n r0 = r15.f4427e
            if (r0 == 0) goto L_0x05a7
            d1.f r1 = r0.f8535h
            boolean r2 = r1.f8512j
            if (r2 == 0) goto L_0x05a7
            d1.f r0 = r0.f8536i
            boolean r0 = r0.f8512j
            if (r0 == 0) goto L_0x05a7
            int r0 = r1.f8509g
            r14 = r58
            r13 = r51
            r14.d(r13, r0)
            d1.n r0 = r15.f4427e
            d1.f r0 = r0.f8536i
            int r0 = r0.f8509g
            r12 = r50
            r14.d(r12, r0)
            d1.n r0 = r15.f4427e
            d1.f r0 = r0.f8520k
            int r0 = r0.f8509g
            r1 = r49
            r14.d(r1, r0)
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x05a1
            if (r30 != 0) goto L_0x05a1
            if (r28 == 0) goto L_0x05a1
            boolean[] r2 = r15.f4429f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x059d
            c1.d r0 = r0.N
            a1.g r0 = r14.k(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x05a5
        L_0x059d:
            r2 = 8
            r10 = 0
            goto L_0x05a5
        L_0x05a1:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x05a5:
            r6 = r10
            goto L_0x05c3
        L_0x05a7:
            r14 = r58
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x05c2
        L_0x05b4:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r57
            r14 = r58
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x05c2:
            r6 = r11
        L_0x05c3:
            int r0 = r15.f4451q
            r3 = 2
            if (r0 != r3) goto L_0x05c9
            r6 = r10
        L_0x05c9:
            if (r6 == 0) goto L_0x06a2
            boolean r0 = r15.f4443m
            if (r0 != 0) goto L_0x06a2
            c1.e$a[] r0 = r15.V
            r0 = r0[r11]
            r3 = r54
            if (r0 != r3) goto L_0x05dd
            boolean r0 = r15 instanceof c1.f
            if (r0 == 0) goto L_0x05dd
            r9 = r11
            goto L_0x05de
        L_0x05dd:
            r9 = r10
        L_0x05de:
            if (r9 == 0) goto L_0x05e2
            r34 = r10
        L_0x05e2:
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x05ee
            c1.d r0 = r0.N
            a1.g r0 = r14.k(r0)
            r7 = r0
            goto L_0x05f0
        L_0x05ee:
            r7 = r41
        L_0x05f0:
            c1.e r0 = r15.W
            if (r0 == 0) goto L_0x05fc
            c1.d r0 = r0.L
            a1.g r0 = r14.k(r0)
            r6 = r0
            goto L_0x05fe
        L_0x05fc:
            r6 = r41
        L_0x05fe:
            int r0 = r15.f4426d0
            if (r0 > 0) goto L_0x0606
            int r3 = r15.f4438j0
            if (r3 != r2) goto L_0x063e
        L_0x0606:
            c1.d r3 = r15.O
            c1.d r4 = r3.f4406f
            if (r4 == 0) goto L_0x062f
            r14.e(r1, r13, r0, r2)
            c1.d r0 = r15.O
            c1.d r0 = r0.f4406f
            a1.g r0 = r14.k(r0)
            c1.d r3 = r15.O
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x062c
            c1.d r0 = r15.N
            a1.g r0 = r14.k(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x062c:
            r27 = r10
            goto L_0x0640
        L_0x062f:
            int r4 = r15.f4438j0
            if (r4 != r2) goto L_0x063b
            int r0 = r3.e()
            r14.e(r1, r13, r0, r2)
            goto L_0x063e
        L_0x063b:
            r14.e(r1, r13, r0, r2)
        L_0x063e:
            r27 = r39
        L_0x0640:
            boolean[] r0 = r15.f4429f
            boolean r5 = r0[r11]
            c1.e$a[] r0 = r15.V
            r8 = r0[r11]
            c1.d r4 = r15.L
            c1.d r3 = r15.N
            int r1 = r15.f4424c0
            int r2 = r15.f4430f0
            int[] r10 = r15.D
            r16 = r10[r11]
            float r10 = r15.f4434h0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0661
            r18 = 1
            goto L_0x0663
        L_0x0661:
            r18 = r17
        L_0x0663:
            int r0 = r15.f4465y
            r24 = r0
            int r0 = r15.f4466z
            r25 = r0
            float r0 = r15.A
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r57
            r20 = r1
            r1 = r58
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r55 = r12
            r12 = r20
            r56 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r38
            r19 = r30
            r20 = r31
            r21 = r40
            r22 = r36
            r23 = r37
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06a6
        L_0x06a2:
            r55 = r12
            r56 = r13
        L_0x06a6:
            if (r32 == 0) goto L_0x0707
            r0 = r57
            int r1 = r0.B
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x06dc
            float r1 = r0.C
            a1.b r3 = r58.l()
            a1.b$a r4 = r3.f22d
            r5 = r55
            r4.j(r5, r2)
            a1.b$a r2 = r3.f22d
            r4 = r56
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.j(r4, r6)
            a1.b$a r2 = r3.f22d
            r7 = r52
            r2.j(r7, r1)
            a1.b$a r2 = r3.f22d
            float r1 = -r1
            r8 = r53
            r2.j(r8, r1)
            r1 = r58
            r1.c(r3)
            goto L_0x070b
        L_0x06dc:
            r1 = r58
            r7 = r52
            r8 = r53
            r5 = r55
            r4 = r56
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.C
            a1.b r9 = r58.l()
            a1.b$a r10 = r9.f22d
            r10.j(r7, r2)
            a1.b$a r2 = r9.f22d
            r2.j(r8, r6)
            a1.b$a r2 = r9.f22d
            r2.j(r5, r3)
            a1.b$a r2 = r9.f22d
            float r3 = -r3
            r2.j(r4, r3)
            r1.c(r9)
            goto L_0x070b
        L_0x0707:
            r0 = r57
            r1 = r58
        L_0x070b:
            c1.d r2 = r0.R
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x07c9
            c1.d r2 = r0.R
            c1.d r2 = r2.f4406f
            c1.e r2 = r2.f4404d
            float r3 = r0.E
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            float r3 = (float) r3
            c1.d r4 = r0.R
            int r4 = r4.e()
            c1.d$a r5 = c1.d.a.LEFT
            c1.d r6 = r0.m(r5)
            a1.g r6 = r1.k(r6)
            c1.d$a r7 = c1.d.a.TOP
            c1.d r8 = r0.m(r7)
            a1.g r8 = r1.k(r8)
            c1.d$a r9 = c1.d.a.RIGHT
            c1.d r10 = r0.m(r9)
            a1.g r10 = r1.k(r10)
            c1.d$a r11 = c1.d.a.BOTTOM
            c1.d r12 = r0.m(r11)
            a1.g r12 = r1.k(r12)
            c1.d r5 = r2.m(r5)
            a1.g r5 = r1.k(r5)
            c1.d r7 = r2.m(r7)
            a1.g r7 = r1.k(r7)
            c1.d r9 = r2.m(r9)
            a1.g r9 = r1.k(r9)
            c1.d r2 = r2.m(r11)
            a1.g r2 = r1.k(r2)
            a1.b r11 = r58.l()
            double r13 = (double) r3
            double r15 = java.lang.Math.sin(r13)
            double r3 = (double) r4
            r17 = r9
            r59 = r10
            double r9 = r15 * r3
            float r9 = (float) r9
            a1.b$a r10 = r11.f22d
            r15 = 1056964608(0x3f000000, float:0.5)
            r10.j(r7, r15)
            a1.b$a r7 = r11.f22d
            r7.j(r2, r15)
            a1.b$a r2 = r11.f22d
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2.j(r8, r7)
            a1.b$a r2 = r11.f22d
            r2.j(r12, r7)
            float r2 = -r9
            r11.f20b = r2
            r1.c(r11)
            a1.b r2 = r58.l()
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r3
            float r3 = (float) r8
            a1.b$a r4 = r2.f22d
            r4.j(r5, r15)
            a1.b$a r4 = r2.f22d
            r5 = r17
            r4.j(r5, r15)
            a1.b$a r4 = r2.f22d
            r4.j(r6, r7)
            a1.b$a r4 = r2.f22d
            r5 = r59
            r4.j(r5, r7)
            float r3 = -r3
            r2.f20b = r3
            r1.c(r2)
        L_0x07c9:
            r1 = 0
            r0.f4441l = r1
            r0.f4443m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e.e(a1.d, boolean):void");
    }

    public boolean f() {
        if (this.f4438j0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x042b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(a1.d r36, boolean r37, boolean r38, boolean r39, boolean r40, a1.g r41, a1.g r42, c1.e.a r43, boolean r44, c1.d r45, c1.d r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, int r59, int r60, float r61, boolean r62) {
        /*
            r35 = this;
            r0 = r35
            r10 = r36
            r11 = r41
            r12 = r42
            r13 = r45
            r14 = r46
            r15 = r49
            r1 = r50
            r2 = r58
            r3 = r59
            r4 = r60
            r5 = r61
            c1.d$a r6 = c1.d.a.BOTTOM
            a1.g r9 = r10.k(r13)
            a1.g r8 = r10.k(r14)
            c1.d r7 = r13.f4406f
            a1.g r7 = r10.k(r7)
            c1.d r12 = r14.f4406f
            a1.g r12 = r10.k(r12)
            boolean r16 = r45.h()
            boolean r17 = r46.h()
            c1.d r2 = r0.R
            boolean r2 = r2.h()
            if (r17 == 0) goto L_0x0041
            int r18 = r16 + 1
            goto L_0x0043
        L_0x0041:
            r18 = r16
        L_0x0043:
            if (r2 == 0) goto L_0x0047
            int r18 = r18 + 1
        L_0x0047:
            r14 = r18
            if (r52 == 0) goto L_0x004f
            r19 = r12
            r11 = 3
            goto L_0x0053
        L_0x004f:
            r11 = r57
            r19 = r12
        L_0x0053:
            int r12 = r43.ordinal()
            r5 = 1
            r20 = r6
            if (r12 == 0) goto L_0x0067
            if (r12 == r5) goto L_0x0067
            r5 = 2
            if (r12 == r5) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r5 = 4
            if (r11 == r5) goto L_0x0068
            r12 = 1
            goto L_0x0069
        L_0x0067:
            r5 = 4
        L_0x0068:
            r12 = 0
        L_0x0069:
            int r5 = r0.f4435i
            r6 = -1
            if (r5 == r6) goto L_0x0075
            if (r37 == 0) goto L_0x0075
            r0.f4435i = r6
            r48 = r5
            r12 = 0
        L_0x0075:
            int r5 = r0.f4437j
            if (r5 == r6) goto L_0x007f
            if (r37 != 0) goto L_0x007f
            r0.f4437j = r6
            r12 = 0
            goto L_0x0081
        L_0x007f:
            r5 = r48
        L_0x0081:
            int r6 = r0.f4438j0
            r48 = r12
            r12 = 8
            if (r6 != r12) goto L_0x008c
            r5 = 0
            r6 = 0
            goto L_0x008e
        L_0x008c:
            r6 = r48
        L_0x008e:
            if (r62 == 0) goto L_0x00b1
            if (r16 != 0) goto L_0x009c
            if (r17 != 0) goto L_0x009c
            if (r2 != 0) goto L_0x009c
            r12 = r47
            r10.d(r9, r12)
            goto L_0x00ac
        L_0x009c:
            if (r16 == 0) goto L_0x00ac
            if (r17 != 0) goto L_0x00ac
            int r12 = r45.e()
            r24 = r2
            r2 = 8
            r10.e(r9, r7, r12, r2)
            goto L_0x00b4
        L_0x00ac:
            r24 = r2
            r2 = 8
            goto L_0x00b4
        L_0x00b1:
            r24 = r2
            r2 = r12
        L_0x00b4:
            if (r6 != 0) goto L_0x00d5
            if (r44 == 0) goto L_0x00cd
            r2 = 0
            r12 = 3
            r10.e(r8, r9, r2, r12)
            r2 = 8
            if (r15 <= 0) goto L_0x00c4
            r10.f(r8, r9, r15, r2)
        L_0x00c4:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r5) goto L_0x00d1
            r10.g(r8, r9, r1, r2)
            goto L_0x00d1
        L_0x00cd:
            r12 = 3
            r10.e(r8, r9, r5, r2)
        L_0x00d1:
            r1 = r4
            r4 = 2
            goto L_0x01c0
        L_0x00d5:
            r1 = 2
            r12 = 3
            if (r14 == r1) goto L_0x00f9
            if (r52 != 0) goto L_0x00f9
            r1 = 1
            if (r11 == r1) goto L_0x00e0
            if (r11 != 0) goto L_0x00f9
        L_0x00e0:
            int r1 = java.lang.Math.max(r3, r5)
            if (r4 <= 0) goto L_0x00ea
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00ea:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r12 = r40
            r20 = r3
            r1 = r4
            r4 = 2
            r25 = 0
            goto L_0x01d3
        L_0x00f9:
            r1 = -2
            if (r3 != r1) goto L_0x00fd
            r3 = r5
        L_0x00fd:
            if (r4 != r1) goto L_0x0100
            r4 = r5
        L_0x0100:
            if (r5 <= 0) goto L_0x0106
            r1 = 1
            if (r11 == r1) goto L_0x0106
            r5 = 0
        L_0x0106:
            if (r3 <= 0) goto L_0x0111
            r1 = 8
            r10.f(r8, r9, r3, r1)
            int r5 = java.lang.Math.max(r5, r3)
        L_0x0111:
            if (r4 <= 0) goto L_0x012a
            if (r38 == 0) goto L_0x011a
            r1 = 1
            if (r11 != r1) goto L_0x011a
            r1 = 0
            goto L_0x011b
        L_0x011a:
            r1 = 1
        L_0x011b:
            if (r1 == 0) goto L_0x0123
            r1 = 8
            r10.g(r8, r9, r4, r1)
            goto L_0x0125
        L_0x0123:
            r1 = 8
        L_0x0125:
            int r5 = java.lang.Math.min(r5, r4)
            goto L_0x012c
        L_0x012a:
            r1 = 8
        L_0x012c:
            r2 = 1
            if (r11 != r2) goto L_0x014d
            if (r38 == 0) goto L_0x013b
            r10.e(r8, r9, r5, r1)
        L_0x0134:
            r44 = r3
            r43 = r4
            r4 = 2
            goto L_0x01bc
        L_0x013b:
            if (r54 == 0) goto L_0x0145
            r2 = 5
            r10.e(r8, r9, r5, r2)
            r10.g(r8, r9, r5, r1)
            goto L_0x0134
        L_0x0145:
            r2 = 5
            r10.e(r8, r9, r5, r2)
            r10.g(r8, r9, r5, r1)
            goto L_0x0134
        L_0x014d:
            r1 = 2
            if (r11 != r1) goto L_0x01c7
            c1.d$a r2 = r13.f4405e
            c1.d$a r5 = c1.d.a.TOP
            r1 = r20
            if (r2 == r5) goto L_0x0174
            if (r2 != r1) goto L_0x015b
            goto L_0x0174
        L_0x015b:
            c1.e r1 = r0.W
            c1.d$a r2 = c1.d.a.LEFT
            c1.d r1 = r1.m(r2)
            a1.g r1 = r10.k(r1)
            c1.e r2 = r0.W
            c1.d$a r5 = c1.d.a.RIGHT
            c1.d r2 = r2.m(r5)
            a1.g r2 = r10.k(r2)
            goto L_0x018d
        L_0x0174:
            c1.e r2 = r0.W
            c1.d r2 = r2.m(r5)
            a1.g r2 = r10.k(r2)
            c1.e r5 = r0.W
            c1.d r1 = r5.m(r1)
            a1.g r1 = r10.k(r1)
            r34 = r2
            r2 = r1
            r1 = r34
        L_0x018d:
            a1.b r5 = r36.l()
            a1.b$a r12 = r5.f22d
            r44 = r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.j(r8, r3)
            a1.b$a r3 = r5.f22d
            r12 = 1065353216(0x3f800000, float:1.0)
            r3.j(r9, r12)
            a1.b$a r3 = r5.f22d
            r12 = r61
            r43 = r4
            r4 = 2
            r3.j(r2, r12)
            a1.b$a r2 = r5.f22d
            float r3 = -r12
            r2.j(r1, r3)
            r10.c(r5)
            if (r38 == 0) goto L_0x01bc
            r1 = r43
            r3 = r44
            r6 = 0
            goto L_0x01c0
        L_0x01bc:
            r1 = r43
            r3 = r44
        L_0x01c0:
            r12 = r40
            r20 = r3
            r25 = r6
            goto L_0x01d3
        L_0x01c7:
            r44 = r3
            r43 = r4
            r4 = r1
            r1 = r43
            r20 = r44
            r25 = r6
            r12 = 1
        L_0x01d3:
            if (r62 == 0) goto L_0x0512
            if (r54 == 0) goto L_0x01e6
            r5 = r41
            r1 = r42
            r7 = r4
            r4 = r8
            r3 = r9
            r40 = r12
            r6 = r14
            r2 = 0
            r31 = 1
            goto L_0x051f
        L_0x01e6:
            if (r16 != 0) goto L_0x01f4
            if (r17 != 0) goto L_0x01f4
            if (r24 != 0) goto L_0x01f4
            r11 = r46
            r4 = r8
            r40 = r12
            r14 = r19
            goto L_0x0239
        L_0x01f4:
            if (r16 == 0) goto L_0x0213
            if (r17 != 0) goto L_0x0213
            c1.d r1 = r13.f4406f
            c1.e r1 = r1.f4404d
            if (r38 == 0) goto L_0x0205
            boolean r1 = r1 instanceof c1.a
            if (r1 == 0) goto L_0x0205
            r1 = 8
            goto L_0x0206
        L_0x0205:
            r1 = 5
        L_0x0206:
            r21 = r38
            r11 = r46
            r4 = r8
            r40 = r12
            r14 = r19
        L_0x020f:
            r2 = 0
        L_0x0210:
            r12 = r1
            goto L_0x04fa
        L_0x0213:
            if (r16 != 0) goto L_0x023d
            if (r17 == 0) goto L_0x023d
            int r1 = r46.e()
            int r1 = -r1
            r14 = r19
            r2 = 8
            r10.e(r8, r14, r1, r2)
            if (r38 == 0) goto L_0x0234
            r5 = r41
            r1 = 5
            r6 = 0
            r10.f(r9, r5, r6, r1)
            r11 = r46
            r2 = r6
            r4 = r8
            r40 = r12
            goto L_0x04f6
        L_0x0234:
            r11 = r46
            r4 = r8
            r40 = r12
        L_0x0239:
            r1 = 5
            r2 = 0
            goto L_0x04f6
        L_0x023d:
            r5 = r41
            r14 = r19
            r3 = 3
            r6 = 0
            if (r16 == 0) goto L_0x04ef
            if (r17 == 0) goto L_0x04ef
            c1.d r2 = r13.f4406f
            c1.e r2 = r2.f4404d
            r3 = r46
            c1.d r6 = r3.f4406f
            c1.e r6 = r6.f4404d
            c1.e r4 = r0.W
            r16 = 6
            if (r25 == 0) goto L_0x034e
            if (r11 != 0) goto L_0x02a6
            if (r1 != 0) goto L_0x0282
            if (r20 != 0) goto L_0x0282
            boolean r1 = r7.f59f
            if (r1 == 0) goto L_0x0277
            boolean r1 = r14.f59f
            if (r1 == 0) goto L_0x0277
            int r1 = r45.e()
            r2 = 8
            r10.e(r9, r7, r1, r2)
            int r1 = r46.e()
            int r1 = -r1
            r10.e(r8, r14, r1, r2)
            return
        L_0x0277:
            r37 = 8
            r17 = 8
            r19 = 1
            r23 = 0
            r24 = 0
            goto L_0x028c
        L_0x0282:
            r37 = 5
            r17 = 5
            r19 = 0
            r23 = 1
            r24 = 1
        L_0x028c:
            boolean r1 = r2 instanceof c1.a
            if (r1 != 0) goto L_0x029f
            boolean r1 = r6 instanceof c1.a
            if (r1 == 0) goto L_0x0295
            goto L_0x029f
        L_0x0295:
            r1 = r37
            r21 = r16
            r26 = r17
            r13 = 1
            r17 = r11
            goto L_0x02e8
        L_0x029f:
            r1 = r37
            r17 = r11
            r13 = 1
            goto L_0x032a
        L_0x02a6:
            r13 = 2
            if (r11 != r13) goto L_0x02b7
            boolean r1 = r2 instanceof c1.a
            if (r1 != 0) goto L_0x02b4
            boolean r1 = r6 instanceof c1.a
            if (r1 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r1 = 5
            goto L_0x02b5
        L_0x02b4:
            r1 = 4
        L_0x02b5:
            r13 = 5
            goto L_0x02bd
        L_0x02b7:
            r13 = 1
            if (r11 != r13) goto L_0x02c4
            r1 = 4
            r13 = 8
        L_0x02bd:
            r17 = r11
            r11 = r16
            r19 = 0
            goto L_0x02de
        L_0x02c4:
            r13 = 3
            if (r11 != r13) goto L_0x033f
            int r13 = r0.B
            r17 = r11
            r11 = -1
            if (r13 != r11) goto L_0x02ec
            if (r55 == 0) goto L_0x02d6
            if (r38 == 0) goto L_0x02d4
            r1 = 5
            goto L_0x02d8
        L_0x02d4:
            r1 = 4
            goto L_0x02d8
        L_0x02d6:
            r1 = 8
        L_0x02d8:
            r11 = r1
            r1 = 5
            r13 = 8
            r19 = 1
        L_0x02de:
            r26 = r1
            r21 = r11
            r1 = r13
            r13 = 1
            r23 = 1
            r24 = 1
        L_0x02e8:
            r11 = r42
            goto L_0x039e
        L_0x02ec:
            if (r52 == 0) goto L_0x030f
            r11 = r58
            r13 = 2
            if (r11 == r13) goto L_0x02f9
            r13 = 1
            if (r11 != r13) goto L_0x02f7
            goto L_0x02fa
        L_0x02f7:
            r1 = 0
            goto L_0x02fb
        L_0x02f9:
            r13 = 1
        L_0x02fa:
            r1 = r13
        L_0x02fb:
            if (r1 != 0) goto L_0x0301
            r1 = 5
            r11 = 8
            goto L_0x0303
        L_0x0301:
            r1 = 4
            r11 = 5
        L_0x0303:
            r26 = r1
            r1 = r11
            r19 = r13
            r23 = r19
            r24 = r23
            r21 = r16
            goto L_0x02e8
        L_0x030f:
            r13 = 1
            if (r1 <= 0) goto L_0x0314
            r1 = 5
            goto L_0x0331
        L_0x0314:
            if (r1 != 0) goto L_0x0330
            if (r20 != 0) goto L_0x0330
            if (r55 != 0) goto L_0x031d
            r1 = 8
            goto L_0x0331
        L_0x031d:
            if (r2 == r4) goto L_0x0323
            if (r6 == r4) goto L_0x0323
            r1 = 4
            goto L_0x0324
        L_0x0323:
            r1 = 5
        L_0x0324:
            r19 = r13
            r23 = r19
            r24 = r23
        L_0x032a:
            r11 = r42
            r21 = r16
            goto L_0x039c
        L_0x0330:
            r1 = 4
        L_0x0331:
            r11 = r42
            r26 = r1
            r19 = r13
            r23 = r19
            r24 = r23
            r21 = r16
            r1 = 5
            goto L_0x039e
        L_0x033f:
            r17 = r11
            r13 = 1
            r11 = r42
            r21 = r16
            r1 = 5
            r19 = 0
            r23 = 0
            r24 = 0
            goto L_0x039c
        L_0x034e:
            r17 = r11
            r13 = 1
            boolean r1 = r7.f59f
            if (r1 == 0) goto L_0x0391
            boolean r1 = r14.f59f
            if (r1 == 0) goto L_0x0391
            int r1 = r45.e()
            int r2 = r46.e()
            r4 = 8
            r52 = r36
            r53 = r9
            r54 = r7
            r55 = r1
            r56 = r51
            r57 = r14
            r58 = r8
            r59 = r2
            r60 = r4
            r52.b(r53, r54, r55, r56, r57, r58, r59, r60)
            if (r38 == 0) goto L_0x0390
            if (r12 == 0) goto L_0x0390
            c1.d r1 = r3.f4406f
            if (r1 == 0) goto L_0x0387
            int r6 = r46.e()
            r11 = r42
            goto L_0x038a
        L_0x0387:
            r11 = r42
            r6 = 0
        L_0x038a:
            if (r14 == r11) goto L_0x0390
            r1 = 5
            r10.f(r11, r8, r6, r1)
        L_0x0390:
            return
        L_0x0391:
            r11 = r42
            r23 = r13
            r24 = r23
            r21 = r16
            r1 = 5
            r19 = 0
        L_0x039c:
            r26 = 4
        L_0x039e:
            if (r23 == 0) goto L_0x03a9
            if (r7 != r14) goto L_0x03a9
            if (r2 == r4) goto L_0x03a9
            r23 = 0
            r27 = 0
            goto L_0x03ad
        L_0x03a9:
            r27 = r23
            r23 = r13
        L_0x03ad:
            if (r24 == 0) goto L_0x03fb
            if (r25 != 0) goto L_0x03c2
            if (r53 != 0) goto L_0x03c2
            if (r55 != 0) goto L_0x03c2
            if (r7 != r5) goto L_0x03c2
            if (r14 != r11) goto L_0x03c2
            r21 = 0
            r23 = 8
            r24 = 0
            r28 = 8
            goto L_0x03ca
        L_0x03c2:
            r28 = r21
            r24 = r23
            r21 = r38
            r23 = r1
        L_0x03ca:
            int r29 = r45.e()
            int r30 = r46.e()
            r1 = r36
            r13 = r2
            r2 = r9
            r11 = r3
            r40 = r12
            r12 = 3
            r3 = r7
            r12 = r4
            r4 = r29
            r15 = r5
            r29 = 4
            r31 = 1
            r5 = r51
            r15 = r6
            r6 = r14
            r22 = r12
            r12 = r7
            r7 = r8
            r32 = r8
            r8 = r30
            r33 = r9
            r9 = r28
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r23
            r5 = r24
            goto L_0x040f
        L_0x03fb:
            r11 = r3
            r22 = r4
            r15 = r6
            r32 = r8
            r33 = r9
            r40 = r12
            r31 = r13
            r29 = 4
            r13 = r2
            r12 = r7
            r21 = r38
            r5 = r23
        L_0x040f:
            int r2 = r0.f4438j0
            r3 = 8
            if (r2 != r3) goto L_0x0429
            java.util.HashSet<c1.d> r2 = r11.f4401a
            if (r2 != 0) goto L_0x041b
            r6 = 0
            goto L_0x0426
        L_0x041b:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0424
            r2 = r31
            goto L_0x0425
        L_0x0424:
            r2 = 0
        L_0x0425:
            r6 = r2
        L_0x0426:
            if (r6 != 0) goto L_0x0429
            return
        L_0x0429:
            if (r27 == 0) goto L_0x044f
            if (r21 == 0) goto L_0x043b
            if (r12 == r14) goto L_0x043b
            if (r25 != 0) goto L_0x043b
            boolean r2 = r13 instanceof c1.a
            if (r2 != 0) goto L_0x0439
            boolean r2 = r15 instanceof c1.a
            if (r2 == 0) goto L_0x043b
        L_0x0439:
            r1 = r16
        L_0x043b:
            int r2 = r45.e()
            r3 = r33
            r10.f(r3, r12, r2, r1)
            int r2 = r46.e()
            int r2 = -r2
            r4 = r32
            r10.g(r4, r14, r2, r1)
            goto L_0x0453
        L_0x044f:
            r4 = r32
            r3 = r33
        L_0x0453:
            if (r21 == 0) goto L_0x0469
            if (r56 == 0) goto L_0x0469
            boolean r2 = r13 instanceof c1.a
            if (r2 != 0) goto L_0x0469
            boolean r2 = r15 instanceof c1.a
            if (r2 != 0) goto L_0x0469
            r2 = r22
            if (r15 == r2) goto L_0x046b
            r1 = r16
            r6 = r1
            r5 = r31
            goto L_0x046d
        L_0x0469:
            r2 = r22
        L_0x046b:
            r6 = r26
        L_0x046d:
            if (r5 == 0) goto L_0x04bb
            if (r19 == 0) goto L_0x049b
            if (r55 == 0) goto L_0x0475
            if (r39 == 0) goto L_0x049b
        L_0x0475:
            if (r13 == r2) goto L_0x047c
            if (r15 != r2) goto L_0x047a
            goto L_0x047c
        L_0x047a:
            r16 = r6
        L_0x047c:
            boolean r5 = r13 instanceof c1.h
            if (r5 != 0) goto L_0x0484
            boolean r5 = r15 instanceof c1.h
            if (r5 == 0) goto L_0x0486
        L_0x0484:
            r16 = 5
        L_0x0486:
            boolean r5 = r13 instanceof c1.a
            if (r5 != 0) goto L_0x048e
            boolean r5 = r15 instanceof c1.a
            if (r5 == 0) goto L_0x0490
        L_0x048e:
            r16 = 5
        L_0x0490:
            if (r55 == 0) goto L_0x0494
            r5 = 5
            goto L_0x0496
        L_0x0494:
            r5 = r16
        L_0x0496:
            int r5 = java.lang.Math.max(r5, r6)
            goto L_0x049c
        L_0x049b:
            r5 = r6
        L_0x049c:
            if (r21 == 0) goto L_0x04ac
            int r5 = java.lang.Math.min(r1, r5)
            if (r52 == 0) goto L_0x04ac
            if (r55 != 0) goto L_0x04ac
            if (r13 == r2) goto L_0x04aa
            if (r15 != r2) goto L_0x04ac
        L_0x04aa:
            r5 = r29
        L_0x04ac:
            int r1 = r45.e()
            r10.e(r3, r12, r1, r5)
            int r1 = r46.e()
            int r1 = -r1
            r10.e(r4, r14, r1, r5)
        L_0x04bb:
            if (r21 == 0) goto L_0x04cd
            r1 = r41
            if (r1 != r12) goto L_0x04c6
            int r6 = r45.e()
            goto L_0x04c7
        L_0x04c6:
            r6 = 0
        L_0x04c7:
            if (r12 == r1) goto L_0x04cd
            r2 = 5
            r10.f(r3, r1, r6, r2)
        L_0x04cd:
            if (r21 == 0) goto L_0x04ec
            if (r25 == 0) goto L_0x04ec
            if (r49 != 0) goto L_0x04ec
            if (r20 != 0) goto L_0x04ec
            if (r25 == 0) goto L_0x04e5
            r1 = r17
            r2 = 3
            if (r1 != r2) goto L_0x04e5
            r1 = 8
            r2 = 0
            r10.f(r4, r3, r2, r1)
            r1 = 5
            goto L_0x0210
        L_0x04e5:
            r2 = 0
            r1 = 5
            r10.f(r4, r3, r2, r1)
            goto L_0x0210
        L_0x04ec:
            r1 = 5
            goto L_0x020f
        L_0x04ef:
            r11 = r46
            r2 = r6
            r4 = r8
            r40 = r12
            r1 = 5
        L_0x04f6:
            r21 = r38
            goto L_0x0210
        L_0x04fa:
            if (r21 == 0) goto L_0x0511
            if (r40 == 0) goto L_0x0511
            c1.d r1 = r11.f4406f
            if (r1 == 0) goto L_0x0509
            int r6 = r46.e()
            r1 = r42
            goto L_0x050c
        L_0x0509:
            r1 = r42
            r6 = r2
        L_0x050c:
            if (r14 == r1) goto L_0x0511
            r10.f(r1, r4, r6, r12)
        L_0x0511:
            return
        L_0x0512:
            r5 = r41
            r1 = r42
            r4 = r8
            r3 = r9
            r40 = r12
            r6 = r14
            r2 = 0
            r31 = 1
            r7 = 2
        L_0x051f:
            if (r6 >= r7) goto L_0x055f
            if (r38 == 0) goto L_0x055f
            if (r40 == 0) goto L_0x055f
            r6 = 8
            r10.f(r3, r5, r2, r6)
            if (r37 != 0) goto L_0x0535
            c1.d r3 = r0.O
            c1.d r3 = r3.f4406f
            if (r3 != 0) goto L_0x0533
            goto L_0x0535
        L_0x0533:
            r5 = r2
            goto L_0x0537
        L_0x0535:
            r5 = r31
        L_0x0537:
            if (r37 != 0) goto L_0x0558
            c1.d r3 = r0.O
            c1.d r3 = r3.f4406f
            if (r3 == 0) goto L_0x0558
            c1.e r3 = r3.f4404d
            float r5 = r3.Z
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0557
            c1.e$a[] r3 = r3.V
            r5 = r3[r2]
            c1.e$a r6 = c1.e.a.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0557
            r3 = r3[r31]
            if (r3 != r6) goto L_0x0557
            r5 = r31
            goto L_0x0558
        L_0x0557:
            r5 = r2
        L_0x0558:
            if (r5 == 0) goto L_0x055f
            r3 = 8
            r10.f(r1, r4, r2, r3)
        L_0x055f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e.g(a1.d, boolean, boolean, boolean, boolean, a1.g, a1.g, c1.e$a, boolean, c1.d, c1.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void h(d.a aVar, e eVar, d.a aVar2, int i10) {
        boolean z10;
        d.a aVar3 = d.a.CENTER_Y;
        d.a aVar4 = d.a.CENTER_X;
        d.a aVar5 = d.a.LEFT;
        d.a aVar6 = d.a.TOP;
        d.a aVar7 = d.a.RIGHT;
        d.a aVar8 = d.a.BOTTOM;
        d.a aVar9 = d.a.CENTER;
        if (aVar == aVar9) {
            if (aVar2 == aVar9) {
                d m10 = m(aVar5);
                d m11 = m(aVar7);
                d m12 = m(aVar6);
                d m13 = m(aVar8);
                boolean z11 = true;
                if ((m10 == null || !m10.h()) && (m11 == null || !m11.h())) {
                    h(aVar5, eVar, aVar5, 0);
                    h(aVar7, eVar, aVar7, 0);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((m12 == null || !m12.h()) && (m13 == null || !m13.h())) {
                    h(aVar6, eVar, aVar6, 0);
                    h(aVar8, eVar, aVar8, 0);
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    m(aVar9).a(eVar.m(aVar9), 0);
                } else if (z10) {
                    m(aVar4).a(eVar.m(aVar4), 0);
                } else if (z11) {
                    m(aVar3).a(eVar.m(aVar3), 0);
                }
            } else if (aVar2 == aVar5 || aVar2 == aVar7) {
                h(aVar5, eVar, aVar2, 0);
                h(aVar7, eVar, aVar2, 0);
                m(aVar9).a(eVar.m(aVar2), 0);
            } else if (aVar2 == aVar6 || aVar2 == aVar8) {
                h(aVar6, eVar, aVar2, 0);
                h(aVar8, eVar, aVar2, 0);
                m(aVar9).a(eVar.m(aVar2), 0);
            }
        } else if (aVar == aVar4 && (aVar2 == aVar5 || aVar2 == aVar7)) {
            d m14 = m(aVar5);
            d m15 = eVar.m(aVar2);
            d m16 = m(aVar7);
            m14.a(m15, 0);
            m16.a(m15, 0);
            m(aVar4).a(m15, 0);
        } else if (aVar == aVar3 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            d m17 = eVar.m(aVar2);
            m(aVar6).a(m17, 0);
            m(aVar8).a(m17, 0);
            m(aVar3).a(m17, 0);
        } else if (aVar == aVar4 && aVar2 == aVar4) {
            m(aVar5).a(eVar.m(aVar5), 0);
            m(aVar7).a(eVar.m(aVar7), 0);
            m(aVar4).a(eVar.m(aVar2), 0);
        } else if (aVar == aVar3 && aVar2 == aVar3) {
            m(aVar6).a(eVar.m(aVar6), 0);
            m(aVar8).a(eVar.m(aVar8), 0);
            m(aVar3).a(eVar.m(aVar2), 0);
        } else {
            d m18 = m(aVar);
            d m19 = eVar.m(aVar2);
            if (m18.i(m19)) {
                d.a aVar10 = d.a.BASELINE;
                if (aVar == aVar10) {
                    d m20 = m(aVar6);
                    d m21 = m(aVar8);
                    if (m20 != null) {
                        m20.j();
                    }
                    if (m21 != null) {
                        m21.j();
                    }
                } else if (aVar == aVar6 || aVar == aVar8) {
                    d m22 = m(aVar10);
                    if (m22 != null) {
                        m22.j();
                    }
                    d m23 = m(aVar9);
                    if (m23.f4406f != m19) {
                        m23.j();
                    }
                    d f10 = m(aVar).f();
                    d m24 = m(aVar3);
                    if (m24.h()) {
                        f10.j();
                        m24.j();
                    }
                } else if (aVar == aVar5 || aVar == aVar7) {
                    d m25 = m(aVar9);
                    if (m25.f4406f != m19) {
                        m25.j();
                    }
                    d f11 = m(aVar).f();
                    d m26 = m(aVar4);
                    if (m26.h()) {
                        f11.j();
                        m26.j();
                    }
                }
                m18.a(m19, i10);
            }
        }
    }

    public final void i(d dVar, d dVar2, int i10) {
        if (dVar.f4404d == this) {
            h(dVar.f4405e, dVar2.f4404d, dVar2.f4405e, i10);
        }
    }

    public void j(e eVar, HashMap<e, e> hashMap) {
        e eVar2;
        e eVar3;
        this.f4449p = eVar.f4449p;
        this.f4451q = eVar.f4451q;
        this.f4455s = eVar.f4455s;
        this.f4457t = eVar.f4457t;
        int[] iArr = this.f4459u;
        int[] iArr2 = eVar.f4459u;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f4461v = eVar.f4461v;
        this.f4463w = eVar.f4463w;
        this.f4465y = eVar.f4465y;
        this.f4466z = eVar.f4466z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        int[] iArr3 = eVar.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (a[]) Arrays.copyOf(this.V, 2);
        e eVar4 = null;
        if (this.W == null) {
            eVar2 = null;
        } else {
            eVar2 = hashMap.get(eVar.W);
        }
        this.W = eVar2;
        this.X = eVar.X;
        this.Y = eVar.Y;
        this.Z = eVar.Z;
        this.f4420a0 = eVar.f4420a0;
        this.f4422b0 = eVar.f4422b0;
        this.f4424c0 = eVar.f4424c0;
        this.f4426d0 = eVar.f4426d0;
        this.f4428e0 = eVar.f4428e0;
        this.f4430f0 = eVar.f4430f0;
        this.f4432g0 = eVar.f4432g0;
        this.f4434h0 = eVar.f4434h0;
        this.f4436i0 = eVar.f4436i0;
        this.f4438j0 = eVar.f4438j0;
        this.f4440k0 = eVar.f4440k0;
        this.f4442l0 = eVar.f4442l0;
        this.f4444m0 = eVar.f4444m0;
        this.f4446n0 = eVar.f4446n0;
        this.f4448o0 = eVar.f4448o0;
        float[] fArr = this.f4450p0;
        float[] fArr2 = eVar.f4450p0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.f4452q0;
        e[] eVarArr2 = eVar.f4452q0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.f4454r0;
        e[] eVarArr4 = eVar.f4454r0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar5 = eVar.f4456s0;
        if (eVar5 == null) {
            eVar3 = null;
        } else {
            eVar3 = hashMap.get(eVar5);
        }
        this.f4456s0 = eVar3;
        e eVar6 = eVar.f4458t0;
        if (eVar6 != null) {
            eVar4 = hashMap.get(eVar6);
        }
        this.f4458t0 = eVar4;
    }

    public final void k(a1.d dVar) {
        dVar.k(this.K);
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        if (this.f4426d0 > 0) {
            dVar.k(this.O);
        }
    }

    public final void l() {
        if (this.f4425d == null) {
            this.f4425d = new l(this);
        }
        if (this.f4427e == null) {
            this.f4427e = new n(this);
        }
    }

    public d m(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final a n(int i10) {
        if (i10 == 0) {
            return this.V[0];
        }
        if (i10 == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int o() {
        if (this.f4438j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c1.e p(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            c1.d r3 = r2.M
            c1.d r0 = r3.f4406f
            if (r0 == 0) goto L_0x001f
            c1.d r1 = r0.f4406f
            if (r1 != r3) goto L_0x001f
            c1.e r3 = r0.f4404d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            c1.d r3 = r2.N
            c1.d r0 = r3.f4406f
            if (r0 == 0) goto L_0x001f
            c1.d r1 = r0.f4406f
            if (r1 != r3) goto L_0x001f
            c1.e r3 = r0.f4404d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e.p(int):c1.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c1.e q(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            c1.d r3 = r2.K
            c1.d r0 = r3.f4406f
            if (r0 == 0) goto L_0x001f
            c1.d r1 = r0.f4406f
            if (r1 != r3) goto L_0x001f
            c1.e r3 = r0.f4404d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            c1.d r3 = r2.L
            c1.d r0 = r3.f4406f
            if (r0 == 0) goto L_0x001f
            c1.d r1 = r0.f4406f
            if (r1 != r3) goto L_0x001f
            c1.e r3 = r0.f4404d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.e.q(int):c1.e");
    }

    public void r(StringBuilder sb2) {
        StringBuilder q10 = android.support.v4.media.a.q("  ");
        q10.append(this.f4439k);
        q10.append(":{\n");
        sb2.append(q10.toString());
        sb2.append("    actualWidth:" + this.X);
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f4422b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4424c0);
        sb2.append("\n");
        t(sb2, "left", this.K);
        t(sb2, "top", this.L);
        t(sb2, "right", this.M);
        t(sb2, "bottom", this.N);
        t(sb2, "baseline", this.O);
        t(sb2, "centerX", this.P);
        t(sb2, "centerY", this.Q);
        int i10 = this.X;
        int i11 = this.f4428e0;
        int i12 = this.D[0];
        int i13 = this.f4461v;
        int i14 = this.f4455s;
        float f10 = this.f4464x;
        float f11 = this.f4450p0[0];
        s(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.Y;
        int i16 = this.f4430f0;
        int i17 = this.D[1];
        int i18 = this.f4465y;
        int i19 = this.f4457t;
        float f12 = this.A;
        float f13 = this.f4450p0[1];
        s(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Z;
        int i20 = this.f4420a0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        L(sb2, "    horizontalBias", this.f4432g0, 0.5f);
        L(sb2, "    verticalBias", this.f4434h0, 0.5f);
        K(this.f4446n0, 0, "    horizontalChainStyle", sb2);
        K(this.f4448o0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f4444m0 != null) {
            str = android.support.v4.media.a.o(android.support.v4.media.a.q("type: "), this.f4444m0, " ");
        } else {
            str = str2;
        }
        sb2.append(str);
        if (this.f4442l0 != null) {
            str2 = android.support.v4.media.a.o(android.support.v4.media.a.q("id: "), this.f4442l0, " ");
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f4422b0);
        sb2.append(", ");
        sb2.append(this.f4424c0);
        sb2.append(") - (");
        sb2.append(this.X);
        sb2.append(" x ");
        return v.e(sb2, this.Y, ")");
    }

    public final int u() {
        if (this.f4438j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int v() {
        e eVar = this.W;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f4422b0;
        }
        return ((f) eVar).D0 + this.f4422b0;
    }

    public final int w() {
        e eVar = this.W;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f4424c0;
        }
        return ((f) eVar).E0 + this.f4424c0;
    }

    public final boolean x(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 == 0) {
            if (this.K.f4406f != null) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            if (this.M.f4406f != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i14 + i15 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.f4406f != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.N.f4406f != null) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i16 = i11 + i12;
        if (this.O.f4406f != null) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i16 + i13 < 2) {
            return true;
        }
        return false;
    }

    public final boolean y(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.K.f4406f;
            if (dVar3 != null && dVar3.f4403c && (dVar2 = this.M.f4406f) != null && dVar2.f4403c) {
                if ((dVar2.d() - this.M.e()) - (this.K.e() + this.K.f4406f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar4 = this.L.f4406f;
            if (dVar4 != null && dVar4.f4403c && (dVar = this.N.f4406f) != null && dVar.f4403c) {
                if ((dVar.d() - this.N.e()) - (this.L.e() + this.L.f4406f.d()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void z(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        m(aVar).b(eVar.m(aVar2), i10, i11, true);
    }
}
