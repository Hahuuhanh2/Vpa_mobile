package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: AuthRequest.kt */
public final class AuthRequest extends h {
    @b("deviceId")
    private String deviceId;
    @b("fcmToken")
    private String fcmToken;
    @b("password")
    private String password;
    @b("username")
    private String username;

    public AuthRequest() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public AuthRequest(String str, String str2, String str3, String str4) {
        j.f(str2, "password");
        j.f(str3, "fcmToken");
        this.username = str;
        this.password = str2;
        this.fcmToken = str3;
        this.deviceId = str4;
    }

    public static /* synthetic */ AuthRequest copy$default(AuthRequest authRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authRequest.username;
        }
        if ((i10 & 2) != 0) {
            str2 = authRequest.password;
        }
        if ((i10 & 4) != 0) {
            str3 = authRequest.fcmToken;
        }
        if ((i10 & 8) != 0) {
            str4 = authRequest.deviceId;
        }
        return authRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.fcmToken;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final AuthRequest copy(String str, String str2, String str3, String str4) {
        j.f(str2, "password");
        j.f(str3, "fcmToken");
        return new AuthRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRequest)) {
            return false;
        }
        AuthRequest authRequest = (AuthRequest) obj;
        return j.a(this.username, authRequest.username) && j.a(this.password, authRequest.password) && j.a(this.fcmToken, authRequest.fcmToken) && j.a(this.deviceId, authRequest.deviceId);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i10;
        String str = this.username;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int f10 = l.f(this.fcmToken, l.f(this.password, i10 * 31, 31), 31);
        String str2 = this.deviceId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return f10 + i11;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setFcmToken(String str) {
        j.f(str, "<set-?>");
        this.fcmToken = str;
    }

    public final void setPassword(String str) {
        j.f(str, "<set-?>");
        this.password = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuthRequest(username=");
        q10.append(this.username);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", fcmToken=");
        q10.append(this.fcmToken);
        q10.append(", deviceId=");
        return l.k(q10, this.deviceId, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AuthRequest(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, sk.e r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r7 = r6 & 2
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x000c
            r3 = r0
        L_0x000c:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x0011
            r4 = r0
        L_0x0011:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0022
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "toString(...)"
            sk.j.e(r5, r6)
        L_0x0022:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.AuthRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
