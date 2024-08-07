package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WheelMinutePicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public int f5149r0;

    /* renamed from: s0  reason: collision with root package name */
    public b f5150s0;

    /* renamed from: t0  reason: collision with root package name */
    public a f5151t0;

    public interface a {
    }

    public interface b {
    }

    public WheelMinutePicker(Context context) {
        super(context);
    }

    public final int g(Date date) {
        int i10 = this.f5156a.a(date).get(12);
        int b10 = this.f5164e.b();
        for (int i11 = 0; i11 < b10; i11++) {
            Integer valueOf = Integer.valueOf(this.f5164e.c(i11));
            if (i10 == valueOf.intValue()) {
                return i11;
            }
            if (i10 < valueOf.intValue()) {
                return i11 - 1;
            }
        }
        return b10 - 1;
    }

    public int getCurrentMinute() {
        return Integer.valueOf(String.valueOf(this.f5164e.a(getCurrentItemPosition()))).intValue();
    }

    public final List<String> h(boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= 59) {
            arrayList.add(i(Integer.valueOf(i10)));
            i10 += this.f5149r0;
        }
        return arrayList;
    }

    public final String i(Object obj) {
        if (obj instanceof Date) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5156a.b());
            instance.setTime((Date) obj);
            obj = Integer.valueOf(instance.get(12));
        }
        return String.format(getCurrentLocale(), "%1$02d", new Object[]{obj});
    }

    public final void k() {
        this.f5149r0 = 5;
    }

    public final Object l() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        return i(Integer.valueOf(instance.get(12)));
    }

    public final void n() {
        a aVar = this.f5151t0;
        if (aVar != null) {
            WheelHourPicker wheelHourPicker = SingleDateAndTimePicker.this.f5112n;
            wheelHourPicker.q(wheelHourPicker.getCurrentItemPosition() + 1);
        }
    }

    public final void p(int i10, Object obj) {
        String str = (String) obj;
        super.p(i10, str);
        b bVar = this.f5150s0;
        if (bVar != null) {
            Integer.valueOf(String.valueOf(str)).intValue();
            SingleDateAndTimePicker.h hVar = (SingleDateAndTimePicker.h) bVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
        }
    }

    public void setStepSizeMinutes(int i10) {
        if (i10 < 60 && i10 > 0) {
            this.f5149r0 = i10;
            r();
        }
    }

    public WheelMinutePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
