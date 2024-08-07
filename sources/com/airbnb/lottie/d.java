package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f4792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4793b;

    public /* synthetic */ d(LottieAnimationView lottieAnimationView, int i10) {
        this.f4792a = lottieAnimationView;
        this.f4793b = i10;
    }

    public final Object call() {
        LottieAnimationView lottieAnimationView = this.f4792a;
        int i10 = this.f4793b;
        if (!lottieAnimationView.f4747t) {
            return p.e(i10, lottieAnimationView.getContext(), (String) null);
        }
        Context context = lottieAnimationView.getContext();
        return p.e(i10, context, p.h(context, i10));
    }
}
