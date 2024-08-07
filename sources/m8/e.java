package m8;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import t7.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f13185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f13186b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13187c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f13188d;

    public /* synthetic */ e(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view) {
        this.f13185a = sideSheetBehavior;
        this.f13186b = marginLayoutParams;
        this.f13187c = i10;
        this.f13188d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SideSheetBehavior sideSheetBehavior = this.f13185a;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f13186b;
        int i10 = this.f13187c;
        View view = this.f13188d;
        sideSheetBehavior.f6725a.o(marginLayoutParams, b.b(valueAnimator.getAnimatedFraction(), i10, 0));
        view.requestLayout();
    }
}
