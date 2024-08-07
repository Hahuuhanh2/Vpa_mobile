package com.github.florent37.singledateandtimepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.florent37.singledateandtimepicker.widget.WheelAmPmPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelDayOfMonthPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelDayPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelHourPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelMinutePicker;
import com.github.florent37.singledateandtimepicker.widget.WheelMonthPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelPicker;
import com.github.florent37.singledateandtimepicker.widget.WheelYearPicker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

public class SingleDateAndTimePicker extends LinearLayout {
    public boolean A;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public a6.a f5106a;

    /* renamed from: b  reason: collision with root package name */
    public final WheelYearPicker f5107b;

    /* renamed from: c  reason: collision with root package name */
    public final WheelMonthPicker f5108c;

    /* renamed from: d  reason: collision with root package name */
    public final WheelDayOfMonthPicker f5109d;

    /* renamed from: e  reason: collision with root package name */
    public final WheelDayPicker f5110e;

    /* renamed from: f  reason: collision with root package name */
    public final WheelMinutePicker f5111f;

    /* renamed from: n  reason: collision with root package name */
    public final WheelHourPicker f5112n;

    /* renamed from: o  reason: collision with root package name */
    public final WheelAmPmPicker f5113o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f5114p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f5115q;

    /* renamed from: r  reason: collision with root package name */
    public View f5116r;

    /* renamed from: s  reason: collision with root package name */
    public Date f5117s;

    /* renamed from: t  reason: collision with root package name */
    public Date f5118t;

    /* renamed from: u  reason: collision with root package name */
    public Date f5119u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5120v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5121w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5122x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5123y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5124z;

    public class a implements WheelAmPmPicker.a {
        public a() {
        }
    }

    public class b implements WheelYearPicker.a {
        public b() {
        }
    }

    public class c implements WheelMonthPicker.a {
        public c() {
        }
    }

    public class d implements WheelDayOfMonthPicker.a {
        public d() {
        }
    }

    public class e implements WheelDayOfMonthPicker.b {
        public e() {
        }
    }

    public class f implements WheelDayPicker.a {
        public f() {
        }
    }

    public class g implements WheelMinutePicker.a {
        public g() {
        }
    }

    public class h implements WheelMinutePicker.b {
        public h() {
        }
    }

    public class i implements WheelHourPicker.b {
        public i() {
        }
    }

    public class j implements WheelHourPicker.a {
        public j() {
        }
    }

    public interface k {
        void a();
    }

