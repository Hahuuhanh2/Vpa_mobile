package b5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import s4.e;
import v4.c;

/* compiled from: CenterCrop */
public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4022b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(e.f14624a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4022b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        Bitmap.Config config;
        Paint paint = y.f4085a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e10 = cVar.e(i10, i11, config);
        e10.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, e10, matrix);
        return e10;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
