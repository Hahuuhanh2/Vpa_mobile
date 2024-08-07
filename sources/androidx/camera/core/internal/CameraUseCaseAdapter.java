package androidx.camera.core.internal;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import c0.f1;
import c0.g1;
import c0.j;
import c0.j0;
import c0.k;
import c0.p0;
import c0.t0;
import f0.b0;
import f0.c0;
import f0.n;
import f0.n0;
import f0.o;
import f0.o0;
import f0.r;
import j0.e;
import j0.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class CameraUseCaseAdapter implements j {

    /* renamed from: a  reason: collision with root package name */
    public final r f1433a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1434b;

    /* renamed from: c  reason: collision with root package name */
    public final y f1435c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1436d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1437e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1438f = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final d0.a f1439n;

    /* renamed from: o  reason: collision with root package name */
    public g1 f1440o;

    /* renamed from: p  reason: collision with root package name */
    public List<k> f1441p = Collections.emptyList();

    /* renamed from: q  reason: collision with root package name */
    public f f1442q = n.f9564a;

    /* renamed from: r  reason: collision with root package name */
    public final Object f1443r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public boolean f1444s = true;

    /* renamed from: t  reason: collision with root package name */
    public i f1445t = null;

    /* renamed from: u  reason: collision with root package name */
    public f1 f1446u;

    /* renamed from: v  reason: collision with root package name */
    public p0.a f1447v;

    /* renamed from: w  reason: collision with root package name */
    public final n0 f1448w;

    /* renamed from: x  reason: collision with root package name */
    public final o0 f1449x;

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1450a = new ArrayList();

        public a(LinkedHashSet<r> linkedHashSet) {
            Iterator<r> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f1450a.add(it.next().n().b());
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f1450a.equals(((a) obj).f1450a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f1450a.hashCode() * 53;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public x<?> f1451a;

        /* renamed from: b  reason: collision with root package name */
        public x<?> f1452b;

        public b(x<?> xVar, x<?> xVar2) {
            this.f1451a = xVar;
            this.f1452b = xVar2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<r> linkedHashSet, d0.a aVar, o oVar, y yVar) {
        r next = linkedHashSet.iterator().next();
        this.f1433a = next;
        this.f1436d = new a(new LinkedHashSet(linkedHashSet));
        this.f1439n = aVar;
        this.f1434b = oVar;
        this.f1435c = yVar;
        n0 n0Var = new n0(next.h());
        this.f1448w = n0Var;
        this.f1449x = new o0(next.n(), n0Var);
    }

    public static Matrix o(Rect rect, Size size) {
        boolean z10;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        g0.y("Cannot compute viewport crop rects zero sized sensor rect.", z10);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static j0 q() {
        Object obj;
        Integer num;
        j0.b bVar = new j0.b();
        bVar.f4299a.O(h.A, "ImageCapture-Extra");
        q qVar = bVar.f4299a;
        c cVar = m.I;
        qVar.getClass();
        Object obj2 = null;
        try {
            obj = qVar.a(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            bVar.f4299a.O(androidx.camera.core.impl.n.f1379d, num2);
        } else {
            bVar.f4299a.O(androidx.camera.core.impl.n.f1379d, 256);
        }
        m mVar = new m(androidx.camera.core.impl.r.K(bVar.f4299a));
        c0.f(mVar);
        j0 j0Var = new j0(mVar);
        q qVar2 = bVar.f4299a;
        c cVar2 = androidx.camera.core.impl.o.f1385j;
        qVar2.getClass();
        try {
            obj2 = qVar2.a(cVar2);
        } catch (IllegalArgumentException unused2) {
        }
        Size size = (Size) obj2;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        q qVar3 = bVar.f4299a;
        c cVar3 = e.f11454z;
        Object P = j7.a.P();
        qVar3.getClass();
        try {
            P = qVar3.a(cVar3);
        } catch (IllegalArgumentException unused3) {
        }
        g0.D((Executor) P, "The IO executor can't be null");
        q qVar4 = bVar.f4299a;
        c cVar4 = m.G;
        if (!qVar4.c(cVar4) || ((num = (Integer) bVar.f4299a.a(cVar4)) != null && (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2))) {
            return j0Var;
        }
        throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean w(androidx.camera.core.impl.v r4, androidx.camera.core.impl.u r5) {
        /*
            androidx.camera.core.impl.i r4 = r4.c()
            androidx.camera.core.impl.g r0 = r5.f1396f
            androidx.camera.core.impl.i r0 = r0.f1358b
            java.util.Set r1 = r4.d()
            int r1 = r1.size()
            androidx.camera.core.impl.g r5 = r5.f1396f
            androidx.camera.core.impl.i r5 = r5.f1358b
            java.util.Set r5 = r5.d()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x0020
            return r2
        L_0x0020:
            java.util.Set r5 = r4.d()
            java.util.Iterator r5 = r5.iterator()
        L_0x0028:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.i$a r1 = (androidx.camera.core.impl.i.a) r1
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r0.a(r1)
            java.lang.Object r1 = r4.a(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0028
        L_0x0048:
            return r2
        L_0x0049:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.w(androidx.camera.core.impl.v, androidx.camera.core.impl.u):boolean");
    }

    public static ArrayList x(List list, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            f1Var.getClass();
            f1Var.f4265l = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k kVar = (k) it2.next();
                kVar.getClass();
                boolean z11 = false;
                if (f1Var.l(0)) {
                    if (f1Var.f4265l == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g0.E(f1Var + " already has effect" + f1Var.f4265l, z10);
                    if (f1Var.l(0)) {
                        z11 = true;
                    }
                    g0.z(z11);
                    f1Var.f4265l = kVar;
                    arrayList2.remove(kVar);
                }
            }
        }
        return arrayList2;
    }

    public static void y(List list, ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList x10 = x(list, arrayList);
        ArrayList arrayList2 = new ArrayList(linkedHashSet);
        arrayList2.removeAll(arrayList);
        ArrayList x11 = x(x10, arrayList2);
        if (x11.size() > 0) {
            x11.toString();
            p0.g("CameraUseCaseAdapter");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[LOOP:0: B:13:0x0052->B:15:0x0058, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.util.ArrayList r11, java.util.HashMap r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1443r
            monitor-enter(r0)
            c0.g1 r1 = r10.f1440o     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0089
            f0.r r1 = r10.f1433a     // Catch:{ all -> 0x008b }
            f0.q r1 = r1.n()     // Catch:{ all -> 0x008b }
            int r1 = r1.f()     // Catch:{ all -> 0x008b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008b }
            r2 = 1
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "CameraUseCaseAdapter"
            c0.p0.g(r1)     // Catch:{ all -> 0x008b }
            goto L_0x0024
        L_0x001e:
            int r1 = r1.intValue()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r4 = r2
            f0.r r1 = r10.f1433a     // Catch:{ all -> 0x008b }
            androidx.camera.core.impl.CameraControlInternal r1 = r1.h()     // Catch:{ all -> 0x008b }
            android.graphics.Rect r3 = r1.b()     // Catch:{ all -> 0x008b }
            c0.g1 r1 = r10.f1440o     // Catch:{ all -> 0x008b }
            android.util.Rational r5 = r1.f4272b     // Catch:{ all -> 0x008b }
            f0.r r1 = r10.f1433a     // Catch:{ all -> 0x008b }
            f0.q r1 = r1.n()     // Catch:{ all -> 0x008b }
            c0.g1 r2 = r10.f1440o     // Catch:{ all -> 0x008b }
            int r2 = r2.f4273c     // Catch:{ all -> 0x008b }
            int r6 = r1.j(r2)     // Catch:{ all -> 0x008b }
            c0.g1 r1 = r10.f1440o     // Catch:{ all -> 0x008b }
            int r7 = r1.f4271a     // Catch:{ all -> 0x008b }
            int r8 = r1.f4274d     // Catch:{ all -> 0x008b }
            r9 = r12
            java.util.HashMap r1 = j0.k.a(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x008b }
        L_0x0052:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0089
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x008b }
            c0.f1 r2 = (c0.f1) r2     // Catch:{ all -> 0x008b }
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x008b }
            android.graphics.Rect r3 = (android.graphics.Rect) r3     // Catch:{ all -> 0x008b }
            r3.getClass()     // Catch:{ all -> 0x008b }
            r2.z(r3)     // Catch:{ all -> 0x008b }
            f0.r r3 = r10.f1433a     // Catch:{ all -> 0x008b }
            androidx.camera.core.impl.CameraControlInternal r3 = r3.h()     // Catch:{ all -> 0x008b }
            android.graphics.Rect r3 = r3.b()     // Catch:{ all -> 0x008b }
            java.lang.Object r4 = r12.get(r2)     // Catch:{ all -> 0x008b }
            androidx.camera.core.impl.v r4 = (androidx.camera.core.impl.v) r4     // Catch:{ all -> 0x008b }
            r4.getClass()     // Catch:{ all -> 0x008b }
            android.util.Size r4 = r4.d()     // Catch:{ all -> 0x008b }
            android.graphics.Matrix r3 = o(r3, r4)     // Catch:{ all -> 0x008b }
            r2.y(r3)     // Catch:{ all -> 0x008b }
            goto L_0x0052
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.A(java.util.ArrayList, java.util.HashMap):void");
    }

    public final c0.o a() {
        return this.f1449x;
    }

    public final void b() {
        synchronized (this.f1443r) {
            if (!this.f1444s) {
                this.f1433a.l(this.f1438f);
                synchronized (this.f1443r) {
                    if (this.f1445t != null) {
                        this.f1433a.h().a(this.f1445t);
                    }
                }
                Iterator it = this.f1438f.iterator();
                while (it.hasNext()) {
                    ((f1) it.next()).p();
                }
                this.f1444s = true;
            }
        }
    }

    public final CameraControl c() {
        return this.f1448w;
    }

    public final f1 d(LinkedHashSet linkedHashSet) {
        boolean z10;
        boolean z11;
        t0 t0Var;
        boolean z12;
        synchronized (this.f1443r) {
            try {
                synchronized (this.f1443r) {
                    n.a aVar = (n.a) this.f1442q;
                    aVar.getClass();
                    z10 = false;
                    if (((Integer) ((androidx.camera.core.impl.r) aVar.b()).e(f.f1353b, 0)).intValue() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    Iterator it = linkedHashSet.iterator();
                    boolean z13 = false;
                    boolean z14 = false;
                    while (it.hasNext()) {
                        f1 f1Var = (f1) it.next();
                        if (f1Var instanceof t0) {
                            z14 = true;
                        } else if (f1Var instanceof j0) {
                            z13 = true;
                        }
                    }
                    if (!z13 || z14) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        f1 f1Var2 = this.f1446u;
                        if (f1Var2 instanceof t0) {
                            t0Var = f1Var2;
                        } else {
                            t0.a aVar2 = new t0.a();
                            aVar2.f4342a.O(h.A, "Preview-Extra");
                            s sVar = new s(androidx.camera.core.impl.r.K(aVar2.f4342a));
                            c0.f(sVar);
                            t0 t0Var2 = new t0(sVar);
                            t0Var2.E(new b0());
                            t0Var = t0Var2;
                        }
                    } else {
                        Iterator it2 = linkedHashSet.iterator();
                        boolean z15 = false;
                        boolean z16 = false;
                        while (it2.hasNext()) {
                            f1 f1Var3 = (f1) it2.next();
                            if (f1Var3 instanceof t0) {
                                z15 = true;
                            } else if (f1Var3 instanceof j0) {
                                z16 = true;
                            }
                        }
                        if (z15 && !z16) {
                            z10 = true;
                        }
                        if (z10) {
                            f1 f1Var4 = this.f1446u;
                            t0Var = f1Var4 instanceof j0 ? f1Var4 : q();
                        }
                    }
                }
                t0Var = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v65, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fe, code lost:
        if (r5.contains(r0) != false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0b71, code lost:
        if (r6 < r14) goto L_0x0b9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0b9a, code lost:
        if (r6 > r14) goto L_0x0b9c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x093b  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0bc6  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0de1 A[LOOP:35: B:540:0x0ddb->B:542:0x0de1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0e15  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x040d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0607 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x0945 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:649:0x0c0f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap p(int r37, f0.q r38, java.util.ArrayList r39, java.util.ArrayList r40, java.util.HashMap r41) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r1 = r38
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r2 = r38.b()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r3 = r40.iterator()
        L_0x001d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r4 = r3.next()
            c0.f1 r4 = (c0.f1) r4
            f0.o r5 = r0.f1434b
            int r6 = r4.f()
            androidx.camera.core.impl.v r7 = r4.f4260g
            if (r7 == 0) goto L_0x0038
            android.util.Size r7 = r7.d()
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            v.j0 r5 = (v.j0) r5
            java.util.HashMap r5 = r5.f15715a
            java.lang.Object r5 = r5.get(r2)
            v.t1 r5 = (v.t1) r5
            if (r5 == 0) goto L_0x004e
            f0.e r5 = r5.h(r6)
            f0.d r5 = f0.s0.e(r10, r6, r7, r5)
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            r15 = r5
            int r16 = r4.f()
            androidx.camera.core.impl.v r5 = r4.f4260g
            if (r5 == 0) goto L_0x005d
            android.util.Size r5 = r5.d()
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            r17 = r5
            androidx.camera.core.impl.v r5 = r4.f4260g
            r5.getClass()
            c0.x r18 = r5.a()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r4 instanceof p0.a
            if (r6 == 0) goto L_0x0093
            r6 = r4
            p0.a r6 = (p0.a) r6
            p0.e r6 = r6.f13884o
            java.util.Set<c0.f1> r6 = r6.f13891a
            java.util.Iterator r6 = r6.iterator()
        L_0x007d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x009c
            java.lang.Object r7 = r6.next()
            c0.f1 r7 = (c0.f1) r7
            androidx.camera.core.impl.x<?> r7 = r7.f4259f
            androidx.camera.core.impl.y$b r7 = r7.z()
            r5.add(r7)
            goto L_0x007d
        L_0x0093:
            androidx.camera.core.impl.x<?> r6 = r4.f4259f
            androidx.camera.core.impl.y$b r6 = r6.z()
            r5.add(r6)
        L_0x009c:
            androidx.camera.core.impl.v r6 = r4.f4260g
            androidx.camera.core.impl.i r20 = r6.c()
            androidx.camera.core.impl.x<?> r6 = r4.f4259f
            android.util.Range r21 = r6.k()
            androidx.camera.core.impl.b r6 = new androidx.camera.core.impl.b
            r14 = r6
            r19 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r11.add(r6)
            r13.put(r6, r4)
            androidx.camera.core.impl.v r5 = r4.f4260g
            r12.put(r4, r5)
            goto L_0x001d
        L_0x00bd:
            boolean r3 = r39.isEmpty()
            if (r3 != 0) goto L_0x0ea4
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            f0.r r4 = r0.f1433a     // Catch:{ NullPointerException -> 0x00d8 }
            androidx.camera.core.impl.CameraControlInternal r4 = r4.h()     // Catch:{ NullPointerException -> 0x00d8 }
            android.graphics.Rect r4 = r4.b()     // Catch:{ NullPointerException -> 0x00d8 }
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            j0.f r5 = new j0.f
            if (r4 == 0) goto L_0x00ed
            android.graphics.RectF r6 = g0.n.f10263a
            android.util.Size r6 = new android.util.Size
            int r7 = r4.width()
            int r4 = r4.height()
            r6.<init>(r7, r4)
            goto L_0x00ee
        L_0x00ed:
            r6 = 0
        L_0x00ee:
            r5.<init>(r1, r6)
            java.util.Iterator r4 = r39.iterator()
        L_0x00f5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x011c
            java.lang.Object r6 = r4.next()
            c0.f1 r6 = (c0.f1) r6
            r7 = r41
            java.lang.Object r8 = r7.get(r6)
            androidx.camera.core.internal.CameraUseCaseAdapter$b r8 = (androidx.camera.core.internal.CameraUseCaseAdapter.b) r8
            androidx.camera.core.impl.x<?> r9 = r8.f1451a
            androidx.camera.core.impl.x<?> r8 = r8.f1452b
            androidx.camera.core.impl.x r8 = r6.n(r1, r9, r8)
            r14.put(r8, r6)
            java.util.List r6 = r5.c(r8)
            r3.put(r8, r6)
            goto L_0x00f5
        L_0x011c:
            f0.o r1 = r0.f1434b
            v.j0 r1 = (v.j0) r1
            r1.getClass()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ 1
            java.lang.String r5 = "No new use cases to be bound."
            al.g0.y(r5, r4)
            java.util.HashMap r1 = r1.f15715a
            java.lang.Object r1 = r1.get(r2)
            r15 = r1
            v.t1 r15 = (v.t1) r15
            if (r15 == 0) goto L_0x0e98
            v.d1 r1 = r15.f15859s
            android.util.Size r2 = r1.a()
            r1.f15653b = r2
            f0.e r1 = r15.f15857q
            if (r1 != 0) goto L_0x0149
            r15.b()
            goto L_0x0172
        L_0x0149:
            v.d1 r1 = r15.f15859s
            android.util.Size r19 = r1.e()
            f0.e r1 = r15.f15857q
            android.util.Size r2 = r1.f9524a
            java.util.Map<java.lang.Integer, android.util.Size> r4 = r1.f9525b
            java.util.Map<java.lang.Integer, android.util.Size> r5 = r1.f9527d
            android.util.Size r6 = r1.f9528e
            java.util.Map<java.lang.Integer, android.util.Size> r7 = r1.f9529f
            java.util.Map<java.lang.Integer, android.util.Size> r1 = r1.f9530g
            f0.e r8 = new f0.e
            r16 = r8
            r17 = r2
            r18 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r15.f15857q = r8
        L_0x0172:
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.Set r1 = r3.keySet()
            r9.<init>(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x0189:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01ab
            java.lang.Object r4 = r2.next()
            androidx.camera.core.impl.x r4 = (androidx.camera.core.impl.x) r4
            int r4 = r4.G()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L_0x0189
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            goto L_0x0189
        L_0x01ab:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x01b5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01e7
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r4 = r9.iterator()
        L_0x01c9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b5
            java.lang.Object r5 = r4.next()
            androidx.camera.core.impl.x r5 = (androidx.camera.core.impl.x) r5
            int r6 = r5.G()
            if (r2 != r6) goto L_0x01c9
            int r5 = r9.indexOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.add(r5)
            goto L_0x01c9
        L_0x01e7:
            v.e1 r1 = r15.f15862v
            r1.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r4 = r11.iterator()
        L_0x01f5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0209
            java.lang.Object r5 = r4.next()
            androidx.camera.core.impl.a r5 = (androidx.camera.core.impl.a) r5
            c0.x r5 = r5.b()
            r2.add(r5)
            goto L_0x01f5
        L_0x0209:
            x.b r4 = r1.f15663b
            x.b$a r4 = r4.f16822a
            java.util.Set r4 = r4.b()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            java.util.Iterator r6 = r2.iterator()
        L_0x021a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x022e
            java.lang.Object r7 = r6.next()
            c0.x r7 = (c0.x) r7
            x.b r0 = r1.f15663b
            v.e1.d(r5, r7, r0)
            r0 = r36
            goto L_0x021a
        L_0x022e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r16 = r8.iterator()
        L_0x0241:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0298
            java.lang.Object r17 = r16.next()
            java.lang.Integer r17 = (java.lang.Integer) r17
            r18 = r13
            int r13 = r17.intValue()
            java.lang.Object r13 = r9.get(r13)
            androidx.camera.core.impl.x r13 = (androidx.camera.core.impl.x) r13
            r17 = r12
            c0.x r12 = r13.h()
            r40 = r14
            c0.x r14 = c0.x.f4366c
            boolean r14 = java.util.Objects.equals(r12, r14)
            if (r14 == 0) goto L_0x026f
            r7.add(r13)
            r38 = r9
            goto L_0x028f
        L_0x026f:
            int r14 = r12.f4373a
            r38 = r9
            r9 = 2
            if (r14 == r9) goto L_0x0285
            if (r14 == 0) goto L_0x027c
            int r9 = r12.f4374b
            if (r9 == 0) goto L_0x0285
        L_0x027c:
            if (r14 != 0) goto L_0x0283
            int r9 = r12.f4374b
            if (r9 == 0) goto L_0x0283
            goto L_0x0285
        L_0x0283:
            r9 = 0
            goto L_0x0286
        L_0x0285:
            r9 = 1
        L_0x0286:
            if (r9 == 0) goto L_0x028c
            r6.add(r13)
            goto L_0x028f
        L_0x028c:
            r0.add(r13)
        L_0x028f:
            r9 = r38
            r14 = r40
            r12 = r17
            r13 = r18
            goto L_0x0241
        L_0x0298:
            r38 = r9
            r17 = r12
            r18 = r13
            r40 = r14
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r0)
            r13.addAll(r6)
            r13.addAll(r7)
            java.util.Iterator r0 = r13.iterator()
        L_0x02bc:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0436
            java.lang.Object r6 = r0.next()
            androidx.camera.core.impl.x r6 = (androidx.camera.core.impl.x) r6
            c0.x r7 = r6.h()
            java.lang.String r13 = r6.D()
            boolean r14 = r7.b()
            if (r14 == 0) goto L_0x02e9
            boolean r13 = r5.contains(r7)
            r39 = r0
            r22 = r3
            if (r13 == 0) goto L_0x02e5
            r0 = r7
            r41 = r8
            goto L_0x03f2
        L_0x02e5:
            r41 = r8
            goto L_0x03f1
        L_0x02e9:
            int r14 = r7.f4373a
            r39 = r0
            int r0 = r7.f4374b
            r41 = r8
            r8 = 1
            if (r14 != r8) goto L_0x0302
            if (r0 != 0) goto L_0x0302
            c0.x r0 = c0.x.f4367d
            boolean r8 = r5.contains(r0)
            r22 = r3
            if (r8 == 0) goto L_0x03f1
            goto L_0x03f2
        L_0x0302:
            c0.x r8 = v.e1.c(r7, r2, r5)
            java.lang.String r16 = "DynamicRangeResolver"
            if (r8 == 0) goto L_0x0323
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r14 = 0
            r0[r14] = r13
            r13 = 1
            r0[r13] = r7
            r13 = 2
            r0[r13] = r8
            java.lang.String r13 = "Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s"
            java.lang.String.format(r13, r0)
            c0.p0.a(r16)
            r22 = r3
        L_0x0320:
            r0 = r8
            goto L_0x03f2
        L_0x0323:
            r8 = 3
            r20 = 0
            r21 = 1
            c0.x r22 = v.e1.c(r7, r9, r5)
            if (r22 == 0) goto L_0x0345
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r20] = r13
            r0[r21] = r7
            r8 = 2
            r0[r8] = r22
            java.lang.String r8 = "Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s"
            java.lang.String.format(r8, r0)
            c0.p0.a(r16)
            r0 = r22
            r22 = r3
            goto L_0x03f2
        L_0x0345:
            c0.x r8 = c0.x.f4367d
            boolean r22 = v.e1.b(r7, r8, r5)
            if (r22 == 0) goto L_0x0362
            r22 = r3
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r20] = r13
            r0[r21] = r7
            r3 = 2
            r0[r3] = r8
            java.lang.String r3 = "Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s"
            java.lang.String.format(r3, r0)
            c0.p0.a(r16)
            goto L_0x0320
        L_0x0362:
            r22 = r3
            r3 = 2
            if (r14 != r3) goto L_0x03b3
            r3 = 10
            if (r0 == r3) goto L_0x036d
            if (r0 != 0) goto L_0x03b3
        L_0x036d:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r3 < r8) goto L_0x0384
            w.t r3 = r1.f15662a
            c0.x r3 = v.e1.a.a(r3)
            if (r3 == 0) goto L_0x0385
            r0.add(r3)
            goto L_0x0385
        L_0x0384:
            r3 = 0
        L_0x0385:
            c0.x r8 = c0.x.f4368e
            r0.add(r8)
            c0.x r0 = v.e1.c(r7, r0, r5)
            if (r0 == 0) goto L_0x03b3
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r14 = 0
            r8[r14] = r13
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x039f
            java.lang.String r3 = "recommended"
            goto L_0x03a1
        L_0x039f:
            java.lang.String r3 = "required"
        L_0x03a1:
            r13 = 1
            r8[r13] = r3
            r3 = 2
            r8[r3] = r7
            r3 = 3
            r8[r3] = r0
            java.lang.String r3 = "Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s"
            java.lang.String.format(r3, r8)
            c0.p0.a(r16)
            goto L_0x03f2
        L_0x03b3:
            java.util.Iterator r0 = r5.iterator()
        L_0x03b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03f1
            java.lang.Object r3 = r0.next()
            c0.x r3 = (c0.x) r3
            boolean r8 = r3.b()
            java.lang.String r14 = "Candidate dynamic range must be fully specified."
            al.g0.E(r14, r8)
            c0.x r8 = c0.x.f4367d
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x03d5
            goto L_0x03b7
        L_0x03d5:
            boolean r8 = v.e1.a(r7, r3)
            if (r8 == 0) goto L_0x03b7
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r8 = 1
            r0[r8] = r7
            r8 = 2
            r0[r8] = r3
            java.lang.String r8 = "Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s"
            java.lang.String.format(r8, r0)
            c0.p0.a(r16)
            r0 = r3
            goto L_0x03f2
        L_0x03f1:
            r0 = 0
        L_0x03f2:
            if (r0 == 0) goto L_0x040d
            x.b r3 = r1.f15663b
            v.e1.d(r5, r0, r3)
            r12.put(r6, r0)
            boolean r3 = r2.contains(r0)
            if (r3 != 0) goto L_0x0405
            r9.add(r0)
        L_0x0405:
            r0 = r39
            r8 = r41
            r3 = r22
            goto L_0x02bc
        L_0x040d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r6.D()
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r7
            java.lang.String r2 = "\n  "
            java.lang.String r3 = android.text.TextUtils.join(r2, r4)
            r4 = 2
            r1[r4] = r3
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0436:
            r22 = r3
            r41 = r8
            java.util.Collection r0 = r12.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0442:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0456
            java.lang.Object r1 = r0.next()
            c0.x r1 = (c0.x) r1
            int r1 = r1.f4374b
            r2 = 10
            if (r1 != r2) goto L_0x0442
            r0 = r2
            goto L_0x045f
        L_0x0456:
            r2 = 10
            r0 = 8
            r35 = r2
            r2 = r0
            r0 = r35
        L_0x045f:
            if (r10 == 0) goto L_0x0486
            if (r2 != r0) goto L_0x0486
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r15.f15847g
            r4 = 0
            r2[r4] = r3
            r3 = 1
            if (r10 == r3) goto L_0x0478
            if (r10 == r1) goto L_0x0475
            java.lang.String r1 = "DEFAULT"
            goto L_0x047a
        L_0x0475:
            java.lang.String r1 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            goto L_0x047a
        L_0x0478:
            java.lang.String r1 = "CONCURRENT_CAMERA"
        L_0x047a:
            r2[r3] = r1
            java.lang.String r1 = "Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode."
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0486:
            v.c r0 = new v.c
            r0.<init>(r10, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x0494:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04a8
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.a r3 = (androidx.camera.core.impl.a) r3
            f0.s0 r3 = r3.f()
            r1.add(r3)
            goto L_0x0494
        L_0x04a8:
            g0.c r2 = new g0.c
            r3 = 0
            r2.<init>(r3)
            java.util.Set r3 = r22.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x04b6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0508
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.x r4 = (androidx.camera.core.impl.x) r4
            r5 = r22
            java.lang.Object r6 = r5.get(r4)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x04d4
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x04d4
            r7 = 1
            goto L_0x04d5
        L_0x04d4:
            r7 = 0
        L_0x04d5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "No available output size is found for "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = "."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            al.g0.y(r8, r7)
            java.lang.Object r6 = java.util.Collections.min(r6, r2)
            android.util.Size r6 = (android.util.Size) r6
            int r4 = r4.l()
            int r7 = r0.f15600a
            f0.e r8 = r15.h(r4)
            f0.d r4 = f0.s0.e(r7, r4, r6, r8)
            r1.add(r4)
            r22 = r5
            goto L_0x04b6
        L_0x0508:
            r5 = r22
            boolean r13 = r15.a(r0, r1)
            java.lang.String r14 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r9 = " New configs: "
            java.lang.String r16 = "No supported surface combination is found for camera device - Id : "
            if (r13 == 0) goto L_0x0e74
            java.util.Iterator r1 = r11.iterator()
            r2 = 0
        L_0x051b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0536
            java.lang.Object r3 = r1.next()
            androidx.camera.core.impl.a r3 = (androidx.camera.core.impl.a) r3
            android.util.Range r3 = r3.g()
            if (r2 != 0) goto L_0x052f
            r2 = r3
            goto L_0x051b
        L_0x052f:
            if (r3 == 0) goto L_0x051b
            android.util.Range r2 = r2.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x051b }
            goto L_0x051b
        L_0x0536:
            java.util.Iterator r1 = r41.iterator()
            r8 = r2
        L_0x053b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0564
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = r38
            java.lang.Object r2 = r7.get(r2)
            androidx.camera.core.impl.x r2 = (androidx.camera.core.impl.x) r2
            android.util.Range r2 = r2.k()
            if (r8 != 0) goto L_0x055a
            goto L_0x0560
        L_0x055a:
            if (r2 == 0) goto L_0x0561
            android.util.Range r2 = r8.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x0561 }
        L_0x0560:
            r8 = r2
        L_0x0561:
            r38 = r7
            goto L_0x053b
        L_0x0564:
            r7 = r38
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0573:
            boolean r3 = r2.hasNext()
            r19 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            if (r3 == 0) goto L_0x0627
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.x r3 = (androidx.camera.core.impl.x) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Object r21 = r5.get(r3)
            java.util.List r21 = (java.util.List) r21
            java.util.Iterator r21 = r21.iterator()
        L_0x0598:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto L_0x0615
            java.lang.Object r22 = r21.next()
            r38 = r2
            r2 = r22
            android.util.Size r2 = (android.util.Size) r2
            r22 = r5
            int r5 = r3.l()
            r39 = r9
            int r9 = r0.f15600a
            f0.e r10 = r15.h(r5)
            f0.d r9 = f0.s0.e(r9, r5, r2, r10)
            f0.s0$a r9 = r9.f9522b
            if (r8 == 0) goto L_0x05db
            w.t r10 = r15.f15849i
            r23 = r8
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x05d6 }
            java.lang.Object r8 = r10.a(r8)     // Catch:{ Exception -> 0x05d6 }
            android.hardware.camera2.params.StreamConfigurationMap r8 = (android.hardware.camera2.params.StreamConfigurationMap) r8     // Catch:{ Exception -> 0x05d6 }
            r10 = r12
            r24 = r13
            long r12 = r8.getOutputMinFrameDuration(r5, r2)     // Catch:{ Exception -> 0x05d9 }
            double r12 = (double) r12
            double r12 = r19 / r12
            int r5 = (int) r12
            goto L_0x05e3
        L_0x05d6:
            r10 = r12
            r24 = r13
        L_0x05d9:
            r5 = 0
            goto L_0x05e3
        L_0x05db:
            r23 = r8
            r10 = r12
            r24 = r13
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x05e3:
            java.lang.Object r8 = r6.get(r9)
            java.util.Set r8 = (java.util.Set) r8
            if (r8 != 0) goto L_0x05f3
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r6.put(r9, r8)
        L_0x05f3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r9 = r8.contains(r9)
            if (r9 != 0) goto L_0x0607
            r4.add(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r8.add(r2)
        L_0x0607:
            r2 = r38
            r9 = r39
            r12 = r10
            r5 = r22
            r8 = r23
            r13 = r24
            r10 = r37
            goto L_0x0598
        L_0x0615:
            r38 = r2
            r22 = r5
            r23 = r8
            r39 = r9
            r10 = r12
            r24 = r13
            r1.put(r3, r4)
            r10 = r37
            goto L_0x0573
        L_0x0627:
            r23 = r8
            r39 = r9
            r10 = r12
            r24 = r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r41.iterator()
        L_0x0637:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0723
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r7.get(r4)
            androidx.camera.core.impl.x r4 = (androidx.camera.core.impl.x) r4
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            int r4 = r4.l()
            lb.b r6 = r15.f15860t
            w.t r8 = r15.f15849i
            r6.getClass()
            java.lang.Class<y.y> r6 = y.y.class
            f0.m0 r6 = y.k.a(r6)
            y.y r6 = (y.y) r6
            if (r6 == 0) goto L_0x0669
            goto L_0x0677
        L_0x0669:
            z.d r6 = p3.l0.Y(r8)
            java.lang.Class<y.c> r8 = y.c.class
            f0.m0 r6 = r6.f(r8)
            y.c r6 = (y.c) r6
            if (r6 == 0) goto L_0x0679
        L_0x0677:
            r6 = 2
            goto L_0x067a
        L_0x0679:
            r6 = 3
        L_0x067a:
            r8 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x06aa
            r9 = 1
            if (r6 == r9) goto L_0x06a7
            r9 = 2
            if (r6 == r9) goto L_0x0686
            r6 = 0
            goto L_0x06ac
        L_0x0686:
            f0.e r6 = r15.h(r8)
            java.util.Map r6 = r6.b()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object r6 = r6.get(r9)
            android.util.Size r6 = (android.util.Size) r6
            android.util.Rational r9 = new android.util.Rational
            int r12 = r6.getWidth()
            int r6 = r6.getHeight()
            r9.<init>(r12, r6)
            r6 = r9
            goto L_0x06ac
        L_0x06a7:
            android.util.Rational r6 = g0.a.f10216c
            goto L_0x06ac
        L_0x06aa:
            android.util.Rational r6 = g0.a.f10214a
        L_0x06ac:
            if (r6 != 0) goto L_0x06af
            goto L_0x06dc
        L_0x06af:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x06bd:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x06d7
            java.lang.Object r13 = r5.next()
            android.util.Size r13 = (android.util.Size) r13
            boolean r21 = g0.a.a(r13, r6)
            if (r21 == 0) goto L_0x06d3
            r9.add(r13)
            goto L_0x06bd
        L_0x06d3:
            r12.add(r13)
            goto L_0x06bd
        L_0x06d7:
            r5 = 0
            r12.addAll(r5, r9)
            r5 = r12
        L_0x06dc:
            z.n r6 = r15.f15861u
            r9 = 35
            if (r4 != r9) goto L_0x06e4
            r4 = 2
            goto L_0x06ef
        L_0x06e4:
            if (r4 != r8) goto L_0x06e8
            r4 = 3
            goto L_0x06ef
        L_0x06e8:
            r8 = 32
            if (r4 != r8) goto L_0x06ee
            r4 = 4
            goto L_0x06ef
        L_0x06ee:
            r4 = 1
        L_0x06ef:
            y.m r6 = r6.f17760a
            if (r6 != 0) goto L_0x06f4
            goto L_0x071e
        L_0x06f4:
            android.util.Size r4 = y.m.a(r4)
            if (r4 != 0) goto L_0x06fb
            goto L_0x071e
        L_0x06fb:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x0707:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x071d
            java.lang.Object r8 = r5.next()
            android.util.Size r8 = (android.util.Size) r8
            boolean r9 = r8.equals(r4)
            if (r9 != 0) goto L_0x0707
            r6.add(r8)
            goto L_0x0707
        L_0x071d:
            r5 = r6
        L_0x071e:
            r2.add(r5)
            goto L_0x0637
        L_0x0723:
            java.util.Iterator r1 = r2.iterator()
            r3 = 1
        L_0x0728:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x073a
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r3 = r3 * r4
            goto L_0x0728
        L_0x073a:
            if (r3 == 0) goto L_0x0e6c
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r1 = 0
        L_0x0742:
            if (r1 >= r3) goto L_0x074f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r12.add(r4)
            int r1 = r1 + 1
            goto L_0x0742
        L_0x074f:
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            int r1 = r3 / r1
            r4 = 0
            r5 = r3
        L_0x075e:
            int r6 = r2.size()
            if (r4 >= r6) goto L_0x07a0
            java.lang.Object r6 = r2.get(r4)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
        L_0x076b:
            if (r8 >= r3) goto L_0x0782
            java.lang.Object r9 = r12.get(r8)
            java.util.List r9 = (java.util.List) r9
            int r13 = r8 % r5
            int r13 = r13 / r1
            java.lang.Object r13 = r6.get(r13)
            android.util.Size r13 = (android.util.Size) r13
            r9.add(r13)
            int r8 = r8 + 1
            goto L_0x076b
        L_0x0782:
            int r6 = r2.size()
            int r6 = r6 + -1
            if (r4 >= r6) goto L_0x079d
            int r5 = r4 + 1
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r5 = r1 / r5
            r35 = r5
            r5 = r1
            r1 = r35
        L_0x079d:
            int r4 = r4 + 1
            goto L_0x075e
        L_0x07a0:
            r1 = 1
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            androidx.camera.core.impl.c r2 = v.s1.f15834a
            java.util.Iterator r2 = r11.iterator()
        L_0x07bb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x07dd
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.a r3 = (androidx.camera.core.impl.a) r3
            java.util.List r4 = r3.a()
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            androidx.camera.core.impl.y$b r4 = (androidx.camera.core.impl.y.b) r4
            androidx.camera.core.impl.i r3 = r3.d()
            boolean r3 = v.s1.e(r3, r4)
            if (r3 == 0) goto L_0x07bb
            goto L_0x07f9
        L_0x07dd:
            java.util.Iterator r2 = r7.iterator()
        L_0x07e1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x07f8
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.x r3 = (androidx.camera.core.impl.x) r3
            androidx.camera.core.impl.y$b r4 = r3.z()
            boolean r3 = v.s1.e(r3, r4)
            if (r3 == 0) goto L_0x07e1
            goto L_0x07f9
        L_0x07f8:
            r1 = 0
        L_0x07f9:
            java.util.Iterator r2 = r11.iterator()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5 = r3
        L_0x0801:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0836
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.a r3 = (androidx.camera.core.impl.a) r3
            int r4 = r3.c()
            android.util.Size r3 = r3.e()
            r38 = r2
            w.t r2 = r15.f15849i
            r21 = r6
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x082c }
            java.lang.Object r2 = r2.a(r6)     // Catch:{ Exception -> 0x082c }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ Exception -> 0x082c }
            long r2 = r2.getOutputMinFrameDuration(r4, r3)     // Catch:{ Exception -> 0x082c }
            double r2 = (double) r2
            double r2 = r19 / r2
            int r2 = (int) r2
            goto L_0x082d
        L_0x082c:
            r2 = 0
        L_0x082d:
            int r5 = java.lang.Math.min(r5, r2)
            r2 = r38
            r6 = r21
            goto L_0x0801
        L_0x0836:
            r21 = r6
            boolean r2 = r15.f15855o
            java.lang.String r6 = "SurfaceConfig does not map to any use case"
            if (r2 == 0) goto L_0x099b
            if (r1 != 0) goto L_0x099b
            java.util.Iterator r19 = r12.iterator()
            r1 = 0
        L_0x0845:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x0962
            java.lang.Object r1 = r19.next()
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r20 = 1
            r1 = r15
            r2 = r37
            r3 = r11
            r38 = r5
            r5 = r7
            r22 = r21
            r21 = r10
            r10 = r6
            r6 = r41
            r25 = r7
            r7 = r38
            r26 = r41
            r41 = r8
            r28 = r9
            r27 = r13
            r13 = r25
            r35 = r12
            r12 = r39
            r39 = r35
            r9 = r22
            android.util.Pair r1 = r1.g(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.first
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = r15.d(r0, r1)
            if (r1 == 0) goto L_0x0931
            androidx.camera.core.impl.y$b r2 = androidx.camera.core.impl.y.b.STREAM_SHARING
            r3 = 0
            r4 = r20
        L_0x088b:
            int r5 = r1.size()
            if (r3 >= r5) goto L_0x0926
            java.lang.Object r5 = r1.get(r3)
            f0.s0 r5 = (f0.s0) r5
            long r5 = r5.d()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r9 = r41
            boolean r7 = r9.containsKey(r7)
            if (r7 == 0) goto L_0x08dc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Object r7 = r9.get(r7)
            androidx.camera.core.impl.a r7 = (androidx.camera.core.impl.a) r7
            java.util.List r8 = r7.a()
            int r8 = r8.size()
            if (r8 != r4) goto L_0x08c7
            java.util.List r4 = r7.a()
            r8 = 0
            java.lang.Object r4 = r4.get(r8)
            androidx.camera.core.impl.y$b r4 = (androidx.camera.core.impl.y.b) r4
            goto L_0x08c9
        L_0x08c7:
            r8 = 0
            r4 = r2
        L_0x08c9:
            java.util.List r7 = r7.a()
            boolean r4 = v.s1.c(r4, r5, r7)
            r41 = r1
            if (r4 != 0) goto L_0x08d9
            r1 = r8
            r8 = r22
            goto L_0x092d
        L_0x08d9:
            r8 = r22
            goto L_0x0915
        L_0x08dc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r8 = r22
            boolean r4 = r8.containsKey(r4)
            if (r4 == 0) goto L_0x0920
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r8.get(r4)
            androidx.camera.core.impl.x r4 = (androidx.camera.core.impl.x) r4
            androidx.camera.core.impl.y$b r7 = r4.z()
            r41 = r1
            androidx.camera.core.impl.y$b r1 = r4.z()
            if (r1 != r2) goto L_0x0909
            p0.c r4 = (p0.c) r4
            androidx.camera.core.impl.c r1 = p0.c.F
            java.lang.Object r1 = f0.b0.k(r4, r1)
            java.util.List r1 = (java.util.List) r1
            goto L_0x090d
        L_0x0909:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x090d:
            boolean r1 = v.s1.c(r7, r5, r1)
            if (r1 != 0) goto L_0x0915
            r1 = 0
            goto L_0x092d
        L_0x0915:
            int r3 = r3 + 1
            r4 = 1
            r1 = r41
            r22 = r8
            r41 = r9
            goto L_0x088b
        L_0x0920:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r10)
            throw r0
        L_0x0926:
            r9 = r41
            r41 = r1
            r8 = r22
            r1 = 1
        L_0x092d:
            if (r1 != 0) goto L_0x0937
            r1 = 0
            goto L_0x0939
        L_0x0931:
            r9 = r41
            r41 = r1
            r8 = r22
        L_0x0937:
            r1 = r41
        L_0x0939:
            if (r1 == 0) goto L_0x0945
            w.t r2 = r15.f15849i
            boolean r2 = v.s1.a(r2, r1)
            if (r2 == 0) goto L_0x0944
            goto L_0x0977
        L_0x0944:
            r1 = 0
        L_0x0945:
            r9.clear()
            r8.clear()
            r5 = r38
            r6 = r10
            r7 = r13
            r10 = r21
            r41 = r26
            r13 = r27
            r21 = r8
            r8 = r9
            r9 = r28
            r35 = r12
            r12 = r39
            r39 = r35
            goto L_0x0845
        L_0x0962:
            r26 = r41
            r38 = r5
            r28 = r9
            r27 = r13
            r13 = r7
            r9 = r8
            r8 = r21
            r21 = r10
            r10 = r6
            r35 = r12
            r12 = r39
            r39 = r35
        L_0x0977:
            if (r1 != 0) goto L_0x09b1
            if (r24 == 0) goto L_0x097c
            goto L_0x09b1
        L_0x097c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r16)
            java.lang.String r2 = r15.f15847g
            r1.append(r2)
            r1.append(r14)
            r1.append(r11)
            r1.append(r12)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x099b:
            r26 = r41
            r38 = r5
            r28 = r9
            r27 = r13
            r13 = r7
            r9 = r8
            r8 = r21
            r21 = r10
            r10 = r6
            r35 = r12
            r12 = r39
            r39 = r35
            r1 = 0
        L_0x09b1:
            r14 = r1
            java.util.Iterator r19 = r39.iterator()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r1
            r20 = r3
            r22 = r4
            r24 = r5
            r25 = r6
            r6 = r2
        L_0x09ca:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x0a80
            java.lang.Object r1 = r19.next()
            r29 = r1
            java.util.List r29 = (java.util.List) r29
            r30 = 0
            r31 = 0
            r32 = 0
            r1 = r15
            r2 = r37
            r3 = r11
            r4 = r29
            r5 = r13
            r33 = r6
            r6 = r26
            r34 = r7
            r7 = r38
            r39 = r12
            r12 = r8
            r8 = r30
            r30 = r10
            r10 = r9
            r9 = r31
            android.util.Pair r1 = r1.g(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r1.first
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r7 = r1.intValue()
            r3 = r38
            if (r23 == 0) goto L_0x0a1c
            if (r3 <= r7) goto L_0x0a1c
            java.lang.Comparable r1 = r23.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r7 >= r1) goto L_0x0a1c
            r1 = r32
            goto L_0x0a1d
        L_0x0a1c:
            r1 = 1
        L_0x0a1d:
            if (r20 != 0) goto L_0x0a45
            boolean r4 = r15.a(r0, r2)
            if (r4 == 0) goto L_0x0a45
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = r34
            if (r5 != r4) goto L_0x0a2d
            goto L_0x0a2f
        L_0x0a2d:
            if (r5 >= r7) goto L_0x0a32
        L_0x0a2f:
            r5 = r7
            r24 = r29
        L_0x0a32:
            if (r1 == 0) goto L_0x0a47
            if (r22 == 0) goto L_0x0a3e
            r1 = r25
            r0 = r29
            r6 = r33
            goto L_0x0a8e
        L_0x0a3e:
            r4 = 1
            r20 = r4
            r5 = r7
            r24 = r29
            goto L_0x0a47
        L_0x0a45:
            r5 = r34
        L_0x0a47:
            if (r14 == 0) goto L_0x0a72
            if (r22 != 0) goto L_0x0a72
            java.util.List r2 = r15.d(r0, r2)
            if (r2 == 0) goto L_0x0a72
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = r33
            if (r4 != r2) goto L_0x0a59
            goto L_0x0a5b
        L_0x0a59:
            if (r4 >= r7) goto L_0x0a5f
        L_0x0a5b:
            r6 = r7
            r25 = r29
            goto L_0x0a60
        L_0x0a5f:
            r6 = r4
        L_0x0a60:
            if (r1 == 0) goto L_0x0a75
            if (r20 == 0) goto L_0x0a6b
            r6 = r7
            r0 = r24
            r1 = r29
            r7 = r5
            goto L_0x0a8e
        L_0x0a6b:
            r1 = 1
            r22 = r1
            r6 = r7
            r25 = r29
            goto L_0x0a75
        L_0x0a72:
            r4 = r33
            r6 = r4
        L_0x0a75:
            r38 = r3
            r7 = r5
            r9 = r10
            r8 = r12
            r10 = r30
            r12 = r39
            goto L_0x09ca
        L_0x0a80:
            r4 = r6
            r5 = r7
            r30 = r10
            r39 = r12
            r12 = r8
            r10 = r9
            r32 = 0
            r0 = r24
            r1 = r25
        L_0x0a8e:
            if (r0 == 0) goto L_0x0e3d
            if (r23 == 0) goto L_0x0c3a
            w.t r2 = r15.f15849i
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r2 = r2.a(r3)
            android.util.Range[] r2 = (android.util.Range[]) r2
            if (r2 != 0) goto L_0x0ab2
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.v.f1409a
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            goto L_0x0c38
        L_0x0ab2:
            android.util.Range r3 = new android.util.Range
            java.lang.Comparable r4 = r23.getLower()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.min(r4, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Comparable r5 = r23.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = java.lang.Math.min(r5, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.<init>(r4, r5)
            android.util.Range<java.lang.Integer> r4 = androidx.camera.core.impl.v.f1409a
            int r5 = r2.length
            r8 = r32
            r9 = r8
        L_0x0ae1:
            if (r8 >= r5) goto L_0x0c27
            r16 = r5
            r5 = r2[r8]
            java.lang.Comparable r19 = r5.getLower()
            java.lang.Integer r19 = (java.lang.Integer) r19
            r37 = r2
            int r2 = r19.intValue()
            if (r7 < r2) goto L_0x0bfd
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.v.f1409a
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0afe
            r4 = r5
        L_0x0afe:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x0b16
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            goto L_0x0c4b
        L_0x0b16:
            android.util.Range r2 = r5.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x0bb9 }
            int r2 = v.t1.f(r2)     // Catch:{ IllegalArgumentException -> 0x0bb9 }
            if (r9 != 0) goto L_0x0b33
            r38 = r1
            r9 = r2
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            goto L_0x0c0e
        L_0x0b33:
            if (r2 < r9) goto L_0x0bfd
            android.util.Range r2 = r4.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x0bb9 }
            int r2 = v.t1.f(r2)     // Catch:{ IllegalArgumentException -> 0x0bb9 }
            r41 = r10
            r19 = r11
            double r10 = (double) r2
            android.util.Range r2 = r5.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x0bb0 }
            int r2 = v.t1.f(r2)     // Catch:{ IllegalArgumentException -> 0x0bb0 }
            r38 = r1
            double r1 = (double) r2
            r22 = r12
            int r12 = v.t1.f(r5)     // Catch:{ IllegalArgumentException -> 0x0ba7 }
            r20 = r6
            r23 = r7
            double r6 = (double) r12
            double r6 = r1 / r6
            int r12 = v.t1.f(r4)     // Catch:{ IllegalArgumentException -> 0x0bab }
            r25 = r14
            r24 = r15
            double r14 = (double) r12
            double r14 = r10 / r14
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r1 <= 0) goto L_0x0b74
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0b9c
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 < 0) goto L_0x0b9d
            goto L_0x0b9c
        L_0x0b74:
            if (r1 != 0) goto L_0x0b94
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b7b
            goto L_0x0b9c
        L_0x0b7b:
            if (r1 != 0) goto L_0x0b9d
            java.lang.Comparable r1 = r5.getLower()     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            java.lang.Comparable r2 = r4.getLower()     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            int r2 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            if (r1 <= r2) goto L_0x0b9d
            goto L_0x0b9c
        L_0x0b94:
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0b9d
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b9d
        L_0x0b9c:
            r4 = r5
        L_0x0b9d:
            android.util.Range r1 = r3.intersect(r4)     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            int r9 = v.t1.f(r1)     // Catch:{ IllegalArgumentException -> 0x0bc4 }
            goto L_0x0c0f
        L_0x0ba7:
            r20 = r6
            r23 = r7
        L_0x0bab:
            r25 = r14
            r24 = r15
            goto L_0x0bc4
        L_0x0bb0:
            r38 = r1
            r20 = r6
            r23 = r7
        L_0x0bb6:
            r22 = r12
            goto L_0x0bab
        L_0x0bb9:
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            goto L_0x0bb6
        L_0x0bc4:
            if (r9 != 0) goto L_0x0c0f
            int r1 = v.t1.e(r5, r3)
            int r2 = v.t1.e(r4, r3)
            if (r1 >= r2) goto L_0x0bd1
            goto L_0x0c0e
        L_0x0bd1:
            int r1 = v.t1.e(r5, r3)
            int r2 = v.t1.e(r4, r3)
            if (r1 != r2) goto L_0x0c0f
            java.lang.Comparable r1 = r5.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Comparable r2 = r4.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x0bf2
            goto L_0x0c0e
        L_0x0bf2:
            int r1 = v.t1.f(r5)
            int r2 = v.t1.f(r4)
            if (r1 >= r2) goto L_0x0c0f
            goto L_0x0c0e
        L_0x0bfd:
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            r5 = r4
        L_0x0c0e:
            r4 = r5
        L_0x0c0f:
            int r8 = r8 + 1
            r2 = r37
            r1 = r38
            r10 = r41
            r5 = r16
            r11 = r19
            r6 = r20
            r12 = r22
            r7 = r23
            r15 = r24
            r14 = r25
            goto L_0x0ae1
        L_0x0c27:
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            r2 = r4
        L_0x0c38:
            r5 = r2
            goto L_0x0c4b
        L_0x0c3a:
            r38 = r1
            r20 = r6
            r23 = r7
            r41 = r10
            r19 = r11
            r22 = r12
            r25 = r14
            r24 = r15
            r5 = 0
        L_0x0c4b:
            java.util.Iterator r1 = r13.iterator()
        L_0x0c4f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0d03
            java.lang.Object r2 = r1.next()
            androidx.camera.core.impl.x r2 = (androidx.camera.core.impl.x) r2
            int r3 = r13.indexOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = r26
            int r3 = r4.indexOf(r3)
            java.lang.Object r3 = r0.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            android.util.Range<java.lang.Integer> r6 = androidx.camera.core.impl.v.f1409a
            androidx.camera.core.impl.e$a r6 = new androidx.camera.core.impl.e$a
            r6.<init>()
            if (r3 == 0) goto L_0x0cfb
            r6.f1348a = r3
            android.util.Range<java.lang.Integer> r3 = androidx.camera.core.impl.v.f1409a
            if (r3 == 0) goto L_0x0cf3
            r6.f1350c = r3
            c0.x r3 = c0.x.f4367d
            r6.f1349b = r3
            r3 = r21
            java.lang.Object r7 = r3.get(r2)
            c0.x r7 = (c0.x) r7
            r7.getClass()
            r6.f1349b = r7
            androidx.camera.core.impl.q r7 = androidx.camera.core.impl.q.L()
            androidx.camera.core.impl.c r8 = u.a.G
            boolean r9 = r2.c(r8)
            if (r9 == 0) goto L_0x0ca6
            java.lang.Object r9 = r2.a(r8)
            java.lang.Long r9 = (java.lang.Long) r9
            r7.O(r8, r9)
        L_0x0ca6:
            androidx.camera.core.impl.c r8 = androidx.camera.core.impl.x.f1422w
            boolean r9 = r2.c(r8)
            if (r9 == 0) goto L_0x0cb7
            java.lang.Object r9 = r2.a(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r7.O(r8, r9)
        L_0x0cb7:
            androidx.camera.core.impl.c r8 = androidx.camera.core.impl.m.F
            boolean r9 = r2.c(r8)
            if (r9 == 0) goto L_0x0cc8
            java.lang.Object r9 = r2.a(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            r7.O(r8, r9)
        L_0x0cc8:
            androidx.camera.core.impl.c r8 = androidx.camera.core.impl.n.f1379d
            boolean r9 = r2.c(r8)
            if (r9 == 0) goto L_0x0cd9
            java.lang.Object r9 = r2.a(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            r7.O(r8, r9)
        L_0x0cd9:
            u.a r8 = new u.a
            r8.<init>(r7)
            r6.f1351d = r8
            if (r5 == 0) goto L_0x0ce4
            r6.f1350c = r5
        L_0x0ce4:
            androidx.camera.core.impl.e r6 = r6.a()
            r7 = r28
            r7.put(r2, r6)
            r21 = r3
            r26 = r4
            goto L_0x0c4f
        L_0x0cf3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null expectedFrameRateRange"
            r0.<init>(r1)
            throw r0
        L_0x0cfb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null resolution"
            r0.<init>(r1)
            throw r0
        L_0x0d03:
            r7 = r28
            if (r25 == 0) goto L_0x0dcc
            r4 = r20
            r5 = r23
            if (r5 != r4) goto L_0x0dcc
            int r1 = r0.size()
            int r2 = r38.size()
            if (r1 != r2) goto L_0x0dcc
            r1 = r32
        L_0x0d19:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0d38
            java.lang.Object r2 = r0.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            r3 = r38
            java.lang.Object r4 = r3.get(r1)
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0d33
            r0 = 1
            goto L_0x0d3a
        L_0x0d33:
            int r1 = r1 + 1
            r38 = r3
            goto L_0x0d19
        L_0x0d38:
            r0 = r32
        L_0x0d3a:
            if (r0 != 0) goto L_0x0dcc
            r1 = r24
            w.t r0 = r1.f15849i
            r2 = r19
            r1 = r27
            boolean r0 = v.s1.f(r0, r2, r7, r1)
            if (r0 != 0) goto L_0x0dce
            r0 = r32
        L_0x0d4c:
            int r2 = r25.size()
            if (r0 >= r2) goto L_0x0dce
            r2 = r25
            java.lang.Object r3 = r2.get(r0)
            f0.s0 r3 = (f0.s0) r3
            long r3 = r3.d()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = r41
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L_0x0d88
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.get(r5)
            androidx.camera.core.impl.a r5 = (androidx.camera.core.impl.a) r5
            androidx.camera.core.impl.i r8 = r5.d()
            u.a r3 = v.s1.b(r8, r3)
            if (r3 == 0) goto L_0x0d85
            androidx.camera.core.impl.e r3 = r5.h(r3)
            r1.put(r5, r3)
        L_0x0d85:
            r8 = r22
            goto L_0x0dbb
        L_0x0d88:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r8 = r22
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x0dc4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r8.get(r5)
            androidx.camera.core.impl.x r5 = (androidx.camera.core.impl.x) r5
            java.lang.Object r9 = r7.get(r5)
            androidx.camera.core.impl.v r9 = (androidx.camera.core.impl.v) r9
            androidx.camera.core.impl.i r10 = r9.c()
            u.a r3 = v.s1.b(r10, r3)
            if (r3 == 0) goto L_0x0dbb
            androidx.camera.core.impl.e$a r4 = r9.e()
            r4.f1351d = r3
            androidx.camera.core.impl.e r3 = r4.a()
            r7.put(r5, r3)
        L_0x0dbb:
            int r0 = r0 + 1
            r25 = r2
            r41 = r6
            r22 = r8
            goto L_0x0d4c
        L_0x0dc4:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r30
            r0.<init>(r1)
            throw r0
        L_0x0dcc:
            r1 = r27
        L_0x0dce:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r1)
            java.util.Set r1 = r40.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0ddb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0e01
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            c0.f1 r3 = (c0.f1) r3
            java.lang.Object r4 = r0.first
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r4.get(r2)
            androidx.camera.core.impl.v r2 = (androidx.camera.core.impl.v) r2
            r4 = r17
            r4.put(r3, r2)
            goto L_0x0ddb
        L_0x0e01:
            r4 = r17
            java.lang.Object r0 = r0.second
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0e0f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0ea5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r3 = r18
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x0e3a
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r3.get(r2)
            c0.f1 r2 = (c0.f1) r2
            java.lang.Object r1 = r1.getValue()
            androidx.camera.core.impl.v r1 = (androidx.camera.core.impl.v) r1
            r4.put(r2, r1)
        L_0x0e3a:
            r18 = r3
            goto L_0x0e0f
        L_0x0e3d:
            r2 = r11
            r1 = r15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r16)
            java.lang.String r4 = r1.f15847g
            r3.append(r4)
            java.lang.String r4 = " and Hardware level: "
            r3.append(r4)
            int r1 = r1.f15851k
            r3.append(r1)
            java.lang.String r1 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r3.append(r1)
            r3.append(r2)
            r4 = r39
            r3.append(r4)
            r3.append(r13)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0e6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x0e74:
            r13 = r38
            r4 = r9
            r2 = r11
            r1 = r15
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r16)
            java.lang.String r1 = r1.f15847g
            r3.append(r1)
            r3.append(r14)
            r3.append(r2)
            r3.append(r4)
            r3.append(r13)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0e98:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No such camera id in supported combination list: "
            java.lang.String r1 = f0.b0.r(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0ea4:
            r4 = r12
        L_0x0ea5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.p(int, f0.q, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):java.util.HashMap");
    }

    public final p0.a r(LinkedHashSet linkedHashSet, boolean z10) {
        boolean z11;
        synchronized (this.f1443r) {
            HashSet u10 = u(linkedHashSet, z10);
            if (u10.size() < 2) {
                return null;
            }
            p0.a aVar = this.f1447v;
            if (aVar == null || !aVar.f13884o.f13891a.equals(u10)) {
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = u10.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        z11 = true;
                        break;
                    }
                    f1 f1Var = (f1) it.next();
                    z11 = false;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 3) {
                            int i11 = iArr[i10];
                            if (f1Var.l(i11)) {
                                if (hashSet.contains(Integer.valueOf(i11))) {
                                    break loop0;
                                }
                                hashSet.add(Integer.valueOf(i11));
                            }
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    return null;
                }
                p0.a aVar2 = new p0.a(this.f1433a, u10, this.f1435c);
                return aVar2;
            }
            p0.a aVar3 = this.f1447v;
            Objects.requireNonNull(aVar3);
            return aVar3;
        }
    }

    public final void s() {
        synchronized (this.f1443r) {
            if (this.f1444s) {
                this.f1433a.k(new ArrayList(this.f1438f));
                synchronized (this.f1443r) {
                    CameraControlInternal h10 = this.f1433a.h();
                    this.f1445t = h10.g();
                    h10.h();
                }
                this.f1444s = false;
            }
        }
    }

    public final int t() {
        synchronized (this.f1443r) {
            if (((a0.a) this.f1439n).f8e == 2) {
                return 1;
            }
            return 0;
        }
    }

    public final HashSet u(LinkedHashSet linkedHashSet, boolean z10) {
        int i10;
        HashSet hashSet = new HashSet();
        synchronized (this.f1443r) {
            for (k kVar : this.f1441p) {
                kVar.getClass();
            }
            i10 = 0;
            if (z10) {
                i10 = 3;
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            g0.y("Only support one level of sharing for now.", !(f1Var instanceof p0.a));
            if (f1Var.l(i10)) {
                hashSet.add(f1Var);
            }
        }
        return hashSet;
    }

    public final List<f1> v() {
        ArrayList arrayList;
        synchronized (this.f1443r) {
            arrayList = new ArrayList(this.f1437e);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x016c A[Catch:{ IllegalArgumentException -> 0x0165 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(java.util.LinkedHashSet r19, boolean r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            java.lang.Object r9 = r7.f1443r
            monitor-enter(r9)
            c0.f1 r0 = r18.d(r19)     // Catch:{ all -> 0x0190 }
            p0.a r10 = r18.r(r19, r20)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0190 }
            r11.<init>(r8)     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0019
            r11.add(r0)     // Catch:{ all -> 0x0190 }
        L_0x0019:
            if (r10 == 0) goto L_0x0025
            r11.add(r10)     // Catch:{ all -> 0x0190 }
            p0.e r1 = r10.f13884o     // Catch:{ all -> 0x0190 }
            java.util.Set<c0.f1> r1 = r1.f13891a     // Catch:{ all -> 0x0190 }
            r11.removeAll(r1)     // Catch:{ all -> 0x0190 }
        L_0x0025:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0190 }
            r12.<init>(r11)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1438f     // Catch:{ all -> 0x0190 }
            r12.removeAll(r1)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0190 }
            r13.<init>(r11)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1438f     // Catch:{ all -> 0x0190 }
            r13.retainAll(r1)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1438f     // Catch:{ all -> 0x0190 }
            r14.<init>(r1)     // Catch:{ all -> 0x0190 }
            r14.removeAll(r11)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.f r1 = r7.f1442q     // Catch:{ all -> 0x0190 }
            f0.n$a r1 = (f0.n.a) r1     // Catch:{ all -> 0x0190 }
            r1.getClass()     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.c r2 = androidx.camera.core.impl.f.f1352a     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.y$a r3 = androidx.camera.core.impl.y.f1425a     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.i r1 = r1.b()     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.r r1 = (androidx.camera.core.impl.r) r1     // Catch:{ all -> 0x0190 }
            java.lang.Object r1 = r1.e(r2, r3)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.y r1 = (androidx.camera.core.impl.y) r1     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.y r2 = r7.f1435c     // Catch:{ all -> 0x0190 }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x0190 }
            r15.<init>()     // Catch:{ all -> 0x0190 }
            java.util.Iterator r3 = r12.iterator()     // Catch:{ all -> 0x0190 }
        L_0x0065:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0190 }
            r6 = 0
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0190 }
            c0.f1 r4 = (c0.f1) r4     // Catch:{ all -> 0x0190 }
            androidx.camera.core.internal.CameraUseCaseAdapter$b r5 = new androidx.camera.core.internal.CameraUseCaseAdapter$b     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.x r6 = r4.e(r6, r1)     // Catch:{ all -> 0x0190 }
            r17 = r10
            r10 = 1
            androidx.camera.core.impl.x r10 = r4.e(r10, r2)     // Catch:{ all -> 0x0190 }
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0190 }
            r15.put(r4, r5)     // Catch:{ all -> 0x0190 }
            r10 = r17
            goto L_0x0065
        L_0x0088:
            r17 = r10
            r10 = 1
            int r2 = r18.t()     // Catch:{ IllegalArgumentException -> 0x0167 }
            f0.r r1 = r7.f1433a     // Catch:{ IllegalArgumentException -> 0x0167 }
            f0.q r3 = r1.n()     // Catch:{ IllegalArgumentException -> 0x0167 }
            r1 = r18
            r4 = r12
            r5 = r13
            r16 = r6
            r6 = r15
            java.util.HashMap r1 = r1.p(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0165 }
            r7.A(r11, r1)     // Catch:{ all -> 0x0190 }
            java.util.List<c0.k> r2 = r7.f1441p     // Catch:{ all -> 0x0190 }
            y(r2, r11, r8)     // Catch:{ all -> 0x0190 }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0190 }
        L_0x00ac:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0190 }
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0190 }
            c0.f1 r3 = (c0.f1) r3     // Catch:{ all -> 0x0190 }
            f0.r r4 = r7.f1433a     // Catch:{ all -> 0x0190 }
            r3.A(r4)     // Catch:{ all -> 0x0190 }
            goto L_0x00ac
        L_0x00be:
            f0.r r2 = r7.f1433a     // Catch:{ all -> 0x0190 }
            r2.k(r14)     // Catch:{ all -> 0x0190 }
            boolean r2 = r14.isEmpty()     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x00fa
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0190 }
        L_0x00cd:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0190 }
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0190 }
            c0.f1 r3 = (c0.f1) r3     // Catch:{ all -> 0x0190 }
            boolean r4 = r1.containsKey(r3)     // Catch:{ all -> 0x0190 }
            if (r4 == 0) goto L_0x00cd
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.v r4 = (androidx.camera.core.impl.v) r4     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.i r5 = r4.c()     // Catch:{ all -> 0x0190 }
            if (r5 == 0) goto L_0x00cd
            androidx.camera.core.impl.u r6 = r3.f4266m     // Catch:{ all -> 0x0190 }
            boolean r4 = w(r4, r6)     // Catch:{ all -> 0x0190 }
            if (r4 == 0) goto L_0x00cd
            androidx.camera.core.impl.e r4 = r3.v(r5)     // Catch:{ all -> 0x0190 }
            r3.f4260g = r4     // Catch:{ all -> 0x0190 }
            goto L_0x00cd
        L_0x00fa:
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x0190 }
        L_0x00fe:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0190 }
            if (r3 == 0) goto L_0x012c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0190 }
            c0.f1 r3 = (c0.f1) r3     // Catch:{ all -> 0x0190 }
            java.lang.Object r4 = r15.get(r3)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.internal.CameraUseCaseAdapter$b r4 = (androidx.camera.core.internal.CameraUseCaseAdapter.b) r4     // Catch:{ all -> 0x0190 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0190 }
            f0.r r5 = r7.f1433a     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.x<?> r6 = r4.f1451a     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.x<?> r4 = r4.f1452b     // Catch:{ all -> 0x0190 }
            r3.a(r5, r6, r4)     // Catch:{ all -> 0x0190 }
            java.lang.Object r4 = r1.get(r3)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.v r4 = (androidx.camera.core.impl.v) r4     // Catch:{ all -> 0x0190 }
            r4.getClass()     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.v r4 = r3.w(r4)     // Catch:{ all -> 0x0190 }
            r3.f4260g = r4     // Catch:{ all -> 0x0190 }
            goto L_0x00fe
        L_0x012c:
            boolean r1 = r7.f1444s     // Catch:{ all -> 0x0190 }
            if (r1 == 0) goto L_0x0135
            f0.r r1 = r7.f1433a     // Catch:{ all -> 0x0190 }
            r1.l(r12)     // Catch:{ all -> 0x0190 }
        L_0x0135:
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x0190 }
        L_0x0139:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0190 }
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0190 }
            c0.f1 r2 = (c0.f1) r2     // Catch:{ all -> 0x0190 }
            r2.p()     // Catch:{ all -> 0x0190 }
            goto L_0x0139
        L_0x0149:
            java.util.ArrayList r1 = r7.f1437e     // Catch:{ all -> 0x0190 }
            r1.clear()     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1437e     // Catch:{ all -> 0x0190 }
            r1.addAll(r8)     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1438f     // Catch:{ all -> 0x0190 }
            r1.clear()     // Catch:{ all -> 0x0190 }
            java.util.ArrayList r1 = r7.f1438f     // Catch:{ all -> 0x0190 }
            r1.addAll(r11)     // Catch:{ all -> 0x0190 }
            r7.f1446u = r0     // Catch:{ all -> 0x0190 }
            r0 = r17
            r7.f1447v = r0     // Catch:{ all -> 0x0190 }
            monitor-exit(r9)     // Catch:{ all -> 0x0190 }
            return
        L_0x0165:
            r0 = move-exception
            goto L_0x016a
        L_0x0167:
            r0 = move-exception
            r16 = r6
        L_0x016a:
            if (r20 != 0) goto L_0x018d
            java.lang.Object r1 = r7.f1443r     // Catch:{ all -> 0x0190 }
            monitor-enter(r1)     // Catch:{ all -> 0x0190 }
            androidx.camera.core.impl.f r2 = r7.f1442q     // Catch:{ all -> 0x018a }
            f0.n$a r3 = f0.n.f9564a     // Catch:{ all -> 0x018a }
            if (r2 != r3) goto L_0x0177
            r6 = r10
            goto L_0x0179
        L_0x0177:
            r6 = r16
        L_0x0179:
            monitor-exit(r1)     // Catch:{ all -> 0x018a }
            if (r6 == 0) goto L_0x018d
            d0.a r1 = r7.f1439n     // Catch:{ all -> 0x0190 }
            a0.a r1 = (a0.a) r1     // Catch:{ all -> 0x0190 }
            int r1 = r1.f8e     // Catch:{ all -> 0x0190 }
            r2 = 2
            if (r1 == r2) goto L_0x018d
            r7.z(r8, r10)     // Catch:{ all -> 0x0190 }
            monitor-exit(r9)     // Catch:{ all -> 0x0190 }
            return
        L_0x018a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x018d:
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x018e:
            monitor-exit(r9)     // Catch:{ all -> 0x0190 }
            throw r0
        L_0x0190:
            r0 = move-exception
            goto L_0x018e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.CameraUseCaseAdapter.z(java.util.LinkedHashSet, boolean):void");
    }
}
