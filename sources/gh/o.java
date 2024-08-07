package gh;

import com.vpa.daugia.module.cart.data.model.CartStatus;
import ef.n;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: UnpaidCartFragment.kt */
public final class o extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f20324a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(t tVar) {
        super(0);
        this.f20324a = tVar;
    }

    public final Object invoke() {
        t tVar = this.f20324a;
        int i10 = t.f20329o0;
        tVar.n0().f19598e = new n<>((Object) null);
        this.f20324a.n0().d(CartStatus.NOT_PAID);
        return i.f20112a;
    }
}
