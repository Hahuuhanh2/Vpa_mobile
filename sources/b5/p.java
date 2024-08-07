package b5;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import s4.e;
import v4.c;

/* compiled from: FitCenter */
public final class p extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4047b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(e.f14624a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4047b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i10, int i11) {
        return y.b(cVar, bitmap, i10, i11);
    }

    public final boolean equals(Object obj) {
        return obj instanceof p;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
