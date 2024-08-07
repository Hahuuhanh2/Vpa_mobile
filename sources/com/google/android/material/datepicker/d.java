package com.google.android.material.datepicker;

import android.text.Editable;
import com.google.android.material.R$string;
import com.google.android.material.internal.t;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import v.f;

/* compiled from: DateFormatTextWatcher */
public abstract class d extends t {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f6137a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6138b;

    /* renamed from: c  reason: collision with root package name */
    public final DateFormat f6139c;

    /* renamed from: d  reason: collision with root package name */
    public final CalendarConstraints f6140d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6141e;

    /* renamed from: f  reason: collision with root package name */
    public final f f6142f;

    /* renamed from: n  reason: collision with root package name */
    public c f6143n;

    /* renamed from: o  reason: collision with root package name */
    public int f6144o = 0;

    public d(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f6138b = str;
        this.f6139c = simpleDateFormat;
        this.f6137a = textInputLayout;
        this.f6140d = calendarConstraints;
        this.f6141e = textInputLayout.getContext().getString(R$string.mtrl_picker_out_of_range);
        this.f6142f = new f(22, this, str);
    }

    public abstract void a();

    public final void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f6138b.length() && editable.length() >= this.f6144o) {
            char charAt = this.f6138b.charAt(editable.length());
            if (!Character.isDigit(charAt)) {
                editable.append(charAt);
            }
        }
    }

    public abstract void b(Long l10);

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f6144o = charSequence.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077 A[Catch:{ ParseException -> 0x0090 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r7 = r5.f6137a
            v.f r8 = r5.f6142f
            r7.removeCallbacks(r8)
            com.google.android.material.textfield.TextInputLayout r7 = r5.f6137a
            com.google.android.material.datepicker.c r8 = r5.f6143n
            r7.removeCallbacks(r8)
            com.google.android.material.textfield.TextInputLayout r7 = r5.f6137a
            r8 = 0
            r7.setError(r8)
            r5.b(r8)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0097
            int r7 = r6.length()
            java.lang.String r9 = r5.f6138b
            int r9 = r9.length()
            if (r7 >= r9) goto L_0x002a
            goto L_0x0097
        L_0x002a:
            java.text.DateFormat r7 = r5.f6139c     // Catch:{ ParseException -> 0x0090 }
            java.lang.String r6 = r6.toString()     // Catch:{ ParseException -> 0x0090 }
            java.util.Date r6 = r7.parse(r6)     // Catch:{ ParseException -> 0x0090 }
            com.google.android.material.textfield.TextInputLayout r7 = r5.f6137a     // Catch:{ ParseException -> 0x0090 }
            r7.setError(r8)     // Catch:{ ParseException -> 0x0090 }
            long r7 = r6.getTime()     // Catch:{ ParseException -> 0x0090 }
            com.google.android.material.datepicker.CalendarConstraints r9 = r5.f6140d     // Catch:{ ParseException -> 0x0090 }
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r9 = r9.f6077c     // Catch:{ ParseException -> 0x0090 }
            boolean r9 = r9.j0(r7)     // Catch:{ ParseException -> 0x0090 }
            if (r9 == 0) goto L_0x0083
            com.google.android.material.datepicker.CalendarConstraints r9 = r5.f6140d     // Catch:{ ParseException -> 0x0090 }
            com.google.android.material.datepicker.Month r0 = r9.f6075a     // Catch:{ ParseException -> 0x0090 }
            r1 = 1
            java.util.Calendar r0 = r0.f6097a     // Catch:{ ParseException -> 0x0090 }
            java.util.Calendar r0 = com.google.android.material.datepicker.f0.d(r0)     // Catch:{ ParseException -> 0x0090 }
            r2 = 5
            r0.set(r2, r1)     // Catch:{ ParseException -> 0x0090 }
            long r3 = r0.getTimeInMillis()     // Catch:{ ParseException -> 0x0090 }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            com.google.android.material.datepicker.Month r9 = r9.f6076b     // Catch:{ ParseException -> 0x0090 }
            int r0 = r9.f6101e     // Catch:{ ParseException -> 0x0090 }
            java.util.Calendar r9 = r9.f6097a     // Catch:{ ParseException -> 0x0090 }
            java.util.Calendar r9 = com.google.android.material.datepicker.f0.d(r9)     // Catch:{ ParseException -> 0x0090 }
            r9.set(r2, r0)     // Catch:{ ParseException -> 0x0090 }
            long r2 = r9.getTimeInMillis()     // Catch:{ ParseException -> 0x0090 }
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 == 0) goto L_0x0083
            long r6 = r6.getTime()     // Catch:{ ParseException -> 0x0090 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ ParseException -> 0x0090 }
            r5.b(r6)     // Catch:{ ParseException -> 0x0090 }
            return
        L_0x0083:
            com.google.android.material.datepicker.c r6 = new com.google.android.material.datepicker.c     // Catch:{ ParseException -> 0x0090 }
            r6.<init>(r5, r7)     // Catch:{ ParseException -> 0x0090 }
            r5.f6143n = r6     // Catch:{ ParseException -> 0x0090 }
            com.google.android.material.textfield.TextInputLayout r7 = r5.f6137a     // Catch:{ ParseException -> 0x0090 }
            r7.post(r6)     // Catch:{ ParseException -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            com.google.android.material.textfield.TextInputLayout r6 = r5.f6137a
            v.f r7 = r5.f6142f
            r6.post(r7)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.d.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
