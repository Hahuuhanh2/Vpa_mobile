package com.ots.core.utils.customview;

import android.widget.TextView;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import jf.d;
import sk.j;

/* compiled from: TimePickerView.kt */
public final class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f8391a;

    public e(TimePickerView timePickerView) {
        this.f8391a = timePickerView;
    }

    public final void a(d dVar, Calendar calendar) {
        String str;
        String str2 = "";
        TimePickerView timePickerView = this.f8391a;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            str = simpleDateFormat.format(calendar.getTime());
            j.c(str);
        } catch (Exception unused) {
            str = str2;
        }
        timePickerView.setTime(str);
        TextView tvTime = this.f8391a.getTvTime();
        if (tvTime != null) {
            String str3 = this.f8391a.f8379b;
            j.f(str3, "format");
            try {
                String format = new SimpleDateFormat(str3, Locale.getDefault()).format(calendar.getTime());
                j.e(format, "format(...)");
                str2 = format;
            } catch (Exception unused2) {
            }
            tvTime.setText(str2);
        }
    }
}
