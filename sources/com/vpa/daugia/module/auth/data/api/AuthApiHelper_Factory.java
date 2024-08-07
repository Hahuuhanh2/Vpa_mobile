package com.vpa.daugia.module.auth.data.api;

import dk.a;
import kg.c;
import lg.b;

public final class AuthApiHelper_Factory implements a {
    private final a<AuthService> apiProvider;
    private final a<c> serviceCacheProvider;
    private final a<b> sharedPrefsProvider;

    public AuthApiHelper_Factory(a<AuthService> aVar, a<b> aVar2, a<c> aVar3) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
        this.serviceCacheProvider = aVar3;
    }

    public static AuthApiHelper_Factory create(a<AuthService> aVar, a<b> aVar2, a<c> aVar3) {
        return new AuthApiHelper_Factory(aVar, aVar2, aVar3);
    }

    public static AuthApiHelper newInstance(AuthService authService, b bVar, c cVar) {
        return new AuthApiHelper(authService, bVar, cVar);
    }

    public AuthApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get(), this.serviceCacheProvider.get());
    }
}
