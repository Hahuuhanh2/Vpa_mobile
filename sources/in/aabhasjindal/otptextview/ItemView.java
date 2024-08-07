package in.aabhasjindal.otptextview;

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
import m1.e;
import m9.b;
import sk.j;

/* compiled from: ItemView.kt */
public final class ItemView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f20682a;

    /* renamed from: b  reason: collision with root package name */
    public View f20683b;

    /* renamed from: c  reason: collision with root package name */
    public int f20684c;

    /* renamed from: d  reason: collision with root package name */
    public int f20685d;

    /* renamed from: e  reason: collision with root package name */
    public int f20686e;

    /* renamed from: f  reason: collision with root package name */
    public int f20687f;

    /* renamed from: n  reason: collision with root package name */
    public int f20688n;

    /* renamed from: o  reason: collision with root package name */
    public int f20689o;

    /* renamed from: p  reason: collision with root package name */
    public int f20690p;

    /* renamed from: q  reason: collision with root package name */
    public int f20691q;

    /* renamed from: r  reason: collision with root package name */
    public int f20692r;

    /* renamed from: s  reason: collision with root package name */
    public int f20693s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20694t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context) {
        super(context);
        j.g(context, "context");
        a((AttributeSet) null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void a(AttributeSet attributeSet) {
        float f10;
        float f11;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OtpTextView);
        j.b(obtainStyledAttributes, "styles");
        Context context = getContext();
        j.b(context, "context");
        Resources resources = context.getResources();
        j.b(resources, "r");
        Context context2 = getContext();
        j.b(context2, "context");
        Resources resources2 = context2.getResources();
        j.b(resources2, "r");
        int i10 = R$styleable.OtpTextView_android_textColor;
        Context context3 = getContext();
        j.b(context3, "context");
        Resources resources3 = context3.getResources();
        int i11 = R$color.black;
        ThreadLocal<TypedValue> threadLocal = e.f13062a;
        int color = obtainStyledAttributes.getColor(i10, e.b.a(resources3, i11, (Resources.Theme) null));
        float dimension = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_bar_height, (float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        int i12 = R$styleable.OtpTextView_bar_margin;
        Context context4 = getContext();
        j.b(context4, "context");
        float dimension2 = obtainStyledAttributes.getDimension(i12, (float) b.C(context4, 0));
        float f12 = (float) 2;
        float dimension3 = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_bar_margin_bottom, f12);
        float dimension4 = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_bar_margin_right, f12);
        float dimension5 = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_bar_margin_left, f12);
        float dimension6 = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_bar_margin_top, f12);
        this.f20694t = obtainStyledAttributes.getBoolean(R$styleable.OtpTextView_hide_otp, false);
        this.f20692r = obtainStyledAttributes.getResourceId(R$styleable.OtpTextView_hide_otp_drawable, R$drawable.bg_pin);
        Context context5 = getContext();
        j.b(context5, "context");
        Resources resources4 = context5.getResources();
        int i13 = R$color.transparent;
        this.f20693s = e.b.a(resources4, i13, (Resources.Theme) null);
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.OtpTextView_bar_enabled, false);
        float dimension7 = obtainStyledAttributes.getDimension(R$styleable.OtpTextView_otp_text_size, (float) ((int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics())));
        String string = obtainStyledAttributes.getString(R$styleable.OtpTextView_text_typeface);
        int i14 = R$styleable.OtpTextView_otp_box_background;
        Context context6 = getContext();
        j.b(context6, "context");
        float f13 = dimension6;
        int resourceId = obtainStyledAttributes.getResourceId(i14, e.b.a(context6.getResources(), i13, (Resources.Theme) null));
        this.f20688n = obtainStyledAttributes.getResourceId(R$styleable.OtpTextView_otp_box_background_active, resourceId);
        this.f20689o = obtainStyledAttributes.getResourceId(R$styleable.OtpTextView_otp_box_background_inactive, resourceId);
        this.f20690p = obtainStyledAttributes.getResourceId(R$styleable.OtpTextView_otp_box_background_success, resourceId);
        this.f20691q = obtainStyledAttributes.getResourceId(R$styleable.OtpTextView_otp_box_background_error, resourceId);
        int i15 = R$styleable.OtpTextView_bar_active_color;
        Context context7 = getContext();
        j.b(context7, "context");
        this.f20684c = obtainStyledAttributes.getColor(i15, e.b.a(context7.getResources(), i11, (Resources.Theme) null));
        int i16 = R$styleable.OtpTextView_bar_inactive_color;
        Context context8 = getContext();
        j.b(context8, "context");
        float f14 = dimension3;
        this.f20685d = obtainStyledAttributes.getColor(i16, e.b.a(context8.getResources(), R$color.grey, (Resources.Theme) null));
        int i17 = R$styleable.OtpTextView_bar_error_color;
        Context context9 = getContext();
        j.b(context9, "context");
        this.f20686e = obtainStyledAttributes.getColor(i17, e.b.a(context9.getResources(), R$color.red, (Resources.Theme) null));
        int i18 = R$styleable.OtpTextView_bar_success_color;
        Context context10 = getContext();
        j.b(context10, "context");
        this.f20687f = obtainStyledAttributes.getColor(i18, e.b.a(context10.getResources(), i11, (Resources.Theme) null));
        setBackgroundResource(resourceId);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.f20682a = textView;
        textView.setGravity(17);
        if (string != null) {
            try {
                Context context11 = getContext();
                j.b(context11, "context");
                Typeface createFromAsset = Typeface.createFromAsset(context11.getAssets(), string);
                TextView textView2 = this.f20682a;
                if (textView2 != null) {
                    textView2.setTypeface(createFromAsset);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        TextView textView3 = this.f20682a;
        if (textView3 != null) {
            textView3.setTextColor(color);
        }
        TextView textView4 = this.f20682a;
        if (textView4 != null) {
            textView4.setTextSize(0, dimension7);
        }
        addView(this.f20682a, layoutParams);
        if (z10) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) dimension);
            layoutParams2.gravity = 80;
            if (dimension2 != 0.0f) {
                f11 = dimension2;
                f10 = f11;
                dimension4 = f10;
            } else {
                dimension2 = dimension5;
                f11 = f14;
                f10 = f13;
            }
            layoutParams2.leftMargin = (int) dimension2;
            layoutParams2.rightMargin = (int) dimension4;
            layoutParams2.bottomMargin = (int) f11;
            layoutParams2.topMargin = (int) f10;
            View view = new View(getContext());
            this.f20683b = view;
            addView(view, layoutParams2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setText(String str) {
        j.g(str, "value");
        if (!this.f20694t) {
            TextView textView = this.f20682a;
            if (textView != null && textView != null) {
                textView.setText(str);
                return;
            }
            return;
        }
        TextView textView2 = this.f20682a;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (j.a(str, "")) {
            TextView textView3 = this.f20682a;
            if (textView3 != null) {
                textView3.setBackgroundResource(this.f20693s);
                return;
            }
            return;
        }
        TextView textView4 = this.f20682a;
        if (textView4 != null) {
            textView4.setBackgroundResource(this.f20692r);
        }
    }

    public final void setViewState(int i10) {
        if (i10 == -1) {
            View view = this.f20683b;
            if (view != null) {
                view.setBackgroundColor(this.f20686e);
            }
            setBackgroundResource(this.f20691q);
        } else if (i10 == 0) {
            View view2 = this.f20683b;
            if (view2 != null) {
                view2.setBackgroundColor(this.f20685d);
            }
            setBackgroundResource(this.f20689o);
        } else if (i10 == 1) {
            View view3 = this.f20683b;
            if (view3 != null) {
                view3.setBackgroundColor(this.f20684c);
            }
            setBackgroundResource(this.f20688n);
        } else if (i10 == 2) {
            View view4 = this.f20683b;
            if (view4 != null) {
                view4.setBackgroundColor(this.f20687f);
            }
            setBackgroundResource(this.f20690p);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        a(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.g(context, "context");
        a(attributeSet);
    }
}
