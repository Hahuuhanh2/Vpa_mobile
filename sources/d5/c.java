package d5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j7.a;
import u4.r;
import u4.u;

/* compiled from: DrawableResource */
public abstract class c<T extends Drawable> implements u<T>, r {

    /* renamed from: a  reason: collision with root package name */
    public final T f8748a;

    public c(T t10) {
        a.r(t10);
        this.f8748a = t10;
    }

    public void a() {
        T t10 = this.f8748a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof f5.c) {
            ((f5.c) t10).f9925a.f9935a.f9948l.prepareToDraw();
        }
    }

    public final Object get() {
        Drawable.ConstantState constantState = this.f8748a.getConstantState();
        if (constantState == null) {
            return this.f8748a;
        }
        return constantState.newDrawable();
    }
}
