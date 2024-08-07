package com.vpa.daugia.module.history.data.api;

import com.vpa.daugia.module.history.data.model.AuctionHistory;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import ef.k;
import ef.n;
import ik.d;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: HistoryApiHelper.kt */
public final class HistoryApiHelper {
    private final HistoryService api;
    private final b sharedPrefs;

    public HistoryApiHelper(HistoryService historyService, b bVar) {
        j.f(historyService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = historyService;
        this.sharedPrefs = bVar;
    }

    public final Object getAuctionHistoryList(Object obj, d<? super k<n<AuctionHistory>>> dVar) {
        return this.api.getAuctionHistoryList(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getDetailAuctionHistoryList(Object obj, d<? super k<n<DetailAuctionHistory>>> dVar) {
        return this.api.getDetailAuctionHistoryList(a.b(this.sharedPrefs, true), obj, dVar);
    }
}
