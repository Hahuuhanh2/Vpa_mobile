package g3;

import android.animation.Animator;
import g3.d;

/* compiled from: CircularProgressDrawable */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f10300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f10301b;

    public c(d dVar, d.a aVar) {
        this.f10301b = dVar;
        this.f10300a = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f10301b.a(1.0f, this.f10300a, true);
        d.a aVar = this.f10300a;
        aVar.f10321k = aVar.f10315e;
        aVar.f10322l = aVar.f10316f;
        aVar.f10323m = aVar.f10317g;
        aVar.a((aVar.f10320j + 1) % aVar.f10319i.length);
        d dVar = this.f10301b;
        if (dVar.f10310f) {
            dVar.f10310f = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            d.a aVar2 = this.f10300a;
            if (aVar2.f10324n) {
                aVar2.f10324n = false;
                return;
            }
            return;
        }
        dVar.f10309e += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f10301b.f10309e = 0.0f;
    }
}
