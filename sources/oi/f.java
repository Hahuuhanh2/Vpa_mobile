package oi;

import android.view.View;
import android.widget.LinearLayout;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import ek.i;
import fk.p;
import java.util.ArrayList;
import lf.g;
import mg.z;
import pi.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: FilterActivity.kt */
public final class f extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21816a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(FilterActivity filterActivity) {
        super(1);
        this.f21816a = filterActivity;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        int i10;
        j.f((View) obj, "it");
        LinearLayout linearLayout = ((z) this.f21816a.M()).f21508y;
        j.e(linearLayout, "cvSearch");
        LinearLayout linearLayout2 = ((z) this.f21816a.M()).f21508y;
        j.e(linearLayout2, "cvSearch");
        if (linearLayout2.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        FilterActivity filterActivity = this.f21816a;
        if (filterActivity.U) {
            ((z) filterActivity.M()).H.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_location_filter, 0, C0531R$drawable.ic_direction_down, 0);
        } else {
            ((z) filterActivity.M()).H.setCompoundDrawablesWithIntrinsicBounds(C0531R$drawable.ic_location_filter, 0, C0531R$drawable.ic_direction_up, 0);
        }
        FilterActivity filterActivity2 = this.f21816a;
        boolean z11 = !filterActivity2.U;
        filterActivity2.U = z11;
        if (z11) {
            LinearLayout linearLayout3 = ((z) filterActivity2.M()).f21509z;
            j.e(linearLayout3, "llProvince");
            linearLayout3.setVisibility(8);
        } else {
            ArrayList u10 = filterActivity2.U().u();
            if (!u10.isEmpty()) {
                LinearLayout linearLayout4 = ((z) this.f21816a.M()).f21509z;
                j.e(linearLayout4, "llProvince");
                linearLayout4.setVisibility(0);
                ((b) this.f21816a.X.getValue()).A(p.b1(u10));
            }
        }
        FilterActivity filterActivity3 = this.f21816a;
        fb.l lVar = new fb.l(filterActivity3, 9);
        filterActivity3.getClass();
        g.b.a(filterActivity3, lVar, 200);
        return i.f20112a;
    }
}
