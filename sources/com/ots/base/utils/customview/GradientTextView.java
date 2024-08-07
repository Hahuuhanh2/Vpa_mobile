package com.ots.base.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ots.core.R$font;
import com.vpa.daugia.C0529R$color;
import com.vpa.daugia.R$styleable;
import m1.e;
import sk.j;

/* compiled from: GradientTextView.kt */
public final class GradientTextView extends AppCompatTextView {

    /* renamed from: o  reason: collision with root package name */
    public int f8258o = getContext().getColor(C0529R$color.start_color);

    /* renamed from: p  reason: collision with root package name */
    public int f8259p = getContext().getColor(C0529R$color.end_color);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientTextView(Context context) {
        super(context);
        j.f(context, "context");
        l();
    }

    public final void l() {
        TextPaint paint = getPaint();
        j.e(paint, "getPaint(...)");
        paint.setShader(new LinearGradient(0.0f, 0.0f, paint.measureText(getText().toString()), getTextSize(), this.f8258o, this.f8259p, Shader.TileMode.CLAMP));
    }

    public final void m(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.GradientTextView);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f8258o = obtainStyledAttributes.getColor(1, getContext().getColor(C0529R$color.start_color));
        this.f8259p = obtainStyledAttributes.getColor(0, getContext().getColor(C0529R$color.end_color));
        setTypeface(e.a(getContext(), R$font.sf_pro_display));
        obtainStyledAttributes.recycle();
    }

    public final void setEndColor(int i10) {
        this.f8259p = i10;
        invalidate();
    }

    public final void setStartColor(int i10) {
        this.f8258o = i10;
        invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        m(attributeSet);
        l();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        m(attributeSet);
        l();
    }
}
