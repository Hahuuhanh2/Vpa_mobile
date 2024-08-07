package b5;

import android.graphics.Bitmap;
import o5.l;
import u4.r;
import u4.u;
import v4.c;

/* compiled from: BitmapResource */
public final class d implements u<Bitmap>, r {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f4018a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4019b;

    public d(Bitmap bitmap, c cVar) {
        if (bitmap != null) {
            this.f4018a = bitmap;
            if (cVar != null) {
                this.f4019b = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d d(Bitmap bitmap, c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, cVar);
    }

    public final void a() {
        this.f4018a.prepareToDraw();
    }

    public final void b() {
        this.f4019b.d(this.f4018a);
    }

    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    public final int g() {
        return l.c(this.f4018a);
    }

    public final Object get() {
        return this.f4018a;
    }
}
