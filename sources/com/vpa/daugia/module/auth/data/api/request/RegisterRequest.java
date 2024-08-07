package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: RegisterRequest.kt */
public final class RegisterRequest extends h {
    @b("citizenIdentify")
    private String citizenIdentify;
    @b("email")
    private String email;
    @b("fcmToken")
    private String fcmToken;
    @b("fullname")
    private String fullname;
    @b("password")
    private String password;
    @b("phone")
    private String phone;
    @b("phoneVerificationCode")
    private String phoneVerificationCode;
    @b("rePass")
    private String rePass;

    public RegisterRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (e) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterRequest(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, sk.e r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0013
        L_0x0012:
            r3 = r11
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = r4
            goto L_0x001a
        L_0x0019:
            r5 = r12
        L_0x001a:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r13
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r4
            goto L_0x0027
        L_0x0026:
            r6 = r14
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r4
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r4
            goto L_0x0036
        L_0x0034:
            r8 = r16
        L_0x0036:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = r17
        L_0x003d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r5
            r14 = r2
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.RegisterRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }

    public static /* synthetic */ RegisterRequest copy$default(RegisterRequest registerRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        RegisterRequest registerRequest2 = registerRequest;
        int i11 = i10;
        return registerRequest.copy((i11 & 1) != 0 ? registerRequest2.citizenIdentify : str, (i11 & 2) != 0 ? registerRequest2.fullname : str2, (i11 & 4) != 0 ? registerRequest2.phone : str3, (i11 & 8) != 0 ? registerRequest2.email : str4, (i11 & 16) != 0 ? registerRequest2.phoneVerificationCode : str5, (i11 & 32) != 0 ? registerRequest2.password : str6, (i11 & 64) != 0 ? registerRequest2.rePass : str7, (i11 & 128) != 0 ? registerRequest2.fcmToken : str8);
    }

    public final String component1() {
        return this.citizenIdentify;
    }

    public final String component2() {
        return this.fullname;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneVerificationCode;
    }

    public final String component6() {
        return this.password;
    }

    public final String component7() {
        return this.rePass;
    }

    public final String component8() {
        return this.fcmToken;
    }

    public final RegisterRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new RegisterRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        return j.a(this.citizenIdentify, registerRequest.citizenIdentify) && j.a(this.fullname, registerRequest.fullname) && j.a(this.phone, registerRequest.phone) && j.a(this.email, registerRequest.email) && j.a(this.phoneVerificationCode, registerRequest.phoneVerificationCode) && j.a(this.password, registerRequest.password) && j.a(this.rePass, registerRequest.rePass) && j.a(this.fcmToken, registerRequest.fcmToken);
    }

    public final String getCitizenIdentify() {
        return this.citizenIdentify;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneVerificationCode() {
        return this.phoneVerificationCode;
    }

    public final String getRePass() {
        return this.rePass;
    }

    public int hashCode() {
        String str = this.citizenIdentify;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneVerificationCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.password;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rePass;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fcmToken;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return hashCode7 + i10;
    }

    public final void setCitizenIdentify(String str) {
        this.citizenIdentify = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFcmToken(String str) {
        this.fcmToken = str;
    }

    public final void setFullname(String str) {
        this.fullname = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneVerificationCode(String str) {
        this.phoneVerificationCode = str;
    }

    public final void setRePass(String str) {
        this.rePass = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("RegisterRequest(citizenIdentify=");
        q10.append(this.citizenIdentify);
        q10.append(", fullname=");
        q10.append(this.fullname);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", email=");
        q10.append(this.email);
        q10.append(", phoneVerificationCode=");
        q10.append(this.phoneVerificationCode);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", rePass=");
        q10.append(this.rePass);
        q10.append(", fcmToken=");
        return l.k(q10, this.fcmToken, ')');
    }

    public RegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.citizenIdentify = str;
        this.fullname = str2;
        this.phone = str3;
        this.email = str4;
        this.phoneVerificationCode = str5;
        this.password = str6;
        this.rePass = str7;
        this.fcmToken = str8;
    }
}
