package ch;

import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import ek.i;
import java.util.ArrayList;
import java.util.List;
import mg.e3;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AwaitAuctionFragment.kt */
public final class f extends k implements l<ze.f<? extends ArrayList<OrderWaitAuction>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f19193a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f19193a = bVar;
    }

    public final Object invoke(Object obj) {
        ze.f fVar = (ze.f) obj;
        if (fVar instanceof f.a) {
            this.f19193a.k0().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f19193a.k0().show();
        } else if (fVar instanceof f.c) {
            this.f19193a.k0().dismiss();
            if (((e3) this.f19193a.i0()).f21043x.getOnLoadMore()) {
                this.f19193a.m0().t((List) ((f.c) fVar).f18006a);
                ((e3) this.f19193a.i0()).f21043x.setOnLoadMore(false);
            } else {
                this.f19193a.m0().A((List) ((f.c) fVar).f18006a);
            }
            ((e3) this.f19193a.i0()).f21043x.b(this.f19193a.m0().f9444f);
        }
        return i.f20112a;
    }
}
