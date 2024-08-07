package n0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.v;
import c0.b1;
import c0.d1;
import c0.i;
import c0.q0;
import f0.r;
import g0.m;
import i0.f;
import java.util.HashSet;
import java.util.concurrent.Executor;
import v.n;
import z0.b;

/* compiled from: SurfaceEdge */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f13390a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f13391b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13392c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f13393d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13394e;

    /* renamed from: f  reason: collision with root package name */
    public final v f13395f;

    /* renamed from: g  reason: collision with root package name */
    public int f13396g;

    /* renamed from: h  reason: collision with root package name */
    public int f13397h;

    /* renamed from: i  reason: collision with root package name */
    public v f13398i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13399j = false;

    /* renamed from: k  reason: collision with root package name */
    public d1 f13400k;

    /* renamed from: l  reason: collision with root package name */
    public a f13401l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f13402m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public boolean f13403n = false;

    /* compiled from: SurfaceEdge */
    public static class a extends DeferrableSurface {

        /* renamed from: o  reason: collision with root package name */
        public final b.d f13404o = b.a(new q0(this, 3));

        /* renamed from: p  reason: collision with root package name */
        public b.a<Surface> f13405p;

        /* renamed from: q  reason: collision with root package name */
        public DeferrableSurface f13406q;

        public a(int i10, Size size) {
            super(i10, size);
        }

        public final v8.a<Surface> g() {
            return this.f13404o;
        }

        public final boolean h(DeferrableSurface deferrableSurface, r rVar) {
            boolean z10;
            boolean z11;
            m.a();
            deferrableSurface.getClass();
            DeferrableSurface deferrableSurface2 = this.f13406q;
            boolean z12 = false;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            if (deferrableSurface2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z10);
            g0.y("The provider's size must match the parent", this.f1320h.equals(deferrableSurface.f1320h));
            if (this.f1321i == deferrableSurface.f1321i) {
                z12 = true;
            }
            g0.y("The provider's format must match the parent", z12);
            synchronized (this.f1313a) {
                z11 = this.f1315c;
            }
            g0.E("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z11);
            this.f13406q = deferrableSurface;
            f.e(true, deferrableSurface.c(), this.f13405p, j7.a.x());
            deferrableSurface.e();
            d().b(new s(deferrableSurface, 1), j7.a.x());
            f.d(deferrableSurface.f1319g).b(rVar, j7.a.f0());
            return true;
        }
    }

    public u(int i10, int i11, v vVar, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f13390a = i11;
        this.f13395f = vVar;
        this.f13391b = matrix;
        this.f13392c = z10;
        this.f13393d = rect;
        this.f13397h = i12;
        this.f13396g = i13;
        this.f13394e = z11;
        this.f13401l = new a(i11, vVar.d());
    }

    public final void a() {
        g0.E("Edge is already closed.", !this.f13403n);
    }

    public final d1 b(r rVar) {
        m.a();
        a();
        Size d10 = this.f13395f.d();
        this.f13395f.a();
        this.f13395f.b();
        d1 d1Var = new d1(d10, rVar, new q(this, 0));
        try {
            b1 b1Var = d1Var.f4221i;
            if (this.f13401l.h(b1Var, new r(this, 0))) {
                this.f13401l.d().b(new s(b1Var, 0), j7.a.x());
            }
            this.f13400k = d1Var;
            e();
            return d1Var;
        } catch (DeferrableSurface.SurfaceClosedException e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            d1Var.b();
            throw e11;
        }
    }

    public final void c() {
        m.a();
        this.f13401l.a();
        v vVar = this.f13398i;
        if (vVar != null) {
            vVar.d();
            this.f13398i = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            g0.m.a()
            r3.a()
            n0.u$a r0 = r3.f13401l
            r0.getClass()
            g0.m.a()
            androidx.camera.core.impl.DeferrableSurface r1 = r0.f13406q
            r2 = 0
            if (r1 != 0) goto L_0x0020
            java.lang.Object r1 = r0.f1313a
            monitor-enter(r1)
            boolean r0 = r0.f1315c     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r3.c()
            r3.f13399j = r2
            n0.u$a r0 = new n0.u$a
            androidx.camera.core.impl.v r1 = r3.f13395f
            android.util.Size r1 = r1.d()
            int r2 = r3.f13390a
            r0.<init>(r2, r1)
            r3.f13401l = r0
            java.util.HashSet r0 = r3.f13402m
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x003e
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.u.d():void");
    }

    public final void e() {
        d1.e eVar;
        Executor executor;
        m.a();
        d1 d1Var = this.f13400k;
        if (d1Var != null) {
            i iVar = new i(this.f13393d, this.f13397h, this.f13396g, this.f13392c, this.f13391b, this.f13394e);
            synchronized (d1Var.f4213a) {
                d1Var.f4222j = iVar;
                eVar = d1Var.f4223k;
                executor = d1Var.f4224l;
            }
            if (eVar != null && executor != null) {
                executor.execute(new n(9, eVar, iVar));
            }
        }
    }

    public final void f(int i10, int i11) {
        p pVar = new p(this, i10, i11);
        if (m.b()) {
            pVar.run();
        } else {
            g0.E("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(pVar));
        }
    }
}
