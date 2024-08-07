package com.vpa.daugia.module.history.data.api;

import com.vpa.daugia.module.history.data.model.AuctionHistory;
import com.vpa.daugia.module.history.data.model.DetailAuctionHistory;
import ef.k;
import ef.n;
import ik.d;
import java.util.Map;
import xl.a;
import xl.j;
import xl.o;

/* compiled from: HistoryService.kt */
public interface HistoryService {
    @o("web-api/user-bidding/api/user/auction-result/get-history-and-result")
    Object getAuctionHistoryList(@j Map<String, String> map, @a Object obj, d<? super k<n<AuctionHistory>>> dVar);

    @o("web-api/user-bidding/api/auction-history/auction-history-detail")
    Object getDetailAuctionHistoryList(@j Map<String, String> map, @a Object obj, d<? super k<n<DetailAuctionHistory>>> dVar);
}
