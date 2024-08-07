package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.j;

/* compiled from: AuctionBiddingResult.kt */
public final class AuctionBiddingResult {
    @b("biddingRoom")
    private final Long biddingRoom;
    @b("result")
    private final Integer result;
    @b("soThuTu")
    private final String soThuTu;

    public AuctionBiddingResult(Long l10, Integer num, String str) {
        this.biddingRoom = l10;
        this.result = num;
        this.soThuTu = str;
    }

    public static /* synthetic */ AuctionBiddingResult copy$default(AuctionBiddingResult auctionBiddingResult, Long l10, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = auctionBiddingResult.biddingRoom;
        }
        if ((i10 & 2) != 0) {
            num = auctionBiddingResult.result;
        }
        if ((i10 & 4) != 0) {
            str = auctionBiddingResult.soThuTu;
        }
        return auctionBiddingResult.copy(l10, num, str);
    }

    public final Long component1() {
        return this.biddingRoom;
    }

    public final Integer component2() {
        return this.result;
    }

    public final String component3() {
        return this.soThuTu;
    }

    public final AuctionBiddingResult copy(Long l10, Integer num, String str) {
        return new AuctionBiddingResult(l10, num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionBiddingResult)) {
            return false;
        }
        AuctionBiddingResult auctionBiddingResult = (AuctionBiddingResult) obj;
        return j.a(this.biddingRoom, auctionBiddingResult.biddingRoom) && j.a(this.result, auctionBiddingResult.result) && j.a(this.soThuTu, auctionBiddingResult.soThuTu);
    }

    public final Long getBiddingRoom() {
        return this.biddingRoom;
    }

    public final Integer getResult() {
        return this.result;
    }

    public final String getSoThuTu() {
        return this.soThuTu;
    }

    public int hashCode() {
        Long l10 = this.biddingRoom;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.result;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.soThuTu;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionBiddingResult(biddingRoom=");
        q10.append(this.biddingRoom);
        q10.append(", result=");
        q10.append(this.result);
        q10.append(", soThuTu=");
        return l.k(q10, this.soThuTu, ')');
    }
}
