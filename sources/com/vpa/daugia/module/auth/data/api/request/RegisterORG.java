package com.vpa.daugia.module.auth.data.api.request;

import android.support.v4.media.a;
import cc.b;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: RegisterORG.kt */
public final class RegisterORG {
    @b("address")
    private String address;
    @b("bank")
    private String bank;
    @b("bankAccount")
    private String bankAccount;
    @b("bankAccountOwner")
    private String bankAccountOwner;
    @b("companyName")
    private String companyName;
    @b("contactPersonIdentityCard")
    private ContactPersonIdentityCard contactPersonIdentityCard;
    @b("contactPersonName")
    private String contactPersonName;
    @b("contactPersonTitle")
    private String contactPersonTitle;
    @b("districtId")
    private String districtId;
    @b("email")
    private String email;
    @b("frontOfIdentityCard")
    private ContactPersonIdentityCard frontOfIdentityCard;
    @b("orgBusinessRegistration")
    private String orgBusinessRegistration;
    @b("orgIssuanceDate")
    private Long orgIssuanceDate;
    @b("orgIssuancePlace")
    private String orgIssuancePlace;
    @b("password")
    private String password;
    @b("phone")
    private String phone;
    @b("phoneVerificationCode")
    private String phoneVerificationCode;
    @b("provinceId")
    private String provinceId;
    @b("rePass")
    private String rePass;
    @b("representative")
    private String representative;
    @b("representativeRole")
    private String representativeRole;
    @b("taxCode")
    private String taxCode;
    @b("vneidPlaceOfResidence")
    private ContactPersonIdentityCard vneidPlaceOfResidence;
    @b("wardId")
    private String wardId;

