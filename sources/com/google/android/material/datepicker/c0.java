package com.google.android.material.datepicker;

import com.google.android.material.datepicker.u;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: SingleDateSelector */
public final class c0 extends d {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ y f6134p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f6135q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f6136r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, u.a aVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f6136r = singleDateSelector;
        this.f6134p = aVar;
        this.f6135q = textInputLayout2;
    }

    public final void a() {
        SingleDateSelector singleDateSelector = this.f6136r;
        this.f6135q.getError();
        singleDateSelector.getClass();
        this.f6134p.a();
    }

    public final void b(Long l10) {
        if (l10 == null) {
            this.f6136r.f6109a = null;
        } else {
            this.f6136r.F0(l10.longValue());
        }
        this.f6136r.getClass();
        this.f6134p.b(this.f6136r.f6109a);
    }
}
