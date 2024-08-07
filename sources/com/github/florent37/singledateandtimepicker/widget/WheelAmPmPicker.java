package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.R$string;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WheelAmPmPicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public a f5135r0;

    public interface a {
    }

    public WheelAmPmPicker(Context context) {
        super(context);
    }

    public final int g(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        instance.setTime(date);
        if (instance.get(11) >= 12) {
            return 1;
        }
        return 0;
    }

    public final List<String> h(boolean z10) {
        return Arrays.asList(new String[]{j(R$string.picker_am), j(R$string.picker_pm)});
    }

    public final String i(Object obj) {
        int i10;
        if (!(obj instanceof Date)) {
            return String.valueOf(obj);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5156a.b());
        instance.setTime((Date) obj);
        if (instance.get(9) == 1) {
            i10 = R$string.picker_pm;
        } else {
            i10 = R$string.picker_am;
        }
        return j(i10);
    }

    public final void k() {
    }

    public final Object l() {
        a6.a aVar = this.f5156a;
        if (aVar.a(aVar.d()).get(10) >= 12) {
            return j(R$string.picker_pm);
        }
        return j(R$string.picker_am);
    }

    public final void p(int i10, Object obj) {
        super.p(i10, (String) obj);
        a aVar = this.f5135r0;
        if (aVar != null) {
            getCurrentItemPosition();
            SingleDateAndTimePicker.a aVar2 = (SingleDateAndTimePicker.a) aVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
        }
    }

    public void setAmPmListener(a aVar) {
        this.f5135r0 = aVar;
    }

    public void setCyclic(boolean z10) {
        super.setCyclic(false);
    }

    public WheelAmPmPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
