package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import ug.c;

/* compiled from: ItemAuctionDevelopmentBinding */
public abstract class s4 extends l {
    public final AppTextView A;
    public final AppTextView B;
    public final AppTextView C;
    public c D;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f21349w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21350x;

    /* renamed from: y  reason: collision with root package name */
    public final RelativeLayout f21351y;

    /* renamed from: z  reason: collision with root package name */
    public final RelativeLayout f21352z;

    public s4(Object obj, View view, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3) {
        super(0, view, obj);
        this.f21349w = imageView;
        this.f21350x = imageView2;
        this.f21351y = relativeLayout;
        this.f21352z = relativeLayout2;
        this.A = appTextView;
        this.B = appTextView2;
        this.C = appTextView3;
    }

    public abstract void v(c cVar);
}
