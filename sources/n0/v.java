package n0;

import al.g0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.p;
import c0.p0;
import c0.x0;
import ea.c;
import f0.r;
import g0.n;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p3.l0;
import v1.a;
import z0.b;

/* compiled from: SurfaceOutputImpl */
public final class v implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13407a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Surface f13408b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13409c;

    /* renamed from: d  reason: collision with root package name */
    public final Size f13410d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f13411e;

    /* renamed from: f  reason: collision with root package name */
    public a<x0.a> f13412f;

    /* renamed from: n  reason: collision with root package name */
    public Executor f13413n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13414o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13415p;

    /* renamed from: q  reason: collision with root package name */
    public final b.d f13416q;

    /* renamed from: r  reason: collision with root package name */
    public b.a<Void> f13417r;

    /* renamed from: s  reason: collision with root package name */
    public r f13418s;

    public v(Surface surface, int i10, Size size, Size size2, Rect rect, int i11, boolean z10, r rVar) {
        float[] fArr = new float[16];
        this.f13411e = fArr;
        float[] fArr2 = new float[16];
        this.f13414o = false;
        this.f13415p = false;
        this.f13408b = surface;
        this.f13409c = i10;
        this.f13410d = size;
        Rect rect2 = new Rect(rect);
        this.f13418s = rVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
        l0.r0((float) i11, fArr);
        if (z10) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size e10 = n.e(i11, size2);
        android.graphics.Matrix a10 = n.a(i11, n.f(size2), n.f(e10), z10);
        RectF rectF = new RectF(rect2);
        a10.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / ((float) e10.getWidth()), ((((float) e10.getHeight()) - rectF.height()) - rectF.top) / ((float) e10.getHeight()), 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width() / ((float) e10.getWidth()), rectF.height() / ((float) e10.getHeight()), 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr2, 0, -0.0f, -0.5f, 0.0f);
        r rVar2 = this.f13418s;
        if (rVar2 != null) {
            g0.E("Camera has no transform.", rVar2.m());
            l0.r0((float) this.f13418s.a().a(), fArr2);
            if (this.f13418s.e()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        this.f13416q = b.a(new c(this, 7));
    }

    public final void close() {
        synchronized (this.f13407a) {
            if (!this.f13415p) {
                this.f13415p = true;
            }
        }
        this.f13417r.a(null);
    }

    public final void d() {
        Executor executor;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f13407a) {
            if (this.f13413n != null) {
                a<x0.a> aVar = this.f13412f;
                if (aVar != null) {
                    if (!this.f13415p) {
                        atomicReference.set(aVar);
                        executor = this.f13413n;
                        this.f13414o = false;
                    }
                    executor = null;
                }
            }
            this.f13414o = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new p(18, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                p0.e(3, p0.f("SurfaceOutputImpl"));
            }
        }
    }

    public final Size g() {
        return this.f13410d;
    }

    public final int getFormat() {
        return this.f13409c;
    }

    public final void r(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f13411e, 0);
    }

    public final Surface y(h0.b bVar, g gVar) {
        boolean z10;
        synchronized (this.f13407a) {
            this.f13413n = bVar;
            this.f13412f = gVar;
            z10 = this.f13414o;
        }
        if (z10) {
            d();
        }
        return this.f13408b;
    }
}
