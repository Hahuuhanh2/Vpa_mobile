package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f7156a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7157a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f7158b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d8.a f7159c;

        public a(View view, int i10, d8.a aVar) {
            this.f7157a = view;
            this.f7158b = i10;
            this.f7159c = aVar;
        }

        public final boolean onPreDraw() {
            this.f7157a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f7156a == this.f7158b) {
                d8.a aVar = this.f7159c;
                expandableBehavior.w((View) aVar, this.f7157a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public abstract boolean f(View view, View view2);

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        int i10;
        d8.a aVar = (d8.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f7156a != 1 : !((i10 = this.f7156a) == 0 || i10 == 2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f7156a = i11;
        w((View) aVar, view, aVar.a(), true);
        return true;
    }

    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        d8.a aVar;
        boolean z10;
        int i11;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (!d0.g.c(view)) {
            ArrayList o10 = coordinatorLayout.o(view);
            int size = o10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) o10.get(i12);
                if (f(view, view2)) {
                    aVar = (d8.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f7156a != 1 : !((i11 = this.f7156a) == 0 || i11 == 2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f7156a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
