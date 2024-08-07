package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import be.b;
import be.c;
import be.f;
import be.g;
import com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager;
import d.h;
import ek.i;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import rk.l;
import sk.j;
import zd.e;

/* compiled from: WeekCalendarView.kt */
public class WeekCalendarView extends RecyclerView {
    public l<? super e, i> S0;
    public int T0;
    public int U0;
    public int V0;
    public String W0;
    public boolean X0 = true;
    public b Y0 = b.Square;
    public c Z0 = new c(0);

    /* renamed from: a1  reason: collision with root package name */
    public final a f8042a1 = new a(this);

    /* renamed from: b1  reason: collision with root package name */
    public final com.kizitonwose.calendar.view.internal.a f8043b1 = new com.kizitonwose.calendar.view.internal.a();

    /* compiled from: WeekCalendarView.kt */
    public static final class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeekCalendarView f8044a;

        public a(WeekCalendarView weekCalendarView) {
            this.f8044a = weekCalendarView;
        }

        public final void a(int i10, RecyclerView recyclerView) {
            j.f(recyclerView, "recyclerView");
            if (i10 == 0) {
                this.f8044a.getCalendarAdapter().t();
            }
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            j.f(recyclerView, "recyclerView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context) {
        super(context);
        j.f(context, "context");
    }

    /* access modifiers changed from: private */
    public final de.b getCalendarAdapter() {
        RecyclerView.e adapter = getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarAdapter");
        return (de.b) adapter;
    }

    private final WeekCalendarLayoutManager getCalendarLayoutManager() {
        RecyclerView.m layoutManager = getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type com.kizitonwose.calendar.view.internal.weekcalendar.WeekCalendarLayoutManager");
        return (WeekCalendarLayoutManager) layoutManager;
    }

    public static void r0(WeekCalendarView weekCalendarView) {
        j.f(weekCalendarView, "this$0");
        weekCalendarView.getCalendarAdapter().t();
    }

    public final f<?> getDayBinder() {
        return null;
    }

    public final b getDaySize() {
        return this.Y0;
    }

    public final int getDayViewResource() {
        return this.T0;
    }

    public final boolean getScrollPaged() {
        return this.X0;
    }

    public final g<?> getWeekFooterBinder() {
        return null;
    }

    public final int getWeekFooterResource() {
        return this.V0;
    }

    public final g<?> getWeekHeaderBinder() {
        return null;
    }

    public final int getWeekHeaderResource() {
        return this.U0;
    }

    public final c getWeekMargins() {
        return this.Z0;
    }

    public final l<e, i> getWeekScrollListener() {
        return this.S0;
    }

    public final String getWeekViewClass() {
        return this.W0;
    }

    public final void setDayBinder(f<?> fVar) {
        u0();
    }

    public final void setDaySize(b bVar) {
        j.f(bVar, "value");
        if (this.Y0 != bVar) {
            this.Y0 = bVar;
            u0();
        }
    }

    public final void setDayViewResource(int i10) {
        boolean z10;
        if (this.T0 != i10) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.T0 = i10;
                u0();
                return;
            }
            throw new IllegalStateException("Invalid 'dayViewResource' value.".toString());
        }
    }

    public final void setScrollPaged(boolean z10) {
        WeekCalendarView weekCalendarView;
        if (this.X0 != z10) {
            this.X0 = z10;
            com.kizitonwose.calendar.view.internal.a aVar = this.f8043b1;
            if (z10) {
                weekCalendarView = this;
            } else {
                weekCalendarView = null;
            }
            aVar.a(weekCalendarView);
        }
    }

    public final void setWeekFooterBinder(g<?> gVar) {
        u0();
    }

    public final void setWeekFooterResource(int i10) {
        if (this.V0 != i10) {
            this.V0 = i10;
            u0();
        }
    }

    public final void setWeekHeaderBinder(g<?> gVar) {
        u0();
    }

    public final void setWeekHeaderResource(int i10) {
        if (this.U0 != i10) {
            this.U0 = i10;
            u0();
        }
    }

    public final void setWeekMargins(c cVar) {
        j.f(cVar, "value");
        if (!j.a(this.Z0, cVar)) {
            this.Z0 = cVar;
            u0();
        }
    }

    public final void setWeekScrollListener(l<? super e, i> lVar) {
        this.S0 = lVar;
    }

    public final void setWeekViewClass(String str) {
        if (!j.a(this.W0, str)) {
            this.W0 = str;
            u0();
        }
    }

    public final void setup(LocalDate localDate, LocalDate localDate2, DayOfWeek dayOfWeek) {
        boolean z10;
        j.f(localDate, "startDate");
        j.f(localDate2, "endDate");
        j.f(dayOfWeek, "firstDayOfWeek");
        if (localDate2.compareTo((ChronoLocalDate) localDate) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a aVar = this.f8042a1;
            ArrayList arrayList = this.f2989r0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            j(this.f8042a1);
            setLayoutManager(new WeekCalendarLayoutManager(this));
            setAdapter(new de.b(this, localDate, localDate2, dayOfWeek));
            return;
        }
        throw new IllegalStateException(("startDate: " + localDate + " is greater than endDate: " + localDate2).toString());
    }

    public final void t0(AttributeSet attributeSet, int i10, int i11) {
        if (!isInEditMode()) {
            setItemAnimator((RecyclerView.j) null);
            boolean z10 = true;
            setHasFixedSize(true);
            Context context = getContext();
            j.e(context, "getContext(...)");
            int[] iArr = R$styleable.WeekCalendarView;
            j.e(iArr, "WeekCalendarView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            setDayViewResource(obtainStyledAttributes.getResourceId(R$styleable.WeekCalendarView_cv_dayViewResource, this.T0));
            setWeekHeaderResource(obtainStyledAttributes.getResourceId(R$styleable.WeekCalendarView_cv_weekHeaderResource, this.U0));
            setWeekFooterResource(obtainStyledAttributes.getResourceId(R$styleable.WeekCalendarView_cv_weekFooterResource, this.V0));
            setScrollPaged(obtainStyledAttributes.getBoolean(R$styleable.WeekCalendarView_cv_scrollPaged, this.X0));
            setDaySize(b.values()[obtainStyledAttributes.getInt(R$styleable.WeekCalendarView_cv_daySize, this.Y0.ordinal())]);
            setWeekViewClass(obtainStyledAttributes.getString(R$styleable.WeekCalendarView_cv_weekViewClass));
            obtainStyledAttributes.recycle();
            if (this.X0) {
                this.f8043b1.a(this);
            }
            if (this.T0 == 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("No value set for `cv_dayViewResource` attribute.".toString());
            }
        }
    }

    public final void u0() {
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
            post(new h(this, 25));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        t0(attributeSet, 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WeekCalendarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        t0(attributeSet, i10, i10);
    }
}
