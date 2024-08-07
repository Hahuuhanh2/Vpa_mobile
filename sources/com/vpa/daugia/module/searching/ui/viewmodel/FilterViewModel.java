package com.vpa.daugia.module.searching.ui.viewmodel;

import al.r0;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import gf.b;
import ik.d;
import java.util.ArrayList;
import java.util.List;
import p3.l0;
import qi.a;
import r2.p;
import r2.v;
import sk.j;

/* compiled from: FilterViewModel.kt */
public final class FilterViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final SettingApiHelper f19878d;

    /* renamed from: e  reason: collision with root package name */
    public final p f19879e;

    /* renamed from: f  reason: collision with root package name */
    public final p<List<b>> f19880f;

    /* renamed from: g  reason: collision with root package name */
    public final p f19881g;

    public FilterViewModel(SettingApiHelper settingApiHelper) {
        j.f(settingApiHelper, "settingApiHelper");
        this.f19878d = settingApiHelper;
        p pVar = new p();
        this.f19879e = pVar;
        p<List<b>> pVar2 = new p<>();
        this.f19880f = pVar2;
        this.f19881g = pVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b("Xe con", false, "1", Integer.valueOf(C0531R$drawable.ic_car_1), 38));
        arrayList.add(new b("Xe khách", false, "2", Integer.valueOf(C0531R$drawable.ic_car_2), 38));
        arrayList.add(new b("Xe tải", false, "3", Integer.valueOf(C0531R$drawable.ic_car_3), 38));
        arrayList.add(new b("Xe tải van", false, "4", Integer.valueOf(C0531R$drawable.ic_car_4), 38));
        pVar.k(arrayList);
        l0.j0(l0.d0(this), r0.f19085b, new a(this, (d<? super a>) null), 2);
    }
}
