package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import ui.h;

/* compiled from: ItemQuestionBinding */
public abstract class u6 extends l {
    public h A;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21386w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21387x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21388y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21389z;

    public u6(Object obj, View view, LinearLayout linearLayout, ImageView imageView, AppTextView appTextView, AppTextView appTextView2) {
        super(0, view, obj);
        this.f21386w = linearLayout;
        this.f21387x = imageView;
        this.f21388y = appTextView;
        this.f21389z = appTextView2;
    }

    public abstract void v(h hVar);
}
