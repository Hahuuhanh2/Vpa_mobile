package com.vpa.daugia.module.register.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: RegisterAuction.kt */
public final class RegisterAuction {
    @b("bankAccountInfo")
    private Object bankAccountInfo;
    @b("checkoutDate")
    private Long checkoutDate;
    @b("deposit")
    private Double deposit;
    @b("errorCode")
    private String errorCode;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19847id;
    @b("isValid")
    private Object isValid;
    @b("message")
    private String message;
    @b("orderCode")
    private String orderCode;
    @b("orderStatus")
    private Integer orderStatus;
    @b("paymentCode")
    private Object paymentCode;
    @b("paymentDate")
    private Object paymentDate;
    @b("paymentMethod")
    private Object paymentMethod;
    @b("paymentStatus")
    private Integer paymentStatus;
    @b("paymentUrl")
    private Object paymentUrl;
    @b("realTotalAmount")
    private Object realTotalAmount;
    @b("totalAmount")
    private Double totalAmount;
    @b("totalFee")
    private Double totalFee;
    @b("totalItem")
    private Integer totalItem;
    @b("userId")
    private String userId;
    @b("walletInfo")
    private Object walletInfo;

    public RegisterAuction() {
        this((Object) null, (Long) null, (Double) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (Integer) null, (Object) null, (Object) null, (Object) null, (Integer) null, (Object) null, (Object) null, (Double) null, (Double) null, (Integer) null, (String) null, (Object) null, 1048575, (e) null);
    }

    public RegisterAuction(Object obj, Long l10, Double d10, String str, String str2, Object obj2, String str3, String str4, Integer num, Object obj3, Object obj4, Object obj5, Integer num2, Object obj6, Object obj7, Double d11, Double d12, Integer num3, String str5, Object obj8) {
        this.bankAccountInfo = obj;
        this.checkoutDate = l10;
        this.deposit = d10;
        this.errorCode = str;
        this.f19847id = str2;
        this.isValid = obj2;
        this.message = str3;
        this.orderCode = str4;
        this.orderStatus = num;
        this.paymentCode = obj3;
        this.paymentDate = obj4;
        this.paymentMethod = obj5;
        this.paymentStatus = num2;
        this.paymentUrl = obj6;
        this.realTotalAmount = obj7;
        this.totalAmount = d11;
        this.totalFee = d12;
        this.totalItem = num3;
        this.userId = str5;
        this.walletInfo = obj8;
    }

    public static /* synthetic */ RegisterAuction copy$default(RegisterAuction registerAuction, Object obj, Long l10, Double d10, String str, String str2, Object obj2, String str3, String str4, Integer num, Object obj3, Object obj4, Object obj5, Integer num2, Object obj6, Object obj7, Double d11, Double d12, Integer num3, String str5, Object obj8, int i10, Object obj9) {
        RegisterAuction registerAuction2 = registerAuction;
        int i11 = i10;
        return registerAuction.copy((i11 & 1) != 0 ? registerAuction2.bankAccountInfo : obj, (i11 & 2) != 0 ? registerAuction2.checkoutDate : l10, (i11 & 4) != 0 ? registerAuction2.deposit : d10, (i11 & 8) != 0 ? registerAuction2.errorCode : str, (i11 & 16) != 0 ? registerAuction2.f19847id : str2, (i11 & 32) != 0 ? registerAuction2.isValid : obj2, (i11 & 64) != 0 ? registerAuction2.message : str3, (i11 & 128) != 0 ? registerAuction2.orderCode : str4, (i11 & 256) != 0 ? registerAuction2.orderStatus : num, (i11 & 512) != 0 ? registerAuction2.paymentCode : obj3, (i11 & 1024) != 0 ? registerAuction2.paymentDate : obj4, (i11 & 2048) != 0 ? registerAuction2.paymentMethod : obj5, (i11 & 4096) != 0 ? registerAuction2.paymentStatus : num2, (i11 & 8192) != 0 ? registerAuction2.paymentUrl : obj6, (i11 & 16384) != 0 ? registerAuction2.realTotalAmount : obj7, (i11 & 32768) != 0 ? registerAuction2.totalAmount : d11, (i11 & 65536) != 0 ? registerAuction2.totalFee : d12, (i11 & 131072) != 0 ? registerAuction2.totalItem : num3, (i11 & 262144) != 0 ? registerAuction2.userId : str5, (i11 & 524288) != 0 ? registerAuction2.walletInfo : obj8);
    }

