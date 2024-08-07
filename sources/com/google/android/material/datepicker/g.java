package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: DaysOfWeekAdapter */
public final class g extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f6151d;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6152a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6153b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6154c;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f6151d = i10;
    }

    public g() {
        Calendar i10 = f0.i((Calendar) null);
        this.f6152a = i10;
        this.f6153b = i10.getMaximum(7);
        this.f6154c = i10.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f6153b;
    }

    public final Object getItem(int i10) {
        int i11 = this.f6153b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f6154c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    public final long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R$layout.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f6152a
            int r2 = r5.f6154c
            int r6 = r6 + r2
            int r2 = r5.f6153b
            if (r6 <= r2) goto L_0x0021
            int r6 = r6 - r2
        L_0x0021:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f6152a
            int r3 = f6151d
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.google.android.material.R$string.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f6152a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public g(int i10) {
        Calendar i11 = f0.i((Calendar) null);
        this.f6152a = i11;
        this.f6153b = i11.getMaximum(7);
        this.f6154c = i10;
    }
}
