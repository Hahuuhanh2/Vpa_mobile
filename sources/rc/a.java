package rc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f14564a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b f14565b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14566c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14567d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14568e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14569f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f14570g;

    public a(Bitmap bitmap) {
        j.f(bitmap);
        this.f14564a = bitmap;
        this.f14566c = bitmap.getWidth();
        this.f14567d = bitmap.getHeight();
        b(0);
        this.f14568e = 0;
        this.f14569f = -1;
        this.f14570g = null;
    }

    public static void b(int i10) {
        boolean z10;
        if (i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
    }

    public final Image.Plane[] a() {
        if (this.f14565b == null) {
            return null;
        }
        return this.f14565b.f14571a.getPlanes();
    }

    public a(Image image, int i10, int i11, int i12) {
        this.f14565b = new b(image);
        this.f14566c = i10;
        this.f14567d = i11;
        b(i12);
        this.f14568e = i12;
        this.f14569f = 35;
        this.f14570g = null;
    }
}
