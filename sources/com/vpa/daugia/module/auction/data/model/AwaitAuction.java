package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: AwaitAuction.kt */
public final class AwaitAuction implements Serializable {
    @b("auctionFromTime")
    private String auctionFromTime;
    @b("auctionRoomId")
    private Object auctionRoomId;
    @b("auctionToTime")
    private String auctionToTime;
    @b("favorited")
    private Boolean favorited;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19373id;
    @b("idProvince")
    private Long idProvince;
    @b("isCancel")
    private Object isCancel;
    @b("isEnded")
    private Object isEnded;
    @b("isStarted")
    private Object isStarted;
    @b("nameProvince")
    private String nameProvince;
    @b("orders")
    private String orders;
    @b("paymentStatus")
    private Object paymentStatus;
    @b("plateNumber")
    private String plateNumber;
    @b("provinceSymbol")
    private Long provinceSymbol;
    @b("registed")
    private Object registed;
    @b("registerFromDate")
    private String registerFromDate;
    @b("registerToDate")
    private String registerToDate;
    @b("series")
    private String series;
    @b("status")
    private Long status;
    @b("statusOrder")
    private Object statusOrder;
    @b("timeout")
    private Object timeout;
    @b("type")
    private Long type;
    @b("wishListCount")
    private Integer wishListCount;

    public AwaitAuction() {
        this((String) null, (Object) null, (String) null, (Boolean) null, (String) null, (Long) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, (String) null, (Long) null, (Object) null, (String) null, (String) null, (String) null, (Long) null, (Object) null, (Object) null, (Long) null, (Integer) null, 8388607, (e) null);
    }

    public AwaitAuction(String str, Object obj, String str2, Boolean bool, String str3, Long l10, Object obj2, Object obj3, Object obj4, String str4, String str5, Object obj5, String str6, Long l11, Object obj6, String str7, String str8, String str9, Long l12, Object obj7, Object obj8, Long l13, Integer num) {
        this.auctionFromTime = str;
        this.auctionRoomId = obj;
        this.auctionToTime = str2;
        this.favorited = bool;
        this.f19373id = str3;
        this.idProvince = l10;
        this.isCancel = obj2;
        this.isEnded = obj3;
        this.isStarted = obj4;
        this.nameProvince = str4;
        this.orders = str5;
        this.paymentStatus = obj5;
        this.plateNumber = str6;
        this.provinceSymbol = l11;
        this.registed = obj6;
        this.registerFromDate = str7;
        this.registerToDate = str8;
        this.series = str9;
        this.status = l12;
        this.statusOrder = obj7;
        this.timeout = obj8;
        this.type = l13;
        this.wishListCount = num;
    }

    public static /* synthetic */ AwaitAuction copy$default(AwaitAuction awaitAuction, String str, Object obj, String str2, Boolean bool, String str3, Long l10, Object obj2, Object obj3, Object obj4, String str4, String str5, Object obj5, String str6, Long l11, Object obj6, String str7, String str8, String str9, Long l12, Object obj7, Object obj8, Long l13, Integer num, int i10, Object obj9) {
        AwaitAuction awaitAuction2 = awaitAuction;
        int i11 = i10;
        return awaitAuction.copy((i11 & 1) != 0 ? awaitAuction2.auctionFromTime : str, (i11 & 2) != 0 ? awaitAuction2.auctionRoomId : obj, (i11 & 4) != 0 ? awaitAuction2.auctionToTime : str2, (i11 & 8) != 0 ? awaitAuction2.favorited : bool, (i11 & 16) != 0 ? awaitAuction2.f19373id : str3, (i11 & 32) != 0 ? awaitAuction2.idProvince : l10, (i11 & 64) != 0 ? awaitAuction2.isCancel : obj2, (i11 & 128) != 0 ? awaitAuction2.isEnded : obj3, (i11 & 256) != 0 ? awaitAuction2.isStarted : obj4, (i11 & 512) != 0 ? awaitAuction2.nameProvince : str4, (i11 & 1024) != 0 ? awaitAuction2.orders : str5, (i11 & 2048) != 0 ? awaitAuction2.paymentStatus : obj5, (i11 & 4096) != 0 ? awaitAuction2.plateNumber : str6, (i11 & 8192) != 0 ? awaitAuction2.provinceSymbol : l11, (i11 & 16384) != 0 ? awaitAuction2.registed : obj6, (i11 & 32768) != 0 ? awaitAuction2.registerFromDate : str7, (i11 & 65536) != 0 ? awaitAuction2.registerToDate : str8, (i11 & 131072) != 0 ? awaitAuction2.series : str9, (i11 & 262144) != 0 ? awaitAuction2.status : l12, (i11 & 524288) != 0 ? awaitAuction2.statusOrder : obj7, (i11 & 1048576) != 0 ? awaitAuction2.timeout : obj8, (i11 & 2097152) != 0 ? awaitAuction2.type : l13, (i11 & 4194304) != 0 ? awaitAuction2.wishListCount : num);
    }

