package com.google.android.material.carousel;

import al.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c0.i0;
import l8.m;
import l8.q;
import l8.r;
import l8.s;
import l8.t;
import t7.b;
import x7.g;
import x7.i;

public class MaskableFrameLayout extends FrameLayout implements g, q {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5955f = 0;

    /* renamed from: a  reason: collision with root package name */
    public float f5956a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f5957b;

    /* renamed from: c  reason: collision with root package name */
    public m f5958c;

    /* renamed from: d  reason: collision with root package name */
    public final r f5959d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f5960e;

    public MaskableFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void b() {
        if (this.f5956a != -1.0f) {
            float a10 = b.a(0.0f, ((float) getWidth()) / 2.0f, 0.0f, 1.0f, this.f5956a);
            setMaskRectF(new RectF(a10, 0.0f, ((float) getWidth()) - a10, (float) getHeight()));
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.f5959d;
        if (!rVar.b() || rVar.f12892e.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(rVar.f12892e);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.f5957b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.f5957b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f5956a;
    }

    public m getShapeAppearanceModel() {
        return this.f5958c;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f5960e;
        if (bool != null) {
            r rVar = this.f5959d;
            boolean booleanValue = bool.booleanValue();
            if (booleanValue != rVar.f12888a) {
                rVar.f12888a = booleanValue;
                rVar.a(this);
            }
        }
    }

    public final void onDetachedFromWindow() {
        this.f5960e = Boolean.valueOf(this.f5959d.f12888a);
        r rVar = this.f5959d;
        if (true != rVar.f12888a) {
            rVar.f12888a = true;
            rVar.a(this);
        }
        super.onDetachedFromWindow();
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f5956a != -1.0f) {
            b();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5957b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f5957b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z10) {
        r rVar = this.f5959d;
        if (z10 != rVar.f12888a) {
            rVar.f12888a = z10;
            rVar.a(this);
        }
    }

    public void setMaskRectF(RectF rectF) {
        this.f5957b.set(rectF);
        r rVar = this.f5959d;
        rVar.f12891d = this.f5957b;
        rVar.c();
        rVar.a(this);
    }

    @Deprecated
    public void setMaskXPercentage(float f10) {
        float F = g0.F(f10, 0.0f, 1.0f);
        if (this.f5956a != F) {
            this.f5956a = F;
            b();
        }
    }

    public void setOnMaskChangedListener(i iVar) {
    }

    public void setShapeAppearanceModel(m mVar) {
        m h10 = mVar.h(new i0(6));
        this.f5958c = h10;
        r rVar = this.f5959d;
        rVar.f12890c = h10;
        rVar.c();
        rVar.a(this);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r rVar;
        this.f5956a = -1.0f;
        this.f5957b = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            rVar = new t(this);
        } else {
            rVar = new s(this);
        }
        this.f5959d = rVar;
        this.f5960e = null;
        setShapeAppearanceModel(new m(m.c(context, attributeSet, i10, 0)));
    }
}
