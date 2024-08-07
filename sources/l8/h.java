package l8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import l8.n;
import l8.p;

/* compiled from: MaterialShapeDrawable */
public class h extends Drawable implements q {
    public static final Paint E;
    public PorterDuffColorFilter A;
    public int B;
    public final RectF C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public b f12778a;

    /* renamed from: b  reason: collision with root package name */
    public final p.f[] f12779b;

    /* renamed from: c  reason: collision with root package name */
    public final p.f[] f12780c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f12781d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12782e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f12783f;

    /* renamed from: n  reason: collision with root package name */
    public final Path f12784n;

    /* renamed from: o  reason: collision with root package name */
    public final Path f12785o;

    /* renamed from: p  reason: collision with root package name */
    public final RectF f12786p;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f12787q;

    /* renamed from: r  reason: collision with root package name */
    public final Region f12788r;

    /* renamed from: s  reason: collision with root package name */
    public final Region f12789s;

    /* renamed from: t  reason: collision with root package name */
    public m f12790t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f12791u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f12792v;

    /* renamed from: w  reason: collision with root package name */
    public final k8.a f12793w;

    /* renamed from: x  reason: collision with root package name */
    public final a f12794x;

    /* renamed from: y  reason: collision with root package name */
    public final n f12795y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuffColorFilter f12796z;

    /* compiled from: MaterialShapeDrawable */
    public class a {
        public a() {
        }
    }

