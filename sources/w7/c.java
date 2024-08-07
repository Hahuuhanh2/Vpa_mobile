package w7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.card.MaterialCardView;
import f8.j;
import java.util.WeakHashMap;
import l8.e;
import l8.h;
import l8.l;
import l8.m;
import o1.a;
import t7.b;
import w1.d0;
import w1.q0;

/* compiled from: MaterialCardViewHelper */
public final class c {

    /* renamed from: y  reason: collision with root package name */
    public static final double f16686y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z  reason: collision with root package name */
    public static final ColorDrawable f16687z;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f16688a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f16689b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final h f16690c;

    /* renamed from: d  reason: collision with root package name */
    public final h f16691d;

    /* renamed from: e  reason: collision with root package name */
    public int f16692e;

    /* renamed from: f  reason: collision with root package name */
    public int f16693f;

    /* renamed from: g  reason: collision with root package name */
    public int f16694g;

    /* renamed from: h  reason: collision with root package name */
    public int f16695h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f16696i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f16697j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f16698k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f16699l;

    /* renamed from: m  reason: collision with root package name */
    public m f16700m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f16701n;

    /* renamed from: o  reason: collision with root package name */
    public RippleDrawable f16702o;

    /* renamed from: p  reason: collision with root package name */
    public LayerDrawable f16703p;

    /* renamed from: q  reason: collision with root package name */
    public h f16704q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16705r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16706s;

    /* renamed from: t  reason: collision with root package name */
    public ValueAnimator f16707t;

    /* renamed from: u  reason: collision with root package name */
    public final TimeInterpolator f16708u;

    /* renamed from: v  reason: collision with root package name */
    public final int f16709v;

    /* renamed from: w  reason: collision with root package name */
    public final int f16710w;

