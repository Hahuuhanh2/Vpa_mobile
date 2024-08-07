package com.vpa.daugia.module.common.data.api;

import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import ef.k;
import gf.a;
import ik.d;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import xl.j;
import xl.l;
import xl.o;
import xl.p;
import xl.q;
import xl.s;

/* compiled from: CommonService.kt */
public interface CommonService {
    @p("web-api/user-bidding/api/wishlist/add-item/{plateId}")
    Object addWishList(@j Map<String, String> map, @s("plateId") String str, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/ekyc/result")
    @l
    Object ekyc(@j Map<String, String> map, @q("userId") String str, @q List<MultipartBody.Part> list, d<? super k<EkycReponse>> dVar);

    @p("web-api/user-bidding/api/wishlist/remove-item/{plateId}")
    Object removeWishList(@j Map<String, String> map, @s("plateId") String str, d<? super k<Object>> dVar);

    @o("web-api/user-bidding/api/file/upload")
    @l
    Object upload(@j Map<String, String> map, @q List<MultipartBody.Part> list, d<? super k<a>> dVar);
}
