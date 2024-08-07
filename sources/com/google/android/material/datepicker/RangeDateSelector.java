package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.u;
import com.google.android.material.textfield.TextInputLayout;
import i8.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import v1.c;

public class RangeDateSelector implements DateSelector<c<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f6104a;

    /* renamed from: b  reason: collision with root package name */
    public Long f6105b = null;

    /* renamed from: c  reason: collision with root package name */
    public Long f6106c = null;

    /* renamed from: d  reason: collision with root package name */
    public Long f6107d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f6108e = null;

    public class a implements Parcelable.Creator<RangeDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f6105b = (Long) parcel.readValue(cls.getClassLoader());
            rangeDateSelector.f6106c = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        public final Object[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, y yVar) {
        boolean z10;
        Long l10 = rangeDateSelector.f6107d;
        if (l10 == null || rangeDateSelector.f6108e == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f6104a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError((CharSequence) null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError((CharSequence) null);
            }
            yVar.a();
        } else {
            if (l10.longValue() <= rangeDateSelector.f6108e.longValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Long l11 = rangeDateSelector.f6107d;
                rangeDateSelector.f6105b = l11;
                Long l12 = rangeDateSelector.f6108e;
                rangeDateSelector.f6106c = l12;
                yVar.b(new c(l11, l12));
            } else {
                textInputLayout.setError(rangeDateSelector.f6104a);
                textInputLayout2.setError(" ");
                yVar.a();
            }
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            textInputLayout2.getError();
        }
    }

    public final void F0(long j10) {
        boolean z10;
        Long l10 = this.f6105b;
        if (l10 == null) {
            this.f6105b = Long.valueOf(j10);
            return;
        }
        if (this.f6106c == null) {
            if (l10.longValue() <= j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f6106c = Long.valueOf(j10);
                return;
            }
        }
        this.f6106c = null;
        this.f6105b = Long.valueOf(j10);
    }

    public final int S() {
        return R$string.mtrl_picker_range_header_title;
    }

    public final String c0(Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        c<String, String> a10 = f.a(this.f6105b, this.f6106c);
        F f10 = a10.f16012a;
        if (f10 == null) {
            str = resources.getString(R$string.mtrl_picker_announce_current_selection_none);
        } else {
            str = (String) f10;
        }
        S s10 = a10.f16013b;
        if (s10 == null) {
            str2 = resources.getString(R$string.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = (String) s10;
        }
        return resources.getString(R$string.mtrl_picker_announce_current_range_selection, new Object[]{str, str2});
    }

    public final int describeContents() {
        return 0;
    }

    public final int g0(Context context) {
        int i10;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R$dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i10 = R$attr.materialCalendarTheme;
        } else {
            i10 = R$attr.materialCalendarFullscreenTheme;
        }
        return b.c(i10, context, r.class.getCanonicalName()).data;
    }

    public final boolean o0() {
        boolean z10;
        Long l10 = this.f6105b;
        if (!(l10 == null || this.f6106c == null)) {
            if (l10.longValue() <= this.f6106c.longValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final String q(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f6105b;
        if (l10 == null && this.f6106c == null) {
            return resources.getString(R$string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f6106c;
        if (l11 == null) {
            return resources.getString(R$string.mtrl_picker_range_header_only_start_selected, new Object[]{f.b(l10.longValue())});
        } else if (l10 == null) {
            return resources.getString(R$string.mtrl_picker_range_header_only_end_selected, new Object[]{f.b(l11.longValue())});
        } else {
            c<String, String> a10 = f.a(l10, l11);
            return resources.getString(R$string.mtrl_picker_range_header_selected, new Object[]{a10.f16012a, a10.f16013b});
        }
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this.f6105b, this.f6106c));
        return arrayList;
    }

    public final ArrayList s0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f6105b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f6106c;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    public final Object v0() {
        return new c(this.f6105b, this.f6106c);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f6105b);
        parcel.writeValue(this.f6106c);
    }

    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, u.a aVar) {
        View inflate = layoutInflater.inflate(R$layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R$id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R$id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (m9.b.H()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f6104a = inflate.getResources().getString(R$string.mtrl_picker_invalid_range);
        SimpleDateFormat e10 = f0.e();
        Long l10 = this.f6105b;
        if (l10 != null) {
            editText.setText(e10.format(l10));
            this.f6107d = this.f6105b;
        }
        Long l11 = this.f6106c;
        if (l11 != null) {
            editText2.setText(e10.format(l11));
            this.f6108e = this.f6106c;
        }
        String f10 = f0.f(inflate.getResources(), e10);
        textInputLayout.setPlaceholderText(f10);
        textInputLayout2.setPlaceholderText(f10);
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        a0 a0Var = r0;
        TextInputLayout textInputLayout3 = textInputLayout;
        String str = f10;
        TextInputLayout textInputLayout4 = textInputLayout2;
        SimpleDateFormat simpleDateFormat = e10;
        u.a aVar2 = aVar;
        a0 a0Var2 = new a0(this, f10, e10, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, aVar2);
        editText.addTextChangedListener(a0Var);
        editText2.addTextChangedListener(new b0(this, str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, aVar2));
        android.support.v4.media.a.v(editText, editText2);
        return inflate;
    }
}
