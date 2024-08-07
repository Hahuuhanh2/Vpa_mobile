package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import sk.j;
import w1.l0;

/* compiled from: WeekHolder.kt */
final class WidthDivisorLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f8045a;

    public WidthDivisorLinearLayout(Context context) {
        super(context);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        l0 l0Var = new l0(this);
        while (true) {
            z11 = false;
            boolean z12 = true;
            if (!l0Var.hasNext()) {
                z11 = true;
                break;
            }
            if (((View) l0Var.next()).getVisibility() != 8) {
                z12 = false;
                continue;
            }
            if (z12) {
                break;
            }
        }
        if (!z11) {
            throw new IllegalStateException("Use `View.INVISIBLE` to hide any unneeded day content instead of `View.GONE`".toString());
        }
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f8045a > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) / this.f8045a, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
    }
}
