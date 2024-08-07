package j3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import n1.g;
import o1.a;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VectorDrawableCompat */
public final class i extends h {

    /* renamed from: q  reason: collision with root package name */
    public static final PorterDuff.Mode f11570q = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public g f11571b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f11572c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f11573d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11574e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11575f;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f11576n;

    /* renamed from: o  reason: collision with root package name */
    public final Matrix f11577o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f11578p;

    /* compiled from: VectorDrawableCompat */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f11622a;

        /* renamed from: b  reason: collision with root package name */
        public f f11623b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f11624c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f11625d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11626e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f11627f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f11628g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f11629h;

        /* renamed from: i  reason: collision with root package name */
        public int f11630i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11631j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f11632k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f11633l;

        public g(g gVar) {
            this.f11624c = null;
            this.f11625d = i.f11570q;
            if (gVar != null) {
                this.f11622a = gVar.f11622a;
                f fVar = new f(gVar.f11623b);
                this.f11623b = fVar;
                if (gVar.f11623b.f11611e != null) {
                    fVar.f11611e = new Paint(gVar.f11623b.f11611e);
                }
                if (gVar.f11623b.f11610d != null) {
                    this.f11623b.f11610d = new Paint(gVar.f11623b.f11610d);
                }
                this.f11624c = gVar.f11624c;
                this.f11625d = gVar.f11625d;
                this.f11626e = gVar.f11626e;
            }
        }

        public int getChangingConfigurations() {
            return this.f11622a;
        }

