package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R$styleable;

public class ForegroundLinearLayout extends LinearLayoutCompat {
    public boolean A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f6367w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f6368x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f6369y;

    /* renamed from: z  reason: collision with root package name */
    public int f6370z;

    public ForegroundLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6367w;
        if (drawable != null) {
            if (this.B) {
                this.B = false;
                Rect rect = this.f6368x;
                Rect rect2 = this.f6369y;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f6370z, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f6367w;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6367w;
        if (drawable != null && drawable.isStateful()) {
            this.f6367w.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f6367w;
    }

    public int getForegroundGravity() {
        return this.f6370z;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6367w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.B = z10 | this.B;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.B = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6367w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f6367w);
            }
            this.f6367w = drawable;
            this.B = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f6370z == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f6370z != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f6370z = i10;
            if (i10 == 119 && this.f6367w != null) {
                this.f6367w.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f6367w) {
            return true;
        }
        return false;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6368x = new Rect();
        this.f6369y = new Rect();
        this.f6370z = 119;
        this.A = true;
        this.B = false;
        TypedArray d10 = u.d(context, attributeSet, R$styleable.ForegroundLinearLayout, i10, 0, new int[0]);
        this.f6370z = d10.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f6370z);
        Drawable drawable = d10.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A = d10.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        d10.recycle();
    }
}
