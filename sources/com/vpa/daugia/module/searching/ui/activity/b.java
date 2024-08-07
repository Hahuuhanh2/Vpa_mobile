package com.vpa.daugia.module.searching.ui.activity;

import android.widget.LinearLayout;
import ek.i;
import fk.p;
import java.util.ArrayList;
import java.util.List;
import mg.z;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: FilterActivity.kt */
public final class b extends k implements l<gf.b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f19876a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(FilterActivity filterActivity) {
        super(1);
        this.f19876a = filterActivity;
    }

    public final Object invoke(Object obj) {
        gf.b bVar = (gf.b) obj;
        j.f(bVar, "it");
        FilterActivity filterActivity = this.f19876a;
        int i10 = FilterActivity.Y;
        List<gf.b> Z0 = p.Z0(filterActivity.U().f22651e);
        for (gf.b bVar2 : Z0) {
            if (j.a(bVar2.b(), bVar.b())) {
                bVar2.f10499c = false;
            }
        }
        filterActivity.U().v(Z0);
        ArrayList arrayList = new ArrayList();
        for (Object next : Z0) {
            if (((gf.b) next).f10499c) {
                arrayList.add(next);
            }
        }
        ArrayList b12 = p.b1(arrayList);
        ((pi.b) filterActivity.X.getValue()).A(b12);
        if (b12.isEmpty()) {
            LinearLayout linearLayout = ((z) filterActivity.M()).f21509z;
            j.e(linearLayout, "llProvince");
            linearLayout.setVisibility(8);
        }
        return i.f20112a;
    }
}
