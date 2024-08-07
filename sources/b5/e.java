package b5;

import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import s4.l;
import u4.u;
import v4.c;

/* compiled from: BitmapTransformation */
public abstract class e implements l<Bitmap> {
    public final u b(h hVar, u uVar, int i10, int i11) {
        if (o5.l.i(i10, i11)) {
            c cVar = b.b(hVar).f4916a;
            Bitmap bitmap = (Bitmap) uVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(cVar, bitmap, i10, i11);
            if (bitmap.equals(c10)) {
                return uVar;
            }
            return d.d(c10, cVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(c cVar, Bitmap bitmap, int i10, int i11);
}
