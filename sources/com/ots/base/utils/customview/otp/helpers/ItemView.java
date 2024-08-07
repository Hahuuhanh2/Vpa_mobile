package com.ots.base.utils.customview.otp.helpers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import in.aabhasjindal.otptextview.R$color;
import in.aabhasjindal.otptextview.R$drawable;
import in.aabhasjindal.otptextview.R$styleable;
import k1.a;
import m1.e;
import sk.j;

/* compiled from: ItemView.kt */
public final class ItemView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f8312a;

    /* renamed from: b  reason: collision with root package name */
    public View f8313b;

    /* renamed from: c  reason: collision with root package name */
    public int f8314c;

    /* renamed from: d  reason: collision with root package name */
    public int f8315d;

    /* renamed from: e  reason: collision with root package name */
    public int f8316e;

    /* renamed from: f  reason: collision with root package name */
    public int f8317f;

    /* renamed from: n  reason: collision with root package name */
    public int f8318n;

    /* renamed from: o  reason: collision with root package name */
    public int f8319o;

    /* renamed from: p  reason: collision with root package name */
    public int f8320p;

    /* renamed from: q  reason: collision with root package name */
    public int f8321q;

    /* renamed from: r  reason: collision with root package name */
    public int f8322r;

    /* renamed from: s  reason: collision with root package name */
    public int f8323s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8324t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context) {
        super(context);
        j.f(context, "context");
        a((AttributeSet) null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void a(AttributeSet attributeSet) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OtpTextView);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Context context = getContext();
        j.e(context, "getContext(...)");
        Context context2 = getContext();
        j.e(context2, "getContext(...)");
        Resources resources = getContext().getResources();
        ThreadLocal<TypedValue> threadLocal = e.f13062a;
        int color = obtainStyledAttributes.getColor(0, e.b.a(resources, 2131099692, (Resources.Theme) null));
        float dimension = obtainStyledAttributes.getDimension(4, (float) ((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics())));
        Context context3 = getContext();
        j.e(context3, "getContext(...)");
        float dimension2 = obtainStyledAttributes.getDimension(6, (float) ((int) TypedValue.applyDimension(1, (float) 0, context3.getResources().getDisplayMetrics())));
        float dimension3 = obtainStyledAttributes.getDimension(7, 2.0f);
        float dimension4 = obtainStyledAttributes.getDimension(9, 2.0f);
        float dimension5 = obtainStyledAttributes.getDimension(8, 2.0f);
        float dimension6 = obtainStyledAttributes.getDimension(10, 2.0f);
        this.f8324t = obtainStyledAttributes.getBoolean(18, false);
        this.f8322r = obtainStyledAttributes.getResourceId(19, R$drawable.bg_pin);
        this.f8323s = e.b.a(getContext().getResources(), 2131100623, (Resources.Theme) null);
        boolean z11 = obtainStyledAttributes.getBoolean(2, false);
        float dimension7 = obtainStyledAttributes.getDimension(27, (float) ((int) TypedValue.applyDimension(1, 24.0f, context2.getResources().getDisplayMetrics())));
        String string = obtainStyledAttributes.getString(28);
        int resourceId = obtainStyledAttributes.getResourceId(22, a.getColor(getContext(), 2131100623));
        this.f8318n = obtainStyledAttributes.getResourceId(23, resourceId);
        this.f8319o = obtainStyledAttributes.getResourceId(25, resourceId);
        this.f8320p = obtainStyledAttributes.getResourceId(26, resourceId);
        this.f8321q = obtainStyledAttributes.getResourceId(24, resourceId);
        this.f8314c = obtainStyledAttributes.getColor(1, e.b.a(getContext().getResources(), 2131099692, (Resources.Theme) null));
        this.f8315d = obtainStyledAttributes.getColor(5, e.b.a(getContext().getResources(), R$color.grey, (Resources.Theme) null));
        this.f8316e = obtainStyledAttributes.getColor(3, e.b.a(getContext().getResources(), R$color.red, (Resources.Theme) null));
        this.f8317f = obtainStyledAttributes.getColor(11, e.b.a(getContext().getResources(), 2131099692, (Resources.Theme) null));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.f8312a = textView;
        textView.setGravity(17);
        if (string != null) {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(getContext().getAssets(), string);
                TextView textView2 = this.f8312a;
                if (textView2 != null) {
                    textView2.setTypeface(createFromAsset);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        TextView textView3 = this.f8312a;
        if (textView3 != null) {
            textView3.setTextColor(color);
        }
        TextView textView4 = this.f8312a;
        if (textView4 != null) {
            textView4.setTextSize(0, dimension7);
        }
        addView(this.f8312a, layoutParams);
        if (z11) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                dimension6 = dimension2;
                dimension3 = dimension6;
                dimension4 = dimension3;
            } else {
                dimension2 = dimension5;
            }
            layoutParams2.leftMargin = (int) dimension2;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) dimension3;
            layoutParams2.topMargin = (int) dimension6;
            View view = new View(getContext());
            this.f8313b = view;
            addView(view, layoutParams2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setText(String str) {
        j.f(str, "value");
        if (!this.f8324t) {
            TextView textView = this.f8312a;
            if (textView != null && textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = this.f8312a;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (j.a(str, "")) {
            TextView textView3 = this.f8312a;
            if (textView3 != null) {
                textView3.setBackgroundResource(this.f8323s);
                return;
            }
            return;
        }
        TextView textView4 = this.f8312a;
        if (textView4 != null) {
            textView4.setBackgroundResource(this.f8322r);
        }
    }

    public final void setViewState(int i10) {
        if (i10 == -1) {
            View view = this.f8313b;
            if (view != null) {
                view.setBackgroundColor(this.f8316e);
            }
            setBackgroundResource(this.f8321q);
        } else if (i10 == 0) {
            View view2 = this.f8313b;
            if (view2 != null) {
                view2.setBackgroundColor(this.f8315d);
            }
            setBackgroundResource(this.f8319o);
        } else if (i10 == 1) {
            View view3 = this.f8313b;
            if (view3 != null) {
                view3.setBackgroundColor(this.f8314c);
            }
            setBackgroundResource(this.f8318n);
        } else if (i10 == 2) {
            View view4 = this.f8313b;
            if (view4 != null) {
                view4.setBackgroundColor(this.f8317f);
            }
            setBackgroundResource(this.f8320p);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        a(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        a(attributeSet);
    }
}
