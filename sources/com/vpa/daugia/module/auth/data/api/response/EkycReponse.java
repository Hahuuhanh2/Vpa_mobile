package com.vpa.daugia.module.auth.data.api.response;

import android.support.v4.media.a;
import cc.b;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: EkycReponse.kt */
public final class EkycReponse {
    @b("address")
    private String address;
    @b("districtId")
    private String districtId;
    @b("errorCode")
    private String errorCode;
    @b("errorMessage")
    private String errorMessage;
    @b("frontOfIdentityCard")
    private ContactPersonIdentityCard frontOfIdentityCard;
    @b("fullname")
    private String fullname;
    @b("identityNumber")
    private String identityNumber;
    @b("personIssuanceDate")
    private Long personIssuanceDate;
    @b("personIssuancePlace")
    private String personIssuancePlace;
    @b("provinceId")
    private String provinceId;
    @b("wardId")
    private String wardId;

    public EkycReponse() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, (String) null, 2047, (e) null);
    }

    public EkycReponse(String str, String str2, String str3, String str4, Long l10, String str5, String str6, String str7, ContactPersonIdentityCard contactPersonIdentityCard, String str8, String str9) {
        this.address = str;
        this.districtId = str2;
        this.fullname = str3;
        this.identityNumber = str4;
        this.personIssuanceDate = l10;
        this.personIssuancePlace = str5;
        this.provinceId = str6;
        this.wardId = str7;
        this.frontOfIdentityCard = contactPersonIdentityCard;
        this.errorCode = str8;
        this.errorMessage = str9;
    }

    public static /* synthetic */ EkycReponse copy$default(EkycReponse ekycReponse, String str, String str2, String str3, String str4, Long l10, String str5, String str6, String str7, ContactPersonIdentityCard contactPersonIdentityCard, String str8, String str9, int i10, Object obj) {
        EkycReponse ekycReponse2 = ekycReponse;
        int i11 = i10;
        return ekycReponse.copy((i11 & 1) != 0 ? ekycReponse2.address : str, (i11 & 2) != 0 ? ekycReponse2.districtId : str2, (i11 & 4) != 0 ? ekycReponse2.fullname : str3, (i11 & 8) != 0 ? ekycReponse2.identityNumber : str4, (i11 & 16) != 0 ? ekycReponse2.personIssuanceDate : l10, (i11 & 32) != 0 ? ekycReponse2.personIssuancePlace : str5, (i11 & 64) != 0 ? ekycReponse2.provinceId : str6, (i11 & 128) != 0 ? ekycReponse2.wardId : str7, (i11 & 256) != 0 ? ekycReponse2.frontOfIdentityCard : contactPersonIdentityCard, (i11 & 512) != 0 ? ekycReponse2.errorCode : str8, (i11 & 1024) != 0 ? ekycReponse2.errorMessage : str9);
    }

    public final String component1() {
        return this.address;
    }

    public final String component10() {
        return this.errorCode;
    }

    public final String component11() {
        return this.errorMessage;
    }

    public final String component2() {
        return this.districtId;
    }

    public final String component3() {
        return this.fullname;
    }

    public final String component4() {
        return this.identityNumber;
    }

    public final Long component5() {
        return this.personIssuanceDate;
    }

    public final String component6() {
        return this.personIssuancePlace;
    }

    public final String component7() {
        return this.provinceId;
    }

    public final String component8() {
        return this.wardId;
    }

    public final ContactPersonIdentityCard component9() {
        return this.frontOfIdentityCard;
    }

    public final EkycReponse copy(String str, String str2, String str3, String str4, Long l10, String str5, String str6, String str7, ContactPersonIdentityCard contactPersonIdentityCard, String str8, String str9) {
        return new EkycReponse(str, str2, str3, str4, l10, str5, str6, str7, contactPersonIdentityCard, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EkycReponse)) {
            return false;
        }
        EkycReponse ekycReponse = (EkycReponse) obj;
        return j.a(this.address, ekycReponse.address) && j.a(this.districtId, ekycReponse.districtId) && j.a(this.fullname, ekycReponse.fullname) && j.a(this.identityNumber, ekycReponse.identityNumber) && j.a(this.personIssuanceDate, ekycReponse.personIssuanceDate) && j.a(this.personIssuancePlace, ekycReponse.personIssuancePlace) && j.a(this.provinceId, ekycReponse.provinceId) && j.a(this.wardId, ekycReponse.wardId) && j.a(this.frontOfIdentityCard, ekycReponse.frontOfIdentityCard) && j.a(this.errorCode, ekycReponse.errorCode) && j.a(this.errorMessage, ekycReponse.errorMessage);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getDistrictId() {
        return this.districtId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ContactPersonIdentityCard getFrontOfIdentityCard() {
        return this.frontOfIdentityCard;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final Long getPersonIssuanceDate() {
        return this.personIssuanceDate;
    }

    public final String getPersonIssuancePlace() {
        return this.personIssuancePlace;
    }

    public final String getProvinceId() {
        return this.provinceId;
    }

    public final String getWardId() {
        return this.wardId;
    }

    public int hashCode() {
        String str = this.address;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.districtId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullname;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identityNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.personIssuanceDate;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str5 = this.personIssuancePlace;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.provinceId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.wardId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard = this.frontOfIdentityCard;
        int hashCode9 = (hashCode8 + (contactPersonIdentityCard == null ? 0 : contactPersonIdentityCard.hashCode())) * 31;
        String str8 = this.errorCode;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.errorMessage;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return hashCode10 + i10;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setDistrictId(String str) {
        this.districtId = str;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setFrontOfIdentityCard(ContactPersonIdentityCard contactPersonIdentityCard) {
        this.frontOfIdentityCard = contactPersonIdentityCard;
    }

    public final void setFullname(String str) {
        this.fullname = str;
    }

    public final void setIdentityNumber(String str) {
        this.identityNumber = str;
    }

    public final void setPersonIssuanceDate(Long l10) {
        this.personIssuanceDate = l10;
    }

    public final void setPersonIssuancePlace(String str) {
        this.personIssuancePlace = str;
    }

    public final void setProvinceId(String str) {
        this.provinceId = str;
    }

    public final void setWardId(String str) {
        this.wardId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("EkycReponse(address=");
        q10.append(this.address);
        q10.append(", districtId=");
        q10.append(this.districtId);
        q10.append(", fullname=");
        q10.append(this.fullname);
        q10.append(", identityNumber=");
        q10.append(this.identityNumber);
        q10.append(", personIssuanceDate=");
        q10.append(this.personIssuanceDate);
        q10.append(", personIssuancePlace=");
        q10.append(this.personIssuancePlace);
        q10.append(", provinceId=");
        q10.append(this.provinceId);
        q10.append(", wardId=");
        q10.append(this.wardId);
        q10.append(", frontOfIdentityCard=");
        q10.append(this.frontOfIdentityCard);
        q10.append(", errorCode=");
        q10.append(this.errorCode);
        q10.append(", errorMessage=");
        return l.k(q10, this.errorMessage, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EkycReponse(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r21, java.lang.String r22, java.lang.String r23, int r24, sk.e r25) {
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
            if (r10 == 0) goto L_0x004b
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r11 = 1
            r10.<init>(r2, r11, r2)
            goto L_0x004d
        L_0x004b:
            r10 = r21
        L_0x004d:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0053
            r11 = r2
            goto L_0x0055
        L_0x0053:
            r11 = r22
        L_0x0055:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r2 = r23
        L_0x005c:
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.response.EkycReponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
