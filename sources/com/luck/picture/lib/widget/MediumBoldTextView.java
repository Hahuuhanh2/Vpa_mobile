package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.luck.picture.lib.R$styleable;

public class MediumBoldTextView extends AppCompatTextView {

    /* renamed from: o  reason: collision with root package name */
    public float f8144o;

    public MediumBoldTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f10 = this.f8144o;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }

    public void setStrokeWidth(float f10) {
        this.f8144o = f10;
        invalidate();
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8144o = 0.6f;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureMediumBoldTextView, i10, 0);
        this.f8144o = obtainStyledAttributes.getFloat(R$styleable.PictureMediumBoldTextView_stroke_Width, this.f8144o);
        obtainStyledAttributes.recycle();
    }
}
