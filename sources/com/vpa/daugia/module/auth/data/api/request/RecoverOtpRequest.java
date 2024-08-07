package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: RecoverOtpRequest.kt */
public final class RecoverOtpRequest {
    @b("mail")
    private String mail;
    @b("newPassword")
    private String newPassword;
    @b("phone")
    private String phone;
    @b("recoverPasswordCode")
    private String recoverPasswordCode;

    public RecoverOtpRequest() {
        this((String) null, (String) null, (String) null, (String) null, 15, (e) null);
    }

    public RecoverOtpRequest(String str, String str2, String str3, String str4) {
        this.newPassword = str;
        this.phone = str2;
        this.recoverPasswordCode = str3;
        this.mail = str4;
    }

    public static /* synthetic */ RecoverOtpRequest copy$default(RecoverOtpRequest recoverOtpRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recoverOtpRequest.newPassword;
        }
        if ((i10 & 2) != 0) {
            str2 = recoverOtpRequest.phone;
        }
        if ((i10 & 4) != 0) {
            str3 = recoverOtpRequest.recoverPasswordCode;
        }
        if ((i10 & 8) != 0) {
            str4 = recoverOtpRequest.mail;
        }
        return recoverOtpRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.newPassword;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.recoverPasswordCode;
    }

    public final String component4() {
        return this.mail;
    }

    public final RecoverOtpRequest copy(String str, String str2, String str3, String str4) {
        return new RecoverOtpRequest(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoverOtpRequest)) {
            return false;
        }
        RecoverOtpRequest recoverOtpRequest = (RecoverOtpRequest) obj;
        return j.a(this.newPassword, recoverOtpRequest.newPassword) && j.a(this.phone, recoverOtpRequest.phone) && j.a(this.recoverPasswordCode, recoverOtpRequest.recoverPasswordCode) && j.a(this.mail, recoverOtpRequest.mail);
    }

    public final String getMail() {
        return this.mail;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRecoverPasswordCode() {
        return this.recoverPasswordCode;
    }

    public int hashCode() {
        String str = this.newPassword;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recoverPasswordCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mail;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setMail(String str) {
        this.mail = str;
    }

    public final void setNewPassword(String str) {
        this.newPassword = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setRecoverPasswordCode(String str) {
        this.recoverPasswordCode = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("RecoverOtpRequest(newPassword=");
        q10.append(this.newPassword);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", recoverPasswordCode=");
        q10.append(this.recoverPasswordCode);
        q10.append(", mail=");
        return l.k(q10, this.mail, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecoverOtpRequest(String str, String str2, String str3, String str4, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
