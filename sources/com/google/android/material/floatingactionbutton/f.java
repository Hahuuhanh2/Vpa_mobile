package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.g;

/* compiled from: FloatingActionButtonImpl */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6290a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g.C0065g f6291b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f6292c;

    public f(g gVar, boolean z10, d dVar) {
        this.f6292c = gVar;
        this.f6290a = z10;
        this.f6291b = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        g gVar = this.f6292c;
        gVar.f6310r = 0;
        gVar.f6304l = null;
        g.C0065g gVar2 = this.f6291b;
        if (gVar2 != null) {
            ((d) gVar2).f6284a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f6292c.f6314v.b(0, this.f6290a);
        g gVar = this.f6292c;
        gVar.f6310r = 2;
        gVar.f6304l = animator;
    }
}
