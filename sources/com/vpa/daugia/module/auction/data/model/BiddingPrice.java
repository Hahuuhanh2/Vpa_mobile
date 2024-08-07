package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: BiddingPriceTable.kt */
public final class BiddingPrice implements Serializable {
    @b("auctionCode")
    private String auctionCode;
    @b("bksId")
    private Long bksId;
    @b("customerName")
    private String customerName;
    @b("khCongBoId")
    private Long khCongBoId;
    @b("khDauGiaId")
    private Long khDauGiaId;
    @b("kyHieuDiaPhuong")
    private String kyHieuDiaPhuong;
    @b("numberOfSetPrice")
    private Integer numberOfSetPrice;
    @b("price")
    private Long price;
    @b("roomId")
    private String roomId;
    @b("roundNumber")
    private Integer roundNumber;
    @b("seriDangKy")
    private String seriDangKy;
    @b("soThuTu")
    private String soThuTu;
    @b("updateTime")
    private Long updateTime;
    @b("userId")
    private Long userId;
    @b("userMobile")
    private Object userMobile;

    public BiddingPrice() {
        this((String) null, (Long) null, (String) null, (Long) null, (Long) null, (String) null, (Integer) null, (Long) null, (String) null, (Integer) null, (String) null, (String) null, (Long) null, (Long) null, (Object) null, 32767, (e) null);
    }

    public BiddingPrice(String str, Long l10, String str2, Long l11, Long l12, String str3, Integer num, Long l13, String str4, Integer num2, String str5, String str6, Long l14, Long l15, Object obj) {
        this.auctionCode = str;
        this.bksId = l10;
        this.customerName = str2;
        this.khCongBoId = l11;
        this.khDauGiaId = l12;
        this.kyHieuDiaPhuong = str3;
        this.numberOfSetPrice = num;
        this.price = l13;
        this.roomId = str4;
        this.roundNumber = num2;
        this.seriDangKy = str5;
        this.soThuTu = str6;
        this.updateTime = l14;
        this.userId = l15;
        this.userMobile = obj;
    }

