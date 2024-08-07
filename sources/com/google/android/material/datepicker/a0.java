package com.google.android.material.datepicker;

import com.google.android.material.datepicker.u;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: RangeDateSelector */
public final class a0 extends d {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6116p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6117q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ y f6118r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f6119s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, u.a aVar) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f6119s = rangeDateSelector;
        this.f6116p = textInputLayout2;
        this.f6117q = textInputLayout3;
        this.f6118r = aVar;
    }

    public final void a() {
        RangeDateSelector rangeDateSelector = this.f6119s;
        rangeDateSelector.f6107d = null;
        RangeDateSelector.a(rangeDateSelector, this.f6116p, this.f6117q, this.f6118r);
    }

    public final void b(Long l10) {
        RangeDateSelector rangeDateSelector = this.f6119s;
        rangeDateSelector.f6107d = l10;
        RangeDateSelector.a(rangeDateSelector, this.f6116p, this.f6117q, this.f6118r);
    }
}
