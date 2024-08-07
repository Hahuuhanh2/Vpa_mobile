package j3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: AnimatedVectorDrawableCompat */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f11566a;

    public e(d dVar) {
        this.f11566a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f11566a.f11558e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).a(this.f11566a);
        }
    }

    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f11566a.f11558e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).b(this.f11566a);
        }
    }
}
