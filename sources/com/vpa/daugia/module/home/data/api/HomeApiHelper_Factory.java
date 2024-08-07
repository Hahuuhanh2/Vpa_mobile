package com.vpa.daugia.module.home.data.api;

import dk.a;
import lg.b;

public final class HomeApiHelper_Factory implements a {
    private final a<HomeService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public HomeApiHelper_Factory(a<HomeService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static HomeApiHelper_Factory create(a<HomeService> aVar, a<b> aVar2) {
        return new HomeApiHelper_Factory(aVar, aVar2);
    }

    public static HomeApiHelper newInstance(HomeService homeService, b bVar) {
        return new HomeApiHelper(homeService, bVar);
    }

    public HomeApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
