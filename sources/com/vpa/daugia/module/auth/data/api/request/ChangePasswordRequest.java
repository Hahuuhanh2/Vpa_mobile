package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: ChangePasswordRequest.kt */
public final class ChangePasswordRequest extends h {
    @b("newPassword")
    private String newPassword;
    @b("oldPassword")
    private String oldPassword;

    public ChangePasswordRequest() {
        this((String) null, (String) null, 3, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangePasswordRequest(String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = changePasswordRequest.oldPassword;
        }
        if ((i10 & 2) != 0) {
            str2 = changePasswordRequest.newPassword;
        }
        return changePasswordRequest.copy(str, str2);
    }

    public final String component1() {
        return this.oldPassword;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final ChangePasswordRequest copy(String str, String str2) {
        return new ChangePasswordRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        return j.a(this.oldPassword, changePasswordRequest.oldPassword) && j.a(this.newPassword, changePasswordRequest.newPassword);
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public int hashCode() {
        String str = this.oldPassword;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.newPassword;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setNewPassword(String str) {
        this.newPassword = str;
    }

    public final void setOldPassword(String str) {
        this.oldPassword = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("ChangePasswordRequest(oldPassword=");
        q10.append(this.oldPassword);
        q10.append(", newPassword=");
        return l.k(q10, this.newPassword, ')');
    }

    public ChangePasswordRequest(String str, String str2) {
        this.oldPassword = str;
        this.newPassword = str2;
    }
}
