package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: AccountRequest.kt */
public final class AccountRequest {
    @b("captcha")
    private String captcha;
    @b("deviceType")
    private Integer deviceType;
    @b("invitationCode")
    private String invitationCode;
    @b("password")
    private String password;
    @b("username")
    private String username;

    public AccountRequest() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, 31, (e) null);
    }

    public AccountRequest(String str, String str2, String str3, String str4, Integer num) {
        this.captcha = str;
        this.invitationCode = str2;
        this.password = str3;
        this.username = str4;
        this.deviceType = num;
    }

    public static /* synthetic */ AccountRequest copy$default(AccountRequest accountRequest, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = accountRequest.captcha;
        }
        if ((i10 & 2) != 0) {
            str2 = accountRequest.invitationCode;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = accountRequest.password;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = accountRequest.username;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            num = accountRequest.deviceType;
        }
        return accountRequest.copy(str, str5, str6, str7, num);
    }

    public final String component1() {
        return this.captcha;
    }

    public final String component2() {
        return this.invitationCode;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.username;
    }

    public final Integer component5() {
        return this.deviceType;
    }

    public final AccountRequest copy(String str, String str2, String str3, String str4, Integer num) {
        return new AccountRequest(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountRequest)) {
            return false;
        }
        AccountRequest accountRequest = (AccountRequest) obj;
        return j.a(this.captcha, accountRequest.captcha) && j.a(this.invitationCode, accountRequest.invitationCode) && j.a(this.password, accountRequest.password) && j.a(this.username, accountRequest.username) && j.a(this.deviceType, accountRequest.deviceType);
    }

    public final String getCaptcha() {
        return this.captcha;
    }

    public final Integer getDeviceType() {
        return this.deviceType;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.captcha;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.invitationCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.deviceType;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setCaptcha(String str) {
        this.captcha = str;
    }

    public final void setDeviceType(Integer num) {
        this.deviceType = num;
    }

    public final void setInvitationCode(String str) {
        this.invitationCode = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("AccountRequest(captcha=");
        q10.append(this.captcha);
        q10.append(", invitationCode=");
        q10.append(this.invitationCode);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", username=");
        q10.append(this.username);
        q10.append(", deviceType=");
        q10.append(this.deviceType);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AccountRequest(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, int r9, sk.e r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0026
            r4 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
        L_0x0026:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.AccountRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, sk.e):void");
    }
}
