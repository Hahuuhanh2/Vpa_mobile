package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.j;

/* compiled from: UserBiddingProfile.kt */
public final class UserBiddingProfile implements Serializable {
    @b("createdDate")
    private final Object createdDate;
    @b("email")
    private final String email;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final Long f19380id;
    @b("isExpired")
    private final Object isExpired;
    @b("isLock")
    private final Integer isLock;
    @b("latestAuctionDate")
    private final Long latestAuctionDate;
    @b("loginFailedCount")
    private final Object loginFailedCount;
    @b("phone")
    private final String phone;
    @b("profileStatus")
    private final Integer profileStatus;
    @b("username")
    private final String username;

    public UserBiddingProfile(Object obj, String str, Long l10, Object obj2, Integer num, Long l11, Object obj3, String str2, Integer num2, String str3) {
        this.createdDate = obj;
        this.email = str;
        this.f19380id = l10;
        this.isExpired = obj2;
        this.isLock = num;
        this.latestAuctionDate = l11;
        this.loginFailedCount = obj3;
        this.phone = str2;
        this.profileStatus = num2;
        this.username = str3;
    }

    public static /* synthetic */ UserBiddingProfile copy$default(UserBiddingProfile userBiddingProfile, Object obj, String str, Long l10, Object obj2, Integer num, Long l11, Object obj3, String str2, Integer num2, String str3, int i10, Object obj4) {
        UserBiddingProfile userBiddingProfile2 = userBiddingProfile;
        int i11 = i10;
        return userBiddingProfile.copy((i11 & 1) != 0 ? userBiddingProfile2.createdDate : obj, (i11 & 2) != 0 ? userBiddingProfile2.email : str, (i11 & 4) != 0 ? userBiddingProfile2.f19380id : l10, (i11 & 8) != 0 ? userBiddingProfile2.isExpired : obj2, (i11 & 16) != 0 ? userBiddingProfile2.isLock : num, (i11 & 32) != 0 ? userBiddingProfile2.latestAuctionDate : l11, (i11 & 64) != 0 ? userBiddingProfile2.loginFailedCount : obj3, (i11 & 128) != 0 ? userBiddingProfile2.phone : str2, (i11 & 256) != 0 ? userBiddingProfile2.profileStatus : num2, (i11 & 512) != 0 ? userBiddingProfile2.username : str3);
    }

    public final Object component1() {
        return this.createdDate;
    }

    public final String component10() {
        return this.username;
    }

    public final String component2() {
        return this.email;
    }

    public final Long component3() {
        return this.f19380id;
    }

    public final Object component4() {
        return this.isExpired;
    }

    public final Integer component5() {
        return this.isLock;
    }

    public final Long component6() {
        return this.latestAuctionDate;
    }

    public final Object component7() {
        return this.loginFailedCount;
    }

    public final String component8() {
        return this.phone;
    }

    public final Integer component9() {
        return this.profileStatus;
    }

    public final UserBiddingProfile copy(Object obj, String str, Long l10, Object obj2, Integer num, Long l11, Object obj3, String str2, Integer num2, String str3) {
        return new UserBiddingProfile(obj, str, l10, obj2, num, l11, obj3, str2, num2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBiddingProfile)) {
            return false;
        }
        UserBiddingProfile userBiddingProfile = (UserBiddingProfile) obj;
        return j.a(this.createdDate, userBiddingProfile.createdDate) && j.a(this.email, userBiddingProfile.email) && j.a(this.f19380id, userBiddingProfile.f19380id) && j.a(this.isExpired, userBiddingProfile.isExpired) && j.a(this.isLock, userBiddingProfile.isLock) && j.a(this.latestAuctionDate, userBiddingProfile.latestAuctionDate) && j.a(this.loginFailedCount, userBiddingProfile.loginFailedCount) && j.a(this.phone, userBiddingProfile.phone) && j.a(this.profileStatus, userBiddingProfile.profileStatus) && j.a(this.username, userBiddingProfile.username);
    }

    public final Object getCreatedDate() {
        return this.createdDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Long getId() {
        return this.f19380id;
    }

    public final Long getLatestAuctionDate() {
        return this.latestAuctionDate;
    }

    public final Object getLoginFailedCount() {
        return this.loginFailedCount;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Integer getProfileStatus() {
        return this.profileStatus;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        Object obj = this.createdDate;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.email;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f19380id;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Object obj2 = this.isExpired;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num = this.isLock;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.latestAuctionDate;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Object obj3 = this.loginFailedCount;
        int hashCode7 = (hashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.profileStatus;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.username;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode9 + i10;
    }

    public final Object isExpired() {
        return this.isExpired;
    }

    public final Integer isLock() {
        return this.isLock;
    }

    public String toString() {
        StringBuilder q10 = a.q("UserBiddingProfile(createdDate=");
        q10.append(this.createdDate);
        q10.append(", email=");
        q10.append(this.email);
        q10.append(", id=");
        q10.append(this.f19380id);
        q10.append(", isExpired=");
        q10.append(this.isExpired);
        q10.append(", isLock=");
        q10.append(this.isLock);
        q10.append(", latestAuctionDate=");
        q10.append(this.latestAuctionDate);
        q10.append(", loginFailedCount=");
        q10.append(this.loginFailedCount);
        q10.append(", phone=");
        q10.append(this.phone);
        q10.append(", profileStatus=");
        q10.append(this.profileStatus);
        q10.append(", username=");
        return l.k(q10, this.username, ')');
    }
}
