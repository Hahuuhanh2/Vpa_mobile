package v4;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter */
public class d implements c {
    public final void a(int i10) {
    }

    public final void b() {
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }
}
