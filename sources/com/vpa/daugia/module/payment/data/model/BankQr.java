package com.vpa.daugia.module.payment.data.model;

import android.support.v4.media.a;
import cc.b;
import f0.b0;
import java.text.NumberFormat;
import java.util.Locale;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: BankQr.kt */
public final class BankQr {
    @b("bankAccount")
    private String bankAccount;
    @b("bankName")
    private String bankName;
    @b("endcodeImageQr")
    private Object endcodeImageQr;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19788id;
    @b("name")
    private String name;
    @b("paymentType")
    private String paymentType;
    @b("qrCode")
    private String qrCode;
    @b("thumbnail")
    private String thumbnail;
    @b("totalMoney")
    private Long totalMoney;
    @b("transferContent")
    private String transferContent;
    @b("uniqueCode")
    private String uniqueCode;

    public BankQr() {
        this((String) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, 2047, (e) null);
    }

    public BankQr(String str, String str2, Object obj, String str3, String str4, String str5, String str6, String str7, Long l10, String str8, String str9) {
        this.bankAccount = str;
        this.bankName = str2;
        this.endcodeImageQr = obj;
        this.f19788id = str3;
        this.name = str4;
        this.paymentType = str5;
        this.qrCode = str6;
        this.thumbnail = str7;
        this.totalMoney = l10;
        this.transferContent = str8;
        this.uniqueCode = str9;
    }

    public static /* synthetic */ BankQr copy$default(BankQr bankQr, String str, String str2, Object obj, String str3, String str4, String str5, String str6, String str7, Long l10, String str8, String str9, int i10, Object obj2) {
        BankQr bankQr2 = bankQr;
        int i11 = i10;
        return bankQr.copy((i11 & 1) != 0 ? bankQr2.bankAccount : str, (i11 & 2) != 0 ? bankQr2.bankName : str2, (i11 & 4) != 0 ? bankQr2.endcodeImageQr : obj, (i11 & 8) != 0 ? bankQr2.f19788id : str3, (i11 & 16) != 0 ? bankQr2.name : str4, (i11 & 32) != 0 ? bankQr2.paymentType : str5, (i11 & 64) != 0 ? bankQr2.qrCode : str6, (i11 & 128) != 0 ? bankQr2.thumbnail : str7, (i11 & 256) != 0 ? bankQr2.totalMoney : l10, (i11 & 512) != 0 ? bankQr2.transferContent : str8, (i11 & 1024) != 0 ? bankQr2.uniqueCode : str9);
    }

    public final String component1() {
        return this.bankAccount;
    }

    public final String component10() {
        return this.transferContent;
    }

    public final String component11() {
        return this.uniqueCode;
    }

    public final String component2() {
        return this.bankName;
    }

    public final Object component3() {
        return this.endcodeImageQr;
    }

    public final String component4() {
        return this.f19788id;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.paymentType;
    }

    public final String component7() {
        return this.qrCode;
    }

    public final String component8() {
        return this.thumbnail;
    }

    public final Long component9() {
        return this.totalMoney;
    }

    public final BankQr copy(String str, String str2, Object obj, String str3, String str4, String str5, String str6, String str7, Long l10, String str8, String str9) {
        return new BankQr(str, str2, obj, str3, str4, str5, str6, str7, l10, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankQr)) {
            return false;
        }
        BankQr bankQr = (BankQr) obj;
        return j.a(this.bankAccount, bankQr.bankAccount) && j.a(this.bankName, bankQr.bankName) && j.a(this.endcodeImageQr, bankQr.endcodeImageQr) && j.a(this.f19788id, bankQr.f19788id) && j.a(this.name, bankQr.name) && j.a(this.paymentType, bankQr.paymentType) && j.a(this.qrCode, bankQr.qrCode) && j.a(this.thumbnail, bankQr.thumbnail) && j.a(this.totalMoney, bankQr.totalMoney) && j.a(this.transferContent, bankQr.transferContent) && j.a(this.uniqueCode, bankQr.uniqueCode);
    }

    public final String getBankAccount() {
        return this.bankAccount;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final Object getEndcodeImageQr() {
        return this.endcodeImageQr;
    }

    public final String getId() {
        return this.f19788id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTotal() {
        Long l10 = this.totalMoney;
        if (l10 == null) {
            return null;
        }
        return b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), l10.longValue(), new StringBuilder(), " đ");
    }

    public final Long getTotalMoney() {
        return this.totalMoney;
    }

    public final String getTransferContent() {
        return this.transferContent;
    }

    public final String getUniqueCode() {
        return this.uniqueCode;
    }

    public int hashCode() {
        String str = this.bankAccount;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.endcodeImageQr;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.f19788id;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qrCode;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.thumbnail;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l10 = this.totalMoney;
        int hashCode9 = (hashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str8 = this.transferContent;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.uniqueCode;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode10 + i10;
    }

    public final void setBankAccount(String str) {
        this.bankAccount = str;
    }

    public final void setBankName(String str) {
        this.bankName = str;
    }

    public final void setEndcodeImageQr(Object obj) {
        this.endcodeImageQr = obj;
    }

    public final void setId(String str) {
        this.f19788id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPaymentType(String str) {
        this.paymentType = str;
    }

    public final void setQrCode(String str) {
        this.qrCode = str;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final void setTotalMoney(Long l10) {
        this.totalMoney = l10;
    }

    public final void setTransferContent(String str) {
        this.transferContent = str;
    }

    public final void setUniqueCode(String str) {
        this.uniqueCode = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("BankQr(bankAccount=");
        q10.append(this.bankAccount);
        q10.append(", bankName=");
        q10.append(this.bankName);
        q10.append(", endcodeImageQr=");
        q10.append(this.endcodeImageQr);
        q10.append(", id=");
        q10.append(this.f19788id);
        q10.append(", name=");
        q10.append(this.name);
        q10.append(", paymentType=");
        q10.append(this.paymentType);
        q10.append(", qrCode=");
        q10.append(this.qrCode);
        q10.append(", thumbnail=");
        q10.append(this.thumbnail);
        q10.append(", totalMoney=");
        q10.append(this.totalMoney);
        q10.append(", transferContent=");
        q10.append(this.transferContent);
        q10.append(", uniqueCode=");
        return l.k(q10, this.uniqueCode, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BankQr(java.lang.String r13, java.lang.String r14, java.lang.Object r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Long r21, java.lang.String r22, java.lang.String r23, int r24, sk.e r25) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.payment.data.model.BankQr.<init>(java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
