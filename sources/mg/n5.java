package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import d2.l;

/* compiled from: ItemFavoriteMenuBinding */
public abstract class n5 extends l {

    /* renamed from: w  reason: collision with root package name */
    public final MaterialCardView f21250w;

    /* renamed from: x  reason: collision with root package name */
    public final RelativeLayout f21251x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f21252y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTitleTextView f21253z;

    public n5(Object obj, View view, MaterialCardView materialCardView, RelativeLayout relativeLayout, ImageView imageView, AppTitleTextView appTitleTextView) {
        super(0, view, obj);
        this.f21250w = materialCardView;
        this.f21251x = relativeLayout;
        this.f21252y = imageView;
        this.f21253z = appTitleTextView;
    }
}
