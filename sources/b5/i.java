package b5;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import s4.e;
import v4.c;

/* compiled from: CenterInside */
public final class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4023b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(e.f14624a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4023b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f4085a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return y.b(cVar, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
