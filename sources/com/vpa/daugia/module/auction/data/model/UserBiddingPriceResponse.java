package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: UserBiddingPriceResponse.kt */
public final class UserBiddingPriceResponse {
    @b("auctionCode")
    private String auctionCode;
    @b("biddingRequestTime")
    private Long biddingRequestTime;
    @b("code")
    private Integer code;
    @b("errorCode")
    private final Integer errorCode;
    @b("errors")
    private final List<String> errors;
    @b("highLight")
    private boolean highLight;
    @b("ipAddress")
    private String ipAddress;
    @b("lanGiaHan")
    private Integer lanGiaHan;
    @b("message")
    private String message;
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

    public UserBiddingPriceResponse() {
        this((String) null, (Long) null, (Integer) null, false, (String) null, (Integer) null, (String) null, (Long) null, (Integer) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (List) null, 131071, (e) null);
    }

    public UserBiddingPriceResponse(String str, Long l10, Integer num, boolean z10, String str2, Integer num2, String str3, Long l11, Integer num3, Long l12, String str4, Long l13, String str5, String str6, String str7, Integer num4, List<String> list) {
        List<String> list2 = list;
        j.f(list2, "errors");
        this.auctionCode = str;
        this.biddingRequestTime = l10;
        this.code = num;
        this.highLight = z10;
        this.ipAddress = str2;
        this.lanGiaHan = num2;
        this.nextId = str3;
        this.numberOfSetPrice = l11;
        this.payCount = num3;
        this.price = l12;
        this.roomId = str4;
        this.sessionId = l13;
        this.userId = str5;
        this.userName = str6;
        this.message = str7;
        this.errorCode = num4;
        this.errors = list2;
    }

