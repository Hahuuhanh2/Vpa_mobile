package com.vpa.daugia.module.home.ui;

import com.vpa.daugia.module.history.data.model.NotifyAuction;
import ek.i;
import ph.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionNotifyActivity.kt */
public final class b extends k implements l<NotifyAuction, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f19743a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(AuctionNotifyActivity auctionNotifyActivity) {
        super(1);
        this.f19743a = auctionNotifyActivity;
    }

    public final Object invoke(Object obj) {
        NotifyAuction notifyAuction = (NotifyAuction) obj;
        j.f(notifyAuction, "it");
        new a(this.f19743a, notifyAuction.getDocumentFile()).h();
        return i.f20112a;
    }
}
