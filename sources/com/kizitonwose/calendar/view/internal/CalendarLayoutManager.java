package com.kizitonwose.calendar.view.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import sk.j;

/* compiled from: CalendarLayoutManager.kt */
public abstract class CalendarLayoutManager<IndexData, DayData> extends LinearLayoutManager {
    public final RecyclerView M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarLayoutManager(int i10, RecyclerView recyclerView) {
        super(i10);
        j.f(recyclerView, "calView");
        recyclerView.getContext();
        this.M = recyclerView;
    }

    public abstract void w1();
}
