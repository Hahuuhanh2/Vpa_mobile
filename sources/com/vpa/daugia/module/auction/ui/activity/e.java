package com.vpa.daugia.module.auction.ui.activity;

import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: SessionAuctionActivity.kt */
public final class e extends k implements l<PriceTable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionAuctionActivity f19428a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(SessionAuctionActivity sessionAuctionActivity) {
        super(1);
        this.f19428a = sessionAuctionActivity;
    }

    public final Object invoke(Object obj) {
        PriceTable priceTable = (PriceTable) obj;
        j.f(priceTable, "it");
        SessionAuctionActivity sessionAuctionActivity = this.f19428a;
        int i10 = SessionAuctionActivity.X;
        sessionAuctionActivity.U().h(priceTable, false);
        return i.f20112a;
    }
}
