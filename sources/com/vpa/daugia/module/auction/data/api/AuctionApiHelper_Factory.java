package com.vpa.daugia.module.auction.data.api;

import dk.a;
import lg.b;

public final class AuctionApiHelper_Factory implements a {
    private final a<AuctionService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public AuctionApiHelper_Factory(a<AuctionService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static AuctionApiHelper_Factory create(a<AuctionService> aVar, a<b> aVar2) {
        return new AuctionApiHelper_Factory(aVar, aVar2);
    }

    public static AuctionApiHelper newInstance(AuctionService auctionService, b bVar) {
        return new AuctionApiHelper(auctionService, bVar);
    }

    public AuctionApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
