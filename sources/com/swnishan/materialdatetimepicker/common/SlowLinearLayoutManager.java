package com.swnishan.materialdatetimepicker.common;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import sk.j;

/* compiled from: SlowLinearLayoutManager.kt */
public final class SlowLinearLayoutManager extends LinearLayoutManager {
    public RecyclerView M;
    public a N;

    /* compiled from: SlowLinearLayoutManager.kt */
    public interface a {
        void a();
    }

    /* compiled from: SlowLinearLayoutManager.kt */
    public static final class b extends l {
        public b(Context context) {
            super(context);
        }

        public final float k(DisplayMetrics displayMetrics) {
            j.f(displayMetrics, "displayMetrics");
            return 400.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public SlowLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public final void G0(Rect rect, int i10, int i11) {
        int i12 = 0;
        if (H() > 0) {
            View G = G(0);
            if (G != null) {
                int measuredHeight = G.getMeasuredHeight();
                RecyclerView recyclerView = this.M;
                if (recyclerView != null) {
                    recyclerView.setPadding(getPaddingLeft(), measuredHeight, getPaddingRight(), measuredHeight);
                }
                i12 = View.MeasureSpec.makeMeasureSpec(measuredHeight * 3, 1073741824);
                a aVar = this.N;
                if (aVar != null) {
                    aVar.a();
                }
            } else {
                return;
            }
        }
        if (i12 > 0) {
            i11 = i12;
        }
        super.G0(rect, i10, i11);
    }

    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        j.f(recyclerView, "recyclerView");
        j.f(wVar, "state");
        b bVar = new b(recyclerView.getContext());
        bVar.f3084a = i10;
        N0(bVar);
    }

    public SlowLinearLayoutManager(LowFlingRecyclerView lowFlingRecyclerView, a aVar) {
        super(1);
        this.M = lowFlingRecyclerView;
        this.N = aVar;
    }
}
