package com.vpa.daugia.module.auth.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Auth.kt */
public final class Auth implements Serializable {
    @b("accessToken")
    private String accessToken;
    @b("expirationTime")
    private String expirationTime;
    @b("firstTimeToken")
    private String firstTimeToken;
    @b("message")
    private String message;
    @b("passwordExpiredTime")
    private String passwordExpiredTime;
    @b("refreshToken")
    private String refreshToken;
    @b("requiredChangePassword")
    private boolean requiredChangePassword;
    @b("retryCount")
    private Integer retryCount;
    @b("success")
    private boolean success;
    @b("userId")
    private String userId;

    public Auth() {
        this((String) null, (Integer) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, 1023, (e) null);
    }

    public Auth(String str, Integer num, String str2, String str3, boolean z10, boolean z11, String str4, String str5, String str6, String str7) {
        j.f(str, "userId");
        j.f(str6, "message");
        j.f(str7, "refreshToken");
        this.userId = str;
        this.retryCount = num;
        this.accessToken = str2;
        this.firstTimeToken = str3;
        this.success = z10;
        this.requiredChangePassword = z11;
        this.expirationTime = str4;
        this.passwordExpiredTime = str5;
        this.message = str6;
        this.refreshToken = str7;
    }

    public static /* synthetic */ Auth copy$default(Auth auth, String str, Integer num, String str2, String str3, boolean z10, boolean z11, String str4, String str5, String str6, String str7, int i10, Object obj) {
        Auth auth2 = auth;
        int i11 = i10;
        return auth.copy((i11 & 1) != 0 ? auth2.userId : str, (i11 & 2) != 0 ? auth2.retryCount : num, (i11 & 4) != 0 ? auth2.accessToken : str2, (i11 & 8) != 0 ? auth2.firstTimeToken : str3, (i11 & 16) != 0 ? auth2.success : z10, (i11 & 32) != 0 ? auth2.requiredChangePassword : z11, (i11 & 64) != 0 ? auth2.expirationTime : str4, (i11 & 128) != 0 ? auth2.passwordExpiredTime : str5, (i11 & 256) != 0 ? auth2.message : str6, (i11 & 512) != 0 ? auth2.refreshToken : str7);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.refreshToken;
    }

    public final Integer component2() {
        return this.retryCount;
    }

    public final String component3() {
        return this.accessToken;
    }

    public final String component4() {
        return this.firstTimeToken;
    }

    public final boolean component5() {
        return this.success;
    }

    public final boolean component6() {
        return this.requiredChangePassword;
    }

    public final String component7() {
        return this.expirationTime;
    }

    public final String component8() {
        return this.passwordExpiredTime;
    }

    public final String component9() {
        return this.message;
    }

    public final Auth copy(String str, Integer num, String str2, String str3, boolean z10, boolean z11, String str4, String str5, String str6, String str7) {
        j.f(str, "userId");
        String str8 = str6;
        j.f(str8, "message");
        String str9 = str7;
        j.f(str9, "refreshToken");
        return new Auth(str, num, str2, str3, z10, z11, str4, str5, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Auth)) {
            return false;
        }
        Auth auth = (Auth) obj;
        return j.a(this.userId, auth.userId) && j.a(this.retryCount, auth.retryCount) && j.a(this.accessToken, auth.accessToken) && j.a(this.firstTimeToken, auth.firstTimeToken) && this.success == auth.success && this.requiredChangePassword == auth.requiredChangePassword && j.a(this.expirationTime, auth.expirationTime) && j.a(this.passwordExpiredTime, auth.passwordExpiredTime) && j.a(this.message, auth.message) && j.a(this.refreshToken, auth.refreshToken);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getExpirationTime() {
        return this.expirationTime;
    }

    public final String getFirstTimeToken() {
        return this.firstTimeToken;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPasswordExpiredTime() {
        return this.passwordExpiredTime;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final boolean getRequiredChangePassword() {
        return this.requiredChangePassword;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = this.userId.hashCode() * 31;
        Integer num = this.retryCount;
        int i14 = 0;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i15 = (hashCode + i10) * 31;
        String str = this.accessToken;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        String str2 = this.firstTimeToken;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        boolean z10 = this.success;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i18 = (i17 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.requiredChangePassword;
        if (!z12) {
            z11 = z12;
        }
        int i19 = (i18 + (z11 ? 1 : 0)) * 31;
        String str3 = this.expirationTime;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i20 = (i19 + i13) * 31;
        String str4 = this.passwordExpiredTime;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return this.refreshToken.hashCode() + l.f(this.message, (i20 + i14) * 31, 31);
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setExpirationTime(String str) {
        this.expirationTime = str;
    }

    public final void setFirstTimeToken(String str) {
        this.firstTimeToken = str;
    }

    public final void setMessage(String str) {
        j.f(str, "<set-?>");
        this.message = str;
    }

    public final void setPasswordExpiredTime(String str) {
        this.passwordExpiredTime = str;
    }

    public final void setRefreshToken(String str) {
        j.f(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setRequiredChangePassword(boolean z10) {
        this.requiredChangePassword = z10;
    }

    public final void setRetryCount(Integer num) {
        this.retryCount = num;
    }

    public final void setSuccess(boolean z10) {
        this.success = z10;
    }

    public final void setUserId(String str) {
        j.f(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("Auth(userId=");
        q10.append(this.userId);
        q10.append(", retryCount=");
        q10.append(this.retryCount);
        q10.append(", accessToken=");
        q10.append(this.accessToken);
        q10.append(", firstTimeToken=");
        q10.append(this.firstTimeToken);
        q10.append(", success=");
        q10.append(this.success);
        q10.append(", requiredChangePassword=");
        q10.append(this.requiredChangePassword);
        q10.append(", expirationTime=");
        q10.append(this.expirationTime);
        q10.append(", passwordExpiredTime=");
        q10.append(this.passwordExpiredTime);
        q10.append(", message=");
        q10.append(this.message);
        q10.append(", refreshToken=");
        return l.k(q10, this.refreshToken, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Auth(java.lang.String r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, sk.e r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r12
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0012
        L_0x0011:
            r3 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0027
            r6 = r7
            goto L_0x0029
        L_0x0027:
            r6 = r16
        L_0x0029:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r7 = r17
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r18
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r19
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r21
        L_0x004f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.model.Auth.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
