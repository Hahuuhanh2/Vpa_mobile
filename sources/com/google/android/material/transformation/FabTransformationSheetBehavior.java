package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;
import m9.b;
import t7.h;
import w1.d0;
import w1.q0;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: p  reason: collision with root package name */
    public HashMap f7177p;

    public FabTransformationSheetBehavior() {
    }

    public final FabTransformationBehavior.b D(Context context, boolean z10) {
        int i10;
        if (z10) {
            i10 = R$animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i10 = R$animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f7171a = h.b(context, i10);
        bVar.f7172b = new b();
        return bVar;
    }

    public final void w(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f7177p = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.e) || !(((CoordinatorLayout.e) childAt.getLayoutParams()).f2067a instanceof FabTransformationScrimBehavior)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (childAt != view2 && !z12) {
                    if (!z10) {
                        HashMap hashMap = this.f7177p;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f7177p.get(childAt)).intValue();
                            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                            d0.d.s(childAt, intValue);
                        }
                    } else {
                        this.f7177p.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                        d0.d.s(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f7177p = null;
            }
        }
        super.w(view, view2, z10, z11);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
