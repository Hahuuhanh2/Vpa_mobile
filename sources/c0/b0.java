package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import f0.e0;
import g0.m;
import j0.h;
import j0.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p3.l0;

/* compiled from: ImageAnalysis */
public final class b0 extends f1 {

    /* renamed from: s  reason: collision with root package name */
    public static final d f4184s = new d();

    /* renamed from: n  reason: collision with root package name */
    public final e0 f4185n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f4186o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public a f4187p;

    /* renamed from: q  reason: collision with root package name */
    public u.b f4188q;

    /* renamed from: r  reason: collision with root package name */
    public e0 f4189r;

    /* compiled from: ImageAnalysis */
    public interface a {
        void a();

        void b(v0 v0Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: ImageAnalysis */
    public @interface b {
    }

    /* compiled from: ImageAnalysis */
    public static final class c implements x.a<b0, l, c> {

        /* renamed from: a  reason: collision with root package name */
        public final q f4190a;

        public c() {
            this(q.L());
        }

        public final p a() {
            return this.f4190a;
        }

        public final x b() {
            return new l(r.K(this.f4190a));
        }

        public c(q qVar) {
            Object obj;
            Class<b0> cls = b0.class;
            this.f4190a = qVar;
            Object obj2 = null;
            try {
                obj = qVar.a(h.B);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f4190a.O(h.B, cls);
                q qVar2 = this.f4190a;
                androidx.camera.core.impl.c cVar = h.A;
                qVar2.getClass();
                try {
                    obj2 = qVar2.a(cVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f4190a.O(h.A, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* compiled from: ImageAnalysis */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final l f4191a;

        static {
            Size size = new Size(640, 480);
            x xVar = x.f4367d;
            o0.b bVar = new o0.b(l0.f13962t, new o0.c(m0.a.f13037b), (o0.a) null, 0);
            c cVar = new c();
            cVar.f4190a.O(o.f1386k, size);
            cVar.f4190a.O(x.f1419t, 1);
            cVar.f4190a.O(o.f1381f, 0);
            cVar.f4190a.O(o.f1389n, bVar);
            cVar.f4190a.O(x.f1424y, y.b.IMAGE_ANALYSIS);
            if (xVar.equals(xVar)) {
                cVar.f4190a.O(n.f1380e, xVar);
                f4191a = new l(r.K(cVar.f4190a));
                return;
            }
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: ImageAnalysis */
    public @interface e {
    }

    public b0(l lVar) {
        super(lVar);
        h0.d dVar;
        if (((Integer) ((r) ((l) this.f4259f).b()).e(l.F, 0)).intValue() == 1) {
            this.f4185n = new f0();
        } else {
            if (h0.d.f10514b != null) {
                dVar = h0.d.f10514b;
            } else {
                synchronized (h0.d.class) {
                    if (h0.d.f10514b == null) {
                        h0.d.f10514b = new h0.d();
                    }
                }
                dVar = h0.d.f10514b;
            }
            this.f4185n = new androidx.camera.core.c((Executor) lVar.e(i.C, dVar));
        }
        this.f4185n.f4232d = D();
        e0 e0Var = this.f4185n;
        l lVar2 = (l) this.f4259f;
        Boolean bool = Boolean.FALSE;
        lVar2.getClass();
        e0Var.f4233e = ((Boolean) ((r) lVar2.b()).e(l.K, bool)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        if (r12.equals((java.lang.Boolean) ((androidx.camera.core.impl.r) r13.b()).e(androidx.camera.core.impl.l.J, null)) != false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.u.b C(java.lang.String r16, androidx.camera.core.impl.l r17, androidx.camera.core.impl.v r18) {
        /*
            r15 = this;
            r7 = r15
            r0 = r17
            g0.m.a()
            android.util.Size r1 = r18.d()
            h0.d r2 = h0.d.f10514b
            if (r2 == 0) goto L_0x0011
            h0.d r2 = h0.d.f10514b
            goto L_0x0022
        L_0x0011:
            java.lang.Class<h0.d> r2 = h0.d.class
            monitor-enter(r2)
            h0.d r3 = h0.d.f10514b     // Catch:{ all -> 0x01eb }
            if (r3 != 0) goto L_0x001f
            h0.d r3 = new h0.d     // Catch:{ all -> 0x01eb }
            r3.<init>()     // Catch:{ all -> 0x01eb }
            h0.d.f10514b = r3     // Catch:{ all -> 0x01eb }
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x01eb }
            h0.d r2 = h0.d.f10514b
        L_0x0022:
            r17.getClass()
            androidx.camera.core.impl.c r3 = j0.i.C
            java.lang.Object r2 = r0.e(r3, r2)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r2.getClass()
            androidx.camera.core.impl.x<?> r3 = r7.f4259f
            androidx.camera.core.impl.l r3 = (androidx.camera.core.impl.l) r3
            androidx.camera.core.impl.c r4 = androidx.camera.core.impl.l.F
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            androidx.camera.core.impl.i r3 = r3.b()
            androidx.camera.core.impl.r r3 = (androidx.camera.core.impl.r) r3
            java.lang.Object r3 = r3.e(r4, r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L_0x006d
            androidx.camera.core.impl.x<?> r3 = r7.f4259f
            androidx.camera.core.impl.l r3 = (androidx.camera.core.impl.l) r3
            r6 = 6
            r3.getClass()
            androidx.camera.core.impl.c r8 = androidx.camera.core.impl.l.G
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            androidx.camera.core.impl.i r3 = r3.b()
            androidx.camera.core.impl.r r3 = (androidx.camera.core.impl.r) r3
            java.lang.Object r3 = r3.e(r8, r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x006e
        L_0x006d:
            r3 = 4
        L_0x006e:
            androidx.camera.core.impl.c r6 = androidx.camera.core.impl.l.H
            androidx.camera.core.impl.i r8 = r17.b()
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.r) r8
            r9 = 0
            java.lang.Object r8 = r8.e(r6, r9)
            c0.n0 r8 = (c0.n0) r8
            if (r8 == 0) goto L_0x009e
            androidx.camera.core.f r3 = new androidx.camera.core.f
            androidx.camera.core.impl.i r8 = r17.b()
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.r) r8
            java.lang.Object r6 = r8.e(r6, r9)
            c0.n0 r6 = (c0.n0) r6
            r1.getWidth()
            r1.getHeight()
            r15.f()
            f0.d0 r6 = r6.b()
            r3.<init>(r6)
            goto L_0x00b9
        L_0x009e:
            androidx.camera.core.f r6 = new androidx.camera.core.f
            int r8 = r1.getWidth()
            int r10 = r1.getHeight()
            int r11 = r15.f()
            android.media.ImageReader r3 = android.media.ImageReader.newInstance(r8, r10, r11, r3)
            c0.b r8 = new c0.b
            r8.<init>(r3)
            r6.<init>(r8)
            r3 = r6
        L_0x00b9:
            f0.r r6 = r15.b()
            if (r6 == 0) goto L_0x00ea
            f0.r r6 = r15.b()
            androidx.camera.core.impl.x<?> r8 = r7.f4259f
            androidx.camera.core.impl.l r8 = (androidx.camera.core.impl.l) r8
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.getClass()
            androidx.camera.core.impl.c r11 = androidx.camera.core.impl.l.K
            androidx.camera.core.impl.i r8 = r8.b()
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.r) r8
            java.lang.Object r8 = r8.e(r11, r10)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00ea
            int r6 = r15.h(r6, r5)
            int r6 = r6 % 180
            if (r6 == 0) goto L_0x00ea
            r6 = r4
            goto L_0x00eb
        L_0x00ea:
            r6 = r5
        L_0x00eb:
            if (r6 == 0) goto L_0x00f2
            int r8 = r1.getHeight()
            goto L_0x00f6
        L_0x00f2:
            int r8 = r1.getWidth()
        L_0x00f6:
            if (r6 == 0) goto L_0x00fd
            int r6 = r1.getWidth()
            goto L_0x0101
        L_0x00fd:
            int r6 = r1.getHeight()
        L_0x0101:
            int r10 = r15.D()
            r11 = 2
            r12 = 35
            if (r10 != r11) goto L_0x010c
            r10 = r4
            goto L_0x010d
        L_0x010c:
            r10 = r12
        L_0x010d:
            int r13 = r15.f()
            if (r13 != r12) goto L_0x011b
            int r13 = r15.D()
            if (r13 != r11) goto L_0x011b
            r11 = r4
            goto L_0x011c
        L_0x011b:
            r11 = r5
        L_0x011c:
            int r13 = r15.f()
            if (r13 != r12) goto L_0x0150
            f0.r r12 = r15.b()
            if (r12 == 0) goto L_0x0132
            f0.r r12 = r15.b()
            int r12 = r15.h(r12, r5)
            if (r12 != 0) goto L_0x0151
        L_0x0132:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.x<?> r13 = r7.f4259f
            androidx.camera.core.impl.l r13 = (androidx.camera.core.impl.l) r13
            r13.getClass()
            androidx.camera.core.impl.c r14 = androidx.camera.core.impl.l.J
            androidx.camera.core.impl.i r13 = r13.b()
            androidx.camera.core.impl.r r13 = (androidx.camera.core.impl.r) r13
            java.lang.Object r13 = r13.e(r14, r9)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r4 = r5
        L_0x0151:
            if (r11 != 0) goto L_0x0155
            if (r4 == 0) goto L_0x0167
        L_0x0155:
            androidx.camera.core.f r9 = new androidx.camera.core.f
            int r4 = r3.h()
            android.media.ImageReader r4 = android.media.ImageReader.newInstance(r8, r6, r10, r4)
            c0.b r6 = new c0.b
            r6.<init>(r4)
            r9.<init>(r6)
        L_0x0167:
            if (r9 == 0) goto L_0x0175
            c0.e0 r4 = r7.f4185n
            java.lang.Object r6 = r4.f4246y
            monitor-enter(r6)
            r4.f4236o = r9     // Catch:{ all -> 0x0172 }
            monitor-exit(r6)     // Catch:{ all -> 0x0172 }
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0172 }
            throw r0
        L_0x0175:
            f0.r r4 = r15.b()
            if (r4 == 0) goto L_0x0183
            c0.e0 r6 = r7.f4185n
            int r4 = r15.h(r4, r5)
            r6.f4230b = r4
        L_0x0183:
            c0.e0 r4 = r7.f4185n
            r3.g(r4, r2)
            android.util.Size r2 = r18.d()
            androidx.camera.core.impl.u$b r8 = androidx.camera.core.impl.u.b.d(r0, r2)
            androidx.camera.core.impl.i r2 = r18.c()
            if (r2 == 0) goto L_0x019f
            androidx.camera.core.impl.i r2 = r18.c()
            androidx.camera.core.impl.g$a r4 = r8.f1399b
            r4.c(r2)
        L_0x019f:
            f0.e0 r2 = r7.f4189r
            if (r2 == 0) goto L_0x01a6
            r2.a()
        L_0x01a6:
            f0.e0 r2 = new f0.e0
            android.view.Surface r4 = r3.getSurface()
            int r5 = r15.f()
            r2.<init>(r4, r1, r5)
            r7.f4189r = r2
            v8.a r1 = r2.d()
            v.f r2 = new v.f
            r4 = 5
            r2.<init>(r4, r3, r9)
            h0.b r3 = j7.a.f0()
            r1.b(r2, r3)
            android.util.Range r1 = r18.b()
            androidx.camera.core.impl.g$a r2 = r8.f1399b
            r2.f1368d = r1
            f0.e0 r1 = r7.f4189r
            c0.x r2 = r18.a()
            r8.b(r1, r2)
            c0.z r9 = new c0.z
            r6 = 0
            r1 = r9
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = r8.f1402e
            r0.add(r9)
            return r8
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01eb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b0.C(java.lang.String, androidx.camera.core.impl.l, androidx.camera.core.impl.v):androidx.camera.core.impl.u$b");
    }

    public final int D() {
        l lVar = (l) this.f4259f;
        lVar.getClass();
        return ((Integer) ((r) lVar.b()).e(l.I, 1)).intValue();
    }

    public final x<?> e(boolean z10, y yVar) {
        f4184s.getClass();
        l lVar = d.f4191a;
        lVar.getClass();
        androidx.camera.core.impl.i a10 = yVar.a(f0.b0.c(lVar), 1);
        if (z10) {
            a10 = android.support.v4.media.a.t(a10, lVar);
        }
        if (a10 == null) {
            return null;
        }
        return new l(r.K(((c) j(a10)).f4190a));
    }

    public final x.a<?, ?, ?> j(androidx.camera.core.impl.i iVar) {
        return new c(q.M(iVar));
    }

    public final void q() {
        this.f4185n.f4247z = true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.camera.core.impl.x$a, androidx.camera.core.impl.x$a<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.x<?> s(f0.q r4, androidx.camera.core.impl.x.a<?, ?, ?> r5) {
        /*
            r3 = this;
            androidx.camera.core.impl.x<?> r0 = r3.f4259f
            androidx.camera.core.impl.l r0 = (androidx.camera.core.impl.l) r0
            r0.getClass()
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.l.J
            androidx.camera.core.impl.i r0 = r0.b()
            androidx.camera.core.impl.r r0 = (androidx.camera.core.impl.r) r0
            r2 = 0
            java.lang.Object r0 = r0.e(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            z.d r4 = r4.l()
            java.lang.Class<k0.g> r1 = k0.g.class
            boolean r4 = r4.a(r1)
            c0.e0 r1 = r3.f4185n
            if (r0 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            boolean r4 = r0.booleanValue()
        L_0x0029:
            r1.f4234f = r4
            java.lang.Object r4 = r3.f4186o
            monitor-enter(r4)
            c0.b0$a r0 = r3.f4187p     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            r0.a()     // Catch:{ all -> 0x003b }
        L_0x0035:
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            androidx.camera.core.impl.x r4 = r5.b()
            return r4
        L_0x003b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b0.s(f0.q, androidx.camera.core.impl.x$a):androidx.camera.core.impl.x");
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ImageAnalysis:");
        q10.append(g());
        return q10.toString();
    }

    public final androidx.camera.core.impl.e v(androidx.camera.core.impl.i iVar) {
        this.f4188q.f1399b.c(iVar);
        B(this.f4188q.c());
        e.a e10 = this.f4260g.e();
        e10.f1351d = iVar;
        return e10.a();
    }

    public final v w(v vVar) {
        u.b C = C(d(), (l) this.f4259f, vVar);
        this.f4188q = C;
        B(C.c());
        return vVar;
    }

    public final void x() {
        m.a();
        e0 e0Var = this.f4189r;
        if (e0Var != null) {
            e0Var.a();
            this.f4189r = null;
        }
        e0 e0Var2 = this.f4185n;
        e0Var2.f4247z = false;
        e0Var2.c();
    }

    public final void y(Matrix matrix) {
        super.y(matrix);
        e0 e0Var = this.f4185n;
        synchronized (e0Var.f4246y) {
            e0Var.f4240s = matrix;
            e0Var.f4241t = new Matrix(e0Var.f4240s);
        }
    }

    public final void z(Rect rect) {
        this.f4262i = rect;
        e0 e0Var = this.f4185n;
        synchronized (e0Var.f4246y) {
            e0Var.f4238q = rect;
            e0Var.f4239r = new Rect(e0Var.f4238q);
        }
    }
}
