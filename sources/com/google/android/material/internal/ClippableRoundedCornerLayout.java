package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Path f6361a;

    /* renamed from: b  reason: collision with root package name */
    public float f6362b;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14) {
        RectF rectF = new RectF(f10, f11, f12, f13);
        if (this.f6361a == null) {
            this.f6361a = new Path();
        }
        this.f6362b = f14;
        this.f6361a.reset();
        this.f6361a.addRoundRect(rectF, f14, f14, Path.Direction.CW);
        this.f6361a.close();
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f6361a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f6361a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.f6362b;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