    public final Object component1() {
        return this.bankAccountInfo;
    }

    public final Object component10() {
        return this.paymentCode;
    }

    public final Object component11() {
        return this.paymentDate;
    }

    public final Object component12() {
        return this.paymentMethod;
    }

    public final Integer component13() {
        return this.paymentStatus;
    }

    public final Object component14() {
        return this.paymentUrl;
    }

    public final Object component15() {
        return this.realTotalAmount;
    }

    public final Double component16() {
        return this.totalAmount;
    }

    public final Double component17() {
        return this.totalFee;
    }

    public final Integer component18() {
        return this.totalItem;
    }

    public final String component19() {
        return this.userId;
    }

    public final Long component2() {
        return this.checkoutDate;
    }

    public final Object component20() {
        return this.walletInfo;
    }

    public final Double component3() {
        return this.deposit;
    }

    public final String component4() {
        return this.errorCode;
    }

    public final String component5() {
        return this.f19847id;
    }

    public final Object component6() {
        return this.isValid;
    }

    public final String component7() {
        return this.message;
    }

    public final String component8() {
        return this.orderCode;
    }

    public final Integer component9() {
        return this.orderStatus;
    }

    public final RegisterAuction copy(Object obj, Long l10, Double d10, String str, String str2, Object obj2, String str3, String str4, Integer num, Object obj3, Object obj4, Object obj5, Integer num2, Object obj6, Object obj7, Double d11, Double d12, Integer num3, String str5, Object obj8) {
        return new RegisterAuction(obj, l10, d10, str, str2, obj2, str3, str4, num, obj3, obj4, obj5, num2, obj6, obj7, d11, d12, num3, str5, obj8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAuction)) {
            return false;
        }
        RegisterAuction registerAuction = (RegisterAuction) obj;
        return j.a(this.bankAccountInfo, registerAuction.bankAccountInfo) && j.a(this.checkoutDate, registerAuction.checkoutDate) && j.a(this.deposit, registerAuction.deposit) && j.a(this.errorCode, registerAuction.errorCode) && j.a(this.f19847id, registerAuction.f19847id) && j.a(this.isValid, registerAuction.isValid) && j.a(this.message, registerAuction.message) && j.a(this.orderCode, registerAuction.orderCode) && j.a(this.orderStatus, registerAuction.orderStatus) && j.a(this.paymentCode, registerAuction.paymentCode) && j.a(this.paymentDate, registerAuction.paymentDate) && j.a(this.paymentMethod, registerAuction.paymentMethod) && j.a(this.paymentStatus, registerAuction.paymentStatus) && j.a(this.paymentUrl, registerAuction.paymentUrl) && j.a(this.realTotalAmount, registerAuction.realTotalAmount) && j.a(this.totalAmount, registerAuction.totalAmount) && j.a(this.totalFee, registerAuction.totalFee) && j.a(this.totalItem, registerAuction.totalItem) && j.a(this.userId, registerAuction.userId) && j.a(this.walletInfo, registerAuction.walletInfo);
    }

    public final Object getBankAccountInfo() {
        return this.bankAccountInfo;
    }

    public final Long getCheckoutDate() {
        return this.checkoutDate;
    }

    public final Double getDeposit() {
        return this.deposit;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getId() {
        return this.f19847id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOrderCode() {
        return this.orderCode;
    }

    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    public final Object getPaymentCode() {
        return this.paymentCode;
    }

    public final Object getPaymentDate() {
        return this.paymentDate;
    }

    public final Object getPaymentMethod() {
        return this.paymentMethod;
    }

    public final Integer getPaymentStatus() {
        return this.paymentStatus;
    }

    public final Object getPaymentUrl() {
        return this.paymentUrl;
    }

    public final Object getRealTotalAmount() {
        return this.realTotalAmount;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public final Double getTotalFee() {
        return this.totalFee;
    }

    public final Integer getTotalItem() {
        return this.totalItem;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Object getWalletInfo() {
        return this.walletInfo;
    }

    public int hashCode() {
        Object obj = this.bankAccountInfo;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Long l10 = this.checkoutDate;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Double d10 = this.deposit;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.errorCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19847id;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.isValid;
        int hashCode6 = (hashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderCode;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.orderStatus;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj3 = this.paymentCode;
        int hashCode10 = (hashCode9 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.paymentDate;
        int hashCode11 = (hashCode10 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Object obj5 = this.paymentMethod;
        int hashCode12 = (hashCode11 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Integer num2 = this.paymentStatus;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj6 = this.paymentUrl;
        int hashCode14 = (hashCode13 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Object obj7 = this.realTotalAmount;
        int hashCode15 = (hashCode14 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Double d11 = this.totalAmount;
        int hashCode16 = (hashCode15 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.totalFee;
        int hashCode17 = (hashCode16 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Integer num3 = this.totalItem;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.userId;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Object obj8 = this.walletInfo;
        if (obj8 != null) {
            i10 = obj8.hashCode();
        }
        return hashCode19 + i10;
    }

    public final Object isValid() {
        return this.isValid;
    }

    public final void setBankAccountInfo(Object obj) {
        this.bankAccountInfo = obj;
    }

    public final void setCheckoutDate(Long l10) {
        this.checkoutDate = l10;
    }

    public final void setDeposit(Double d10) {
        this.deposit = d10;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setId(String str) {
        this.f19847id = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setOrderCode(String str) {
        this.orderCode = str;
    }

    public final void setOrderStatus(Integer num) {
        this.orderStatus = num;
    }

    public final void setPaymentCode(Object obj) {
        this.paymentCode = obj;
    }

    public final void setPaymentDate(Object obj) {
        this.paymentDate = obj;
    }

    public final void setPaymentMethod(Object obj) {
        this.paymentMethod = obj;
    }

    public final void setPaymentStatus(Integer num) {
        this.paymentStatus = num;
    }

    public final void setPaymentUrl(Object obj) {
        this.paymentUrl = obj;
    }

    public final void setRealTotalAmount(Object obj) {
        this.realTotalAmount = obj;
    }

    public final void setTotalAmount(Double d10) {
        this.totalAmount = d10;
    }

    public final void setTotalFee(Double d10) {
        this.totalFee = d10;
    }

    public final void setTotalItem(Integer num) {
        this.totalItem = num;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setValid(Object obj) {
        this.isValid = obj;
    }

    public final void setWalletInfo(Object obj) {
        this.walletInfo = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("RegisterAuction(bankAccountInfo=");
        q10.append(this.bankAccountInfo);
        q10.append(", checkoutDate=");
        q10.append(this.checkoutDate);
        q10.append(", deposit=");
        q10.append(this.deposit);
        q10.append(", errorCode=");
        q10.append(this.errorCode);
        q10.append(", id=");
        q10.append(this.f19847id);
        q10.append(", isValid=");
        q10.append(this.isValid);
        q10.append(", message=");
        q10.append(this.message);
        q10.append(", orderCode=");
        q10.append(this.orderCode);
        q10.append(", orderStatus=");
        q10.append(this.orderStatus);
        q10.append(", paymentCode=");
        q10.append(this.paymentCode);
        q10.append(", paymentDate=");
        q10.append(this.paymentDate);
        q10.append(", paymentMethod=");
        q10.append(this.paymentMethod);
        q10.append(", paymentStatus=");
        q10.append(this.paymentStatus);
        q10.append(", paymentUrl=");
        q10.append(this.paymentUrl);
        q10.append(", realTotalAmount=");
        q10.append(this.realTotalAmount);
        q10.append(", totalAmount=");
        q10.append(this.totalAmount);
        q10.append(", totalFee=");
        q10.append(this.totalFee);
        q10.append(", totalItem=");
        q10.append(this.totalItem);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", walletInfo=");
        q10.append(this.walletInfo);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterAuction(java.lang.Object r22, java.lang.Long r23, java.lang.Double r24, java.lang.String r25, java.lang.String r26, java.lang.Object r27, java.lang.String r28, java.lang.String r29, java.lang.Integer r30, java.lang.Object r31, java.lang.Object r32, java.lang.Object r33, java.lang.Integer r34, java.lang.Object r35, java.lang.Object r36, java.lang.Double r37, java.lang.Double r38, java.lang.Integer r39, java.lang.String r40, java.lang.Object r41, int r42, sk.e r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r22
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r23
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r24
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r25
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r26
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r27
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r28
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r29
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r30
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r31
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r32
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r33
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r34
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r35
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r36
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r37
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r38
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r39
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r40
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00af
            r0 = 0
            goto L_0x00b1
        L_0x00af:
            r0 = r41
        L_0x00b1:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r2
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.register.data.model.RegisterAuction.<init>(java.lang.Object, java.lang.Long, java.lang.Double, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.Object, int, sk.e):void");
    }
}
