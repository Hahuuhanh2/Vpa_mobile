package com.vpa.daugia.module.notification.data.api;

import com.vpa.daugia.module.notification.data.model.Notification;
import ef.k;
import ef.n;
import ik.d;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: NotificationApiHelper.kt */
public final class NotificationApiHelper {
    private final NotificationService api;
    private final b sharedPrefs;

    public NotificationApiHelper(NotificationService notificationService, b bVar) {
        j.f(notificationService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = notificationService;
        this.sharedPrefs = bVar;
    }

    public final Object getNotifications(Integer num, Integer num2, Integer num3, d<? super k<n<Notification>>> dVar) {
        return this.api.getNotifications(a.b(this.sharedPrefs, true), num, num2, num3, dVar);
    }

    public final Object markAllAsRead(d<? super k<Object>> dVar) {
        return this.api.markAllAsRead(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object markAsRead(String str, d<? super k<Object>> dVar) {
        return this.api.markAsRead(a.b(this.sharedPrefs, true), str, dVar);
    }
}
