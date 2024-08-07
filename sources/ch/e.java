package ch;

import al.r0;
import android.content.Context;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import ek.i;
import ik.d;
import lg.b;
import p3.l0;
import rg.a;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: AwaitAuctionFragment.kt */
public final class e extends k implements p<Boolean, OrderWaitAuction, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f19192a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b bVar) {
        super(2);
        this.f19192a = bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        OrderWaitAuction orderWaitAuction = (OrderWaitAuction) obj2;
        j.f(orderWaitAuction, "item");
        Context d02 = this.f19192a.d0();
        b bVar = this.f19192a.f19180o0;
        if (bVar != null) {
            if (ze.b.l(d02, bVar)) {
                AuctionViewModel n02 = this.f19192a.n0();
                String id2 = orderWaitAuction.getId();
                if (id2 == null) {
                    id2 = "";
                }
                l0.j0(l0.d0(n02), r0.f19085b, new a(booleanValue, n02, id2, (d<? super a>) null), 2);
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
