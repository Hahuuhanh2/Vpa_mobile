package tg;

import android.graphics.Typeface;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.R$color;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.ResultAuctionEnum;
import com.vpa.daugia.module.auction.ui.activity.e;
import ef.d;
import ek.i;
import java.io.Serializable;
import lg.b;
import mg.c5;
import rk.l;
import sk.j;
import ug.f;

/* compiled from: RoomOtherAuctionAdapter.kt */
public final class s extends d<PriceTable, c5> {

    /* renamed from: p  reason: collision with root package name */
    public final l<PriceTable, i> f23010p;

    /* renamed from: q  reason: collision with root package name */
    public final long f23011q;

    public s(b bVar, e eVar) {
        super(eVar);
        long j10;
        String userId;
        this.f23010p = eVar;
        AccountResponse accountResponse = (AccountResponse) bVar.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse == null || (userId = accountResponse.getUserId()) == null) {
            j10 = 0;
        } else {
            j10 = Long.parseLong(userId);
        }
        this.f23011q = j10;
    }

    public final void u(d2.l lVar, int i10, Serializable serializable) {
        c5 c5Var = (c5) lVar;
        PriceTable priceTable = (PriceTable) serializable;
        j.f(c5Var, "binding");
        j.f(priceTable, "model");
        c5Var.v(new f(priceTable, Long.valueOf(this.f23011q)));
        if (priceTable.getSelected()) {
            c5Var.f21012w.setStrokeWidth(8);
            c5Var.f21012w.setStrokeColor(y().getColor(2131100275));
        } else {
            c5Var.f21012w.setStrokeWidth(1);
            c5Var.f21012w.setStrokeColor(y().getColor(R$color.dark_600));
        }
        if (priceTable.getResult() == ResultAuctionEnum.CANCEL.getValue()) {
            c5Var.f21014y.setTypeface((Typeface) null, 1);
        } else {
            c5Var.f21014y.setTypeface((Typeface) null, 0);
        }
        MaterialCardView materialCardView = c5Var.f21012w;
        j.e(materialCardView, "card");
        materialCardView.setOnClickListener(new kf.b(500, materialCardView, new r(this, priceTable)));
    }

    public final int x() {
        return C0535R$layout.item_auction_room;
    }

    public final void z(Serializable serializable) {
        j.f((PriceTable) serializable, "model");
    }
}
