package d5;

import android.graphics.drawable.Drawable;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: UnitDrawableDecoder */
public final class f implements j<Drawable, Drawable> {
    public final u a(Object obj, int i10, int i11, h hVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
