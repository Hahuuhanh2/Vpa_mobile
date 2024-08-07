package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import i3.r;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ChangeTransform */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3469a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f3470b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f3471c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f3472d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f3473e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.e f3474f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.d f3475g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform f3476h;

    public a(ChangeTransform changeTransform, boolean z10, Matrix matrix, View view, ChangeTransform.e eVar, ChangeTransform.d dVar) {
        this.f3476h = changeTransform;
        this.f3471c = z10;
        this.f3472d = matrix;
        this.f3473e = view;
        this.f3474f = eVar;
        this.f3475g = dVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3469a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f3469a) {
            if (!this.f3471c || !this.f3476h.F) {
                this.f3473e.setTag(R$id.transition_transform, (Object) null);
                this.f3473e.setTag(R$id.parent_matrix, (Object) null);
            } else {
                this.f3470b.set(this.f3472d);
                this.f3473e.setTag(R$id.transition_transform, this.f3470b);
                ChangeTransform.e eVar = this.f3474f;
                View view = this.f3473e;
                float f10 = eVar.f3419a;
                float f11 = eVar.f3420b;
                float f12 = eVar.f3421c;
                float f13 = eVar.f3422d;
                float f14 = eVar.f3423e;
                float f15 = eVar.f3424f;
                float f16 = eVar.f3425g;
                float f17 = eVar.f3426h;
                String[] strArr = ChangeTransform.I;
                view.setTranslationX(f10);
                view.setTranslationY(f11);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.i.w(view, f12);
                view.setScaleX(f13);
                view.setScaleY(f14);
                view.setRotationX(f15);
                view.setRotationY(f16);
                view.setRotation(f17);
            }
        }
        r.f11068a.J0(this.f3473e, (Matrix) null);
        ChangeTransform.e eVar2 = this.f3474f;
        View view2 = this.f3473e;
        float f18 = eVar2.f3419a;
        float f19 = eVar2.f3420b;
        float f20 = eVar2.f3421c;
        float f21 = eVar2.f3422d;
        float f22 = eVar2.f3423e;
        float f23 = eVar2.f3424f;
        float f24 = eVar2.f3425g;
        float f25 = eVar2.f3426h;
        String[] strArr2 = ChangeTransform.I;
        view2.setTranslationX(f18);
        view2.setTranslationY(f19);
        WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
        d0.i.w(view2, f20);
        view2.setScaleX(f21);
        view2.setScaleY(f22);
        view2.setRotationX(f23);
        view2.setRotationY(f24);
        view2.setRotation(f25);
    }

    public final void onAnimationPause(Animator animator) {
        this.f3470b.set(this.f3475g.f3414a);
        this.f3473e.setTag(R$id.transition_transform, this.f3470b);
        ChangeTransform.e eVar = this.f3474f;
        View view = this.f3473e;
        float f10 = eVar.f3419a;
        float f11 = eVar.f3420b;
        float f12 = eVar.f3421c;
        float f13 = eVar.f3422d;
        float f14 = eVar.f3423e;
        float f15 = eVar.f3424f;
        float f16 = eVar.f3425g;
        float f17 = eVar.f3426h;
        String[] strArr = ChangeTransform.I;
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.w(view, f12);
        view.setScaleX(f13);
        view.setScaleY(f14);
        view.setRotationX(f15);
        view.setRotationY(f16);
        view.setRotation(f17);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.f3473e;
        String[] strArr = ChangeTransform.I;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
