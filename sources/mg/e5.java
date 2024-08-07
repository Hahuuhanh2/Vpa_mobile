package mg;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import d2.l;
import ug.e;

/* compiled from: ItemAwaitAuctionBinding */
public abstract class e5 extends l {
    public final GradientTextView A;
    public e B;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21048w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f21049x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTitleTextView f21050y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTitleTextView f21051z;

    public e5(Object obj, View view, MaterialButton materialButton, TextView textView, AppTitleTextView appTitleTextView, AppTitleTextView appTitleTextView2, GradientTextView gradientTextView) {
        super(0, view, obj);
        this.f21048w = materialButton;
        this.f21049x = textView;
        this.f21050y = appTitleTextView;
        this.f21051z = appTitleTextView2;
        this.A = gradientTextView;
    }

    public abstract void v(e eVar);
}
