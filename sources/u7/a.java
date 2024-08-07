package u7;

import android.view.View;
import com.google.android.material.internal.x;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import w1.w0;

/* compiled from: BottomNavigationView */
public final class a implements x.b {
    public final w0 a(View view, w0 w0Var, x.c cVar) {
        int i10;
        cVar.f6515d = w0Var.b() + cVar.f6515d;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        boolean z10 = true;
        if (d0.e.d(view) != 1) {
            z10 = false;
        }
        int c10 = w0Var.c();
        int d10 = w0Var.d();
        int i11 = cVar.f6512a;
        if (z10) {
            i10 = d10;
        } else {
            i10 = c10;
        }
        int i12 = i11 + i10;
        cVar.f6512a = i12;
        int i13 = cVar.f6514c;
        if (!z10) {
            c10 = d10;
        }
        int i14 = i13 + c10;
        cVar.f6514c = i14;
        d0.e.k(view, i12, cVar.f6513b, i14, cVar.f6515d);
        return w0Var;
    }
}
