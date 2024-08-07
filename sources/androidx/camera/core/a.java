package androidx.camera.core;

import android.graphics.Matrix;
import android.media.Image;
import androidx.camera.core.d;
import c0.f;
import c0.k0;
import f0.u0;
import java.nio.ByteBuffer;

/* compiled from: AndroidImageProxy */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Image f1278a;

    /* renamed from: b  reason: collision with root package name */
    public final C0012a[] f1279b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1280c;

    /* renamed from: androidx.camera.core.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidImageProxy */
    public static final class C0012a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final Image.Plane f1281a;

        public C0012a(Image.Plane plane) {
            this.f1281a = plane;
        }

        public final ByteBuffer a() {
            return this.f1281a.getBuffer();
        }

        public final int b() {
            return this.f1281a.getRowStride();
        }

        public final int c() {
            return this.f1281a.getPixelStride();
        }
    }

    public a(Image image) {
        this.f1278a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1279b = new C0012a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f1279b[i10] = new C0012a(planes[i10]);
            }
        } else {
            this.f1279b = new C0012a[0];
        }
        this.f1280c = new f(u0.f9604b, image.getTimestamp(), 0, new Matrix());
    }

    public final int b() {
        return this.f1278a.getHeight();
    }

    public final int c() {
        return this.f1278a.getWidth();
    }

    public final void close() {
        this.f1278a.close();
    }

    public final k0 f0() {
        return this.f1280c;
    }

    public final int getFormat() {
        return this.f1278a.getFormat();
    }

    public final d.a[] l() {
        return this.f1279b;
    }

    public final Image r0() {
        return this.f1278a;
    }
}
