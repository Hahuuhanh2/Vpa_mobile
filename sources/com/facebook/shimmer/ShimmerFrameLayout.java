package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.a;
import q5.a;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f5012a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final a f5013b = new a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f5014c = true;

    public ShimmerFrameLayout(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        a.b bVar;
        setWillNotDraw(false);
        this.f5013b.setCallback(this);
        if (attributeSet == null) {
            b(new a.C0055a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShimmerFrameLayout, 0, 0);
        try {
            int i10 = R$styleable.ShimmerFrameLayout_shimmer_colored;
            if (!obtainStyledAttributes.hasValue(i10) || !obtainStyledAttributes.getBoolean(i10, false)) {
                bVar = new a.C0055a();
            } else {
                bVar = new a.c();
            }
            b(bVar.b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b(a aVar) {
        boolean z10;
        PorterDuff.Mode mode;
        q5.a aVar2 = this.f5013b;
        aVar2.f14369f = aVar;
        if (aVar != null) {
            Paint paint = aVar2.f14365b;
            if (aVar2.f14369f.f5030p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        aVar2.b();
        if (aVar2.f14369f != null) {
            ValueAnimator valueAnimator = aVar2.f14368e;
            if (valueAnimator != null) {
                z10 = valueAnimator.isStarted();
                aVar2.f14368e.cancel();
                aVar2.f14368e.removeAllUpdateListeners();
            } else {
                z10 = false;
            }
            a aVar3 = aVar2.f14369f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (aVar3.f5034t / aVar3.f5033s)) + 1.0f});
            aVar2.f14368e = ofFloat;
            ofFloat.setRepeatMode(aVar2.f14369f.f5032r);
            aVar2.f14368e.setRepeatCount(aVar2.f14369f.f5031q);
            ValueAnimator valueAnimator2 = aVar2.f14368e;
            a aVar4 = aVar2.f14369f;
            valueAnimator2.setDuration(aVar4.f5033s + aVar4.f5034t);
            aVar2.f14368e.addUpdateListener(aVar2.f14364a);
            if (z10) {
                aVar2.f14368e.start();
            }
        }
        aVar2.invalidateSelf();
        if (aVar == null || !aVar.f5028n) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f5012a);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f5014c) {
            this.f5013b.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5013b.a();
    }

    public final void onDetachedFromWindow() {
        boolean z10;
        super.onDetachedFromWindow();
        q5.a aVar = this.f5013b;
        ValueAnimator valueAnimator = aVar.f14368e;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar.f14368e.cancel();
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f5013b.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f5013b) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }
}
