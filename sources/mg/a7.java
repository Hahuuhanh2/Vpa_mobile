package mg;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.base.utils.customview.TimeCounterView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import ug.f;

/* compiled from: ItemRoomAuctionBinding */
public abstract class a7 extends l {
    public final AppTextView A;
    public final GradientTextView B;
    public f C;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f20960w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f20961x;

    /* renamed from: y  reason: collision with root package name */
    public final TimeCounterView f20962y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f20963z;

    public a7(Object obj, View view, MaterialButton materialButton, TextView textView, TimeCounterView timeCounterView, AppTextView appTextView, AppTextView appTextView2, GradientTextView gradientTextView) {
        super(0, view, obj);
        this.f20960w = materialButton;
        this.f20961x = textView;
        this.f20962y = timeCounterView;
        this.f20963z = appTextView;
        this.A = appTextView2;
        this.B = gradientTextView;
    }

    public abstract void v(f fVar);
}
