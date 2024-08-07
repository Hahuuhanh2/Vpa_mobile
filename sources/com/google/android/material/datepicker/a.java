package com.google.android.material.datepicker;

import al.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.R$styleable;
import i8.c;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import w1.d0;
import w1.q0;

/* compiled from: CalendarItemStyle */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6110a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f6111b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f6112c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f6113d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6114e;

    /* renamed from: f  reason: collision with root package name */
    public final m f6115f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, m mVar, Rect rect) {
        g0.B(rect.left);
        g0.B(rect.top);
        g0.B(rect.right);
        g0.B(rect.bottom);
        this.f6110a = rect;
        this.f6111b = colorStateList2;
        this.f6112c = colorStateList;
        this.f6113d = colorStateList3;
        this.f6114e = i10;
        this.f6115f = mVar;
    }

    public static a a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.y("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        m mVar = new m(m.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)));
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, mVar, rect);
    }

    public final void b(TextView textView) {
        h hVar = new h();
        h hVar2 = new h();
        hVar.setShapeAppearanceModel(this.f6115f);
        hVar2.setShapeAppearanceModel(this.f6115f);
        hVar.n(this.f6112c);
        ColorStateList colorStateList = this.f6113d;
        hVar.t((float) this.f6114e);
        hVar.s(colorStateList);
        textView.setTextColor(this.f6111b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f6111b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f6110a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(textView, insetDrawable);
    }
}
