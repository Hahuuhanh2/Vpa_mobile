package com.vpa.daugia.module.home.data.api;

import com.vpa.daugia.module.history.data.model.NotifyAuction;
import com.vpa.daugia.module.home.data.api.request.AnnouncementPlanRequest;
import com.vpa.daugia.module.home.data.api.response.Plate;
import com.vpa.daugia.module.home.data.model.AuctionPolicy;
import com.vpa.daugia.module.home.data.model.NewDetail;
import com.vpa.daugia.module.home.data.model.News;
import com.vpa.daugia.module.register.data.model.RegisterAuction;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import java.util.Map;
import xl.a;
import xl.f;
import xl.j;
import xl.o;
import xl.p;
import xl.s;
import xl.t;

/* compiled from: HomeService.kt */
public interface HomeService {

    /* compiled from: HomeService.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAuctionPolicy$default(HomeService homeService, Map map, String str, Long l10, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                if ((i10 & 4) != 0) {
                    l10 = Long.valueOf(System.currentTimeMillis());
                }
                return homeService.getAuctionPolicy(map, str, l10, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAuctionPolicy");
        }

        public static /* synthetic */ Object getNews$default(HomeService homeService, Map map, Integer num, Integer num2, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    num = 1;
                }
                if ((i10 & 4) != 0) {
                    num2 = 7;
                }
                return homeService.getNews(map, num, num2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNews");
        }

        public static /* synthetic */ Object getNotifyAuction$default(HomeService homeService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return homeService.getNotifyAuction(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotifyAuction");
        }

        public static /* synthetic */ Object registerAuction$default(HomeService homeService, Map map, Object obj, d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return homeService.registerAuction(map, obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerAuction");
        }
    }

    @o("api/tin-tuc/public/article/{categoryId}")
    Object getArticle(@j Map<String, String> map, @s("categoryId") Long l10, d<? super NewDetail> dVar);

    @f("web-api/user-bidding/api/policy/get-auction-policy")
    Object getAuctionPolicy(@j Map<String, String> map, @t("orderId") String str, @t("timestamp") Long l10, d<? super k<AuctionPolicy>> dVar);

    @o("search-api/search/list-announcement-plan")
    Object getListAnnouncementPlan(@j Map<String, String> map, @a AnnouncementPlanRequest announcementPlanRequest, d<? super n<Plate>> dVar);

    @o("api/tin-tuc/public/latest-articles")
    Object getNews(@j Map<String, String> map, @t("page") Integer num, @t("limit") Integer num2, d<? super n<News>> dVar);

    @o("api/tin-tuc/public/api/get-public-file")
    Object getNotifyAuction(@j Map<String, String> map, @a Object obj, d<? super k<ArrayList<NotifyAuction>>> dVar);

    @f("web-api/user-bidding/api/order/get-count-orders-payment-status?paymentStatusFilter=NOT_PAID")
    Object getUnpaidOrderCount(@j Map<String, String> map, d<? super k<Integer>> dVar);

    @f("web-api/user-bidding/api/notification/get-unread-count")
    Object getUnreadNotificationCount(@j Map<String, String> map, d<? super k<Integer>> dVar);

    @p("web-api/user-bidding/api/order/create-order")
    Object registerAuction(@j Map<String, String> map, @a Object obj, d<? super k<RegisterAuction>> dVar);
}
