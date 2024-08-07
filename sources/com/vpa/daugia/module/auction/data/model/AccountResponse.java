package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.j;

/* compiled from: AccountResponse.kt */
public final class AccountResponse {
    @b("accessToken")
    private final String accessToken;
    @b("expirationTime")
    private final Long expirationTime;
    @b("firstTimeToken")
    private final String firstTimeToken;
    @b("loginKey")
    private final String loginKey;
    @b("message")
    private final String message;
    @b("needForceLogout")
    private final Boolean needForceLogout;
    @b("passwordExpiredTime")
    private final Object passwordExpiredTime;
    @b("requiredChangePassword")
    private final Object requiredChangePassword;
    @b("retryCount")
    private final Integer retryCount;
    @b("success")
    private final Boolean success;
    @b("userId")
    private final String userId;
    @b("username")
    private final String username;

    public AccountResponse(String str, Long l10, String str2, String str3, String str4, Boolean bool, Object obj, Object obj2, Integer num, Boolean bool2, String str5, String str6) {
        this.accessToken = str;
        this.expirationTime = l10;
        this.firstTimeToken = str2;
        this.loginKey = str3;
        this.message = str4;
        this.needForceLogout = bool;
        this.passwordExpiredTime = obj;
        this.requiredChangePassword = obj2;
        this.retryCount = num;
        this.success = bool2;
        this.userId = str5;
        this.username = str6;
    }

    public static /* synthetic */ AccountResponse copy$default(AccountResponse accountResponse, String str, Long l10, String str2, String str3, String str4, Boolean bool, Object obj, Object obj2, Integer num, Boolean bool2, String str5, String str6, int i10, Object obj3) {
        AccountResponse accountResponse2 = accountResponse;
        int i11 = i10;
        return accountResponse.copy((i11 & 1) != 0 ? accountResponse2.accessToken : str, (i11 & 2) != 0 ? accountResponse2.expirationTime : l10, (i11 & 4) != 0 ? accountResponse2.firstTimeToken : str2, (i11 & 8) != 0 ? accountResponse2.loginKey : str3, (i11 & 16) != 0 ? accountResponse2.message : str4, (i11 & 32) != 0 ? accountResponse2.needForceLogout : bool, (i11 & 64) != 0 ? accountResponse2.passwordExpiredTime : obj, (i11 & 128) != 0 ? accountResponse2.requiredChangePassword : obj2, (i11 & 256) != 0 ? accountResponse2.retryCount : num, (i11 & 512) != 0 ? accountResponse2.success : bool2, (i11 & 1024) != 0 ? accountResponse2.userId : str5, (i11 & 2048) != 0 ? accountResponse2.username : str6);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Boolean component10() {
        return this.success;
    }

    public final String component11() {
        return this.userId;
    }

    public final String component12() {
        return this.username;
    }

    public final Long component2() {
        return this.expirationTime;
    }

    public final String component3() {
        return this.firstTimeToken;
    }

    public final String component4() {
        return this.loginKey;
    }

    public final String component5() {
        return this.message;
    }

    public final Boolean component6() {
        return this.needForceLogout;
    }

    public final Object component7() {
        return this.passwordExpiredTime;
    }

    public final Object component8() {
        return this.requiredChangePassword;
    }

    public final Integer component9() {
        return this.retryCount;
    }

    public final AccountResponse copy(String str, Long l10, String str2, String str3, String str4, Boolean bool, Object obj, Object obj2, Integer num, Boolean bool2, String str5, String str6) {
        return new AccountResponse(str, l10, str2, str3, str4, bool, obj, obj2, num, bool2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountResponse)) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) obj;
        return j.a(this.accessToken, accountResponse.accessToken) && j.a(this.expirationTime, accountResponse.expirationTime) && j.a(this.firstTimeToken, accountResponse.firstTimeToken) && j.a(this.loginKey, accountResponse.loginKey) && j.a(this.message, accountResponse.message) && j.a(this.needForceLogout, accountResponse.needForceLogout) && j.a(this.passwordExpiredTime, accountResponse.passwordExpiredTime) && j.a(this.requiredChangePassword, accountResponse.requiredChangePassword) && j.a(this.retryCount, accountResponse.retryCount) && j.a(this.success, accountResponse.success) && j.a(this.userId, accountResponse.userId) && j.a(this.username, accountResponse.username);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Long getExpirationTime() {
        return this.expirationTime;
    }

    public final String getFirstTimeToken() {
        return this.firstTimeToken;
    }

    public final String getLoginKey() {
        return this.loginKey;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getNeedForceLogout() {
        return this.needForceLogout;
    }

    public final Object getPasswordExpiredTime() {
        return this.passwordExpiredTime;
    }

    public final Object getRequiredChangePassword() {
        return this.requiredChangePassword;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.accessToken;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.expirationTime;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.firstTimeToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loginKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.needForceLogout;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj = this.passwordExpiredTime;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.requiredChangePassword;
        int hashCode8 = (hashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.retryCount;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.success;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.userId;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.username;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode11 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AccountResponse(accessToken=");
        q10.append(this.accessToken);
        q10.append(", expirationTime=");
        q10.append(this.expirationTime);
        q10.append(", firstTimeToken=");
        q10.append(this.firstTimeToken);
        q10.append(", loginKey=");
        q10.append(this.loginKey);
        q10.append(", message=");
        q10.append(this.message);
        q10.append(", needForceLogout=");
        q10.append(this.needForceLogout);
        q10.append(", passwordExpiredTime=");
        q10.append(this.passwordExpiredTime);
        q10.append(", requiredChangePassword=");
        q10.append(this.requiredChangePassword);
        q10.append(", retryCount=");
        q10.append(this.retryCount);
        q10.append(", success=");
        q10.append(this.success);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", username=");
        return l.k(q10, this.username, ')');
    }
}
