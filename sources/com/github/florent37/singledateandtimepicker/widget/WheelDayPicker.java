package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.R$string;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class WheelDayPicker extends WheelPicker<b6.a> {

    /* renamed from: r0  reason: collision with root package name */
    public SimpleDateFormat f5139r0;

    /* renamed from: s0  reason: collision with root package name */
    public SimpleDateFormat f5140s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5141t0 = 364;

    /* renamed from: u0  reason: collision with root package name */
    public a f5142u0;

    public interface a {
    }

    public WheelDayPicker(Context context) {
        super(context);
    }

    private SimpleDateFormat getDateFormat() {
        SimpleDateFormat simpleDateFormat = this.f5140s0;
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        return this.f5139r0;
    }

    private String getTodayText() {
        return j(R$string.picker_today);
    }

    public Date getCurrentDate() {
        int currentItemPosition = super.getCurrentItemPosition();
        String c10 = this.f5164e.c(currentItemPosition);
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        ArrayList arrayList = this.f5164e.f5196a;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (((b6.a) arrayList.get(i10)).f4090a.equals(getTodayText())) {
                break;
            } else {
                i10++;
            }
        }
        if (getTodayText().equals(c10)) {
            return instance.getTime();
        }
        instance.add(6, currentItemPosition - i10);
        return instance.getTime();
    }

    public final List<b6.a> h(boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        if (z10) {
            i10 = 0;
        } else {
            i10 = this.f5141t0 * -1;
        }
        instance.add(5, i10 - 1);
        while (i10 < 0) {
            instance.add(5, 1);
            Date time = instance.getTime();
            arrayList.add(new b6.a(i(time), time));
            i10++;
        }
        arrayList.add(new b6.a(getTodayText(), new Date()));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeZone(this.f5156a.b());
        for (int i11 = 0; i11 < this.f5141t0; i11++) {
            instance2.add(5, 1);
            Date time2 = instance2.getTime();
            arrayList.add(new b6.a(i(time2), time2));
        }
        return arrayList;
    }

    public final String i(Object obj) {
        return getDateFormat().format(obj);
    }

    public final void k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE d MMM", getCurrentLocale());
        this.f5139r0 = simpleDateFormat;
        simpleDateFormat.setTimeZone(this.f5156a.b());
    }

    public final Object l() {
        return new b6.a(getTodayText(), new Date());
    }

    public final void p(int i10, Object obj) {
        b6.a aVar = (b6.a) obj;
        a aVar2 = this.f5142u0;
        if (aVar2 != null) {
            String str = aVar.f4090a;
            SingleDateAndTimePicker.f fVar = (SingleDateAndTimePicker.f) aVar2;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
        }
    }

    public void setCustomLocale(Locale locale) {
        super.setCustomLocale(locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE d MMM", getCurrentLocale());
        this.f5139r0 = simpleDateFormat;
        simpleDateFormat.setTimeZone(this.f5156a.b());
    }

    public void setDayCount(int i10) {
        this.f5141t0 = i10;
    }

    public void setOnDaySelectedListener(a aVar) {
        this.f5142u0 = aVar;
    }

    public void setTodayText(b6.a aVar) {
        ArrayList arrayList = this.f5164e.f5196a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b6.a) arrayList.get(i10)).f4090a.equals(getTodayText())) {
                this.f5164e.f5196a.set(i10, aVar);
                m();
            }
        }
    }

    public WheelDayPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
