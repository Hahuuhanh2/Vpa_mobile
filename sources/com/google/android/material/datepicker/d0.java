package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

/* compiled from: SmoothCalendarLayoutManager */
public class d0 extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    public class a extends l {
        public a(Context context) {
            super(context);
        }

        public final float k(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public d0(int i10) {
        super(i10);
    }

    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.f3084a = i10;
        N0(aVar);
    }
}
