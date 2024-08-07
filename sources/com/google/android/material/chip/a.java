package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.r;
import com.google.android.material.internal.x;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l8.h;
import l8.n;
import n1.d;
import o1.a;

/* compiled from: ChipDrawable */
public final class a extends h implements Drawable.Callback, r.b {
    public static final int[] O0 = {16842910};
    public static final ShapeDrawable P0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0 = 255;
    public ColorFilter C0;
    public PorterDuffColorFilter D0;
    public ColorStateList E0;
    public ColorStateList F;
    public PorterDuff.Mode F0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList G;
    public int[] G0;
    public float H;
    public boolean H0;
    public float I = -1.0f;
    public ColorStateList I0;
    public ColorStateList J;
    public WeakReference<C0063a> J0 = new WeakReference<>((Object) null);
    public float K;
    public TextUtils.TruncateAt K0;
    public ColorStateList L;
    public boolean L0;
    public CharSequence M;
    public int M0;
    public boolean N;
    public boolean N0;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public RippleDrawable U;
    public ColorStateList V;
    public float W;
    public SpannableStringBuilder X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f6032a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f6033b0;

    /* renamed from: c0  reason: collision with root package name */
    public t7.h f6034c0;

    /* renamed from: d0  reason: collision with root package name */
    public t7.h f6035d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f6036e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f6037f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f6038g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f6039h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f6040i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f6041j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f6042k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f6043l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Context f6044m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Paint f6045n0 = new Paint(1);

    /* renamed from: o0  reason: collision with root package name */
    public final Paint.FontMetrics f6046o0 = new Paint.FontMetrics();

    /* renamed from: p0  reason: collision with root package name */
    public final RectF f6047p0 = new RectF();

    /* renamed from: q0  reason: collision with root package name */
    public final PointF f6048q0 = new PointF();

    /* renamed from: r0  reason: collision with root package name */
    public final Path f6049r0 = new Path();

