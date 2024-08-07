package c0;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.a;
import androidx.camera.core.d;
import f0.d0;
import g0.l;
import java.util.concurrent.Executor;

/* compiled from: AndroidImageReaderProxy */
public final class b implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f4181a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4182b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f4183c = true;

    public b(ImageReader imageReader) {
        this.f4181a = imageReader;
    }

    public final int b() {
        int height;
        synchronized (this.f4182b) {
            height = this.f4181a.getHeight();
        }
        return height;
    }

    public final int c() {
        int width;
        synchronized (this.f4182b) {
            width = this.f4181a.getWidth();
        }
        return width;
    }

    public final void close() {
        synchronized (this.f4182b) {
            this.f4181a.close();
        }
    }

    public final d d() {
        Image image;
        synchronized (this.f4182b) {
            try {
                image = this.f4181a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if ("ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            a aVar = new a(image);
            return aVar;
        }
    }

    public final int e() {
        int imageFormat;
        synchronized (this.f4182b) {
            imageFormat = this.f4181a.getImageFormat();
        }
        return imageFormat;
    }

    public final void f() {
        synchronized (this.f4182b) {
            this.f4183c = true;
            this.f4181a.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public final void g(d0.a aVar, Executor executor) {
        synchronized (this.f4182b) {
            this.f4183c = false;
            this.f4181a.setOnImageAvailableListener(new a(this, executor, aVar), l.a());
        }
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f4182b) {
            surface = this.f4181a.getSurface();
        }
        return surface;
    }

    public final int h() {
        int maxImages;
        synchronized (this.f4182b) {
            maxImages = this.f4181a.getMaxImages();
        }
        return maxImages;
    }

    public final d i() {
        Image image;
        synchronized (this.f4182b) {
            try {
                image = this.f4181a.acquireNextImage();
            } catch (RuntimeException e10) {
                if ("ImageReaderContext is not initialized".equals(e10.getMessage())) {
                    image = null;
                } else {
                    throw e10;
                }
            }
            if (image == null) {
                return null;
            }
            a aVar = new a(image);
            return aVar;
        }
    }
}
