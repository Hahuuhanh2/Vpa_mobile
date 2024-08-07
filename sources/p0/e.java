package p0;

import al.g0;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.y;
import c0.f1;
import c0.j0;
import c0.o;
import c0.q0;
import f0.n;
import f0.q;
import f0.r;
import g0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n0.u;

/* compiled from: VirtualCamera */
public final class e implements r {

    /* renamed from: a  reason: collision with root package name */
    public final Set<f1> f13891a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13892b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13893c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final y f13894d;

    /* renamed from: e  reason: collision with root package name */
    public final r f13895e;

    /* renamed from: f  reason: collision with root package name */
    public final d f13896f = new d(this);

    /* renamed from: n  reason: collision with root package name */
    public final g f13897n;

    public e(r rVar, HashSet hashSet, y yVar, q0 q0Var) {
        this.f13895e = rVar;
        this.f13894d = yVar;
        this.f13891a = hashSet;
        this.f13897n = new g(rVar.h(), q0Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f13893c.put((f1) it.next(), Boolean.FALSE);
        }
    }

    public static void p(u uVar, DeferrableSurface deferrableSurface, androidx.camera.core.impl.u uVar2) {
        uVar.d();
        try {
            m.a();
            uVar.a();
            uVar.f13401l.h(deferrableSurface, new n0.r(uVar, 1));
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            for (u.c a10 : uVar2.f1395e) {
                a10.a();
            }
        }
    }

    public static DeferrableSurface q(f1 f1Var) {
        List<DeferrableSurface> list;
        boolean z10;
        if (f1Var instanceof j0) {
            list = f1Var.f4266m.b();
        } else {
            list = f1Var.f4266m.f1396f.a();
        }
        if (list.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E((String) null, z10);
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public final o a() {
        return n();
    }

    public final void b(f1 f1Var) {
        m.a();
        if (!r(f1Var)) {
            this.f13893c.put(f1Var, Boolean.TRUE);
            DeferrableSurface q10 = q(f1Var);
            if (q10 != null) {
                n0.u uVar = (n0.u) this.f13892b.get(f1Var);
                Objects.requireNonNull(uVar);
                p(uVar, q10, f1Var.f4266m);
            }
        }
    }

    public final CameraControl c() {
        return this.f13897n;
    }

    public final void d(f1 f1Var) {
        DeferrableSurface q10;
        m.a();
        n0.u uVar = (n0.u) this.f13892b.get(f1Var);
        Objects.requireNonNull(uVar);
        uVar.d();
        if (r(f1Var) && (q10 = q(f1Var)) != null) {
            p(uVar, q10, f1Var.f4266m);
        }
    }

    public final boolean e() {
        if (a().f() == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void f(f fVar) {
    }

    public final f0.j0<r.a> g() {
        return this.f13895e.g();
    }

    public final CameraControlInternal h() {
        return this.f13897n;
    }

    public final f i() {
        return n.f9564a;
    }

    public final /* synthetic */ void j(boolean z10) {
    }

    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final boolean m() {
        return false;
    }

    public final q n() {
        return this.f13895e.n();
    }

    public final void o(f1 f1Var) {
        m.a();
        if (r(f1Var)) {
            this.f13893c.put(f1Var, Boolean.FALSE);
            n0.u uVar = (n0.u) this.f13892b.get(f1Var);
            Objects.requireNonNull(uVar);
            m.a();
            uVar.a();
            uVar.c();
        }
    }

    public final boolean r(f1 f1Var) {
        Boolean bool = (Boolean) this.f13893c.get(f1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }
}
