package com.vpa.daugia.module.payment.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: Fee.kt */
public final class Fee {
    @b("confirmPolicy")
    private Integer confirmPolicy;
    @b("deposit")
    private Double deposit;
    @b("fee")
    private Double fee;
    @b("order")
    private String order;
    @b("provinceSymbol")
    private String provinceSymbol;
    @b("quantity")
    private Integer quantity;
    @b("series")
    private String series;
    @b("totalAmount")
    private Double totalAmount;

    public Fee() {
        this((Integer) null, (Double) null, (Double) null, (String) null, (String) null, (Integer) null, (String) null, (Double) null, 255, (e) null);
    }

    public Fee(Integer num, Double d10, Double d11, String str, String str2, Integer num2, String str3, Double d12) {
        this.confirmPolicy = num;
        this.deposit = d10;
        this.fee = d11;
        this.order = str;
        this.provinceSymbol = str2;
        this.quantity = num2;
        this.series = str3;
        this.totalAmount = d12;
    }

    public static /* synthetic */ Fee copy$default(Fee fee2, Integer num, Double d10, Double d11, String str, String str2, Integer num2, String str3, Double d12, int i10, Object obj) {
        Fee fee3 = fee2;
        int i11 = i10;
        return fee2.copy((i11 & 1) != 0 ? fee3.confirmPolicy : num, (i11 & 2) != 0 ? fee3.deposit : d10, (i11 & 4) != 0 ? fee3.fee : d11, (i11 & 8) != 0 ? fee3.order : str, (i11 & 16) != 0 ? fee3.provinceSymbol : str2, (i11 & 32) != 0 ? fee3.quantity : num2, (i11 & 64) != 0 ? fee3.series : str3, (i11 & 128) != 0 ? fee3.totalAmount : d12);
    }

    public final Integer component1() {
        return this.confirmPolicy;
    }

    public final Double component2() {
        return this.deposit;
    }

    public final Double component3() {
        return this.fee;
    }

    public final String component4() {
        return this.order;
    }

    public final String component5() {
        return this.provinceSymbol;
    }

    public final Integer component6() {
        return this.quantity;
    }

    public final String component7() {
        return this.series;
    }

    public final Double component8() {
        return this.totalAmount;
    }

    public final Fee copy(Integer num, Double d10, Double d11, String str, String str2, Integer num2, String str3, Double d12) {
        return new Fee(num, d10, d11, str, str2, num2, str3, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fee)) {
            return false;
        }
        Fee fee2 = (Fee) obj;
        return j.a(this.confirmPolicy, fee2.confirmPolicy) && j.a(this.deposit, fee2.deposit) && j.a(this.fee, fee2.fee) && j.a(this.order, fee2.order) && j.a(this.provinceSymbol, fee2.provinceSymbol) && j.a(this.quantity, fee2.quantity) && j.a(this.series, fee2.series) && j.a(this.totalAmount, fee2.totalAmount);
    }

    public final Integer getConfirmPolicy() {
        return this.confirmPolicy;
    }

    public final Double getDeposit() {
        return this.deposit;
    }

    public final Double getFee() {
        return this.fee;
    }

    public final String getOrder() {
        return this.order;
    }

    public final String getProvinceSymbol() {
        return this.provinceSymbol;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSeries() {
        return this.series;
    }

    public final Double getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        Integer num = this.confirmPolicy;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d10 = this.deposit;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.fee;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.order;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.provinceSymbol;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.quantity;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.series;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d12 = this.totalAmount;
        if (d12 != null) {
            i10 = d12.hashCode();
        }
        return hashCode7 + i10;
    }

    public final void setConfirmPolicy(Integer num) {
        this.confirmPolicy = num;
    }

    public final void setDeposit(Double d10) {
        this.deposit = d10;
    }

    public final void setFee(Double d10) {
        this.fee = d10;
    }

    public final void setOrder(String str) {
        this.order = str;
    }

    public final void setProvinceSymbol(String str) {
        this.provinceSymbol = str;
    }

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }

    public final void setSeries(String str) {
        this.series = str;
    }

    public final void setTotalAmount(Double d10) {
        this.totalAmount = d10;
    }

    public String toString() {
        StringBuilder q10 = a.q("Fee(confirmPolicy=");
        q10.append(this.confirmPolicy);
        q10.append(", deposit=");
        q10.append(this.deposit);
        q10.append(", fee=");
        q10.append(this.fee);
        q10.append(", order=");
        q10.append(this.order);
        q10.append(", provinceSymbol=");
        q10.append(this.provinceSymbol);
        q10.append(", quantity=");
        q10.append(this.quantity);
        q10.append(", series=");
        q10.append(this.series);
        q10.append(", totalAmount=");
        q10.append(this.totalAmount);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Fee(java.lang.Integer r10, java.lang.Double r11, java.lang.Double r12, java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.String r16, java.lang.Double r17, int r18, sk.e r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.payment.data.model.Fee.<init>(java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Double, int, sk.e):void");
    }
}