    /* renamed from: x  reason: collision with root package name */
    public float f16711x = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f16687z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet, int i10) {
        int i11 = MaterialCardView.f5938v;
        this.f16688a = materialCardView;
        h hVar = new h(materialCardView.getContext(), attributeSet, i10, i11);
        this.f16690c = hVar;
        hVar.k(materialCardView.getContext());
        hVar.q();
        m mVar = hVar.f12778a.f12798a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R$styleable.CardView, i10, R$style.CardView);
        int i12 = R$styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i12)) {
            aVar.b(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f16691d = new h();
        h(new m(aVar));
        this.f16708u = j.d(materialCardView.getContext(), R$attr.motionEasingLinearInterpolator, b.f14885a);
        this.f16709v = j.c(materialCardView.getContext(), R$attr.motionDurationShort2, 300);
        this.f16710w = j.c(materialCardView.getContext(), R$attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(lb.b bVar, float f10) {
        if (bVar instanceof l) {
            return (float) ((1.0d - f16686y) * ((double) f10));
        }
        if (bVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float b10 = b(this.f16700m.f12825a, this.f16690c.j());
        lb.b bVar = this.f16700m.f12826b;
        h hVar = this.f16690c;
        float max = Math.max(b10, b(bVar, hVar.f12778a.f12798a.f12830f.a(hVar.h())));
        lb.b bVar2 = this.f16700m.f12827c;
        h hVar2 = this.f16690c;
        float b11 = b(bVar2, hVar2.f12778a.f12798a.f12831g.a(hVar2.h()));
        lb.b bVar3 = this.f16700m.f12828d;
        h hVar3 = this.f16690c;
        return Math.max(max, Math.max(b11, b(bVar3, hVar3.f12778a.f12798a.f12832h.a(hVar3.h()))));
    }

    public final LayerDrawable c() {
        if (this.f16702o == null) {
            this.f16704q = new h(this.f16700m);
            this.f16702o = new RippleDrawable(this.f16698k, (Drawable) null, this.f16704q);
        }
        if (this.f16703p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f16702o, this.f16691d, this.f16697j});
            this.f16703p = layerDrawable;
            layerDrawable.setId(2, R$id.mtrl_card_checked_layer_id);
        }
        return this.f16703p;
    }

    public final b d(Drawable drawable) {
        int i10;
        int i11;
        float f10;
        if (this.f16688a.getUseCompatPadding()) {
            float maxCardElevation = this.f16688a.getMaxCardElevation() * 1.5f;
            float f11 = 0.0f;
            if (i()) {
                f10 = a();
            } else {
                f10 = 0.0f;
            }
            int ceil = (int) Math.ceil((double) (maxCardElevation + f10));
            float maxCardElevation2 = this.f16688a.getMaxCardElevation();
            if (i()) {
                f11 = a();
            }
            i11 = (int) Math.ceil((double) (maxCardElevation2 + f11));
            i10 = ceil;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new b(drawable, i11, i10, i11, i10);
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        if (this.f16703p != null) {
            boolean z13 = false;
            if (this.f16688a.getUseCompatPadding()) {
                float maxCardElevation = this.f16688a.getMaxCardElevation() * 1.5f;
                float f11 = 0.0f;
                if (i()) {
                    f10 = a();
                } else {
                    f10 = 0.0f;
                }
                i13 = (int) Math.ceil((double) ((maxCardElevation + f10) * 2.0f));
                float maxCardElevation2 = this.f16688a.getMaxCardElevation();
                if (i()) {
                    f11 = a();
                }
                i12 = (int) Math.ceil((double) ((maxCardElevation2 + f11) * 2.0f));
            } else {
                i13 = 0;
                i12 = 0;
            }
            int i20 = this.f16694g;
            if ((i20 & 8388613) == 8388613) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i14 = ((i10 - this.f16692e) - this.f16693f) - i12;
            } else {
                i14 = this.f16692e;
            }
            if ((i20 & 80) == 80) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i15 = this.f16692e;
            } else {
                i15 = ((i11 - this.f16692e) - this.f16693f) - i13;
            }
            int i21 = i15;
            if ((i20 & 8388613) == 8388613) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i16 = this.f16692e;
            } else {
                i16 = ((i10 - this.f16692e) - this.f16693f) - i12;
            }
            if ((i20 & 80) == 80) {
                z13 = true;
            }
            if (z13) {
                i17 = ((i11 - this.f16692e) - this.f16693f) - i13;
            } else {
                i17 = this.f16692e;
            }
            MaterialCardView materialCardView = this.f16688a;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (d0.e.d(materialCardView) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f16703p.setLayerInset(2, i19, i17, i18, i21);
        }
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        int i10;
        Drawable drawable = this.f16697j;
        if (drawable != null) {
            int i11 = 0;
            float f11 = 0.0f;
            if (z11) {
                if (z10) {
                    f11 = 1.0f;
                }
                if (z10) {
                    f10 = 1.0f - this.f16711x;
                } else {
                    f10 = this.f16711x;
                }
                ValueAnimator valueAnimator = this.f16707t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f16707t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f16711x, f11});
                this.f16707t = ofFloat;
                ofFloat.addUpdateListener(new a(this, 0));
                this.f16707t.setInterpolator(this.f16708u);
                ValueAnimator valueAnimator2 = this.f16707t;
                if (z10) {
                    i10 = this.f16709v;
                } else {
                    i10 = this.f16710w;
                }
                valueAnimator2.setDuration((long) (((float) i10) * f10));
                this.f16707t.start();
                return;
            }
            if (z10) {
                i11 = 255;
            }
            drawable.setAlpha(i11);
            if (z10) {
                f11 = 1.0f;
            }
            this.f16711x = f11;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f16697j = mutate;
            a.b.h(mutate, this.f16699l);
            f(this.f16688a.isChecked(), false);
        } else {
            this.f16697j = f16687z;
        }
        LayerDrawable layerDrawable = this.f16703p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R$id.mtrl_card_checked_layer_id, this.f16697j);
        }
    }

    public final void h(m mVar) {
        this.f16700m = mVar;
        this.f16690c.setShapeAppearanceModel(mVar);
        h hVar = this.f16690c;
        hVar.D = !hVar.l();
        h hVar2 = this.f16691d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(mVar);
        }
        h hVar3 = this.f16704q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean i() {
        if (!this.f16688a.getPreventCornerOverlap() || !this.f16690c.l() || !this.f16688a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.f16688a.isClickable()) {
            return true;
        }
        View view = this.f16688a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable;
        Drawable drawable2 = this.f16696i;
        if (j()) {
            drawable = c();
        } else {
            drawable = this.f16691d;
        }
        this.f16696i = drawable;
        if (drawable2 == drawable) {
            return;
        }
        if (this.f16688a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f16688a.getForeground()).setDrawable(drawable);
        } else {
            this.f16688a.setForeground(d(drawable));
        }
    }

    public final void l() {
        boolean z10;
        float f10;
        boolean z11 = true;
        if (!this.f16688a.getPreventCornerOverlap() || this.f16690c.l()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !i()) {
            z11 = false;
        }
        float f11 = 0.0f;
        if (z11) {
            f10 = a();
        } else {
            f10 = 0.0f;
        }
        if (this.f16688a.getPreventCornerOverlap() && this.f16688a.getUseCompatPadding()) {
            f11 = (float) ((1.0d - f16686y) * ((double) this.f16688a.getCardViewRadius()));
        }
        int i10 = (int) (f10 - f11);
        MaterialCardView materialCardView = this.f16688a;
        Rect rect = this.f16689b;
        materialCardView.g(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
    }

    public final void m() {
        if (!this.f16705r) {
            this.f16688a.setBackgroundInternal(d(this.f16690c));
        }
        this.f16688a.setForeground(d(this.f16696i));
    }
}
