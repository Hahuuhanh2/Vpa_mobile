package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$styleable;
import h.a;

public class TabItem extends View {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f6873a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f6874b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6875c;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabItem);
        this.f6873a = obtainStyledAttributes.getText(R$styleable.TabItem_android_text);
        int i10 = R$styleable.TabItem_android_icon;
        if (!obtainStyledAttributes.hasValue(i10) || (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i10);
        } else {
            drawable = a.a(context, resourceId);
        }
        this.f6874b = drawable;
        this.f6875c = obtainStyledAttributes.getResourceId(R$styleable.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
