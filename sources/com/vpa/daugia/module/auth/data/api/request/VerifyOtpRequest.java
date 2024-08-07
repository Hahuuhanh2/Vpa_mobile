package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: VerifyOtpRequest.kt */
public final class VerifyOtpRequest extends h {
    @b("citizenIdentify")
    private String citizenIdentify;
    @b("fcmToken")
    private String fcmToken;
    @b("otp")
    private String otp;
    @b("phoneNumber")
    private String phoneNumber;

    public VerifyOtpRequest() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyOtpRequest(String str, String str2, String str3, String str4, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ VerifyOtpRequest copy$default(VerifyOtpRequest verifyOtpRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = verifyOtpRequest.citizenIdentify;
        }
        if ((i10 & 2) != 0) {
            str2 = verifyOtpRequest.phoneNumber;
        }
        if ((i10 & 4) != 0) {
            str3 = verifyOtpRequest.otp;
        }
        if ((i10 & 8) != 0) {
            str4 = verifyOtpRequest.fcmToken;
        }
        return verifyOtpRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.citizenIdentify;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final String component3() {
        return this.otp;
    }

    public final String component4() {
        return this.fcmToken;
    }

    public final VerifyOtpRequest copy(String str, String str2, String str3, String str4) {
        j.f(str4, "fcmToken");
        return new VerifyOtpRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyOtpRequest)) {
            return false;
        }
        VerifyOtpRequest verifyOtpRequest = (VerifyOtpRequest) obj;
        return j.a(this.citizenIdentify, verifyOtpRequest.citizenIdentify) && j.a(this.phoneNumber, verifyOtpRequest.phoneNumber) && j.a(this.otp, verifyOtpRequest.otp) && j.a(this.fcmToken, verifyOtpRequest.fcmToken);
    }

    public final String getCitizenIdentify() {
        return this.citizenIdentify;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.citizenIdentify;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.otp;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.fcmToken.hashCode() + ((hashCode2 + i10) * 31);
    }

    public final void setCitizenIdentify(String str) {
        this.citizenIdentify = str;
    }

    public final void setFcmToken(String str) {
        j.f(str, "<set-?>");
        this.fcmToken = str;
    }

    public final void setOtp(String str) {
        this.otp = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("VerifyOtpRequest(citizenIdentify=");
        q10.append(this.citizenIdentify);
        q10.append(", phoneNumber=");
        q10.append(this.phoneNumber);
        q10.append(", otp=");
        q10.append(this.otp);
        q10.append(", fcmToken=");
        return l.k(q10, this.fcmToken, ')');
    }

    public VerifyOtpRequest(String str, String str2, String str3, String str4) {
        j.f(str4, "fcmToken");
        this.citizenIdentify = str;
        this.phoneNumber = str2;
        this.otp = str3;
        this.fcmToken = str4;
    }
}
