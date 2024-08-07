package com.vpa.daugia.module.cart.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: Cart.kt */
public final class Cart implements Serializable {
    @b("auctionDate")
    private Long auctionDate;
    @b("auctionFromTime")
    private Long auctionFromTime;
    @b("auctionToTime")
    private Long auctionToTime;
    @b("dueDate")
    private Long dueDate;
    @b("orderCode")
    private String orderCode;
    @b("orderId")
    private String orderId;
    @b("paymentDate")
    private Long paymentDate;
    @b("paymentStatus")
    private Integer paymentStatus;
    @b("plateNumber")
    private String plateNumber;
    @b("quantity")
    private Integer quantity;
    @b("requestRefundStatus")
    private Integer requestRefundStatus;
    @b("totalAmount")
    private Double totalAmount;

    public Cart() {
        this((Long) null, (Long) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Double) null, 4095, (e) null);
    }

    public Cart(Long l10, Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Integer num2, Integer num3, Double d10) {
        this.auctionFromTime = l10;
        this.auctionToTime = l11;
        this.dueDate = l12;
        this.orderCode = str;
        this.orderId = str2;
        this.paymentDate = l13;
        this.auctionDate = l14;
        this.paymentStatus = num;
        this.plateNumber = str3;
        this.quantity = num2;
        this.requestRefundStatus = num3;
        this.totalAmount = d10;
    }

    public static /* synthetic */ Cart copy$default(Cart cart, Long l10, Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Integer num2, Integer num3, Double d10, int i10, Object obj) {
        Cart cart2 = cart;
        int i11 = i10;
        return cart.copy((i11 & 1) != 0 ? cart2.auctionFromTime : l10, (i11 & 2) != 0 ? cart2.auctionToTime : l11, (i11 & 4) != 0 ? cart2.dueDate : l12, (i11 & 8) != 0 ? cart2.orderCode : str, (i11 & 16) != 0 ? cart2.orderId : str2, (i11 & 32) != 0 ? cart2.paymentDate : l13, (i11 & 64) != 0 ? cart2.auctionDate : l14, (i11 & 128) != 0 ? cart2.paymentStatus : num, (i11 & 256) != 0 ? cart2.plateNumber : str3, (i11 & 512) != 0 ? cart2.quantity : num2, (i11 & 1024) != 0 ? cart2.requestRefundStatus : num3, (i11 & 2048) != 0 ? cart2.totalAmount : d10);
    }

    public final Long component1() {
        return this.auctionFromTime;
    }

    public final Integer component10() {
        return this.quantity;
    }

    public final Integer component11() {
        return this.requestRefundStatus;
    }

    public final Double component12() {
        return this.totalAmount;
    }

    public final Long component2() {
        return this.auctionToTime;
    }

    public final Long component3() {
        return this.dueDate;
    }

    public final String component4() {
        return this.orderCode;
    }

    public final String component5() {
        return this.orderId;
    }

    public final Long component6() {
        return this.paymentDate;
    }

    public final Long component7() {
        return this.auctionDate;
    }

    public final Integer component8() {
        return this.paymentStatus;
    }

    public final String component9() {
        return this.plateNumber;
    }

    public final Cart copy(Long l10, Long l11, Long l12, String str, String str2, Long l13, Long l14, Integer num, String str3, Integer num2, Integer num3, Double d10) {
        return new Cart(l10, l11, l12, str, str2, l13, l14, num, str3, num2, num3, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) obj;
        return j.a(this.auctionFromTime, cart.auctionFromTime) && j.a(this.auctionToTime, cart.auctionToTime) && j.a(this.dueDate, cart.dueDate) && j.a(this.orderCode, cart.orderCode) && j.a(this.orderId, cart.orderId) && j.a(this.paymentDate, cart.paymentDate) && j.a(this.auctionDate, cart.auctionDate) && j.a(this.paymentStatus, cart.paymentStatus) && j.a(this.plateNumber, cart.plateNumber) && j.a(this.quantity, cart.quantity) && j.a(this.requestRefundStatus, cart.requestRefundStatus) && j.a(this.totalAmount, cart.totalAmount);
    }

    public final Long getAuctionDate() {
        return this.auctionDate;
    }

    public final Long getAuctionFromTime() {
        return this.auctionFromTime;
    }

    public final Long getAuctionToTime() {
        return this.auctionToTime;
    }

    public final Long getDueDate() {
        return this.dueDate;
    }

    public final String getOrderCode() {
        return this.orderCode;
    }

    public final String getOrderId() {
        return this.orderId;
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

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Integer getRequestRefundStatus() {
        return this.requestRefundStatus;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        Long l10 = this.auctionFromTime;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.auctionToTime;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.dueDate;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.orderCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l13 = this.paymentDate;
        int hashCode6 = (hashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.auctionDate;
        int hashCode7 = (hashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.paymentStatus;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.plateNumber;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.quantity;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.requestRefundStatus;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d10 = this.totalAmount;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode11 + i10;
    }

    public final void setAuctionDate(Long l10) {
        this.auctionDate = l10;
    }

    public final void setAuctionFromTime(Long l10) {
        this.auctionFromTime = l10;
    }

    public final void setAuctionToTime(Long l10) {
        this.auctionToTime = l10;
    }

    public final void setDueDate(Long l10) {
        this.dueDate = l10;
    }

    public final void setOrderCode(String str) {
        this.orderCode = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
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

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }

    public final void setRequestRefundStatus(Integer num) {
        this.requestRefundStatus = num;
    }

    public final void setTotalAmount(Double d10) {
        this.totalAmount = d10;
    }

    public String toString() {
        StringBuilder q10 = a.q("Cart(auctionFromTime=");
        q10.append(this.auctionFromTime);
        q10.append(", auctionToTime=");
        q10.append(this.auctionToTime);
        q10.append(", dueDate=");
        q10.append(this.dueDate);
        q10.append(", orderCode=");
        q10.append(this.orderCode);
        q10.append(", orderId=");
        q10.append(this.orderId);
        q10.append(", paymentDate=");
        q10.append(this.paymentDate);
        q10.append(", auctionDate=");
        q10.append(this.auctionDate);
        q10.append(", paymentStatus=");
        q10.append(this.paymentStatus);
        q10.append(", plateNumber=");
        q10.append(this.plateNumber);
        q10.append(", quantity=");
        q10.append(this.quantity);
        q10.append(", requestRefundStatus=");
        q10.append(this.requestRefundStatus);
        q10.append(", totalAmount=");
        q10.append(this.totalAmount);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Cart(java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.Long r19, java.lang.Long r20, java.lang.Integer r21, java.lang.String r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Double r25, int r26, sk.e r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            r12 = r2
            goto L_0x0059
        L_0x0057:
            r12 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = r25
        L_0x0060:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.cart.data.model.Cart.<init>(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Double, int, sk.e):void");
    }
}
