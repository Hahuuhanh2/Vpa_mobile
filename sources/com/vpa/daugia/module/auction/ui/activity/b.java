package com.vpa.daugia.module.auction.ui.activity;

import android.content.Intent;
import bc.h;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionResultActivity.kt */
public final class b extends k implements l<AuctionResult, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f19425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionResultActivity auctionResultActivity) {
        super(1);
        this.f19425a = auctionResultActivity;
    }

    public final Object invoke(Object obj) {
        AuctionResult auctionResult = (AuctionResult) obj;
        j.f(auctionResult, "it");
        Intent intent = new Intent(this.f19425a, DetailAuctionResultActivity.class);
        intent.putExtra("DATA_AUCTION", new h().i(auctionResult));
        intent.putExtras(intent);
        this.f19425a.startActivity(intent);
        return i.f20112a;
    }
}
