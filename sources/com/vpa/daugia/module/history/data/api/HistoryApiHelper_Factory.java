package com.vpa.daugia.module.history.data.api;

import dk.a;
import lg.b;

public final class HistoryApiHelper_Factory implements a {
    private final a<HistoryService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public HistoryApiHelper_Factory(a<HistoryService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static HistoryApiHelper_Factory create(a<HistoryService> aVar, a<b> aVar2) {
        return new HistoryApiHelper_Factory(aVar, aVar2);
    }

    public static HistoryApiHelper newInstance(HistoryService historyService, b bVar) {
        return new HistoryApiHelper(historyService, bVar);
    }

    public HistoryApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
