package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import be.c;
import be.d;
import be.e;
import com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager;
import ek.i;
import f0.b0;
import j$.time.DayOfWeek;
import j$.time.YearMonth;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import rk.l;
import sk.j;
import zd.b;

/* compiled from: CalendarView.kt */
public class CalendarView extends RecyclerView {
    public d<?> S0;
    public l<? super b, i> T0;
    public int U0;
    public int V0;
    public int W0;
    public String X0;
    public int Y0;
    public boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    public zd.d f8033a1 = zd.d.EndOfRow;

    /* renamed from: b1  reason: collision with root package name */
    public be.b f8034b1 = be.b.Square;

    /* renamed from: c1  reason: collision with root package name */
    public c f8035c1 = new c(0);

    /* renamed from: d1  reason: collision with root package name */
    public final a f8036d1 = new a(this);

    /* renamed from: e1  reason: collision with root package name */
    public final com.kizitonwose.calendar.view.internal.a f8037e1 = new com.kizitonwose.calendar.view.internal.a();

    /* renamed from: f1  reason: collision with root package name */
    public YearMonth f8038f1;

    /* renamed from: g1  reason: collision with root package name */
    public YearMonth f8039g1;

    /* renamed from: h1  reason: collision with root package name */
    public DayOfWeek f8040h1;

    /* compiled from: CalendarView.kt */
    public static final class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CalendarView f8041a;

        public a(CalendarView calendarView) {
            this.f8041a = calendarView;
        }

