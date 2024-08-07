package com.vpa.daugia.module.history.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: AuctionHistory.kt */
public final class AuctionHistory implements Serializable {
    @b("auctionDate")
    private Long auctionDate;
    @b("auctionRound")
    private Long auctionRound;
    @b("detailPublishPlanId")
    private String detailPublishPlanId;
    @b("endDate")
    private Long endDate;
    @b("maxPrice")
    private Long maxPrice;
    @b("receiveCount")
    private Object receiveCount;
    @b("registrationSeri")
    private String registrationSeri;
    @b("sequenceNumber")
    private String sequenceNumber;
    @b("status")
    private Integer status;
    @b("userId")
    private Long userId;
    @b("vehicleSymbol")
    private String vehicleSymbol;
    @b("waitingConfirm")
    private Long waitingConfirm;
    @b("winnerId")
    private Long winnerId;
    @b("winningPrice")
    private Long winningPrice;

    public AuctionHistory() {
        this((Long) null, (Long) null, (String) null, (Long) null, (Long) null, (Object) null, (String) null, (String) null, (Integer) null, (Long) null, (String) null, (Long) null, (Long) null, (Long) null, 16383, (e) null);
    }

    public AuctionHistory(Long l10, Long l11, String str, Long l12, Long l13, Object obj, String str2, String str3, Integer num, Long l14, String str4, Long l15, Long l16, Long l17) {
        this.auctionDate = l10;
        this.auctionRound = l11;
        this.detailPublishPlanId = str;
        this.endDate = l12;
        this.maxPrice = l13;
        this.receiveCount = obj;
        this.registrationSeri = str2;
        this.sequenceNumber = str3;
        this.status = num;
        this.userId = l14;
        this.vehicleSymbol = str4;
        this.waitingConfirm = l15;
        this.winnerId = l16;
        this.winningPrice = l17;
    }

    public static /* synthetic */ AuctionHistory copy$default(AuctionHistory auctionHistory, Long l10, Long l11, String str, Long l12, Long l13, Object obj, String str2, String str3, Integer num, Long l14, String str4, Long l15, Long l16, Long l17, int i10, Object obj2) {
        AuctionHistory auctionHistory2 = auctionHistory;
        int i11 = i10;
        return auctionHistory.copy((i11 & 1) != 0 ? auctionHistory2.auctionDate : l10, (i11 & 2) != 0 ? auctionHistory2.auctionRound : l11, (i11 & 4) != 0 ? auctionHistory2.detailPublishPlanId : str, (i11 & 8) != 0 ? auctionHistory2.endDate : l12, (i11 & 16) != 0 ? auctionHistory2.maxPrice : l13, (i11 & 32) != 0 ? auctionHistory2.receiveCount : obj, (i11 & 64) != 0 ? auctionHistory2.registrationSeri : str2, (i11 & 128) != 0 ? auctionHistory2.sequenceNumber : str3, (i11 & 256) != 0 ? auctionHistory2.status : num, (i11 & 512) != 0 ? auctionHistory2.userId : l14, (i11 & 1024) != 0 ? auctionHistory2.vehicleSymbol : str4, (i11 & 2048) != 0 ? auctionHistory2.waitingConfirm : l15, (i11 & 4096) != 0 ? auctionHistory2.winnerId : l16, (i11 & 8192) != 0 ? auctionHistory2.winningPrice : l17);
    }

    public final Long component1() {
        return this.auctionDate;
    }

    public final Long component10() {
        return this.userId;
    }

    public final String component11() {
        return this.vehicleSymbol;
    }

    public final Long component12() {
        return this.waitingConfirm;
    }

    public final Long component13() {
        return this.winnerId;
    }

    public final Long component14() {
        return this.winningPrice;
    }

    public final Long component2() {
        return this.auctionRound;
    }

    public final String component3() {
        return this.detailPublishPlanId;
    }

    public final Long component4() {
        return this.endDate;
    }

    public final Long component5() {
        return this.maxPrice;
    }

    public final Object component6() {
        return this.receiveCount;
    }

    public final String component7() {
        return this.registrationSeri;
    }

    public final String component8() {
        return this.sequenceNumber;
    }

    public final Integer component9() {
        return this.status;
    }

