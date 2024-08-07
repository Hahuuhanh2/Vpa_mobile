package com.kizitonwose.calendar.view.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: Utils.kt */
public final class d<Day> {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f8061a;

    /* renamed from: b  reason: collision with root package name */
    public final View f8062b;

    /* renamed from: c  reason: collision with root package name */
    public final View f8063c;

    /* renamed from: d  reason: collision with root package name */
    public final List<g<Day>> f8064d;

    public d(ViewGroup viewGroup, View view, View view2, ArrayList arrayList) {
        this.f8061a = viewGroup;
        this.f8062b = view;
        this.f8063c = view2;
        this.f8064d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f8061a, dVar.f8061a) && j.a(this.f8062b, dVar.f8062b) && j.a(this.f8063c, dVar.f8063c) && j.a(this.f8064d, dVar.f8064d);
    }

    public final int hashCode() {
        int hashCode = this.f8061a.hashCode() * 31;
        View view = this.f8062b;
        int i10 = 0;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f8063c;
        if (view2 != null) {
            i10 = view2.hashCode();
        }
        return this.f8064d.hashCode() + ((hashCode2 + i10) * 31);
    }

    public final String toString() {
        ViewGroup viewGroup = this.f8061a;
        View view = this.f8062b;
        View view2 = this.f8063c;
        List<g<Day>> list = this.f8064d;
        return "ItemContent(itemView=" + viewGroup + ", headerView=" + view + ", footerView=" + view2 + ", weekHolders=" + list + ")";
    }
}
