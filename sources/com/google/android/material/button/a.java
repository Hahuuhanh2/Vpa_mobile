package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.R$attr;
import java.util.WeakHashMap;
import l8.h;
import l8.m;
import l8.q;
import m9.b;
import o1.a;
import w1.d0;
import w1.q0;

/* compiled from: MaterialButtonHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f5915a;

    /* renamed from: b  reason: collision with root package name */
    public m f5916b;

    /* renamed from: c  reason: collision with root package name */
    public int f5917c;

    /* renamed from: d  reason: collision with root package name */
    public int f5918d;

    /* renamed from: e  reason: collision with root package name */
    public int f5919e;

    /* renamed from: f  reason: collision with root package name */
    public int f5920f;

    /* renamed from: g  reason: collision with root package name */
    public int f5921g;

    /* renamed from: h  reason: collision with root package name */
    public int f5922h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f5923i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5924j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5925k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5926l;

    /* renamed from: m  reason: collision with root package name */
    public h f5927m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5928n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5929o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5930p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5931q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5932r = true;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f5933s;

    /* renamed from: t  reason: collision with root package name */
    public int f5934t;

    public a(MaterialButton materialButton, m mVar) {
        this.f5915a = materialButton;
        this.f5916b = mVar;
    }

    public final q a() {
        RippleDrawable rippleDrawable = this.f5933s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f5933s.getNumberOfLayers() > 2) {
            return (q) this.f5933s.getDrawable(2);
        }
        return (q) this.f5933s.getDrawable(1);
    }

    public final h b(boolean z10) {
        RippleDrawable rippleDrawable = this.f5933s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (h) ((LayerDrawable) ((InsetDrawable) this.f5933s.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0);
    }

    public final void c(m mVar) {
        this.f5916b = mVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(mVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(mVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(mVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.f5915a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        int f10 = d0.e.f(materialButton);
        int paddingTop = this.f5915a.getPaddingTop();
        int e10 = d0.e.e(this.f5915a);
        int paddingBottom = this.f5915a.getPaddingBottom();
        int i12 = this.f5919e;
        int i13 = this.f5920f;
        this.f5920f = i11;
        this.f5919e = i10;
        if (!this.f5929o) {
            e();
        }
        d0.e.k(this.f5915a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        MaterialButton materialButton = this.f5915a;
        h hVar = new h(this.f5916b);
        hVar.k(this.f5915a.getContext());
        a.b.h(hVar, this.f5924j);
        PorterDuff.Mode mode = this.f5923i;
        if (mode != null) {
            a.b.i(hVar, mode);
        }
        ColorStateList colorStateList = this.f5925k;
        hVar.t((float) this.f5922h);
        hVar.s(colorStateList);
        h hVar2 = new h(this.f5916b);
        hVar2.setTint(0);
        float f10 = (float) this.f5922h;
        if (this.f5928n) {
            i10 = b.A(R$attr.colorSurface, this.f5915a);
        } else {
            i10 = 0;
        }
        hVar2.t(f10);
        hVar2.s(ColorStateList.valueOf(i10));
        h hVar3 = new h(this.f5916b);
        this.f5927m = hVar3;
        a.b.g(hVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(j8.a.c(this.f5926l), new InsetDrawable(new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f5917c, this.f5919e, this.f5918d, this.f5920f), this.f5927m);
        this.f5933s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b10 = b(false);
        if (b10 != null) {
            b10.m((float) this.f5934t);
            b10.setState(this.f5915a.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        h b10 = b(false);
        h b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f5925k;
            b10.t((float) this.f5922h);
            b10.s(colorStateList);
            if (b11 != null) {
                float f10 = (float) this.f5922h;
                if (this.f5928n) {
                    i10 = b.A(R$attr.colorSurface, this.f5915a);
                }
                b11.t(f10);
                b11.s(ColorStateList.valueOf(i10));
            }
        }
    }
}
