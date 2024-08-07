package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.fragment.app.d;
import androidx.fragment.app.l0;
import java.util.Objects;
import sk.j;

/* compiled from: DefaultSpecialEffectsController.kt */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f2602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2603b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2604c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l0.b f2605d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d.a f2606e;

    public e(d dVar, View view, boolean z10, l0.b bVar, d.a aVar) {
        this.f2602a = dVar;
        this.f2603b = view;
        this.f2604c = z10;
        this.f2605d = bVar;
        this.f2606e = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        j.f(animator, "anim");
        this.f2602a.f2663a.endViewTransition(this.f2603b);
        if (this.f2604c) {
            l0.b.C0024b bVar = this.f2605d.f2669a;
            View view = this.f2603b;
            j.e(view, "viewToAnimate");
            bVar.b(view);
        }
        this.f2606e.a();
        if (FragmentManager.J(2)) {
            Objects.toString(this.f2605d);
        }
    }
}
