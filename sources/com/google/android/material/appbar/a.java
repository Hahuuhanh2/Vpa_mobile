package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import l8.h;
import m9.b;
import o1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5652a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f5653b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ColorStateList f5654c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f5655d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Integer f5656e;

    public /* synthetic */ a(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, h hVar, Integer num) {
        this.f5652a = appBarLayout;
        this.f5653b = colorStateList;
        this.f5654c = colorStateList2;
        this.f5655d = hVar;
        this.f5656e = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        AppBarLayout appBarLayout = this.f5652a;
        ColorStateList colorStateList = this.f5653b;
        ColorStateList colorStateList2 = this.f5654c;
        h hVar = this.f5655d;
        Integer num2 = this.f5656e;
        int i10 = AppBarLayout.G;
        appBarLayout.getClass();
        int K = b.K(((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateList.getDefaultColor(), colorStateList2.getDefaultColor());
        hVar.n(ColorStateList.valueOf(K));
        if (!(appBarLayout.C == null || (num = appBarLayout.D) == null || !num.equals(num2))) {
            a.b.g(appBarLayout.C, K);
        }
        if (!appBarLayout.f5586y.isEmpty()) {
            Iterator it = appBarLayout.f5586y.iterator();
            while (it.hasNext()) {
                AppBarLayout.e eVar = (AppBarLayout.e) it.next();
                if (hVar.f12778a.f12800c != null) {
                    eVar.a();
                }
            }
        }
    }
}
