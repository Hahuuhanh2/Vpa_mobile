package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.datepicker.u;
import com.google.android.material.textfield.TextInputLayout;
import i8.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public Long f6109a;

    public class a implements Parcelable.Creator<SingleDateSelector> {
        public final Object createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f6109a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        public final Object[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    public final void F0(long j10) {
        this.f6109a = Long.valueOf(j10);
    }

    public final int S() {
        return R$string.mtrl_picker_date_header_title;
    }

    public final String c0(Context context) {
        String str;
        Resources resources = context.getResources();
        Long l10 = this.f6109a;
        if (l10 == null) {
            str = resources.getString(R$string.mtrl_picker_announce_current_selection_none);
        } else {
            str = f.f(l10.longValue(), Locale.getDefault());
        }
        return resources.getString(R$string.mtrl_picker_announce_current_selection, new Object[]{str});
    }

    public final int describeContents() {
        return 0;
    }

    public final int g0(Context context) {
        return b.c(R$attr.materialCalendarTheme, context, r.class.getCanonicalName()).data;
    }

    public final boolean o0() {
        if (this.f6109a != null) {
            return true;
        }
        return false;
    }

    public final String q(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f6109a;
        if (l10 == null) {
            return resources.getString(R$string.mtrl_picker_date_header_unselected);
        }
        String f10 = f.f(l10.longValue(), Locale.getDefault());
        return resources.getString(R$string.mtrl_picker_date_header_selected, new Object[]{f10});
    }

    public final ArrayList s() {
        return new ArrayList();
    }

    public final ArrayList s0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f6109a;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    public final Object v0() {
        return this.f6109a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f6109a);
    }

    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, u.a aVar) {
        View inflate = layoutInflater.inflate(R$layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R$id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (m9.b.H()) {
            editText.setInputType(17);
        }
        SimpleDateFormat e10 = f0.e();
        String f10 = f0.f(inflate.getResources(), e10);
        textInputLayout.setPlaceholderText(f10);
        Long l10 = this.f6109a;
        if (l10 != null) {
            editText.setText(e10.format(l10));
        }
        editText.addTextChangedListener(new c0(this, f10, e10, textInputLayout, calendarConstraints, aVar, textInputLayout));
        android.support.v4.media.a.v(editText);
        return inflate;
    }
}
