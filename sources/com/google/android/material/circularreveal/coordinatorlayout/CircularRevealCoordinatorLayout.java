package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {
    public final b F;

    public CircularRevealCoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        this.F.getClass();
    }

    public final void b() {
        this.F.getClass();
    }

    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    public final boolean d() {
        return super.isOpaque();
    }

    public final void draw(Canvas canvas) {
        b bVar = this.F;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.F.f6066e;
    }

    public int getCircularRevealScrimColor() {
        return this.F.b();
    }

    public c.d getRevealInfo() {
        return this.F.c();
    }

    public final boolean isOpaque() {
        b bVar = this.F;
        if (bVar != null) {
            return bVar.d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.F.e(drawable);
    }

    public void setCircularRevealScrimColor(int i10) {
        this.F.f(i10);
    }

    public void setRevealInfo(c.d dVar) {
        this.F.g(dVar);
    }

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = new b(this);
    }
}
