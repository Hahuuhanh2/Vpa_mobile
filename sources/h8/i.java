package h8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j3.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f10655a;

    public i(j jVar) {
        this.f10655a = jVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        i.super.setVisible(false, false);
        j jVar = this.f10655a;
        ArrayList arrayList = jVar.f10662f;
        if (arrayList != null && !jVar.f10663n) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(jVar);
            }
        }
    }
}
