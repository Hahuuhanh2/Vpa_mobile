package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import ek.i;
import rk.l;
import rk.p;
import sk.k;

/* compiled from: AwaitPlateAdapter.kt */
public final class j extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f22990a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AwaitAuction f22991b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(m mVar, AwaitAuction awaitAuction) {
        super(1);
        this.f22990a = mVar;
        this.f22991b = awaitAuction;
    }

    public final Object invoke(Object obj) {
        sk.j.f((View) obj, "it");
        p<? super AwaitAuction, ? super String, i> pVar = this.f22990a.f22997r;
        if (pVar != null) {
            pVar.invoke(this.f22991b, "REGISTER_AUCTION");
        }
        return i.f20112a;
    }
}