    public final String component1() {
        return this.auctionFromTime;
    }

    public final String component10() {
        return this.nameProvince;
    }

    public final String component11() {
        return this.orders;
    }

    public final Object component12() {
        return this.paymentStatus;
    }

    public final String component13() {
        return this.plateNumber;
    }

    public final Long component14() {
        return this.provinceSymbol;
    }

    public final Object component15() {
        return this.registed;
    }

    public final String component16() {
        return this.registerFromDate;
    }

    public final String component17() {
        return this.registerToDate;
    }

    public final String component18() {
        return this.series;
    }

    public final Long component19() {
        return this.status;
    }

    public final Object component2() {
        return this.auctionRoomId;
    }

    public final Object component20() {
        return this.statusOrder;
    }

    public final Object component21() {
        return this.timeout;
    }

    public final Long component22() {
        return this.type;
    }

    public final Integer component23() {
        return this.wishListCount;
    }

    public final String component3() {
        return this.auctionToTime;
    }

    public final Boolean component4() {
        return this.favorited;
    }

    public final String component5() {
        return this.f19373id;
    }

    public final Long component6() {
        return this.idProvince;
    }

    public final Object component7() {
        return this.isCancel;
    }

    public final Object component8() {
        return this.isEnded;
    }

    public final Object component9() {
        return this.isStarted;
    }

