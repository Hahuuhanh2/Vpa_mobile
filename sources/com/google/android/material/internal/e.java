package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: FadeThroughDrawable */
public final class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f6435a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f6436b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f6437c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    public float f6438d;

    public e(Drawable drawable, Drawable drawable2) {
        this.f6435a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f6436b = mutate;
        mutate.setAlpha(0);
    }

    public final void a(float f10) {
        if (this.f6438d != f10) {
            this.f6438d = f10;
            float[] fArr = this.f6437c;
            if (f10 <= 0.5f) {
                fArr[0] = 1.0f - (f10 * 2.0f);
                fArr[1] = 0.0f;
            } else {
                fArr[0] = 0.0f;
                fArr[1] = (f10 * 2.0f) - 1.0f;
            }
            this.f6435a.setAlpha((int) (fArr[0] * 255.0f));
            this.f6436b.setAlpha((int) (this.f6437c[1] * 255.0f));
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f6435a.draw(canvas);
        this.f6436b.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f6435a.getIntrinsicHeight(), this.f6436b.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f6435a.getIntrinsicWidth(), this.f6436b.getIntrinsicWidth());
    }

    public final int getMinimumHeight() {
        return Math.max(this.f6435a.getMinimumHeight(), this.f6436b.getMinimumHeight());
    }

    public final int getMinimumWidth() {
        return Math.max(this.f6435a.getMinimumWidth(), this.f6436b.getMinimumWidth());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        if (this.f6435a.isStateful() || this.f6436b.isStateful()) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i10) {
        if (this.f6438d <= 0.5f) {
            this.f6435a.setAlpha(i10);
            this.f6436b.setAlpha(0);
        } else {
            this.f6435a.setAlpha(0);
            this.f6436b.setAlpha(i10);
        }
        invalidateSelf();
    }

    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f6435a.setBounds(i10, i11, i12, i13);
        this.f6436b.setBounds(i10, i11, i12, i13);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6435a.setColorFilter(colorFilter);
        this.f6436b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setState(int[] iArr) {
        boolean state = this.f6435a.setState(iArr);
        boolean state2 = this.f6436b.setState(iArr);
        if (state || state2) {
            return true;
        }
        return false;
    }
}
