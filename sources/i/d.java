package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import o1.a;

/* compiled from: DrawerArrowDrawable */
public final class d extends Drawable {

    /* renamed from: l  reason: collision with root package name */
    public static final float f10880l = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f10881a;

    /* renamed from: b  reason: collision with root package name */
    public float f10882b;

    /* renamed from: c  reason: collision with root package name */
    public float f10883c;

    /* renamed from: d  reason: collision with root package name */
    public float f10884d;

    /* renamed from: e  reason: collision with root package name */
    public float f10885e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10886f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f10887g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final int f10888h;

    /* renamed from: i  reason: collision with root package name */
    public float f10889i;

    /* renamed from: j  reason: collision with root package name */
    public float f10890j;

    /* renamed from: k  reason: collision with root package name */
    public int f10891k = 2;

    public d(Context context) {
        Paint paint = new Paint();
        this.f10881a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, R$styleable.DrawerArrowToggle, R$attr.drawerArrowStyle, R$style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(R$styleable.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f10890j = (float) (Math.cos((double) f10880l) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.DrawerArrowToggle_spinBars, true);
        if (this.f10886f != z10) {
            this.f10886f = z10;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (round != this.f10885e) {
            this.f10885e = round;
            invalidateSelf();
        }
        this.f10888h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DrawerArrowToggle_drawableSize, 0);
        this.f10883c = (float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f10882b = (float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f10884d = obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i11 = this.f10891k;
        boolean z10 = true;
        if (i11 == 0 || (i11 != 1 && (i11 == 3 ? a.c.a(this) != 0 : a.c.a(this) != 1))) {
            z10 = false;
        }
        float f12 = this.f10882b;
        float sqrt = (float) Math.sqrt((double) (f12 * f12 * 2.0f));
        float f13 = this.f10883c;
        float f14 = this.f10889i;
        float e10 = android.support.v4.media.a.e(sqrt, f13, f14, f13);
        float e11 = android.support.v4.media.a.e(this.f10884d, f13, f14, f13);
        float round = (float) Math.round(((this.f10890j - 0.0f) * f14) + 0.0f);
        float f15 = f10880l;
        float f16 = this.f10889i;
        float e12 = android.support.v4.media.a.e(f15, 0.0f, f16, 0.0f);
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = -180.0f;
        }
        if (z10) {
            f11 = 180.0f;
        } else {
            f11 = 0.0f;
        }
        float e13 = android.support.v4.media.a.e(f11, f10, f16, f10);
        double d10 = (double) e10;
        double d11 = (double) e12;
        boolean z11 = z10;
        float round2 = (float) Math.round(Math.cos(d11) * d10);
        float round3 = (float) Math.round(Math.sin(d11) * d10);
        this.f10887g.rewind();
        float strokeWidth = this.f10881a.getStrokeWidth() + this.f10885e;
        float e14 = android.support.v4.media.a.e(-this.f10890j, strokeWidth, this.f10889i, strokeWidth);
        float f17 = (-e11) / 2.0f;
        this.f10887g.moveTo(f17 + round, 0.0f);
        this.f10887g.rLineTo(e11 - (round * 2.0f), 0.0f);
        this.f10887g.moveTo(f17, e14);
        this.f10887g.rLineTo(round2, round3);
        this.f10887g.moveTo(f17, -e14);
        this.f10887g.rLineTo(round2, -round3);
        this.f10887g.close();
        canvas.save();
        float strokeWidth2 = this.f10881a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth2);
        float f18 = this.f10885e;
        canvas2.translate((float) bounds.centerX(), (strokeWidth2 * 1.5f) + f18 + ((float) ((((int) (height - (2.0f * f18))) / 4) * 2)));
        if (this.f10886f) {
            if (false ^ z11) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            canvas2.rotate(e13 * ((float) i10));
        } else if (z11) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f10887g, this.f10881a);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f10888h;
    }

    public final int getIntrinsicWidth() {
        return this.f10888h;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i10) {
        if (i10 != this.f10881a.getAlpha()) {
            this.f10881a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10881a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f10889i != f10) {
            this.f10889i = f10;
            invalidateSelf();
        }
    }
}