        public final Drawable newDrawable() {
            return new i(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public g() {
            this.f11624c = null;
            this.f11625d = i.f11570q;
            this.f11623b = new f();
        }
    }

    public i() {
        this.f11575f = true;
        this.f11576n = new float[9];
        this.f11577o = new Matrix();
        this.f11578p = new Rect();
        this.f11571b = new g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f11569a;
        if (drawable == null) {
            return false;
        }
        a.b.b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r8 == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.graphics.drawable.Drawable r2 = r0.f11569a
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.f11578p
            r0.copyBounds(r2)
            android.graphics.Rect r2 = r0.f11578p
            int r2 = r2.width()
            if (r2 <= 0) goto L_0x0193
            android.graphics.Rect r2 = r0.f11578p
            int r2 = r2.height()
            if (r2 > 0) goto L_0x0023
            goto L_0x0193
        L_0x0023:
            android.graphics.ColorFilter r2 = r0.f11573d
            if (r2 != 0) goto L_0x0029
            android.graphics.PorterDuffColorFilter r2 = r0.f11572c
        L_0x0029:
            android.graphics.Matrix r3 = r0.f11577o
            r1.getMatrix(r3)
            android.graphics.Matrix r3 = r0.f11577o
            float[] r4 = r0.f11576n
            r3.getValues(r4)
            float[] r3 = r0.f11576n
            r4 = 0
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r5 = r0.f11576n
            r6 = 4
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            float[] r6 = r0.f11576n
            r7 = 1
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            float[] r8 = r0.f11576n
            r9 = 3
            r8 = r8[r9]
            float r8 = java.lang.Math.abs(r8)
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r6 != 0) goto L_0x0064
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0066
        L_0x0064:
            r3 = r10
            r5 = r3
        L_0x0066:
            android.graphics.Rect r6 = r0.f11578p
            int r6 = r6.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r3 = (int) r6
            android.graphics.Rect r6 = r0.f11578p
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 2048(0x800, float:2.87E-42)
            int r15 = java.lang.Math.min(r6, r3)
            int r3 = java.lang.Math.min(r6, r5)
            if (r15 <= 0) goto L_0x0193
            if (r3 > 0) goto L_0x0088
            goto L_0x0193
        L_0x0088:
            int r5 = r18.save()
            android.graphics.Rect r6 = r0.f11578p
            int r8 = r6.left
            float r8 = (float) r8
            int r6 = r6.top
            float r6 = (float) r6
            r1.translate(r8, r6)
            boolean r6 = r17.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = o1.a.c.a(r17)
            if (r6 != r7) goto L_0x00a5
            r6 = r7
            goto L_0x00a6
        L_0x00a5:
            r6 = r4
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r0.f11578p
            int r6 = r6.width()
            float r6 = (float) r6
            r1.translate(r6, r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r6, r10)
        L_0x00b7:
            android.graphics.Rect r6 = r0.f11578p
            r6.offsetTo(r4, r4)
            j3.i$g r6 = r0.f11571b
            android.graphics.Bitmap r8 = r6.f11627f
            if (r8 == 0) goto L_0x00d5
            int r8 = r8.getWidth()
            if (r15 != r8) goto L_0x00d2
            android.graphics.Bitmap r8 = r6.f11627f
            int r8 = r8.getHeight()
            if (r3 != r8) goto L_0x00d2
            r8 = r7
            goto L_0x00d3
        L_0x00d2:
            r8 = r4
        L_0x00d3:
            if (r8 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r15, r3, r8)
            r6.f11627f = r8
            r6.f11632k = r7
        L_0x00df:
            boolean r6 = r0.f11575f
            if (r6 != 0) goto L_0x00fd
            j3.i$g r6 = r0.f11571b
            android.graphics.Bitmap r8 = r6.f11627f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f11627f
            r14.<init>(r8)
            j3.i$f r11 = r6.f11623b
            j3.i$c r12 = r11.f11613g
            android.graphics.Matrix r13 = j3.i.f.f11606p
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            goto L_0x0155
        L_0x00fd:
            j3.i$g r6 = r0.f11571b
            boolean r8 = r6.f11632k
            if (r8 != 0) goto L_0x0121
            android.content.res.ColorStateList r8 = r6.f11628g
            android.content.res.ColorStateList r9 = r6.f11624c
            if (r8 != r9) goto L_0x0121
            android.graphics.PorterDuff$Mode r8 = r6.f11629h
            android.graphics.PorterDuff$Mode r9 = r6.f11625d
            if (r8 != r9) goto L_0x0121
            boolean r8 = r6.f11631j
            boolean r9 = r6.f11626e
            if (r8 != r9) goto L_0x0121
            int r8 = r6.f11630i
            j3.i$f r6 = r6.f11623b
            int r6 = r6.getRootAlpha()
            if (r8 != r6) goto L_0x0121
            r6 = r7
            goto L_0x0122
        L_0x0121:
            r6 = r4
        L_0x0122:
            if (r6 != 0) goto L_0x0155
            j3.i$g r6 = r0.f11571b
            android.graphics.Bitmap r8 = r6.f11627f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f11627f
            r14.<init>(r8)
            j3.i$f r11 = r6.f11623b
            j3.i$c r12 = r11.f11613g
            android.graphics.Matrix r13 = j3.i.f.f11606p
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            j3.i$g r3 = r0.f11571b
            android.content.res.ColorStateList r6 = r3.f11624c
            r3.f11628g = r6
            android.graphics.PorterDuff$Mode r6 = r3.f11625d
            r3.f11629h = r6
            j3.i$f r6 = r3.f11623b
            int r6 = r6.getRootAlpha()
            r3.f11630i = r6
            boolean r6 = r3.f11626e
            r3.f11631j = r6
            r3.f11632k = r4
        L_0x0155:
            j3.i$g r3 = r0.f11571b
            android.graphics.Rect r6 = r0.f11578p
            j3.i$f r8 = r3.f11623b
            int r8 = r8.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r9) goto L_0x0164
            r4 = r7
        L_0x0164:
            r8 = 0
            if (r4 != 0) goto L_0x016b
            if (r2 != 0) goto L_0x016b
            r2 = r8
            goto L_0x018b
        L_0x016b:
            android.graphics.Paint r4 = r3.f11633l
            if (r4 != 0) goto L_0x0179
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f11633l = r4
            r4.setFilterBitmap(r7)
        L_0x0179:
            android.graphics.Paint r4 = r3.f11633l
            j3.i$f r7 = r3.f11623b
            int r7 = r7.getRootAlpha()
            r4.setAlpha(r7)
            android.graphics.Paint r4 = r3.f11633l
            r4.setColorFilter(r2)
            android.graphics.Paint r2 = r3.f11633l
        L_0x018b:
            android.graphics.Bitmap r3 = r3.f11627f
            r1.drawBitmap(r3, r8, r6, r2)
            r1.restoreToCount(r5)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.C0166a.a(drawable);
        }
        return this.f11571b.f11623b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f11571b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f11573d;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f11569a != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f11569a.getConstantState());
        }
        this.f11571b.f11622a = getChangingConfigurations();
        return this.f11571b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f11571b.f11623b.f11615i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f11571b.f11623b.f11614h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.C0166a.d(drawable);
        }
        return this.f11571b.f11626e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f11571b;
            if (gVar != null) {
                f fVar = gVar.f11623b;
                if (fVar.f11620n == null) {
                    fVar.f11620n = Boolean.valueOf(fVar.f11613g.a());
                }
                if (fVar.f11620n.booleanValue() || ((colorStateList = this.f11571b.f11624c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11574e && super.mutate() == this) {
            this.f11571b = new g(this.f11571b);
            this.f11574e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        g gVar = this.f11571b;
        ColorStateList colorStateList = gVar.f11624c;
        if (!(colorStateList == null || (mode = gVar.f11625d) == null)) {
            this.f11572c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = gVar.f11623b;
        if (fVar.f11620n == null) {
            fVar.f11620n = Boolean.valueOf(fVar.f11613g.a());
        }
        if (fVar.f11620n.booleanValue()) {
            boolean b10 = gVar.f11623b.f11613g.b(iArr);
            gVar.f11632k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f11571b.f11623b.getRootAlpha() != i10) {
            this.f11571b.f11623b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            a.C0166a.e(drawable, z10);
        } else {
            this.f11571b.f11626e = z10;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f11573d = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            o1.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f11571b;
        if (gVar.f11624c != colorStateList) {
            gVar.f11624c = colorStateList;
            this.f11572c = a(colorStateList, gVar.f11625d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f11571b;
        if (gVar.f11625d != mode) {
            gVar.f11625d = mode;
            this.f11572c = a(gVar.f11624c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f11634a;

        public h(Drawable.ConstantState constantState) {
            this.f11634a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f11634a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f11634a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f11569a = (VectorDrawable) this.f11634a.newDrawable();
            return iVar;
        }

        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f11569a = (VectorDrawable) this.f11634a.newDrawable(resources);
            return iVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f11569a = (VectorDrawable) this.f11634a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public g.a[] f11602a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f11603b;

        /* renamed from: c  reason: collision with root package name */
        public int f11604c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f11605d;

        public e() {
        }

        public g.a[] getPathData() {
            return this.f11602a;
        }

        public String getPathName() {
            return this.f11603b;
        }

        public void setPathData(g.a[] aVarArr) {
            if (!n1.g.a(this.f11602a, aVarArr)) {
                this.f11602a = n1.g.e(aVarArr);
                return;
            }
            g.a[] aVarArr2 = this.f11602a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f13432a = aVarArr[i10].f13432a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f13433b;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i10].f13433b[i11] = fArr[i11];
                    i11++;
                }
            }
        }

        public e(e eVar) {
            this.f11603b = eVar.f11603b;
            this.f11605d = eVar.f11605d;
            this.f11602a = n1.g.e(eVar.f11602a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            android.graphics.drawable.Drawable r5 = r0.f11569a
            if (r5 == 0) goto L_0x0012
            o1.a.b.d(r5, r1, r2, r3, r4)
            return
        L_0x0012:
            j3.i$g r5 = r0.f11571b
            j3.i$f r6 = new j3.i$f
            r6.<init>()
            r5.f11623b = r6
            int[] r6 = j3.a.f11541a
            android.content.res.TypedArray r6 = m1.i.f(r1, r4, r3, r6)
            j3.i$g r7 = r0.f11571b
            j3.i$f r8 = r7.f11623b
            java.lang.String r9 = "tintMode"
            r10 = 6
            r11 = -1
            int r9 = m1.i.c(r6, r2, r9, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r9 == r15) goto L_0x0049
            if (r9 == r14) goto L_0x004b
            if (r9 == r13) goto L_0x0046
            switch(r9) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r7.f11625d = r12
            java.lang.String r9 = "tint"
            boolean r9 = m1.i.e(r2, r9)
            r12 = 0
            r10 = 1
            r13 = 2
            if (r9 == 0) goto L_0x00a5
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            r6.getValue(r10, r9)
            int r11 = r9.type
            if (r11 == r13) goto L_0x0086
            r13 = 28
            if (r11 < r13) goto L_0x0073
            r13 = 31
            if (r11 > r13) goto L_0x0073
            int r9 = r9.data
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            goto L_0x00a6
        L_0x0073:
            android.content.res.Resources r9 = r6.getResources()
            int r11 = r6.getResourceId(r10, r12)
            java.lang.ThreadLocal<android.util.TypedValue> r13 = m1.a.f13045a
            android.content.res.XmlResourceParser r11 = r9.getXml(r11)     // Catch:{ Exception -> 0x00a5 }
            android.content.res.ColorStateList r9 = m1.a.a(r9, r11, r4)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a6
        L_0x0086:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to resolve attribute at index "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r9 == 0) goto L_0x00aa
            r7.f11624c = r9
        L_0x00aa:
            boolean r9 = r7.f11626e
            java.lang.String r11 = "autoMirrored"
            boolean r11 = m1.i.e(r2, r11)
            if (r11 != 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            boolean r9 = r6.getBoolean(r14, r9)
        L_0x00b9:
            r7.f11626e = r9
            float r7 = r8.f11616j
            java.lang.String r9 = "viewportWidth"
            r11 = 7
            float r7 = m1.i.b(r6, r2, r9, r11, r7)
            r8.f11616j = r7
            float r7 = r8.f11617k
            java.lang.String r9 = "viewportHeight"
            r13 = 8
            float r7 = m1.i.b(r6, r2, r9, r13, r7)
            r8.f11617k = r7
            float r9 = r8.f11616j
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x03d0
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x03b5
            float r7 = r8.f11614h
            float r7 = r6.getDimension(r15, r7)
            r8.f11614h = r7
            float r7 = r8.f11615i
            r9 = 2
            float r7 = r6.getDimension(r9, r7)
            r8.f11615i = r7
            float r9 = r8.f11614h
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x039a
            int r7 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x037f
            float r7 = r8.getAlpha()
            java.lang.String r9 = "alpha"
            r14 = 4
            float r7 = m1.i.b(r6, r2, r9, r14, r7)
            r8.setAlpha(r7)
            java.lang.String r7 = r6.getString(r12)
            if (r7 == 0) goto L_0x0114
            r8.f11619m = r7
            v0.b<java.lang.String, java.lang.Object> r9 = r8.f11621o
            r9.put(r7, r8)
        L_0x0114:
            r6.recycle()
            int r6 = r21.getChangingConfigurations()
            r5.f11622a = r6
            r5.f11632k = r10
            j3.i$g r6 = r0.f11571b
            j3.i$f r7 = r6.f11623b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            j3.i$c r9 = r7.f11613g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r19 = r23.getDepth()
            int r11 = r19 + 1
            r19 = r10
        L_0x0139:
            if (r9 == r10) goto L_0x036a
            int r14 = r23.getDepth()
            if (r14 >= r11) goto L_0x0143
            if (r9 == r15) goto L_0x036a
        L_0x0143:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x0345
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            j3.i$c r15 = (j3.i.c) r15
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            java.lang.String r10 = "fillType"
            java.lang.String r12 = "pathData"
            if (r13 == 0) goto L_0x025a
            j3.i$b r9 = new j3.i$b
            r9.<init>()
            int[] r13 = j3.a.f11543c
            android.content.res.TypedArray r13 = m1.i.f(r1, r4, r3, r13)
            boolean r12 = m1.i.e(r2, r12)
            if (r12 != 0) goto L_0x0173
            r20 = r11
            goto L_0x0233
        L_0x0173:
            r12 = 0
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x017c
            r9.f11603b = r14
        L_0x017c:
            r12 = 2
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x0189
            n1.g$a[] r12 = n1.g.c(r14)
            r9.f11602a = r12
        L_0x0189:
            java.lang.String r12 = "fillColor"
            r14 = 1
            m1.b r12 = m1.i.a(r13, r2, r4, r12, r14)
            r9.f11581g = r12
            r12 = 12
            float r14 = r9.f11583i
            r20 = r11
            java.lang.String r11 = "fillAlpha"
            float r11 = m1.i.b(r13, r2, r11, r12, r14)
            r9.f11583i = r11
            java.lang.String r11 = "strokeLineCap"
            r12 = 8
            r14 = -1
            int r11 = m1.i.c(r13, r2, r11, r12, r14)
            android.graphics.Paint$Cap r14 = r9.f11587m
            if (r11 == 0) goto L_0x01ba
            r12 = 1
            if (r11 == r12) goto L_0x01b7
            r12 = 2
            if (r11 == r12) goto L_0x01b4
            goto L_0x01bc
        L_0x01b4:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01bc
        L_0x01b7:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01bc
        L_0x01ba:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01bc:
            r9.f11587m = r14
            java.lang.String r11 = "strokeLineJoin"
            r12 = 9
            r14 = -1
            int r11 = m1.i.c(r13, r2, r11, r12, r14)
            android.graphics.Paint$Join r12 = r9.f11588n
            if (r11 == 0) goto L_0x01d8
            r14 = 1
            if (r11 == r14) goto L_0x01d5
            r14 = 2
            if (r11 == r14) goto L_0x01d2
            goto L_0x01da
        L_0x01d2:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.BEVEL
            goto L_0x01da
        L_0x01d5:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.ROUND
            goto L_0x01da
        L_0x01d8:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.MITER
        L_0x01da:
            r9.f11588n = r12
            r11 = 10
            float r12 = r9.f11589o
            java.lang.String r14 = "strokeMiterLimit"
            float r11 = m1.i.b(r13, r2, r14, r11, r12)
            r9.f11589o = r11
            java.lang.String r11 = "strokeColor"
            r12 = 3
            m1.b r11 = m1.i.a(r13, r2, r4, r11, r12)
            r9.f11579e = r11
            r11 = 11
            float r12 = r9.f11582h
            java.lang.String r14 = "strokeAlpha"
            float r11 = m1.i.b(r13, r2, r14, r11, r12)
            r9.f11582h = r11
            float r11 = r9.f11580f
            java.lang.String r12 = "strokeWidth"
            r14 = 4
            float r11 = m1.i.b(r13, r2, r12, r14, r11)
            r9.f11580f = r11
            float r11 = r9.f11585k
            java.lang.String r12 = "trimPathEnd"
            r14 = 6
            float r11 = m1.i.b(r13, r2, r12, r14, r11)
            r9.f11585k = r11
            float r11 = r9.f11586l
            java.lang.String r12 = "trimPathOffset"
            r14 = 7
            float r11 = m1.i.b(r13, r2, r12, r14, r11)
            r9.f11586l = r11
            float r11 = r9.f11584j
            java.lang.String r12 = "trimPathStart"
            r14 = 5
            float r11 = m1.i.b(r13, r2, r12, r14, r11)
            r9.f11584j = r11
            r11 = 13
            int r12 = r9.f11604c
            int r10 = m1.i.c(r13, r2, r10, r11, r12)
            r9.f11604c = r10
        L_0x0233:
            r13.recycle()
            java.util.ArrayList<j3.i$d> r10 = r15.f11591b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x024a
            v0.b<java.lang.String, java.lang.Object> r10 = r7.f11621o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x024a:
            int r10 = r6.f11622a
            int r9 = r9.f11605d
            r9 = r9 | r10
            r6.f11622a = r9
            r11 = 0
            r13 = 7
            r14 = 5
            r16 = -1
            r19 = 0
            goto L_0x0342
        L_0x025a:
            r20 = r11
            r13 = 9
            r16 = -1
            java.lang.String r11 = "clip-path"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x02b7
            j3.i$a r9 = new j3.i$a
            r9.<init>()
            boolean r11 = m1.i.e(r2, r12)
            if (r11 != 0) goto L_0x0274
            goto L_0x029a
        L_0x0274:
            int[] r11 = j3.a.f11544d
            android.content.res.TypedArray r11 = m1.i.f(r1, r4, r3, r11)
            r12 = 0
            java.lang.String r14 = r11.getString(r12)
            if (r14 == 0) goto L_0x0283
            r9.f11603b = r14
        L_0x0283:
            r14 = 1
            java.lang.String r17 = r11.getString(r14)
            if (r17 == 0) goto L_0x0290
            n1.g$a[] r14 = n1.g.c(r17)
            r9.f11602a = r14
        L_0x0290:
            r14 = 2
            int r10 = m1.i.c(r11, r2, r10, r14, r12)
            r9.f11604c = r10
            r11.recycle()
        L_0x029a:
            java.util.ArrayList<j3.i$d> r10 = r15.f11591b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x02ae
            v0.b<java.lang.String, java.lang.Object> r10 = r7.f11621o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x02ae:
            int r10 = r6.f11622a
            int r9 = r9.f11605d
            r9 = r9 | r10
            r6.f11622a = r9
            goto L_0x033f
        L_0x02b7:
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x033f
            j3.i$c r9 = new j3.i$c
            r9.<init>()
            int[] r10 = j3.a.f11542b
            android.content.res.TypedArray r10 = m1.i.f(r1, r4, r3, r10)
            float r11 = r9.f11592c
            java.lang.String r12 = "rotation"
            r14 = 5
            float r11 = m1.i.b(r10, r2, r12, r14, r11)
            r9.f11592c = r11
            float r11 = r9.f11593d
            r12 = 1
            float r11 = r10.getFloat(r12, r11)
            r9.f11593d = r11
            float r11 = r9.f11594e
            r12 = 2
            float r11 = r10.getFloat(r12, r11)
            r9.f11594e = r11
            float r11 = r9.f11595f
            java.lang.String r12 = "scaleX"
            r13 = 3
            float r11 = m1.i.b(r10, r2, r12, r13, r11)
            r9.f11595f = r11
            float r11 = r9.f11596g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = m1.i.b(r10, r2, r12, r13, r11)
            r9.f11596g = r11
            float r11 = r9.f11597h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = m1.i.b(r10, r2, r12, r13, r11)
            r9.f11597h = r11
            float r11 = r9.f11598i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = m1.i.b(r10, r2, r12, r13, r11)
            r9.f11598i = r11
            r11 = 0
            java.lang.String r12 = r10.getString(r11)
            if (r12 == 0) goto L_0x031a
            r9.f11601l = r12
        L_0x031a:
            r9.c()
            r10.recycle()
            java.util.ArrayList<j3.i$d> r10 = r15.f11591b
            r10.add(r9)
            r8.push(r9)
            java.lang.String r10 = r9.getGroupName()
            if (r10 == 0) goto L_0x0337
            v0.b<java.lang.String, java.lang.Object> r10 = r7.f11621o
            java.lang.String r12 = r9.getGroupName()
            r10.put(r12, r9)
        L_0x0337:
            int r10 = r6.f11622a
            int r9 = r9.f11600k
            r9 = r9 | r10
            r6.f11622a = r9
            goto L_0x0342
        L_0x033f:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x0342:
            r10 = r14
            r12 = 3
            goto L_0x035c
        L_0x0345:
            r20 = r11
            r11 = r12
            r10 = 5
            r12 = 3
            r13 = 7
            r16 = -1
            if (r9 != r12) goto L_0x035c
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x035c
            r8.pop()
        L_0x035c:
            int r9 = r23.next()
            r15 = r12
            r10 = 1
            r13 = 8
            r14 = 4
            r12 = r11
            r11 = r20
            goto L_0x0139
        L_0x036a:
            if (r19 != 0) goto L_0x0377
            android.content.res.ColorStateList r1 = r5.f11624c
            android.graphics.PorterDuff$Mode r2 = r5.f11625d
            android.graphics.PorterDuffColorFilter r1 = r0.a(r1, r2)
            r0.f11572c = r1
            return
        L_0x0377:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r1.<init>(r2)
            throw r1
        L_0x037f:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x039a:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03b5:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x03d0:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public i(g gVar) {
        this.f11575f = true;
        this.f11576n = new float[9];
        this.f11577o = new Matrix();
        this.f11578p = new Rect();
        this.f11571b = gVar;
        this.f11572c = a(gVar.f11624c, gVar.f11625d);
    }

    /* compiled from: VectorDrawableCompat */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public m1.b f11579e;

        /* renamed from: f  reason: collision with root package name */
        public float f11580f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        public m1.b f11581g;

        /* renamed from: h  reason: collision with root package name */
        public float f11582h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f11583i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f11584j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f11585k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f11586l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f11587m = Paint.Cap.BUTT;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f11588n = Paint.Join.MITER;

        /* renamed from: o  reason: collision with root package name */
        public float f11589o = 4.0f;

        public b() {
        }

        public final boolean a() {
            if (this.f11581g.b() || this.f11579e.b()) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                m1.b r0 = r6.f11581g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f13047b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f13048c
                if (r1 == r4) goto L_0x001c
                r0.f13048c = r1
                r0 = r2
                goto L_0x001d
            L_0x001c:
                r0 = r3
            L_0x001d:
                m1.b r1 = r6.f11579e
                boolean r4 = r1.b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f13047b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f13048c
                if (r7 == r4) goto L_0x0036
                r1.f13048c = r7
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.i.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f11583i;
        }

        public int getFillColor() {
            return this.f11581g.f13048c;
        }

        public float getStrokeAlpha() {
            return this.f11582h;
        }

        public int getStrokeColor() {
            return this.f11579e.f13048c;
        }

        public float getStrokeWidth() {
            return this.f11580f;
        }

        public float getTrimPathEnd() {
            return this.f11585k;
        }

        public float getTrimPathOffset() {
            return this.f11586l;
        }

        public float getTrimPathStart() {
            return this.f11584j;
        }

        public void setFillAlpha(float f10) {
            this.f11583i = f10;
        }

        public void setFillColor(int i10) {
            this.f11581g.f13048c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f11582h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f11579e.f13048c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f11580f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f11585k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f11586l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f11584j = f10;
        }

        public b(b bVar) {
            super(bVar);
            this.f11579e = bVar.f11579e;
            this.f11580f = bVar.f11580f;
            this.f11582h = bVar.f11582h;
            this.f11581g = bVar.f11581g;
            this.f11604c = bVar.f11604c;
            this.f11583i = bVar.f11583i;
            this.f11584j = bVar.f11584j;
            this.f11585k = bVar.f11585k;
            this.f11586l = bVar.f11586l;
            this.f11587m = bVar.f11587m;
            this.f11588n = bVar.f11588n;
            this.f11589o = bVar.f11589o;
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f11590a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f11591b;

        /* renamed from: c  reason: collision with root package name */
        public float f11592c;

        /* renamed from: d  reason: collision with root package name */
        public float f11593d;

        /* renamed from: e  reason: collision with root package name */
        public float f11594e;

        /* renamed from: f  reason: collision with root package name */
        public float f11595f;

        /* renamed from: g  reason: collision with root package name */
        public float f11596g;

        /* renamed from: h  reason: collision with root package name */
        public float f11597h;

        /* renamed from: i  reason: collision with root package name */
        public float f11598i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f11599j;

        /* renamed from: k  reason: collision with root package name */
        public int f11600k;

        /* renamed from: l  reason: collision with root package name */
        public String f11601l;

        public c() {
            this.f11590a = new Matrix();
            this.f11591b = new ArrayList<>();
            this.f11592c = 0.0f;
            this.f11593d = 0.0f;
            this.f11594e = 0.0f;
            this.f11595f = 1.0f;
            this.f11596g = 1.0f;
            this.f11597h = 0.0f;
            this.f11598i = 0.0f;
            this.f11599j = new Matrix();
            this.f11601l = null;
        }

        public final boolean a() {
            for (int i10 = 0; i10 < this.f11591b.size(); i10++) {
                if (this.f11591b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f11591b.size(); i10++) {
                z10 |= this.f11591b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f11599j.reset();
            this.f11599j.postTranslate(-this.f11593d, -this.f11594e);
            this.f11599j.postScale(this.f11595f, this.f11596g);
            this.f11599j.postRotate(this.f11592c, 0.0f, 0.0f);
            this.f11599j.postTranslate(this.f11597h + this.f11593d, this.f11598i + this.f11594e);
        }

        public String getGroupName() {
            return this.f11601l;
        }

        public Matrix getLocalMatrix() {
            return this.f11599j;
        }

        public float getPivotX() {
            return this.f11593d;
        }

        public float getPivotY() {
            return this.f11594e;
        }

        public float getRotation() {
            return this.f11592c;
        }

        public float getScaleX() {
            return this.f11595f;
        }

        public float getScaleY() {
            return this.f11596g;
        }

        public float getTranslateX() {
            return this.f11597h;
        }

        public float getTranslateY() {
            return this.f11598i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f11593d) {
                this.f11593d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f11594e) {
                this.f11594e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f11592c) {
                this.f11592c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f11595f) {
                this.f11595f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f11596g) {
                this.f11596g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f11597h) {
                this.f11597h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f11598i) {
                this.f11598i = f10;
                c();
            }
        }

        public c(c cVar, v0.b<String, Object> bVar) {
            e eVar;
            this.f11590a = new Matrix();
            this.f11591b = new ArrayList<>();
            this.f11592c = 0.0f;
            this.f11593d = 0.0f;
            this.f11594e = 0.0f;
            this.f11595f = 1.0f;
            this.f11596g = 1.0f;
            this.f11597h = 0.0f;
            this.f11598i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11599j = matrix;
            this.f11601l = null;
            this.f11592c = cVar.f11592c;
            this.f11593d = cVar.f11593d;
            this.f11594e = cVar.f11594e;
            this.f11595f = cVar.f11595f;
            this.f11596g = cVar.f11596g;
            this.f11597h = cVar.f11597h;
            this.f11598i = cVar.f11598i;
            String str = cVar.f11601l;
            this.f11601l = str;
            this.f11600k = cVar.f11600k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f11599j);
            ArrayList<d> arrayList = cVar.f11591b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f11591b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        eVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f11591b.add(eVar);
                    String str2 = eVar.f11603b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat */
    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f11606p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f11607a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f11608b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f11609c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f11610d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f11611e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f11612f;

        /* renamed from: g  reason: collision with root package name */
        public final c f11613g;

        /* renamed from: h  reason: collision with root package name */
        public float f11614h;

        /* renamed from: i  reason: collision with root package name */
        public float f11615i;

        /* renamed from: j  reason: collision with root package name */
        public float f11616j;

        /* renamed from: k  reason: collision with root package name */
        public float f11617k;

        /* renamed from: l  reason: collision with root package name */
        public int f11618l;

        /* renamed from: m  reason: collision with root package name */
        public String f11619m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f11620n;

        /* renamed from: o  reason: collision with root package name */
        public final v0.b<String, Object> f11621o;

        public f() {
            this.f11609c = new Matrix();
            this.f11614h = 0.0f;
            this.f11615i = 0.0f;
            this.f11616j = 0.0f;
            this.f11617k = 0.0f;
            this.f11618l = 255;
            this.f11619m = null;
            this.f11620n = null;
            this.f11621o = new v0.b<>();
            this.f11613g = new c();
            this.f11607a = new Path();
            this.f11608b = new Path();
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r9v2 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            float f10;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f11590a.set(matrix);
            cVar2.f11590a.preConcat(cVar2.f11599j);
            canvas.save();
            ? r92 = 0;
            f fVar = this;
            int i12 = 0;
            while (i12 < cVar2.f11591b.size()) {
                d dVar = cVar2.f11591b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar2.f11590a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f11 = ((float) i10) / fVar.f11616j;
                    float f12 = ((float) i11) / fVar.f11617k;
                    float min = Math.min(f11, f12);
                    Matrix matrix2 = cVar2.f11590a;
                    fVar.f11609c.set(matrix2);
                    fVar.f11609c.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f13 = min;
                    float f14 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r92], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    if (max > 0.0f) {
                        f10 = Math.abs(f14) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        Path path = this.f11607a;
                        eVar.getClass();
                        path.reset();
                        g.a[] aVarArr = eVar.f11602a;
                        if (aVarArr != null) {
                            g.a.b(aVarArr, path);
                        }
                        Path path2 = this.f11607a;
                        this.f11608b.reset();
                        if (eVar instanceof a) {
                            Path path3 = this.f11608b;
                            if (eVar.f11604c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.f11608b.addPath(path2, this.f11609c);
                            canvas2.clipPath(this.f11608b);
                        } else {
                            b bVar = (b) eVar;
                            float f15 = bVar.f11584j;
                            if (!(f15 == 0.0f && bVar.f11585k == 1.0f)) {
                                float f16 = bVar.f11586l;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (bVar.f11585k + f16) % 1.0f;
                                if (this.f11612f == null) {
                                    this.f11612f = new PathMeasure();
                                }
                                this.f11612f.setPath(this.f11607a, r92);
                                float length = this.f11612f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path2.reset();
                                if (f19 > f20) {
                                    this.f11612f.getSegment(f19, length, path2, true);
                                    this.f11612f.getSegment(0.0f, f20, path2, true);
                                } else {
                                    this.f11612f.getSegment(f19, f20, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f11608b.addPath(path2, this.f11609c);
                            m1.b bVar2 = bVar.f11581g;
                            if (bVar2.f13046a != null) {
                                z10 = true;
                            } else {
                                z10 = r92;
                            }
                            if (z10 || bVar2.f13048c != 0) {
                                z11 = true;
                            } else {
                                z11 = r92;
                            }
                            if (z11) {
                                if (this.f11611e == null) {
                                    Paint paint = new Paint(1);
                                    this.f11611e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f11611e;
                                Shader shader = bVar2.f13046a;
                                if (shader != null) {
                                    z15 = true;
                                } else {
                                    z15 = r92;
                                }
                                if (z15) {
                                    shader.setLocalMatrix(this.f11609c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f11583i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i13 = bVar2.f13048c;
                                    float f21 = bVar.f11583i;
                                    PorterDuff.Mode mode = i.f11570q;
                                    paint2.setColor((i13 & 16777215) | (((int) (((float) Color.alpha(i13)) * f21)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                Path path4 = this.f11608b;
                                if (bVar.f11604c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas2.drawPath(this.f11608b, paint2);
                            }
                            m1.b bVar3 = bVar.f11579e;
                            if (bVar3.f13046a != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 || bVar3.f13048c != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (this.f11610d == null) {
                                    z14 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f11610d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z14 = true;
                                }
                                Paint paint4 = this.f11610d;
                                Paint.Join join = bVar.f11588n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f11587m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f11589o);
                                Shader shader2 = bVar3.f13046a;
                                if (shader2 == null) {
                                    z14 = false;
                                }
                                if (z14) {
                                    shader2.setLocalMatrix(this.f11609c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f11582h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i14 = bVar3.f13048c;
                                    float f22 = bVar.f11582h;
                                    PorterDuff.Mode mode2 = i.f11570q;
                                    paint4.setColor((i14 & 16777215) | (((int) (((float) Color.alpha(i14)) * f22)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(bVar.f11580f * f10 * f13);
                                canvas2.drawPath(this.f11608b, paint4);
                            }
                        }
                    }
                    fVar = this;
                    i12++;
                    r92 = 0;
                }
                int i15 = i10;
                int i16 = i11;
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11618l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f11618l = i10;
        }

        public f(f fVar) {
            this.f11609c = new Matrix();
            this.f11614h = 0.0f;
            this.f11615i = 0.0f;
            this.f11616j = 0.0f;
            this.f11617k = 0.0f;
            this.f11618l = 255;
            this.f11619m = null;
            this.f11620n = null;
            v0.b<String, Object> bVar = new v0.b<>();
            this.f11621o = bVar;
            this.f11613g = new c(fVar.f11613g, bVar);
            this.f11607a = new Path(fVar.f11607a);
            this.f11608b = new Path(fVar.f11608b);
            this.f11614h = fVar.f11614h;
            this.f11615i = fVar.f11615i;
            this.f11616j = fVar.f11616j;
            this.f11617k = fVar.f11617k;
            this.f11618l = fVar.f11618l;
            this.f11619m = fVar.f11619m;
            String str = fVar.f11619m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f11620n = fVar.f11620n;
        }
    }
}
