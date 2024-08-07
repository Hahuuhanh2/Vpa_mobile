package d5;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource */
public final class d extends c<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    public final void b() {
    }

    public final Class<Drawable> c() {
        return this.f8748a.getClass();
    }

    public final int g() {
        return Math.max(1, this.f8748a.getIntrinsicHeight() * this.f8748a.getIntrinsicWidth() * 4);
    }
}