    public RegisterORG() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777215, (e) null);
    }

    public RegisterORG(String str, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, String str6, String str7, String str8, String str9, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str10, Long l10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.address = str;
        this.bank = str2;
        this.bankAccount = str3;
        this.bankAccountOwner = str4;
        this.companyName = str5;
        this.contactPersonIdentityCard = contactPersonIdentityCard2;
        this.contactPersonName = str6;
        this.contactPersonTitle = str7;
        this.districtId = str8;
        this.email = str9;
        this.frontOfIdentityCard = contactPersonIdentityCard3;
        this.vneidPlaceOfResidence = contactPersonIdentityCard4;
        this.orgBusinessRegistration = str10;
        this.orgIssuanceDate = l10;
        this.orgIssuancePlace = str11;
        this.phone = str12;
        this.provinceId = str13;
        this.taxCode = str14;
        this.wardId = str15;
        this.representativeRole = str16;
        this.representative = str17;
        this.password = str18;
        this.rePass = str19;
        this.phoneVerificationCode = str20;
    }

    public static /* synthetic */ RegisterORG copy$default(RegisterORG registerORG, String str, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, String str6, String str7, String str8, String str9, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str10, Long l10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i10, Object obj) {
        RegisterORG registerORG2 = registerORG;
        int i11 = i10;
        return registerORG.copy((i11 & 1) != 0 ? registerORG2.address : str, (i11 & 2) != 0 ? registerORG2.bank : str2, (i11 & 4) != 0 ? registerORG2.bankAccount : str3, (i11 & 8) != 0 ? registerORG2.bankAccountOwner : str4, (i11 & 16) != 0 ? registerORG2.companyName : str5, (i11 & 32) != 0 ? registerORG2.contactPersonIdentityCard : contactPersonIdentityCard2, (i11 & 64) != 0 ? registerORG2.contactPersonName : str6, (i11 & 128) != 0 ? registerORG2.contactPersonTitle : str7, (i11 & 256) != 0 ? registerORG2.districtId : str8, (i11 & 512) != 0 ? registerORG2.email : str9, (i11 & 1024) != 0 ? registerORG2.frontOfIdentityCard : contactPersonIdentityCard3, (i11 & 2048) != 0 ? registerORG2.vneidPlaceOfResidence : contactPersonIdentityCard4, (i11 & 4096) != 0 ? registerORG2.orgBusinessRegistration : str10, (i11 & 8192) != 0 ? registerORG2.orgIssuanceDate : l10, (i11 & 16384) != 0 ? registerORG2.orgIssuancePlace : str11, (i11 & 32768) != 0 ? registerORG2.phone : str12, (i11 & 65536) != 0 ? registerORG2.provinceId : str13, (i11 & 131072) != 0 ? registerORG2.taxCode : str14, (i11 & 262144) != 0 ? registerORG2.wardId : str15, (i11 & 524288) != 0 ? registerORG2.representativeRole : str16, (i11 & 1048576) != 0 ? registerORG2.representative : str17, (i11 & 2097152) != 0 ? registerORG2.password : str18, (i11 & 4194304) != 0 ? registerORG2.rePass : str19, (i11 & 8388608) != 0 ? registerORG2.phoneVerificationCode : str20);
    }

    public final String component1() {
        return this.address;
    }

    public final String component10() {
        return this.email;
    }

    public final ContactPersonIdentityCard component11() {
        return this.frontOfIdentityCard;
    }

    public final ContactPersonIdentityCard component12() {
        return this.vneidPlaceOfResidence;
    }

    public final String component13() {
        return this.orgBusinessRegistration;
    }

    public final Long component14() {
        return this.orgIssuanceDate;
    }

    public final String component15() {
        return this.orgIssuancePlace;
    }

    public final String component16() {
        return this.phone;
    }

    public final String component17() {
        return this.provinceId;
    }

    public final String component18() {
        return this.taxCode;
    }

    public final String component19() {
        return this.wardId;
    }

    public final String component2() {
        return this.bank;
    }

    public final String component20() {
        return this.representativeRole;
    }

    public final String component21() {
        return this.representative;
    }

    public final String component22() {
        return this.password;
    }

    public final String component23() {
        return this.rePass;
    }

    public final String component24() {
        return this.phoneVerificationCode;
    }

    public final String component3() {
        return this.bankAccount;
    }

    public final String component4() {
        return this.bankAccountOwner;
    }

    public final String component5() {
        return this.companyName;
    }

    public final ContactPersonIdentityCard component6() {
        return this.contactPersonIdentityCard;
    }

    public final String component7() {
        return this.contactPersonName;
    }

    public final String component8() {
        return this.contactPersonTitle;
    }

    public final String component9() {
        return this.districtId;
    }

    public final RegisterORG copy(String str, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, String str6, String str7, String str8, String str9, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str10, Long l10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        return new RegisterORG(str, str2, str3, str4, str5, contactPersonIdentityCard2, str6, str7, str8, str9, contactPersonIdentityCard3, contactPersonIdentityCard4, str10, l10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterORG)) {
            return false;
        }
        RegisterORG registerORG = (RegisterORG) obj;
        return j.a(this.address, registerORG.address) && j.a(this.bank, registerORG.bank) && j.a(this.bankAccount, registerORG.bankAccount) && j.a(this.bankAccountOwner, registerORG.bankAccountOwner) && j.a(this.companyName, registerORG.companyName) && j.a(this.contactPersonIdentityCard, registerORG.contactPersonIdentityCard) && j.a(this.contactPersonName, registerORG.contactPersonName) && j.a(this.contactPersonTitle, registerORG.contactPersonTitle) && j.a(this.districtId, registerORG.districtId) && j.a(this.email, registerORG.email) && j.a(this.frontOfIdentityCard, registerORG.frontOfIdentityCard) && j.a(this.vneidPlaceOfResidence, registerORG.vneidPlaceOfResidence) && j.a(this.orgBusinessRegistration, registerORG.orgBusinessRegistration) && j.a(this.orgIssuanceDate, registerORG.orgIssuanceDate) && j.a(this.orgIssuancePlace, registerORG.orgIssuancePlace) && j.a(this.phone, registerORG.phone) && j.a(this.provinceId, registerORG.provinceId) && j.a(this.taxCode, registerORG.taxCode) && j.a(this.wardId, registerORG.wardId) && j.a(this.representativeRole, registerORG.representativeRole) && j.a(this.representative, registerORG.representative) && j.a(this.password, registerORG.password) && j.a(this.rePass, registerORG.rePass) && j.a(this.phoneVerificationCode, registerORG.phoneVerificationCode);
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

    public final String getCompanyName() {
        return this.companyName;
    }

    public final ContactPersonIdentityCard getContactPersonIdentityCard() {
        return this.contactPersonIdentityCard;
    }

    public final String getContactPersonName() {
        return this.contactPersonName;
    }

    public final String getContactPersonTitle() {
        return this.contactPersonTitle;
    }

    public final String getDistrictId() {
        return this.districtId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final ContactPersonIdentityCard getFrontOfIdentityCard() {
        return this.frontOfIdentityCard;
    }

    public final String getOrgBusinessRegistration() {
        return this.orgBusinessRegistration;
    }

    public final Long getOrgIssuanceDate() {
        return this.orgIssuanceDate;
    }

    public final String getOrgIssuancePlace() {
        return this.orgIssuancePlace;
    }

    public final String getPassword() {
        return this.password;
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

    public final String getRepresentative() {
        return this.representative;
    }

    public final String getRepresentativeRole() {
        return this.representativeRole;
    }

    public final String getTaxCode() {
        return this.taxCode;
    }

    public final ContactPersonIdentityCard getVneidPlaceOfResidence() {
        return this.vneidPlaceOfResidence;
    }

    public final String getWardId() {
        return this.wardId;
    }

    public int hashCode() {
        String str = this.address;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bank;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankAccount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankAccountOwner;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.companyName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard2 = this.contactPersonIdentityCard;
        int hashCode6 = (hashCode5 + (contactPersonIdentityCard2 == null ? 0 : contactPersonIdentityCard2.hashCode())) * 31;
        String str6 = this.contactPersonName;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contactPersonTitle;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.districtId;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.email;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard3 = this.frontOfIdentityCard;
        int hashCode11 = (hashCode10 + (contactPersonIdentityCard3 == null ? 0 : contactPersonIdentityCard3.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard4 = this.vneidPlaceOfResidence;
        int hashCode12 = (hashCode11 + (contactPersonIdentityCard4 == null ? 0 : contactPersonIdentityCard4.hashCode())) * 31;
        String str10 = this.orgBusinessRegistration;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l10 = this.orgIssuanceDate;
        int hashCode14 = (hashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str11 = this.orgIssuancePlace;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phone;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.provinceId;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.taxCode;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.wardId;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.representativeRole;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.representative;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.password;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.rePass;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.phoneVerificationCode;
        if (str20 != null) {
            i10 = str20.hashCode();
        }
        return hashCode23 + i10;
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

    public final void setCompanyName(String str) {
        this.companyName = str;
    }

    public final void setContactPersonIdentityCard(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.contactPersonIdentityCard = contactPersonIdentityCard2;
    }

    public final void setContactPersonName(String str) {
        this.contactPersonName = str;
    }

    public final void setContactPersonTitle(String str) {
        this.contactPersonTitle = str;
    }

    public final void setDistrictId(String str) {
        this.districtId = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFrontOfIdentityCard(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.frontOfIdentityCard = contactPersonIdentityCard2;
    }

    public final void setOrgBusinessRegistration(String str) {
        this.orgBusinessRegistration = str;
    }

    public final void setOrgIssuanceDate(Long l10) {
        this.orgIssuanceDate = l10;
    }

    public final void setOrgIssuancePlace(String str) {
        this.orgIssuancePlace = str;
    }

    public final void setPassword(String str) {
        this.password = str;
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

    public final void setRepresentative(String str) {
        this.representative = str;
    }

    public final void setRepresentativeRole(String str) {
        this.representativeRole = str;
    }

    public final void setTaxCode(String str) {
        this.taxCode = str;
    }

    public final void setVneidPlaceOfResidence(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.vneidPlaceOfResidence = contactPersonIdentityCard2;
    }

    public final void setWardId(String str) {
        this.wardId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("RegisterORG(address=");
        q10.append(this.address);
        q10.append(", bank=");
        q10.append(this.bank);
        q10.append(", bankAccount=");
        q10.append(this.bankAccount);
        q10.append(", bankAccountOwner=");
        q10.append(this.bankAccountOwner);
        q10.append(", companyName=");
        q10.append(this.companyName);
        q10.append(", contactPersonIdentityCard=");
        q10.append(this.contactPersonIdentityCard);
        q10.append(", contactPersonName=");
        q10.append(this.contactPersonName);
        q10.append(", contactPersonTitle=");
        q10.append(this.contactPersonTitle);
        q10.append(", districtId=");
        q10.append(this.districtId);
        q10.append(", email=");
        q10.append(this.email);
        q10.append(", frontOfIdentityCard=");
        q10.append(this.frontOfIdentityCard);
        q10.append(", vneidPlaceOfResidence=");
        q10.append(this.vneidPlaceOfResidence);
        q10.append(", orgBusinessRegistration=");
        q10.append(this.orgBusinessRegistration);
        q10.append(", orgIssuanceDate=");
        q10.append(this.orgIssuanceDate);
        q10.append(", orgIssuancePlace=");
        q10.append(this.orgIssuancePlace);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", provinceId=");
        q10.append(this.provinceId);
        q10.append(", taxCode=");
        q10.append(this.taxCode);
        q10.append(", wardId=");
        q10.append(this.wardId);
        q10.append(", representativeRole=");
        q10.append(this.representativeRole);
        q10.append(", representative=");
        q10.append(this.representative);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", rePass=");
        q10.append(this.rePass);
        q10.append(", phoneVerificationCode=");
        return l.k(q10, this.phoneVerificationCode, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterORG(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r36, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r37, java.lang.String r38, java.lang.Long r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, int r50, sk.e r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r26
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r27
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r28
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r29
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r30
        L_0x002c:
            r7 = r0 & 32
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0038
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r7 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r7.<init>(r9, r8, r9)
            goto L_0x003a
        L_0x0038:
            r7 = r31
        L_0x003a:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0040
            r10 = r2
            goto L_0x0042
        L_0x0040:
            r10 = r32
        L_0x0042:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0048
            r11 = r2
            goto L_0x004a
        L_0x0048:
            r11 = r33
        L_0x004a:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0050
            r12 = r2
            goto L_0x0052
        L_0x0050:
            r12 = r34
        L_0x0052:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0058
            r13 = r2
            goto L_0x005a
        L_0x0058:
            r13 = r35
        L_0x005a:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0064
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r14 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r14.<init>(r9, r8, r9)
            goto L_0x0066
        L_0x0064:
            r14 = r36
        L_0x0066:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0070
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r15 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r15.<init>(r9, r8, r9)
            goto L_0x0072
        L_0x0070:
            r15 = r37
        L_0x0072:
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0078
            r8 = r2
            goto L_0x007a
        L_0x0078:
            r8 = r38
        L_0x007a:
            r9 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x0080
            r9 = 0
            goto L_0x0082
        L_0x0080:
            r9 = r39
        L_0x0082:
            r51 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x008b
            r2 = r51
            goto L_0x008d
        L_0x008b:
            r2 = r40
        L_0x008d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0097
            r16 = r51
            goto L_0x0099
        L_0x0097:
            r16 = r41
        L_0x0099:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a2
            r17 = r51
            goto L_0x00a4
        L_0x00a2:
            r17 = r42
        L_0x00a4:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00ad
            r18 = r51
            goto L_0x00af
        L_0x00ad:
            r18 = r43
        L_0x00af:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b8
            r19 = r51
            goto L_0x00ba
        L_0x00b8:
            r19 = r44
        L_0x00ba:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00c3
            r20 = r51
            goto L_0x00c5
        L_0x00c3:
            r20 = r45
        L_0x00c5:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ce
            r21 = r51
            goto L_0x00d0
        L_0x00ce:
            r21 = r46
        L_0x00d0:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00d9
            r22 = 0
            goto L_0x00db
        L_0x00d9:
            r22 = r47
        L_0x00db:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00e4
            r23 = 0
            goto L_0x00e6
        L_0x00e4:
            r23 = r48
        L_0x00e6:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00ee
            r0 = 0
            goto L_0x00f0
        L_0x00ee:
            r0 = r49
        L_0x00f0:
            r26 = r25
            r27 = r1
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r10
            r34 = r11
            r35 = r12
            r36 = r13
            r37 = r14
            r38 = r15
            r39 = r8
            r40 = r9
            r41 = r2
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.api.request.RegisterORG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
