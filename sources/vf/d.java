package vf;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import sf.b;
import uf.b;

/* compiled from: DropAnimation */
public final class d extends a<AnimatorSet> {

    /* renamed from: d  reason: collision with root package name */
    public int f23268d;

    /* renamed from: e  reason: collision with root package name */
    public int f23269e;

    /* renamed from: f  reason: collision with root package name */
    public int f23270f;

    /* renamed from: g  reason: collision with root package name */
    public int f23271g;

    /* renamed from: h  reason: collision with root package name */
    public int f23272h;

    /* renamed from: i  reason: collision with root package name */
    public b f23273i = new b();

    public d(b.a aVar) {
        super(aVar);
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final ValueAnimator d(int i10, int i11, long j10, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new c(this, i12));
        return ofInt;
    }
}
