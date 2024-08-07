package com.kizitonwose.calendar.view.internal.weekcalendar;

import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import de.b;
import j$.time.LocalDate;
import sk.j;

/* compiled from: WeekCalendarLayoutManager.kt */
public final class WeekCalendarLayoutManager extends CalendarLayoutManager<LocalDate, LocalDate> {
    public final WeekCalendarView N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekCalendarLayoutManager(WeekCalendarView weekCalendarView) {
        super(0, weekCalendarView);
        j.f(weekCalendarView, "calView");
        this.N = weekCalendarView;
    }

    public final void w1() {
        RecyclerView.e adapter = this.N.getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarAdapter");
        ((b) adapter).t();
    }
}
