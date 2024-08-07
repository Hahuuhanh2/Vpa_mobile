package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: DetailAuctionResult.kt */
public final class DetailAuctionResult implements Serializable {
    @b("auctionPrice")
    private Long auctionPrice;
    @b("auctionSessionId")
    private Long auctionSessionId;
    @b("cityCode")
    private String cityCode;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Long f19375id;
    @b("licensePlate")
    private String licensePlate;
    @b("localSymbol")
    private String localSymbol;
    @b("receiveCount")
    private Object receiveCount;
    @b("registerSeri")
    private String registerSeri;
    @b("sequenceNumber")
    private String sequenceNumber;
    @b("vehicleTypeId")
    private Long vehicleTypeId;
    @b("waitingConfirm")
    private Object waitingConfirm;

    public DetailAuctionResult() {
        this((Long) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (Long) null, (Object) null, 2047, (e) null);
    }

    public DetailAuctionResult(Long l10, Long l11, String str, Long l12, String str2, String str3, Object obj, String str4, String str5, Long l13, Object obj2) {
        this.auctionPrice = l10;
        this.auctionSessionId = l11;
        this.cityCode = str;
        this.f19375id = l12;
        this.licensePlate = str2;
        this.localSymbol = str3;
        this.receiveCount = obj;
        this.registerSeri = str4;
        this.sequenceNumber = str5;
        this.vehicleTypeId = l13;
        this.waitingConfirm = obj2;
    }

    public static /* synthetic */ DetailAuctionResult copy$default(DetailAuctionResult detailAuctionResult, Long l10, Long l11, String str, Long l12, String str2, String str3, Object obj, String str4, String str5, Long l13, Object obj2, int i10, Object obj3) {
        DetailAuctionResult detailAuctionResult2 = detailAuctionResult;
        int i11 = i10;
        return detailAuctionResult.copy((i11 & 1) != 0 ? detailAuctionResult2.auctionPrice : l10, (i11 & 2) != 0 ? detailAuctionResult2.auctionSessionId : l11, (i11 & 4) != 0 ? detailAuctionResult2.cityCode : str, (i11 & 8) != 0 ? detailAuctionResult2.f19375id : l12, (i11 & 16) != 0 ? detailAuctionResult2.licensePlate : str2, (i11 & 32) != 0 ? detailAuctionResult2.localSymbol : str3, (i11 & 64) != 0 ? detailAuctionResult2.receiveCount : obj, (i11 & 128) != 0 ? detailAuctionResult2.registerSeri : str4, (i11 & 256) != 0 ? detailAuctionResult2.sequenceNumber : str5, (i11 & 512) != 0 ? detailAuctionResult2.vehicleTypeId : l13, (i11 & 1024) != 0 ? detailAuctionResult2.waitingConfirm : obj2);
    }

    public final Long component1() {
        return this.auctionPrice;
    }

    public final Long component10() {
        return this.vehicleTypeId;
    }

    public final Object component11() {
        return this.waitingConfirm;
    }

    public final Long component2() {
        return this.auctionSessionId;
    }

    public final String component3() {
        return this.cityCode;
    }

    public final Long component4() {
        return this.f19375id;
    }

    public final String component5() {
        return this.licensePlate;
    }

    public final String component6() {
        return this.localSymbol;
    }

    public final Object component7() {
        return this.receiveCount;
    }

    public final String component8() {
        return this.registerSeri;
    }

    public final String component9() {
        return this.sequenceNumber;
    }

    public final DetailAuctionResult copy(Long l10, Long l11, String str, Long l12, String str2, String str3, Object obj, String str4, String str5, Long l13, Object obj2) {
        return new DetailAuctionResult(l10, l11, str, l12, str2, str3, obj, str4, str5, l13, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailAuctionResult)) {
            return false;
        }
        DetailAuctionResult detailAuctionResult = (DetailAuctionResult) obj;
        return j.a(this.auctionPrice, detailAuctionResult.auctionPrice) && j.a(this.auctionSessionId, detailAuctionResult.auctionSessionId) && j.a(this.cityCode, detailAuctionResult.cityCode) && j.a(this.f19375id, detailAuctionResult.f19375id) && j.a(this.licensePlate, detailAuctionResult.licensePlate) && j.a(this.localSymbol, detailAuctionResult.localSymbol) && j.a(this.receiveCount, detailAuctionResult.receiveCount) && j.a(this.registerSeri, detailAuctionResult.registerSeri) && j.a(this.sequenceNumber, detailAuctionResult.sequenceNumber) && j.a(this.vehicleTypeId, detailAuctionResult.vehicleTypeId) && j.a(this.waitingConfirm, detailAuctionResult.waitingConfirm);
    }

    public final Long getAuctionPrice() {
        return this.auctionPrice;
    }

    public final Long getAuctionSessionId() {
        return this.auctionSessionId;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final Long getId() {
        return this.f19375id;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final String getLocalSymbol() {
        return this.localSymbol;
    }

    public final Object getReceiveCount() {
        return this.receiveCount;
    }

    public final String getRegisterSeri() {
        return this.registerSeri;
    }

    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final Long getVehicleTypeId() {
        return this.vehicleTypeId;
    }

    public final Object getWaitingConfirm() {
        return this.waitingConfirm;
    }

    public int hashCode() {
        Long l10 = this.auctionPrice;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.auctionSessionId;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.cityCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.f19375id;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.licensePlate;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localSymbol;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.receiveCount;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.registerSeri;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sequenceNumber;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l13 = this.vehicleTypeId;
        int hashCode10 = (hashCode9 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Object obj2 = this.waitingConfirm;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return hashCode10 + i10;
    }

    public final void setAuctionPrice(Long l10) {
        this.auctionPrice = l10;
    }

    public final void setAuctionSessionId(Long l10) {
        this.auctionSessionId = l10;
    }

    public final void setCityCode(String str) {
        this.cityCode = str;
    }

    public final void setId(Long l10) {
        this.f19375id = l10;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setLocalSymbol(String str) {
        this.localSymbol = str;
    }

    public final void setReceiveCount(Object obj) {
        this.receiveCount = obj;
    }

    public final void setRegisterSeri(String str) {
        this.registerSeri = str;
    }

    public final void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public final void setVehicleTypeId(Long l10) {
        this.vehicleTypeId = l10;
    }

    public final void setWaitingConfirm(Object obj) {
        this.waitingConfirm = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("DetailAuctionResult(auctionPrice=");
        q10.append(this.auctionPrice);
        q10.append(", auctionSessionId=");
        q10.append(this.auctionSessionId);
        q10.append(", cityCode=");
        q10.append(this.cityCode);
        q10.append(", id=");
        q10.append(this.f19375id);
        q10.append(", licensePlate=");
        q10.append(this.licensePlate);
        q10.append(", localSymbol=");
        q10.append(this.localSymbol);
        q10.append(", receiveCount=");
        q10.append(this.receiveCount);
        q10.append(", registerSeri=");
        q10.append(this.registerSeri);
        q10.append(", sequenceNumber=");
        q10.append(this.sequenceNumber);
        q10.append(", vehicleTypeId=");
        q10.append(this.vehicleTypeId);
        q10.append(", waitingConfirm=");
        q10.append(this.waitingConfirm);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DetailAuctionResult(java.lang.Long r13, java.lang.Long r14, java.lang.String r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.Object r23, int r24, sk.e r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.DetailAuctionResult.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Long, java.lang.Object, int, sk.e):void");
    }
}
