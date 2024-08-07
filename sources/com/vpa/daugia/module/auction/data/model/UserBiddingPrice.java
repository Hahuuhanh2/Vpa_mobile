package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: UserBiddingPrice.kt */
public final class UserBiddingPrice {
    @b("auctionCode")
    private String auctionCode;
    @b("nextId")
    private String nextId;
    @b("price")
    private Long price;
    @b("roomId")
    private String roomId;
    @b("userId")
    private Long userId;
    @b("userName")
    private String userName;

    public UserBiddingPrice() {
        this((String) null, (String) null, (Long) null, (String) null, (Long) null, (String) null, 63, (e) null);
    }

    public UserBiddingPrice(String str, String str2, Long l10, String str3, Long l11, String str4) {
        this.auctionCode = str;
        this.nextId = str2;
        this.price = l10;
        this.roomId = str3;
        this.userId = l11;
        this.userName = str4;
    }

    public static /* synthetic */ UserBiddingPrice copy$default(UserBiddingPrice userBiddingPrice, String str, String str2, Long l10, String str3, Long l11, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userBiddingPrice.auctionCode;
        }
        if ((i10 & 2) != 0) {
            str2 = userBiddingPrice.nextId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            l10 = userBiddingPrice.price;
        }
        Long l12 = l10;
        if ((i10 & 8) != 0) {
            str3 = userBiddingPrice.roomId;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            l11 = userBiddingPrice.userId;
        }
        Long l13 = l11;
        if ((i10 & 32) != 0) {
            str4 = userBiddingPrice.userName;
        }
        return userBiddingPrice.copy(str, str5, l12, str6, l13, str4);
    }

    public final String component1() {
        return this.auctionCode;
    }

    public final String component2() {
        return this.nextId;
    }

    public final Long component3() {
        return this.price;
    }

    public final String component4() {
        return this.roomId;
    }

    public final Long component5() {
        return this.userId;
    }

    public final String component6() {
        return this.userName;
    }

    public final UserBiddingPrice copy(String str, String str2, Long l10, String str3, Long l11, String str4) {
        return new UserBiddingPrice(str, str2, l10, str3, l11, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBiddingPrice)) {
            return false;
        }
        UserBiddingPrice userBiddingPrice = (UserBiddingPrice) obj;
        return j.a(this.auctionCode, userBiddingPrice.auctionCode) && j.a(this.nextId, userBiddingPrice.nextId) && j.a(this.price, userBiddingPrice.price) && j.a(this.roomId, userBiddingPrice.roomId) && j.a(this.userId, userBiddingPrice.userId) && j.a(this.userName, userBiddingPrice.userName);
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final String getNextId() {
        return this.nextId;
    }

    public final Long getPrice() {
        return this.price;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.auctionCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nextId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.price;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.roomId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.userId;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.userName;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setNextId(String str) {
        this.nextId = str;
    }

    public final void setPrice(Long l10) {
        this.price = l10;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setUserId(Long l10) {
        this.userId = l10;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("UserBiddingPrice(auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", nextId=");
        q10.append(this.nextId);
        q10.append(", price=");
        q10.append(this.price);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(", userName=");
        return l.k(q10, this.userName, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserBiddingPrice(java.lang.String r6, java.lang.String r7, java.lang.Long r8, java.lang.String r9, java.lang.Long r10, java.lang.String r11, int r12, sk.e r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.model.UserBiddingPrice.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, int, sk.e):void");
    }
}
