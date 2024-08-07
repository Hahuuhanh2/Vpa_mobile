package ni;

import android.widget.ImageView;
import com.vpa.daugia.C0535R$layout;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.y5;
import rk.l;
import sk.j;

/* compiled from: InfoScopeAdapter.kt */
public final class a extends d<String, y5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<String, i> f21717p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(bVar);
        j.f(bVar, "listener");
        this.f21717p = bVar;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        boolean z10;
        y5 y5Var = (y5) lVar;
        j.f(y5Var, "binding");
        j.f((String) serializable, "model");
        ImageView imageView = y5Var.f21502w;
        j.e(imageView, "line");
        int i11 = 0;
        if (i10 != j7.a.I(this.f9444f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public final int x() {
        return C0535R$layout.item_info_scope;
    }
}
