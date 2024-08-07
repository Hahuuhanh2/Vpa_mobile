package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.j;
import java.util.Calendar;
import java.util.WeakHashMap;
import w1.c0;
import w1.d0;
import w1.q0;

/* compiled from: MonthsPagerAdapter */
public final class x extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final CalendarConstraints f6223d;

    /* renamed from: e  reason: collision with root package name */
    public final DateSelector<?> f6224e;

    /* renamed from: f  reason: collision with root package name */
    public final DayViewDecorator f6225f;

    /* renamed from: n  reason: collision with root package name */
    public final j.d f6226n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6227o;

    /* compiled from: MonthsPagerAdapter */
    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f6228u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f6229v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
            this.f6228u = textView;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            new c0(androidx.core.R$id.tag_accessibility_heading).e(textView, Boolean.TRUE);
            this.f6229v = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public x(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, j.c cVar) {
        int i10;
        Month month = calendarConstraints.f6075a;
        Month month2 = calendarConstraints.f6076b;
        Month month3 = calendarConstraints.f6078d;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.compareTo(month2) <= 0) {
            int i11 = v.f6213n;
            int i12 = j.f6163s0;
            Resources resources = contextThemeWrapper.getResources();
            int i13 = R$dimen.mtrl_calendar_day_height;
            int dimensionPixelSize = resources.getDimensionPixelSize(i13) * i11;
            if (r.q0(contextThemeWrapper)) {
                i10 = contextThemeWrapper.getResources().getDimensionPixelSize(i13);
            } else {
                i10 = 0;
            }
            this.f6227o = dimensionPixelSize + i10;
            this.f6223d = calendarConstraints;
            this.f6224e = dateSelector;
            this.f6225f = dayViewDecorator;
            this.f6226n = cVar;
            r();
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int c() {
        return this.f6223d.f6081n;
    }

    public final long d(int i10) {
        Calendar d10 = f0.d(this.f6223d.f6075a.f6097a);
        d10.add(2, i10);
        return new Month(d10).f6097a.getTimeInMillis();
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        a aVar = (a) a0Var;
        Calendar d10 = f0.d(this.f6223d.f6075a.f6097a);
        d10.add(2, i10);
        Month month = new Month(d10);
        aVar.f6228u.setText(month.m());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f6229v.findViewById(R$id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !month.equals(materialCalendarGridView.getAdapter().f6215a)) {
            v vVar = new v(month, this.f6224e, this.f6223d, this.f6225f);
            materialCalendarGridView.setNumColumns(month.f6100d);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            v a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f6217c) {
                a10.e(materialCalendarGridView, longValue.longValue());
            }
            DateSelector<?> dateSelector = a10.f6216b;
            if (dateSelector != null) {
                for (Long longValue2 : dateSelector.s0()) {
                    a10.e(materialCalendarGridView, longValue2.longValue());
                }
                a10.f6217c = a10.f6216b.s0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!r.q0(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f6227o));
        return new a(linearLayout, true);
    }
}
