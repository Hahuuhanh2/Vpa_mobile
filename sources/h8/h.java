package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j3.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f10654a;

    public h(j jVar) {
        this.f10654a = jVar;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        j jVar = this.f10654a;
        ArrayList arrayList = jVar.f10662f;
        if (arrayList != null && !jVar.f10663n) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(jVar);
            }
        }
    }
}
