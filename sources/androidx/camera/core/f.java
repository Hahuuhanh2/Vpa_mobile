package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.b;
import c0.g0;
import c0.u0;
import c0.w0;
import f0.d0;
import java.util.concurrent.Executor;

/* compiled from: SafeCloseImageReaderProxy */
public final class f implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1301a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f1302b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1303c = false;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f1304d;

    /* renamed from: e  reason: collision with root package name */
    public final Surface f1305e;

    /* renamed from: f  reason: collision with root package name */
    public b.a f1306f;

    /* renamed from: g  reason: collision with root package name */
    public final g0 f1307g = new g0(this, 1);

    public f(d0 d0Var) {
        this.f1304d = d0Var;
        this.f1305e = d0Var.getSurface();
    }

    public final void a() {
        synchronized (this.f1301a) {
            this.f1303c = true;
            this.f1304d.f();
            if (this.f1302b == 0) {
                close();
            }
        }
    }

    public final int b() {
        int b10;
        synchronized (this.f1301a) {
            b10 = this.f1304d.b();
        }
        return b10;
    }

    public final int c() {
        int c10;
        synchronized (this.f1301a) {
            c10 = this.f1304d.c();
        }
        return c10;
    }

    public final void close() {
        synchronized (this.f1301a) {
            Surface surface = this.f1305e;
            if (surface != null) {
                surface.release();
            }
            this.f1304d.close();
        }
    }

    public final d d() {
        w0 w0Var;
        synchronized (this.f1301a) {
            d d10 = this.f1304d.d();
            if (d10 != null) {
                this.f1302b++;
                w0Var = new w0(d10);
                w0Var.d(this.f1307g);
            } else {
                w0Var = null;
            }
        }
        return w0Var;
    }

    public final int e() {
        int e10;
        synchronized (this.f1301a) {
            e10 = this.f1304d.e();
        }
        return e10;
    }

    public final void f() {
        synchronized (this.f1301a) {
            this.f1304d.f();
        }
    }

    public final void g(d0.a aVar, Executor executor) {
        synchronized (this.f1301a) {
            this.f1304d.g(new u0(this, aVar), executor);
        }
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1301a) {
            surface = this.f1304d.getSurface();
        }
        return surface;
    }

    public final int h() {
        int h10;
        synchronized (this.f1301a) {
            h10 = this.f1304d.h();
        }
        return h10;
    }

    public final d i() {
        w0 w0Var;
        synchronized (this.f1301a) {
            d i10 = this.f1304d.i();
            if (i10 != null) {
                this.f1302b++;
                w0Var = new w0(i10);
                w0Var.d(this.f1307g);
            } else {
                w0Var = null;
            }
        }
        return w0Var;
    }
}
