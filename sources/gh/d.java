package gh;

import com.vpa.daugia.module.cart.data.model.CartStatus;
import ef.n;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: PaidCartFragment.kt */
public final class d extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f20295a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(0);
        this.f20295a = hVar;
    }

    public final Object invoke() {
        h hVar = this.f20295a;
        int i10 = h.f20299o0;
        hVar.m0().f19598e = new n<>((Object) null);
        this.f20295a.m0().d(CartStatus.PAID);
        return i.f20112a;
    }
}
