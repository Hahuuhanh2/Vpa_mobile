package g8;

import android.view.View;
import com.google.android.material.internal.x;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import n1.e;
import w1.d0;
import w1.q0;
import w1.w0;

/* compiled from: NavigationRailView */
public final class b implements x.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f10397a;

    public b(NavigationRailView navigationRailView) {
        this.f10397a = navigationRailView;
    }

    public final w0 a(View view, w0 w0Var, x.c cVar) {
        int i10;
        e a10 = w0Var.a(7);
        NavigationRailView navigationRailView = this.f10397a;
        if (NavigationRailView.b(navigationRailView, navigationRailView.f6611o)) {
            cVar.f6513b += a10.f13428b;
        }
        NavigationRailView navigationRailView2 = this.f10397a;
        if (NavigationRailView.b(navigationRailView2, navigationRailView2.f6612p)) {
            cVar.f6515d += a10.f13430d;
        }
        NavigationRailView navigationRailView3 = this.f10397a;
        if (NavigationRailView.b(navigationRailView3, navigationRailView3.f6613q)) {
            int i11 = cVar.f6512a;
            if (x.g(view)) {
                i10 = a10.f13429c;
            } else {
                i10 = a10.f13427a;
            }
            cVar.f6512a = i11 + i10;
        }
        int i12 = cVar.f6512a;
        int i13 = cVar.f6513b;
        int i14 = cVar.f6514c;
        int i15 = cVar.f6515d;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.e.k(view, i12, i13, i14, i15);
        return w0Var;
    }
}
