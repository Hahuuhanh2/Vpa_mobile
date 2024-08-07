package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WheelMonthPicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public int f5152r0;

    /* renamed from: s0  reason: collision with root package name */
    public a f5153s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5154t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f5155u0;

    public interface a {
    }

    public WheelMonthPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getCurrentMonth() {
        return getCurrentItemPosition();
    }

    public String getMonthFormat() {
        if (TextUtils.isEmpty(this.f5155u0)) {
            return "MMMM";
        }
        return this.f5155u0;
    }

    public final List<String> h(boolean z10) {
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(getMonthFormat(), getCurrentLocale());
        Calendar instance = Calendar.getInstance(getCurrentLocale());
        instance.setTimeZone(this.f5156a.b());
        instance.set(5, 1);
        for (int i10 = 0; i10 < 12; i10++) {
            instance.set(2, i10);
            if (this.f5154t0) {
                arrayList.add(String.format("%02d", new Object[]{Integer.valueOf(i10 + 1)}));
            } else {
                arrayList.add(simpleDateFormat.format(instance.getTime()));
            }
        }
        return arrayList;
    }

    public final void k() {
    }

    public final Object l() {
        a6.a aVar = this.f5156a;
        return String.valueOf(aVar.a(aVar.d()).get(2));
    }

    public final void o(int i10, Object obj) {
        String str = (String) obj;
        if (this.f5152r0 != i10) {
            a aVar = this.f5153s0;
            if (aVar != null) {
                SingleDateAndTimePicker.c cVar = (SingleDateAndTimePicker.c) aVar;
                SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
                SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
                SingleDateAndTimePicker singleDateAndTimePicker = SingleDateAndTimePicker.this;
                if (singleDateAndTimePicker.f5122x) {
                    singleDateAndTimePicker.e();
                }
            }
            this.f5152r0 = i10;
        }
    }

    public final void p(int i10, Object obj) {
        String str = (String) obj;
        a aVar = this.f5153s0;
        if (aVar != null) {
            SingleDateAndTimePicker.c cVar = (SingleDateAndTimePicker.c) aVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
            SingleDateAndTimePicker singleDateAndTimePicker = SingleDateAndTimePicker.this;
            if (singleDateAndTimePicker.f5122x) {
                singleDateAndTimePicker.e();
            }
        }
    }

    public void setDisplayMonthNumbers(boolean z10) {
        this.f5154t0 = z10;
    }

    public void setMonthFormat(String str) {
        this.f5155u0 = str;
    }

    public void setOnMonthSelectedListener(a aVar) {
        this.f5153s0 = aVar;
    }

    public WheelMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5154t0 = false;
    }
}
