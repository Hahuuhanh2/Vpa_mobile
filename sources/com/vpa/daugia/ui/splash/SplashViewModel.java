package com.vpa.daugia.ui.splash;

import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import ef.j;
import lg.b;

/* compiled from: SplashViewModel.kt */
public final class SplashViewModel extends j {

    /* renamed from: d  reason: collision with root package name */
    public final b f19927d;

    public SplashViewModel(b bVar, AuthApiHelper authApiHelper) {
        sk.j.f(bVar, "sharedPrefsHelper");
        sk.j.f(authApiHelper, "authApiHelper");
        this.f19927d = bVar;
    }
}
