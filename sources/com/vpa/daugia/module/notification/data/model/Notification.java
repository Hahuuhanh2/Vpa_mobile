package com.vpa.daugia.module.notification.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.j;

/* compiled from: Notification.kt */
public final class Notification implements Serializable {
    @b("body")
    private final String body;
    @b("click_action")
    private final String clickAction;
    @b("createdDate")
    private final Long createdDate;
    @b("data")
    private final String data;
    @b("isSeen")
    private Integer isSeen;
    @b("isSent")
    private final Integer isSent;
    @b("priority")
    private final Integer priority;
    @b("pushNotify")
    private final Integer pushNotify;
    @b("sendMail")
    private final Object sendMail;
    @b("sendSMS")
    private final Object sendSMS;
    @b("title")
    private final String title;
    @b("topic")
    private final Object topic;
    @b("userId")
    private final Long userId;
    @b("uuid")
    private final String uuid;

    public Notification(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Object obj, Object obj2, String str3, Object obj3, Long l10, Long l11, String str4, String str5) {
        this.body = str;
        this.data = str2;
        this.isSeen = num;
        this.isSent = num2;
        this.priority = num3;
        this.pushNotify = num4;
        this.sendMail = obj;
        this.sendSMS = obj2;
        this.title = str3;
        this.topic = obj3;
        this.userId = l10;
        this.createdDate = l11;
        this.uuid = str4;
        this.clickAction = str5;
    }

    public static /* synthetic */ Notification copy$default(Notification notification, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Object obj, Object obj2, String str3, Object obj3, Long l10, Long l11, String str4, String str5, int i10, Object obj4) {
        Notification notification2 = notification;
        int i11 = i10;
        return notification.copy((i11 & 1) != 0 ? notification2.body : str, (i11 & 2) != 0 ? notification2.data : str2, (i11 & 4) != 0 ? notification2.isSeen : num, (i11 & 8) != 0 ? notification2.isSent : num2, (i11 & 16) != 0 ? notification2.priority : num3, (i11 & 32) != 0 ? notification2.pushNotify : num4, (i11 & 64) != 0 ? notification2.sendMail : obj, (i11 & 128) != 0 ? notification2.sendSMS : obj2, (i11 & 256) != 0 ? notification2.title : str3, (i11 & 512) != 0 ? notification2.topic : obj3, (i11 & 1024) != 0 ? notification2.userId : l10, (i11 & 2048) != 0 ? notification2.createdDate : l11, (i11 & 4096) != 0 ? notification2.uuid : str4, (i11 & 8192) != 0 ? notification2.clickAction : str5);
    }

    public final String component1() {
        return this.body;
    }

    public final Object component10() {
        return this.topic;
    }

    public final Long component11() {
        return this.userId;
    }

    public final Long component12() {
        return this.createdDate;
    }

    public final String component13() {
        return this.uuid;
    }

    public final String component14() {
        return this.clickAction;
    }

    public final String component2() {
        return this.data;
    }

    public final Integer component3() {
        return this.isSeen;
    }

    public final Integer component4() {
        return this.isSent;
    }

    public final Integer component5() {
        return this.priority;
    }

    public final Integer component6() {
        return this.pushNotify;
    }

    public final Object component7() {
        return this.sendMail;
    }

    public final Object component8() {
        return this.sendSMS;
    }

    public final String component9() {
        return this.title;
    }

    public final Notification copy(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Object obj, Object obj2, String str3, Object obj3, Long l10, Long l11, String str4, String str5) {
        return new Notification(str, str2, num, num2, num3, num4, obj, obj2, str3, obj3, l10, l11, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return j.a(this.body, notification.body) && j.a(this.data, notification.data) && j.a(this.isSeen, notification.isSeen) && j.a(this.isSent, notification.isSent) && j.a(this.priority, notification.priority) && j.a(this.pushNotify, notification.pushNotify) && j.a(this.sendMail, notification.sendMail) && j.a(this.sendSMS, notification.sendSMS) && j.a(this.title, notification.title) && j.a(this.topic, notification.topic) && j.a(this.userId, notification.userId) && j.a(this.createdDate, notification.createdDate) && j.a(this.uuid, notification.uuid) && j.a(this.clickAction, notification.clickAction);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getClickAction() {
        return this.clickAction;
    }

    public final Long getCreatedDate() {
        return this.createdDate;
    }

    public final String getData() {
        return this.data;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final Integer getPushNotify() {
        return this.pushNotify;
    }

    public final Object getSendMail() {
        return this.sendMail;
    }

    public final Object getSendSMS() {
        return this.sendSMS;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Object getTopic() {
        return this.topic;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.body;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.data;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.isSeen;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isSent;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.priority;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pushNotify;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj = this.sendMail;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.sendSMS;
        int hashCode8 = (hashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj3 = this.topic;
        int hashCode10 = (hashCode9 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Long l10 = this.userId;
        int hashCode11 = (hashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.createdDate;
        int hashCode12 = (hashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.uuid;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clickAction;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode13 + i10;
    }

    public final Integer isSeen() {
        return this.isSeen;
    }

    public final Integer isSent() {
        return this.isSent;
    }

    public final void setSeen(Integer num) {
        this.isSeen = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("Notification(body=");
        q10.append(this.body);
        q10.append(", data=");
        q10.append(this.data);
        q10.append(", isSeen=");
        q10.append(this.isSeen);
        q10.append(", isSent=");
        q10.append(this.isSent);
        q10.append(", priority=");
        q10.append(this.priority);
        q10.append(", pushNotify=");
        q10.append(this.pushNotify);
        q10.append(", sendMail=");
        q10.append(this.sendMail);
        q10.append(", sendSMS=");
        q10.append(this.sendSMS);
        q10.append(", title=");
        q10.append(this.title);
        q10.append(", topic=");
        q10.append(this.topic);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", createdDate=");
        q10.append(this.createdDate);
        q10.append(", uuid=");
        q10.append(this.uuid);
        q10.append(", clickAction=");
        return l.k(q10, this.clickAction, ')');
    }
}
