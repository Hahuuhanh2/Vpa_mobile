package l5;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import m5.d;

/* compiled from: ImageViewTarget */
public abstract class e<Z> extends h<ImageView, Z> implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public Animatable f12704d;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void b() {
        Animatable animatable = this.f12704d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void e(Drawable drawable) {
        l((Object) null);
        this.f12704d = null;
        ((ImageView) this.f12706a).setImageDrawable(drawable);
    }

    public final void f() {
        Animatable animatable = this.f12704d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void g(Z z10, d<? super Z> dVar) {
        if (dVar == null || !dVar.a(z10, this)) {
            l(z10);
            if (z10 instanceof Animatable) {
                Animatable animatable = (Animatable) z10;
                this.f12704d = animatable;
                animatable.start();
                return;
            }
            this.f12704d = null;
        } else if (z10 instanceof Animatable) {
            Animatable animatable2 = (Animatable) z10;
            this.f12704d = animatable2;
            animatable2.start();
        } else {
            this.f12704d = null;
        }
    }

    public final void h(Drawable drawable) {
        l((Object) null);
        this.f12704d = null;
        ((ImageView) this.f12706a).setImageDrawable(drawable);
    }

    public final void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f12704d;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        this.f12704d = null;
        ((ImageView) this.f12706a).setImageDrawable(drawable);
    }

    public abstract void l(Z z10);
}
