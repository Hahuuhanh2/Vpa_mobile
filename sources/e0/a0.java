package e0;

import al.g0;
import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.d;
import c0.k0;
import java.nio.ByteBuffer;
import java.util.Objects;
import n0.n;

/* compiled from: RgbaImageProxy */
public final class a0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8971a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8972b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8973c;

    /* renamed from: d  reason: collision with root package name */
    public d.a[] f8974d;

    /* renamed from: e  reason: collision with root package name */
    public final z f8975e;

    public a0(n<Bitmap> nVar) {
        boolean z10;
        Bitmap c10 = nVar.c();
        nVar.b();
        int f10 = nVar.f();
        nVar.g();
        long c11 = nVar.a().c();
        if (c10.getConfig() == Bitmap.Config.ARGB_8888) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("Only accept Bitmap with ARGB_8888 format for now.", z10);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(c10.getAllocationByteCount());
        ImageProcessingUtil.d(c10, allocateDirect, c10.getRowBytes());
        allocateDirect.rewind();
        int width = c10.getWidth();
        int height = c10.getHeight();
        this.f8971a = new Object();
        this.f8972b = width;
        this.f8973c = height;
        this.f8975e = new z(c11, f10);
        allocateDirect.rewind();
        this.f8974d = new d.a[]{new y(width * 4, allocateDirect)};
    }

    public final int b() {
        int i10;
        synchronized (this.f8971a) {
            d();
            i10 = this.f8973c;
        }
        return i10;
    }

    public final int c() {
        int i10;
        synchronized (this.f8971a) {
            d();
            i10 = this.f8972b;
        }
        return i10;
    }

    public final void close() {
        synchronized (this.f8971a) {
            d();
            this.f8974d = null;
        }
    }

    public final void d() {
        boolean z10;
        synchronized (this.f8971a) {
            if (this.f8974d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("The image is closed.", z10);
        }
    }

    public final k0 f0() {
        z zVar;
        synchronized (this.f8971a) {
            d();
            zVar = this.f8975e;
        }
        return zVar;
    }

    public final int getFormat() {
        synchronized (this.f8971a) {
            d();
        }
        return 1;
    }

    public final d.a[] l() {
        d.a[] aVarArr;
        synchronized (this.f8971a) {
            d();
            d.a[] aVarArr2 = this.f8974d;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public final Image r0() {
        synchronized (this.f8971a) {
            d();
        }
        return null;
    }
}
