package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: OrderWaitAuction.kt */
public final class OrderWaitAuction implements Serializable {
    @b("auctionDate")
    private Long auctionDate;
    @b("auctionFromTime")
    private Long auctionFromTime;
    @b("auctionRoomId")
    private String auctionRoomId;
    @b("auctionToTime")
    private Long auctionToTime;
    @b("basePrice")
    private Double basePrice;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19377id;
    @b("inWishlist")
    private Object inWishlist;
    @b("isCancel")
    private Object isCancel;
    @b("order")
    private String order;
    @b("orderCode")
    private String orderCode;
    @b("orderId")
    private String orderId;
    @b("orderStatus")
    private Integer orderStatus;
    @b("orderTotalAmount")
    private Double orderTotalAmount;
    @b("paymentDate")
    private Long paymentDate;
    @b("paymentStatus")
    private Integer paymentStatus;
    @b("plateNumber")
    private String plateNumber;
    @b("provinceSymbol")
    private String provinceSymbol;
    @b("publishDetailId")
    private String publishDetailId;
    @b("publishFromDate")
    private Object publishFromDate;
    @b("publishToDate")
    private Object publishToDate;
    @b("registerFromDate")
    private Long registerFromDate;
    @b("registerToDate")
    private Long registerToDate;
    @b("series")
    private String series;
    @b("sessionId")
    private String sessionId;
    @b("status")
    private Integer status;
    @b("vehicleType")
    private String vehicleType;
    @b("wishlistCount")
    private Integer wishlistCount;

