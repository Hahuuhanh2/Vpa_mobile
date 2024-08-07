package com.vpa.daugia.data.model;

import android.support.v4.media.a;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: LastNotification.kt */
public final class LastNotification {
    private String body;
    private String clickAction;
    private String title;
    private String value;

    public LastNotification() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public LastNotification(String str, String str2, String str3, String str4) {
        this.clickAction = str;
        this.value = str2;
        this.title = str3;
        this.body = str4;
    }

    public static /* synthetic */ LastNotification copy$default(LastNotification lastNotification, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lastNotification.clickAction;
        }
        if ((i10 & 2) != 0) {
            str2 = lastNotification.value;
        }
        if ((i10 & 4) != 0) {
            str3 = lastNotification.title;
        }
        if ((i10 & 8) != 0) {
            str4 = lastNotification.body;
        }
        return lastNotification.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.clickAction;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.body;
    }

    public final LastNotification copy(String str, String str2, String str3, String str4) {
        return new LastNotification(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastNotification)) {
            return false;
        }
        LastNotification lastNotification = (LastNotification) obj;
        return j.a(this.clickAction, lastNotification.clickAction) && j.a(this.value, lastNotification.value) && j.a(this.title, lastNotification.title) && j.a(this.body, lastNotification.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getClickAction() {
        return this.clickAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.clickAction;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.body;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setClickAction(String str) {
        this.clickAction = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("LastNotification(clickAction=");
        q10.append(this.clickAction);
        q10.append(", value=");
        q10.append(this.value);
        q10.append(", title=");
        q10.append(this.title);
        q10.append(", body=");
        return l.k(q10, this.body, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LastNotification(String str, String str2, String str3, String str4, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
