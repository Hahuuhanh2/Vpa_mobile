package g3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import q2.b;

/* compiled from: CircularProgressDrawable */
public final class d extends Drawable implements Animatable {

    /* renamed from: n  reason: collision with root package name */
    public static final LinearInterpolator f10302n = new LinearInterpolator();

    /* renamed from: o  reason: collision with root package name */
    public static final b f10303o = new b();

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f10304p = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    public final a f10305a;

    /* renamed from: b  reason: collision with root package name */
    public float f10306b;

    /* renamed from: c  reason: collision with root package name */
    public Resources f10307c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f10308d;

    /* renamed from: e  reason: collision with root package name */
    public float f10309e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10310f;

    /* compiled from: CircularProgressDrawable */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f10311a = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public final Paint f10312b;

        /* renamed from: c  reason: collision with root package name */
        public final Paint f10313c;

        /* renamed from: d  reason: collision with root package name */
        public final Paint f10314d;

        /* renamed from: e  reason: collision with root package name */
        public float f10315e;

        /* renamed from: f  reason: collision with root package name */
        public float f10316f;

        /* renamed from: g  reason: collision with root package name */
        public float f10317g;

        /* renamed from: h  reason: collision with root package name */
        public float f10318h;

        /* renamed from: i  reason: collision with root package name */
        public int[] f10319i;

        /* renamed from: j  reason: collision with root package name */
        public int f10320j;

        /* renamed from: k  reason: collision with root package name */
        public float f10321k;

        /* renamed from: l  reason: collision with root package name */
        public float f10322l;

        /* renamed from: m  reason: collision with root package name */
        public float f10323m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f10324n;

        /* renamed from: o  reason: collision with root package name */
        public Path f10325o;

        /* renamed from: p  reason: collision with root package name */
        public float f10326p;

        /* renamed from: q  reason: collision with root package name */
        public float f10327q;

        /* renamed from: r  reason: collision with root package name */
        public int f10328r;

        /* renamed from: s  reason: collision with root package name */
        public int f10329s;

        /* renamed from: t  reason: collision with root package name */
        public int f10330t;

        /* renamed from: u  reason: collision with root package name */
        public int f10331u;

