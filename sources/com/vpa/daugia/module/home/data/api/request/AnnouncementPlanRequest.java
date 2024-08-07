package com.vpa.daugia.module.home.data.api.request;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: AnnouncementPlanRequest.kt */
public final class AnnouncementPlanRequest {
    @b("license_plate")
    private String licensePlate;
    @b("limit")
    private Integer limit;
    @b("offset")
    private Integer offset;
    @b("province")
    private String province;
    @b("vehicle")
    private Integer vehicle;

    public AnnouncementPlanRequest() {
        this((String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 31, (e) null);
    }

    public AnnouncementPlanRequest(String str, Integer num, Integer num2, String str2, Integer num3) {
        this.licensePlate = str;
        this.limit = num;
        this.offset = num2;
        this.province = str2;
        this.vehicle = num3;
    }

    public static /* synthetic */ AnnouncementPlanRequest copy$default(AnnouncementPlanRequest announcementPlanRequest, String str, Integer num, Integer num2, String str2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = announcementPlanRequest.licensePlate;
        }
        if ((i10 & 2) != 0) {
            num = announcementPlanRequest.limit;
        }
        Integer num4 = num;
        if ((i10 & 4) != 0) {
            num2 = announcementPlanRequest.offset;
        }
        Integer num5 = num2;
        if ((i10 & 8) != 0) {
            str2 = announcementPlanRequest.province;
        }
        String str3 = str2;
        if ((i10 & 16) != 0) {
            num3 = announcementPlanRequest.vehicle;
        }
        return announcementPlanRequest.copy(str, num4, num5, str3, num3);
    }

    public final String component1() {
        return this.licensePlate;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final Integer component3() {
        return this.offset;
    }

    public final String component4() {
        return this.province;
    }

    public final Integer component5() {
        return this.vehicle;
    }

    public final AnnouncementPlanRequest copy(String str, Integer num, Integer num2, String str2, Integer num3) {
        return new AnnouncementPlanRequest(str, num, num2, str2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnouncementPlanRequest)) {
            return false;
        }
        AnnouncementPlanRequest announcementPlanRequest = (AnnouncementPlanRequest) obj;
        return j.a(this.licensePlate, announcementPlanRequest.licensePlate) && j.a(this.limit, announcementPlanRequest.limit) && j.a(this.offset, announcementPlanRequest.offset) && j.a(this.province, announcementPlanRequest.province) && j.a(this.vehicle, announcementPlanRequest.vehicle);
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getProvince() {
        return this.province;
    }

    public final Integer getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        String str = this.licensePlate;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offset;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.province;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.vehicle;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final void setVehicle(Integer num) {
        this.vehicle = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("AnnouncementPlanRequest(licensePlate=");
        q10.append(this.licensePlate);
        q10.append(", limit=");
        q10.append(this.limit);
        q10.append(", offset=");
        q10.append(this.offset);
        q10.append(", province=");
        q10.append(this.province);
        q10.append(", vehicle=");
        q10.append(this.vehicle);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnouncementPlanRequest(java.lang.String r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.String r8, java.lang.Integer r9, int r10, sk.e r11) {
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
            if (r5 == 0) goto L_0x0012
            r5 = 25
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
        L_0x0012:
            r1 = r6
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r7
        L_0x001a:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r8
        L_0x0021:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0027
            r10 = r0
            goto L_0x0028
        L_0x0027:
            r10 = r9
        L_0x0028:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.home.data.api.request.AnnouncementPlanRequest.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, int, sk.e):void");
    }
}
