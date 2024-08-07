package com.vpa.daugia.module.history.ui.activity;

import android.content.Intent;
import com.vpa.daugia.module.auction.ui.activity.AuctionProgressActivity;
import com.vpa.daugia.module.history.data.model.AuctionHistory;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionHistoryActivity.kt */
public final class a extends k implements l<AuctionHistory, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f19662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AuctionHistoryActivity auctionHistoryActivity) {
        super(1);
        this.f19662a = auctionHistoryActivity;
    }

    public final Object invoke(Object obj) {
        AuctionHistory auctionHistory = (AuctionHistory) obj;
        j.f(auctionHistory, "it");
        Intent intent = new Intent(this.f19662a, AuctionProgressActivity.class);
        intent.putExtra("DATA_AUCTION", auctionHistory.getDetailPublishPlanId());
        this.f19662a.startActivity(intent);
        return i.f20112a;
    }
}
