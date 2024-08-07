package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import n1.e;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f6372a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f6373b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f6374c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6375d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6376e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6377f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6378n;

    public class a implements q {
        public a() {
        }

        public final w0 g(View view, w0 w0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f6373b == null) {
                scrimInsetsFrameLayout.f6373b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f6373b.set(w0Var.c(), w0Var.e(), w0Var.d(), w0Var.b());
            ScrimInsetsFrameLayout.this.e(w0Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z10 = true;
            if ((!w0Var.f16391a.j().equals(e.f13426e)) && ScrimInsetsFrameLayout.this.f6372a != null) {
                z10 = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z10);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(scrimInsetsFrameLayout3);
            return w0Var.f16391a.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f6373b != null && this.f6372a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f6375d) {
                this.f6374c.set(0, 0, width, this.f6373b.top);
                this.f6372a.setBounds(this.f6374c);
                this.f6372a.draw(canvas);
            }
            if (this.f6376e) {
                this.f6374c.set(0, height - this.f6373b.bottom, width, height);
                this.f6372a.setBounds(this.f6374c);
                this.f6372a.draw(canvas);
            }
            if (this.f6377f) {
                Rect rect = this.f6374c;
                Rect rect2 = this.f6373b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f6372a.setBounds(this.f6374c);
                this.f6372a.draw(canvas);
            }
            if (this.f6378n) {
                Rect rect3 = this.f6374c;
                Rect rect4 = this.f6373b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f6372a.setBounds(this.f6374c);
                this.f6372a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void e(w0 w0Var) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f6372a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f6372a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f6376e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f6377f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f6378n = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f6375d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f6372a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6374c = new Rect();
        this.f6375d = true;
        this.f6376e = true;
        this.f6377f = true;
        this.f6378n = true;
        TypedArray d10 = u.d(context, attributeSet, R$styleable.ScrimInsetsFrameLayout, i10, R$style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f6372a = d10.getDrawable(R$styleable.ScrimInsetsFrameLayout_insetForeground);
        d10.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(this, aVar);
    }
}
