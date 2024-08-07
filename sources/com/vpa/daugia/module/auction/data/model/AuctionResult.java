package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: AuctionResult.kt */
public final class AuctionResult implements Serializable {
    @b("endTime")
    private Long endTime;
    @b("licensePlate")
    private String licensePlate;
    @b("maxPrice")
    private Long maxPrice;
    @b("minPrice")
    private Long minPrice;
    @b("sessionId")
    private Long sessionId;
    @b("startTime")
    private Long startTime;
    @b("totalFailedPlate")
    private Long totalFailedPlate;
    @b("totalPlate")
    private Long totalPlate;
    @b("totalSuccessPlate")
    private Long totalSuccessPlate;

    public AuctionResult() {
        this((Long) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, 511, (e) null);
    }

    public AuctionResult(Long l10, String str, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17) {
        this.endTime = l10;
        this.licensePlate = str;
        this.maxPrice = l11;
        this.minPrice = l12;
        this.sessionId = l13;
        this.startTime = l14;
        this.totalFailedPlate = l15;
        this.totalPlate = l16;
        this.totalSuccessPlate = l17;
    }

    public static /* synthetic */ AuctionResult copy$default(AuctionResult auctionResult, Long l10, String str, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, int i10, Object obj) {
        AuctionResult auctionResult2 = auctionResult;
        int i11 = i10;
        return auctionResult.copy((i11 & 1) != 0 ? auctionResult2.endTime : l10, (i11 & 2) != 0 ? auctionResult2.licensePlate : str, (i11 & 4) != 0 ? auctionResult2.maxPrice : l11, (i11 & 8) != 0 ? auctionResult2.minPrice : l12, (i11 & 16) != 0 ? auctionResult2.sessionId : l13, (i11 & 32) != 0 ? auctionResult2.startTime : l14, (i11 & 64) != 0 ? auctionResult2.totalFailedPlate : l15, (i11 & 128) != 0 ? auctionResult2.totalPlate : l16, (i11 & 256) != 0 ? auctionResult2.totalSuccessPlate : l17);
    }

    public final Long component1() {
        return this.endTime;
    }

    public final String component2() {
        return this.licensePlate;
    }

    public final Long component3() {
        return this.maxPrice;
    }

    public final Long component4() {
        return this.minPrice;
    }

    public final Long component5() {
        return this.sessionId;
    }

    public final Long component6() {
        return this.startTime;
    }

    public final Long component7() {
        return this.totalFailedPlate;
    }

    public final Long component8() {
        return this.totalPlate;
    }

    public final Long component9() {
        return this.totalSuccessPlate;
    }

    public final AuctionResult copy(Long l10, String str, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17) {
        return new AuctionResult(l10, str, l11, l12, l13, l14, l15, l16, l17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionResult)) {
            return false;
        }
        AuctionResult auctionResult = (AuctionResult) obj;
        return j.a(this.endTime, auctionResult.endTime) && j.a(this.licensePlate, auctionResult.licensePlate) && j.a(this.maxPrice, auctionResult.maxPrice) && j.a(this.minPrice, auctionResult.minPrice) && j.a(this.sessionId, auctionResult.sessionId) && j.a(this.startTime, auctionResult.startTime) && j.a(this.totalFailedPlate, auctionResult.totalFailedPlate) && j.a(this.totalPlate, auctionResult.totalPlate) && j.a(this.totalSuccessPlate, auctionResult.totalSuccessPlate);
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final Long getMaxPrice() {
        return this.maxPrice;
    }

    public final Long getMinPrice() {
        return this.minPrice;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Long getTotalFailedPlate() {
        return this.totalFailedPlate;
    }

    public final Long getTotalPlate() {
        return this.totalPlate;
    }

    public final Long getTotalSuccessPlate() {
        return this.totalSuccessPlate;
    }

    public int hashCode() {
        Long l10 = this.endTime;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.licensePlate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.maxPrice;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.minPrice;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.sessionId;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.startTime;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.totalFailedPlate;
        int hashCode7 = (hashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.totalPlate;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.totalSuccessPlate;
        if (l17 != null) {
            i10 = l17.hashCode();
        }
        return hashCode8 + i10;
    }

    public final void setEndTime(Long l10) {
        this.endTime = l10;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setMaxPrice(Long l10) {
        this.maxPrice = l10;
    }

    public final void setMinPrice(Long l10) {
        this.minPrice = l10;
    }

    public final void setSessionId(Long l10) {
        this.sessionId = l10;
    }

    public final void setStartTime(Long l10) {
        this.startTime = l10;
    }

    public final void setTotalFailedPlate(Long l10) {
        this.totalFailedPlate = l10;
    }

    public final void setTotalPlate(Long l10) {
        this.totalPlate = l10;
    }

    public final void setTotalSuccessPlate(Long l10) {
        this.totalSuccessPlate = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionResult(endTime=");
        q10.append(this.endTime);
        q10.append(", licensePlate=");
        q10.append(this.licensePlate);
        q10.append(", maxPrice=");
        q10.append(this.maxPrice);
        q10.append(", minPrice=");
        q10.append(this.minPrice);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", startTime=");
        q10.append(this.startTime);
        q10.append(", totalFailedPlate=");
        q10.append(this.totalFailedPlate);
        q10.append(", totalPlate=");
        q10.append(this.totalPlate);
        q10.append(", totalSuccessPlate=");
        q10.append(this.totalSuccessPlate);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuctionResult(java.lang.Long r11, java.lang.String r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, int r20, sk.e r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.AuctionResult.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, int, sk.e):void");
    }
}
