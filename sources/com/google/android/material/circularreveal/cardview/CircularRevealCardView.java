package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

public class CircularRevealCardView extends MaterialCardView implements c {

    /* renamed from: w  reason: collision with root package name */
    public final b f6074w;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        this.f6074w.getClass();
    }

    public final void b() {
        this.f6074w.getClass();
    }

    public final void c(Canvas canvas) {
        super.draw(canvas);
    }

    public final boolean d() {
        return super.isOpaque();
    }

    public final void draw(Canvas canvas) {
        b bVar = this.f6074w;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f6074w.f6066e;
    }

    public int getCircularRevealScrimColor() {
        return this.f6074w.b();
    }

    public c.d getRevealInfo() {
        return this.f6074w.c();
    }

    public final boolean isOpaque() {
        b bVar = this.f6074w;
        if (bVar != null) {
            return bVar.d();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f6074w.e(drawable);
    }

    public void setCircularRevealScrimColor(int i10) {
        this.f6074w.f(i10);
    }

    public void setRevealInfo(c.d dVar) {
        this.f6074w.g(dVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6074w = new b(this);
    }
}
