package e0;

import al.g0;
import androidx.appcompat.app.p;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.b;
import androidx.camera.core.d;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.h;
import androidx.camera.core.impl.r;
import c0.j0;
import c0.w;
import d.h;
import e0.i0;
import f0.e0;
import f0.v;
import g0.m;
import i0.f;
import j7.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k0.c;
import v.n;
import z0.b;

/* compiled from: TakePictureManager */
public final class h0 implements b.a, i0.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f9005a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final n f9006b;

    /* renamed from: c  reason: collision with root package name */
    public o f9007c;

    /* renamed from: d  reason: collision with root package name */
    public x f9008d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9009e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9010f = false;

    public h0(j0.a aVar) {
        m.a();
        this.f9006b = aVar;
        this.f9009e = new ArrayList();
    }

    public final void a(d dVar) {
        a.f0().execute(new d.d(this, 9));
    }

    public final void b() {
        m.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException("Camera is closed.", (Throwable) null);
        Iterator it = this.f9005a.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            i0Var.a().execute(new n(12, i0Var, imageCaptureException));
        }
        this.f9005a.clear();
        Iterator it2 = new ArrayList(this.f9009e).iterator();
        while (it2.hasNext()) {
            x xVar = (x) it2.next();
            xVar.getClass();
            m.a();
            if (!xVar.f9062d.isDone()) {
                m.a();
                xVar.f9065g = true;
                v8.a<Void> aVar = xVar.f9066h;
                Objects.requireNonNull(aVar);
                aVar.cancel(true);
                xVar.f9063e.b(imageCaptureException);
                xVar.f9064f.a(null);
                m.a();
                i0 i0Var2 = xVar.f9059a;
                i0Var2.a().execute(new n(12, i0Var2, imageCaptureException));
            }
        }
    }

    public final void c() {
        boolean z10;
        i0 i0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        m.a();
        boolean z14 = false;
        boolean z15 = true;
        if (this.f9008d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.f9010f) {
            o oVar = this.f9007c;
            oVar.getClass();
            m.a();
            if (oVar.f9030c.a() != 0 && (i0Var = (i0) this.f9005a.poll()) != null) {
                x xVar = new x(i0Var, this);
                if (this.f9008d != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g0.E((String) null, !z11);
                this.f9008d = xVar;
                m.a();
                xVar.f9061c.f17803b.b(new h(this, 9), a.x());
                this.f9009e.add(xVar);
                m.a();
                xVar.f9062d.f17803b.b(new p(12, this, xVar), a.x());
                o oVar2 = this.f9007c;
                m.a();
                b.d dVar = xVar.f9061c;
                oVar2.getClass();
                m.a();
                androidx.camera.core.impl.m mVar = oVar2.f9028a;
                w wVar = new w(Arrays.asList(new androidx.camera.core.impl.h[]{new h.a()}));
                mVar.getClass();
                v vVar = (v) ((r) mVar.b()).e(androidx.camera.core.impl.m.H, wVar);
                Objects.requireNonNull(vVar);
                ArrayList arrayList = new ArrayList();
                String valueOf = String.valueOf(vVar.hashCode());
                List<androidx.camera.core.impl.h> a10 = vVar.a();
                Objects.requireNonNull(a10);
                for (androidx.camera.core.impl.h next : a10) {
                    g.a aVar = new g.a();
                    g gVar = oVar2.f9029b;
                    aVar.f1367c = gVar.f1359c;
                    aVar.c(gVar.f1358b);
                    aVar.a(i0Var.j());
                    e0 e0Var = oVar2.f9033f.f9026b;
                    Objects.requireNonNull(e0Var);
                    aVar.f1365a.add(e0Var);
                    if (oVar2.f9033f.f8977d == 256) {
                        if (((c) k0.b.a(c.class)) != null) {
                            androidx.camera.core.impl.c cVar = g.f1355i;
                            z12 = false;
                        } else {
                            z12 = z15;
                        }
                        if (z12) {
                            aVar.f1366b.O(g.f1355i, Integer.valueOf(i0Var.h()));
                        }
                        androidx.camera.core.impl.c cVar2 = g.f1356j;
                        if (i0Var.f() != null) {
                            z13 = z15;
                        } else {
                            z13 = false;
                        }
                        boolean b10 = g0.n.b(i0Var.c(), oVar2.f9033f.f8976c);
                        if (!z13 || !b10) {
                            i10 = i0Var.e();
                        } else if (i0Var.b() == 0) {
                            i10 = 100;
                        } else {
                            i10 = 95;
                        }
                        aVar.f1366b.O(cVar2, Integer.valueOf(i10));
                    }
                    aVar.c(next.a().f1358b);
                    next.getId();
                    aVar.f1371g.f9605a.put(valueOf, 0);
                    aVar.b(oVar2.f9033f.f9025a);
                    arrayList.add(aVar.d());
                    z15 = true;
                }
                i iVar = new i(arrayList, xVar);
                w wVar2 = new w(vVar, i0Var.g(), i0Var.c(), i0Var.h(), i0Var.e(), i0Var.i(), xVar, dVar);
                o oVar3 = this.f9007c;
                oVar3.getClass();
                m.a();
                oVar3.f9033f.f8981h.accept(wVar2);
                m.a();
                j0 j0Var = j0.this;
                synchronized (j0Var.f4291o) {
                    if (j0Var.f4291o.get() == null) {
                        j0Var.f4291o.set(Integer.valueOf(j0Var.E()));
                    }
                }
                j0 j0Var2 = j0.this;
                j0Var2.getClass();
                m.a();
                i0.b f10 = f.f(j0Var2.c().e(j0Var2.f4290n, j0Var2.f4292p, arrayList), new c0.i0(0), a.x());
                f10.b(new f.b(f10, new g0(this, iVar)), a.f0());
                m.a();
                if (xVar.f9066h == null) {
                    z14 = true;
                }
                g0.E("CaptureRequestFuture can only be set once.", z14);
                xVar.f9066h = f10;
            }
        }
    }
}
