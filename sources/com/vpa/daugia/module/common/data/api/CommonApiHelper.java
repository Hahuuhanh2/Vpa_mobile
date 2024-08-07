package com.vpa.daugia.module.common.data.api;

import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import com.vpa.daugia.module.auth.data.model.User;
import ef.k;
import ik.d;
import java.util.HashMap;
import java.util.List;
import lg.b;
import okhttp3.MultipartBody;
import sk.j;
import ze.a;

/* compiled from: CommonApiHelper.kt */
public final class CommonApiHelper {
    private final CommonService api;
    private final b sharedPrefs;

    public CommonApiHelper(CommonService commonService, b bVar) {
        j.f(commonService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = commonService;
        this.sharedPrefs = bVar;
    }

    public final Object addWishlistItem(String str, d<? super k<Object>> dVar) {
        return this.api.addWishList(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object ekyc(List<MultipartBody.Part> list, d<? super k<EkycReponse>> dVar) {
        String str;
        HashMap d10 = a.d(this.sharedPrefs);
        CommonService commonService = this.api;
        User e10 = this.sharedPrefs.e();
        if (e10 == null || (str = e10.getId()) == null) {
            str = " ";
        }
        return commonService.ekyc(d10, str, list, dVar);
    }

    public final Object removeWishlistItem(String str, d<? super k<Object>> dVar) {
        return this.api.removeWishList(a.b(this.sharedPrefs, true), str, dVar);
    }

    public final Object uploadImage(List<MultipartBody.Part> list, d<? super k<gf.a>> dVar) {
        return this.api.upload(a.d(this.sharedPrefs), list, dVar);
    }
}
