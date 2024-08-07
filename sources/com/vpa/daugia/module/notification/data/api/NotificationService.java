package com.vpa.daugia.module.notification.data.api;

import com.vpa.daugia.module.notification.data.model.Notification;
import ef.k;
import ef.n;
import ik.d;
import java.util.Map;
import xl.f;
import xl.j;
import xl.p;
import xl.s;
import xl.t;

/* compiled from: NotificationService.kt */
public interface NotificationService {
    @f("web-api/user-bidding/api/notification/get-all-user-notification")
    Object getNotifications(@j Map<String, String> map, @t("page") Integer num, @t("size") Integer num2, @t("isSeen") Integer num3, d<? super k<n<Notification>>> dVar);

    @p("web-api/user-bidding/api/notification/mark-all-as-read")
    Object markAllAsRead(@j Map<String, String> map, d<? super k<Object>> dVar);

    @p("web-api/user-bidding/api/notification/mark-as-read/{id}")
    Object markAsRead(@j Map<String, String> map, @s("id") String str, d<? super k<Object>> dVar);
}
