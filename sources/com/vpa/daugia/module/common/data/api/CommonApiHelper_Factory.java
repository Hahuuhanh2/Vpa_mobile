package com.vpa.daugia.module.common.data.api;

import dk.a;
import lg.b;

public final class CommonApiHelper_Factory implements a {
    private final a<CommonService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public CommonApiHelper_Factory(a<CommonService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static CommonApiHelper_Factory create(a<CommonService> aVar, a<b> aVar2) {
        return new CommonApiHelper_Factory(aVar, aVar2);
    }

    public static CommonApiHelper newInstance(CommonService commonService, b bVar) {
        return new CommonApiHelper(commonService, bVar);
    }

    public CommonApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