    public final AwaitAuction copy(String str, Object obj, String str2, Boolean bool, String str3, Long l10, Object obj2, Object obj3, Object obj4, String str4, String str5, Object obj5, String str6, Long l11, Object obj6, String str7, String str8, String str9, Long l12, Object obj7, Object obj8, Long l13, Integer num) {
        return new AwaitAuction(str, obj, str2, bool, str3, l10, obj2, obj3, obj4, str4, str5, obj5, str6, l11, obj6, str7, str8, str9, l12, obj7, obj8, l13, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwaitAuction)) {
            return false;
        }
        AwaitAuction awaitAuction = (AwaitAuction) obj;
        return j.a(this.auctionFromTime, awaitAuction.auctionFromTime) && j.a(this.auctionRoomId, awaitAuction.auctionRoomId) && j.a(this.auctionToTime, awaitAuction.auctionToTime) && j.a(this.favorited, awaitAuction.favorited) && j.a(this.f19373id, awaitAuction.f19373id) && j.a(this.idProvince, awaitAuction.idProvince) && j.a(this.isCancel, awaitAuction.isCancel) && j.a(this.isEnded, awaitAuction.isEnded) && j.a(this.isStarted, awaitAuction.isStarted) && j.a(this.nameProvince, awaitAuction.nameProvince) && j.a(this.orders, awaitAuction.orders) && j.a(this.paymentStatus, awaitAuction.paymentStatus) && j.a(this.plateNumber, awaitAuction.plateNumber) && j.a(this.provinceSymbol, awaitAuction.provinceSymbol) && j.a(this.registed, awaitAuction.registed) && j.a(this.registerFromDate, awaitAuction.registerFromDate) && j.a(this.registerToDate, awaitAuction.registerToDate) && j.a(this.series, awaitAuction.series) && j.a(this.status, awaitAuction.status) && j.a(this.statusOrder, awaitAuction.statusOrder) && j.a(this.timeout, awaitAuction.timeout) && j.a(this.type, awaitAuction.type) && j.a(this.wishListCount, awaitAuction.wishListCount);
    }

    public final String getAuctionFromTime() {
        return this.auctionFromTime;
    }

    public final Object getAuctionRoomId() {
        return this.auctionRoomId;
    }

    public final String getAuctionToTime() {
        return this.auctionToTime;
    }

    public final Boolean getFavorited() {
        return this.favorited;
    }

    public final String getId() {
        return this.f19373id;
    }

    public final Long getIdProvince() {
        return this.idProvince;
    }

    public final String getNameProvince() {
        return this.nameProvince;
    }

    public final String getOrders() {
        return this.orders;
    }

    public final Object getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlateNumber() {
        return this.plateNumber;
    }

    public final Long getProvinceSymbol() {
        return this.provinceSymbol;
    }

    public final Object getRegisted() {
        return this.registed;
    }

    public final String getRegisterFromDate() {
        return this.registerFromDate;
    }

    public final String getRegisterToDate() {
        return this.registerToDate;
    }

    public final String getSeries() {
        return this.series;
    }

    public final Long getStatus() {
        return this.status;
    }

    public final Object getStatusOrder() {
        return this.statusOrder;
    }

    public final Object getTimeout() {
        return this.timeout;
    }

    public final Long getType() {
        return this.type;
    }

    public final Integer getWishListCount() {
        return this.wishListCount;
    }

    public int hashCode() {
        String str = this.auctionFromTime;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.auctionRoomId;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.auctionToTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.favorited;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f19373id;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.idProvince;
        int hashCode6 = (hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Object obj2 = this.isCancel;
        int hashCode7 = (hashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.isEnded;
        int hashCode8 = (hashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.isStarted;
        int hashCode9 = (hashCode8 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str4 = this.nameProvince;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orders;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj5 = this.paymentStatus;
        int hashCode12 = (hashCode11 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str6 = this.plateNumber;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.provinceSymbol;
        int hashCode14 = (hashCode13 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj6 = this.registed;
        int hashCode15 = (hashCode14 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str7 = this.registerFromDate;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.registerToDate;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.series;
        int hashCode18 = (hashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l12 = this.status;
        int hashCode19 = (hashCode18 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Object obj7 = this.statusOrder;
        int hashCode20 = (hashCode19 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.timeout;
        int hashCode21 = (hashCode20 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        Long l13 = this.type;
        int hashCode22 = (hashCode21 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num = this.wishListCount;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode22 + i10;
    }

    public final Object isCancel() {
        return this.isCancel;
    }

    public final Object isEnded() {
        return this.isEnded;
    }

    public final Object isStarted() {
        return this.isStarted;
    }

    public final void setAuctionFromTime(String str) {
        this.auctionFromTime = str;
    }

    public final void setAuctionRoomId(Object obj) {
        this.auctionRoomId = obj;
    }

    public final void setAuctionToTime(String str) {
        this.auctionToTime = str;
    }

    public final void setCancel(Object obj) {
        this.isCancel = obj;
    }

    public final void setEnded(Object obj) {
        this.isEnded = obj;
    }

    public final void setFavorited(Boolean bool) {
        this.favorited = bool;
    }

    public final void setId(String str) {
        this.f19373id = str;
    }

    public final void setIdProvince(Long l10) {
        this.idProvince = l10;
    }

    public final void setNameProvince(String str) {
        this.nameProvince = str;
    }

    public final void setOrders(String str) {
        this.orders = str;
    }

    public final void setPaymentStatus(Object obj) {
        this.paymentStatus = obj;
    }

    public final void setPlateNumber(String str) {
        this.plateNumber = str;
    }

    public final void setProvinceSymbol(Long l10) {
        this.provinceSymbol = l10;
    }

    public final void setRegisted(Object obj) {
        this.registed = obj;
    }

    public final void setRegisterFromDate(String str) {
        this.registerFromDate = str;
    }

    public final void setRegisterToDate(String str) {
        this.registerToDate = str;
    }

    public final void setSeries(String str) {
        this.series = str;
    }

    public final void setStarted(Object obj) {
        this.isStarted = obj;
    }

    public final void setStatus(Long l10) {
        this.status = l10;
    }

    public final void setStatusOrder(Object obj) {
        this.statusOrder = obj;
    }

    public final void setTimeout(Object obj) {
        this.timeout = obj;
    }

    public final void setType(Long l10) {
        this.type = l10;
    }

    public final void setWishListCount(Integer num) {
        this.wishListCount = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("AwaitAuction(auctionFromTime=");
        q10.append(this.auctionFromTime);
        q10.append(", auctionRoomId=");
        q10.append(this.auctionRoomId);
        q10.append(", auctionToTime=");
        q10.append(this.auctionToTime);
        q10.append(", favorited=");
        q10.append(this.favorited);
        q10.append(", id=");
        q10.append(this.f19373id);
        q10.append(", idProvince=");
        q10.append(this.idProvince);
        q10.append(", isCancel=");
        q10.append(this.isCancel);
        q10.append(", isEnded=");
        q10.append(this.isEnded);
        q10.append(", isStarted=");
        q10.append(this.isStarted);
        q10.append(", nameProvince=");
        q10.append(this.nameProvince);
        q10.append(", orders=");
        q10.append(this.orders);
        q10.append(", paymentStatus=");
        q10.append(this.paymentStatus);
        q10.append(", plateNumber=");
        q10.append(this.plateNumber);
        q10.append(", provinceSymbol=");
        q10.append(this.provinceSymbol);
        q10.append(", registed=");
        q10.append(this.registed);
        q10.append(", registerFromDate=");
        q10.append(this.registerFromDate);
        q10.append(", registerToDate=");
        q10.append(this.registerToDate);
        q10.append(", series=");
        q10.append(this.series);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", statusOrder=");
        q10.append(this.statusOrder);
        q10.append(", timeout=");
        q10.append(this.timeout);
        q10.append(", type=");
        q10.append(this.type);
        q10.append(", wishListCount=");
        q10.append(this.wishListCount);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AwaitAuction(java.lang.String r25, java.lang.Object r26, java.lang.String r27, java.lang.Boolean r28, java.lang.String r29, java.lang.Long r30, java.lang.Object r31, java.lang.Object r32, java.lang.Object r33, java.lang.String r34, java.lang.String r35, java.lang.Object r36, java.lang.String r37, java.lang.Long r38, java.lang.Object r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.Long r43, java.lang.Object r44, java.lang.Object r45, java.lang.Long r46, java.lang.Integer r47, int r48, sk.e r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r25
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r26
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r27
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x0023
        L_0x0021:
            r5 = r28
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = 0
            goto L_0x002b
        L_0x0029:
            r6 = r29
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = 0
            goto L_0x0033
        L_0x0031:
            r7 = r30
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r8 = r31
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            r9 = r32
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r10 = r33
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = 0
            goto L_0x0053
        L_0x0051:
            r11 = r34
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = 0
            goto L_0x005b
        L_0x0059:
            r12 = r35
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = 0
            goto L_0x0063
        L_0x0061:
            r13 = r36
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = 0
            goto L_0x006b
        L_0x0069:
            r14 = r37
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = 0
            goto L_0x0073
        L_0x0071:
            r15 = r38
        L_0x0073:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0079
            r2 = 0
            goto L_0x007b
        L_0x0079:
            r2 = r39
        L_0x007b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0085
            r16 = 0
            goto L_0x0087
        L_0x0085:
            r16 = r40
        L_0x0087:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0090
            r17 = 0
            goto L_0x0092
        L_0x0090:
            r17 = r41
        L_0x0092:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009b
            r18 = 0
            goto L_0x009d
        L_0x009b:
            r18 = r42
        L_0x009d:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a6
            r19 = 0
            goto L_0x00a8
        L_0x00a6:
            r19 = r43
        L_0x00a8:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b1
            r20 = 0
            goto L_0x00b3
        L_0x00b1:
            r20 = r44
        L_0x00b3:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bc
            r21 = 0
            goto L_0x00be
        L_0x00bc:
            r21 = r45
        L_0x00be:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c7
            r22 = 0
            goto L_0x00c9
        L_0x00c7:
            r22 = r46
        L_0x00c9:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00d5
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00d7
        L_0x00d5:
            r0 = r47
        L_0x00d7:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r36 = r12
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r16
            r42 = r17
            r43 = r18
            r44 = r19
            r45 = r20
            r46 = r21
            r47 = r22
            r48 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.AwaitAuction.<init>(java.lang.String, java.lang.Object, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Long, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Object, java.lang.Object, java.lang.Long, java.lang.Integer, int, sk.e):void");
    }
}