    public SingleDateAndTimePicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void a(SingleDateAndTimePicker singleDateAndTimePicker) {
        String str;
        Date date = singleDateAndTimePicker.getDate();
        if (singleDateAndTimePicker.B) {
            str = "EEE d MMM h:mm a";
        } else {
            str = "EEE d MMM H:mm";
        }
        DateFormat.format(str, date).toString();
        Iterator it = singleDateAndTimePicker.f5115q.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a();
        }
    }

    public static void b(SingleDateAndTimePicker singleDateAndTimePicker, WheelPicker wheelPicker) {
        singleDateAndTimePicker.getClass();
        wheelPicker.postDelayed(new a6.b(singleDateAndTimePicker), 200);
        wheelPicker.postDelayed(new a6.c(singleDateAndTimePicker), 200);
    }

    public final void c() {
        if (!this.f5123y) {
            return;
        }
        if (this.f5122x || this.f5121w) {
            throw new IllegalArgumentException("You can either display days with months or days and months separately");
        }
    }

    public final void d() {
        if (this.f5120v && this.f5117s != null && this.f5118t != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5106a.b());
            instance.setTime(this.f5117s);
            this.f5107b.setMinYear(instance.get(1));
            instance.setTime(this.f5118t);
            this.f5107b.setMaxYear(instance.get(1));
        }
    }

    public final void e() {
        Date date = getDate();
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5106a.b());
        instance.setTime(date);
        this.f5109d.setDaysInMonth(instance.getActualMaximum(5));
        this.f5109d.r();
    }

    public Date getDate() {
        boolean z10;
        int currentHour = this.f5112n.getCurrentHour();
        if (this.B) {
            if (this.f5113o.getCurrentItemPosition() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                currentHour += 12;
            }
        }
        int currentMinute = this.f5111f.getCurrentMinute();
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5106a.b());
        if (this.f5123y) {
            instance.setTime(this.f5110e.getCurrentDate());
        } else {
            if (this.f5121w) {
                instance.set(2, this.f5108c.getCurrentMonth());
            }
            if (this.f5120v) {
                instance.set(1, this.f5107b.getCurrentYear());
            }
            if (this.f5122x) {
                int actualMaximum = instance.getActualMaximum(5);
                if (this.f5109d.getCurrentDay() >= actualMaximum) {
                    instance.set(5, actualMaximum);
                } else {
                    instance.set(5, this.f5109d.getCurrentDay() + 1);
                }
            }
        }
        instance.set(11, currentHour);
        instance.set(12, currentMinute);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTime();
    }

    public Date getMaxDate() {
        return this.f5118t;
    }

    public Date getMinDate() {
        return this.f5117s;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5107b.setOnYearSelectedListener(new b());
        this.f5108c.setOnMonthSelectedListener(new c());
        this.f5109d.setDayOfMonthSelectedListener(new d());
        this.f5109d.setOnFinishedLoopListener(new e());
        this.f5110e.setOnDaySelectedListener(new f());
        WheelMinutePicker wheelMinutePicker = this.f5111f;
        wheelMinutePicker.f5150s0 = new h();
        wheelMinutePicker.f5151t0 = new g();
        WheelHourPicker wheelHourPicker = this.f5112n;
        wheelHourPicker.f5147v0 = new j();
        wheelHourPicker.f5148w0 = new i();
        this.f5113o.setAmPmListener(new a());
        setDefaultDate(this.f5119u);
    }

    public void setCurved(boolean z10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setCurved(z10);
        }
    }

    public void setCurvedMaxAngle(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setCurvedMaxAngle(i10);
        }
    }

    public void setCustomLocale(Locale locale) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            WheelPicker wheelPicker = (WheelPicker) it.next();
            wheelPicker.setCustomLocale(locale);
            wheelPicker.r();
        }
    }

    public void setCyclic(boolean z10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setCyclic(z10);
        }
    }

    public void setDateHelper(a6.a aVar) {
        this.f5106a = aVar;
    }

    public void setDayFormatter(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            WheelDayPicker wheelDayPicker = this.f5110e;
            simpleDateFormat.setTimeZone(wheelDayPicker.f5156a.b());
            wheelDayPicker.f5140s0 = simpleDateFormat;
            wheelDayPicker.r();
        }
    }

    public void setDefaultDate(Date date) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5106a.b());
            instance.setTime(date);
            this.f5119u = instance.getTime();
            this.f5109d.setDaysInMonth(instance.getActualMaximum(5));
            this.f5109d.r();
            Iterator it = this.f5114p.iterator();
            while (it.hasNext()) {
                ((WheelPicker) it.next()).setDefaultDate(this.f5119u);
            }
        }
    }

    public void setDisplayDays(boolean z10) {
        int i10;
        this.f5123y = z10;
        WheelDayPicker wheelDayPicker = this.f5110e;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelDayPicker.setVisibility(i10);
        c();
    }

    public void setDisplayDaysOfMonth(boolean z10) {
        int i10;
        this.f5122x = z10;
        WheelDayOfMonthPicker wheelDayOfMonthPicker = this.f5109d;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelDayOfMonthPicker.setVisibility(i10);
        if (z10) {
            e();
        }
        c();
    }

    public void setDisplayHours(boolean z10) {
        int i10;
        this.A = z10;
        WheelHourPicker wheelHourPicker = this.f5112n;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelHourPicker.setVisibility(i10);
        setIsAmPm(this.B);
        this.f5112n.setIsAmPm(this.B);
    }

    public void setDisplayMinutes(boolean z10) {
        int i10;
        this.f5124z = z10;
        WheelMinutePicker wheelMinutePicker = this.f5111f;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelMinutePicker.setVisibility(i10);
    }

    public void setDisplayMonthNumbers(boolean z10) {
        this.f5108c.setDisplayMonthNumbers(z10);
        this.f5108c.r();
    }

    public void setDisplayMonths(boolean z10) {
        int i10;
        this.f5121w = z10;
        WheelMonthPicker wheelMonthPicker = this.f5108c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelMonthPicker.setVisibility(i10);
        c();
    }

    public void setDisplayYears(boolean z10) {
        int i10;
        this.f5120v = z10;
        WheelYearPicker wheelYearPicker = this.f5107b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        wheelYearPicker.setVisibility(i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setEnabled(z10);
        }
    }

    public void setIsAmPm(boolean z10) {
        int i10;
        this.B = z10;
        WheelAmPmPicker wheelAmPmPicker = this.f5113o;
        if (!z10 || !this.A) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        wheelAmPmPicker.setVisibility(i10);
        this.f5112n.setIsAmPm(z10);
    }

    public void setItemSpacing(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setItemSpace(i10);
        }
    }

    public void setMaxDate(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5106a.b());
        instance.setTime(date);
        this.f5118t = instance.getTime();
        d();
    }

    public void setMinDate(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(this.f5106a.b());
        instance.setTime(date);
        this.f5117s = instance.getTime();
        d();
    }

    public void setMonthFormat(String str) {
        this.f5108c.setMonthFormat(str);
        this.f5108c.r();
    }

    public void setMustBeOnFuture(boolean z10) {
        this.f5110e.setShowOnlyFutureDate(z10);
        if (z10) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5106a.b());
            this.f5117s = instance.getTime();
        }
    }

    public void setSelectedTextColor(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setSelectedItemTextColor(i10);
        }
    }

    public void setSelectorColor(int i10) {
        this.f5116r.setBackgroundColor(i10);
    }

    public void setSelectorHeight(int i10) {
        ViewGroup.LayoutParams layoutParams = this.f5116r.getLayoutParams();
        layoutParams.height = i10;
        this.f5116r.setLayoutParams(layoutParams);
    }

    public void setStepSizeHours(int i10) {
        this.f5112n.setStepSizeHours(i10);
    }

    public void setStepSizeMinutes(int i10) {
        this.f5111f.setStepSizeMinutes(i10);
    }

    public void setTextAlign(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setItemAlign(i10);
        }
    }

    public void setTextColor(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setItemTextColor(i10);
        }
    }

    public void setTextSize(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setItemTextSize(i10);
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        this.f5106a.f104a = timeZone;
    }

    public void setTodayText(b6.a aVar) {
        String str;
        if (aVar != null && (str = aVar.f4090a) != null && !str.isEmpty()) {
            this.f5110e.setTodayText(aVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != null) {
            Iterator it = this.f5114p.iterator();
            while (it.hasNext()) {
                ((WheelPicker) it.next()).setTypeface(typeface);
            }
        }
    }

    public void setVisibleItemCount(int i10) {
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setVisibleItemCount(i10);
        }
    }

    public SingleDateAndTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleDateAndTimePicker(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5106a = new a6.a();
        this.f5114p = new ArrayList();
        this.f5115q = new ArrayList();
        this.f5120v = false;
        this.f5121w = false;
        this.f5122x = false;
        this.f5123y = true;
        this.f5124z = true;
        this.A = true;
        this.f5119u = new Date();
        this.B = !DateFormat.is24HourFormat(context);
        View.inflate(context, R$layout.single_day_and_time_picker, this);
        WheelYearPicker wheelYearPicker = (WheelYearPicker) findViewById(R$id.yearPicker);
        this.f5107b = wheelYearPicker;
        WheelMonthPicker wheelMonthPicker = (WheelMonthPicker) findViewById(R$id.monthPicker);
        this.f5108c = wheelMonthPicker;
        WheelDayOfMonthPicker wheelDayOfMonthPicker = (WheelDayOfMonthPicker) findViewById(R$id.daysOfMonthPicker);
        this.f5109d = wheelDayOfMonthPicker;
        WheelDayPicker wheelDayPicker = (WheelDayPicker) findViewById(R$id.daysPicker);
        this.f5110e = wheelDayPicker;
        WheelMinutePicker wheelMinutePicker = (WheelMinutePicker) findViewById(R$id.minutesPicker);
        this.f5111f = wheelMinutePicker;
        WheelHourPicker wheelHourPicker = (WheelHourPicker) findViewById(R$id.hoursPicker);
        this.f5112n = wheelHourPicker;
        WheelAmPmPicker wheelAmPmPicker = (WheelAmPmPicker) findViewById(R$id.amPmPicker);
        this.f5113o = wheelAmPmPicker;
        this.f5116r = findViewById(R$id.dtSelector);
        this.f5114p.addAll(Arrays.asList(new WheelPicker[]{wheelDayPicker, wheelMinutePicker, wheelHourPicker, wheelAmPmPicker, wheelDayOfMonthPicker, wheelMonthPicker, wheelYearPicker}));
        Iterator it = this.f5114p.iterator();
        while (it.hasNext()) {
            ((WheelPicker) it.next()).setDateHelper(this.f5106a);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SingleDateAndTimePicker);
        Resources resources = getResources();
        setTodayText(new b6.a(obtainStyledAttributes.getString(R$styleable.SingleDateAndTimePicker_picker_todayText), new Date()));
        setTextColor(obtainStyledAttributes.getColor(R$styleable.SingleDateAndTimePicker_picker_textColor, k1.a.getColor(context, R$color.picker_default_text_color)));
        setSelectedTextColor(obtainStyledAttributes.getColor(R$styleable.SingleDateAndTimePicker_picker_selectedTextColor, k1.a.getColor(context, R$color.picker_default_selected_text_color)));
        setSelectorColor(obtainStyledAttributes.getColor(R$styleable.SingleDateAndTimePicker_picker_selectorColor, k1.a.getColor(context, R$color.picker_default_selector_color)));
        int i11 = R$styleable.SingleDateAndTimePicker_picker_itemSpacing;
        int i12 = R$dimen.wheelSelectorHeight;
        setItemSpacing(obtainStyledAttributes.getDimensionPixelSize(i11, resources.getDimensionPixelSize(i12)));
        setCurvedMaxAngle(obtainStyledAttributes.getInteger(R$styleable.SingleDateAndTimePicker_picker_curvedMaxAngle, 90));
        setSelectorHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.SingleDateAndTimePicker_picker_selectorHeight, resources.getDimensionPixelSize(i12)));
        setTextSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.SingleDateAndTimePicker_picker_textSize, resources.getDimensionPixelSize(R$dimen.WheelItemTextSize)));
        setCurved(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_curved, false));
        setCyclic(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_cyclic, true));
        setMustBeOnFuture(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_mustBeOnFuture, false));
        setVisibleItemCount(obtainStyledAttributes.getInt(R$styleable.SingleDateAndTimePicker_picker_visibleItemCount, 7));
        setStepSizeMinutes(obtainStyledAttributes.getInt(R$styleable.SingleDateAndTimePicker_picker_stepSizeMinutes, 1));
        setStepSizeHours(obtainStyledAttributes.getInt(R$styleable.SingleDateAndTimePicker_picker_stepSizeHours, 1));
        this.f5110e.setDayCount(obtainStyledAttributes.getInt(R$styleable.SingleDateAndTimePicker_picker_dayCount, 364));
        setDisplayDays(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayDays, this.f5123y));
        setDisplayMinutes(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayMinutes, this.f5124z));
        setDisplayHours(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayHours, this.A));
        setDisplayMonths(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayMonth, this.f5121w));
        setDisplayYears(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayYears, this.f5120v));
        setDisplayDaysOfMonth(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayDaysOfMonth, this.f5122x));
        setDisplayMonthNumbers(obtainStyledAttributes.getBoolean(R$styleable.SingleDateAndTimePicker_picker_displayMonthNumbers, this.f5108c.f5154t0));
        String string = obtainStyledAttributes.getString(R$styleable.SingleDateAndTimePicker_picker_monthFormat);
        setMonthFormat(TextUtils.isEmpty(string) ? "MMMM" : string);
        setTextAlign(obtainStyledAttributes.getInt(R$styleable.SingleDateAndTimePicker_picker_textAlign, 0));
        c();
        d();
        obtainStyledAttributes.recycle();
        if (this.f5122x) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeZone(this.f5106a.b());
            this.f5109d.setDaysInMonth(instance.getActualMaximum(5));
            this.f5109d.r();
        }
        this.f5110e.r();
    }
}
