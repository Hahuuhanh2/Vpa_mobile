package q5;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: ShimmerDrawable */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final C0184a f14364a = new C0184a();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f14365b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f14366c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f14367d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f14368e;

    /* renamed from: f  reason: collision with root package name */
    public com.facebook.shimmer.a f14369f;

    /* renamed from: q5.a$a  reason: collision with other inner class name */
    /* compiled from: ShimmerDrawable */
    public class C0184a implements ValueAnimator.AnimatorUpdateListener {
        public C0184a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.invalidateSelf();
        }
    }

    public a() {
        Paint paint = new Paint();
        this.f14365b = paint;
        this.f14366c = new Rect();
        this.f14367d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f14368e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f14369f) != null && aVar.f5029o && getCallback() != null) {
            this.f14368e.start();
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r13v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r5v5, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r20 = this;
            r0 = r20
            android.graphics.Rect r1 = r20.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            com.facebook.shimmer.a r3 = r0.f14369f
            if (r3 != 0) goto L_0x0018
            goto L_0x008d
        L_0x0018:
            int r4 = r3.f5021g
            if (r4 <= 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            float r3 = r3.f5023i
            float r2 = (float) r2
            float r3 = r3 * r2
            int r4 = java.lang.Math.round(r3)
        L_0x0025:
            com.facebook.shimmer.a r2 = r0.f14369f
            int r3 = r2.f5022h
            if (r3 <= 0) goto L_0x002c
            goto L_0x0034
        L_0x002c:
            float r2 = r2.f5024j
            float r1 = (float) r1
            float r2 = r2 * r1
            int r3 = java.lang.Math.round(r2)
        L_0x0034:
            com.facebook.shimmer.a r1 = r0.f14369f
            int r2 = r1.f5020f
            r5 = 1
            if (r2 == r5) goto L_0x005f
            int r1 = r1.f5017c
            r2 = 0
            if (r1 == r5) goto L_0x0045
            r6 = 3
            if (r1 != r6) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r5 = r2
        L_0x0045:
            if (r5 == 0) goto L_0x0048
            r4 = r2
        L_0x0048:
            if (r5 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r3 = r2
        L_0x004c:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r6 = 0
            r7 = 0
            float r8 = (float) r4
            float r9 = (float) r3
            com.facebook.shimmer.a r2 = r0.f14369f
            int[] r10 = r2.f5016b
            float[] r11 = r2.f5015a
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0088
        L_0x005f:
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient
            float r2 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r14 = r2 / r5
            float r2 = (float) r3
            float r15 = r2 / r5
            int r2 = java.lang.Math.max(r4, r3)
            double r2 = (double) r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.sqrt(r4)
            double r2 = r2 / r4
            float r2 = (float) r2
            com.facebook.shimmer.a r3 = r0.f14369f
            int[] r4 = r3.f5016b
            float[] r3 = r3.f5015a
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP
            r13 = r1
            r16 = r2
            r17 = r4
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x0088:
            android.graphics.Paint r2 = r0.f14365b
            r2.setShader(r1)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.b():void");
    }

    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        if (this.f14369f != null && this.f14365b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f14369f.f5027m));
            float width = (((float) this.f14366c.width()) * tan) + ((float) this.f14366c.height());
            float height = (tan * ((float) this.f14366c.height())) + ((float) this.f14366c.width());
            ValueAnimator valueAnimator = this.f14368e;
            float f13 = 0.0f;
            if (valueAnimator != null) {
                f10 = valueAnimator.getAnimatedFraction();
            } else {
                f10 = 0.0f;
            }
            int i10 = this.f14369f.f5017c;
            if (i10 != 1) {
                if (i10 == 2) {
                    f12 = android.support.v4.media.a.e(-height, height, f10, height);
                } else if (i10 != 3) {
                    float f14 = -height;
                    f12 = android.support.v4.media.a.e(height, f14, f10, f14);
                } else {
                    f11 = android.support.v4.media.a.e(-width, width, f10, width);
                }
                f13 = f12;
                f11 = 0.0f;
            } else {
                float f15 = -width;
                f11 = android.support.v4.media.a.e(width, f15, f10, f15);
            }
            this.f14367d.reset();
            this.f14367d.setRotate(this.f14369f.f5027m, ((float) this.f14366c.width()) / 2.0f, ((float) this.f14366c.height()) / 2.0f);
            this.f14367d.postTranslate(f13, f11);
            this.f14365b.getShader().setLocalMatrix(this.f14367d);
            canvas.drawRect(this.f14366c, this.f14365b);
        }
    }

    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f14369f;
        if (aVar == null || (!aVar.f5028n && !aVar.f5030p)) {
            return -1;
        }
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14366c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    public final void setAlpha(int i10) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
