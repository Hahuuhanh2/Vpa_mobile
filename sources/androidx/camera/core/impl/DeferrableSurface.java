package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.p;
import c0.p0;
import ea.c;
import i0.f;
import i0.i;
import java.util.concurrent.atomic.AtomicInteger;
import v8.a;
import z0.b;

public abstract class DeferrableSurface {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f1309k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f1310l = p0.d("DeferrableSurface");

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f1311m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicInteger f1312n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f1313a;

    /* renamed from: b  reason: collision with root package name */
    public int f1314b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1315c;

    /* renamed from: d  reason: collision with root package name */
    public b.a<Void> f1316d;

    /* renamed from: e  reason: collision with root package name */
    public final b.d f1317e;

    /* renamed from: f  reason: collision with root package name */
    public b.a<Void> f1318f;

    /* renamed from: g  reason: collision with root package name */
    public final b.d f1319g;

    /* renamed from: h  reason: collision with root package name */
    public final Size f1320h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1321i;

    /* renamed from: j  reason: collision with root package name */
    public Class<?> f1322j;

    public static final class SurfaceClosedException extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public DeferrableSurface f1323a;

        public SurfaceClosedException(DeferrableSurface deferrableSurface, String str) {
            super(str);
            this.f1323a = deferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException() {
            super("Surface request will not complete.");
        }
    }

    public DeferrableSurface() {
        this(0, f1309k);
    }

    public final void a() {
        b.a<Void> aVar;
        synchronized (this.f1313a) {
            if (!this.f1315c) {
                this.f1315c = true;
                this.f1318f.a(null);
                if (this.f1314b == 0) {
                    aVar = this.f1316d;
                    this.f1316d = null;
                } else {
                    aVar = null;
                }
                if (p0.d("DeferrableSurface")) {
                    toString();
                    p0.a("DeferrableSurface");
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final void b() {
        b.a<Void> aVar;
        synchronized (this.f1313a) {
            int i10 = this.f1314b;
            if (i10 != 0) {
                int i11 = i10 - 1;
                this.f1314b = i11;
                if (i11 != 0 || !this.f1315c) {
                    aVar = null;
                } else {
                    aVar = this.f1316d;
                    this.f1316d = null;
                }
                if (p0.d("DeferrableSurface")) {
                    toString();
                    p0.a("DeferrableSurface");
                    if (this.f1314b == 0) {
                        f(f1312n.get(), f1311m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public final a<Surface> c() {
        synchronized (this.f1313a) {
            if (this.f1315c) {
                i.a aVar = new i.a(new SurfaceClosedException(this, "DeferrableSurface already closed."));
                return aVar;
            }
            a<Surface> g2 = g();
            return g2;
        }
    }

    public final a<Void> d() {
        return f.d(this.f1317e);
    }

    public final void e() {
        synchronized (this.f1313a) {
            int i10 = this.f1314b;
            if (i10 == 0) {
                if (this.f1315c) {
                    throw new SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                }
            }
            this.f1314b = i10 + 1;
            if (p0.d("DeferrableSurface")) {
                if (this.f1314b == 1) {
                    f(f1312n.get(), f1311m.incrementAndGet(), "New surface in use");
                }
                toString();
                p0.a("DeferrableSurface");
            }
        }
    }

    public final void f(int i10, int i11, String str) {
        if (!f1310l && p0.d("DeferrableSurface")) {
            p0.a("DeferrableSurface");
        }
        toString();
        p0.a("DeferrableSurface");
    }

    public abstract a<Surface> g();

    public DeferrableSurface(int i10, Size size) {
        this.f1313a = new Object();
        this.f1314b = 0;
        this.f1315c = false;
        this.f1320h = size;
        this.f1321i = i10;
        b.d a10 = b.a(new ca.a(this, 7));
        this.f1317e = a10;
        this.f1319g = b.a(new c(this, 6));
        if (p0.d("DeferrableSurface")) {
            f(f1312n.incrementAndGet(), f1311m.get(), "Surface created");
            a10.f17803b.b(new p(14, this, Log.getStackTraceString(new Exception())), j7.a.x());
        }
    }
}
