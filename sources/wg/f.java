package wg;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionFragment.kt */
public final class f extends k implements l<PriceTable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23397a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f23397a = bVar;
    }

    public final Object invoke(Object obj) {
        j.f((PriceTable) obj, "it");
        b bVar = this.f23397a;
        int i10 = b.f23380q0;
        AuctionRoomViewModel.e(bVar.n0());
        return i.f20112a;
    }
}
