package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import ek.i;
import rk.l;
import rk.p;
import sk.j;

/* compiled from: AwaitPlateAdapter.kt */
public final class k extends sk.k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f22992a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AwaitAuction f22993b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(m mVar, AwaitAuction awaitAuction) {
        super(1);
        this.f22992a = mVar;
        this.f22993b = awaitAuction;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        p<? super AwaitAuction, ? super String, i> pVar = this.f22992a.f22997r;
        if (pVar != null) {
            pVar.invoke(this.f22993b, "ADD_TO_CART");
        }
        return i.f20112a;
    }
}
