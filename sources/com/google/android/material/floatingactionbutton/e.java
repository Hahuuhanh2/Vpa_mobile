package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.g;

/* compiled from: FloatingActionButtonImpl */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6287b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.C0065g f6288c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f6289d;

    public e(g gVar, boolean z10, d dVar) {
        this.f6289d = gVar;
        this.f6287b = z10;
        this.f6288c = dVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6286a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        int i10;
        g gVar = this.f6289d;
        gVar.f6310r = 0;
        gVar.f6304l = null;
        if (!this.f6286a) {
            FloatingActionButton floatingActionButton = gVar.f6314v;
            boolean z10 = this.f6287b;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            g.C0065g gVar2 = this.f6288c;
            if (gVar2 != null) {
                d dVar = (d) gVar2;
                dVar.f6284a.a(dVar.f6285b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f6289d.f6314v.b(0, this.f6287b);
        g gVar = this.f6289d;
        gVar.f6310r = 1;
        gVar.f6304l = animator;
        this.f6286a = false;
    }
}
