package com.vpa.daugia.module.auth.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: User.kt */
public final class User {
    @b("accountType")
    private Integer accountType;
    @b("address")
    private String address;
    @b("age")
    private Object age;
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
    @b("contactPersonIssuanceDate")
    private Object contactPersonIssuanceDate;
    @b("contactPersonIssuancePlace")
    private String contactPersonIssuancePlace;
    @b("contactPersonName")
    private String contactPersonName;
    @b("contactPersonTitle")
    private String contactPersonTitle;
    @b("dateOfBirth")
    private String dateOfBirth;
    @b("districtId")
    private String districtId;
    @b("email")
    private String email;
    @b("frontOfIdentityCard")
    private ContactPersonIdentityCard frontOfIdentityCard;
    @b("fullname")
    private String fullname;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19467id;
    @b("identityNumber")
    private String identityNumber;
    @b("isVerified")
    private Object isVerified;
    @b("latestAuctionDate")
    private Long latestAuctionDate;
    @b("newPassword")
    private String newPassword;
    @b("oldPassword")
    private String oldPassword;
    @b("orgBusinessRegistration")
    private String orgBusinessRegistration;
    @b("orgIssuanceDate")
    private Long orgIssuanceDate;
    @b("orgIssuancePlace")
    private String orgIssuancePlace;
    @b("organizationPhone")
    private String organizationPhone;
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
    @b("profileStatus")
    private Integer profileStatus;
    @b("provinceId")
    private String provinceId;
    @b("rePass")
    private String rePass;
    @b("representativeRole")
    private String representativeRole;
    @b("reviewDate")
    private Object reviewDate;
    @b("reviewReason")
    private String reviewReason;
    @b("status")
    private Integer status;
    @b("statusAccount")
    private Object statusAccount;
    @b("taxCode")
    private String taxCode;
    @b("updatedPasswordDate")
    private Long updatedPasswordDate;
    @b("username")
    private String username;
    @b("vneidPlaceOfResidence")
    private ContactPersonIdentityCard vneidPlaceOfResidence;
    @b("wardId")
    private String wardId;

