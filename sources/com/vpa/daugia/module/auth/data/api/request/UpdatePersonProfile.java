package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: UpdatePersonProfile.kt */
public final class UpdatePersonProfile {
    @b("address")
    private String address;
    @b("bank")
    private String bank;
    @b("bankAccount")
    private String bankAccount;
    @b("bankAccountOwner")
    private String bankAccountOwner;
    @b("contactPersonIdentityCard")
    private ContactPersonIdentityCard contactPersonIdentityCard;
    @b("districtId")
    private String districtId;
    @b("email")
    private String email;
    @b("fcmToken")
    private String fcmToken;
    @b("frontOfIdentityCard")
    private ContactPersonIdentityCard frontOfIdentityCard;
    @b("fullname")
    private String fullname;
    @b("identityNumber")
    private String identityNumber;
    @b("password")
    private String password;
    @b("personIssuanceDate")
    private Long personIssuanceDate;
    @b("personIssuancePlace")
    private String personIssuancePlace;
    @b("phone")
    private String phone;
    @b("phoneVerificationCode")
    private String phoneVerificationCode;
    @b("provinceId")
    private String provinceId;
    @b("rePass")
    private String rePass;
    @b("vneidPlaceOfResidence")
    private ContactPersonIdentityCard vneidPlaceOfResidence;
    @b("wardId")
    private String wardId;

