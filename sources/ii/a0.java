package ii;

import android.view.View;
import ek.i;
import mg.r3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: RegisterAuctionFragment.kt */
public final class a0 extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20577a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(q qVar) {
        super(1);
        this.f20577a = qVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((r3) this.f20577a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        }
        return i.f20112a;
    }
}