    public static /* synthetic */ UserBiddingPriceResponse copy$default(UserBiddingPriceResponse userBiddingPriceResponse, String str, Long l10, Integer num, boolean z10, String str2, Integer num2, String str3, Long l11, Integer num3, Long l12, String str4, Long l13, String str5, String str6, String str7, Integer num4, List list, int i10, Object obj) {
        UserBiddingPriceResponse userBiddingPriceResponse2 = userBiddingPriceResponse;
        int i11 = i10;
        return userBiddingPriceResponse.copy((i11 & 1) != 0 ? userBiddingPriceResponse2.auctionCode : str, (i11 & 2) != 0 ? userBiddingPriceResponse2.biddingRequestTime : l10, (i11 & 4) != 0 ? userBiddingPriceResponse2.code : num, (i11 & 8) != 0 ? userBiddingPriceResponse2.highLight : z10, (i11 & 16) != 0 ? userBiddingPriceResponse2.ipAddress : str2, (i11 & 32) != 0 ? userBiddingPriceResponse2.lanGiaHan : num2, (i11 & 64) != 0 ? userBiddingPriceResponse2.nextId : str3, (i11 & 128) != 0 ? userBiddingPriceResponse2.numberOfSetPrice : l11, (i11 & 256) != 0 ? userBiddingPriceResponse2.payCount : num3, (i11 & 512) != 0 ? userBiddingPriceResponse2.price : l12, (i11 & 1024) != 0 ? userBiddingPriceResponse2.roomId : str4, (i11 & 2048) != 0 ? userBiddingPriceResponse2.sessionId : l13, (i11 & 4096) != 0 ? userBiddingPriceResponse2.userId : str5, (i11 & 8192) != 0 ? userBiddingPriceResponse2.userName : str6, (i11 & 16384) != 0 ? userBiddingPriceResponse2.message : str7, (i11 & 32768) != 0 ? userBiddingPriceResponse2.errorCode : num4, (i11 & 65536) != 0 ? userBiddingPriceResponse2.errors : list);
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

    public final String component15() {
        return this.message;
    }

    public final Integer component16() {
        return this.errorCode;
    }

    public final List<String> component17() {
        return this.errors;
    }

    public final Long component2() {
        return this.biddingRequestTime;
    }

    public final Integer component3() {
        return this.code;
    }

    public final boolean component4() {
        return this.highLight;
    }

    public final String component5() {
        return this.ipAddress;
    }

    public final Integer component6() {
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

    public final UserBiddingPriceResponse copy(String str, Long l10, Integer num, boolean z10, String str2, Integer num2, String str3, Long l11, Integer num3, Long l12, String str4, Long l13, String str5, String str6, String str7, Integer num4, List<String> list) {
        String str8 = str;
        j.f(list, "errors");
        return new UserBiddingPriceResponse(str, l10, num, z10, str2, num2, str3, l11, num3, l12, str4, l13, str5, str6, str7, num4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBiddingPriceResponse)) {
            return false;
        }
        UserBiddingPriceResponse userBiddingPriceResponse = (UserBiddingPriceResponse) obj;
        return j.a(this.auctionCode, userBiddingPriceResponse.auctionCode) && j.a(this.biddingRequestTime, userBiddingPriceResponse.biddingRequestTime) && j.a(this.code, userBiddingPriceResponse.code) && this.highLight == userBiddingPriceResponse.highLight && j.a(this.ipAddress, userBiddingPriceResponse.ipAddress) && j.a(this.lanGiaHan, userBiddingPriceResponse.lanGiaHan) && j.a(this.nextId, userBiddingPriceResponse.nextId) && j.a(this.numberOfSetPrice, userBiddingPriceResponse.numberOfSetPrice) && j.a(this.payCount, userBiddingPriceResponse.payCount) && j.a(this.price, userBiddingPriceResponse.price) && j.a(this.roomId, userBiddingPriceResponse.roomId) && j.a(this.sessionId, userBiddingPriceResponse.sessionId) && j.a(this.userId, userBiddingPriceResponse.userId) && j.a(this.userName, userBiddingPriceResponse.userName) && j.a(this.message, userBiddingPriceResponse.message) && j.a(this.errorCode, userBiddingPriceResponse.errorCode) && j.a(this.errors, userBiddingPriceResponse.errors);
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final Long getBiddingRequestTime() {
        return this.biddingRequestTime;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final boolean getHighLight() {
        return this.highLight;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final Integer getLanGiaHan() {
        return this.lanGiaHan;
    }

    public final String getMessage() {
        return this.message;
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
        Integer num = this.code;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.highLight;
        if (z10) {
            z10 = true;
        }
        int i11 = (hashCode3 + (z10 ? 1 : 0)) * 31;
        String str2 = this.ipAddress;
        int hashCode4 = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.lanGiaHan;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.nextId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.numberOfSetPrice;
        int hashCode7 = (hashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num3 = this.payCount;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.price;
        int hashCode9 = (hashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.roomId;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l13 = this.sessionId;
        int hashCode11 = (hashCode10 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str5 = this.userId;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userName;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.message;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.errorCode;
        if (num4 != null) {
            i10 = num4.hashCode();
        }
        return this.errors.hashCode() + ((hashCode14 + i10) * 31);
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBiddingRequestTime(Long l10) {
        this.biddingRequestTime = l10;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setHighLight(boolean z10) {
        this.highLight = z10;
    }

    public final void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public final void setLanGiaHan(Integer num) {
        this.lanGiaHan = num;
    }

    public final void setMessage(String str) {
        this.message = str;
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
        StringBuilder q10 = a.q("UserBiddingPriceResponse(auctionCode=");
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
        q10.append(this.userName);
        q10.append(", message=");
        q10.append(this.message);
        q10.append(", errorCode=");
        q10.append(this.errorCode);
        q10.append(", errors=");
        q10.append(this.errors);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserBiddingPriceResponse(java.lang.String r19, java.lang.Long r20, java.lang.Integer r21, boolean r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, java.lang.Long r26, java.lang.Integer r27, java.lang.Long r28, java.lang.String r29, java.lang.Long r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.Integer r34, java.util.List r35, int r36, sk.e r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r22
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = ""
            goto L_0x002b
        L_0x0029:
            r6 = r23
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = 0
            goto L_0x0033
        L_0x0031:
            r7 = r24
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = r25
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            r9 = r26
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r10 = r27
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = 0
            goto L_0x0053
        L_0x0051:
            r11 = r28
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = 0
            goto L_0x005b
        L_0x0059:
            r12 = r29
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = 0
            goto L_0x0063
        L_0x0061:
            r13 = r30
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = 0
            goto L_0x006b
        L_0x0069:
            r14 = r31
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = 0
            goto L_0x0073
        L_0x0071:
            r15 = r32
        L_0x0073:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0079
            r2 = 0
            goto L_0x007b
        L_0x0079:
            r2 = r33
        L_0x007b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0085
            r16 = 0
            goto L_0x0087
        L_0x0085:
            r16 = r34
        L_0x0087:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0090
            fk.r r0 = fk.r.f20213a
            goto L_0x0092
        L_0x0090:
            r0 = r35
        L_0x0092:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r2
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.UserBiddingPriceResponse.<init>(java.lang.String, java.lang.Long, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, int, sk.e):void");
    }
}
