package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealGridLayout extends GridLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    public final b f6059a;

    public CircularRevealGridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        this.f6059a.getClass();
    }

    public final void b() {
        this.f6059a.getClass();
    }

    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    public final boolean d() {
        return super.isOpaque();
    }

    public final void draw(Canvas canvas) {
        b bVar = this.f6059a;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f6059a.f6066e;
    }

    public int getCircularRevealScrimColor() {
        return this.f6059a.b();
    }

    public c.d getRevealInfo() {
        return this.f6059a.c();
    }

    public final boolean isOpaque() {
        b bVar = this.f6059a;
        if (bVar != null) {
            return bVar.d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f6059a.e(drawable);
    }

    public void setCircularRevealScrimColor(int i10) {
        this.f6059a.f(i10);
    }

    public void setRevealInfo(c.d dVar) {
        this.f6059a.g(dVar);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6059a = new b(this);
    }
}
