package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker */
public final class u<S> extends z<S> {

    /* renamed from: f0  reason: collision with root package name */
    public int f6209f0;

    /* renamed from: g0  reason: collision with root package name */
    public DateSelector<S> f6210g0;

    /* renamed from: h0  reason: collision with root package name */
    public CalendarConstraints f6211h0;

    /* compiled from: MaterialTextInputPicker */
    public class a extends y<S> {
        public a() {
        }

        public final void a() {
            Iterator<y<S>> it = u.this.f6230e0.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public final void b(S s10) {
            Iterator<y<S>> it = u.this.f6230e0.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.f2448f;
        }
        this.f6209f0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6210g0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6211h0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f6210g0.z(layoutInflater.cloneInContext(new ContextThemeWrapper(r(), this.f6209f0)), viewGroup, this.f6211h0, new a());
    }

    public final void T(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6209f0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6210g0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6211h0);
    }
}
