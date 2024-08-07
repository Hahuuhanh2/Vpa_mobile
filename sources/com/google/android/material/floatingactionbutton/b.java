package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton */
public final class b implements ExtendedFloatingActionButton.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.i f6279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f6280b;

    public b(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.f6280b = extendedFloatingActionButton;
        this.f6279a = aVar;
    }

    public final ViewGroup.LayoutParams a() {
        int i10 = this.f6280b.P;
        if (i10 == 0) {
            i10 = -2;
        }
        return new ViewGroup.LayoutParams(-1, i10);
    }

    public final int b() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f6280b;
        int i10 = extendedFloatingActionButton.P;
        if (i10 == -1) {
            if (!(extendedFloatingActionButton.getParent() instanceof View)) {
                return this.f6279a.b();
            }
            View view = (View) this.f6280b.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return this.f6279a.b();
            }
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            int i11 = 0;
            int i12 = paddingBottom + 0;
            if ((this.f6280b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6280b.getLayoutParams()) != null) {
                i11 = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i11) - i12;
        } else if (i10 == 0 || i10 == -2) {
            return this.f6279a.b();
        } else {
            return i10;
        }
    }

    public final int c() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(this.f6280b.getParent() instanceof View)) {
            return this.f6279a.c();
        }
        View view = (View) this.f6280b.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.f6279a.c();
        }
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        int i10 = 0;
        int i11 = paddingRight + 0;
        if ((this.f6280b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6280b.getLayoutParams()) != null) {
            i10 = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i10) - i11;
    }

    public final int getPaddingEnd() {
        return this.f6280b.I;
    }

    public final int getPaddingStart() {
        return this.f6280b.H;
    }
}
