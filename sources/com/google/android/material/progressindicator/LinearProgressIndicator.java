package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import h8.b;
import h8.g;
import h8.l;
import h8.m;
import h8.o;
import h8.r;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: u  reason: collision with root package name */
    public static final int f6635u = R$style.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public final b a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f6615a).f6636g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f6615a).f6637h;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s10 = this.f6615a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) s10).f6637h != 1) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!((d0.e.d(this) == 1 && ((LinearProgressIndicatorSpec) this.f6615a).f6637h == 2) || (d0.e.d(this) == 0 && ((LinearProgressIndicatorSpec) this.f6615a).f6637h == 3))) {
                z11 = false;
            }
        }
        linearProgressIndicatorSpec.f6638i = z11;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        l indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        g progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        if (((LinearProgressIndicatorSpec) this.f6615a).f6636g != i10) {
            if (!b() || !isIndeterminate()) {
                S s10 = this.f6615a;
                ((LinearProgressIndicatorSpec) s10).f6636g = i10;
                ((LinearProgressIndicatorSpec) s10).a();
                if (i10 == 0) {
                    l indeterminateDrawable = getIndeterminateDrawable();
                    o oVar = new o((LinearProgressIndicatorSpec) this.f6615a);
                    indeterminateDrawable.f10670t = oVar;
                    oVar.f13020a = indeterminateDrawable;
                } else {
                    l indeterminateDrawable2 = getIndeterminateDrawable();
                    r rVar = new r(getContext(), (LinearProgressIndicatorSpec) this.f6615a);
                    indeterminateDrawable2.f10670t = rVar;
                    rVar.f13020a = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f6615a).a();
    }

    public void setIndicatorDirection(int i10) {
        S s10 = this.f6615a;
        ((LinearProgressIndicatorSpec) s10).f6637h = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s10;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!((d0.e.d(this) == 1 && ((LinearProgressIndicatorSpec) this.f6615a).f6637h == 2) || (d0.e.d(this) == 0 && i10 == 3))) {
                z10 = false;
            }
        }
        linearProgressIndicatorSpec.f6638i = z10;
        invalidate();
    }

    public void setProgressCompat(int i10, boolean z10) {
        S s10 = this.f6615a;
        if (s10 == null || ((LinearProgressIndicatorSpec) s10).f6636g != 0 || !isIndeterminate()) {
            super.setProgressCompat(i10, z10);
        }
    }

    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f6615a).a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f6635u);
        m.b bVar;
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f6615a;
        m mVar = new m(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f6636g == 0) {
            bVar = new o(linearProgressIndicatorSpec);
        } else {
            bVar = new r(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new l(context2, linearProgressIndicatorSpec, mVar, bVar));
        Context context3 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f6615a;
        setProgressDrawable(new g(context3, linearProgressIndicatorSpec2, new m(linearProgressIndicatorSpec2)));
    }
}
