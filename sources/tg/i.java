package tg;

import android.view.View;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import ji.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AwaitPlateAdapter.kt */
public final class i extends k implements l<View, ek.i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f22988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AwaitAuction f22989b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(m mVar, AwaitAuction awaitAuction) {
        super(1);
        this.f22988a = mVar;
        this.f22989b = awaitAuction;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        new a(this.f22988a.y(), this.f22989b).h();
        return ek.i.f20112a;
    }
}
