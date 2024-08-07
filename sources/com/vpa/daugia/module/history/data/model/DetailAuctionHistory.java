package com.vpa.daugia.module.history.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: DetailAuctionHistory.kt */
public final class DetailAuctionHistory implements Serializable {
    @b("auctionBiddingStatus")
    private Long auctionBiddingStatus;
    @b("auctionCode")
    private String auctionCode;
    @b("auctionDate")
    private Long auctionDate;
    @b("auctionPrice")
    private Long auctionPrice;
    @b("auctionRound")
    private Long auctionRound;
    @b("userId")
    private Long userId;

    public DetailAuctionHistory() {
        this((Long) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 63, (e) null);
    }

    public DetailAuctionHistory(Long l10, String str, Long l11, Long l12, Long l13, Long l14) {
        this.auctionBiddingStatus = l10;
        this.auctionCode = str;
        this.auctionDate = l11;
        this.auctionPrice = l12;
        this.auctionRound = l13;
        this.userId = l14;
    }

    public static /* synthetic */ DetailAuctionHistory copy$default(DetailAuctionHistory detailAuctionHistory, Long l10, String str, Long l11, Long l12, Long l13, Long l14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = detailAuctionHistory.auctionBiddingStatus;
        }
        if ((i10 & 2) != 0) {
            str = detailAuctionHistory.auctionCode;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            l11 = detailAuctionHistory.auctionDate;
        }
        Long l15 = l11;
        if ((i10 & 8) != 0) {
            l12 = detailAuctionHistory.auctionPrice;
        }
        Long l16 = l12;
        if ((i10 & 16) != 0) {
            l13 = detailAuctionHistory.auctionRound;
        }
        Long l17 = l13;
        if ((i10 & 32) != 0) {
            l14 = detailAuctionHistory.userId;
        }
        return detailAuctionHistory.copy(l10, str2, l15, l16, l17, l14);
    }

    public final Long component1() {
        return this.auctionBiddingStatus;
    }

    public final String component2() {
        return this.auctionCode;
    }

    public final Long component3() {
        return this.auctionDate;
    }

    public final Long component4() {
        return this.auctionPrice;
    }

    public final Long component5() {
        return this.auctionRound;
    }

    public final Long component6() {
        return this.userId;
    }

    public final DetailAuctionHistory copy(Long l10, String str, Long l11, Long l12, Long l13, Long l14) {
        return new DetailAuctionHistory(l10, str, l11, l12, l13, l14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailAuctionHistory)) {
            return false;
        }
        DetailAuctionHistory detailAuctionHistory = (DetailAuctionHistory) obj;
        return j.a(this.auctionBiddingStatus, detailAuctionHistory.auctionBiddingStatus) && j.a(this.auctionCode, detailAuctionHistory.auctionCode) && j.a(this.auctionDate, detailAuctionHistory.auctionDate) && j.a(this.auctionPrice, detailAuctionHistory.auctionPrice) && j.a(this.auctionRound, detailAuctionHistory.auctionRound) && j.a(this.userId, detailAuctionHistory.userId);
    }

    public final Long getAuctionBiddingStatus() {
        return this.auctionBiddingStatus;
    }

    public final String getAuctionCode() {
        return this.auctionCode;
    }

    public final Long getAuctionDate() {
        return this.auctionDate;
    }

    public final Long getAuctionPrice() {
        return this.auctionPrice;
    }

    public final Long getAuctionRound() {
        return this.auctionRound;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l10 = this.auctionBiddingStatus;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.auctionCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.auctionDate;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.auctionPrice;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.auctionRound;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.userId;
        if (l14 != null) {
            i10 = l14.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setAuctionBiddingStatus(Long l10) {
        this.auctionBiddingStatus = l10;
    }

    public final void setAuctionCode(String str) {
        this.auctionCode = str;
    }

    public final void setAuctionDate(Long l10) {
        this.auctionDate = l10;
    }

    public final void setAuctionPrice(Long l10) {
        this.auctionPrice = l10;
    }

    public final void setAuctionRound(Long l10) {
        this.auctionRound = l10;
    }

    public final void setUserId(Long l10) {
        this.userId = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("DetailAuctionHistory(auctionBiddingStatus=");
        q10.append(this.auctionBiddingStatus);
        q10.append(", auctionCode=");
        q10.append(this.auctionCode);
        q10.append(", auctionDate=");
        q10.append(this.auctionDate);
        q10.append(", auctionPrice=");
        q10.append(this.auctionPrice);
        q10.append(", auctionRound=");
        q10.append(this.auctionRound);
        q10.append(", userId=");
        q10.append(this.userId);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DetailAuctionHistory(java.lang.Long r6, java.lang.String r7, java.lang.Long r8, java.lang.Long r9, java.lang.Long r10, java.lang.Long r11, int r12, sk.e r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.history.data.model.DetailAuctionHistory.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, int, sk.e):void");
    }
}
