package com.vpa.daugia.module.support.data.api;

import dk.a;
import lg.b;

public final class SupportApiHelper_Factory implements a {
    private final a<SupportService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public SupportApiHelper_Factory(a<SupportService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static SupportApiHelper_Factory create(a<SupportService> aVar, a<b> aVar2) {
        return new SupportApiHelper_Factory(aVar, aVar2);
    }

    public static SupportApiHelper newInstance(SupportService supportService, b bVar) {
        return new SupportApiHelper(supportService, bVar);
    }

    public SupportApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
