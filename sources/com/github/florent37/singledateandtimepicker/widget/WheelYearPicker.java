package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.R$string;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WheelYearPicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public SimpleDateFormat f5197r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f5198s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5199t0;

    /* renamed from: u0  reason: collision with root package name */
    public a f5200u0;

    public interface a {
    }

    public WheelYearPicker(Context context) {
        super(context);
    }

    private String getTodayText() {
        return j(R$string.picker_today);
    }

    public int getCurrentYear() {
        return this.f5198s0 + super.getCurrentItemPosition();
    }

    public final List<String> h(boolean z10) {
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        instance.set(1, this.f5198s0 - 1);
        for (int i10 = this.f5198s0; i10 <= this.f5199t0; i10++) {
            instance.add(1, 1);
            arrayList.add(i(instance.getTime()));
        }
        return arrayList;
    }

    public final String i(Object obj) {
        return this.f5197r0.format(obj);
    }

    public final void k() {
        this.f5197r0 = new SimpleDateFormat("yyyy", getCurrentLocale());
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        int i10 = instance.get(1);
        this.f5198s0 = i10 - 150;
        this.f5199t0 = i10 + 100;
    }

    public final Object l() {
        return getTodayText();
    }

    public final void p(int i10, Object obj) {
        String str = (String) obj;
        a aVar = this.f5200u0;
        if (aVar != null) {
            SingleDateAndTimePicker.b bVar = (SingleDateAndTimePicker.b) aVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
            SingleDateAndTimePicker singleDateAndTimePicker = SingleDateAndTimePicker.this;
            if (singleDateAndTimePicker.f5122x) {
                singleDateAndTimePicker.e();
            }
        }
    }

    public void setMaxYear(int i10) {
        this.f5199t0 = i10;
        m();
    }

    public void setMinYear(int i10) {
        this.f5198s0 = i10;
        m();
    }

    public void setOnYearSelectedListener(a aVar) {
        this.f5200u0 = aVar;
    }

    public WheelYearPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
