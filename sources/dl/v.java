package dl;

import al.g0;
import al.l;
import al.t0;
import al.u0;
import ek.i;
import el.b;
import ik.d;
import p3.l0;
import sk.j;

/* compiled from: SharedFlow.kt */
public class v<T> extends el.a<x> implements q<T>, e {

    /* renamed from: d  reason: collision with root package name */
    public final int f20028d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20029e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20030f;

    /* renamed from: n  reason: collision with root package name */
    public Object[] f20031n;

    /* renamed from: o  reason: collision with root package name */
    public long f20032o;

    /* renamed from: p  reason: collision with root package name */
    public long f20033p;

    /* renamed from: q  reason: collision with root package name */
    public int f20034q;

    /* renamed from: r  reason: collision with root package name */
    public int f20035r;

    /* compiled from: SharedFlow.kt */
    public static final class a implements t0 {

        /* renamed from: a  reason: collision with root package name */
        public final v<?> f20036a;

        /* renamed from: b  reason: collision with root package name */
        public long f20037b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f20038c;

        /* renamed from: d  reason: collision with root package name */
        public final d<i> f20039d;

        public a(v vVar, long j10, Object obj, l lVar) {
            this.f20036a = vVar;
            this.f20037b = j10;
            this.f20038c = obj;
            this.f20039d = lVar;
        }

        public final void b() {
            v<?> vVar = this.f20036a;
            synchronized (vVar) {
                if (this.f20037b >= vVar.n()) {
                    Object[] objArr = vVar.f20031n;
                    j.c(objArr);
                    int i10 = (int) this.f20037b;
                    if (objArr[(objArr.length - 1) & i10] == this) {
                        objArr[i10 & (objArr.length - 1)] = j7.a.f11705f;
                        vVar.i();
                        i iVar = i.f20112a;
                    }
                }
            }
        }
    }

