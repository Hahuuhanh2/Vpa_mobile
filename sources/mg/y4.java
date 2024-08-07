package mg;

import android.view.View;
import android.widget.ImageView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import lh.c;

/* compiled from: ItemAuctionProgressBinding */
public abstract class y4 extends l {
    public c A;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f21498w;

    /* renamed from: x  reason: collision with root package name */
    public final AppTextView f21499x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21500y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21501z;

    public y4(Object obj, View view, ImageView imageView, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3) {
        super(0, view, obj);
        this.f21498w = imageView;
        this.f21499x = appTextView;
        this.f21500y = appTextView2;
        this.f21501z = appTextView3;
    }

    public abstract void v(c cVar);
}
