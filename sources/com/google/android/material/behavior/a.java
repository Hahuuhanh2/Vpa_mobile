package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.j;

/* compiled from: SwipeDismissBehavior */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f5748a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5748a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        boolean z10;
        boolean z11 = false;
        if (!this.f5748a.w(view)) {
            return false;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f5748a.f5737e;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.f5748a.f5734b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
