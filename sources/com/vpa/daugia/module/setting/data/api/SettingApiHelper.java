package com.vpa.daugia.module.setting.data.api;

import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.history.data.api.request.AuctionHistoryRequest;
import com.vpa.daugia.module.setting.data.model.Bank;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import java.util.HashMap;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: SettingApiHelper.kt */
public final class SettingApiHelper {
    private final SettingService api;
    private final b sharedPrefs;

    public SettingApiHelper(SettingService settingService, b bVar) {
        j.f(settingService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = settingService;
        this.sharedPrefs = bVar;
    }

    public final Object approve(Object obj, d<? super k<Object>> dVar) {
        return this.api.approve(a.b(this.sharedPrefs, true), obj, dVar);
    }

    public final Object getAllBank(d<? super k<ArrayList<Bank>>> dVar) {
        return this.api.getAllBank(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object getDistrict(String str, d<? super k<ArrayList<SelectAddress>>> dVar) {
        return this.api.getDistrict(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object getDocumentList(AuctionHistoryRequest auctionHistoryRequest, d<? super k<n<MyDocument>>> dVar) {
        HashMap b10 = a.b(this.sharedPrefs, true);
        SettingService settingService = this.api;
        Integer page = auctionHistoryRequest.getPage();
        j.c(page);
        int intValue = page.intValue();
        Integer limit = auctionHistoryRequest.getLimit();
        Long fromDate = auctionHistoryRequest.getFromDate();
        Long toDate = auctionHistoryRequest.getToDate();
        return settingService.getDocumentList(b10, new Integer(intValue), auctionHistoryRequest.getLicensePlate(), fromDate, toDate, limit, dVar);
    }

    public final Object getProvinces(d<? super k<ArrayList<SelectAddress>>> dVar) {
        return this.api.getProvinces(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object getWard(String str, d<? super k<ArrayList<SelectAddress>>> dVar) {
        return this.api.getWard(a.b(this.sharedPrefs, true), str, dVar);
    }
}
