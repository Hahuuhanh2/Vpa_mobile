package com.vpa.daugia.module.setting.data.api;

import com.vpa.daugia.module.common.data.model.MyDocument;
import com.vpa.daugia.module.setting.data.model.Bank;
import com.vpa.daugia.module.setting.data.model.SelectAddress;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import java.util.Map;
import xl.a;
import xl.f;
import xl.j;
import xl.o;
import xl.t;

/* compiled from: SettingService.kt */
public interface SettingService {
    @o("web-api/user-bidding/api/policy/approve-auction-policy")
    Object approve(@j Map<String, String> map, @a Object obj, d<? super k<Object>> dVar);

    @f("web-api/user-payment/api/payment/categories/get-all-bank")
    Object getAllBank(@j Map<String, String> map, d<? super k<ArrayList<Bank>>> dVar);

    @f("web-api/user-bidding/api/administrative/districts")
    Object getDistrict(@j Map<String, String> map, @t("provinceId") String str, d<? super k<ArrayList<SelectAddress>>> dVar);

    @f("web-api/user-bidding/api/document/v2/user/all")
    Object getDocumentList(@j Map<String, String> map, @t("page") Integer num, @t("licensePlate") String str, @t("fromDate") Long l10, @t("toDate") Long l11, @t("size") Integer num2, d<? super k<n<MyDocument>>> dVar);

    @f("web-api/user-bidding/api/administrative/provinces")
    Object getProvinces(@j Map<String, String> map, d<? super k<ArrayList<SelectAddress>>> dVar);

    @f("web-api/user-bidding/api/administrative/wards")
    Object getWard(@j Map<String, String> map, @t("districtId") String str, d<? super k<ArrayList<SelectAddress>>> dVar);
}
