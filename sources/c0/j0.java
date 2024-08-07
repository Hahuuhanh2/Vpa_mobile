package c0;

import al.g0;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.d;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import e0.h0;
import e0.l;
import e0.n;
import e0.o;
import f0.b0;
import f0.e0;
import f0.n;
import f0.p0;
import j0.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p3.l0;

/* compiled from: ImageCapture */
public final class j0 extends f1 {

    /* renamed from: v  reason: collision with root package name */
    public static final c f4289v = new c();

    /* renamed from: n  reason: collision with root package name */
    public final int f4290n;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicReference<Integer> f4291o = new AtomicReference<>((Object) null);

    /* renamed from: p  reason: collision with root package name */
    public final int f4292p;

    /* renamed from: q  reason: collision with root package name */
    public int f4293q = -1;

    /* renamed from: r  reason: collision with root package name */
    public u.b f4294r;

    /* renamed from: s  reason: collision with root package name */
    public o f4295s;

    /* renamed from: t  reason: collision with root package name */
    public h0 f4296t;

    /* renamed from: u  reason: collision with root package name */
    public final a f4297u = new a();

    /* compiled from: ImageCapture */
    public class a implements n {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r4 = this;
                c0.j0 r0 = c0.j0.this
                java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r0.f4291o
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r2 = r0.f4291o     // Catch:{ all -> 0x0021 }
                r3 = 0
                java.lang.Object r2 = r2.getAndSet(r3)     // Catch:{ all -> 0x0021 }
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0021 }
                if (r2 != 0) goto L_0x0012
                monitor-exit(r1)     // Catch:{ all -> 0x0021 }
                goto L_0x0020
            L_0x0012:
                int r2 = r2.intValue()     // Catch:{ all -> 0x0021 }
                int r3 = r0.E()     // Catch:{ all -> 0x0021 }
                if (r2 == r3) goto L_0x001f
                r0.H()     // Catch:{ all -> 0x0021 }
            L_0x001f:
                monitor-exit(r1)     // Catch:{ all -> 0x0021 }
            L_0x0020:
                return
            L_0x0021:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0021 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.j0.a.a():void");
        }
    }

    /* compiled from: ImageCapture */
    public static final class b implements x.a<j0, m, b> {

        /* renamed from: a  reason: collision with root package name */
        public final q f4299a;

        public b() {
            this(q.L());
        }

        public final p a() {
            return this.f4299a;
        }

        public final x b() {
            return new m(r.K(this.f4299a));
        }

        public b(q qVar) {
            Object obj;
            Class<j0> cls = j0.class;
            this.f4299a = qVar;
            Object obj2 = null;
            try {
                obj = qVar.a(h.B);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f4299a.O(h.B, cls);
                q qVar2 = this.f4299a;
                androidx.camera.core.impl.c cVar = h.A;
                qVar2.getClass();
                try {
                    obj2 = qVar2.a(cVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f4299a.O(h.A, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* compiled from: ImageCapture */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final m f4300a;

        static {
            o0.b bVar = new o0.b(l0.f13962t, o0.c.f13616c, (o0.a) null, 0);
            x xVar = x.f4367d;
            b bVar2 = new b();
            bVar2.f4299a.O(x.f1419t, 4);
            bVar2.f4299a.O(androidx.camera.core.impl.o.f1381f, 0);
            bVar2.f4299a.O(androidx.camera.core.impl.o.f1389n, bVar);
            bVar2.f4299a.O(x.f1424y, y.b.IMAGE_CAPTURE);
            if (xVar.equals(xVar)) {
                bVar2.f4299a.O(androidx.camera.core.impl.n.f1380e, xVar);
                f4300a = new m(r.K(bVar2.f4299a));
                return;
            }
            throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
        }
    }

    /* compiled from: ImageCapture */
    public static abstract class d {
    }

    /* compiled from: ImageCapture */
    public interface e {
        void a();

        void b();
    }

    /* compiled from: ImageCapture */
    public static final class f {
    }

    /* compiled from: ImageCapture */
    public static class g {
    }

    public j0(m mVar) {
        super(mVar);
        m mVar2 = (m) this.f4259f;
        androidx.camera.core.impl.c cVar = m.F;
        mVar2.getClass();
        if (((r) mVar2.b()).c(cVar)) {
            this.f4290n = ((Integer) ((r) mVar2.b()).a(cVar)).intValue();
        } else {
            this.f4290n = 1;
        }
        this.f4292p = ((Integer) ((r) mVar2.b()).e(m.L, 0)).intValue();
    }

    public static boolean F(int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    public final void C(boolean z10) {
        h0 h0Var;
        g0.m.a();
        o oVar = this.f4295s;
        if (oVar != null) {
            oVar.a();
            this.f4295s = null;
        }
        if (!z10 && (h0Var = this.f4296t) != null) {
            h0Var.b();
            this.f4296t = null;
        }
    }

    public final u.b D(String str, m mVar, v vVar) {
        boolean z10;
        g0.m.a();
        boolean z11 = false;
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", new Object[]{str, vVar});
        Size d10 = vVar.d();
        f0.r b10 = b();
        Objects.requireNonNull(b10);
        if (!b10.m() || G()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4295s != null) {
            g0.E((String) null, z10);
            this.f4295s.a();
        }
        this.f4295s = new o(mVar, d10, this.f4265l, z10);
        if (this.f4296t == null) {
            this.f4296t = new h0(this.f4297u);
        }
        h0 h0Var = this.f4296t;
        o oVar = this.f4295s;
        h0Var.getClass();
        g0.m.a();
        h0Var.f9007c = oVar;
        oVar.getClass();
        g0.m.a();
        l lVar = oVar.f9030c;
        lVar.getClass();
        g0.m.a();
        if (lVar.f9020c != null) {
            z11 = true;
        }
        g0.E("The ImageReader is not initialized.", z11);
        androidx.camera.core.f fVar = lVar.f9020c;
        synchronized (fVar.f1301a) {
            fVar.f1306f = h0Var;
        }
        o oVar2 = this.f4295s;
        u.b d11 = u.b.d(oVar2.f9028a, vVar.d());
        e0 e0Var = oVar2.f9033f.f9026b;
        Objects.requireNonNull(e0Var);
        x xVar = x.f4367d;
        d.a a10 = u.e.a(e0Var);
        a10.b(xVar);
        d11.f1398a.add(a10.a());
        if (this.f4290n == 2) {
            c().d(d11);
        }
        if (vVar.c() != null) {
            d11.f1399b.c(vVar.c());
        }
        d11.f1402e.add(new h0(this, str, mVar, vVar, 0));
        return d11;
    }

    public final int E() {
        int i10;
        synchronized (this.f4291o) {
            i10 = this.f4293q;
            if (i10 == -1) {
                m mVar = (m) this.f4259f;
                mVar.getClass();
                i10 = ((Integer) ((r) mVar.b()).e(m.G, 2)).intValue();
            }
        }
        return i10;
    }

    public final boolean G() {
        if (b() == null) {
            return false;
        }
        if (((p0) ((r) ((n.a) b().i()).b()).e(androidx.camera.core.impl.f.f1354c, null)) != null) {
            return true;
        }
        return false;
    }

    public final void H() {
        synchronized (this.f4291o) {
            if (this.f4291o.get() == null) {
                c().c(E());
            }
        }
    }

    public final x<?> e(boolean z10, y yVar) {
        f4289v.getClass();
        m mVar = c.f4300a;
        mVar.getClass();
        i a10 = yVar.a(b0.c(mVar), this.f4290n);
        if (z10) {
            a10 = android.support.v4.media.a.t(a10, mVar);
        }
        if (a10 == null) {
            return null;
        }
        return new m(r.K(((b) j(a10)).f4299a));
    }

    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final x.a<?, ?, ?> j(i iVar) {
        return new b(q.M(iVar));
    }

    public final void q() {
        g0.D(b(), "Attached camera cannot be null");
    }

    public final void r() {
        H();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [c0.y, androidx.camera.core.impl.x$a, androidx.camera.core.impl.x$a<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.x<?> s(f0.q r9, androidx.camera.core.impl.x.a<?, ?, ?> r10) {
        /*
            r8 = this;
            z.d r9 = r9.l()
            java.lang.Class<k0.h> r0 = k0.h.class
            boolean r9 = r9.a(r0)
            java.lang.String r0 = "ImageCapture"
            if (r9 == 0) goto L_0x0040
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.p r1 = r10.a()
            androidx.camera.core.impl.c r2 = androidx.camera.core.impl.m.K
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.r r1 = (androidx.camera.core.impl.r) r1
            r1.getClass()
            java.lang.Object r3 = r1.a(r2)     // Catch:{ IllegalArgumentException -> 0x0021 }
        L_0x0021:
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x002b
            c0.p0.g(r0)
            goto L_0x0040
        L_0x002b:
            java.lang.String r9 = c0.p0.f(r0)
            r1 = 4
            c0.p0.e(r1, r9)
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.m.K
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r1, r2)
        L_0x0040:
            androidx.camera.core.impl.p r9 = r10.a()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            androidx.camera.core.impl.c r2 = androidx.camera.core.impl.m.K
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r9
            androidx.camera.core.impl.r r4 = (androidx.camera.core.impl.r) r4
            r4.getClass()
            java.lang.Object r3 = r4.a(r2)     // Catch:{ IllegalArgumentException -> 0x0054 }
        L_0x0054:
            boolean r1 = r1.equals(r3)
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0090
            boolean r1 = r8.G()
            if (r1 == 0) goto L_0x006a
            c0.p0.g(r0)
            r1 = r3
            goto L_0x006b
        L_0x006a:
            r1 = r2
        L_0x006b:
            androidx.camera.core.impl.c r7 = androidx.camera.core.impl.m.I
            java.lang.Object r4 = r4.a(r7)     // Catch:{ IllegalArgumentException -> 0x0072 }
            goto L_0x0073
        L_0x0072:
            r4 = r5
        L_0x0073:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x0081
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0081
            c0.p0.g(r0)
            r1 = r3
        L_0x0081:
            if (r1 != 0) goto L_0x0091
            c0.p0.g(r0)
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.m.K
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r0, r4)
            goto L_0x0091
        L_0x0090:
            r1 = r3
        L_0x0091:
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.m.I
            androidx.camera.core.impl.r r9 = (androidx.camera.core.impl.r) r9
            r9.getClass()
            java.lang.Object r9 = r9.a(r0)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            goto L_0x00a2
        L_0x00a1:
            r9 = r5
        L_0x00a2:
            java.lang.Integer r9 = (java.lang.Integer) r9
            r0 = 35
            if (r9 == 0) goto L_0x00d2
            boolean r4 = r8.G()
            if (r4 == 0) goto L_0x00b6
            int r4 = r9.intValue()
            if (r4 != r6) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r2 = r3
        L_0x00b6:
            java.lang.String r3 = "Cannot set non-JPEG buffer format with Extensions enabled."
            al.g0.y(r3, r2)
            androidx.camera.core.impl.p r2 = r10.a()
            androidx.camera.core.impl.c r3 = androidx.camera.core.impl.n.f1379d
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            int r0 = r9.intValue()
        L_0x00c8:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            androidx.camera.core.impl.q r2 = (androidx.camera.core.impl.q) r2
            r2.O(r3, r9)
            goto L_0x0132
        L_0x00d2:
            if (r1 == 0) goto L_0x00e4
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.n.f1379d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r1, r0)
            goto L_0x0132
        L_0x00e4:
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.o.f1388m
            androidx.camera.core.impl.r r9 = (androidx.camera.core.impl.r) r9
            r9.getClass()
            java.lang.Object r5 = r9.a(r1)     // Catch:{ IllegalArgumentException -> 0x00f3 }
        L_0x00f3:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0107
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.n.f1379d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r0, r1)
            goto L_0x0132
        L_0x0107:
            boolean r9 = F(r6, r5)
            if (r9 == 0) goto L_0x011d
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.n.f1379d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r0, r1)
            goto L_0x0132
        L_0x011d:
            boolean r9 = F(r0, r5)
            if (r9 == 0) goto L_0x0132
            androidx.camera.core.impl.p r9 = r10.a()
            androidx.camera.core.impl.c r1 = androidx.camera.core.impl.n.f1379d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.camera.core.impl.q r9 = (androidx.camera.core.impl.q) r9
            r9.O(r1, r0)
        L_0x0132:
            androidx.camera.core.impl.x r9 = r10.b()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.j0.s(f0.q, androidx.camera.core.impl.x$a):androidx.camera.core.impl.x");
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("ImageCapture:");
        q10.append(g());
        return q10.toString();
    }

    public final void u() {
        h0 h0Var = this.f4296t;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    public final androidx.camera.core.impl.e v(i iVar) {
        this.f4294r.f1399b.c(iVar);
        B(this.f4294r.c());
        e.a e10 = this.f4260g.e();
        e10.f1351d = iVar;
        return e10.a();
    }

    public final v w(v vVar) {
        u.b D = D(d(), (m) this.f4259f, vVar);
        this.f4294r = D;
        B(D.c());
        this.f4256c = 1;
        p();
        return vVar;
    }

    public final void x() {
        h0 h0Var = this.f4296t;
        if (h0Var != null) {
            h0Var.b();
        }
        C(false);
    }
}
