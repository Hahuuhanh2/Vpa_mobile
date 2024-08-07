package b5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import s4.e;
import v4.c;

/* compiled from: CircleCrop */
public final class j extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4024b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(e.f14624a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4024b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f4085a;
        int min = Math.min(i10, i11);
        float f10 = (float) min;
        float f11 = f10 / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap c10 = y.c(bitmap, cVar);
        Bitmap e10 = cVar.e(min, min, y.d(bitmap));
        e10.setHasAlpha(true);
        Lock lock = y.f4088d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e10);
            canvas.drawCircle(f11, f11, f11, y.f4086b);
            canvas.drawBitmap(c10, (Rect) null, rectF, y.f4087c);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!c10.equals(bitmap)) {
                cVar.d(c10);
            }
            return e10;
        } catch (Throwable th2) {
            y.f4088d.unlock();
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    public final int hashCode() {
        return 1101716364;
    }
}
