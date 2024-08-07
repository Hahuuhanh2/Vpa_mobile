package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: PriceSSE.kt */
public final class PriceSSE {
    @b("auctionCode")
    private String auctionCode;
    @b("biddingRequestTime")
    private Long biddingRequestTime;
    @b("code")
    private String code;
    @b("highLight")
    private Boolean highLight;
    @b("ipAddress")
    private Object ipAddress;
    @b("lanGiaHan")
    private Long lanGiaHan;
    @b("nextId")
    private String nextId;
    @b("numberOfSetPrice")
    private Long numberOfSetPrice;
    @b("payCount")
    private Integer payCount;
    @b("price")
    private Long price;
    @b("roomId")
    private String roomId;
    @b("sessionId")
    private Long sessionId;
    @b("userId")
    private String userId;
    @b("userName")
    private String userName;

    public PriceSSE() {
        this((String) null, (Long) null, (String) null, (Boolean) null, (Object) null, (Long) null, (String) null, (Long) null, (Integer) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, 16383, (e) null);
    }

    public PriceSSE(String str, Long l10, String str2, Boolean bool, Object obj, Long l11, String str3, Long l12, Integer num, Long l13, String str4, Long l14, String str5, String str6) {
        this.auctionCode = str;
        this.biddingRequestTime = l10;
        this.code = str2;
        this.highLight = bool;
        this.ipAddress = obj;
        this.lanGiaHan = l11;
        this.nextId = str3;
        this.numberOfSetPrice = l12;
        this.payCount = num;
        this.price = l13;
        this.roomId = str4;
        this.sessionId = l14;
        this.userId = str5;
        this.userName = str6;
    }

