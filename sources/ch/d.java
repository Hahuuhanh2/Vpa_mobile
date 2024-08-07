package ch;

import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AwaitAuctionFragment.kt */
public final class d extends k implements l<OrderWaitAuction, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f19191a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.f19191a = bVar;
    }

    public final Object invoke(Object obj) {
        j.f((OrderWaitAuction) obj, "it");
        lf.i iVar = this.f19191a.f19179n0;
        if (iVar != null) {
            iVar.a();
        }
        return i.f20112a;
    }
}
