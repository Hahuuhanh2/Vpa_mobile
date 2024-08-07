package com.github.florent37.singledateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.github.florent37.singledateandtimepicker.SingleDateAndTimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WheelHourPicker extends WheelPicker<String> {

    /* renamed from: r0  reason: collision with root package name */
    public int f5143r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f5144s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5145t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5146u0;

    /* renamed from: v0  reason: collision with root package name */
    public a f5147v0;

    /* renamed from: w0  reason: collision with root package name */
    public b f5148w0;

    public interface a {
    }

    public interface b {
    }

    public WheelHourPicker(Context context) {
        super(context);
    }

    public final int g(Date date) {
        int hours;
        if (!this.f5146u0 || (hours = date.getHours()) < 12) {
            return super.g(date);
        }
        Date date2 = new Date(date.getTime());
        date2.setHours(hours % 12);
        return super.g(date2);
    }

    public int getCurrentHour() {
        return u(this.f5164e.a(getCurrentItemPosition()));
    }

    public final List<String> h(boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (this.f5146u0) {
            arrayList.add(i(12));
            int i10 = this.f5145t0;
            while (i10 < this.f5144s0) {
                arrayList.add(i(Integer.valueOf(i10)));
                i10 += this.f5145t0;
            }
        } else {
            int i11 = this.f5143r0;
            while (i11 <= this.f5144s0) {
                arrayList.add(i(Integer.valueOf(i11)));
                i11 += this.f5145t0;
            }
        }
        return arrayList;
    }

    public final String i(Object obj) {
        if (obj instanceof Date) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5156a.b());
            instance.setTime((Date) obj);
            obj = Integer.valueOf(instance.get(11));
        }
        return String.format(getCurrentLocale(), "%1$02d", new Object[]{obj});
    }

    public final void k() {
        this.f5146u0 = false;
        this.f5143r0 = 0;
        this.f5144s0 = 23;
        this.f5145t0 = 1;
    }

    public final Object l() {
        int i10;
        a6.a aVar = this.f5156a;
        Date d10 = aVar.d();
        if (this.f5146u0) {
            i10 = aVar.a(d10).get(10);
        } else {
            i10 = aVar.a(d10).get(10);
        }
        return String.valueOf(i10);
    }

    public final void n() {
        a aVar = this.f5147v0;
        if (aVar != null) {
            WheelDayPicker wheelDayPicker = SingleDateAndTimePicker.this.f5110e;
            wheelDayPicker.q(wheelDayPicker.getCurrentItemPosition() + 1);
        }
    }

    public final void p(int i10, Object obj) {
        String str = (String) obj;
        super.p(i10, str);
        b bVar = this.f5148w0;
        if (bVar != null) {
            u(str);
            SingleDateAndTimePicker.i iVar = (SingleDateAndTimePicker.i) bVar;
            SingleDateAndTimePicker.a(SingleDateAndTimePicker.this);
            SingleDateAndTimePicker.b(SingleDateAndTimePicker.this, this);
        }
    }

    public void setIsAmPm(boolean z10) {
        this.f5146u0 = z10;
        if (z10) {
            setMaxHour(12);
        } else {
            setMaxHour(23);
        }
        r();
    }

    public void setMaxHour(int i10) {
        if (i10 >= 0 && i10 <= 23) {
            this.f5144s0 = i10;
        }
        m();
    }

    public void setMinHour(int i10) {
        if (i10 >= 0 && i10 <= 23) {
            this.f5143r0 = i10;
        }
        m();
    }

    public void setStepSizeHours(int i10) {
        if (i10 >= 0 && i10 <= 23) {
            this.f5145t0 = i10;
        }
        m();
    }

    public final int u(Object obj) {
        Integer valueOf = Integer.valueOf(String.valueOf(obj));
        if (!this.f5146u0) {
            return valueOf.intValue();
        }
        if (valueOf.intValue() == 12) {
            valueOf = 0;
        }
        return valueOf.intValue();
    }

    public WheelHourPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDefault(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (this.f5146u0 && parseInt >= 12) {
                parseInt -= 12;
            }
            super.setDefault(i(Integer.valueOf(parseInt)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