    /* renamed from: s0  reason: collision with root package name */
    public final r f6050s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6051t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6052u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f6053v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f6054w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6055x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6056y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6057z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    public interface C0063a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, Chip.E);
        k(context);
        this.f6044m0 = context;
        r rVar = new r(this);
        this.f6050s0 = rVar;
        this.M = "";
        rVar.f6494a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = O0;
        setState(iArr);
        if (!Arrays.equals(this.G0, iArr)) {
            this.G0 = iArr;
            if (c0()) {
                F(getState(), iArr);
            }
        }
        this.L0 = true;
        P0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean D(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public final float A() {
        if (c0()) {
            return this.f6041j0 + this.W + this.f6042k0;
        }
        return 0.0f;
    }

    public final float B() {
        if (this.N0) {
            return j();
        }
        return this.I;
    }

    public final void E() {
        C0063a aVar = this.J0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean F(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.F;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.f6051t0);
        } else {
            i10 = 0;
        }
        int d10 = d(i10);
        boolean z15 = true;
        if (this.f6051t0 != d10) {
            this.f6051t0 = d10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.G;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.f6052u0);
        } else {
            i11 = 0;
        }
        int d11 = d(i11);
        if (this.f6052u0 != d11) {
            this.f6052u0 = d11;
            onStateChange = true;
        }
        int c10 = d.c(d11, d10);
        if (this.f6053v0 != c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12778a.f12800c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            this.f6053v0 = c10;
            n(ColorStateList.valueOf(c10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.J;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.f6054w0);
        } else {
            i12 = 0;
        }
        if (this.f6054w0 != i12) {
            this.f6054w0 = i12;
            onStateChange = true;
        }
        if (this.I0 == null || !j8.a.d(iArr)) {
            i13 = 0;
        } else {
            i13 = this.I0.getColorForState(iArr, this.f6055x0);
        }
        if (this.f6055x0 != i13) {
            this.f6055x0 = i13;
            if (this.H0) {
                onStateChange = true;
            }
        }
        i8.d dVar = this.f6050s0.f6500g;
        if (dVar == null || (colorStateList = dVar.f11205j) == null) {
            i14 = 0;
        } else {
            i14 = colorStateList.getColorForState(iArr, this.f6056y0);
        }
        if (this.f6056y0 != i14) {
            this.f6056y0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                } else if (state[i16] == 16842912) {
                    z12 = true;
                    break;
                } else {
                    i16++;
                }
            }
        }
        z12 = false;
        if (!z12 || !this.Y) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (this.f6057z0 == z13 || this.f6032a0 == null) {
            z14 = false;
        } else {
            float z16 = z();
            this.f6057z0 = z13;
            if (z16 != z()) {
                onStateChange = true;
                z14 = true;
            } else {
                z14 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.E0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.A0);
        } else {
            i15 = 0;
        }
        if (this.A0 != i15) {
            this.A0 = i15;
            ColorStateList colorStateList6 = this.E0;
            PorterDuff.Mode mode = this.F0;
            if (colorStateList6 == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            }
            this.D0 = porterDuffColorFilter;
        } else {
            z15 = onStateChange;
        }
        if (D(this.O)) {
            z15 |= this.O.setState(iArr);
        }
        if (D(this.f6032a0)) {
            z15 |= this.f6032a0.setState(iArr);
        }
        if (D(this.T)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z15 |= this.T.setState(iArr3);
        }
        if (D(this.U)) {
            z15 |= this.U.setState(iArr2);
        }
        if (z15) {
            invalidateSelf();
        }
        if (z14) {
            E();
        }
        return z15;
    }

    public final void G(boolean z10) {
        if (this.Y != z10) {
            this.Y = z10;
            float z11 = z();
            if (!z10 && this.f6057z0) {
                this.f6057z0 = false;
            }
            float z12 = z();
            invalidateSelf();
            if (z11 != z12) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.f6032a0 != drawable) {
            float z10 = z();
            this.f6032a0 = drawable;
            float z11 = z();
            d0(this.f6032a0);
            x(this.f6032a0);
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        boolean z10;
        if (this.f6033b0 != colorStateList) {
            this.f6033b0 = colorStateList;
            if (!this.Z || this.f6032a0 == null || !this.Y) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                a.b.h(this.f6032a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z10) {
        boolean z11;
        if (this.Z != z10) {
            boolean a02 = a0();
            this.Z = z10;
            boolean a03 = a0();
            if (a02 != a03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (a03) {
                    x(this.f6032a0);
                } else {
                    d0(this.f6032a0);
                }
                invalidateSelf();
                E();
            }
        }
    }

    @Deprecated
    public final void K(float f10) {
        if (this.I != f10) {
            this.I = f10;
            setShapeAppearanceModel(this.f12778a.f12798a.g(f10));
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.O;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = o1.a.d(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z10 = z();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.O = drawable4;
            float z11 = z();
            d0(drawable2);
            if (b0()) {
                x(this.O);
            }
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void M(float f10) {
        if (this.Q != f10) {
            float z10 = z();
            this.Q = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.R = true;
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (b0()) {
                a.b.h(this.O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z10) {
        boolean z11;
        if (this.N != z10) {
            boolean b02 = b0();
            this.N = z10;
            boolean b03 = b0();
            if (b02 != b03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (b03) {
                    x(this.O);
                } else {
                    d0(this.O);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (this.N0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f10) {
        if (this.K != f10) {
            this.K = f10;
            this.f6045n0.setStrokeWidth(f10);
            if (this.N0) {
                t(f10);
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.T;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = o1.a.d(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.T = drawable4;
            this.U = new RippleDrawable(j8.a.c(this.L), this.T, P0);
            float A2 = A();
            d0(drawable2);
            if (c0()) {
                x(this.T);
            }
            invalidateSelf();
            if (A != A2) {
                E();
            }
        }
    }

    public final void S(float f10) {
        if (this.f6042k0 != f10) {
            this.f6042k0 = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void T(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void U(float f10) {
        if (this.f6041j0 != f10) {
            this.f6041j0 = f10;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (c0()) {
                a.b.h(this.T, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        if (this.S != z10) {
            boolean c02 = c0();
            this.S = z10;
            boolean c03 = c0();
            if (c02 != c03) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (c03) {
                    x(this.T);
                } else {
                    d0(this.T);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void X(float f10) {
        if (this.f6038g0 != f10) {
            float z10 = z();
            this.f6038g0 = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void Y(float f10) {
        if (this.f6037f0 != f10) {
            float z10 = z();
            this.f6037f0 = f10;
            float z11 = z();
            invalidateSelf();
            if (z10 != z11) {
                E();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.H0) {
                colorStateList2 = j8.a.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.I0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void a() {
        E();
        invalidateSelf();
    }

    public final boolean a0() {
        if (!this.Z || this.f6032a0 == null || !this.f6057z0) {
            return false;
        }
        return true;
    }

    public final boolean b0() {
        if (!this.N || this.O == null) {
            return false;
        }
        return true;
    }

    public final boolean c0() {
        if (!this.S || this.T == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.B0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            if (!this.N0) {
                this.f6045n0.setColor(this.f6051t0);
                this.f6045n0.setStyle(Paint.Style.FILL);
                this.f6047p0.set(bounds);
                canvas2.drawRoundRect(this.f6047p0, B(), B(), this.f6045n0);
            }
            if (!this.N0) {
                this.f6045n0.setColor(this.f6052u0);
                this.f6045n0.setStyle(Paint.Style.FILL);
                Paint paint = this.f6045n0;
                ColorFilter colorFilter = this.C0;
                if (colorFilter == null) {
                    colorFilter = this.D0;
                }
                paint.setColorFilter(colorFilter);
                this.f6047p0.set(bounds);
                canvas2.drawRoundRect(this.f6047p0, B(), B(), this.f6045n0);
            }
            if (this.N0) {
                super.draw(canvas);
            }
            if (this.K > 0.0f && !this.N0) {
                this.f6045n0.setColor(this.f6054w0);
                this.f6045n0.setStyle(Paint.Style.STROKE);
                if (!this.N0) {
                    Paint paint2 = this.f6045n0;
                    ColorFilter colorFilter2 = this.C0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.D0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f6047p0;
                float f10 = this.K / 2.0f;
                rectF.set(((float) bounds.left) + f10, ((float) bounds.top) + f10, ((float) bounds.right) - f10, ((float) bounds.bottom) - f10);
                float f11 = this.I - (this.K / 2.0f);
                canvas2.drawRoundRect(this.f6047p0, f11, f11, this.f6045n0);
            }
            this.f6045n0.setColor(this.f6055x0);
            this.f6045n0.setStyle(Paint.Style.FILL);
            this.f6047p0.set(bounds);
            if (!this.N0) {
                canvas2.drawRoundRect(this.f6047p0, B(), B(), this.f6045n0);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f6049r0;
                n nVar = this.f12795y;
                h.b bVar = this.f12778a;
                nVar.a(bVar.f12798a, bVar.f12807j, rectF2, this.f12794x, path);
                f(canvas, this.f6045n0, this.f6049r0, this.f12778a.f12798a, h());
            }
            if (b0()) {
                y(bounds, this.f6047p0);
                RectF rectF3 = this.f6047p0;
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                canvas2.translate(f12, f13);
                this.O.setBounds(0, 0, (int) this.f6047p0.width(), (int) this.f6047p0.height());
                this.O.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (a0()) {
                y(bounds, this.f6047p0);
                RectF rectF4 = this.f6047p0;
                float f14 = rectF4.left;
                float f15 = rectF4.top;
                canvas2.translate(f14, f15);
                this.f6032a0.setBounds(0, 0, (int) this.f6047p0.width(), (int) this.f6047p0.height());
                this.f6032a0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (!this.L0 || this.M == null) {
                i12 = i11;
                i13 = 0;
                i14 = 255;
            } else {
                PointF pointF = this.f6048q0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.M != null) {
                    float z11 = z() + this.f6036e0 + this.f6039h0;
                    if (a.c.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + z11;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - z11;
                        align = Paint.Align.RIGHT;
                    }
                    this.f6050s0.f6494a.getFontMetrics(this.f6046o0);
                    Paint.FontMetrics fontMetrics = this.f6046o0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f6047p0;
                rectF5.setEmpty();
                if (this.M != null) {
                    float z12 = z() + this.f6036e0 + this.f6039h0;
                    float A = A() + this.f6043l0 + this.f6040i0;
                    if (a.c.a(this) == 0) {
                        rectF5.left = ((float) bounds.left) + z12;
                        rectF5.right = ((float) bounds.right) - A;
                    } else {
                        rectF5.left = ((float) bounds.left) + A;
                        rectF5.right = ((float) bounds.right) - z12;
                    }
                    rectF5.top = (float) bounds.top;
                    rectF5.bottom = (float) bounds.bottom;
                }
                r rVar = this.f6050s0;
                if (rVar.f6500g != null) {
                    rVar.f6494a.drawableState = getState();
                    r rVar2 = this.f6050s0;
                    rVar2.f6500g.e(this.f6044m0, rVar2.f6494a, rVar2.f6495b);
                }
                this.f6050s0.f6494a.setTextAlign(align);
                if (Math.round(this.f6050s0.a(this.M.toString())) > Math.round(this.f6047p0.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas2.clipRect(this.f6047p0);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence = this.M;
                if (z10 && this.K0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f6050s0.f6494a, this.f6047p0.width(), this.K0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f6048q0;
                i12 = i11;
                float f16 = pointF2.x;
                i13 = 0;
                float f17 = pointF2.y;
                i14 = 255;
                canvas.drawText(charSequence2, 0, length, f16, f17, this.f6050s0.f6494a);
                if (z10) {
                    canvas2.restoreToCount(i15);
                }
            }
            if (c0()) {
                RectF rectF6 = this.f6047p0;
                rectF6.setEmpty();
                if (c0()) {
                    float f18 = this.f6043l0 + this.f6042k0;
                    if (a.c.a(this) == 0) {
                        float f19 = ((float) bounds.right) - f18;
                        rectF6.right = f19;
                        rectF6.left = f19 - this.W;
                    } else {
                        float f20 = ((float) bounds.left) + f18;
                        rectF6.left = f20;
                        rectF6.right = f20 + this.W;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f21 = this.W;
                    float f22 = exactCenterY - (f21 / 2.0f);
                    rectF6.top = f22;
                    rectF6.bottom = f22 + f21;
                }
                RectF rectF7 = this.f6047p0;
                float f23 = rectF7.left;
                float f24 = rectF7.top;
                canvas2.translate(f23, f24);
                this.T.setBounds(i13, i13, (int) this.f6047p0.width(), (int) this.f6047p0.height());
                this.U.setBounds(this.T.getBounds());
                this.U.jumpToCurrentState();
                this.U.draw(canvas2);
                canvas2.translate(-f23, -f24);
            }
            if (this.B0 < i14) {
                canvas2.restoreToCount(i12);
            }
        }
    }

    public final int getAlpha() {
        return this.B0;
    }

    public final ColorFilter getColorFilter() {
        return this.C0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.H;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(A() + this.f6050s0.a(this.M.toString()) + z() + this.f6036e0 + this.f6039h0 + this.f6040i0 + this.f6043l0), this.M0);
    }

    public final int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.I);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.H, this.I);
        }
        outline.setAlpha(((float) this.B0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (C(this.F) || C(this.G) || C(this.J)) {
            return true;
        }
        if (this.H0 && C(this.I0)) {
            return true;
        }
        i8.d dVar = this.f6050s0.f6500g;
        if (dVar == null || (colorStateList = dVar.f11205j) == null || !colorStateList.isStateful()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        if (!this.Z || this.f6032a0 == null || !this.Y) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || D(this.O) || D(this.f6032a0) || C(this.E0)) {
            return true;
        }
        return false;
    }

    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (b0()) {
            onLayoutDirectionChanged |= a.c.b(this.O, i10);
        }
        if (a0()) {
            onLayoutDirectionChanged |= a.c.b(this.f6032a0, i10);
        }
        if (c0()) {
            onLayoutDirectionChanged |= a.c.b(this.T, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (b0()) {
            onLevelChange |= this.O.setLevel(i10);
        }
        if (a0()) {
            onLevelChange |= this.f6032a0.setLevel(i10);
        }
        if (c0()) {
            onLevelChange |= this.T.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.N0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.G0);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.C0 != colorFilter) {
            this.C0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.F0 != mode) {
            this.F0 = mode;
            ColorStateList colorStateList = this.E0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.D0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (b0()) {
            visible |= this.O.setVisible(z10, z11);
        }
        if (a0()) {
            visible |= this.f6032a0.setVisible(z10, z11);
        }
        if (c0()) {
            visible |= this.T.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            a.c.b(drawable, a.c.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.T) {
                if (drawable.isStateful()) {
                    drawable.setState(this.G0);
                }
                a.b.h(drawable, this.V);
                return;
            }
            Drawable drawable2 = this.O;
            if (drawable == drawable2 && this.R) {
                a.b.h(drawable2, this.P);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void y(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (b0() || a0()) {
            float f11 = this.f6036e0 + this.f6037f0;
            if (this.f6057z0) {
                drawable = this.f6032a0;
            } else {
                drawable = this.O;
            }
            float f12 = this.Q;
            if (f12 <= 0.0f && drawable != null) {
                f12 = (float) drawable.getIntrinsicWidth();
            }
            if (a.c.a(this) == 0) {
                float f13 = ((float) rect.left) + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = ((float) rect.right) - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.f6057z0) {
                drawable2 = this.f6032a0;
            } else {
                drawable2 = this.O;
            }
            float f15 = this.Q;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil((double) x.c(this.f6044m0, 24));
                if (((float) drawable2.getIntrinsicHeight()) <= f15) {
                    f10 = (float) drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public final float z() {
        Drawable drawable;
        if (!b0() && !a0()) {
            return 0.0f;
        }
        float f10 = this.f6037f0;
        if (this.f6057z0) {
            drawable = this.f6032a0;
        } else {
            drawable = this.O;
        }
        float f11 = this.Q;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f6038g0;
    }
}
