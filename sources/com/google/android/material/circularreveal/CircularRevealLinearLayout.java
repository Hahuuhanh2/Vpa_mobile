package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.c;

public class CircularRevealLinearLayout extends LinearLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    public final b f6060a;

    public CircularRevealLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        this.f6060a.getClass();
    }

    public final void b() {
        this.f6060a.getClass();
    }

    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    public final boolean d() {
        return super.isOpaque();
    }

    public final void draw(Canvas canvas) {
        b bVar = this.f6060a;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f6060a.f6066e;
    }

    public int getCircularRevealScrimColor() {
        return this.f6060a.b();
    }

    public c.d getRevealInfo() {
        return this.f6060a.c();
    }

    public final boolean isOpaque() {
        b bVar = this.f6060a;
        if (bVar != null) {
            return bVar.d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f6060a.e(drawable);
    }

    public void setCircularRevealScrimColor(int i10) {
        this.f6060a.f(i10);
    }

    public void setRevealInfo(c.d dVar) {
        this.f6060a.g(dVar);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6060a = new b(this);
    }
}
