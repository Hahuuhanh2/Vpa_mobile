package b2;

import al.g0;
import android.view.View;
import androidx.customview.poolingcontainer.R$id;
import ik.d;
import sk.j;
import w1.m0;
import xk.f;

/* compiled from: PoolingContainer.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3983a = R$id.pooling_container_listener_holder_tag;

    /* renamed from: b  reason: collision with root package name */
    public static final int f3984b = R$id.is_pooling_container_tag;

    public static final void a(View view) {
        j.f(view, "<this>");
        m0 m0Var = new m0(view, (d<? super m0>) null);
        f fVar = new f();
        fVar.f23497d = g0.K(fVar, fVar, m0Var);
        while (fVar.hasNext()) {
            View view2 = (View) fVar.next();
            int i10 = f3983a;
            c cVar = (c) view2.getTag(i10);
            if (cVar == null) {
                cVar = new c();
                view2.setTag(i10, cVar);
            }
            for (int I = j7.a.I(cVar.f3985a); -1 < I; I--) {
                cVar.f3985a.get(I).a();
            }
        }
    }
}
