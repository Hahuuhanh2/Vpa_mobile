package ce;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import be.c;
import com.kizitonwose.calendar.view.CalendarView;
import com.kizitonwose.calendar.view.internal.f;
import com.kizitonwose.calendar.view.internal.g;
import com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager;
import d.h;
import ek.i;
import fk.r;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.YearMonth;
import j$.time.temporal.ChronoUnit;
import java.util.List;
import rk.l;
import sk.j;
import sk.k;
import zd.d;

/* compiled from: MonthCalendarAdapter.kt */
public final class b extends RecyclerView.e<c> {

    /* renamed from: d  reason: collision with root package name */
    public final CalendarView f4724d;

    /* renamed from: e  reason: collision with root package name */
    public d f4725e;

    /* renamed from: f  reason: collision with root package name */
    public YearMonth f4726f;

    /* renamed from: n  reason: collision with root package name */
    public DayOfWeek f4727n;

    /* renamed from: o  reason: collision with root package name */
    public int f4728o;

    /* renamed from: p  reason: collision with root package name */
    public final ae.a<zd.b> f4729p = new ae.a<>(new a(this));

    /* renamed from: q  reason: collision with root package name */
    public zd.b f4730q;

    /* compiled from: MonthCalendarAdapter.kt */
    public static final class a extends k implements l<Integer, zd.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f4731a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(1);
            this.f4731a = bVar;
        }

        public final Object invoke(Object obj) {
            int i10;
            int intValue = ((Number) obj).intValue();
            b bVar = this.f4731a;
            YearMonth yearMonth = bVar.f4726f;
            DayOfWeek dayOfWeek = bVar.f4727n;
            d dVar = bVar.f4725e;
            j.f(yearMonth, "startMonth");
            j.f(dayOfWeek, "firstDayOfWeek");
            j.f(dVar, "outDateStyle");
            YearMonth plusMonths = yearMonth.plusMonths((long) intValue);
            j.c(plusMonths);
            LocalDate atDay = plusMonths.atDay(1);
            j.e(atDay, "atDay(...)");
            DayOfWeek dayOfWeek2 = atDay.getDayOfWeek();
            j.e(dayOfWeek2, "getDayOfWeek(...)");
            int value = ((dayOfWeek2.getValue() - dayOfWeek.getValue()) + 7) % 7;
            int lengthOfMonth = plusMonths.lengthOfMonth() + value;
            int i11 = lengthOfMonth % 7;
            int i12 = 0;
            if (i11 != 0) {
                i10 = 7 - i11;
            } else {
                i10 = 0;
            }
            if (dVar != d.EndOfRow) {
                i12 = (6 - ((lengthOfMonth + i10) / 7)) * 7;
            }
            return new ae.b(plusMonths, value, i10 + i12).f173g;
        }
    }

    public b(CalendarView calendarView, d dVar, YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek) {
        j.f(calendarView, "calView");
        j.f(dVar, "outDateStyle");
        j.f(yearMonth, "startMonth");
        j.f(yearMonth2, "endMonth");
        j.f(dayOfWeek, "firstDayOfWeek");
        this.f4724d = calendarView;
        this.f4725e = dVar;
        this.f4726f = yearMonth;
        this.f4727n = dayOfWeek;
        this.f4728o = ((int) ChronoUnit.MONTHS.between(yearMonth, yearMonth2)) + 1;
        r();
    }

    public final int c() {
        return this.f4728o;
    }

    public final long d(int i10) {
        return (long) this.f4729p.get(Integer.valueOf(i10)).f17980a.hashCode();
    }

    public final void h(RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        this.f4724d.post(new h(this, 26));
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        c cVar = (c) a0Var;
        zd.b bVar = this.f4729p.get(Integer.valueOf(i10));
        j.f(bVar, "month");
        if (cVar.f4732u != null) {
            if (cVar.f4735x != null) {
                cVar.getClass();
            } else {
                cVar.getClass();
                j.c((Object) null);
                throw null;
            }
        }
        int i11 = 0;
        for (T next : cVar.f4734w) {
            int i12 = i11 + 1;
            List<zd.a> list = null;
            if (i11 >= 0) {
                g gVar = (g) next;
                List<List<zd.a>> list2 = bVar.f17981b;
                j.f(list2, "<this>");
                if (i11 >= 0 && i11 <= j7.a.I(list2)) {
                    list = list2.get(i11);
                }
                List list3 = list;
                if (list3 == null) {
                    list3 = r.f20213a;
                }
                gVar.a(list3);
                i11 = i12;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        if (cVar.f4733v == null) {
            return;
        }
        if (cVar.f4736y != null) {
            cVar.getClass();
            return;
        }
        cVar.getClass();
        j.c((Object) null);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c A[LOOP:1: B:7:0x002c->B:10:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(androidx.recyclerview.widget.RecyclerView.a0 r3, int r4, java.util.List r5) {
        /*
            r2 = this;
            ce.c r3 = (ce.c) r3
            java.lang.String r0 = "payloads"
            sk.j.f(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0011
            r2.i(r3, r4)
            goto L_0x003f
        L_0x0011:
            java.util.Iterator r4 = r5.iterator()
        L_0x0015:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            java.lang.String r0 = "null cannot be cast to non-null type com.kizitonwose.calendar.core.CalendarDay"
            sk.j.d(r5, r0)
            zd.a r5 = (zd.a) r5
            java.util.List<com.kizitonwose.calendar.view.internal.g<zd.a>> r0 = r3.f4734w
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r0.next()
            com.kizitonwose.calendar.view.internal.g r1 = (com.kizitonwose.calendar.view.internal.g) r1
            boolean r1 = r1.b(r5)
            if (r1 == 0) goto L_0x002c
            goto L_0x0015
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.b.j(androidx.recyclerview.widget.RecyclerView$a0, int, java.util.List):void");
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        j.f(recyclerView, "parent");
        c monthMargins = this.f4724d.getMonthMargins();
        be.b daySize = this.f4724d.getDaySize();
        Context context = this.f4724d.getContext();
        j.e(context, "getContext(...)");
        int dayViewResource = this.f4724d.getDayViewResource();
        int monthHeaderResource = this.f4724d.getMonthHeaderResource();
        int monthFooterResource = this.f4724d.getMonthFooterResource();
        String monthViewClass = this.f4724d.getMonthViewClass();
        be.d<?> dayBinder = this.f4724d.getDayBinder();
        j.d(dayBinder, "null cannot be cast to non-null type com.kizitonwose.calendar.view.MonthDayBinder<*>");
        com.kizitonwose.calendar.view.internal.d<Day> a10 = f.a(monthMargins, daySize, context, dayViewResource, monthHeaderResource, monthFooterResource, 6, monthViewClass, dayBinder);
        return new c(a10.f8061a, a10.f8062b, a10.f8063c, a10.f8064d, this.f4724d.getMonthHeaderBinder(), this.f4724d.getMonthFooterBinder());
    }

    public final void t() {
        boolean z10;
        RecyclerView.a0 I;
        boolean z11 = true;
        if (this.f4724d.getAdapter() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            RecyclerView.j jVar = this.f4724d.U;
            if (jVar == null || !jVar.l()) {
                z11 = false;
            }
            if (z11) {
                RecyclerView.j itemAnimator = this.f4724d.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m(new a(this));
                    return;
                }
                return;
            }
            RecyclerView.m layoutManager = this.f4724d.getLayoutManager();
            j.d(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager");
            int Z0 = ((MonthCalendarLayoutManager) layoutManager).Z0();
            if (Z0 != -1) {
                zd.b bVar = this.f4729p.get(Integer.valueOf(Z0));
                if (!j.a(bVar, this.f4730q)) {
                    this.f4730q = bVar;
                    l<zd.b, i> monthScrollListener = this.f4724d.getMonthScrollListener();
                    if (monthScrollListener != null) {
                        monthScrollListener.invoke(bVar);
                    }
                    if (this.f4724d.getScrollPaged() && this.f4724d.getLayoutParams().height == -2 && (I = this.f4724d.I(Z0)) != null) {
                        I.f3013a.requestLayout();
                    }
                }
            }
        }
    }
}
