package e0;

import al.g0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.util.Size;
import androidx.appcompat.app.p;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import c0.v0;
import g0.e;
import h0.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import k0.f;
import n0.c;
import n0.k;
import n0.n;
import z.d;

/* compiled from: ProcessingNode */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9040a;

    /* renamed from: b  reason: collision with root package name */
    public a f9041b;

    /* renamed from: c  reason: collision with root package name */
    public t f9042c;

    /* renamed from: d  reason: collision with root package name */
    public m f9043d;

    /* renamed from: e  reason: collision with root package name */
    public h f9044e;

    /* renamed from: f  reason: collision with root package name */
    public q f9045f;

    /* renamed from: g  reason: collision with root package name */
    public p f9046g;

    /* renamed from: h  reason: collision with root package name */
    public a.a f9047h;

    /* renamed from: i  reason: collision with root package name */
    public lb.b f9048i;

    /* renamed from: j  reason: collision with root package name */
    public final d f9049j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f9050k;

    /* compiled from: ProcessingNode */
    public static abstract class a {
        public abstract k<b> a();

        public abstract int b();

        public abstract int c();
    }

    /* compiled from: ProcessingNode */
    public static abstract class b {
        public abstract androidx.camera.core.d a();

        public abstract w b();
    }

    public v(Executor executor) {
        boolean z10;
        d dVar = k0.b.f11905a;
        if (k0.b.a(f.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f9040a = new g(executor);
        } else {
            this.f9040a = executor;
        }
        this.f9049j = dVar;
        this.f9050k = dVar.a(k0.d.class);
    }

    public static void d(w wVar, ImageCaptureException imageCaptureException) {
        j7.a.f0().execute(new p(11, wVar, imageCaptureException));
    }

    public final n<byte[]> a(n<byte[]> nVar, int i10) {
        boolean z10;
        if (nVar.e() == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E((String) null, z10);
        this.f9046g.getClass();
        Rect b10 = nVar.b();
        byte[] c10 = nVar.c();
        try {
            Bitmap decodeRegion = BitmapRegionDecoder.newInstance(c10, 0, c10.length, false).decodeRegion(b10, new BitmapFactory.Options());
            e d10 = nVar.d();
            Objects.requireNonNull(d10);
            Rect rect = new Rect(0, 0, decodeRegion.getWidth(), decodeRegion.getHeight());
            int f10 = nVar.f();
            Matrix g2 = nVar.g();
            RectF rectF = g0.n.f10263a;
            Matrix matrix = new Matrix(g2);
            matrix.postTranslate((float) (-b10.left), (float) (-b10.top));
            c cVar = new c(decodeRegion, d10, 42, new Size(decodeRegion.getWidth(), decodeRegion.getHeight()), rect, f10, matrix, nVar.a());
            h hVar = this.f9044e;
            a aVar = new a(cVar, i10);
            hVar.getClass();
            n<Bitmap> b11 = aVar.b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            b11.c().compress(Bitmap.CompressFormat.JPEG, aVar.a(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            e d11 = b11.d();
            Objects.requireNonNull(d11);
            return n.j(byteArray, d11, b11.h(), b11.b(), b11.f(), b11.g(), b11.a());
        } catch (IOException e10) {
            throw new ImageCaptureException("Failed to decode JPEG.", e10);
        }
    }

    public final androidx.camera.core.d b(b bVar) {
        w b10 = bVar.b();
        n nVar = (n) this.f9042c.a(bVar);
        if ((nVar.e() == 35 || this.f9050k) && this.f9041b.c() == 256) {
            n nVar2 = (n) this.f9043d.a(new d(nVar, b10.f9053c));
            this.f9048i.getClass();
            androidx.camera.core.f fVar = new androidx.camera.core.f(new c0.b(ImageReader.newInstance(nVar2.h().getWidth(), nVar2.h().getHeight(), 256, 2)));
            androidx.camera.core.d b11 = ImageProcessingUtil.b(fVar, (byte[]) nVar2.c());
            fVar.a();
            Objects.requireNonNull(b11);
            e d10 = nVar2.d();
            Objects.requireNonNull(d10);
            Rect b12 = nVar2.b();
            int f10 = nVar2.f();
            Matrix g2 = nVar2.g();
            f0.k a10 = nVar2.a();
            androidx.camera.core.b bVar2 = (androidx.camera.core.b) b11;
            nVar = n.i(b11, d10, new Size(bVar2.c(), bVar2.b()), b12, f10, g2, a10);
        }
        this.f9047h.getClass();
        androidx.camera.core.d dVar = (androidx.camera.core.d) nVar.c();
        v0 v0Var = new v0(dVar, nVar.h(), new c0.f(dVar.f0().a(), dVar.f0().c(), nVar.f(), nVar.g()));
        v0Var.h(nVar.b());
        return v0Var;
    }

    public final void c(b bVar) {
        boolean z10;
        if (this.f9041b.c() == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y(String.format("On-disk capture only support JPEG output format. Output format: %s", new Object[]{Integer.valueOf(this.f9041b.c())}), z10);
        w b10 = bVar.b();
        n nVar = (n) this.f9043d.a(new d((n) this.f9042c.a(bVar), b10.f9053c));
        if (g0.n.b(nVar.b(), nVar.h())) {
            a(nVar, b10.f9053c);
        }
        b10.getClass();
        Objects.requireNonNull((Object) null);
        throw null;
    }
}
