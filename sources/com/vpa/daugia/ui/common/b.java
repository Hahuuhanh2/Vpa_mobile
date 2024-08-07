package com.vpa.daugia.ui.common;

import android.graphics.Rect;
import android.transition.Transition;
import sk.j;

/* compiled from: DemoActivity.kt */
public final class b extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Rect f19923a;

    public b(Rect rect) {
        this.f19923a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        j.f(transition, "transition");
        return this.f19923a;
    }
}
