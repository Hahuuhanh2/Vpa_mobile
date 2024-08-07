package com.vpa.daugia.module.home.data.api;

import com.vpa.daugia.module.history.data.model.NotifyAuction;
import com.vpa.daugia.module.home.data.api.HomeService;
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
import lg.b;
import sk.j;
import ze.a;

/* compiled from: HomeApiHelper.kt */
public final class HomeApiHelper {
    private final HomeService api;
    private final b sharedPrefs;

    public HomeApiHelper(HomeService homeService, b bVar) {
        j.f(homeService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = homeService;
        this.sharedPrefs = bVar;
    }

    public static /* synthetic */ Object getNotifyAuction$default(HomeApiHelper homeApiHelper, Object obj, d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return homeApiHelper.getNotifyAuction(obj, dVar);
    }

    public final Object getAnnouncementPlan(AnnouncementPlanRequest announcementPlanRequest, d<? super n<Plate>> dVar) {
        return this.api.getListAnnouncementPlan(a.b(this.sharedPrefs, true), announcementPlanRequest, dVar);
    }

    public final Object getArticle(Long l10, d<? super NewDetail> dVar) {
        return this.api.getArticle(a.b(this.sharedPrefs, true), l10, dVar);
    }

    public final Object getAuctionPolicy(String str, d<? super k<AuctionPolicy>> dVar) {
        return HomeService.DefaultImpls.getAuctionPolicy$default(this.api, a.b(this.sharedPrefs, true), str, (Long) null, dVar, 4, (Object) null);
    }

    public final Object getNews(Integer num, d<? super n<News>> dVar) {
        return HomeService.DefaultImpls.getNews$default(this.api, a.b(this.sharedPrefs, true), num, (Integer) null, dVar, 4, (Object) null);
    }

    public final Object getNotifyAuction(Object obj, d<? super k<ArrayList<NotifyAuction>>> dVar) {
        return this.api.getNotifyAuction(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getUnpaidOrderCount(d<? super k<Integer>> dVar) {
        return this.api.getUnpaidOrderCount(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object getUnreadNotification(d<? super k<Integer>> dVar) {
        return this.api.getUnreadNotificationCount(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object registerAuction(Object obj, d<? super k<RegisterAuction>> dVar) {
        return this.api.registerAuction(a.b(this.sharedPrefs, true), obj, dVar);
    }
}