    public User() {
        this((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (e) null);
    }

    public User(Integer num, String str, Object obj, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, Object obj2, String str6, String str7, String str8, String str9, String str10, String str11, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str12, String str13, String str14, Object obj3, Long l10, String str15, Long l11, String str16, String str17, Long l12, String str18, String str19, Integer num2, String str20, Object obj4, String str21, Integer num3, Object obj5, String str22, Long l13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        this.accountType = num;
        this.address = str;
        this.age = obj;
        this.bank = str2;
        this.bankAccount = str3;
        this.bankAccountOwner = str4;
        this.companyName = str5;
        this.contactPersonIdentityCard = contactPersonIdentityCard2;
        this.contactPersonIssuanceDate = obj2;
        this.contactPersonIssuancePlace = str6;
        this.contactPersonName = str7;
        this.contactPersonTitle = str8;
        this.dateOfBirth = str9;
        this.districtId = str10;
        this.email = str11;
        this.frontOfIdentityCard = contactPersonIdentityCard3;
        this.vneidPlaceOfResidence = contactPersonIdentityCard4;
        this.fullname = str12;
        this.f19467id = str13;
        this.identityNumber = str14;
        this.isVerified = obj3;
        this.latestAuctionDate = l10;
        this.orgBusinessRegistration = str15;
        this.orgIssuanceDate = l11;
        this.orgIssuancePlace = str16;
        this.organizationPhone = str17;
        this.personIssuanceDate = l12;
        this.personIssuancePlace = str18;
        this.phone = str19;
        this.profileStatus = num2;
        this.provinceId = str20;
        this.reviewDate = obj4;
        this.reviewReason = str21;
        this.status = num3;
        this.statusAccount = obj5;
        this.taxCode = str22;
        this.updatedPasswordDate = l13;
        this.username = str23;
        this.wardId = str24;
        this.password = str25;
        this.rePass = str26;
        this.phoneVerificationCode = str27;
        this.representativeRole = str28;
        this.newPassword = str29;
        this.oldPassword = str30;
    }

    public static /* synthetic */ User copy$default(User user, Integer num, String str, Object obj, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, Object obj2, String str6, String str7, String str8, String str9, String str10, String str11, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str12, String str13, String str14, Object obj3, Long l10, String str15, Long l11, String str16, String str17, Long l12, String str18, String str19, Integer num2, String str20, Object obj4, String str21, Integer num3, Object obj5, String str22, Long l13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i10, int i11, Object obj6) {
        User user2 = user;
        int i12 = i10;
        int i13 = i11;
        return user.copy((i12 & 1) != 0 ? user2.accountType : num, (i12 & 2) != 0 ? user2.address : str, (i12 & 4) != 0 ? user2.age : obj, (i12 & 8) != 0 ? user2.bank : str2, (i12 & 16) != 0 ? user2.bankAccount : str3, (i12 & 32) != 0 ? user2.bankAccountOwner : str4, (i12 & 64) != 0 ? user2.companyName : str5, (i12 & 128) != 0 ? user2.contactPersonIdentityCard : contactPersonIdentityCard2, (i12 & 256) != 0 ? user2.contactPersonIssuanceDate : obj2, (i12 & 512) != 0 ? user2.contactPersonIssuancePlace : str6, (i12 & 1024) != 0 ? user2.contactPersonName : str7, (i12 & 2048) != 0 ? user2.contactPersonTitle : str8, (i12 & 4096) != 0 ? user2.dateOfBirth : str9, (i12 & 8192) != 0 ? user2.districtId : str10, (i12 & 16384) != 0 ? user2.email : str11, (i12 & 32768) != 0 ? user2.frontOfIdentityCard : contactPersonIdentityCard3, (i12 & 65536) != 0 ? user2.vneidPlaceOfResidence : contactPersonIdentityCard4, (i12 & 131072) != 0 ? user2.fullname : str12, (i12 & 262144) != 0 ? user2.f19467id : str13, (i12 & 524288) != 0 ? user2.identityNumber : str14, (i12 & 1048576) != 0 ? user2.isVerified : obj3, (i12 & 2097152) != 0 ? user2.latestAuctionDate : l10, (i12 & 4194304) != 0 ? user2.orgBusinessRegistration : str15, (i12 & 8388608) != 0 ? user2.orgIssuanceDate : l11, (i12 & 16777216) != 0 ? user2.orgIssuancePlace : str16, (i12 & 33554432) != 0 ? user2.organizationPhone : str17, (i12 & 67108864) != 0 ? user2.personIssuanceDate : l12, (i12 & 134217728) != 0 ? user2.personIssuancePlace : str18, (i12 & 268435456) != 0 ? user2.phone : str19, (i12 & 536870912) != 0 ? user2.profileStatus : num2, (i12 & 1073741824) != 0 ? user2.provinceId : str20, (i12 & Integer.MIN_VALUE) != 0 ? user2.reviewDate : obj4, (i13 & 1) != 0 ? user2.reviewReason : str21, (i13 & 2) != 0 ? user2.status : num3, (i13 & 4) != 0 ? user2.statusAccount : obj5, (i13 & 8) != 0 ? user2.taxCode : str22, (i13 & 16) != 0 ? user2.updatedPasswordDate : l13, (i13 & 32) != 0 ? user2.username : str23, (i13 & 64) != 0 ? user2.wardId : str24, (i13 & 128) != 0 ? user2.password : str25, (i13 & 256) != 0 ? user2.rePass : str26, (i13 & 512) != 0 ? user2.phoneVerificationCode : str27, (i13 & 1024) != 0 ? user2.representativeRole : str28, (i13 & 2048) != 0 ? user2.newPassword : str29, (i13 & 4096) != 0 ? user2.oldPassword : str30);
    }

    public final Integer component1() {
        return this.accountType;
    }

    public final String component10() {
        return this.contactPersonIssuancePlace;
    }

    public final String component11() {
        return this.contactPersonName;
    }

    public final String component12() {
        return this.contactPersonTitle;
    }

    public final String component13() {
        return this.dateOfBirth;
    }

    public final String component14() {
        return this.districtId;
    }

    public final String component15() {
        return this.email;
    }

    public final ContactPersonIdentityCard component16() {
        return this.frontOfIdentityCard;
    }

    public final ContactPersonIdentityCard component17() {
        return this.vneidPlaceOfResidence;
    }

    public final String component18() {
        return this.fullname;
    }

    public final String component19() {
        return this.f19467id;
    }

    public final String component2() {
        return this.address;
    }

    public final String component20() {
        return this.identityNumber;
    }

    public final Object component21() {
        return this.isVerified;
    }

    public final Long component22() {
        return this.latestAuctionDate;
    }

    public final String component23() {
        return this.orgBusinessRegistration;
    }

    public final Long component24() {
        return this.orgIssuanceDate;
    }

    public final String component25() {
        return this.orgIssuancePlace;
    }

    public final String component26() {
        return this.organizationPhone;
    }

    public final Long component27() {
        return this.personIssuanceDate;
    }

    public final String component28() {
        return this.personIssuancePlace;
    }

    public final String component29() {
        return this.phone;
    }

    public final Object component3() {
        return this.age;
    }

    public final Integer component30() {
        return this.profileStatus;
    }

    public final String component31() {
        return this.provinceId;
    }

    public final Object component32() {
        return this.reviewDate;
    }

    public final String component33() {
        return this.reviewReason;
    }

    public final Integer component34() {
        return this.status;
    }

    public final Object component35() {
        return this.statusAccount;
    }

    public final String component36() {
        return this.taxCode;
    }

    public final Long component37() {
        return this.updatedPasswordDate;
    }

    public final String component38() {
        return this.username;
    }

    public final String component39() {
        return this.wardId;
    }

    public final String component4() {
        return this.bank;
    }

    public final String component40() {
        return this.password;
    }

    public final String component41() {
        return this.rePass;
    }

    public final String component42() {
        return this.phoneVerificationCode;
    }

    public final String component43() {
        return this.representativeRole;
    }

    public final String component44() {
        return this.newPassword;
    }

    public final String component45() {
        return this.oldPassword;
    }

    public final String component5() {
        return this.bankAccount;
    }

    public final String component6() {
        return this.bankAccountOwner;
    }

    public final String component7() {
        return this.companyName;
    }

    public final ContactPersonIdentityCard component8() {
        return this.contactPersonIdentityCard;
    }

    public final Object component9() {
        return this.contactPersonIssuanceDate;
    }

    public final User copy(Integer num, String str, Object obj, String str2, String str3, String str4, String str5, ContactPersonIdentityCard contactPersonIdentityCard2, Object obj2, String str6, String str7, String str8, String str9, String str10, String str11, ContactPersonIdentityCard contactPersonIdentityCard3, ContactPersonIdentityCard contactPersonIdentityCard4, String str12, String str13, String str14, Object obj3, Long l10, String str15, Long l11, String str16, String str17, Long l12, String str18, String str19, Integer num2, String str20, Object obj4, String str21, Integer num3, Object obj5, String str22, Long l13, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        return new User(num, str, obj, str2, str3, str4, str5, contactPersonIdentityCard2, obj2, str6, str7, str8, str9, str10, str11, contactPersonIdentityCard3, contactPersonIdentityCard4, str12, str13, str14, obj3, l10, str15, l11, str16, str17, l12, str18, str19, num2, str20, obj4, str21, num3, obj5, str22, l13, str23, str24, str25, str26, str27, str28, str29, str30);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return j.a(this.accountType, user.accountType) && j.a(this.address, user.address) && j.a(this.age, user.age) && j.a(this.bank, user.bank) && j.a(this.bankAccount, user.bankAccount) && j.a(this.bankAccountOwner, user.bankAccountOwner) && j.a(this.companyName, user.companyName) && j.a(this.contactPersonIdentityCard, user.contactPersonIdentityCard) && j.a(this.contactPersonIssuanceDate, user.contactPersonIssuanceDate) && j.a(this.contactPersonIssuancePlace, user.contactPersonIssuancePlace) && j.a(this.contactPersonName, user.contactPersonName) && j.a(this.contactPersonTitle, user.contactPersonTitle) && j.a(this.dateOfBirth, user.dateOfBirth) && j.a(this.districtId, user.districtId) && j.a(this.email, user.email) && j.a(this.frontOfIdentityCard, user.frontOfIdentityCard) && j.a(this.vneidPlaceOfResidence, user.vneidPlaceOfResidence) && j.a(this.fullname, user.fullname) && j.a(this.f19467id, user.f19467id) && j.a(this.identityNumber, user.identityNumber) && j.a(this.isVerified, user.isVerified) && j.a(this.latestAuctionDate, user.latestAuctionDate) && j.a(this.orgBusinessRegistration, user.orgBusinessRegistration) && j.a(this.orgIssuanceDate, user.orgIssuanceDate) && j.a(this.orgIssuancePlace, user.orgIssuancePlace) && j.a(this.organizationPhone, user.organizationPhone) && j.a(this.personIssuanceDate, user.personIssuanceDate) && j.a(this.personIssuancePlace, user.personIssuancePlace) && j.a(this.phone, user.phone) && j.a(this.profileStatus, user.profileStatus) && j.a(this.provinceId, user.provinceId) && j.a(this.reviewDate, user.reviewDate) && j.a(this.reviewReason, user.reviewReason) && j.a(this.status, user.status) && j.a(this.statusAccount, user.statusAccount) && j.a(this.taxCode, user.taxCode) && j.a(this.updatedPasswordDate, user.updatedPasswordDate) && j.a(this.username, user.username) && j.a(this.wardId, user.wardId) && j.a(this.password, user.password) && j.a(this.rePass, user.rePass) && j.a(this.phoneVerificationCode, user.phoneVerificationCode) && j.a(this.representativeRole, user.representativeRole) && j.a(this.newPassword, user.newPassword) && j.a(this.oldPassword, user.oldPassword);
    }

    public final Integer getAccountType() {
        return this.accountType;
    }

    public final String getAddress() {
        return this.address;
    }

    public final Object getAge() {
        return this.age;
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

    public final Object getContactPersonIssuanceDate() {
        return this.contactPersonIssuanceDate;
    }

    public final String getContactPersonIssuancePlace() {
        return this.contactPersonIssuancePlace;
    }

    public final String getContactPersonName() {
        return this.contactPersonName;
    }

    public final String getContactPersonTitle() {
        return this.contactPersonTitle;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getDistrictId() {
        return this.districtId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getFlow() {
        if (!getIsEdit()) {
            return 1;
        }
        return 0;
    }

    public final ContactPersonIdentityCard getFrontOfIdentityCard() {
        return this.frontOfIdentityCard;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final String getId() {
        return this.f19467id;
    }

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final boolean getIsEdit() {
        Integer num = this.profileStatus;
        if (num != null && num.intValue() == 5) {
            return false;
        }
        return true;
    }

    public final Long getLatestAuctionDate() {
        return this.latestAuctionDate;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
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

    public final String getOrganizationPhone() {
        return this.organizationPhone;
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

    public final Integer getProfileStatus() {
        return this.profileStatus;
    }

    public final String getProvinceId() {
        return this.provinceId;
    }

    public final String getRePass() {
        return this.rePass;
    }

    public final String getRepresentativeRole() {
        return this.representativeRole;
    }

    public final Object getReviewDate() {
        return this.reviewDate;
    }

    public final String getReviewReason() {
        return this.reviewReason;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Object getStatusAccount() {
        return this.statusAccount;
    }

    public final String getTaxCode() {
        return this.taxCode;
    }

    public final Long getUpdatedPasswordDate() {
        return this.updatedPasswordDate;
    }

    public final String getUsername() {
        return this.username;
    }

    public final ContactPersonIdentityCard getVneidPlaceOfResidence() {
        return this.vneidPlaceOfResidence;
    }

    public final String getWardId() {
        return this.wardId;
    }

    public int hashCode() {
        Integer num = this.accountType;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.address;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.age;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.bank;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankAccount;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankAccountOwner;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.companyName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard2 = this.contactPersonIdentityCard;
        int hashCode8 = (hashCode7 + (contactPersonIdentityCard2 == null ? 0 : contactPersonIdentityCard2.hashCode())) * 31;
        Object obj2 = this.contactPersonIssuanceDate;
        int hashCode9 = (hashCode8 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str6 = this.contactPersonIssuancePlace;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contactPersonName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.contactPersonTitle;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dateOfBirth;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.districtId;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.email;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard3 = this.frontOfIdentityCard;
        int hashCode16 = (hashCode15 + (contactPersonIdentityCard3 == null ? 0 : contactPersonIdentityCard3.hashCode())) * 31;
        ContactPersonIdentityCard contactPersonIdentityCard4 = this.vneidPlaceOfResidence;
        int hashCode17 = (hashCode16 + (contactPersonIdentityCard4 == null ? 0 : contactPersonIdentityCard4.hashCode())) * 31;
        String str12 = this.fullname;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f19467id;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.identityNumber;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Object obj3 = this.isVerified;
        int hashCode21 = (hashCode20 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Long l10 = this.latestAuctionDate;
        int hashCode22 = (hashCode21 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str15 = this.orgBusinessRegistration;
        int hashCode23 = (hashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l11 = this.orgIssuanceDate;
        int hashCode24 = (hashCode23 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str16 = this.orgIssuancePlace;
        int hashCode25 = (hashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.organizationPhone;
        int hashCode26 = (hashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Long l12 = this.personIssuanceDate;
        int hashCode27 = (hashCode26 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str18 = this.personIssuancePlace;
        int hashCode28 = (hashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.phone;
        int hashCode29 = (hashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num2 = this.profileStatus;
        int hashCode30 = (hashCode29 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str20 = this.provinceId;
        int hashCode31 = (hashCode30 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Object obj4 = this.reviewDate;
        int hashCode32 = (hashCode31 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str21 = this.reviewReason;
        int hashCode33 = (hashCode32 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Integer num3 = this.status;
        int hashCode34 = (hashCode33 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Object obj5 = this.statusAccount;
        int hashCode35 = (hashCode34 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        String str22 = this.taxCode;
        int hashCode36 = (hashCode35 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Long l13 = this.updatedPasswordDate;
        int hashCode37 = (hashCode36 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str23 = this.username;
        int hashCode38 = (hashCode37 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.wardId;
        int hashCode39 = (hashCode38 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.password;
        int hashCode40 = (hashCode39 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.rePass;
        int hashCode41 = (hashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.phoneVerificationCode;
        int hashCode42 = (hashCode41 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.representativeRole;
        int hashCode43 = (hashCode42 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.newPassword;
        int hashCode44 = (hashCode43 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.oldPassword;
        if (str30 != null) {
            i10 = str30.hashCode();
        }
        return hashCode44 + i10;
    }

    public final Object isVerified() {
        return this.isVerified;
    }

    public final void setAccountType(Integer num) {
        this.accountType = num;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setAge(Object obj) {
        this.age = obj;
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

    public final void setContactPersonIssuanceDate(Object obj) {
        this.contactPersonIssuanceDate = obj;
    }

    public final void setContactPersonIssuancePlace(String str) {
        this.contactPersonIssuancePlace = str;
    }

    public final void setContactPersonName(String str) {
        this.contactPersonName = str;
    }

    public final void setContactPersonTitle(String str) {
        this.contactPersonTitle = str;
    }

    public final void setDateOfBirth(String str) {
        this.dateOfBirth = str;
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

    public final void setFullname(String str) {
        this.fullname = str;
    }

    public final void setId(String str) {
        this.f19467id = str;
    }

    public final void setIdentityNumber(String str) {
        this.identityNumber = str;
    }

    public final void setLatestAuctionDate(Long l10) {
        this.latestAuctionDate = l10;
    }

    public final void setNewPassword(String str) {
        this.newPassword = str;
    }

    public final void setOldPassword(String str) {
        this.oldPassword = str;
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

    public final void setOrganizationPhone(String str) {
        this.organizationPhone = str;
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

    public final void setProfileStatus(Integer num) {
        this.profileStatus = num;
    }

    public final void setProvinceId(String str) {
        this.provinceId = str;
    }

    public final void setRePass(String str) {
        this.rePass = str;
    }

    public final void setRepresentativeRole(String str) {
        this.representativeRole = str;
    }

    public final void setReviewDate(Object obj) {
        this.reviewDate = obj;
    }

    public final void setReviewReason(String str) {
        this.reviewReason = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusAccount(Object obj) {
        this.statusAccount = obj;
    }

    public final void setTaxCode(String str) {
        this.taxCode = str;
    }

    public final void setUpdatedPasswordDate(Long l10) {
        this.updatedPasswordDate = l10;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setVerified(Object obj) {
        this.isVerified = obj;
    }

    public final void setVneidPlaceOfResidence(ContactPersonIdentityCard contactPersonIdentityCard2) {
        this.vneidPlaceOfResidence = contactPersonIdentityCard2;
    }

    public final void setWardId(String str) {
        this.wardId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("User(accountType=");
        q10.append(this.accountType);
        q10.append(", address=");
        q10.append(this.address);
        q10.append(", age=");
        q10.append(this.age);
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
        q10.append(", contactPersonIssuanceDate=");
        q10.append(this.contactPersonIssuanceDate);
        q10.append(", contactPersonIssuancePlace=");
        q10.append(this.contactPersonIssuancePlace);
        q10.append(", contactPersonName=");
        q10.append(this.contactPersonName);
        q10.append(", contactPersonTitle=");
        q10.append(this.contactPersonTitle);
        q10.append(", dateOfBirth=");
        q10.append(this.dateOfBirth);
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
        q10.append(", id=");
        q10.append(this.f19467id);
        q10.append(", identityNumber=");
        q10.append(this.identityNumber);
        q10.append(", isVerified=");
        q10.append(this.isVerified);
        q10.append(", latestAuctionDate=");
        q10.append(this.latestAuctionDate);
        q10.append(", orgBusinessRegistration=");
        q10.append(this.orgBusinessRegistration);
        q10.append(", orgIssuanceDate=");
        q10.append(this.orgIssuanceDate);
        q10.append(", orgIssuancePlace=");
        q10.append(this.orgIssuancePlace);
        q10.append(", organizationPhone=");
        q10.append(this.organizationPhone);
        q10.append(", personIssuanceDate=");
        q10.append(this.personIssuanceDate);
        q10.append(", personIssuancePlace=");
        q10.append(this.personIssuancePlace);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", profileStatus=");
        q10.append(this.profileStatus);
        q10.append(", provinceId=");
        q10.append(this.provinceId);
        q10.append(", reviewDate=");
        q10.append(this.reviewDate);
        q10.append(", reviewReason=");
        q10.append(this.reviewReason);
        q10.append(", status=");
        q10.append(this.status);
        q10.append(", statusAccount=");
        q10.append(this.statusAccount);
        q10.append(", taxCode=");
        q10.append(this.taxCode);
        q10.append(", updatedPasswordDate=");
        q10.append(this.updatedPasswordDate);
        q10.append(", username=");
        q10.append(this.username);
        q10.append(", wardId=");
        q10.append(this.wardId);
        q10.append(", password=");
        q10.append(this.password);
        q10.append(", rePass=");
        q10.append(this.rePass);
        q10.append(", phoneVerificationCode=");
        q10.append(this.phoneVerificationCode);
        q10.append(", representativeRole=");
        q10.append(this.representativeRole);
        q10.append(", newPassword=");
        q10.append(this.newPassword);
        q10.append(", oldPassword=");
        return l.k(q10, this.oldPassword, ')');
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [sk.e, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ User(java.lang.Integer r44, java.lang.String r45, java.lang.Object r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r51, java.lang.Object r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r59, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.Object r64, java.lang.Long r65, java.lang.String r66, java.lang.Long r67, java.lang.String r68, java.lang.String r69, java.lang.Long r70, java.lang.String r71, java.lang.String r72, java.lang.Integer r73, java.lang.String r74, java.lang.Object r75, java.lang.String r76, java.lang.Integer r77, java.lang.Object r78, java.lang.String r79, java.lang.Long r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, int r89, int r90, sk.e r91) {
        /*
            r43 = this;
            r0 = r89
            r1 = r90
            r2 = r0 & 1
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0011
        L_0x000f:
            r2 = r44
        L_0x0011:
            r4 = r0 & 2
            r5 = 0
            if (r4 == 0) goto L_0x0018
            r4 = r5
            goto L_0x001a
        L_0x0018:
            r4 = r45
        L_0x001a:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x0024
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            goto L_0x0026
        L_0x0024:
            r6 = r46
        L_0x0026:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002c
            r7 = r5
            goto L_0x002e
        L_0x002c:
            r7 = r47
        L_0x002e:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0034
            r8 = r5
            goto L_0x0036
        L_0x0034:
            r8 = r48
        L_0x0036:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003c
            r9 = r5
            goto L_0x003e
        L_0x003c:
            r9 = r49
        L_0x003e:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0044
            r10 = r5
            goto L_0x0046
        L_0x0044:
            r10 = r50
        L_0x0046:
            r11 = r0 & 128(0x80, float:1.794E-43)
            r12 = 1
            if (r11 == 0) goto L_0x0051
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r11 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r11.<init>(r5, r12, r5)
            goto L_0x0053
        L_0x0051:
            r11 = r51
        L_0x0053:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x005d
            java.lang.Object r13 = new java.lang.Object
            r13.<init>()
            goto L_0x005f
        L_0x005d:
            r13 = r52
        L_0x005f:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0065
            r14 = r5
            goto L_0x0067
        L_0x0065:
            r14 = r53
        L_0x0067:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x006d
            r15 = r5
            goto L_0x006f
        L_0x006d:
            r15 = r54
        L_0x006f:
            r5 = r0 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0075
            r5 = 0
            goto L_0x0077
        L_0x0075:
            r5 = r55
        L_0x0077:
            r12 = r0 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x007d
            r12 = 0
            goto L_0x007f
        L_0x007d:
            r12 = r56
        L_0x007f:
            r91 = r3
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0087
            r3 = 0
            goto L_0x0089
        L_0x0087:
            r3 = r57
        L_0x0089:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0091
            r3 = 0
            goto L_0x0093
        L_0x0091:
            r3 = r58
        L_0x0093:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a8
            r17 = r3
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r3 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r19 = r5
            r18 = r12
            r5 = 0
            r12 = 1
            r3.<init>(r5, r12, r5)
            goto L_0x00b2
        L_0x00a8:
            r17 = r3
            r19 = r5
            r18 = r12
            r5 = 0
            r12 = 1
            r3 = r59
        L_0x00b2:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00c0
            r20 = r3
            com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard r3 = new com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard
            r3.<init>(r5, r12, r5)
            goto L_0x00c4
        L_0x00c0:
            r20 = r3
            r3 = r60
        L_0x00c4:
            r12 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 & r0
            if (r12 == 0) goto L_0x00cb
            r12 = r5
            goto L_0x00cd
        L_0x00cb:
            r12 = r61
        L_0x00cd:
            r21 = 262144(0x40000, float:3.67342E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00d6
            r21 = r5
            goto L_0x00d8
        L_0x00d6:
            r21 = r62
        L_0x00d8:
            r22 = 524288(0x80000, float:7.34684E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00e1
            r22 = r5
            goto L_0x00e3
        L_0x00e1:
            r22 = r63
        L_0x00e3:
            r23 = 1048576(0x100000, float:1.469368E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00ef
            java.lang.Object r23 = new java.lang.Object
            r23.<init>()
            goto L_0x00f1
        L_0x00ef:
            r23 = r64
        L_0x00f1:
            r24 = 2097152(0x200000, float:2.938736E-39)
            r24 = r0 & r24
            r25 = 0
            if (r24 == 0) goto L_0x00fe
            java.lang.Long r24 = java.lang.Long.valueOf(r25)
            goto L_0x0100
        L_0x00fe:
            r24 = r65
        L_0x0100:
            r27 = 4194304(0x400000, float:5.877472E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x0109
            r27 = r5
            goto L_0x010b
        L_0x0109:
            r27 = r66
        L_0x010b:
            r28 = 8388608(0x800000, float:1.17549435E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0114
            r28 = r5
            goto L_0x0116
        L_0x0114:
            r28 = r67
        L_0x0116:
            r29 = 16777216(0x1000000, float:2.3509887E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x011f
            r29 = r5
            goto L_0x0121
        L_0x011f:
            r29 = r68
        L_0x0121:
            r30 = 33554432(0x2000000, float:9.403955E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x012a
            r30 = r5
            goto L_0x012c
        L_0x012a:
            r30 = r69
        L_0x012c:
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0137
            java.lang.Long r31 = java.lang.Long.valueOf(r25)
            goto L_0x0139
        L_0x0137:
            r31 = r70
        L_0x0139:
            r32 = 134217728(0x8000000, float:3.85186E-34)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0142
            java.lang.String r32 = "Cục Cảnh sát quản lý hành chính về trật tự xã hội"
            goto L_0x0144
        L_0x0142:
            r32 = r71
        L_0x0144:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x014d
            r33 = r5
            goto L_0x014f
        L_0x014d:
            r33 = r72
        L_0x014f:
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0158
            r34 = r91
            goto L_0x015a
        L_0x0158:
            r34 = r73
        L_0x015a:
            r35 = 1073741824(0x40000000, float:2.0)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0163
            r35 = r5
            goto L_0x0165
        L_0x0163:
            r35 = r74
        L_0x0165:
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r36
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            goto L_0x0173
        L_0x0171:
            r0 = r75
        L_0x0173:
            r36 = r1 & 1
            if (r36 == 0) goto L_0x017a
            r36 = r5
            goto L_0x017c
        L_0x017a:
            r36 = r76
        L_0x017c:
            r37 = r1 & 2
            if (r37 == 0) goto L_0x0183
            r37 = r91
            goto L_0x0185
        L_0x0183:
            r37 = r77
        L_0x0185:
            r38 = r1 & 4
            if (r38 == 0) goto L_0x018f
            java.lang.Object r38 = new java.lang.Object
            r38.<init>()
            goto L_0x0191
        L_0x018f:
            r38 = r78
        L_0x0191:
            r39 = r1 & 8
            if (r39 == 0) goto L_0x0198
            r39 = r5
            goto L_0x019a
        L_0x0198:
            r39 = r79
        L_0x019a:
            r40 = r1 & 16
            if (r40 == 0) goto L_0x01a3
            java.lang.Long r25 = java.lang.Long.valueOf(r25)
            goto L_0x01a5
        L_0x01a3:
            r25 = r80
        L_0x01a5:
            r26 = r1 & 32
            if (r26 == 0) goto L_0x01ac
            r26 = r5
            goto L_0x01ae
        L_0x01ac:
            r26 = r81
        L_0x01ae:
            r40 = r1 & 64
            if (r40 == 0) goto L_0x01b5
            r40 = r5
            goto L_0x01b7
        L_0x01b5:
            r40 = r82
        L_0x01b7:
            r5 = r1 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x01bd
            r5 = 0
            goto L_0x01bf
        L_0x01bd:
            r5 = r83
        L_0x01bf:
            r89 = r5
            r5 = r1 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x01c7
            r5 = 0
            goto L_0x01c9
        L_0x01c7:
            r5 = r84
        L_0x01c9:
            r91 = r5
            r5 = r1 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x01d1
            r5 = 0
            goto L_0x01d3
        L_0x01d1:
            r5 = r85
        L_0x01d3:
            r41 = r5
            r5 = r1 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x01db
            r5 = 0
            goto L_0x01dd
        L_0x01db:
            r5 = r86
        L_0x01dd:
            r42 = r5
            r5 = r1 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x01e5
            r5 = 0
            goto L_0x01e7
        L_0x01e5:
            r5 = r87
        L_0x01e7:
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x01ed
            r1 = 0
            goto L_0x01ef
        L_0x01ed:
            r1 = r88
        L_0x01ef:
            r44 = r43
            r45 = r2
            r46 = r4
            r47 = r6
            r48 = r7
            r49 = r8
            r50 = r9
            r51 = r10
            r52 = r11
            r53 = r13
            r54 = r14
            r55 = r15
            r56 = r19
            r57 = r18
            r58 = r16
            r59 = r17
            r60 = r20
            r61 = r3
            r62 = r12
            r63 = r21
            r64 = r22
            r65 = r23
            r66 = r24
            r67 = r27
            r68 = r28
            r69 = r29
            r70 = r30
            r71 = r31
            r72 = r32
            r73 = r33
            r74 = r34
            r75 = r35
            r76 = r0
            r77 = r36
            r78 = r37
            r79 = r38
            r80 = r39
            r81 = r25
            r82 = r26
            r83 = r40
            r84 = r89
            r85 = r91
            r86 = r41
            r87 = r42
            r88 = r5
            r89 = r1
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auth.data.model.User.<init>(java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String, java.lang.Integer, java.lang.Object, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, sk.e):void");
    }
}
