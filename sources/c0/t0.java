package c0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import f0.b0;
import g0.m;
import j0.h;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p3.l0;

/* compiled from: Preview */
public final class t0 extends f1 {

    /* renamed from: t  reason: collision with root package name */
    public static final b f4334t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final h0.b f4335u = j7.a.f0();

    /* renamed from: n  reason: collision with root package name */
    public c f4336n;

    /* renamed from: o  reason: collision with root package name */
    public Executor f4337o = f4335u;

    /* renamed from: p  reason: collision with root package name */
    public u.b f4338p;

    /* renamed from: q  reason: collision with root package name */
    public b1 f4339q;

    /* renamed from: r  reason: collision with root package name */
    public n0.u f4340r;

    /* renamed from: s  reason: collision with root package name */
    public d1 f4341s;

    /* compiled from: Preview */
    public static final class a implements x.a<t0, s, a> {

        /* renamed from: a  reason: collision with root package name */
        public final q f4342a;

        public a() {
            this(q.L());
        }

        public final p a() {
            return this.f4342a;
        }

        public final x b() {
            return new s(r.K(this.f4342a));
        }

        public a(q qVar) {
            Object obj;
            Class<t0> cls = t0.class;
            this.f4342a = qVar;
            Object obj2 = null;
            try {
                obj = qVar.a(h.B);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f4342a.O(h.B, cls);
                q qVar2 = this.f4342a;
                androidx.camera.core.impl.c cVar = h.A;
                qVar2.getClass();
                try {
                    obj2 = qVar2.a(cVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f4342a.O(h.A, cls.getCanonicalName() + "-" + UUID.randomUUID());
                }
                qVar.O(o.f1384i, 2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* compiled from: Preview */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final s f4343a;

        static {
            o0.b bVar = new o0.b(l0.f13962t, o0.c.f13616c, (o0.a) null, 0);
            a aVar = new a();
            aVar.f4342a.O(x.f1419t, 2);
            aVar.f4342a.O(o.f1381f, 0);
            aVar.f4342a.O(o.f1389n, bVar);
            aVar.f4342a.O(x.f1424y, y.b.PREVIEW);
            f4343a = new s(r.K(aVar.f4342a));
        }
    }

    /* compiled from: Preview */
    public interface c {
        void a(d1 d1Var);
    }

    public t0(s sVar) {
        super(sVar);
    }

    public final void C() {
        b1 b1Var = this.f4339q;
        if (b1Var != null) {
            b1Var.a();
            this.f4339q = null;
        }
        n0.u uVar = this.f4340r;
        if (uVar != null) {
            m.a();
            uVar.c();
            uVar.f13403n = true;
            this.f4340r = null;
        }
        this.f4341s = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.u.b D(java.lang.String r18, androidx.camera.core.impl.s r19, androidx.camera.core.impl.v r20) {
        /*
            r17 = this;
            r6 = r17
            g0.m.a()
            f0.r r0 = r17.b()
            java.util.Objects.requireNonNull(r0)
            r17.C()
            n0.u r1 = r6.f4340r
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0017
            r1 = r2
            goto L_0x0018
        L_0x0017:
            r1 = r3
        L_0x0018:
            r4 = 0
            al.g0.E(r4, r1)
            n0.u r1 = new n0.u
            r8 = 1
            r9 = 34
            android.graphics.Matrix r11 = r6.f4263j
            boolean r12 = r0.m()
            android.util.Size r5 = r20.d()
            android.graphics.Rect r7 = r6.f4262i
            if (r7 == 0) goto L_0x0030
            goto L_0x003f
        L_0x0030:
            if (r5 == 0) goto L_0x0041
            android.graphics.Rect r7 = new android.graphics.Rect
            int r10 = r5.getWidth()
            int r5 = r5.getHeight()
            r7.<init>(r3, r3, r10, r5)
        L_0x003f:
            r13 = r7
            goto L_0x0042
        L_0x0041:
            r13 = r4
        L_0x0042:
            java.util.Objects.requireNonNull(r13)
            boolean r5 = r6.m(r0)
            int r14 = r6.h(r0, r5)
            androidx.camera.core.impl.x<?> r5 = r6.f4259f
            androidx.camera.core.impl.o r5 = (androidx.camera.core.impl.o) r5
            int r15 = r5.J()
            boolean r5 = r0.m()
            if (r5 == 0) goto L_0x0064
            boolean r5 = r6.m(r0)
            if (r5 == 0) goto L_0x0064
            r16 = r2
            goto L_0x0066
        L_0x0064:
            r16 = r3
        L_0x0066:
            r7 = r1
            r10 = r20
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.f4340r = r1
            c0.k r2 = r6.f4265l
            if (r2 != 0) goto L_0x0108
            d.d r2 = new d.d
            r3 = 8
            r2.<init>(r6, r3)
            g0.m.a()
            r1.a()
            java.util.HashSet r1 = r1.f13402m
            r1.add(r2)
            n0.u r1 = r6.f4340r
            c0.d1 r0 = r1.b(r0)
            r6.f4341s = r0
            c0.b1 r0 = r0.f4221i
            r6.f4339q = r0
            c0.t0$c r0 = r6.f4336n
            if (r0 == 0) goto L_0x00c5
            f0.r r0 = r17.b()
            n0.u r1 = r6.f4340r
            if (r0 == 0) goto L_0x00b1
            if (r1 == 0) goto L_0x00b1
            boolean r2 = r6.m(r0)
            int r0 = r6.h(r0, r2)
            androidx.camera.core.impl.x<?> r2 = r6.f4259f
            androidx.camera.core.impl.o r2 = (androidx.camera.core.impl.o) r2
            int r2 = r2.J()
            r1.f(r0, r2)
        L_0x00b1:
            c0.t0$c r0 = r6.f4336n
            r0.getClass()
            c0.d1 r1 = r6.f4341s
            r1.getClass()
            java.util.concurrent.Executor r2 = r6.f4337o
            v.n r4 = new v.n
            r4.<init>(r3, r0, r1)
            r2.execute(r4)
        L_0x00c5:
            android.util.Size r0 = r20.d()
            r3 = r19
            androidx.camera.core.impl.u$b r7 = androidx.camera.core.impl.u.b.d(r3, r0)
            android.util.Range r0 = r20.b()
            androidx.camera.core.impl.g$a r1 = r7.f1399b
            r1.f1368d = r0
            androidx.camera.core.impl.i r0 = r20.c()
            if (r0 == 0) goto L_0x00e6
            androidx.camera.core.impl.i r0 = r20.c()
            androidx.camera.core.impl.g$a r1 = r7.f1399b
            r1.c(r0)
        L_0x00e6:
            c0.t0$c r0 = r6.f4336n
            if (r0 == 0) goto L_0x00f3
            c0.b1 r0 = r6.f4339q
            c0.x r1 = r20.a()
            r7.b(r0, r1)
        L_0x00f3:
            c0.h0 r8 = new c0.h0
            r5 = 1
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.ArrayList r0 = r7.f1402e
            r0.add(r8)
            return r7
        L_0x0108:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.t0.D(java.lang.String, androidx.camera.core.impl.s, androidx.camera.core.impl.v):androidx.camera.core.impl.u$b");
    }

    public final void E(c cVar) {
        h0.b bVar = f4335u;
        m.a();
        Size size = null;
        if (cVar == null) {
            this.f4336n = null;
            this.f4256c = 2;
            p();
            return;
        }
        this.f4336n = cVar;
        this.f4337o = bVar;
        v vVar = this.f4260g;
        if (vVar != null) {
            size = vVar.d();
        }
        if (size != null) {
            u.b D = D(d(), (s) this.f4259f, this.f4260g);
            this.f4338p = D;
            B(D.c());
            o();
        }
        this.f4256c = 1;
        p();
    }

    public final x<?> e(boolean z10, y yVar) {
        f4334t.getClass();
        s sVar = b.f4343a;
        sVar.getClass();
        i a10 = yVar.a(b0.c(sVar), 1);
        if (z10) {
            a10 = android.support.v4.media.a.t(a10, sVar);
        }
        if (a10 == null) {
            return null;
        }
        return new s(r.K(((a) j(a10)).f4342a));
    }

    public final int h(f0.r rVar, boolean z10) {
        if (rVar.m()) {
            return super.h(rVar, z10);
        }
        return 0;
    }

    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final x.a<?, ?, ?> j(i iVar) {
        return new a(q.M(iVar));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [c0.y, androidx.camera.core.impl.x$a, androidx.camera.core.impl.x$a<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.camera.core.impl.x<?> s(f0.q r3, androidx.camera.core.impl.x.a<?, ?, ?> r4) {
        /*
            r2 = this;
            androidx.camera.core.impl.p r3 = r4.a()
            androidx.camera.core.impl.c r0 = androidx.camera.core.impl.n.f1379d
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.camera.core.impl.q r3 = (androidx.camera.core.impl.q) r3
            r3.O(r0, r1)
            androidx.camera.core.impl.x r3 = r4.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.t0.s(f0.q, androidx.camera.core.impl.x$a):androidx.camera.core.impl.x");
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Preview:");
        q10.append(g());
        return q10.toString();
    }

    public final e v(i iVar) {
        this.f4338p.f1399b.c(iVar);
        B(this.f4338p.c());
        e.a e10 = this.f4260g.e();
        e10.f1351d = iVar;
        return e10.a();
    }

    public final v w(v vVar) {
        u.b D = D(d(), (s) this.f4259f, vVar);
        this.f4338p = D;
        B(D.c());
        return vVar;
    }

    public final void x() {
        C();
    }

    public final void z(Rect rect) {
        this.f4262i = rect;
        f0.r b10 = b();
        n0.u uVar = this.f4340r;
        if (b10 != null && uVar != null) {
            uVar.f(h(b10, m(b10)), ((o) this.f4259f).J());
        }
    }
}
