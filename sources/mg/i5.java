package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import d2.l;
import ui.d;

/* compiled from: ItemCategoryBinding */
public abstract class i5 extends l {

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21117w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21118x;

    /* renamed from: y  reason: collision with root package name */
    public d f21119y;

    public i5(Object obj, View view, LinearLayout linearLayout, ImageView imageView) {
        super(0, view, obj);
        this.f21117w = linearLayout;
        this.f21118x = imageView;
    }

    public abstract void v(d dVar);
}
