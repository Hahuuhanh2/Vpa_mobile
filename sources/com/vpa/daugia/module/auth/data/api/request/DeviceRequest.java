package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: DeviceRequest.kt */
public final class DeviceRequest {
    @b("deviceId")
    private String deviceId;
    @b("deviceInfo")
    private String deviceInfo;
    @b("deviceName")
    private String deviceName;
    @b("deviceType")
    private String deviceType;
    @b("fcmToken")
    private String fcmToken;

    public DeviceRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (e) null);
    }

    public DeviceRequest(String str, String str2, String str3, String str4, String str5) {
        this.deviceId = str;
        this.deviceInfo = str2;
        this.deviceName = str3;
        this.deviceType = str4;
        this.fcmToken = str5;
    }

    public static /* synthetic */ DeviceRequest copy$default(DeviceRequest deviceRequest, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceRequest.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceRequest.deviceInfo;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = deviceRequest.deviceName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = deviceRequest.deviceType;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = deviceRequest.fcmToken;
        }
        return deviceRequest.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceInfo;
    }

    public final String component3() {
        return this.deviceName;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final String component5() {
        return this.fcmToken;
    }

    public final DeviceRequest copy(String str, String str2, String str3, String str4, String str5) {
        return new DeviceRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRequest)) {
            return false;
        }
        DeviceRequest deviceRequest = (DeviceRequest) obj;
        return j.a(this.deviceId, deviceRequest.deviceId) && j.a(this.deviceInfo, deviceRequest.deviceInfo) && j.a(this.deviceName, deviceRequest.deviceName) && j.a(this.deviceType, deviceRequest.deviceType) && j.a(this.fcmToken, deviceRequest.fcmToken);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getFcmToken() {
        return this.fcmToken;
    }

    public int hashCode() {
        String str = this.deviceId;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceInfo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fcmToken;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceInfo(String str) {
        this.deviceInfo = str;
    }

    public final void setDeviceName(String str) {
        this.deviceName = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setFcmToken(String str) {
        this.fcmToken = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("DeviceRequest(deviceId=");
        q10.append(this.deviceId);
        q10.append(", deviceInfo=");
        q10.append(this.deviceInfo);
        q10.append(", deviceName=");
        q10.append(this.deviceName);
        q10.append(", deviceType=");
        q10.append(this.deviceType);
        q10.append(", fcmToken=");
        return l.k(q10, this.fcmToken, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DeviceRequest(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, sk.e r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.DeviceRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