    public OrderWaitAuction() {
        this((Long) null, (Long) null, (String) null, (Long) null, (Double) null, (String) null, (Object) null, (Object) null, (String) null, (String) null, (String) null, (Integer) null, (Double) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Object) null, (Object) null, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, 134217727, (e) null);
    }

    public OrderWaitAuction(Long l10, Long l11, String str, Long l12, Double d10, String str2, Object obj, Object obj2, String str3, String str4, String str5, Integer num, Double d11, Long l13, Integer num2, String str6, String str7, String str8, Object obj3, Object obj4, Long l14, Long l15, String str9, String str10, Integer num3, String str11, Integer num4) {
        this.auctionDate = l10;
        this.auctionFromTime = l11;
        this.auctionRoomId = str;
        this.auctionToTime = l12;
        this.basePrice = d10;
        this.f19377id = str2;
        this.inWishlist = obj;
        this.isCancel = obj2;
        this.order = str3;
        this.orderCode = str4;
        this.orderId = str5;
        this.orderStatus = num;
        this.orderTotalAmount = d11;
        this.paymentDate = l13;
        this.paymentStatus = num2;
        this.plateNumber = str6;
        this.provinceSymbol = str7;
        this.publishDetailId = str8;
        this.publishFromDate = obj3;
        this.publishToDate = obj4;
        this.registerFromDate = l14;
        this.registerToDate = l15;
        this.series = str9;
        this.sessionId = str10;
        this.status = num3;
        this.vehicleType = str11;
        this.wishlistCount = num4;
    }

    public static /* synthetic */ OrderWaitAuction copy$default(OrderWaitAuction orderWaitAuction, Long l10, Long l11, String str, Long l12, Double d10, String str2, Object obj, Object obj2, String str3, String str4, String str5, Integer num, Double d11, Long l13, Integer num2, String str6, String str7, String str8, Object obj3, Object obj4, Long l14, Long l15, String str9, String str10, Integer num3, String str11, Integer num4, int i10, Object obj5) {
        OrderWaitAuction orderWaitAuction2 = orderWaitAuction;
        int i11 = i10;
        return orderWaitAuction.copy((i11 & 1) != 0 ? orderWaitAuction2.auctionDate : l10, (i11 & 2) != 0 ? orderWaitAuction2.auctionFromTime : l11, (i11 & 4) != 0 ? orderWaitAuction2.auctionRoomId : str, (i11 & 8) != 0 ? orderWaitAuction2.auctionToTime : l12, (i11 & 16) != 0 ? orderWaitAuction2.basePrice : d10, (i11 & 32) != 0 ? orderWaitAuction2.f19377id : str2, (i11 & 64) != 0 ? orderWaitAuction2.inWishlist : obj, (i11 & 128) != 0 ? orderWaitAuction2.isCancel : obj2, (i11 & 256) != 0 ? orderWaitAuction2.order : str3, (i11 & 512) != 0 ? orderWaitAuction2.orderCode : str4, (i11 & 1024) != 0 ? orderWaitAuction2.orderId : str5, (i11 & 2048) != 0 ? orderWaitAuction2.orderStatus : num, (i11 & 4096) != 0 ? orderWaitAuction2.orderTotalAmount : d11, (i11 & 8192) != 0 ? orderWaitAuction2.paymentDate : l13, (i11 & 16384) != 0 ? orderWaitAuction2.paymentStatus : num2, (i11 & 32768) != 0 ? orderWaitAuction2.plateNumber : str6, (i11 & 65536) != 0 ? orderWaitAuction2.provinceSymbol : str7, (i11 & 131072) != 0 ? orderWaitAuction2.publishDetailId : str8, (i11 & 262144) != 0 ? orderWaitAuction2.publishFromDate : obj3, (i11 & 524288) != 0 ? orderWaitAuction2.publishToDate : obj4, (i11 & 1048576) != 0 ? orderWaitAuction2.registerFromDate : l14, (i11 & 2097152) != 0 ? orderWaitAuction2.registerToDate : l15, (i11 & 4194304) != 0 ? orderWaitAuction2.series : str9, (i11 & 8388608) != 0 ? orderWaitAuction2.sessionId : str10, (i11 & 16777216) != 0 ? orderWaitAuction2.status : num3, (i11 & 33554432) != 0 ? orderWaitAuction2.vehicleType : str11, (i11 & 67108864) != 0 ? orderWaitAuction2.wishlistCount : num4);
    }

    public final Long component1() {
        return this.auctionDate;
    }

    public final String component10() {
        return this.orderCode;
    }

    public final String component11() {
        return this.orderId;
    }

    public final Integer component12() {
        return this.orderStatus;
    }

    public final Double component13() {
        return this.orderTotalAmount;
    }

    public final Long component14() {
        return this.paymentDate;
    }

    public final Integer component15() {
        return this.paymentStatus;
    }

    public final String component16() {
        return this.plateNumber;
    }

    public final String component17() {
        return this.provinceSymbol;
    }

    public final String component18() {
        return this.publishDetailId;
    }

    public final Object component19() {
        return this.publishFromDate;
    }

    public final Long component2() {
        return this.auctionFromTime;
    }

    public final Object component20() {
        return this.publishToDate;
    }

    public final Long component21() {
        return this.registerFromDate;
    }

    public final Long component22() {
        return this.registerToDate;
    }

    public final String component23() {
        return this.series;
    }

    public final String component24() {
        return this.sessionId;
    }

    public final Integer component25() {
        return this.status;
    }

    public final String component26() {
        return this.vehicleType;
    }

    public final Integer component27() {
        return this.wishlistCount;
    }

    public final String component3() {
        return this.auctionRoomId;
    }

    public final Long component4() {
        return this.auctionToTime;
    }

    public final Double component5() {
        return this.basePrice;
    }

    public final String component6() {
        return this.f19377id;
    }

    public final Object component7() {
        return this.inWishlist;
    }

    public final Object component8() {
        return this.isCancel;
    }

    public final String component9() {
        return this.order;
    }

    public final OrderWaitAuction copy(Long l10, Long l11, String str, Long l12, Double d10, String str2, Object obj, Object obj2, String str3, String str4, String str5, Integer num, Double d11, Long l13, Integer num2, String str6, String str7, String str8, Object obj3, Object obj4, Long l14, Long l15, String str9, String str10, Integer num3, String str11, Integer num4) {
        return new OrderWaitAuction(l10, l11, str, l12, d10, str2, obj, obj2, str3, str4, str5, num, d11, l13, num2, str6, str7, str8, obj3, obj4, l14, l15, str9, str10, num3, str11, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderWaitAuction)) {
            return false;
        }
        OrderWaitAuction orderWaitAuction = (OrderWaitAuction) obj;
        return j.a(this.auctionDate, orderWaitAuction.auctionDate) && j.a(this.auctionFromTime, orderWaitAuction.auctionFromTime) && j.a(this.auctionRoomId, orderWaitAuction.auctionRoomId) && j.a(this.auctionToTime, orderWaitAuction.auctionToTime) && j.a(this.basePrice, orderWaitAuction.basePrice) && j.a(this.f19377id, orderWaitAuction.f19377id) && j.a(this.inWishlist, orderWaitAuction.inWishlist) && j.a(this.isCancel, orderWaitAuction.isCancel) && j.a(this.order, orderWaitAuction.order) && j.a(this.orderCode, orderWaitAuction.orderCode) && j.a(this.orderId, orderWaitAuction.orderId) && j.a(this.orderStatus, orderWaitAuction.orderStatus) && j.a(this.orderTotalAmount, orderWaitAuction.orderTotalAmount) && j.a(this.paymentDate, orderWaitAuction.paymentDate) && j.a(this.paymentStatus, orderWaitAuction.paymentStatus) && j.a(this.plateNumber, orderWaitAuction.plateNumber) && j.a(this.provinceSymbol, orderWaitAuction.provinceSymbol) && j.a(this.publishDetailId, orderWaitAuction.publishDetailId) && j.a(this.publishFromDate, orderWaitAuction.publishFromDate) && j.a(this.publishToDate, orderWaitAuction.publishToDate) && j.a(this.registerFromDate, orderWaitAuction.registerFromDate) && j.a(this.registerToDate, orderWaitAuction.registerToDate) && j.a(this.series, orderWaitAuction.series) && j.a(this.sessionId, orderWaitAuction.sessionId) && j.a(this.status, orderWaitAuction.status) && j.a(this.vehicleType, orderWaitAuction.vehicleType) && j.a(this.wishlistCount, orderWaitAuction.wishlistCount);
    }

    public final Long getAuctionDate() {
        return this.auctionDate;
    }

    public final Long getAuctionFromTime() {
        return this.auctionFromTime;
    }

    public final String getAuctionRoomId() {
        return this.auctionRoomId;
    }

    public final Long getAuctionToTime() {
        return this.auctionToTime;
    }

    public final Double getBasePrice() {
        return this.basePrice;
    }

    public final String getId() {
        return this.f19377id;
    }

    public final Object getInWishlist() {
        return this.inWishlist;
    }

    public final String getOrder() {
        return this.order;
    }

    public final String getOrderCode() {
        return this.orderCode;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    public final Double getOrderTotalAmount() {
        return this.orderTotalAmount;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public final Integer getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlateNumber() {
        return this.plateNumber;
    }

    public final String getProvinceSymbol() {
        return this.provinceSymbol;
    }

    public final String getPublishDetailId() {
        return this.publishDetailId;
    }

    public final Object getPublishFromDate() {
        return this.publishFromDate;
    }

    public final Object getPublishToDate() {
        return this.publishToDate;
    }

    public final Long getRegisterFromDate() {
        return this.registerFromDate;
    }

    public final Long getRegisterToDate() {
        return this.registerToDate;
    }

    public final String getSeries() {
        return this.series;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getVehicleType() {
        return this.vehicleType;
    }

    public final Integer getWishlistCount() {
        return this.wishlistCount;
    }

    public int hashCode() {
        Long l10 = this.auctionDate;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.auctionFromTime;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.auctionRoomId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.auctionToTime;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d10 = this.basePrice;
        int hashCode5 = (hashCode4 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.f19377id;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.inWishlist;
        int hashCode7 = (hashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.isCancel;
        int hashCode8 = (hashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.order;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderCode;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderId;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.orderStatus;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.orderTotalAmount;
        int hashCode13 = (hashCode12 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Long l13 = this.paymentDate;
        int hashCode14 = (hashCode13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num2 = this.paymentStatus;
        int hashCode15 = (hashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.plateNumber;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.provinceSymbol;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.publishDetailId;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj3 = this.publishFromDate;
        int hashCode19 = (hashCode18 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.publishToDate;
        int hashCode20 = (hashCode19 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Long l14 = this.registerFromDate;
        int hashCode21 = (hashCode20 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.registerToDate;
        int hashCode22 = (hashCode21 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str9 = this.series;
        int hashCode23 = (hashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sessionId;
        int hashCode24 = (hashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.status;
        int hashCode25 = (hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.vehicleType;
        int hashCode26 = (hashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num4 = this.wishlistCount;
        if (num4 != null) {
            i10 = num4.hashCode();
        }
        return hashCode26 + i10;
    }

    public final Object isCancel() {
        return this.isCancel;
    }

    public final void setAuctionDate(Long l10) {
        this.auctionDate = l10;
    }

    public final void setAuctionFromTime(Long l10) {
        this.auctionFromTime = l10;
    }

    public final void setAuctionRoomId(String str) {
        this.auctionRoomId = str;
    }

    public final void setAuctionToTime(Long l10) {
        this.auctionToTime = l10;
    }

    public final void setBasePrice(Double d10) {
        this.basePrice = d10;
    }

    public final void setCancel(Object obj) {
        this.isCancel = obj;
    }

    public final void setId(String str) {
        this.f19377id = str;
    }

    public final void setInWishlist(Object obj) {
        this.inWishlist = obj;
    }

    public final void setOrder(String str) {
        this.order = str;
    }

    public final void setOrderCode(String str) {
        this.orderCode = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setOrderStatus(Integer num) {
        this.orderStatus = num;
    }

    public final void setOrderTotalAmount(Double d10) {
        this.orderTotalAmount = d10;
    }

    public final void setPaymentDate(Long l10) {
        this.paymentDate = l10;
    }

    public final void setPaymentStatus(Integer num) {
        this.paymentStatus = num;
    }

    public final void setPlateNumber(String str) {
        this.plateNumber = str;
    }

    public final void setProvinceSymbol(String str) {
        this.provinceSymbol = str;
    }

    public final void setPublishDetailId(String str) {
        this.publishDetailId = str;
    }

    public final void setPublishFromDate(Object obj) {
        this.publishFromDate = obj;
    }

    public final void setPublishToDate(Object obj) {
        this.publishToDate = obj;
    }

    public final void setRegisterFromDate(Long l10) {
        this.registerFromDate = l10;
    }

    public final void setRegisterToDate(Long l10) {
        this.registerToDate = l10;
    }

    public final void setSeries(String str) {
        this.series = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setVehicleType(String str) {
        this.vehicleType = str;
    }

    public final void setWishlistCount(Integer num) {
        this.wishlistCount = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("OrderWaitAuction(auctionDate=");
        q10.append(this.auctionDate);
        q10.append(", auctionFromTime=");
        q10.append(this.auctionFromTime);
        q10.append(", auctionRoomId=");
        q10.append(this.auctionRoomId);
        q10.append(", auctionToTime=");
        q10.append(this.auctionToTime);
        q10.append(", basePrice=");
        q10.append(this.basePrice);
        q10.append(", id=");
        q10.append(this.f19377id);
        q10.append(", inWishlist=");
        q10.append(this.inWishlist);
        q10.append(", isCancel=");
        q10.append(this.isCancel);
        q10.append(", order=");
        q10.append(this.order);
        q10.append(", orderCode=");
        q10.append(this.orderCode);
        q10.append(", orderId=");
        q10.append(this.orderId);
        q10.append(", orderStatus=");
        q10.append(this.orderStatus);
        q10.append(", orderTotalAmount=");
        q10.append(this.orderTotalAmount);
        q10.append(", paymentDate=");
        q10.append(this.paymentDate);
        q10.append(", paymentStatus=");
        q10.append(this.paymentStatus);
        q10.append(", plateNumber=");
        q10.append(this.plateNumber);
        q10.append(", provinceSymbol=");
        q10.append(this.provinceSymbol);
        q10.append(", publishDetailId=");
        q10.append(this.publishDetailId);
        q10.append(", publishFromDate=");
        q10.append(this.publishFromDate);
        q10.append(", publishToDate=");
        q10.append(this.publishToDate);
        q10.append(", registerFromDate=");
        q10.append(this.registerFromDate);
        q10.append(", registerToDate=");
        q10.append(this.registerToDate);
        q10.append(", series=");
        q10.append(this.series);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", vehicleType=");
        q10.append(this.vehicleType);
        q10.append(", wishlistCount=");
        q10.append(this.wishlistCount);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderWaitAuction(java.lang.Long r29, java.lang.Long r30, java.lang.String r31, java.lang.Long r32, java.lang.Double r33, java.lang.String r34, java.lang.Object r35, java.lang.Object r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Integer r40, java.lang.Double r41, java.lang.Long r42, java.lang.Integer r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.Object r47, java.lang.Object r48, java.lang.Long r49, java.lang.Long r50, java.lang.String r51, java.lang.String r52, java.lang.Integer r53, java.lang.String r54, java.lang.Integer r55, int r56, sk.e r57) {
        /*
            r28 = this;
            r0 = r56
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r29
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r30
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r31
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r32
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r33
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r34
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r35
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r36
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r37
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r38
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r39
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r40
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r41
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r42
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r43
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r44
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r45
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r46
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r47
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r48
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r49
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r50
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r51
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r52
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r53
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r54
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r27
            if (r0 == 0) goto L_0x00fc
            r0 = 0
            goto L_0x00fe
        L_0x00fc:
            r0 = r55
        L_0x00fe:
            r29 = r28
            r30 = r1
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r9
            r38 = r10
            r39 = r11
            r40 = r12
            r41 = r13
            r42 = r14
            r43 = r15
            r44 = r2
            r45 = r16
            r46 = r17
            r47 = r18
            r48 = r19
            r49 = r20
            r50 = r21
            r51 = r22
            r52 = r23
            r53 = r24
            r54 = r25
            r55 = r26
            r56 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.OrderWaitAuction.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Double, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, int, sk.e):void");
    }
}
