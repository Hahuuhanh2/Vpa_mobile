package u0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f15026a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f15027b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f15028c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f15029d;

    /* renamed from: e  reason: collision with root package name */
    public float f15030e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15031f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15032g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f15033h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f15034i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f15035j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f15036k = PorterDuff.Mode.SRC_IN;

    public b(float f10, ColorStateList colorStateList) {
        this.f15026a = f10;
        this.f15027b = new Paint(5);
        b(colorStateList);
        this.f15028c = new RectF();
        this.f15029d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f15033h = colorStateList;
        this.f15027b.setColor(colorStateList.getColorForState(getState(), this.f15033h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f15028c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f15029d.set(rect);
        if (this.f15031f) {
            float a10 = c.a(this.f15030e, this.f15026a, this.f15032g);
            float f10 = this.f15030e;
            float f11 = this.f15026a;
            if (this.f15032g) {
                f10 = (float) (((1.0d - c.f15037a) * ((double) f11)) + ((double) f10));
            }
            this.f15029d.inset((int) Math.ceil((double) f10), (int) Math.ceil((double) a10));
            this.f15028c.set(this.f15029d);
        }
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f15027b;
        if (this.f15034i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f15034i);
            z10 = true;
        }
        RectF rectF = this.f15028c;
        float f10 = this.f15026a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f15029d, this.f15026a);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f15035j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f15033h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f15033h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f15027b.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f15027b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f15035j;
        if (colorStateList2 == null || (mode = this.f15036k) == null) {
            return z10;
        }
        this.f15034i = a(colorStateList2, mode);
        return true;
    }

    public final void setAlpha(int i10) {
        this.f15027b.setAlpha(i10);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15027b.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f15035j = colorStateList;
        this.f15034i = a(colorStateList, this.f15036k);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15036k = mode;
        this.f15034i = a(this.f15035j, mode);
        invalidateSelf();
    }
}
