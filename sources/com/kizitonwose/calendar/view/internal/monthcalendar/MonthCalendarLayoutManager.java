package com.kizitonwose.calendar.view.internal.monthcalendar;

import androidx.recyclerview.widget.RecyclerView;
import ce.b;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.internal.CalendarLayoutManager;
import j$.time.YearMonth;
import j$.time.temporal.ChronoUnit;
import sk.j;
import zd.a;

/* compiled from: MonthCalendarLayoutManager.kt */
public final class MonthCalendarLayoutManager extends CalendarLayoutManager<YearMonth, a> {
    public final CalendarView N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthCalendarLayoutManager(CalendarView calendarView) {
        super(calendarView.getOrientation(), calendarView);
        j.f(calendarView, "calView");
        this.N = calendarView;
    }

    public final void w1() {
        RecyclerView.e adapter = this.N.getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarAdapter");
        ((b) adapter).t();
    }

    public final int x1(Object obj) {
        RecyclerView.e adapter = this.N.getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarAdapter");
        YearMonth yearMonth = ((b) adapter).f4726f;
        j.f(yearMonth, "startMonth");
        return (int) ChronoUnit.MONTHS.between(yearMonth, (YearMonth) obj);
    }
}
