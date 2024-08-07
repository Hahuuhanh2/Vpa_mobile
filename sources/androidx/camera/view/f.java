package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.p;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import c0.d1;
import c0.r;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k1.a;
import z0.b;

/* compiled from: TextureViewImplementation */
public final class f extends c {

    /* renamed from: e  reason: collision with root package name */
    public TextureView f1512e;

    /* renamed from: f  reason: collision with root package name */
    public SurfaceTexture f1513f;

    /* renamed from: g  reason: collision with root package name */
    public b.d f1514g;

    /* renamed from: h  reason: collision with root package name */
    public d1 f1515h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1516i = false;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f1517j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicReference<b.a<Void>> f1518k = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    public c.a f1519l;

    /* renamed from: m  reason: collision with root package name */
    public Executor f1520m;

    public f(PreviewView previewView, b bVar) {
        super(previewView, bVar);
    }

    public final View a() {
        return this.f1512e;
    }

    public final Bitmap b() {
        TextureView textureView = this.f1512e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f1512e.getBitmap();
    }

    public final void c() {
        SurfaceTexture surfaceTexture;
        if (this.f1516i && this.f1517j != null && this.f1512e.getSurfaceTexture() != (surfaceTexture = this.f1517j)) {
            this.f1512e.setSurfaceTexture(surfaceTexture);
            this.f1517j = null;
            this.f1516i = false;
        }
    }

    public final void d() {
        this.f1516i = true;
    }

    public final void e(d1 d1Var, r0.f fVar) {
        this.f1495a = d1Var.f4214b;
        this.f1519l = fVar;
        this.f1496b.getClass();
        this.f1495a.getClass();
        TextureView textureView = new TextureView(this.f1496b.getContext());
        this.f1512e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f1495a.getWidth(), this.f1495a.getHeight()));
        this.f1512e.setSurfaceTextureListener(new e(this));
        this.f1496b.removeAllViews();
        this.f1496b.addView(this.f1512e);
        d1 d1Var2 = this.f1515h;
        if (d1Var2 != null) {
            d1Var2.b();
        }
        this.f1515h = d1Var;
        Executor mainExecutor = a.getMainExecutor(this.f1512e.getContext());
        p pVar = new p(20, this, d1Var);
        z0.c<Void> cVar = d1Var.f4220h.f17800c;
        if (cVar != null) {
            cVar.b(pVar, mainExecutor);
        }
        i();
    }

    public final void g(Executor executor, PreviewView.d dVar) {
        this.f1520m = executor;
    }

    public final v8.a<Void> h() {
        return b.a(new ea.c(this, 10));
    }

    public final void i() {
        SurfaceTexture surfaceTexture;
        Size size = this.f1495a;
        if (size != null && (surfaceTexture = this.f1513f) != null && this.f1515h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f1495a.getHeight());
            Surface surface = new Surface(this.f1513f);
            d1 d1Var = this.f1515h;
            b.d a10 = b.a(new r(3, this, surface));
            this.f1514g = a10;
            a10.f17803b.b(new v.r(this, surface, a10, d1Var, 2), a.getMainExecutor(this.f1512e.getContext()));
            this.f1498d = true;
            f();
        }
    }
}
