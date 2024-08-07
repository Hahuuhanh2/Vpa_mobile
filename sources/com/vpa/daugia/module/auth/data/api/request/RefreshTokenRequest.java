package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import ef.h;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: RefreshTokenRequest.kt */
public final class RefreshTokenRequest extends h {
    @b("deviceId")
    private String deviceId;
    @b("refreshToken")
    private String refreshToken;

    public RefreshTokenRequest() {
        this((String) null, (String) null, 3, (e) null);
    }

    public RefreshTokenRequest(String str, String str2) {
        this.refreshToken = str;
        this.deviceId = str2;
    }

    public static /* synthetic */ RefreshTokenRequest copy$default(RefreshTokenRequest refreshTokenRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = refreshTokenRequest.refreshToken;
        }
        if ((i10 & 2) != 0) {
            str2 = refreshTokenRequest.deviceId;
        }
        return refreshTokenRequest.copy(str, str2);
    }

    public final String component1() {
        return this.refreshToken;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final RefreshTokenRequest copy(String str, String str2) {
        return new RefreshTokenRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshTokenRequest)) {
            return false;
        }
        RefreshTokenRequest refreshTokenRequest = (RefreshTokenRequest) obj;
        return j.a(this.refreshToken, refreshTokenRequest.refreshToken) && j.a(this.deviceId, refreshTokenRequest.deviceId);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.refreshToken;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("RefreshTokenRequest(refreshToken=");
        q10.append(this.refreshToken);
        q10.append(", deviceId=");
        return l.k(q10, this.deviceId, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RefreshTokenRequest(java.lang.String r1, java.lang.String r2, int r3, sk.e r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0005
            r1 = 0
        L_0x0005:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0016
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            sk.j.e(r2, r3)
        L_0x0016:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.RefreshTokenRequest.<init>(java.lang.String, java.lang.String, int, sk.e):void");
    }
}
