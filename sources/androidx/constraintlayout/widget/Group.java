package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    public final void q() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1899q0.R(0);
        layoutParams.f1899q0.O(0);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
