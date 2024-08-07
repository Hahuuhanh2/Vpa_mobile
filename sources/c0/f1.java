package c0;

import al.g0;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import f0.q;
import f0.r;
import g0.n;
import j0.h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: UseCase */
public abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f4254a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Object f4255b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public int f4256c = 2;

    /* renamed from: d  reason: collision with root package name */
    public x<?> f4257d;

    /* renamed from: e  reason: collision with root package name */
    public x<?> f4258e;

    /* renamed from: f  reason: collision with root package name */
    public x<?> f4259f;

    /* renamed from: g  reason: collision with root package name */
    public v f4260g;

    /* renamed from: h  reason: collision with root package name */
    public x<?> f4261h;

    /* renamed from: i  reason: collision with root package name */
    public Rect f4262i;

    /* renamed from: j  reason: collision with root package name */
    public Matrix f4263j = new Matrix();

    /* renamed from: k  reason: collision with root package name */
    public r f4264k;

    /* renamed from: l  reason: collision with root package name */
    public k f4265l;

    /* renamed from: m  reason: collision with root package name */
    public u f4266m = u.a();

    /* compiled from: UseCase */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: UseCase */
    public interface b {
        void b(f1 f1Var);

        void d(f1 f1Var);

        void o(f1 f1Var);
    }

    public f1(x<?> xVar) {
        this.f4258e = xVar;
        this.f4259f = xVar;
    }

    public final void A(r rVar) {
        boolean z10;
        x();
        a g2 = this.f4259f.g();
        if (g2 != null) {
            g2.a();
        }
        synchronized (this.f4255b) {
            if (rVar == this.f4264k) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.z(z10);
            this.f4254a.remove(this.f4264k);
            this.f4264k = null;
        }
        this.f4260g = null;
        this.f4262i = null;
        this.f4259f = this.f4258e;
        this.f4257d = null;
        this.f4261h = null;
    }

    public final void B(u uVar) {
        this.f4266m = uVar;
        for (DeferrableSurface next : uVar.b()) {
            if (next.f1322j == null) {
                next.f1322j = getClass();
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void a(r rVar, x<?> xVar, x<?> xVar2) {
        synchronized (this.f4255b) {
            this.f4264k = rVar;
            this.f4254a.add(rVar);
        }
        this.f4257d = xVar;
        this.f4261h = xVar2;
        x<?> n10 = n(rVar.n(), this.f4257d, this.f4261h);
        this.f4259f = n10;
        a g2 = n10.g();
        if (g2 != null) {
            rVar.n();
            g2.b();
        }
        q();
    }

    public final r b() {
        r rVar;
        synchronized (this.f4255b) {
            rVar = this.f4264k;
        }
        return rVar;
    }

    public final CameraControlInternal c() {
        synchronized (this.f4255b) {
            r rVar = this.f4264k;
            if (rVar == null) {
                CameraControlInternal.a aVar = CameraControlInternal.f1308a;
                return aVar;
            }
            CameraControlInternal h10 = rVar.h();
            return h10;
        }
    }

    public final String d() {
        r b10 = b();
        g0.D(b10, "No camera attached to use case: " + this);
        return b10.n().b();
    }

    public abstract x<?> e(boolean z10, y yVar);

    public final int f() {
        return this.f4259f.l();
    }

    public final String g() {
        x<?> xVar = this.f4259f;
        StringBuilder q10 = android.support.v4.media.a.q("<UnknownUseCase-");
        q10.append(hashCode());
        q10.append(">");
        String t10 = xVar.t(q10.toString());
        Objects.requireNonNull(t10);
        return t10;
    }

    public int h(r rVar, boolean z10) {
        boolean z11;
        int j10 = rVar.n().j(((o) this.f4259f).x());
        if (rVar.m() || !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return j10;
        }
        RectF rectF = n.f10263a;
        return (((-j10) % 360) + 360) % 360;
    }

    public Set<Integer> i() {
        return Collections.emptySet();
    }

    public abstract x.a<?, ?, ?> j(i iVar);

    public final boolean k(String str) {
        if (b() == null) {
            return false;
        }
        return Objects.equals(str, d());
    }

    public final boolean l(int i10) {
        boolean z10;
        Iterator<Integer> it = i().iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            int intValue = it.next().intValue();
            if ((i10 & intValue) == intValue) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return true;
    }

    public final boolean m(r rVar) {
        int m10 = ((o) this.f4259f).m();
        if (m10 == 0) {
            return false;
        }
        if (m10 == 1) {
            return true;
        }
        if (m10 == 2) {
            return rVar.e();
        }
        throw new AssertionError(android.support.v4.media.a.m("Unknown mirrorMode: ", m10));
    }

    public final x<?> n(q qVar, x<?> xVar, x<?> xVar2) {
        androidx.camera.core.impl.q qVar2;
        if (xVar2 != null) {
            qVar2 = androidx.camera.core.impl.q.M(xVar2);
            qVar2.E.remove(h.A);
        } else {
            qVar2 = androidx.camera.core.impl.q.L();
        }
        if (this.f4258e.c(o.f1381f) || this.f4258e.c(o.f1385j)) {
            c cVar = o.f1389n;
            if (qVar2.c(cVar)) {
                qVar2.E.remove(cVar);
            }
        }
        x<?> xVar3 = this.f4258e;
        c cVar2 = o.f1389n;
        if (xVar3.c(cVar2)) {
            c cVar3 = o.f1387l;
            if (qVar2.c(cVar3) && ((o0.b) this.f4258e.a(cVar2)).f13614b != null) {
                qVar2.E.remove(cVar3);
            }
        }
        for (i.a<?> u10 : this.f4258e.d()) {
            android.support.v4.media.a.u(qVar2, qVar2, this.f4258e, u10);
        }
        if (xVar != null) {
            for (i.a next : xVar.d()) {
                if (!next.b().equals(h.A.f1331a)) {
                    android.support.v4.media.a.u(qVar2, qVar2, xVar, next);
                }
            }
        }
        if (qVar2.c(o.f1385j)) {
            c cVar4 = o.f1381f;
            if (qVar2.c(cVar4)) {
                qVar2.E.remove(cVar4);
            }
        }
        c cVar5 = o.f1389n;
        if (qVar2.c(cVar5) && ((o0.b) qVar2.a(cVar5)).f13615c != 0) {
            qVar2.O(x.f1422w, Boolean.TRUE);
        }
        return s(qVar, j(qVar2));
    }

    public final void o() {
        Iterator it = this.f4254a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(this);
        }
    }

    public final void p() {
        int g2 = v.v.g(this.f4256c);
        if (g2 == 0) {
            Iterator it = this.f4254a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b(this);
            }
        } else if (g2 == 1) {
            Iterator it2 = this.f4254a.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).o(this);
            }
        }
    }

    public void q() {
    }

    public void r() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.x$a, androidx.camera.core.impl.x$a<?, ?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.x<?> s(f0.q r1, androidx.camera.core.impl.x.a<?, ?, ?> r2) {
        /*
            r0 = this;
            androidx.camera.core.impl.x r1 = r2.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f1.s(f0.q, androidx.camera.core.impl.x$a):androidx.camera.core.impl.x");
    }

    public void t() {
    }

    public void u() {
    }

    public e v(i iVar) {
        v vVar = this.f4260g;
        if (vVar != null) {
            e.a e10 = vVar.e();
            e10.f1351d = iVar;
            return e10.a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public v w(v vVar) {
        return vVar;
    }

    public void x() {
    }

    public void y(Matrix matrix) {
        this.f4263j = new Matrix(matrix);
    }

    public void z(Rect rect) {
        this.f4262i = rect;
    }
}