    public final AuctionHistory copy(Long l10, Long l11, String str, Long l12, Long l13, Object obj, String str2, String str3, Integer num, Long l14, String str4, Long l15, Long l16, Long l17) {
        return new AuctionHistory(l10, l11, str, l12, l13, obj, str2, str3, num, l14, str4, l15, l16, l17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionHistory)) {
            return false;
        }
        AuctionHistory auctionHistory = (AuctionHistory) obj;
        return j.a(this.auctionDate, auctionHistory.auctionDate) && j.a(this.auctionRound, auctionHistory.auctionRound) && j.a(this.detailPublishPlanId, auctionHistory.detailPublishPlanId) && j.a(this.endDate, auctionHistory.endDate) && j.a(this.maxPrice, auctionHistory.maxPrice) && j.a(this.receiveCount, auctionHistory.receiveCount) && j.a(this.registrationSeri, auctionHistory.registrationSeri) && j.a(this.sequenceNumber, auctionHistory.sequenceNumber) && j.a(this.status, auctionHistory.status) && j.a(this.userId, auctionHistory.userId) && j.a(this.vehicleSymbol, auctionHistory.vehicleSymbol) && j.a(this.waitingConfirm, auctionHistory.waitingConfirm) && j.a(this.winnerId, auctionHistory.winnerId) && j.a(this.winningPrice, auctionHistory.winningPrice);
    }

    public final Long getAuctionDate() {
        return this.auctionDate;
    }

    public final Long getAuctionRound() {
        return this.auctionRound;
    }

    public final String getDetailPublishPlanId() {
        return this.detailPublishPlanId;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Long getMaxPrice() {
        return this.maxPrice;
    }

    public final Object getReceiveCount() {
        return this.receiveCount;
    }

    public final String getRegistrationSeri() {
        return this.registrationSeri;
    }

    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getVehicleSymbol() {
        return this.vehicleSymbol;
    }

    public final Long getWaitingConfirm() {
        return this.waitingConfirm;
    }

    public final Long getWinnerId() {
        return this.winnerId;
    }

    public final Long getWinningPrice() {
        return this.winningPrice;
    }

    public int hashCode() {
        Long l10 = this.auctionDate;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.auctionRound;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.detailPublishPlanId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.endDate;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.maxPrice;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Object obj = this.receiveCount;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.registrationSeri;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sequenceNumber;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l14 = this.userId;
        int hashCode10 = (hashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.vehicleSymbol;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.waitingConfirm;
        int hashCode12 = (hashCode11 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.winnerId;
        int hashCode13 = (hashCode12 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.winningPrice;
        if (l17 != null) {
            i10 = l17.hashCode();
        }
        return hashCode13 + i10;
    }

    public final void setAuctionDate(Long l10) {
        this.auctionDate = l10;
    }

    public final void setAuctionRound(Long l10) {
        this.auctionRound = l10;
    }

    public final void setDetailPublishPlanId(String str) {
        this.detailPublishPlanId = str;
    }

    public final void setEndDate(Long l10) {
        this.endDate = l10;
    }

    public final void setMaxPrice(Long l10) {
        this.maxPrice = l10;
    }

    public final void setReceiveCount(Object obj) {
        this.receiveCount = obj;
    }

    public final void setRegistrationSeri(String str) {
        this.registrationSeri = str;
    }

    public final void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setUserId(Long l10) {
        this.userId = l10;
    }

    public final void setVehicleSymbol(String str) {
        this.vehicleSymbol = str;
    }

    public final void setWaitingConfirm(Long l10) {
        this.waitingConfirm = l10;
    }

    public final void setWinnerId(Long l10) {
        this.winnerId = l10;
    }

    public final void setWinningPrice(Long l10) {
        this.winningPrice = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionHistory(auctionDate=");
        q10.append(this.auctionDate);
        q10.append(", auctionRound=");
        q10.append(this.auctionRound);
        q10.append(", detailPublishPlanId=");
        q10.append(this.detailPublishPlanId);
        q10.append(", endDate=");
        q10.append(this.endDate);
        q10.append(", maxPrice=");
        q10.append(this.maxPrice);
        q10.append(", receiveCount=");
        q10.append(this.receiveCount);
        q10.append(", registrationSeri=");
        q10.append(this.registrationSeri);
        q10.append(", sequenceNumber=");
        q10.append(this.sequenceNumber);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", vehicleSymbol=");
        q10.append(this.vehicleSymbol);
        q10.append(", waitingConfirm=");
        q10.append(this.waitingConfirm);
        q10.append(", winnerId=");
        q10.append(this.winnerId);
        q10.append(", winningPrice=");
        q10.append(this.winningPrice);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuctionHistory(java.lang.Long r16, java.lang.Long r17, java.lang.String r18, java.lang.Long r19, java.lang.Long r20, java.lang.Object r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.Long r25, java.lang.String r26, java.lang.Long r27, java.lang.Long r28, java.lang.Long r29, int r30, sk.e r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r19
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r20
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r21
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r22
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r23
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r24
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r25
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r26
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r27
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r28
        L_0x006b:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r2 = r29
        L_0x0072:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.history.data.model.AuctionHistory.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Object, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, int, sk.e):void");
    }
}
