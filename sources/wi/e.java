package wi;

import android.widget.RelativeLayout;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import mg.g0;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: MainActivity.kt */
public final class e extends k implements l<f<? extends AccountResponse>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f23427a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(MainActivity mainActivity) {
        super(1);
        this.f23427a = mainActivity;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23427a.O().dismiss();
            RelativeLayout relativeLayout = ((g0) this.f23427a.M()).f21070y;
            j.e(relativeLayout, "root");
            new a(relativeLayout).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23427a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23427a.O().dismiss();
            this.f23427a.T();
            this.f23427a.getClass();
        }
        return i.f20112a;
    }
}
