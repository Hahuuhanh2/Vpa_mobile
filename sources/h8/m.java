package h8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import m9.b;

/* compiled from: LinearDrawingDelegate */
public final class m extends k<LinearProgressIndicatorSpec> {

    /* renamed from: c  reason: collision with root package name */
    public float f10671c = 300.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f10672d;

    /* renamed from: e  reason: collision with root package name */
    public float f10673e;

    /* renamed from: f  reason: collision with root package name */
    public Path f10674f;

    public m(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    public final void a(Canvas canvas, Rect rect, float f10) {
        this.f10671c = (float) rect.width();
        float f11 = (float) ((LinearProgressIndicatorSpec) this.f10667a).f10623a;
        canvas.translate((((float) rect.width()) / 2.0f) + ((float) rect.left), Math.max(0.0f, ((float) (rect.height() - ((LinearProgressIndicatorSpec) this.f10667a).f10623a)) / 2.0f) + (((float) rect.height()) / 2.0f) + ((float) rect.top));
        if (((LinearProgressIndicatorSpec) this.f10667a).f6638i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f10668b.d() && ((LinearProgressIndicatorSpec) this.f10667a).f10627e == 1) || (this.f10668b.c() && ((LinearProgressIndicatorSpec) this.f10667a).f10628f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f10668b.d() || this.f10668b.c()) {
            canvas.translate(0.0f, ((f10 - 1.0f) * ((float) ((LinearProgressIndicatorSpec) this.f10667a).f10623a)) / 2.0f);
        }
        float f12 = this.f10671c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        S s10 = this.f10667a;
        this.f10672d = ((float) ((LinearProgressIndicatorSpec) s10).f10623a) * f10;
        this.f10673e = ((float) ((LinearProgressIndicatorSpec) s10).f10624b) * f10;
    }

    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 != f11) {
            float f12 = this.f10671c;
            float f13 = (-f12) / 2.0f;
            float f14 = (f11 * f12) + f13;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i10);
            canvas.save();
            canvas.clipPath(this.f10674f);
            float f15 = this.f10672d;
            RectF rectF = new RectF(((f10 * f12) + f13) - (this.f10673e * 2.0f), (-f15) / 2.0f, f14, f15 / 2.0f);
            float f16 = this.f10673e;
            canvas.drawRoundRect(rectF, f16, f16, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, Paint paint) {
        int m10 = b.m(((LinearProgressIndicatorSpec) this.f10667a).f10626d, this.f10668b.f10666q);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(m10);
        Path path = new Path();
        this.f10674f = path;
        float f10 = this.f10671c;
        float f11 = this.f10672d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.f10673e;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CCW);
        canvas.drawPath(this.f10674f, paint);
    }

    public final int d() {
        return ((LinearProgressIndicatorSpec) this.f10667a).f10623a;
    }

    public final int e() {
        return -1;
    }
}
