package b5;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import j7.a;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import o5.l;
import s4.e;
import v4.c;

/* compiled from: RoundedCorners */
public final class w extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4079c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(e.f14624a);

    /* renamed from: b  reason: collision with root package name */
    public final int f4080b;

    public w(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.m("roundingRadius must be greater than 0.", z10);
        this.f4080b = i10;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4079c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f4080b).array());
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        boolean z10;
        int i12 = this.f4080b;
        Paint paint = y.f4085a;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.m("roundingRadius must be greater than 0.", z10);
        Bitmap.Config d10 = y.d(bitmap);
        Bitmap c10 = y.c(bitmap, cVar);
        Bitmap e10 = cVar.e(c10.getWidth(), c10.getHeight(), d10);
        e10.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(c10, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) e10.getWidth(), (float) e10.getHeight());
        Lock lock = y.f4088d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e10);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f10 = (float) i12;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
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
        if (!(obj instanceof w) || this.f4080b != ((w) obj).f4080b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f4080b;
        char[] cArr = l.f13754a;
        return ((i10 + 527) * 31) - 569625254;
    }
}
