package ii;

import android.view.View;
import fb.l;
import ji.d;
import lf.g;
import mg.r3;
import of.a;
import of.b;
import sk.j;

/* compiled from: RegisterAuctionFragment.kt */
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20639a;

    public y(q qVar) {
        this.f20639a = qVar;
    }

    public final void a() {
        View view = ((r3) this.f20639a.i0()).f8554e;
        j.e(view, "getRoot(...)");
        new a(view).a("Đăng kí biển số thành công", b.SUCCESS);
        if (j.a(this.f20639a.f20606n0, "REGISTER_AUCTION")) {
            q qVar = this.f20639a;
            l lVar = new l(qVar, 8);
            qVar.getClass();
            g.b.a(qVar, lVar, 1000);
        }
    }
}
