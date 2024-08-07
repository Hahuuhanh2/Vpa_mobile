package e8;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import l8.h;
import l8.m;
import l8.n;
import n1.d;

/* compiled from: BorderDrawable */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final n f9245a = n.a.f12861a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f9246b;

    /* renamed from: c  reason: collision with root package name */
    public final Path f9247c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f9248d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f9249e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final RectF f9250f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final a f9251g = new a();

    /* renamed from: h  reason: collision with root package name */
    public float f9252h;

    /* renamed from: i  reason: collision with root package name */
    public int f9253i;

    /* renamed from: j  reason: collision with root package name */
    public int f9254j;

    /* renamed from: k  reason: collision with root package name */
    public int f9255k;

    /* renamed from: l  reason: collision with root package name */
    public int f9256l;

    /* renamed from: m  reason: collision with root package name */
    public int f9257m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9258n = true;

    /* renamed from: o  reason: collision with root package name */
    public m f9259o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f9260p;

    /* compiled from: BorderDrawable */
    public class a extends Drawable.ConstantState {
        public a() {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return b.this;
        }
    }

    public b(m mVar) {
        this.f9259o = mVar;
        Paint paint = new Paint(1);
        this.f9246b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final RectF a() {
        this.f9250f.set(getBounds());
        return this.f9250f;
    }

    public final void draw(Canvas canvas) {
        if (this.f9258n) {
            Paint paint = this.f9246b;
            Rect rect = this.f9248d;
            copyBounds(rect);
            float height = this.f9252h / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{d.c(this.f9253i, this.f9257m), d.c(this.f9254j, this.f9257m), d.c(d.d(this.f9254j, 0), this.f9257m), d.c(d.d(this.f9256l, 0), this.f9257m), d.c(this.f9256l, this.f9257m), d.c(this.f9255k, this.f9257m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f9258n = false;
        }
        float strokeWidth = this.f9246b.getStrokeWidth() / 2.0f;
        copyBounds(this.f9248d);
        this.f9249e.set(this.f9248d);
        float min = Math.min(this.f9259o.f12829e.a(a()), this.f9249e.width() / 2.0f);
        if (this.f9259o.f(a())) {
            this.f9249e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f9249e, min, min, this.f9246b);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f9251g;
    }

    public final int getOpacity() {
        if (this.f9252h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f9259o.f(a())) {
            outline.setRoundRect(getBounds(), this.f9259o.f12829e.a(a()));
            return;
        }
        copyBounds(this.f9248d);
        this.f9249e.set(this.f9248d);
        this.f9245a.a(this.f9259o, 1.0f, this.f9249e, (h.a) null, this.f9247c);
        Path path = this.f9247c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f9259o.f(a())) {
            return true;
        }
        int round = Math.round(this.f9252h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f9260p;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        this.f9258n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f9260p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f9257m)) == this.f9257m)) {
            this.f9258n = true;
            this.f9257m = colorForState;
        }
        if (this.f9258n) {
            invalidateSelf();
        }
        return this.f9258n;
    }

    public final void setAlpha(int i10) {
        this.f9246b.setAlpha(i10);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9246b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
