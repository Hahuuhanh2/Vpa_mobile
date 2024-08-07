package com.vpa.daugia.module.auction.data.api;

import com.vpa.daugia.module.auction.data.api.AuctionService;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.data.model.AccountResponse;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.auction.data.model.BiddingResult;
import com.vpa.daugia.module.auction.data.model.BiddingTimeout;
import com.vpa.daugia.module.auction.data.model.DetailAuctionResult;
import com.vpa.daugia.module.auction.data.model.JoinChannelRequest;
import com.vpa.daugia.module.auction.data.model.JoinChannelResponse;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.data.model.UserBiddingPrice;
import com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse;
import com.vpa.daugia.module.auction.data.model.UserBiddingProfile;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import java.util.HashMap;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: AuctionApiHelper.kt */
public final class AuctionApiHelper {
    private final AuctionService api;
    private final b sharedPrefs;

    public AuctionApiHelper(AuctionService auctionService, b bVar) {
        j.f(auctionService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = auctionService;
        this.sharedPrefs = bVar;
    }

    public final Object getAuctionResult(Object obj, d<? super n<AuctionResult>> dVar) {
        return this.api.getAuctionResult(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getBiddingResult(d<? super ArrayList<BiddingResult>> dVar) {
        return AuctionService.DefaultImpls.getBiddingResult$default(this.api, a.c(this.sharedPrefs), (String) null, dVar, 2, (Object) null);
    }

    public final Object getBiddingTimeout(d<? super ArrayList<BiddingTimeout>> dVar) {
        String str;
        HashMap c10 = a.c(this.sharedPrefs);
        AuctionService auctionService = this.api;
        AccountResponse accountResponse = (AccountResponse) this.sharedPrefs.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse == null || (str = accountResponse.getUserId()) == null) {
            str = "";
        }
        return auctionService.getBiddingTimeout(c10, str, dVar);
    }

    public final Object getDetailAuctionResult(Object obj, d<? super n<DetailAuctionResult>> dVar) {
        return this.api.getDetailAuctionResult(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getListAwaitAuction(Object obj, d<? super n<AwaitAuction>> dVar) {
        return this.api.getListAwaitAuction(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getProfile(d<? super k<UserBiddingProfile>> dVar) {
        return this.api.getProfile(a.c(this.sharedPrefs), dVar);
    }

    public final Object getRegisterAuction(Object obj, d<? super k<ArrayList<AwaitAuction>>> dVar) {
        return this.api.getRegisterAuction(a.c(this.sharedPrefs), obj, dVar);
    }

    public final Object getRoomAuction(d<? super ArrayList<PriceTable>> dVar) {
        Long l10;
        String userId;
        HashMap c10 = a.c(this.sharedPrefs);
        AuctionService auctionService = this.api;
        AccountResponse accountResponse = (AccountResponse) this.sharedPrefs.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse == null || (userId = accountResponse.getUserId()) == null) {
            l10 = null;
        } else {
            l10 = new Long(Long.parseLong(userId));
        }
        return auctionService.getRoomAuction(c10, l10, dVar);
    }

    public final Object getTimeInfo(d<? super Long> dVar) {
        return this.api.getTimeInfo(a.c(this.sharedPrefs), dVar);
    }

    public final Object getWaitingPlateAuction(d<? super k<n<OrderWaitAuction>>> dVar) {
        return AuctionService.DefaultImpls.getWaitingPlateAuction$default(this.api, a.b(this.sharedPrefs, true), (String) null, (String) null, dVar, 6, (Object) null);
    }

    public final Object joinChannel(String str, JoinChannelRequest joinChannelRequest, d<? super JoinChannelResponse> dVar) {
        return this.api.joinChannel(a.c(this.sharedPrefs), str, joinChannelRequest, dVar);
    }

    public final Object setPrice(String str, UserBiddingPrice userBiddingPrice, d<? super UserBiddingPriceResponse> dVar) {
        Long l10;
        String userId;
        HashMap c10 = a.c(this.sharedPrefs);
        AuctionService auctionService = this.api;
        AccountResponse accountResponse = (AccountResponse) this.sharedPrefs.b(AccountResponse.class, "DATA_USER_AUCTION");
        if (accountResponse == null || (userId = accountResponse.getUserId()) == null) {
            l10 = null;
        } else {
            l10 = new Long(Long.parseLong(userId));
        }
        return auctionService.setPrice(c10, str, l10, userBiddingPrice, dVar);
    }

    public final Object verifyAccount(AccountRequest accountRequest, d<? super k<AccountResponse>> dVar) {
        return this.api.accountVerify(a.b(this.sharedPrefs, true), accountRequest, dVar);
    }
}