    public static /* synthetic */ BiddingPrice copy$default(BiddingPrice biddingPrice, String str, Long l10, String str2, Long l11, Long l12, String str3, Integer num, Long l13, String str4, Integer num2, String str5, String str6, Long l14, Long l15, Object obj, int i10, Object obj2) {
        BiddingPrice biddingPrice2 = biddingPrice;
        int i11 = i10;
        return biddingPrice.copy((i11 & 1) != 0 ? biddingPrice2.auctionCode : str, (i11 & 2) != 0 ? biddingPrice2.bksId : l10, (i11 & 4) != 0 ? biddingPrice2.customerName : str2, (i11 & 8) != 0 ? biddingPrice2.khCongBoId : l11, (i11 & 16) != 0 ? biddingPrice2.khDauGiaId : l12, (i11 & 32) != 0 ? biddingPrice2.kyHieuDiaPhuong : str3, (i11 & 64) != 0 ? biddingPrice2.numberOfSetPrice : num, (i11 & 128) != 0 ? biddingPrice2.price : l13, (i11 & 256) != 0 ? biddingPrice2.roomId : str4, (i11 & 512) != 0 ? biddingPrice2.roundNumber : num2, (i11 & 1024) != 0 ? biddingPrice2.seriDangKy : str5, (i11 & 2048) != 0 ? biddingPrice2.soThuTu : str6, (i11 & 4096) != 0 ? biddingPrice2.updateTime : l14, (i11 & 8192) != 0 ? biddingPrice2.userId : l15, (i11 & 16384) != 0 ? biddingPrice2.userMobile : obj);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final Integer component10() {
        return this.roundNumber;
    }

    public final String component11() {
        return this.seriDangKy;
    }

    public final String component12() {
        return this.soThuTu;
    }

    public final Long component13() {
        return this.updateTime;
    }

    public final Long component14() {
        return this.userId;
    }

    public final Object component15() {
        return this.userMobile;
    }

    public final Long component2() {
        return this.bksId;
    }

    public final String component3() {
        return this.customerName;
    }

    public final Long component4() {
        return this.khCongBoId;
    }

    public final Long component5() {
        return this.khDauGiaId;
    }

    public final String component6() {
        return this.kyHieuDiaPhuong;
    }

    public final Integer component7() {
        return this.numberOfSetPrice;
    }

    public final Long component8() {
        return this.price;
    }

    public final String component9() {
        return this.roomId;
    }

    public final BiddingPrice copy(String str, Long l10, String str2, Long l11, Long l12, String str3, Integer num, Long l13, String str4, Integer num2, String str5, String str6, Long l14, Long l15, Object obj) {
        return new BiddingPrice(str, l10, str2, l11, l12, str3, num, l13, str4, num2, str5, str6, l14, l15, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiddingPrice)) {
            return false;
        }
        BiddingPrice biddingPrice = (BiddingPrice) obj;
        return j.a(this.auctionCode, biddingPrice.auctionCode) && j.a(this.bksId, biddingPrice.bksId) && j.a(this.customerName, biddingPrice.customerName) && j.a(this.khCongBoId, biddingPrice.khCongBoId) && j.a(this.khDauGiaId, biddingPrice.khDauGiaId) && j.a(this.kyHieuDiaPhuong, biddingPrice.kyHieuDiaPhuong) && j.a(this.numberOfSetPrice, biddingPrice.numberOfSetPrice) && j.a(this.price, biddingPrice.price) && j.a(this.roomId, biddingPrice.roomId) && j.a(this.roundNumber, biddingPrice.roundNumber) && j.a(this.seriDangKy, biddingPrice.seriDangKy) && j.a(this.soThuTu, biddingPrice.soThuTu) && j.a(this.updateTime, biddingPrice.updateTime) && j.a(this.userId, biddingPrice.userId) && j.a(this.userMobile, biddingPrice.userMobile);
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final Long getBksId() {
        return this.bksId;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final Long getKhCongBoId() {
        return this.khCongBoId;
    }

    public final Long getKhDauGiaId() {
        return this.khDauGiaId;
    }

    public final String getKyHieuDiaPhuong() {
        return this.kyHieuDiaPhuong;
    }

    public final Integer getNumberOfSetPrice() {
        return this.numberOfSetPrice;
    }

    public final Long getPrice() {
        return this.price;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Integer getRoundNumber() {
        return this.roundNumber;
    }

    public final String getSeriDangKy() {
        return this.seriDangKy;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final Object getUserMobile() {
        return this.userMobile;
    }

    public int hashCode() {
        String str = this.auctionCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.bksId;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.customerName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.khCongBoId;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.khDauGiaId;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.kyHieuDiaPhuong;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.numberOfSetPrice;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.price;
        int hashCode8 = (hashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.roomId;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.roundNumber;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.seriDangKy;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.soThuTu;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l14 = this.updateTime;
        int hashCode13 = (hashCode12 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.userId;
        int hashCode14 = (hashCode13 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Object obj = this.userMobile;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode14 + i10;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setBksId(Long l10) {
        this.bksId = l10;
    }

    public final void setCustomerName(String str) {
        this.customerName = str;
    }

    public final void setKhCongBoId(Long l10) {
        this.khCongBoId = l10;
    }

    public final void setKhDauGiaId(Long l10) {
        this.khDauGiaId = l10;
    }

    public final void setKyHieuDiaPhuong(String str) {
        this.kyHieuDiaPhuong = str;
    }

    public final void setNumberOfSetPrice(Integer num) {
        this.numberOfSetPrice = num;
    }

    public final void setPrice(Long l10) {
        this.price = l10;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setRoundNumber(Integer num) {
        this.roundNumber = num;
    }

    public final void setSeriDangKy(String str) {
        this.seriDangKy = str;
    }

    public final void setSoThuTu(String str) {
        this.soThuTu = str;
    }

    public final void setUpdateTime(Long l10) {
        this.updateTime = l10;
    }

    public final void setUserId(Long l10) {
        this.userId = l10;
    }

    public final void setUserMobile(Object obj) {
        this.userMobile = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("BiddingPrice(auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", bksId=");
        q10.append(this.bksId);
        q10.append(", customerName=");
        q10.append(this.customerName);
        q10.append(", khCongBoId=");
        q10.append(this.khCongBoId);
        q10.append(", khDauGiaId=");
        q10.append(this.khDauGiaId);
        q10.append(", kyHieuDiaPhuong=");
        q10.append(this.kyHieuDiaPhuong);
        q10.append(", numberOfSetPrice=");
        q10.append(this.numberOfSetPrice);
        q10.append(", price=");
        q10.append(this.price);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", roundNumber=");
        q10.append(this.roundNumber);
        q10.append(", seriDangKy=");
        q10.append(this.seriDangKy);
        q10.append(", soThuTu=");
        q10.append(this.soThuTu);
        q10.append(", updateTime=");
        q10.append(this.updateTime);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", userMobile=");
        q10.append(this.userMobile);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BiddingPrice(java.lang.String r17, java.lang.Long r18, java.lang.String r19, java.lang.Long r20, java.lang.Long r21, java.lang.String r22, java.lang.Integer r23, java.lang.Long r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.Long r29, java.lang.Long r30, java.lang.Object r31, int r32, sk.e r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.BiddingPrice.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Object, int, sk.e):void");
    }
}