    public static /* synthetic */ PriceSSE copy$default(PriceSSE priceSSE, String str, Long l10, String str2, Boolean bool, Object obj, Long l11, String str3, Long l12, Integer num, Long l13, String str4, Long l14, String str5, String str6, int i10, Object obj2) {
        PriceSSE priceSSE2 = priceSSE;
        int i11 = i10;
        return priceSSE.copy((i11 & 1) != 0 ? priceSSE2.auctionCode : str, (i11 & 2) != 0 ? priceSSE2.biddingRequestTime : l10, (i11 & 4) != 0 ? priceSSE2.code : str2, (i11 & 8) != 0 ? priceSSE2.highLight : bool, (i11 & 16) != 0 ? priceSSE2.ipAddress : obj, (i11 & 32) != 0 ? priceSSE2.lanGiaHan : l11, (i11 & 64) != 0 ? priceSSE2.nextId : str3, (i11 & 128) != 0 ? priceSSE2.numberOfSetPrice : l12, (i11 & 256) != 0 ? priceSSE2.payCount : num, (i11 & 512) != 0 ? priceSSE2.price : l13, (i11 & 1024) != 0 ? priceSSE2.roomId : str4, (i11 & 2048) != 0 ? priceSSE2.sessionId : l14, (i11 & 4096) != 0 ? priceSSE2.userId : str5, (i11 & 8192) != 0 ? priceSSE2.userName : str6);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final Long component10() {
        return this.price;
    }

    public final String component11() {
        return this.roomId;
    }

    public final Long component12() {
        return this.sessionId;
    }

    public final String component13() {
        return this.userId;
    }

    public final String component14() {
        return this.userName;
    }

    public final Long component2() {
        return this.biddingRequestTime;
    }

    public final String component3() {
        return this.code;
    }

    public final Boolean component4() {
        return this.highLight;
    }

    public final Object component5() {
        return this.ipAddress;
    }

    public final Long component6() {
        return this.lanGiaHan;
    }

    public final String component7() {
        return this.nextId;
    }

    public final Long component8() {
        return this.numberOfSetPrice;
    }

    public final Integer component9() {
        return this.payCount;
    }

    public final PriceSSE copy(String str, Long l10, String str2, Boolean bool, Object obj, Long l11, String str3, Long l12, Integer num, Long l13, String str4, Long l14, String str5, String str6) {
        return new PriceSSE(str, l10, str2, bool, obj, l11, str3, l12, num, l13, str4, l14, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceSSE)) {
            return false;
        }
        PriceSSE priceSSE = (PriceSSE) obj;
        return j.a(this.auctionCode, priceSSE.auctionCode) && j.a(this.biddingRequestTime, priceSSE.biddingRequestTime) && j.a(this.code, priceSSE.code) && j.a(this.highLight, priceSSE.highLight) && j.a(this.ipAddress, priceSSE.ipAddress) && j.a(this.lanGiaHan, priceSSE.lanGiaHan) && j.a(this.nextId, priceSSE.nextId) && j.a(this.numberOfSetPrice, priceSSE.numberOfSetPrice) && j.a(this.payCount, priceSSE.payCount) && j.a(this.price, priceSSE.price) && j.a(this.roomId, priceSSE.roomId) && j.a(this.sessionId, priceSSE.sessionId) && j.a(this.userId, priceSSE.userId) && j.a(this.userName, priceSSE.userName);
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final Long getBiddingRequestTime() {
        return this.biddingRequestTime;
    }

    public final String getCode() {
        return this.code;
    }

    public final Boolean getHighLight() {
        return this.highLight;
    }

    public final Object getIpAddress() {
        return this.ipAddress;
    }

    public final Long getLanGiaHan() {
        return this.lanGiaHan;
    }

    public final String getNextId() {
        return this.nextId;
    }

    public final Long getNumberOfSetPrice() {
        return this.numberOfSetPrice;
    }

    public final Integer getPayCount() {
        return this.payCount;
    }

    public final Long getPrice() {
        return this.price;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.auctionCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.biddingRequestTime;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.highLight;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj = this.ipAddress;
        int hashCode5 = (hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l11 = this.lanGiaHan;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.nextId;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.numberOfSetPrice;
        int hashCode8 = (hashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.payCount;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.price;
        int hashCode10 = (hashCode9 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.roomId;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.sessionId;
        int hashCode12 = (hashCode11 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str5 = this.userId;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userName;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode13 + i10;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBiddingRequestTime(Long l10) {
        this.biddingRequestTime = l10;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setHighLight(Boolean bool) {
        this.highLight = bool;
    }

    public final void setIpAddress(Object obj) {
        this.ipAddress = obj;
    }

    public final void setLanGiaHan(Long l10) {
        this.lanGiaHan = l10;
    }

    public final void setNextId(String str) {
        this.nextId = str;
    }

    public final void setNumberOfSetPrice(Long l10) {
        this.numberOfSetPrice = l10;
    }

    public final void setPayCount(Integer num) {
        this.payCount = num;
    }

    public final void setPrice(Long l10) {
        this.price = l10;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setSessionId(Long l10) {
        this.sessionId = l10;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("PriceSSE(auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", biddingRequestTime=");
        q10.append(this.biddingRequestTime);
        q10.append(", code=");
        q10.append(this.code);
        q10.append(", highLight=");
        q10.append(this.highLight);
        q10.append(", ipAddress=");
        q10.append(this.ipAddress);
        q10.append(", lanGiaHan=");
        q10.append(this.lanGiaHan);
        q10.append(", nextId=");
        q10.append(this.nextId);
        q10.append(", numberOfSetPrice=");
        q10.append(this.numberOfSetPrice);
        q10.append(", payCount=");
        q10.append(this.payCount);
        q10.append(", price=");
        q10.append(this.price);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", userName=");
        return l.k(q10, this.userName, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PriceSSE(java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.Boolean r19, java.lang.Object r20, java.lang.Long r21, java.lang.String r22, java.lang.Long r23, java.lang.Integer r24, java.lang.Long r25, java.lang.String r26, java.lang.Long r27, java.lang.String r28, java.lang.String r29, int r30, sk.e r31) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.sse.PriceSSE.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Object, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
