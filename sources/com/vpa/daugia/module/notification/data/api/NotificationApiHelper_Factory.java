package com.vpa.daugia.module.notification.data.api;

import dk.a;
import lg.b;

public final class NotificationApiHelper_Factory implements a {
    private final a<NotificationService> apiProvider;
    private final a<b> sharedPrefsProvider;

    public NotificationApiHelper_Factory(a<NotificationService> aVar, a<b> aVar2) {
        this.apiProvider = aVar;
        this.sharedPrefsProvider = aVar2;
    }

    public static NotificationApiHelper_Factory create(a<NotificationService> aVar, a<b> aVar2) {
        return new NotificationApiHelper_Factory(aVar, aVar2);
    }

    public static NotificationApiHelper newInstance(NotificationService notificationService, b bVar) {
        return new NotificationApiHelper(notificationService, bVar);
    }

    public NotificationApiHelper get() {
        return newInstance(this.apiProvider.get(), this.sharedPrefsProvider.get());
    }
}
