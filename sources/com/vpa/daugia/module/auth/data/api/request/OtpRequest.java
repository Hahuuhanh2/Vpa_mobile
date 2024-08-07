package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: OtpRequest.kt */
public final class OtpRequest extends h {
    @b("citizenIdentify")
    private String citizenIdentifyCard;
    @b("phoneNumber")
    private String phoneNumber;

    public OtpRequest() {
        this((String) null, (String) null, 3, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpRequest(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ OtpRequest copy$default(OtpRequest otpRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = otpRequest.citizenIdentifyCard;
        }
        if ((i10 & 2) != 0) {
            str2 = otpRequest.phoneNumber;
        }
        return otpRequest.copy(str, str2);
    }

    public final String component1() {
        return this.citizenIdentifyCard;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final OtpRequest copy(String str, String str2) {
        j.f(str2, "phoneNumber");
        return new OtpRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpRequest)) {
            return false;
        }
        OtpRequest otpRequest = (OtpRequest) obj;
        return j.a(this.citizenIdentifyCard, otpRequest.citizenIdentifyCard) && j.a(this.phoneNumber, otpRequest.phoneNumber);
    }

    public final String getCitizenIdentifyCard() {
        return this.citizenIdentifyCard;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.citizenIdentifyCard;
        return this.phoneNumber.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setCitizenIdentifyCard(String str) {
        this.citizenIdentifyCard = str;
    }

    public final void setPhoneNumber(String str) {
        j.f(str, "<set-?>");
        this.phoneNumber = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("OtpRequest(citizenIdentifyCard=");
        q10.append(this.citizenIdentifyCard);
        q10.append(", phoneNumber=");
        return l.k(q10, this.phoneNumber, ')');
    }

    public OtpRequest(String str, String str2) {
        j.f(str2, "phoneNumber");
        this.citizenIdentifyCard = str;
        this.phoneNumber = str2;
    }
}