        public final void a(int i10, RecyclerView recyclerView) {
            j.f(recyclerView, "recyclerView");
            if (i10 == 0) {
                this.f8041a.getCalendarAdapter().t();
            }
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            j.f(recyclerView, "recyclerView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context) {
        super(context);
        j.f(context, "context");
    }

    /* access modifiers changed from: private */
    public final ce.b getCalendarAdapter() {
        RecyclerView.e adapter = getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarAdapter");
        return (ce.b) adapter;
    }

    private final MonthCalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.m layoutManager = getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager");
        return (MonthCalendarLayoutManager) layoutManager;
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static void r0(CalendarView calendarView) {
        j.f(calendarView, "this$0");
        calendarView.getCalendarAdapter().t();
    }

    public static IllegalStateException u0(String str) {
        return new IllegalStateException(b0.s("`", str, "` is not set. Have you called `setup()`?"));
    }

    public final d<?> getDayBinder() {
        return this.S0;
    }

    public final be.b getDaySize() {
        return this.f8034b1;
    }

    public final int getDayViewResource() {
        return this.U0;
    }

    public final e<?> getMonthFooterBinder() {
        return null;
    }

    public final int getMonthFooterResource() {
        return this.W0;
    }

    public final e<?> getMonthHeaderBinder() {
        return null;
    }

    public final int getMonthHeaderResource() {
        return this.V0;
    }

    public final c getMonthMargins() {
        return this.f8035c1;
    }

    public final l<b, i> getMonthScrollListener() {
        return this.T0;
    }

    public final String getMonthViewClass() {
        return this.X0;
    }

    public final int getOrientation() {
        return this.Y0;
    }

    public final zd.d getOutDateStyle() {
        return this.f8033a1;
    }

    public final boolean getScrollPaged() {
        return this.Z0;
    }

    public final void setDayBinder(d<?> dVar) {
        this.S0 = dVar;
        w0();
    }

    public final void setDaySize(be.b bVar) {
        j.f(bVar, "value");
        if (this.f8034b1 != bVar) {
            this.f8034b1 = bVar;
            w0();
        }
    }

    public final void setDayViewResource(int i10) {
        boolean z10;
        if (this.U0 != i10) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.U0 = i10;
                w0();
                return;
            }
            throw new IllegalStateException("Invalid 'dayViewResource' value.".toString());
        }
    }

    public final void setMonthFooterBinder(e<?> eVar) {
        w0();
    }

    public final void setMonthFooterResource(int i10) {
        if (this.W0 != i10) {
            this.W0 = i10;
            w0();
        }
    }

    public final void setMonthHeaderBinder(e<?> eVar) {
        w0();
    }

    public final void setMonthHeaderResource(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            w0();
        }
    }

    public final void setMonthMargins(c cVar) {
        j.f(cVar, "value");
        if (!j.a(this.f8035c1, cVar)) {
            this.f8035c1 = cVar;
            w0();
        }
    }

    public final void setMonthScrollListener(l<? super b, i> lVar) {
        this.T0 = lVar;
    }

    public final void setMonthViewClass(String str) {
        if (!j.a(this.X0, str)) {
            this.X0 = str;
            w0();
        }
    }

    public final void setOrientation(int i10) {
        MonthCalendarLayoutManager monthCalendarLayoutManager;
        if (this.Y0 != i10) {
            this.Y0 = i10;
            RecyclerView.m layoutManager = getLayoutManager();
            if (layoutManager instanceof MonthCalendarLayoutManager) {
                monthCalendarLayoutManager = (MonthCalendarLayoutManager) layoutManager;
            } else {
                monthCalendarLayoutManager = null;
            }
            if (monthCalendarLayoutManager != null) {
                monthCalendarLayoutManager.r1(i10);
            }
        }
    }

    public final void setOutDateStyle(zd.d dVar) {
        j.f(dVar, "value");
        if (this.f8033a1 != dVar) {
            this.f8033a1 = dVar;
            if (getAdapter() != null) {
                ce.b calendarAdapter = getCalendarAdapter();
                YearMonth yearMonth = this.f8038f1;
                if (yearMonth != null) {
                    YearMonth yearMonth2 = this.f8039g1;
                    if (yearMonth2 != null) {
                        zd.d dVar2 = this.f8033a1;
                        DayOfWeek dayOfWeek = this.f8040h1;
                        if (dayOfWeek != null) {
                            calendarAdapter.getClass();
                            j.f(dVar2, "outDateStyle");
                            calendarAdapter.f4726f = yearMonth;
                            calendarAdapter.f4725e = dVar2;
                            calendarAdapter.f4727n = dayOfWeek;
                            calendarAdapter.f4728o = ((int) ChronoUnit.MONTHS.between(yearMonth, yearMonth2)) + 1;
                            calendarAdapter.f4729p.clear();
                            calendarAdapter.f();
                            return;
                        }
                        throw u0("firstDayOfWeek");
                    }
                    throw u0("endMonth");
                }
                throw u0("startMonth");
            }
        }
    }

    public final void setScrollPaged(boolean z10) {
        CalendarView calendarView;
        if (this.Z0 != z10) {
            this.Z0 = z10;
            com.kizitonwose.calendar.view.internal.a aVar = this.f8037e1;
            if (z10) {
                calendarView = this;
            } else {
                calendarView = null;
            }
            aVar.a(calendarView);
        }
    }

    public final void setup(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek) {
        boolean z10;
        j.f(yearMonth, "startMonth");
        j.f(yearMonth2, "endMonth");
        j.f(dayOfWeek, "firstDayOfWeek");
        if (yearMonth2.compareTo(yearMonth) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f8038f1 = yearMonth;
            this.f8039g1 = yearMonth2;
            this.f8040h1 = dayOfWeek;
            a aVar = this.f8036d1;
            ArrayList arrayList = this.f2989r0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            j(this.f8036d1);
            setLayoutManager(new MonthCalendarLayoutManager(this));
            setAdapter(new ce.b(this, this.f8033a1, yearMonth, yearMonth2, dayOfWeek));
            return;
        }
        throw new IllegalStateException(("startMonth: " + yearMonth + " is greater than endMonth: " + yearMonth2).toString());
    }

    public final b t0() {
        ce.b calendarAdapter = getCalendarAdapter();
        RecyclerView.m layoutManager = calendarAdapter.f4724d.getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager");
        int Z02 = ((MonthCalendarLayoutManager) layoutManager).Z0();
        if (Z02 == -1) {
            return null;
        }
        return calendarAdapter.f4729p.get(Integer.valueOf(Z02));
    }

    public final void v0(AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        if (!isInEditMode()) {
            setItemAnimator((RecyclerView.j) null);
            boolean z11 = true;
            setHasFixedSize(true);
            Context context = getContext();
            j.e(context, "getContext(...)");
            int[] iArr = R$styleable.CalendarView;
            j.e(iArr, "CalendarView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            setDayViewResource(obtainStyledAttributes.getResourceId(R$styleable.CalendarView_cv_dayViewResource, this.U0));
            setMonthHeaderResource(obtainStyledAttributes.getResourceId(R$styleable.CalendarView_cv_monthHeaderResource, this.V0));
            setMonthFooterResource(obtainStyledAttributes.getResourceId(R$styleable.CalendarView_cv_monthFooterResource, this.W0));
            setOrientation(obtainStyledAttributes.getInt(R$styleable.CalendarView_cv_orientation, this.Y0));
            int i12 = R$styleable.CalendarView_cv_scrollPaged;
            if (this.Y0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrollPaged(obtainStyledAttributes.getBoolean(i12, z10));
            setDaySize(be.b.values()[obtainStyledAttributes.getInt(R$styleable.CalendarView_cv_daySize, this.f8034b1.ordinal())]);
            setOutDateStyle(zd.d.values()[obtainStyledAttributes.getInt(R$styleable.CalendarView_cv_outDateStyle, this.f8033a1.ordinal())]);
            setMonthViewClass(obtainStyledAttributes.getString(R$styleable.CalendarView_cv_monthViewClass));
            obtainStyledAttributes.recycle();
            if (this.U0 == 0) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
            }
        }
    }

    public final void w0() {
        Parcelable parcelable;
        if (getAdapter() != null && getLayoutManager() != null) {
            RecyclerView.m layoutManager = getLayoutManager();
            if (layoutManager != null) {
                parcelable = layoutManager.s0();
            } else {
                parcelable = null;
            }
            setAdapter(getAdapter());
            RecyclerView.m layoutManager2 = getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.r0(parcelable);
            }
            post(new fb.l(this, 2));
        }
    }

    public final void x0() {
        ce.b calendarAdapter = getCalendarAdapter();
        calendarAdapter.f3034a.c(0, calendarAdapter.f4728o);
    }

    public final void y0(YearMonth yearMonth) {
        MonthCalendarLayoutManager calendarLayoutManager = getCalendarLayoutManager();
        int x12 = calendarLayoutManager.x1(yearMonth);
        if (x12 != -1) {
            calendarLayoutManager.q1(x12, 0);
            calendarLayoutManager.M.post(new d.i(calendarLayoutManager, 24));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        v0(attributeSet, 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        v0(attributeSet, i10, i10);
    }
}
