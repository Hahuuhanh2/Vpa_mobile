package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f6478a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f6479b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f6480c = new a();

    /* compiled from: StateListAnimator */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            if (oVar.f6479b == animator) {
                oVar.f6479b = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6480c);
        this.f6478a.add(bVar);
    }
}