    public UpdatePersonProfile() {
        this((String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1048575, (e) null);
    }

    public UpdatePersonProfile(String str, String str2, String str3, ContactPersonIdentityCard contactPersonIdentityCard2, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str6, String str7, Long l10, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.bank = str;
        this.bankAccount = str2;
        this.bankAccountOwner = str3;
        this.contactPersonIdentityCard = contactPersonIdentityCard2;
        this.districtId = str4;
        this.email = str5;
        this.frontOfIdentityCard = contactPersonIdentityCard3;
        this.vneidPlaceOfResidence = contactPersonIdentityCard4;
        this.fullname = str6;
        this.identityNumber = str7;
        this.personIssuanceDate = l10;
        this.personIssuancePlace = str8;
        this.phone = str9;
        this.provinceId = str10;
        this.wardId = str11;
        this.address = str12;
        this.phoneVerificationCode = str13;
        this.password = str14;
        this.rePass = str15;
        this.fcmToken = str16;
    }

    public static /* synthetic */ UpdatePersonProfile copy$default(UpdatePersonProfile updatePersonProfile, String str, String str2, String str3, ContactPersonIdentityCard contactPersonIdentityCard2, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str6, String str7, Long l10, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i10, Object obj) {
        UpdatePersonProfile updatePersonProfile2 = updatePersonProfile;
        int i11 = i10;
        return updatePersonProfile.copy((i11 & 1) != 0 ? updatePersonProfile2.bank : str, (i11 & 2) != 0 ? updatePersonProfile2.bankAccount : str2, (i11 & 4) != 0 ? updatePersonProfile2.bankAccountOwner : str3, (i11 & 8) != 0 ? updatePersonProfile2.contactPersonIdentityCard : contactPersonIdentityCard2, (i11 & 16) != 0 ? updatePersonProfile2.districtId : str4, (i11 & 32) != 0 ? updatePersonProfile2.email : str5, (i11 & 64) != 0 ? updatePersonProfile2.frontOfIdentityCard : contactPersonIdentityCard3, (i11 & 128) != 0 ? updatePersonProfile2.vneidPlaceOfResidence : contactPersonIdentityCard4, (i11 & 256) != 0 ? updatePersonProfile2.fullname : str6, (i11 & 512) != 0 ? updatePersonProfile2.identityNumber : str7, (i11 & 1024) != 0 ? updatePersonProfile2.personIssuanceDate : l10, (i11 & 2048) != 0 ? updatePersonProfile2.personIssuancePlace : str8, (i11 & 4096) != 0 ? updatePersonProfile2.phone : str9, (i11 & 8192) != 0 ? updatePersonProfile2.provinceId : str10, (i11 & 16384) != 0 ? updatePersonProfile2.wardId : str11, (i11 & 32768) != 0 ? updatePersonProfile2.address : str12, (i11 & 65536) != 0 ? updatePersonProfile2.phoneVerificationCode : str13, (i11 & 131072) != 0 ? updatePersonProfile2.password : str14, (i11 & 262144) != 0 ? updatePersonProfile2.rePass : str15, (i11 & 524288) != 0 ? updatePersonProfile2.fcmToken : str16);
    }

    public final String component1() {
        return this.bank;
    }

    public final String component10() {
        return this.identityNumber;
    }

    public final Long component11() {
        return this.personIssuanceDate;
    }

    public final String component12() {
        return this.personIssuancePlace;
    }

    public final String component13() {
        return this.phone;
    }

    public final String component14() {
        return this.provinceId;
    }

    public final String component15() {
        return this.wardId;
    }

    public final String component16() {
        return this.address;
    }

    public final String component17() {
        return this.phoneVerificationCode;
    }

    public final String component18() {
        return this.password;
    }

    public final String component19() {
        return this.rePass;
    }

    public final String component2() {
        return this.bankAccount;
    }

    public final String component20() {
        return this.fcmToken;
    }

    public final String component3() {
        return this.bankAccountOwner;
    }

    public final ContactPersonIdentityCard component4() {
        return this.contactPersonIdentityCard;
    }

    public final String component5() {
        return this.districtId;
    }

    public final String component6() {
        return this.email;
    }

    public final ContactPersonIdentityCard component7() {
        return this.frontOfIdentityCard;
    }

    public final ContactPersonIdentityCard component8() {
        return this.vneidPlaceOfResidence;
    }

    public final String component9() {
        return this.fullname;
    }

    public final UpdatePersonProfile copy(String str, String str2, String str3, ContactPersonIdentityCard contactPersonIdentityCard2, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str6, String str7, Long l10, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        return new UpdatePersonProfile(str, str2, str3, contactPersonIdentityCard2, str4, str5, contactPersonIdentityCard3, contactPersonIdentityCard4, str6, str7, l10, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePersonProfile)) {
            return false;
        }
        UpdatePersonProfile updatePersonProfile = (UpdatePersonProfile) obj;
        return j.a(this.bank, updatePersonProfile.bank) && j.a(this.bankAccount, updatePersonProfile.bankAccount) && j.a(this.bankAccountOwner, updatePersonProfile.bankAccountOwner) && j.a(this.contactPersonIdentityCard, updatePersonProfile.contactPersonIdentityCard) && j.a(this.districtId, updatePersonProfile.districtId) && j.a(this.email, updatePersonProfile.email) && j.a(this.frontOfIdentityCard, updatePersonProfile.frontOfIdentityCard) && j.a(this.vneidPlaceOfResidence, updatePersonProfile.vneidPlaceOfResidence) && j.a(this.fullname, updatePersonProfile.fullname) && j.a(this.identityNumber, updatePersonProfile.identityNumber) && j.a(this.personIssuanceDate, updatePersonProfile.personIssuanceDate) && j.a(this.personIssuancePlace, updatePersonProfile.personIssuancePlace) && j.a(this.phone, updatePersonProfile.phone) && j.a(this.provinceId, updatePersonProfile.provinceId) && j.a(this.wardId, updatePersonProfile.wardId) && j.a(this.address, updatePersonProfile.address) && j.a(this.phoneVerificationCode, updatePersonProfile.phoneVerificationCode) && j.a(this.password, updatePersonProfile.password) && j.a(this.rePass, updatePersonProfile.rePass) && j.a(this.fcmToken, updatePersonProfile.fcmToken);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBank() {
        return this.bank;
    }

    public final String getBankAccount() {
        return this.bankAccount;
    }

    public final String getBankAccountOwner() {
        return this.bankAccountOwner;
    }

    public final ContactPersonIdentityCard getContactPersonIdentityCard() {
        return this.contactPersonIdentityCard;
    }

    public final String getDistrictId() {
        return this.districtId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFcmToken() {
        return this.fcmToken;
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

    public final String getPassword() {
        return this.password;
    }

    public final Long getPersonIssuanceDate() {
        return this.personIssuanceDate;
    }

    public final String getPersonIssuancePlace() {
        return this.personIssuancePlace;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneVerificationCode() {
        return this.phoneVerificationCode;
    }

    public final String getProvinceId() {
        return this.provinceId;
    }

    public final String getRePass() {
        return this.rePass;
    }

    public final ContactPersonIdentityCard getVneidPlaceOfResidence() {
        return this.vneidPlaceOfResidence;
    }

    public final String getWardId() {
        return this.wardId;
    }

    public int hashCode() {
        String str = this.bank;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankAccount;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankAccountOwner;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard2 = this.contactPersonIdentityCard;
        int hashCode4 = (hashCode3 + (contactPersonIdentityCard2 == null ? 0 : contactPersonIdentityCard2.hashCode())) * 31;
        String str4 = this.districtId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard3 = this.frontOfIdentityCard;
        int hashCode7 = (hashCode6 + (contactPersonIdentityCard3 == null ? 0 : contactPersonIdentityCard3.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard4 = this.vneidPlaceOfResidence;
        int hashCode8 = (hashCode7 + (contactPersonIdentityCard4 == null ? 0 : contactPersonIdentityCard4.hashCode())) * 31;
        String str6 = this.fullname;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.identityNumber;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l10 = this.personIssuanceDate;
        int hashCode11 = (hashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str8 = this.personIssuancePlace;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phone;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.provinceId;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.wardId;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.address;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.phoneVerificationCode;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.password;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rePass;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.fcmToken;
        if (str16 != null) {
            i10 = str16.hashCode();
        }
        return hashCode19 + i10;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setBank(String str) {
        this.bank = str;
    }

    public final void setBankAccount(String str) {
        this.bankAccount = str;
    }

    public final void setBankAccountOwner(String str) {
        this.bankAccountOwner = str;
    }

    public final void setContactPersonIdentityCard(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.contactPersonIdentityCard = contactPersonIdentityCard2;
    }

    public final void setDistrictId(String str) {
        this.districtId = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFcmToken(String str) {
        this.fcmToken = str;
    }

    public final void setFrontOfIdentityCard(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.frontOfIdentityCard = contactPersonIdentityCard2;
    }

    public final void setFullname(String str) {
        this.fullname = str;
    }

    public final void setIdentityNumber(String str) {
        this.identityNumber = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPersonIssuanceDate(Long l10) {
        this.personIssuanceDate = l10;
    }

    public final void setPersonIssuancePlace(String str) {
        this.personIssuancePlace = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneVerificationCode(String str) {
        this.phoneVerificationCode = str;
    }

    public final void setProvinceId(String str) {
        this.provinceId = str;
    }

    public final void setRePass(String str) {
        this.rePass = str;
    }

    public final void setVneidPlaceOfResidence(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.vneidPlaceOfResidence = contactPersonIdentityCard2;
    }

    public final void setWardId(String str) {
        this.wardId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("UpdatePersonProfile(bank=");
        q10.append(this.bank);
        q10.append(", bankAccount=");
        q10.append(this.bankAccount);
        q10.append(", bankAccountOwner=");
        q10.append(this.bankAccountOwner);
        q10.append(", contactPersonIdentityCard=");
        q10.append(this.contactPersonIdentityCard);
        q10.append(", districtId=");
        q10.append(this.districtId);
        q10.append(", email=");
        q10.append(this.email);
        q10.append(", frontOfIdentityCard=");
        q10.append(this.frontOfIdentityCard);
        q10.append(", vneidPlaceOfResidence=");
        q10.append(this.vneidPlaceOfResidence);
        q10.append(", fullname=");
        q10.append(this.fullname);
        q10.append(", identityNumber=");
        q10.append(this.identityNumber);
        q10.append(", personIssuanceDate=");
        q10.append(this.personIssuanceDate);
        q10.append(", personIssuancePlace=");
        q10.append(this.personIssuancePlace);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", provinceId=");
        q10.append(this.provinceId);
        q10.append(", wardId=");
        q10.append(this.wardId);
        q10.append(", address=");
        q10.append(this.address);
        q10.append(", phoneVerificationCode=");
        q10.append(this.phoneVerificationCode);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", rePass=");
        q10.append(this.rePass);
        q10.append(", fcmToken=");
        return l.k(q10, this.fcmToken, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpdatePersonProfile(java.lang.String r22, java.lang.String r23, java.lang.String r24, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r25, java.lang.String r26, java.lang.String r27, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r28, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r29, java.lang.String r30, java.lang.String r31, java.lang.Long r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, sk.e r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r22
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r23
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r24
        L_0x001b:
            r5 = r0 & 8
            r6 = 1
            if (r5 == 0) goto L_0x0026
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r5 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r5.<init>(r2, r6, r2)
            goto L_0x0028
        L_0x0026:
            r5 = r25
        L_0x0028:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r26
        L_0x0030:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r27
        L_0x0038:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0042
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r9 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r9.<init>(r2, r6, r2)
            goto L_0x0044
        L_0x0042:
            r9 = r28
        L_0x0044:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004e
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r10 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r10.<init>(r2, r6, r2)
            goto L_0x0050
        L_0x004e:
            r10 = r29
        L_0x0050:
            r6 = r0 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0056
            r6 = r2
            goto L_0x0058
        L_0x0056:
            r6 = r30
        L_0x0058:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005e
            r11 = r2
            goto L_0x0060
        L_0x005e:
            r11 = r31
        L_0x0060:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0066
            r12 = r2
            goto L_0x0068
        L_0x0066:
            r12 = r32
        L_0x0068:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x006e
            r13 = r2
            goto L_0x0070
        L_0x006e:
            r13 = r33
        L_0x0070:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0076
            r14 = r2
            goto L_0x0078
        L_0x0076:
            r14 = r34
        L_0x0078:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007e
            r15 = r2
            goto L_0x0080
        L_0x007e:
            r15 = r35
        L_0x0080:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0086
            r2 = 0
            goto L_0x0088
        L_0x0086:
            r2 = r36
        L_0x0088:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0092
            r16 = 0
            goto L_0x0094
        L_0x0092:
            r16 = r37
        L_0x0094:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x009d
            r17 = 0
            goto L_0x009f
        L_0x009d:
            r17 = r38
        L_0x009f:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a8
            r18 = 0
            goto L_0x00aa
        L_0x00a8:
            r18 = r39
        L_0x00aa:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b3
            r19 = 0
            goto L_0x00b5
        L_0x00b3:
            r19 = r40
        L_0x00b5:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = ""
            goto L_0x00c0
        L_0x00be:
            r0 = r41
        L_0x00c0:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r6
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile.<init>(java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
