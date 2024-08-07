package com.google.android.material.internal;

import android.view.View;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ViewUtils */
public final class y implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.h.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
