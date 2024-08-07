package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton */
public final class a implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f6278a;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.f6278a = extendedFloatingActionButton;
    }

    public final ViewGroup.LayoutParams a() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public final int b() {
        return this.f6278a.getMeasuredHeight();
    }

    public final int c() {
        int measuredWidth = this.f6278a.getMeasuredWidth() - (this.f6278a.getCollapsedPadding() * 2);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6278a;
        return measuredWidth + extendedFloatingActionButton.H + extendedFloatingActionButton.I;
    }

    public final int getPaddingEnd() {
        return this.f6278a.I;
    }

    public final int getPaddingStart() {
        return this.f6278a.H;
    }
}
