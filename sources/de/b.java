package de;

import ae.c;
import ae.d;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.WeekCalendarView;
import com.kizitonwose.calendar.view.internal.g;
import com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager;
import d.h;
import ek.i;
import fk.p;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import zd.e;
import zd.f;

/* compiled from: WeekCalendarAdapter.kt */
public final class b extends RecyclerView.e<c> {

    /* renamed from: d  reason: collision with root package name */
    public final WeekCalendarView f8952d;

    /* renamed from: e  reason: collision with root package name */
    public LocalDate f8953e;

    /* renamed from: f  reason: collision with root package name */
    public LocalDate f8954f;

    /* renamed from: n  reason: collision with root package name */
    public d f8955n;

    /* renamed from: o  reason: collision with root package name */
    public int f8956o;

    /* renamed from: p  reason: collision with root package name */
    public final ae.a<e> f8957p = new ae.a<>(new a(this));

    /* renamed from: q  reason: collision with root package name */
    public e f8958q;

    /* compiled from: WeekCalendarAdapter.kt */
    public static final class a extends k implements l<Integer, e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f8959a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(1);
            this.f8959a = bVar;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            b bVar = this.f8959a;
            LocalDate localDate = bVar.f8955n.f178a;
            LocalDate localDate2 = bVar.f8953e;
            LocalDate localDate3 = bVar.f8954f;
            j.f(localDate, "startDateAdjusted");
            j.f(localDate2, "desiredStartDate");
            j.f(localDate3, "desiredEndDate");
            LocalDate plusWeeks = localDate.plusWeeks((long) intValue);
            j.c(plusWeeks);
            return new c(plusWeeks, localDate2, localDate3).f177d;
        }
    }

    public b(WeekCalendarView weekCalendarView, LocalDate localDate, LocalDate localDate2, DayOfWeek dayOfWeek) {
        j.f(weekCalendarView, "calView");
        j.f(localDate, "startDate");
        j.f(localDate2, "endDate");
        j.f(dayOfWeek, "firstDayOfWeek");
        this.f8952d = weekCalendarView;
        this.f8953e = localDate;
        this.f8954f = localDate2;
        DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
        j.e(dayOfWeek2, "getDayOfWeek(...)");
        LocalDate minusDays = localDate.minusDays((long) (((dayOfWeek2.getValue() - dayOfWeek.getValue()) + 7) % 7));
        LocalDate plusDays = minusDays.plusWeeks((long) ((int) ChronoUnit.WEEKS.between(minusDays, localDate2))).plusDays(6);
        j.c(plusDays);
        this.f8955n = new d(minusDays, plusDays);
        this.f8956o = ((int) ChronoUnit.WEEKS.between(minusDays, plusDays)) + 1;
        r();
    }

    public final int c() {
        return this.f8956o;
    }

    public final long d(int i10) {
        return (long) ((f) p.M0(this.f8957p.get(Integer.valueOf(i10)).f17988a)).f17989a.hashCode();
    }

    public final void h(RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        this.f8952d.post(new h(this, 27));
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        c cVar = (c) a0Var;
        e eVar = this.f8957p.get(Integer.valueOf(i10));
        j.f(eVar, "week");
        if (cVar.f8960u != null) {
            if (cVar.f8963x != null) {
                cVar.getClass();
            } else {
                cVar.getClass();
                j.c((Object) null);
                throw null;
            }
        }
        cVar.f8962w.a(eVar.f17988a);
        if (cVar.f8961v == null) {
            return;
        }
        if (cVar.f8964y != null) {
            cVar.getClass();
            return;
        }
        cVar.getClass();
        j.c((Object) null);
        throw null;
    }

    public final void j(RecyclerView.a0 a0Var, int i10, List list) {
        c cVar = (c) a0Var;
        j.f(list, "payloads");
        if (list.isEmpty()) {
            i(cVar, i10);
            return;
        }
        for (Object next : list) {
            j.d(next, "null cannot be cast to non-null type com.kizitonwose.calendar.core.WeekDay");
            cVar.f8962w.b((f) next);
        }
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        j.f(recyclerView, "parent");
        be.c weekMargins = this.f8952d.getWeekMargins();
        be.b daySize = this.f8952d.getDaySize();
        Context context = this.f8952d.getContext();
        j.e(context, "getContext(...)");
        int dayViewResource = this.f8952d.getDayViewResource();
        int weekHeaderResource = this.f8952d.getWeekHeaderResource();
        int weekFooterResource = this.f8952d.getWeekFooterResource();
        String weekViewClass = this.f8952d.getWeekViewClass();
        be.f<?> dayBinder = this.f8952d.getDayBinder();
        j.d(dayBinder, "null cannot be cast to non-null type com.kizitonwose.calendar.view.WeekDayBinder<*>");
        com.kizitonwose.calendar.view.internal.d<Day> a10 = com.kizitonwose.calendar.view.internal.f.a(weekMargins, daySize, context, dayViewResource, weekHeaderResource, weekFooterResource, 1, weekViewClass, dayBinder);
        return new c(a10.f8061a, a10.f8062b, a10.f8063c, (g) p.M0(a10.f8064d), this.f8952d.getWeekHeaderBinder(), this.f8952d.getWeekFooterBinder());
    }

    public final void t() {
        boolean z10;
        boolean z11 = true;
        if (this.f8952d.getAdapter() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            RecyclerView.j jVar = this.f8952d.U;
            if (jVar == null || !jVar.l()) {
                z11 = false;
            }
            if (z11) {
                RecyclerView.j itemAnimator = this.f8952d.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m(new a(this));
                    return;
                }
                return;
            }
            RecyclerView.m layoutManager = this.f8952d.getLayoutManager();
            j.d(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager");
            int Z0 = ((WeekCalendarLayoutManager) layoutManager).Z0();
            if (Z0 != -1) {
                e eVar = this.f8957p.get(Integer.valueOf(Z0));
                if (!j.a(eVar, this.f8958q)) {
                    this.f8958q = eVar;
                    l<e, i> weekScrollListener = this.f8952d.getWeekScrollListener();
                    if (weekScrollListener != null) {
                        weekScrollListener.invoke(eVar);
                    }
                }
            }
        }
    }
}
