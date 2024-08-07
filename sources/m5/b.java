package m5;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import l5.e;
import m5.d;

/* compiled from: DrawableCrossFadeTransition */
public final class b implements d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f13138a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13139b;

    public b(int i10, boolean z10) {
        this.f13138a = i10;
        this.f13139b = z10;
    }

    public final boolean a(Object obj, d.a aVar) {
        Drawable drawable = (Drawable) obj;
        e eVar = (e) aVar;
        Drawable drawable2 = ((ImageView) eVar.f12706a).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f13139b);
        transitionDrawable.startTransition(this.f13138a);
        ((ImageView) eVar.f12706a).setImageDrawable(transitionDrawable);
        return true;
    }
}