    public v(int i10, int i11, int i12) {
        this.f20028d = i10;
        this.f20029e = i11;
        this.f20030f = i12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static jk.a j(dl.v r8, dl.f r9, ik.d r10) {
        /*
            boolean r0 = r10 instanceof dl.w
            if (r0 == 0) goto L_0x0013
            r0 = r10
            dl.w r0 = (dl.w) r0
            int r1 = r0.f20046n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f20046n = r1
            goto L_0x0018
        L_0x0013:
            dl.w r0 = new dl.w
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f20044e
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20046n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            al.i1 r8 = r0.f20043d
            dl.x r9 = r0.f20042c
            dl.f r2 = r0.f20041b
            dl.v r5 = r0.f20040a
            p3.l0.Q0(r10)     // Catch:{ all -> 0x003e }
            goto L_0x0089
        L_0x003e:
            r8 = move-exception
        L_0x003f:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00c6
        L_0x0044:
            dl.x r9 = r0.f20042c
            dl.f r8 = r0.f20041b
            dl.v r2 = r0.f20040a
            p3.l0.Q0(r10)     // Catch:{ all -> 0x0050 }
            r10 = r8
            r8 = r2
            goto L_0x007a
        L_0x0050:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00c6
        L_0x0056:
            p3.l0.Q0(r10)
            el.b r10 = r8.c()
            dl.x r10 = (dl.x) r10
            boolean r2 = r9 instanceof dl.c0     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0077
            r2 = r9
            dl.c0 r2 = (dl.c0) r2     // Catch:{ all -> 0x0075 }
            r0.f20040a = r8     // Catch:{ all -> 0x0075 }
            r0.f20041b = r9     // Catch:{ all -> 0x0075 }
            r0.f20042c = r10     // Catch:{ all -> 0x0075 }
            r0.f20046n = r5     // Catch:{ all -> 0x0075 }
            ek.i r2 = r2.a(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != r1) goto L_0x0077
            return r1
        L_0x0075:
            r9 = move-exception
            goto L_0x00c6
        L_0x0077:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x007a:
            ik.f r2 = r0.getContext()     // Catch:{ all -> 0x00c1 }
            al.i1$b r5 = al.i1.b.f19045a     // Catch:{ all -> 0x00c1 }
            ik.f$b r2 = r2.get(r5)     // Catch:{ all -> 0x00c1 }
            al.i1 r2 = (al.i1) r2     // Catch:{ all -> 0x00c1 }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0089:
            java.lang.Object r10 = r5.r(r9)     // Catch:{ all -> 0x003e }
            u9.b r6 = j7.a.f11705f     // Catch:{ all -> 0x003e }
            if (r10 != r6) goto L_0x00a2
            r0.f20040a = r5     // Catch:{ all -> 0x003e }
            r0.f20041b = r2     // Catch:{ all -> 0x003e }
            r0.f20042c = r9     // Catch:{ all -> 0x003e }
            r0.f20043d = r8     // Catch:{ all -> 0x003e }
            r0.f20046n = r4     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r5.h(r9, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00a2:
            if (r8 == 0) goto L_0x00b0
            boolean r6 = r8.isActive()     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch:{ all -> 0x003e }
            throw r8     // Catch:{ all -> 0x003e }
        L_0x00b0:
            r0.f20040a = r5     // Catch:{ all -> 0x003e }
            r0.f20041b = r2     // Catch:{ all -> 0x003e }
            r0.f20042c = r9     // Catch:{ all -> 0x003e }
            r0.f20043d = r8     // Catch:{ all -> 0x003e }
            r0.f20046n = r3     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r2.e(r10, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00c1:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x003f
        L_0x00c6:
            r8.g(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.v.j(dl.v, dl.f, ik.d):jk.a");
    }

    public final Object a(f<? super T> fVar, d<?> dVar) {
        j(this, fVar, dVar);
        return jk.a.COROUTINE_SUSPENDED;
    }

    public final boolean b(T t10) {
        int i10;
        boolean z10;
        d[] dVarArr = l0.f13950a;
        synchronized (this) {
            if (p(t10)) {
                dVarArr = m(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(i.f20112a);
            }
        }
        return z10;
    }

    public final b d() {
        return new x();
    }

    public final Object e(T t10, d<? super i> dVar) {
        a aVar;
        d[] dVarArr;
        if (b(t10)) {
            return i.f20112a;
        }
        l lVar = new l(1, g0.b0(dVar));
        lVar.t();
        d[] dVarArr2 = l0.f13950a;
        synchronized (this) {
            if (p(t10)) {
                lVar.resumeWith(i.f20112a);
                dVarArr = m(dVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, ((long) (this.f20034q + this.f20035r)) + n(), t10, lVar);
                l(aVar2);
                this.f20035r++;
                if (this.f20029e == 0) {
                    dVarArr2 = m(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            lVar.v(new u0(aVar));
        }
        for (d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(i.f20112a);
            }
        }
        Object s10 = lVar.s();
        jk.a aVar3 = jk.a.COROUTINE_SUSPENDED;
        if (s10 != aVar3) {
            s10 = i.f20112a;
        }
        if (s10 == aVar3) {
            return s10;
        }
        return i.f20112a;
    }

    public final b[] f() {
        return new x[2];
    }

    public final Object h(x xVar, w wVar) {
        l lVar = new l(1, g0.b0(wVar));
        lVar.t();
        synchronized (this) {
            if (q(xVar) < 0) {
                xVar.f20048b = lVar;
            } else {
                lVar.resumeWith(i.f20112a);
            }
            i iVar = i.f20112a;
        }
        Object s10 = lVar.s();
        if (s10 == jk.a.COROUTINE_SUSPENDED) {
            return s10;
        }
        return i.f20112a;
    }

    public final void i() {
        if (this.f20029e != 0 || this.f20035r > 1) {
            Object[] objArr = this.f20031n;
            j.c(objArr);
            while (this.f20035r > 0) {
                long n10 = n();
                int i10 = this.f20034q;
                int i11 = this.f20035r;
                if (objArr[((int) ((n10 + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] == j7.a.f11705f) {
                    this.f20035r = i11 - 1;
                    objArr[((int) (n() + ((long) (this.f20034q + this.f20035r)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void k() {
        S[] sArr;
        Object[] objArr = this.f20031n;
        j.c(objArr);
        objArr[((int) n()) & (objArr.length - 1)] = null;
        this.f20034q--;
        long n10 = n() + 1;
        if (this.f20032o < n10) {
            this.f20032o = n10;
        }
        if (this.f20033p < n10) {
            if (!(this.f20116b == 0 || (sArr = this.f20115a) == null)) {
                for (S s10 : sArr) {
                    if (s10 != null) {
                        x xVar = (x) s10;
                        long j10 = xVar.f20047a;
                        if (j10 >= 0 && j10 < n10) {
                            xVar.f20047a = n10;
                        }
                    }
                }
            }
            this.f20033p = n10;
        }
    }

    public final void l(Object obj) {
        int i10 = this.f20034q + this.f20035r;
        Object[] objArr = this.f20031n;
        if (objArr == null) {
            objArr = o((Object[]) null, 0, 2);
        } else if (i10 >= objArr.length) {
            objArr = o(objArr, i10, objArr.length * 2);
        }
        objArr[((int) (n() + ((long) i10))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ik.d<ek.i>[] m(ik.d<ek.i>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f20116b
            if (r1 == 0) goto L_0x0043
            S[] r1 = r10.f20115a
            if (r1 == 0) goto L_0x0043
            r2 = 0
            int r3 = r1.length
        L_0x000b:
            if (r2 >= r3) goto L_0x0043
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0040
            dl.x r4 = (dl.x) r4
            al.l r5 = r4.f20048b
            if (r5 != 0) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            long r6 = r10.q(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0040
            int r6 = r11.length
            if (r0 < r6) goto L_0x0035
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            sk.j.e(r11, r6)
        L_0x0035:
            r6 = r11
            ik.d[] r6 = (ik.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f20048b = r0
            r0 = r7
        L_0x0040:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0043:
            ik.d[] r11 = (ik.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.v.m(ik.d[]):ik.d[]");
    }

    public final long n() {
        return Math.min(this.f20033p, this.f20032o);
    }

    public final Object[] o(Object[] objArr, int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i11];
            this.f20031n = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long n10 = n();
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (int) (((long) i12) + n10);
                objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean p(T t10) {
        if (this.f20116b == 0) {
            if (this.f20028d != 0) {
                l(t10);
                int i10 = this.f20034q + 1;
                this.f20034q = i10;
                if (i10 > this.f20028d) {
                    k();
                }
                this.f20033p = n() + ((long) this.f20034q);
            }
            return true;
        }
        if (this.f20034q >= this.f20029e && this.f20033p <= this.f20032o) {
            int g2 = v.v.g(this.f20030f);
            if (g2 == 0) {
                return false;
            }
            if (g2 == 2) {
                return true;
            }
        }
        l(t10);
        int i11 = this.f20034q + 1;
        this.f20034q = i11;
        if (i11 > this.f20029e) {
            k();
        }
        long n10 = n() + ((long) this.f20034q);
        long j10 = this.f20032o;
        if (((int) (n10 - j10)) > this.f20028d) {
            s(j10 + 1, this.f20033p, n() + ((long) this.f20034q), n() + ((long) this.f20034q) + ((long) this.f20035r));
        }
        return true;
    }

    public final long q(x xVar) {
        long j10 = xVar.f20047a;
        if (j10 < n() + ((long) this.f20034q)) {
            return j10;
        }
        if (this.f20029e <= 0 && j10 <= n() && this.f20035r != 0) {
            return j10;
        }
        return -1;
    }

    public final Object r(x xVar) {
        Object obj;
        d[] dVarArr = l0.f13950a;
        synchronized (this) {
            long q10 = q(xVar);
            if (q10 < 0) {
                obj = j7.a.f11705f;
            } else {
                long j10 = xVar.f20047a;
                Object[] objArr = this.f20031n;
                j.c(objArr);
                Object obj2 = objArr[((int) q10) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f20038c;
                }
                xVar.f20047a = q10 + 1;
                Object obj3 = obj2;
                dVarArr = t(j10);
                obj = obj3;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(i.f20112a);
            }
        }
        return obj;
    }

    public final void s(long j10, long j11, long j12, long j13) {
        long j14 = j10;
        long j15 = j11;
        long min = Math.min(j15, j10);
        for (long n10 = n(); n10 < min; n10++) {
            Object[] objArr = this.f20031n;
            j.c(objArr);
            objArr[((int) n10) & (objArr.length - 1)] = null;
        }
        this.f20032o = j14;
        this.f20033p = j15;
        this.f20034q = (int) (j12 - min);
        this.f20035r = (int) (j13 - j12);
    }

    public final d<i>[] t(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        S[] sArr;
        if (j10 > this.f20033p) {
            return l0.f13950a;
        }
        long n10 = n();
        long j15 = ((long) this.f20034q) + n10;
        if (this.f20029e == 0 && this.f20035r > 0) {
            j15++;
        }
        if (!(this.f20116b == 0 || (sArr = this.f20115a) == null)) {
            for (S s10 : sArr) {
                if (s10 != null) {
                    long j16 = ((x) s10).f20047a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f20033p) {
            return l0.f13950a;
        }
        long n11 = n() + ((long) this.f20034q);
        if (this.f20116b > 0) {
            i10 = Math.min(this.f20035r, this.f20029e - ((int) (n11 - j15)));
        } else {
            i10 = this.f20035r;
        }
        d<i>[] dVarArr = l0.f13950a;
        long j17 = ((long) this.f20035r) + n11;
        if (i10 > 0) {
            dVarArr = new d[i10];
            Object[] objArr = this.f20031n;
            j.c(objArr);
            long j18 = n11;
            int i11 = 0;
            while (true) {
                if (n11 >= j17) {
                    j12 = j15;
                    j11 = j17;
                    break;
                }
                int i12 = (int) n11;
                j12 = j15;
                Object obj = objArr[(objArr.length - 1) & i12];
                u9.b bVar = j7.a.f11705f;
                if (obj != bVar) {
                    j11 = j17;
                    j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) obj;
                    int i13 = i11 + 1;
                    dVarArr[i11] = aVar.f20039d;
                    objArr[i12 & (objArr.length - 1)] = bVar;
                    objArr[((int) j18) & (objArr.length - 1)] = aVar.f20038c;
                    j14 = 1;
                    j18++;
                    if (i13 >= i10) {
                        break;
                    }
                    i11 = i13;
                } else {
                    j11 = j17;
                    j14 = 1;
                }
                n11 += j14;
                j15 = j12;
                j17 = j11;
            }
            n11 = j18;
        } else {
            j12 = j15;
            j11 = j17;
        }
        int i14 = (int) (n11 - n10);
        if (this.f20116b == 0) {
            j13 = n11;
        } else {
            j13 = j12;
        }
        long max = Math.max(this.f20032o, n11 - ((long) Math.min(this.f20028d, i14)));
        if (this.f20029e == 0 && max < j11) {
            Object[] objArr2 = this.f20031n;
            j.c(objArr2);
            if (j.a(objArr2[((int) max) & (objArr2.length - 1)], j7.a.f11705f)) {
                n11++;
                max++;
            }
        }
        s(max, j13, n11, j11);
        i();
        if (dVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return m(dVarArr);
        }
        return dVarArr;
    }
}
