package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import l8.h;
import l8.m;

/* compiled from: CutoutDrawable */
public class g extends h {
    public static final /* synthetic */ int G = 0;
    public a F;

    @TargetApi(18)
    /* compiled from: CutoutDrawable */
    public static class b extends g {
        public b(a aVar) {
            super(aVar);
        }

        public final void g(Canvas canvas) {
            if (this.F.f7030v.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.F.f7030v);
            } else {
                canvas.clipRect(this.F.f7030v, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public g(a aVar) {
        super((h.b) aVar);
        this.F = aVar;
    }

    public final Drawable mutate() {
        this.F = new a(this.F);
        return this;
    }

    public final void x(float f10, float f11, float f12, float f13) {
        RectF rectF = this.F.f7030v;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* compiled from: CutoutDrawable */
    public static final class a extends h.b {

        /* renamed from: v  reason: collision with root package name */
        public final RectF f7030v;

        public a(m mVar, RectF rectF) {
            super(mVar);
            this.f7030v = rectF;
        }

        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super((h.b) aVar);
            this.f7030v = aVar.f7030v;
        }
    }
}
