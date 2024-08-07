package com.vpa.daugia.module.history.data.api.request;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: AuctionHistoryRequest.kt */
public final class AuctionHistoryRequest {
    @b("fromDate")
    private Long fromDate;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19652id;
    @b("licenseId")
    private Long licenseId;
    @b("licensePlate")
    private String licensePlate;
    @b("limit")
    private Integer limit;
    @b("page")
    private Integer page;
    @b("plateFilter")
    private String plateFilter;
    @b("toDate")
    private Long toDate;

    public AuctionHistoryRequest() {
        this((Long) null, (Integer) null, (Integer) null, (String) null, (String) null, (Long) null, (String) null, (Long) null, 255, (e) null);
    }

    public AuctionHistoryRequest(Long l10, Integer num, Integer num2, String str, String str2, Long l11, String str3, Long l12) {
        this.fromDate = l10;
        this.limit = num;
        this.page = num2;
        this.licensePlate = str;
        this.plateFilter = str2;
        this.toDate = l11;
        this.f19652id = str3;
        this.licenseId = l12;
    }

    public static /* synthetic */ AuctionHistoryRequest copy$default(AuctionHistoryRequest auctionHistoryRequest, Long l10, Integer num, Integer num2, String str, String str2, Long l11, String str3, Long l12, int i10, Object obj) {
        AuctionHistoryRequest auctionHistoryRequest2 = auctionHistoryRequest;
        int i11 = i10;
        return auctionHistoryRequest.copy((i11 & 1) != 0 ? auctionHistoryRequest2.fromDate : l10, (i11 & 2) != 0 ? auctionHistoryRequest2.limit : num, (i11 & 4) != 0 ? auctionHistoryRequest2.page : num2, (i11 & 8) != 0 ? auctionHistoryRequest2.licensePlate : str, (i11 & 16) != 0 ? auctionHistoryRequest2.plateFilter : str2, (i11 & 32) != 0 ? auctionHistoryRequest2.toDate : l11, (i11 & 64) != 0 ? auctionHistoryRequest2.f19652id : str3, (i11 & 128) != 0 ? auctionHistoryRequest2.licenseId : l12);
    }

    public final Long component1() {
        return this.fromDate;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final Integer component3() {
        return this.page;
    }

    public final String component4() {
        return this.licensePlate;
    }

    public final String component5() {
        return this.plateFilter;
    }

    public final Long component6() {
        return this.toDate;
    }

    public final String component7() {
        return this.f19652id;
    }

    public final Long component8() {
        return this.licenseId;
    }

    public final AuctionHistoryRequest copy(Long l10, Integer num, Integer num2, String str, String str2, Long l11, String str3, Long l12) {
        return new AuctionHistoryRequest(l10, num, num2, str, str2, l11, str3, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionHistoryRequest)) {
            return false;
        }
        AuctionHistoryRequest auctionHistoryRequest = (AuctionHistoryRequest) obj;
        return j.a(this.fromDate, auctionHistoryRequest.fromDate) && j.a(this.limit, auctionHistoryRequest.limit) && j.a(this.page, auctionHistoryRequest.page) && j.a(this.licensePlate, auctionHistoryRequest.licensePlate) && j.a(this.plateFilter, auctionHistoryRequest.plateFilter) && j.a(this.toDate, auctionHistoryRequest.toDate) && j.a(this.f19652id, auctionHistoryRequest.f19652id) && j.a(this.licenseId, auctionHistoryRequest.licenseId);
    }

    public final Long getFromDate() {
        return this.fromDate;
    }

    public final String getId() {
        return this.f19652id;
    }

    public final Long getLicenseId() {
        return this.licenseId;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final String getPlateFilter() {
        return this.plateFilter;
    }

    public final Long getToDate() {
        return this.toDate;
    }

    public int hashCode() {
        Long l10 = this.fromDate;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.page;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.licensePlate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.plateFilter;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.toDate;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.f19652id;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.licenseId;
        if (l12 != null) {
            i10 = l12.hashCode();
        }
        return hashCode7 + i10;
    }

    public final void setFromDate(Long l10) {
        this.fromDate = l10;
    }

    public final void setId(String str) {
        this.f19652id = str;
    }

    public final void setLicenseId(Long l10) {
        this.licenseId = l10;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setPage(Integer num) {
        this.page = num;
    }

    public final void setPlateFilter(String str) {
        this.plateFilter = str;
    }

    public final void setToDate(Long l10) {
        this.toDate = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionHistoryRequest(fromDate=");
        q10.append(this.fromDate);
        q10.append(", limit=");
        q10.append(this.limit);
        q10.append(", page=");
        q10.append(this.page);
        q10.append(", licensePlate=");
        q10.append(this.licensePlate);
        q10.append(", plateFilter=");
        q10.append(this.plateFilter);
        q10.append(", toDate=");
        q10.append(this.toDate);
        q10.append(", id=");
        q10.append(this.f19652id);
        q10.append(", licenseId=");
        q10.append(this.licenseId);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuctionHistoryRequest(java.lang.Long r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.Long r15, java.lang.String r16, java.lang.Long r17, int r18, sk.e r19) {
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
            if (r3 == 0) goto L_0x0015
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            r4 = r2
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0023
            r5 = r2
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002b
        L_0x002a:
            r6 = r14
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0032
        L_0x0031:
            r7 = r15
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r16
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = r17
        L_0x0041:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.history.data.api.request.AuctionHistoryRequest.<init>(java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, int, sk.e):void");
    }
}
