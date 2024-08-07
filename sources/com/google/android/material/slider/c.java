package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import com.google.android.material.internal.x;
import java.util.Iterator;
import q8.a;
import z.j;

/* compiled from: BaseSlider */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseSlider f6804a;

    public c(BaseSlider baseSlider) {
        this.f6804a = baseSlider;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        j e10 = x.e(this.f6804a);
        Iterator it = this.f6804a.f6781r.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) e10.f17753b).remove((a) it.next());
        }
    }
}
