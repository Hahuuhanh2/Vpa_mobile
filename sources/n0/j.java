package n0;

import al.g0;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.p;
import androidx.camera.core.ImageProcessingUtil;
import c0.d1;
import c0.i0;
import c0.p0;
import c0.x;
import c0.x0;
import c0.z0;
import d.d;
import ek.h;
import i0.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.o;
import p3.l0;
import v.l;
import v.n;
import z0.b;

/* compiled from: DefaultSurfaceProcessor */
public final class j implements w, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final m f13338a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f13339b;

    /* renamed from: c  reason: collision with root package name */
    public final h0.b f13340c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f13341d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f13342e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final float[] f13343f = new float[16];

    /* renamed from: g  reason: collision with root package name */
    public final float[] f13344g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f13345h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f13346i = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13347j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f13348k = new ArrayList();

    /* compiled from: DefaultSurfaceProcessor */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static i0 f13349a = new i0(2);
    }

    /* compiled from: DefaultSurfaceProcessor */
    public static abstract class b {
        public abstract b.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public j(x xVar) {
        o.a aVar = o.f13372a;
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f13339b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f13341d = handler;
        this.f13340c = new h0.b(handler);
        this.f13338a = new m();
        try {
            z0.b.a(new f(0, this, xVar, aVar)).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e11) {
            a();
            throw e11;
        }
    }

    public final void a() {
        if (!this.f13342e.getAndSet(true)) {
            f(new d(this, 13), new l(1));
        }
    }

    public final void b(d1 d1Var) {
        if (this.f13342e.get()) {
            d1Var.b();
        } else {
            f(new n(14, this, d1Var), new z0(d1Var, 1));
        }
    }

    public final void c(x0 x0Var) {
        if (this.f13342e.get()) {
            x0Var.close();
            return;
        }
        p pVar = new p(16, this, x0Var);
        Objects.requireNonNull(x0Var);
        f(pVar, new d(x0Var, 12));
    }

    public final v8.a<Void> d(int i10, int i11) {
        return f.d(z0.b.a(new i(this, i10, i11)));
    }

    public final void e() {
        if (this.f13347j && this.f13346i == 0) {
            for (x0 close : this.f13345h.keySet()) {
                close.close();
            }
            Iterator it = this.f13348k.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a().b(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f13345h.clear();
            m mVar = this.f13338a;
            if (mVar.f13359a.getAndSet(false)) {
                mVar.c();
                mVar.q();
            }
            this.f13339b.quit();
        }
    }

    public final void f(Runnable runnable, Runnable runnable2) {
        try {
            this.f13340c.execute(new w.o(2, this, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            p0.h("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void g(Exception exc) {
        Iterator it = this.f13348k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a().b(exc);
        }
        this.f13348k.clear();
    }

    public final Bitmap h(Size size, float[] fArr, int i10) {
        boolean z10;
        int i11 = i10;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr2, 0, -0.0f, -0.5f, 0.0f);
        l0.r0((float) i11, fArr2);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        Size e10 = g0.n.e(i11, size);
        m mVar = this.f13338a;
        mVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e10.getHeight() * e10.getWidth() * 4);
        if (allocateDirect.capacity() == e10.getHeight() * e10.getWidth() * 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("ByteBuffer capacity is not equal to width * height * 4.", z10);
        g0.y("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m.b("glGenTextures");
        int i12 = iArr[0];
        GLES20.glActiveTexture(33985);
        m.b("glActiveTexture");
        GLES20.glBindTexture(3553, i12);
        m.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, e10.getWidth(), e10.getHeight(), 0, 6407, 5121, (Buffer) null);
        m.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        m.b("glGenFramebuffers");
        int i13 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i13);
        m.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i12, 0);
        m.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        m.b("glActiveTexture");
        GLES20.glBindTexture(36197, mVar.f13367i);
        m.b("glBindTexture");
        mVar.f13366h = null;
        GLES20.glViewport(0, 0, e10.getWidth(), e10.getHeight());
        GLES20.glScissor(0, 0, e10.getWidth(), e10.getHeight());
        GLES20.glUniformMatrix4fv(mVar.f13369k, 1, false, fArr2, 0);
        m.b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, e10.getWidth(), e10.getHeight(), 6408, 5121, allocateDirect);
        m.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i12}, 0);
        m.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i13}, 0);
        m.b("glDeleteFramebuffers");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, mVar.f13367i);
        Bitmap createBitmap = Bitmap.createBitmap(e10.getWidth(), e10.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.e(createBitmap, allocateDirect, e10.getWidth() * 4);
        return createBitmap;
    }

    public final void i(h<Surface, Size, float[]> hVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!this.f13348k.isEmpty()) {
            if (hVar == null) {
                g(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = this.f13348k.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (i10 != bVar.c() || bitmap == null) {
                        i10 = bVar.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = h((Size) hVar.f20110b, (float[]) hVar.f20111c, i10);
                        i11 = -1;
                    }
                    if (i11 != bVar.b()) {
                        byteArrayOutputStream.reset();
                        i11 = bVar.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.h(bArr, (Surface) hVar.f20109a);
                    bVar.a().a(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
                return;
            } catch (IOException e10) {
                g(e10);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z10;
        if (!this.f13342e.get()) {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.f13343f);
            h hVar = null;
            for (Map.Entry entry : this.f13345h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                x0 x0Var = (x0) entry.getKey();
                x0Var.r(this.f13344g, this.f13343f);
                if (x0Var.getFormat() == 34) {
                    try {
                        this.f13338a.s(surfaceTexture.getTimestamp(), this.f13344g, surface);
                    } catch (RuntimeException unused) {
                        p0.c("DefaultSurfaceProcessor");
                    }
                } else {
                    boolean z11 = true;
                    if (x0Var.getFormat() == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    StringBuilder q10 = android.support.v4.media.a.q("Unsupported format: ");
                    q10.append(x0Var.getFormat());
                    g0.E(q10.toString(), z10);
                    if (hVar != null) {
                        z11 = false;
                    }
                    g0.E("Only one JPEG output is supported.", z11);
                    hVar = new h(surface, x0Var.g(), (float[]) this.f13344g.clone());
                }
            }
            try {
                i(hVar);
            } catch (RuntimeException e10) {
                g(e10);
            }
        }
    }
}
