package com.vpa.daugia.module.profile.ui;

import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import lg.b;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final CommonApiHelper f19801d;

    /* renamed from: e  reason: collision with root package name */
    public final p<f<EkycReponse>> f19802e;

    /* renamed from: f  reason: collision with root package name */
    public final p f19803f;

    public ProfileViewModel(b bVar, CommonApiHelper commonApiHelper) {
        j.f(bVar, "sharedPrefsHelper");
        j.f(commonApiHelper, "commonApiHelper");
        this.f19801d = commonApiHelper;
        p<f<EkycReponse>> pVar = new p<>();
        this.f19802e = pVar;
        this.f19803f = pVar;
    }
}
