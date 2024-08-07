package com.vpa.daugia.module.setting.data.api;

import dk.a;
import lg.b;

public final class SettingApiHelper_Factory implements a {
    private final a<SettingService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public SettingApiHelper_Factory(a<SettingService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static SettingApiHelper_Factory create(a<SettingService> aVar, a<b> aVar2) {
        return new SettingApiHelper_Factory(aVar, aVar2);
    }

    public static SettingApiHelper newInstance(SettingService settingService, b bVar) {
        return new SettingApiHelper(settingService, bVar);
    }

    public SettingApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
