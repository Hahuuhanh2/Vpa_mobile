package com.vpa.daugia.module.qr;

import ai.c;
import al.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c7.j;
import ek.i;
import io.github.g00fy2.quickie.R$color;
import m1.e;
import n1.d;
import o1.a;
import rk.l;
import sk.k;

/* compiled from: QROverlayView.kt */
public final class QROverlayView extends FrameLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19826y = 0;

    /* renamed from: a  reason: collision with root package name */
    public final j f19827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19828b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19829c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19830d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f19831e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f19832f;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f19833n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f19834o;

    /* renamed from: p  reason: collision with root package name */
    public final float f19835p;

    /* renamed from: q  reason: collision with root package name */
    public final float f19836q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f19837r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f19838s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap f19839t;

    /* renamed from: u  reason: collision with root package name */
    public Canvas f19840u;

    /* renamed from: v  reason: collision with root package name */
    public float f19841v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f19842w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f19843x;

    /* compiled from: QROverlayView.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19844a = new a();

        public a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* compiled from: QROverlayView.kt */
    public static final class b extends k implements l<Boolean, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19845a = new b();

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return i.f20112a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context) {
        this(context, (AttributeSet) null, 6, 0);
        sk.j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        sk.j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QROverlayView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    private final int getAccentColor() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16843829, typedValue, true)) {
            return typedValue.data;
        }
        return k1.a.getColor(getContext(), R$color.quickie_accent_fallback);
    }

    public static /* synthetic */ void setCloseVisibilityAndOnClick$default(QROverlayView qROverlayView, boolean z10, rk.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f19844a;
        }
        qROverlayView.setCloseVisibilityAndOnClick(z10, aVar);
    }

    private final void setTintAndStateAwareBackground(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = this.f19828b;
            int i11 = this.f19829c;
            ColorStateList withAlpha = new ColorStateList(new int[][]{new int[]{16842919, 16842913}, new int[]{16842919, -16842913}, new int[]{-16842919, 16842913}, new int[0]}, new int[]{i10, i11, i11, i10}).withAlpha(g0.h0(153.0d));
            sk.j.e(withAlpha, "withAlpha(...)");
            a.b.h(background, withAlpha);
            view.setBackground(background);
        }
    }

    public static /* synthetic */ void setTorchVisibilityAndOnClick$default(QROverlayView qROverlayView, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = b.f19845a;
        }
        qROverlayView.setTorchVisibilityAndOnClick(z10, lVar);
    }

    public final void a() {
        int i10;
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(width, height);
        float f10 = this.f19841v;
        float f11 = 0.25f;
        if (f10 > 1.0f) {
            f11 = 0.25f * (1.0f / f10) * 1.5f;
        }
        float f12 = (float) min;
        float b10 = b(0.0f);
        this.f19837r.set(0.0f, 0.0f, (float) width, (float) height);
        RectF rectF = this.f19838s;
        RectF rectF2 = this.f19837r;
        rectF.set(rectF2.left + b10, rectF2.top + b10, rectF2.right - b10, rectF2.bottom - b10);
        int i02 = g0.i0(((float) ((-getPaddingTop()) + height)) - (f12 - (f11 * f12)));
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.f19827a.f4575d;
        sk.j.e(appCompatTextView, "titleTextView");
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        sk.j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (i02 - ((AppCompatTextView) this.f19827a.f4575d).getHeight()) / 2;
        appCompatTextView.setLayoutParams(marginLayoutParams);
        Object obj = this.f19827a.f4575d;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) obj;
        if (i02 < ((AppCompatTextView) obj).getHeight()) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        appCompatTextView2.setVisibility(i10);
    }

    public final float b(float f10) {
        return TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics());
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        sk.j.f(canvas, "canvas");
        Paint paint = this.f19832f;
        if (this.f19842w) {
            i10 = this.f19829c;
        } else {
            i10 = this.f19828b;
        }
        paint.setColor(i10);
        Canvas canvas2 = this.f19840u;
        sk.j.c(canvas2);
        canvas2.drawColor(this.f19830d);
        Canvas canvas3 = this.f19840u;
        sk.j.c(canvas3);
        RectF rectF = this.f19837r;
        float f10 = this.f19835p;
        canvas3.drawRoundRect(rectF, f10, f10, this.f19832f);
        Canvas canvas4 = this.f19840u;
        sk.j.c(canvas4);
        RectF rectF2 = this.f19838s;
        float f11 = this.f19836q;
        canvas4.drawRoundRect(rectF2, f11, f11, this.f19834o);
        if (this.f19843x) {
            Canvas canvas5 = this.f19840u;
            sk.j.c(canvas5);
            RectF rectF3 = this.f19838s;
            float f12 = this.f19836q;
            canvas5.drawRoundRect(rectF3, f12, f12, this.f19833n);
        }
        Bitmap bitmap = this.f19839t;
        sk.j.c(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f19831e);
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f19839t == null && getWidth() > 0 && getHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f19840u = new Canvas(createBitmap);
            this.f19839t = createBitmap;
            a();
        }
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public final void setCloseVisibilityAndOnClick(boolean z10, rk.a<i> aVar) {
        int i10;
        sk.j.f(aVar, "action");
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f19827a.f4573b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        ((AppCompatImageView) this.f19827a.f4573b).setOnClickListener(new c(aVar, 5));
        if (z10) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f19827a.f4573b;
            sk.j.e(appCompatImageView2, "closeImageView");
            setTintAndStateAwareBackground(appCompatImageView2);
        }
    }

    public final void setCustomIcon(Integer num) {
        if (num == null) {
            ((AppCompatTextView) this.f19827a.f4575d).setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (num.intValue() != 0) {
            try {
                Resources resources = getResources();
                int intValue = num.intValue();
                ThreadLocal<TypedValue> threadLocal = e.f13062a;
                Drawable a10 = e.a.a(resources, intValue, (Resources.Theme) null);
                if (a10 != null) {
                    float b10 = b(56.0f) / ((float) a10.getMinimumHeight());
                    if (b10 < 1.0f) {
                        a10.setBounds(0, 0, g0.i0(((float) a10.getMinimumWidth()) * b10), g0.i0(((float) a10.getMinimumHeight()) * b10));
                    } else {
                        a10.setBounds(0, 0, a10.getMinimumWidth(), a10.getMinimumHeight());
                    }
                    ((AppCompatTextView) this.f19827a.f4575d).setCompoundDrawables((Drawable) null, a10, (Drawable) null, (Drawable) null);
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    public final void setCustomText(int i10) {
        if (i10 != 0) {
            try {
                ((AppCompatTextView) this.f19827a.f4575d).setText(i10);
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    public final void setHighlighted(boolean z10) {
        if (this.f19842w != z10) {
            this.f19842w = z10;
            invalidate();
        }
    }

    public final void setHorizontalFrameRatio(float f10) {
        if (f10 > 1.0f) {
            this.f19841v = f10;
            a();
        }
    }

    public final void setLoading(boolean z10) {
        int i10;
        if (this.f19843x != z10) {
            this.f19843x = z10;
            LinearLayout linearLayout = (LinearLayout) this.f19827a.f4574c;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
        }
    }

    public final void setTorchState(boolean z10) {
        ((AppCompatImageView) this.f19827a.f4576e).setSelected(z10);
    }

    public final void setTorchVisibilityAndOnClick(boolean z10, l<? super Boolean, i> lVar) {
        int i10;
        sk.j.f(lVar, "action");
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f19827a.f4576e;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        ((AppCompatImageView) this.f19827a.f4576e).setOnClickListener(new hi.a(0, lVar));
        if (z10) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f19827a.f4576e;
            sk.j.e(appCompatImageView2, "torchImageView");
            setTintAndStateAwareBackground(appCompatImageView2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        sk.j.f(context, "context");
        this.f19827a = j.a(LayoutInflater.from(context), this);
        this.f19828b = k1.a.getColor(context, 2131100623);
        this.f19829c = getAccentColor();
        int d10 = d.d(0, g0.h0(196.35d));
        this.f19830d = d10;
        Paint paint = new Paint();
        paint.setAlpha(g0.h0(196.35d));
        this.f19831e = paint;
        this.f19832f = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setColor(d10);
        this.f19833n = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f19834o = paint3;
        this.f19835p = b(0.0f);
        this.f19836q = b(0.0f);
        this.f19837r = new RectF();
        this.f19838s = new RectF();
        this.f19841v = 1.0f;
        setWillNotDraw(false);
    }
}
