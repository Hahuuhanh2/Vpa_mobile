package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.x;
import f8.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t7.b;
import w1.d0;
import w1.q0;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f7129a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7130b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f7131c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7132d;

    /* renamed from: e  reason: collision with root package name */
    public final float f7133e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f7134f;

    /* renamed from: n  reason: collision with root package name */
    public final RectF f7135n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7136o;

    /* renamed from: p  reason: collision with root package name */
    public float f7137p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7138q;

    /* renamed from: r  reason: collision with root package name */
    public double f7139r;

    /* renamed from: s  reason: collision with root package name */
    public int f7140s;

    /* renamed from: t  reason: collision with root package name */
    public int f7141t;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialClockStyle);
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(((float) this.f7140s) * 0.66f);
        }
        return this.f7140s;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f7129a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f7137p = f11;
        this.f7139r = Math.toRadians((double) (f11 - 90.0f));
        float a10 = (float) a(this.f7141t);
        float cos = (((float) Math.cos(this.f7139r)) * a10) + ((float) (getWidth() / 2));
        float sin = (a10 * ((float) Math.sin(this.f7139r))) + ((float) (getHeight() / 2));
        RectF rectF = this.f7135n;
        float f12 = (float) this.f7132d;
        rectF.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f7131c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a10 = a(this.f7141t);
        float f10 = (float) width;
        float f11 = (float) a10;
        float f12 = (float) height;
        this.f7134f.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f7139r)) * f11) + f10, (f11 * ((float) Math.sin(this.f7139r))) + f12, (float) this.f7132d, this.f7134f);
        double sin = Math.sin(this.f7139r);
        double cos = Math.cos(this.f7139r);
        double d10 = (double) ((float) (a10 - this.f7132d));
        float f13 = (float) (width + ((int) (cos * d10)));
        float f14 = (float) (height + ((int) (d10 * sin)));
        this.f7134f.setStrokeWidth((float) this.f7136o);
        canvas.drawLine(f10, f12, f13, f14, this.f7134f);
        canvas.drawCircle(f10, f12, this.f7133e, this.f7134f);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f7129a.isRunning()) {
            b(this.f7137p);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked == 0) {
            this.f7138q = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.f7138q;
            if (this.f7130b) {
                if (((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y10 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + x.c(getContext(), 12)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                this.f7141t = i10;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z14 = this.f7138q;
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (y10 - ((float) (getHeight() / 2))), (double) (x10 - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = (float) degrees;
        if (this.f7137p != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f10);
            }
            this.f7138q = z14 | z13;
            return true;
        }
        z13 = true;
        this.f7138q = z14 | z13;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7129a = new ValueAnimator();
        this.f7131c = new ArrayList();
        Paint paint = new Paint();
        this.f7134f = paint;
        this.f7135n = new RectF();
        this.f7141t = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i10, R$style.Widget_MaterialComponents_TimePicker_Clock);
        j.c(context, R$attr.motionDurationLong2, 200);
        j.d(context, R$attr.motionEasingEmphasizedInterpolator, b.f14886b);
        this.f7140s = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.f7132d = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f7136o = resources.getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.f7133e = (float) resources.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }
}
