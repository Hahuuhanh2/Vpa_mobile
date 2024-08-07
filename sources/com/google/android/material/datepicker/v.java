package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import v1.c;

/* compiled from: MonthAdapter */
public final class v extends BaseAdapter {

    /* renamed from: n  reason: collision with root package name */
    public static final int f6213n = f0.i((Calendar) null).getMaximum(4);

    /* renamed from: o  reason: collision with root package name */
    public static final int f6214o = ((f0.i((Calendar) null).getMaximum(7) + f0.i((Calendar) null).getMaximum(5)) - 1);

    /* renamed from: a  reason: collision with root package name */
    public final Month f6215a;

    /* renamed from: b  reason: collision with root package name */
    public final DateSelector<?> f6216b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f6217c;

    /* renamed from: d  reason: collision with root package name */
    public b f6218d;

    /* renamed from: e  reason: collision with root package name */
    public final CalendarConstraints f6219e;

    /* renamed from: f  reason: collision with root package name */
    public final DayViewDecorator f6220f;

    public v(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f6215a = month;
        this.f6216b = dateSelector;
        this.f6219e = calendarConstraints;
        this.f6220f = dayViewDecorator;
        this.f6217c = dateSelector.s0();
    }

    public final int b() {
        Month month = this.f6215a;
        int i10 = this.f6219e.f6079e;
        int i11 = month.f6097a.get(7);
        if (i10 <= 0) {
            i10 = month.f6097a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + month.f6100d;
        }
        return i12;
    }

    /* renamed from: c */
    public final Long getItem(int i10) {
        if (i10 < b()) {
            return null;
        }
        int b10 = b();
        Month month = this.f6215a;
        if (i10 > (b10 + month.f6101e) - 1) {
            return null;
        }
        Calendar d10 = f0.d(month.f6097a);
        d10.set(5, (i10 - b()) + 1);
        return Long.valueOf(d10.getTimeInMillis());
    }

    public final void d(TextView textView, long j10, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        a aVar;
        boolean z13;
        if (textView != null) {
            Context context = textView.getContext();
            boolean z14 = true;
            if (f0.h().getTimeInMillis() == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f6216b.s().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                F f10 = ((c) it.next()).f16012a;
                if (f10 != null && ((Long) f10).longValue() == j10) {
                    z11 = true;
                    break;
                }
            }
            Iterator it2 = this.f6216b.s().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = false;
                    break;
                }
                S s10 = ((c) it2.next()).f16013b;
                if (s10 != null && ((Long) s10).longValue() == j10) {
                    z12 = true;
                    break;
                }
            }
            String c10 = f.c(context, j10, z10, z11, z12);
            textView.setContentDescription(c10);
            if (this.f6219e.f6077c.j0(j10)) {
                textView.setEnabled(true);
                Iterator it3 = this.f6216b.s0().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z13 = false;
                        break;
                    }
                    if (f0.a(j10) == f0.a(((Long) it3.next()).longValue())) {
                        z13 = true;
                        break;
                    }
                }
                textView.setSelected(z13);
                if (z13) {
                    aVar = (a) this.f6218d.f6121b;
                } else {
                    if (f0.h().getTimeInMillis() != j10) {
                        z14 = false;
                    }
                    if (z14) {
                        aVar = (a) this.f6218d.f6122c;
                    } else {
                        aVar = (a) this.f6218d.f6120a;
                    }
                }
            } else {
                textView.setEnabled(false);
                aVar = (a) this.f6218d.f6126g;
            }
            DayViewDecorator dayViewDecorator = this.f6220f;
            if (dayViewDecorator == null || i10 == -1) {
                aVar.b(textView);
                return;
            }
            int i11 = this.f6215a.f6099c;
            dayViewDecorator.getClass();
            aVar.b(textView);
            this.f6220f.getClass();
            this.f6220f.getClass();
            this.f6220f.getClass();
            this.f6220f.getClass();
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f6220f.getClass();
            textView.setContentDescription(c10);
        }
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.k(j10).equals(this.f6215a)) {
            Calendar d10 = f0.d(this.f6215a.f6097a);
            d10.setTimeInMillis(j10);
            int i10 = d10.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    public final int getCount() {
        return f6214o;
    }

    public final long getItemId(int i10) {
        return (long) (i10 / this.f6215a.f6100d);
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.b r1 = r5.f6218d
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.b r1 = new com.google.android.material.datepicker.b
            r1.<init>(r0)
            r5.f6218d = r1
        L_0x000f:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0026
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R$layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = -1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.Month r2 = r5.f6215a
            int r3 = r2.f6101e
            if (r7 < r3) goto L_0x0036
            goto L_0x005e
        L_0x0036:
            r8 = 1
            int r7 = r7 + r8
            r0.setTag(r2)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.setText(r2)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            r8 = r7
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            long r6 = r6.longValue()
            r5.d(r0, r6, r8)
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
