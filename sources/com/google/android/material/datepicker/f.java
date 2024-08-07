package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import com.google.android.material.R$string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import v1.c;

/* compiled from: DateStrings */
public final class f {
    public static c<String, String> a(Long l10, Long l11) {
        c<String, String> cVar;
        c<String, String> cVar2;
        if (l10 == null && l11 == null) {
            return new c<>(null, null);
        }
        if (l10 == null) {
            cVar2 = new c<>(null, b(l11.longValue()));
        } else if (l11 == null) {
            cVar2 = new c<>(b(l10.longValue()), null);
        } else {
            Calendar h10 = f0.h();
            Calendar i10 = f0.i((Calendar) null);
            i10.setTimeInMillis(l10.longValue());
            Calendar i11 = f0.i((Calendar) null);
            i11.setTimeInMillis(l11.longValue());
            if (i10.get(1) != i11.get(1)) {
                cVar = new c<>(f(l10.longValue(), Locale.getDefault()), f(l11.longValue(), Locale.getDefault()));
            } else if (i10.get(1) == h10.get(1)) {
                cVar = new c<>(d(l10.longValue(), Locale.getDefault()), d(l11.longValue(), Locale.getDefault()));
            } else {
                cVar = new c<>(d(l10.longValue(), Locale.getDefault()), f(l11.longValue(), Locale.getDefault()));
            }
            return cVar;
        }
        return cVar2;
    }

    public static String b(long j10) {
        Calendar h10 = f0.h();
        Calendar i10 = f0.i((Calendar) null);
        i10.setTimeInMillis(j10);
        boolean z10 = true;
        if (h10.get(1) != i10.get(1)) {
            z10 = false;
        }
        if (z10) {
            return d(j10, Locale.getDefault());
        }
        return f(j10, Locale.getDefault());
    }

    public static String c(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        String str;
        Calendar h10 = f0.h();
        Calendar i10 = f0.i((Calendar) null);
        i10.setTimeInMillis(j10);
        if (h10.get(1) == i10.get(1)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                str = f0.c("MMMMEEEEd", locale).format(new Date(j10));
            } else {
                str = f0.g(0, locale).format(new Date(j10));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                str = f0.c("yMMMMEEEEd", locale2).format(new Date(j10));
            } else {
                str = f0.g(0, locale2).format(new Date(j10));
            }
        }
        if (z10) {
            str = String.format(context.getString(R$string.mtrl_picker_today_description), new Object[]{str});
        }
        if (z11) {
            return String.format(context.getString(R$string.mtrl_picker_start_date_description), new Object[]{str});
        } else if (!z12) {
            return str;
        } else {
            return String.format(context.getString(R$string.mtrl_picker_end_date_description), new Object[]{str});
        }
    }

    public static String d(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f0.c("MMMd", locale).format(new Date(j10));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f0.g(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int b10 = f0.b(pattern, 1, 0, "yY");
        if (b10 < pattern.length()) {
            String str = "EMd";
            int b11 = f0.b(pattern, 1, b10, str);
            if (b11 < pattern.length()) {
                str = "EMd,";
            }
            pattern = pattern.replace(pattern.substring(f0.b(pattern, -1, b10, str) + 1, b11), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j10));
    }

    public static String e(long j10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f0.c("yMMMM", Locale.getDefault()).format(new Date(j10));
        }
        return DateUtils.formatDateTime((Context) null, j10, 8228);
    }

    public static String f(long j10, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return f0.c("yMMMd", locale).format(new Date(j10));
        }
        return f0.g(2, locale).format(new Date(j10));
    }
}
