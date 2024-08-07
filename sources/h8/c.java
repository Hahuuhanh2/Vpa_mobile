package h8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import m9.b;

/* compiled from: CircularDrawingDelegate */
public final class c extends k<CircularProgressIndicatorSpec> {

    /* renamed from: c  reason: collision with root package name */
    public int f10629c = 1;

    /* renamed from: d  reason: collision with root package name */
    public float f10630d;

    /* renamed from: e  reason: collision with root package name */
    public float f10631e;

    /* renamed from: f  reason: collision with root package name */
    public float f10632f;

    public c(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    public final void a(Canvas canvas, Rect rect, float f10) {
        int i10;
        float width = ((float) rect.width()) / ((float) f());
        float height = ((float) rect.height()) / ((float) f());
        S s10 = this.f10667a;
        float f11 = (((float) ((CircularProgressIndicatorSpec) s10).f6632g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s10).f6633h);
        canvas.translate((f11 * width) + ((float) rect.left), (f11 * height) + ((float) rect.top));
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s11 = this.f10667a;
        if (((CircularProgressIndicatorSpec) s11).f6634i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f10629c = i10;
        this.f10630d = ((float) ((CircularProgressIndicatorSpec) s11).f10623a) * f10;
        this.f10631e = ((float) ((CircularProgressIndicatorSpec) s11).f10624b) * f10;
        this.f10632f = ((float) (((CircularProgressIndicatorSpec) s11).f6632g - ((CircularProgressIndicatorSpec) s11).f10623a)) / 2.0f;
        if ((this.f10668b.d() && ((CircularProgressIndicatorSpec) this.f10667a).f10627e == 2) || (this.f10668b.c() && ((CircularProgressIndicatorSpec) this.f10667a).f10628f == 1)) {
            this.f10632f = (((1.0f - f10) * ((float) ((CircularProgressIndicatorSpec) this.f10667a).f10623a)) / 2.0f) + this.f10632f;
        } else if ((this.f10668b.d() && ((CircularProgressIndicatorSpec) this.f10667a).f10627e == 1) || (this.f10668b.c() && ((CircularProgressIndicatorSpec) this.f10667a).f10628f == 2)) {
            this.f10632f -= ((1.0f - f10) * ((float) ((CircularProgressIndicatorSpec) this.f10667a).f10623a)) / 2.0f;
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 != f11) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i10);
            paint.setStrokeWidth(this.f10630d);
            float f12 = (float) this.f10629c;
            float f13 = f10 * 360.0f * f12;
            if (f11 < f10) {
                f11 += 1.0f;
            }
            float f14 = (f11 - f10) * 360.0f * f12;
            float f15 = this.f10632f;
            float f16 = -f15;
            canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
            if (this.f10631e > 0.0f && Math.abs(f14) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f17 = this.f10630d;
                float f18 = this.f10631e;
                canvas.save();
                canvas.rotate(f13);
                float f19 = this.f10632f;
                float f20 = f17 / 2.0f;
                canvas.drawRoundRect(new RectF(f19 - f20, f18, f19 + f20, -f18), f18, f18, paint);
                canvas.restore();
                float f21 = this.f10630d;
                float f22 = this.f10631e;
                canvas.save();
                canvas.rotate(f13 + f14);
                float f23 = this.f10632f;
                float f24 = f21 / 2.0f;
                canvas.drawRoundRect(new RectF(f23 - f24, f22, f23 + f24, -f22), f22, f22, paint);
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, Paint paint) {
        int m10 = b.m(((CircularProgressIndicatorSpec) this.f10667a).f10626d, this.f10668b.f10666q);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(m10);
        paint.setStrokeWidth(this.f10630d);
        float f10 = this.f10632f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    public final int d() {
        return f();
    }

    public final int e() {
        return f();
    }

    public final int f() {
        S s10 = this.f10667a;
        return (((CircularProgressIndicatorSpec) s10).f6633h * 2) + ((CircularProgressIndicatorSpec) s10).f6632g;
    }
}
