package com.google.android.material.datepicker;

import com.google.android.material.datepicker.u;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: RangeDateSelector */
public final class b0 extends d {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6128p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6129q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ y f6130r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f6131s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, u.a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f6131s = rangeDateSelector;
        this.f6128p = textInputLayout2;
        this.f6129q = textInputLayout3;
        this.f6130r = aVar;
    }

    public final void a() {
        RangeDateSelector rangeDateSelector = this.f6131s;
        rangeDateSelector.f6108e = null;
        RangeDateSelector.a(rangeDateSelector, this.f6128p, this.f6129q, this.f6130r);
    }

    public final void b(Long l10) {
        RangeDateSelector rangeDateSelector = this.f6131s;
        rangeDateSelector.f6108e = l10;
        RangeDateSelector.a(rangeDateSelector, this.f6128p, this.f6129q, this.f6130r);
    }
}
