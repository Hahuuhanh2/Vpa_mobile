package gh;

import com.vpa.daugia.module.cart.data.model.CartStatus;
import ef.n;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: RefundCartFragment.kt */
public final class j extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f20310a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(0);
        this.f20310a = lVar;
    }

    public final Object invoke() {
        l lVar = this.f20310a;
        int i10 = l.f20312o0;
        lVar.m0().f19598e = new n<>((Object) null);
        this.f20310a.m0().d(CartStatus.REFUND);
        return i.f20112a;
    }
}
