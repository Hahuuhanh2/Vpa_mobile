package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: MaterialSideContainerBackHelper */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10062a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10063b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f10064c;

    public h(i iVar, boolean z10, int i10) {
        this.f10064c = iVar;
        this.f10062a = z10;
        this.f10063b = i10;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f10064c.f10041b.setTranslationX(0.0f);
        this.f10064c.c(this.f10063b, 0.0f, this.f10062a);
    }
}
