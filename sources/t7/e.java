package t7;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public final class e extends Property<Drawable, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14892a = new e();

    public e() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
