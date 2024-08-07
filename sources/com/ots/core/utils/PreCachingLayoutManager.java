package com.ots.core.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kf.f;
import kf.h;
import sk.j;

/* compiled from: PreCachingLayoutManager.kt */
public final class PreCachingLayoutManager extends LinearLayoutManager {
    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        j.f(recyclerView, "recyclerView");
        j.f(wVar, "state");
        try {
            f fVar = new f(recyclerView.getContext());
            fVar.f3084a = i10;
            N0(fVar);
        } catch (Exception e10) {
            e10.getMessage();
            int i11 = h.f12560a;
        }
    }

    public final boolean O0() {
        return false;
    }

    public final int i1(RecyclerView.w wVar) {
        j.f(wVar, "state");
        return 600;
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        j.f(sVar, "recycler");
        j.f(wVar, "state");
        try {
            super.o0(sVar, wVar);
        } catch (IndexOutOfBoundsException unused) {
            int i10 = h.f12560a;
        }
    }
}