    static {
        Class<h> cls = h.class;
        Paint paint = new Paint(1);
        E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new m());
    }

    public final void b(RectF rectF, Path path) {
        n nVar = this.f12795y;
        b bVar = this.f12778a;
        m mVar = bVar.f12798a;
        float f10 = bVar.f12807j;
        nVar.a(mVar, f10, rectF, this.f12794x, path);
        if (this.f12778a.f12806i != 1.0f) {
            this.f12783f.reset();
            Matrix matrix = this.f12783f;
            float f11 = this.f12778a.f12806i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f12783f);
        }
        path.computeBounds(this.C, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList == null || mode == null) {
            if (z10) {
                int color = paint.getColor();
                int d10 = d(color);
                this.B = d10;
                if (d10 != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
                    return porterDuffColorFilter;
                }
            }
            porterDuffColorFilter = null;
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = d(colorForState);
        }
        this.B = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i10) {
        b bVar = this.f12778a;
        float f10 = bVar.f12811n + bVar.f12812o + bVar.f12810m;
        c8.a aVar = bVar.f12799b;
        if (aVar != null) {
            return aVar.a(i10, f10);
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f6, code lost:
        if (r0 != false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            android.graphics.Paint r0 = r6.f12791u
            android.graphics.PorterDuffColorFilter r1 = r6.f12796z
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f12791u
            int r8 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f12791u
            l8.h$b r1 = r6.f12778a
            int r1 = r1.f12809l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r8
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r6.f12792v
            android.graphics.PorterDuffColorFilter r1 = r6.A
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f12792v
            l8.h$b r1 = r6.f12778a
            float r1 = r1.f12808k
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r6.f12792v
            int r9 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f12792v
            l8.h$b r1 = r6.f12778a
            int r1 = r1.f12809l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            boolean r0 = r6.f12782e
            r10 = 0
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x00d2
            l8.h$b r0 = r6.f12778a
            android.graphics.Paint$Style r0 = r0.f12818u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0058
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x0064
        L_0x0058:
            android.graphics.Paint r0 = r6.f12792v
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            r0 = r11
            goto L_0x0065
        L_0x0064:
            r0 = r12
        L_0x0065:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0071
            android.graphics.Paint r0 = r6.f12792v
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x0072
        L_0x0071:
            r0 = r10
        L_0x0072:
            float r0 = -r0
            l8.h$b r2 = r6.f12778a
            l8.m r2 = r2.f12798a
            l8.i r3 = new l8.i
            r3.<init>(r0)
            l8.m r14 = r2.h(r3)
            r6.f12790t = r14
            l8.n r13 = r6.f12795y
            l8.h$b r0 = r6.f12778a
            float r15 = r0.f12807j
            android.graphics.RectF r0 = r6.f12787q
            android.graphics.RectF r2 = r19.h()
            r0.set(r2)
            l8.h$b r0 = r6.f12778a
            android.graphics.Paint$Style r0 = r0.f12818u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r2) goto L_0x009d
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            if (r0 != r2) goto L_0x00a9
        L_0x009d:
            android.graphics.Paint r0 = r6.f12792v
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a9
            r0 = r11
            goto L_0x00aa
        L_0x00a9:
            r0 = r12
        L_0x00aa:
            if (r0 == 0) goto L_0x00b4
            android.graphics.Paint r0 = r6.f12792v
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x00b5
        L_0x00b4:
            r0 = r10
        L_0x00b5:
            android.graphics.RectF r1 = r6.f12787q
            r1.inset(r0, r0)
            android.graphics.RectF r0 = r6.f12787q
            android.graphics.Path r1 = r6.f12785o
            r17 = 0
            r16 = r0
            r18 = r1
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r0 = r19.h()
            android.graphics.Path r1 = r6.f12784n
            r6.b(r0, r1)
            r6.f12782e = r12
        L_0x00d2:
            l8.h$b r0 = r6.f12778a
            int r1 = r0.f12813p
            r2 = 2
            if (r1 == r11) goto L_0x00fa
            int r0 = r0.f12814q
            if (r0 <= 0) goto L_0x00fa
            if (r1 == r2) goto L_0x00f8
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = r19.l()
            if (r1 != 0) goto L_0x00f5
            android.graphics.Path r1 = r6.f12784n
            boolean r1 = r1.isConvex()
            if (r1 != 0) goto L_0x00f5
            r1 = 29
            if (r0 >= r1) goto L_0x00f5
            r0 = r11
            goto L_0x00f6
        L_0x00f5:
            r0 = r12
        L_0x00f6:
            if (r0 == 0) goto L_0x00fa
        L_0x00f8:
            r0 = r11
            goto L_0x00fb
        L_0x00fa:
            r0 = r12
        L_0x00fb:
            if (r0 != 0) goto L_0x00ff
            goto L_0x01a1
        L_0x00ff:
            r20.save()
            l8.h$b r0 = r6.f12778a
            int r1 = r0.f12815r
            double r3 = (double) r1
            int r0 = r0.f12816s
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r3
            int r0 = (int) r0
            int r1 = r19.i()
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.D
            if (r0 != 0) goto L_0x0128
            r19.e(r20)
            r20.restore()
            goto L_0x01a1
        L_0x0128:
            android.graphics.RectF r0 = r6.C
            float r0 = r0.width()
            android.graphics.Rect r1 = r19.getBounds()
            int r1 = r1.width()
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            android.graphics.RectF r1 = r6.C
            float r1 = r1.height()
            android.graphics.Rect r3 = r19.getBounds()
            int r3 = r3.height()
            float r3 = (float) r3
            float r1 = r1 - r3
            int r1 = (int) r1
            if (r0 < 0) goto L_0x01ec
            if (r1 < 0) goto L_0x01ec
            android.graphics.RectF r3 = r6.C
            float r3 = r3.width()
            int r3 = (int) r3
            l8.h$b r4 = r6.f12778a
            int r4 = r4.f12814q
            int r4 = r4 * r2
            int r4 = r4 + r3
            int r4 = r4 + r0
            android.graphics.RectF r3 = r6.C
            float r3 = r3.height()
            int r3 = (int) r3
            l8.h$b r5 = r6.f12778a
            int r5 = r5.f12814q
            int r5 = r5 * r2
            int r5 = r5 + r3
            int r5 = r5 + r1
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r5, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r19.getBounds()
            int r4 = r4.left
            l8.h$b r5 = r6.f12778a
            int r5 = r5.f12814q
            int r4 = r4 - r5
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r4 = r19.getBounds()
            int r4 = r4.top
            l8.h$b r5 = r6.f12778a
            int r5 = r5.f12814q
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r4 = -r0
            float r5 = -r1
            r3.translate(r4, r5)
            r6.e(r3)
            r3 = 0
            r7.drawBitmap(r2, r0, r1, r3)
            r2.recycle()
            r20.restore()
        L_0x01a1:
            l8.h$b r0 = r6.f12778a
            android.graphics.Paint$Style r1 = r0.f12818u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01b0
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r1 = r12
            goto L_0x01b1
        L_0x01b0:
            r1 = r11
        L_0x01b1:
            if (r1 == 0) goto L_0x01c4
            android.graphics.Paint r2 = r6.f12791u
            android.graphics.Path r3 = r6.f12784n
            l8.m r4 = r0.f12798a
            android.graphics.RectF r5 = r19.h()
            r0 = r19
            r1 = r20
            r0.f(r1, r2, r3, r4, r5)
        L_0x01c4:
            l8.h$b r0 = r6.f12778a
            android.graphics.Paint$Style r0 = r0.f12818u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x01d0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x01db
        L_0x01d0:
            android.graphics.Paint r0 = r6.f12792v
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r11 = r12
        L_0x01dc:
            if (r11 == 0) goto L_0x01e1
            r19.g(r20)
        L_0x01e1:
            android.graphics.Paint r0 = r6.f12791u
            r0.setAlpha(r8)
            android.graphics.Paint r0 = r6.f12792v
            r0.setAlpha(r9)
            return
        L_0x01ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.h.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        this.f12781d.cardinality();
        if (this.f12778a.f12815r != 0) {
            canvas.drawPath(this.f12784n, this.f12793w.f12054a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            p.f fVar = this.f12779b[i10];
            k8.a aVar = this.f12793w;
            int i11 = this.f12778a.f12814q;
            Matrix matrix = p.f.f12886b;
            fVar.a(matrix, aVar, i11, canvas);
            this.f12780c[i10].a(matrix, this.f12793w, this.f12778a.f12814q, canvas);
        }
        if (this.D) {
            b bVar = this.f12778a;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f12816s)) * ((double) bVar.f12815r));
            int i12 = i();
            canvas.translate((float) (-sin), (float) (-i12));
            canvas.drawPath(this.f12784n, E);
            canvas.translate((float) sin, (float) i12);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, m mVar, RectF rectF) {
        if (mVar.f(rectF)) {
            float a10 = mVar.f12830f.a(rectF) * this.f12778a.f12807j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.f12792v;
        Path path = this.f12785o;
        m mVar = this.f12790t;
        this.f12787q.set(h());
        Paint.Style style = this.f12778a.f12818u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f12792v.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = this.f12792v.getStrokeWidth() / 2.0f;
        }
        this.f12787q.inset(f10, f10);
        f(canvas, paint, path, mVar, this.f12787q);
    }

    public int getAlpha() {
        return this.f12778a.f12809l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f12778a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f12778a.f12813p != 2) {
            if (l()) {
                outline.setRoundRect(getBounds(), j() * this.f12778a.f12807j);
                return;
            }
            b(h(), this.f12784n);
            Path path = this.f12784n;
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
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f12778a.f12805h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.f12788r.set(getBounds());
        b(h(), this.f12784n);
        this.f12789s.setPath(this.f12784n, this.f12788r);
        this.f12788r.op(this.f12789s, Region.Op.DIFFERENCE);
        return this.f12788r;
    }

    public final RectF h() {
        this.f12786p.set(getBounds());
        return this.f12786p;
    }

    public final int i() {
        b bVar = this.f12778a;
        return (int) (Math.cos(Math.toRadians((double) bVar.f12816s)) * ((double) bVar.f12815r));
    }

    public final void invalidateSelf() {
        this.f12782e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f12778a.f12803f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f12778a.f12802e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f12778a.f12801d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f12778a.f12800c) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    public final float j() {
        return this.f12778a.f12798a.f12829e.a(h());
    }

    public final void k(Context context) {
        this.f12778a.f12799b = new c8.a(context);
        w();
    }

    public final boolean l() {
        return this.f12778a.f12798a.f(h());
    }

    public final void m(float f10) {
        b bVar = this.f12778a;
        if (bVar.f12811n != f10) {
            bVar.f12811n = f10;
            w();
        }
    }

    public Drawable mutate() {
        this.f12778a = new b(this.f12778a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        b bVar = this.f12778a;
        if (bVar.f12800c != colorStateList) {
            bVar.f12800c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f10) {
        b bVar = this.f12778a;
        if (bVar.f12807j != f10) {
            bVar.f12807j = f10;
            this.f12782e = true;
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f12782e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean u10 = u(iArr);
        boolean v2 = v();
        if (u10 || v2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p(Paint.Style style) {
        this.f12778a.f12818u = style;
        super.invalidateSelf();
    }

    public final void q() {
        this.f12793w.a(-12303292);
        this.f12778a.f12817t = false;
        super.invalidateSelf();
    }

    public final void r(int i10) {
        b bVar = this.f12778a;
        if (bVar.f12813p != i10) {
            bVar.f12813p = i10;
            super.invalidateSelf();
        }
    }

    public final void s(ColorStateList colorStateList) {
        b bVar = this.f12778a;
        if (bVar.f12801d != colorStateList) {
            bVar.f12801d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setAlpha(int i10) {
        b bVar = this.f12778a;
        if (bVar.f12809l != i10) {
            bVar.f12809l = i10;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12778a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(m mVar) {
        this.f12778a.f12798a = mVar;
        invalidateSelf();
    }

    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f12778a.f12803f = colorStateList;
        v();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f12778a;
        if (bVar.f12804g != mode) {
            bVar.f12804g = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f10) {
        this.f12778a.f12808k = f10;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f12778a.f12800c == null || (color2 = this.f12791u.getColor()) == (colorForState2 = this.f12778a.f12800c.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f12791u.setColor(colorForState2);
            z10 = true;
        }
        if (this.f12778a.f12801d == null || (color = this.f12792v.getColor()) == (colorForState = this.f12778a.f12801d.getColorForState(iArr, color))) {
            return z10;
        }
        this.f12792v.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f12796z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        b bVar = this.f12778a;
        this.f12796z = c(bVar.f12803f, bVar.f12804g, this.f12791u, true);
        b bVar2 = this.f12778a;
        this.A = c(bVar2.f12802e, bVar2.f12804g, this.f12792v, false);
        b bVar3 = this.f12778a;
        if (bVar3.f12817t) {
            this.f12793w.a(bVar3.f12803f.getColorForState(getState(), 0));
        }
        if (!v1.b.a(porterDuffColorFilter, this.f12796z) || !v1.b.a(porterDuffColorFilter2, this.A)) {
            return true;
        }
        return false;
    }

    public final void w() {
        b bVar = this.f12778a;
        float f10 = bVar.f12811n + bVar.f12812o;
        bVar.f12814q = (int) Math.ceil((double) (0.75f * f10));
        this.f12778a.f12815r = (int) Math.ceil((double) (f10 * 0.25f));
        v();
        super.invalidateSelf();
    }

    public h(m mVar) {
        this(new b(mVar));
    }

    public h(b bVar) {
        n nVar;
        this.f12779b = new p.f[4];
        this.f12780c = new p.f[4];
        this.f12781d = new BitSet(8);
        this.f12783f = new Matrix();
        this.f12784n = new Path();
        this.f12785o = new Path();
        this.f12786p = new RectF();
        this.f12787q = new RectF();
        this.f12788r = new Region();
        this.f12789s = new Region();
        Paint paint = new Paint(1);
        this.f12791u = paint;
        Paint paint2 = new Paint(1);
        this.f12792v = paint2;
        this.f12793w = new k8.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            nVar = n.a.f12861a;
        } else {
            nVar = new n();
        }
        this.f12795y = nVar;
        this.C = new RectF();
        this.D = true;
        this.f12778a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.f12794x = new a();
    }

    /* compiled from: MaterialShapeDrawable */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public m f12798a;

        /* renamed from: b  reason: collision with root package name */
        public c8.a f12799b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f12800c = null;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f12801d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f12802e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f12803f = null;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f12804g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f12805h = null;

        /* renamed from: i  reason: collision with root package name */
        public float f12806i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f12807j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f12808k;

        /* renamed from: l  reason: collision with root package name */
        public int f12809l = 255;

        /* renamed from: m  reason: collision with root package name */
        public float f12810m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f12811n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f12812o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public int f12813p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f12814q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f12815r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f12816s = 0;

        /* renamed from: t  reason: collision with root package name */
        public boolean f12817t = false;

        /* renamed from: u  reason: collision with root package name */
        public Paint.Style f12818u = Paint.Style.FILL_AND_STROKE;

        public b(m mVar) {
            this.f12798a = mVar;
            this.f12799b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f12782e = true;
            return hVar;
        }

        public b(b bVar) {
            this.f12798a = bVar.f12798a;
            this.f12799b = bVar.f12799b;
            this.f12808k = bVar.f12808k;
            this.f12800c = bVar.f12800c;
            this.f12801d = bVar.f12801d;
            this.f12804g = bVar.f12804g;
            this.f12803f = bVar.f12803f;
            this.f12809l = bVar.f12809l;
            this.f12806i = bVar.f12806i;
            this.f12815r = bVar.f12815r;
            this.f12813p = bVar.f12813p;
            this.f12817t = bVar.f12817t;
            this.f12807j = bVar.f12807j;
            this.f12810m = bVar.f12810m;
            this.f12811n = bVar.f12811n;
            this.f12812o = bVar.f12812o;
            this.f12814q = bVar.f12814q;
            this.f12816s = bVar.f12816s;
            this.f12802e = bVar.f12802e;
            this.f12818u = bVar.f12818u;
            if (bVar.f12805h != null) {
                this.f12805h = new Rect(bVar.f12805h);
            }
        }
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(new m(m.c(context, attributeSet, i10, i11)));
    }
}
