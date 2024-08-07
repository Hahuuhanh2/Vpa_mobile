package com.vpa.daugia.module.auction.data.api;

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
import java.util.List;
import java.util.Map;
import xl.a;
import xl.f;
import xl.j;
import xl.o;
import xl.p;
import xl.s;
import xl.t;

/* compiled from: AuctionService.kt */
public interface AuctionService {

    /* compiled from: AuctionService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBiddingResult$default(AuctionService auctionService, Map map, String str, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "100";
                }
                return auctionService.getBiddingResult(map, str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBiddingResult");
        }

        public static /* synthetic */ Object getListAwaitAuction$default(AuctionService auctionService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return auctionService.getListAwaitAuction(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListAwaitAuction");
        }

        public static /* synthetic */ Object getRoomAuction$default(AuctionService auctionService, Map map, Long l10, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    l10 = null;
                }
                return auctionService.getRoomAuction(map, l10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRoomAuction");
        }

        public static /* synthetic */ Object getWaitingPlateAuction$default(AuctionService auctionService, Map map, String str, String str2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = "1";
                }
                if ((i10 & 4) != 0) {
                    str2 = "100";
                }
                return auctionService.getWaitingPlateAuction(map, str, str2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWaitingPlateAuction");
        }
    }

    @o("api/customer/mobile/account-verify")
    Object accountVerify(@j Map<String, String> map, @a AccountRequest accountRequest, d<? super k<AccountResponse>> dVar);

    @o("api/bidding/public-result/history/auction-result-session")
    Object getAuctionResult(@j Map<String, String> map, @a Object obj, d<? super n<AuctionResult>> dVar);

    @f("phong-dau-gia/bidding/v1/bidding-result")
    Object getBiddingResult(@j Map<String, String> map, @t("size") String str, d<? super ArrayList<BiddingResult>> dVar);

    @f("/phong-dau-gia/bidding/v1/get-timeout/{userId}")
    Object getBiddingTimeout(@j Map<String, String> map, @s("userId") String str, d<? super ArrayList<BiddingTimeout>> dVar);

    @o("api/bidding/public-result/history/detail/auction-result-session")
    Object getDetailAuctionResult(@j Map<String, String> map, @a Object obj, d<? super n<DetailAuctionResult>> dVar);

    @o("api/bidding/public-result/list-await-auction/province/view")
    Object getListAwaitAuction(@j Map<String, String> map, @a Object obj, d<? super n<AwaitAuction>> dVar);

    @f("api/customer/get-profile")
    Object getProfile(@j Map<String, String> map, d<? super k<UserBiddingProfile>> dVar);

    @o("api/bidding/public-result/list-await-auction/customer/detail")
    Object getRegisterAuction(@j Map<String, String> map, @a Object obj, d<? super k<ArrayList<AwaitAuction>>> dVar);

    @f("phong-dau-gia/bidding/v1/get-user-price-table/{userId}")
    Object getRoomAuction(@j Map<String, String> map, @s("userId") Long l10, d<? super ArrayList<PriceTable>> dVar);

    @f("web-api/time-control/public/time-info")
    Object getTimeInfo(@j Map<String, String> map, d<? super Long> dVar);

    @f("phong-dau-gia/bidding/v1/get-user-price-table/{userId}")
    Object getUserPriceTable(@j Map<String, String> map, @s("userId") String str, d<? super List<PriceTable>> dVar);

    @f("web-api/user-bidding/api/order/get-orders-wait-auction")
    Object getWaitingPlateAuction(@j Map<String, String> map, @t("page") String str, @t("size") String str2, d<? super k<n<OrderWaitAuction>>> dVar);

    @o("phong-dau-gia/sse/{channel}/participant-joined")
    Object joinChannel(@j Map<String, String> map, @s("channel") String str, @a JoinChannelRequest joinChannelRequest, d<? super JoinChannelResponse> dVar);

    @p("phong-dau-gia/sse/{channel}/set-price/{userId}")
    Object setPrice(@j Map<String, String> map, @s("channel") String str, @s("userId") Long l10, @a UserBiddingPrice userBiddingPrice, d<? super UserBiddingPriceResponse> dVar);
}
