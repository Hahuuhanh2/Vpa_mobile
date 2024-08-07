package oi;

import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import ek.i;
import fk.p;
import gf.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mg.z;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: FilterActivity.kt */
public final class g extends k implements l<List<? extends b>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21817a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(FilterActivity filterActivity) {
        super(1);
        this.f21817a = filterActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        List list = (List) obj;
        j.c(list);
        ArrayList b12 = p.b1(list);
        FilterActivity filterActivity = this.f21817a;
        if (filterActivity.S != null) {
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String b10 = bVar.b();
                b bVar2 = filterActivity.S;
                if (bVar2 != null) {
                    str = bVar2.b();
                } else {
                    str = null;
                }
                bVar.f10499c = j.a(b10, str);
            }
        }
        this.f21817a.U().v(p.b1(list));
        FilterActivity.T(this.f21817a);
        if (!this.f21817a.U().u().isEmpty()) {
            ((z) this.f21817a.M()).H.performClick();
        }
        return i.f20112a;
    }
}
