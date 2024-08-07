package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import h8.b;
import h8.c;
import h8.f;
import h8.g;
import h8.l;

public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: u  reason: collision with root package name */
    public static final int f6631u = R$style.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public final b a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f6615a).f6634i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f6615a).f6633h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f6615a).f6632g;
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f6615a).f6634i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f6615a;
        if (((CircularProgressIndicatorSpec) s10).f6633h != i10) {
            ((CircularProgressIndicatorSpec) s10).f6633h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f6615a;
        if (((CircularProgressIndicatorSpec) s10).f6632g != max) {
            ((CircularProgressIndicatorSpec) s10).f6632g = max;
            ((CircularProgressIndicatorSpec) s10).getClass();
            invalidate();
        }
    }

    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f6615a).getClass();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f6631u);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f6615a;
        setIndeterminateDrawable(new l(context2, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec), new f(circularProgressIndicatorSpec)));
        Context context3 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec2 = (CircularProgressIndicatorSpec) this.f6615a;
        setProgressDrawable(new g(context3, circularProgressIndicatorSpec2, new c(circularProgressIndicatorSpec2)));
    }
}
