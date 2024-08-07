package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.util.ArrayList;
import java.util.List;

public class WheelDayOfMonthPicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public int f5136r0;

    /* renamed from: s0  reason: collision with root package name */
    public a f5137s0;

    /* renamed from: t0  reason: collision with root package name */
    public b f5138t0;

    public interface a {
    }

    public interface b {
    }

    public WheelDayOfMonthPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getCurrentDay() {
        return getCurrentItemPosition();
    }

    public int getDaysInMonth() {
        return this.f5136r0;
    }

    public final List<String> h(boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 1; i10 <= this.f5136r0; i10++) {
            arrayList.add(String.format("%02d", new Object[]{Integer.valueOf(i10)}));
        }
        return arrayList;
    }

    public final void k() {
    }

    public final Object l() {
        a6.a aVar = this.f5156a;
        return String.valueOf(aVar.a(aVar.d()).get(5));
    }

    public final void n() {
        b bVar = this.f5138t0;
        if (bVar != null) {
            SingleDateAndTimePicker.e eVar = (SingleDateAndTimePicker.e) bVar;
            SingleDateAndTimePicker singleDateAndTimePicker = SingleDateAndTimePicker.this;
            if (singleDateAndTimePicker.f5121w) {
                WheelMonthPicker wheelMonthPicker = singleDateAndTimePicker.f5108c;
                wheelMonthPicker.q(wheelMonthPicker.getCurrentItemPosition() + 1);
                SingleDateAndTimePicker.this.e();
            }
        }
    }

    public final void p(int i10, Object obj) {
        String str = (String) obj;
        a aVar = this.f5137s0;
        if (aVar != null) {
            SingleDateAndTimePicker.d dVar = (SingleDateAndTimePicker.d) aVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
        }
    }

    public void setDayOfMonthSelectedListener(a aVar) {
        this.f5137s0 = aVar;
    }

    public void setDaysInMonth(int i10) {
        this.f5136r0 = i10;
    }

    public void setOnFinishedLoopListener(b bVar) {
        this.f5138t0 = bVar;
    }

    public WheelDayOfMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
