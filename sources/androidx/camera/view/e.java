package androidx.camera.view;

import al.g0;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import c0.d1;
import c0.p0;
import i0.c;
import i0.f;
import java.util.Objects;
import java.util.concurrent.Executor;
import z0.b;

/* compiled from: TextureViewImplementation */
public final class e implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f1509a;

    /* compiled from: TextureViewImplementation */
    public class a implements c<d1.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f1510a;

        public a(SurfaceTexture surfaceTexture) {
            this.f1510a = surfaceTexture;
        }

        public final void a(Throwable th2) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
        }

        public final void onSuccess(Object obj) {
            boolean z10;
            if (((d1.c) obj).a() != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("Unexpected result from SurfaceRequest. Surface was provided twice.", z10);
            p0.a("TextureViewImpl");
            this.f1510a.release();
            f fVar = e.this.f1509a;
            if (fVar.f1517j != null) {
                fVar.f1517j = null;
            }
        }
    }

    public e(f fVar) {
        this.f1509a = fVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        p0.a("TextureViewImpl");
        f fVar = this.f1509a;
        fVar.f1513f = surfaceTexture;
        if (fVar.f1514g != null) {
            fVar.f1515h.getClass();
            Objects.toString(this.f1509a.f1515h);
            p0.a("TextureViewImpl");
            this.f1509a.f1515h.f4221i.a();
            return;
        }
        fVar.i();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f fVar = this.f1509a;
        fVar.f1513f = null;
        b.d dVar = fVar.f1514g;
        if (dVar != null) {
            a aVar = new a(surfaceTexture);
            dVar.b(new f.b(dVar, aVar), k1.a.getMainExecutor(fVar.f1512e.getContext()));
            this.f1509a.f1517j = surfaceTexture;
            return false;
        }
        p0.a("TextureViewImpl");
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        p0.a("TextureViewImpl");
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        b.a andSet = this.f1509a.f1518k.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(null);
        }
        f fVar = this.f1509a;
        fVar.getClass();
        Executor executor = fVar.f1520m;
    }
}