        public a() {
            Paint paint = new Paint();
            this.f10312b = paint;
            Paint paint2 = new Paint();
            this.f10313c = paint2;
            Paint paint3 = new Paint();
            this.f10314d = paint3;
            this.f10315e = 0.0f;
            this.f10316f = 0.0f;
            this.f10317g = 0.0f;
            this.f10318h = 5.0f;
            this.f10326p = 1.0f;
            this.f10330t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i10) {
            this.f10320j = i10;
            this.f10331u = this.f10319i[i10];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f10307c = context.getResources();
        a aVar = new a();
        this.f10305a = aVar;
        aVar.f10319i = f10304p;
        aVar.a(0);
        aVar.f10318h = 2.5f;
        aVar.f10312b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f10302n);
        ofFloat.addListener(new c(this, aVar));
        this.f10308d = ofFloat;
    }

    public static void d(float f10, a aVar) {
        if (f10 > 0.75f) {
            float f11 = (f10 - 0.75f) / 0.25f;
            int[] iArr = aVar.f10319i;
            int i10 = aVar.f10320j;
            int i11 = iArr[i10];
            int i12 = iArr[(i10 + 1) % iArr.length];
            int i13 = (i11 >> 24) & 255;
            int i14 = (i11 >> 16) & 255;
            int i15 = (i11 >> 8) & 255;
            int i16 = i11 & 255;
            aVar.f10331u = ((i13 + ((int) (((float) (((i12 >> 24) & 255) - i13)) * f11))) << 24) | ((i14 + ((int) (((float) (((i12 >> 16) & 255) - i14)) * f11))) << 16) | ((i15 + ((int) (((float) (((i12 >> 8) & 255) - i15)) * f11))) << 8) | (i16 + ((int) (f11 * ((float) ((i12 & 255) - i16)))));
            return;
        }
        aVar.f10331u = aVar.f10319i[aVar.f10320j];
    }

    public final void a(float f10, a aVar, boolean z10) {
        float f11;
        float f12;
        if (this.f10310f) {
            d(f10, aVar);
            float floor = (float) (Math.floor((double) (aVar.f10323m / 0.8f)) + 1.0d);
            float f13 = aVar.f10321k;
            float f14 = aVar.f10322l;
            aVar.f10315e = (((f14 - 0.01f) - f13) * f10) + f13;
            aVar.f10316f = f14;
            float f15 = aVar.f10323m;
            aVar.f10317g = android.support.v4.media.a.e(floor, f15, f10, f15);
        } else if (f10 != 1.0f || z10) {
            float f16 = aVar.f10323m;
            if (f10 < 0.5f) {
                f11 = aVar.f10321k;
                f12 = (f10303o.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + f11;
            } else {
                float f17 = aVar.f10321k + 0.79f;
                float f18 = f17;
                f11 = f17 - (((1.0f - f10303o.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = f18;
            }
            aVar.f10315e = f11;
            aVar.f10316f = f12;
            aVar.f10317g = (0.20999998f * f10) + f16;
            this.f10306b = (f10 + this.f10309e) * 216.0f;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        a aVar = this.f10305a;
        float f14 = this.f10307c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        aVar.f10318h = f15;
        aVar.f10312b.setStrokeWidth(f15);
        aVar.f10327q = f10 * f14;
        aVar.a(0);
        aVar.f10328r = (int) (f12 * f14);
        aVar.f10329s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f10306b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f10305a;
        RectF rectF = aVar.f10311a;
        float f10 = aVar.f10327q;
        float f11 = (aVar.f10318h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            f11 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.f10328r) * aVar.f10326p) / 2.0f, aVar.f10318h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f11, ((float) bounds.centerY()) - f11, ((float) bounds.centerX()) + f11, ((float) bounds.centerY()) + f11);
        float f12 = aVar.f10315e;
        float f13 = aVar.f10317g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f10316f + f13) * 360.0f) - f14;
        aVar.f10312b.setColor(aVar.f10331u);
        aVar.f10312b.setAlpha(aVar.f10330t);
        float f16 = aVar.f10318h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f10314d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, aVar.f10312b);
        if (aVar.f10324n) {
            Path path = aVar.f10325o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f10325o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f10325o.moveTo(0.0f, 0.0f);
            aVar.f10325o.lineTo(((float) aVar.f10328r) * aVar.f10326p, 0.0f);
            Path path3 = aVar.f10325o;
            float f18 = aVar.f10326p;
            path3.lineTo((((float) aVar.f10328r) * f18) / 2.0f, ((float) aVar.f10329s) * f18);
            aVar.f10325o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) aVar.f10328r) * aVar.f10326p) / 2.0f), (aVar.f10318h / 2.0f) + rectF.centerY());
            aVar.f10325o.close();
            aVar.f10313c.setColor(aVar.f10331u);
            aVar.f10313c.setAlpha(aVar.f10330t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f10325o, aVar.f10313c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f10305a.f10330t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f10308d.isRunning();
    }

    public final void setAlpha(int i10) {
        this.f10305a.f10330t = i10;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10305a.f10312b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f10308d.cancel();
        a aVar = this.f10305a;
        float f10 = aVar.f10315e;
        aVar.f10321k = f10;
        float f11 = aVar.f10316f;
        aVar.f10322l = f11;
        aVar.f10323m = aVar.f10317g;
        if (f11 != f10) {
            this.f10310f = true;
            this.f10308d.setDuration(666);
            this.f10308d.start();
            return;
        }
        aVar.a(0);
        a aVar2 = this.f10305a;
        aVar2.f10321k = 0.0f;
        aVar2.f10322l = 0.0f;
        aVar2.f10323m = 0.0f;
        aVar2.f10315e = 0.0f;
        aVar2.f10316f = 0.0f;
        aVar2.f10317g = 0.0f;
        this.f10308d.setDuration(1332);
        this.f10308d.start();
    }

    public final void stop() {
        this.f10308d.cancel();
        this.f10306b = 0.0f;
        a aVar = this.f10305a;
        if (aVar.f10324n) {
            aVar.f10324n = false;
        }
        aVar.a(0);
        a aVar2 = this.f10305a;
        aVar2.f10321k = 0.0f;
        aVar2.f10322l = 0.0f;
        aVar2.f10323m = 0.0f;
        aVar2.f10315e = 0.0f;
        aVar2.f10316f = 0.0f;
        aVar2.f10317g = 0.0f;
        invalidateSelf();
    }
}
