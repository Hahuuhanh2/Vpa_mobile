package com.vpa.daugia.module.auction.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.j;

/* compiled from: BiddingTimeout.kt */
public final class BiddingTimeout {
    @b("endTime")
    private final Long endTime;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f19374id;
    @b("remainingTime")
    private final Long remainingTime;
    @b("roomId")
    private final String roomId;
    @b("startTime")
    private final Long startTime;

    public BiddingTimeout(Long l10, String str, Long l11, String str2, Long l12) {
        this.endTime = l10;
        this.f19374id = str;
        this.remainingTime = l11;
        this.roomId = str2;
        this.startTime = l12;
    }

    public static /* synthetic */ BiddingTimeout copy$default(BiddingTimeout biddingTimeout, Long l10, String str, Long l11, String str2, Long l12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = biddingTimeout.endTime;
        }
        if ((i10 & 2) != 0) {
            str = biddingTimeout.f19374id;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            l11 = biddingTimeout.remainingTime;
        }
        Long l13 = l11;
        if ((i10 & 8) != 0) {
            str2 = biddingTimeout.roomId;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            l12 = biddingTimeout.startTime;
        }
        return biddingTimeout.copy(l10, str3, l13, str4, l12);
    }

    public final Long component1() {
        return this.endTime;
    }

    public final String component2() {
        return this.f19374id;
    }

    public final Long component3() {
        return this.remainingTime;
    }

    public final String component4() {
        return this.roomId;
    }

    public final Long component5() {
        return this.startTime;
    }

    public final BiddingTimeout copy(Long l10, String str, Long l11, String str2, Long l12) {
        return new BiddingTimeout(l10, str, l11, str2, l12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiddingTimeout)) {
            return false;
        }
        BiddingTimeout biddingTimeout = (BiddingTimeout) obj;
        return j.a(this.endTime, biddingTimeout.endTime) && j.a(this.f19374id, biddingTimeout.f19374id) && j.a(this.remainingTime, biddingTimeout.remainingTime) && j.a(this.roomId, biddingTimeout.roomId) && j.a(this.startTime, biddingTimeout.startTime);
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.f19374id;
    }

    public final Long getRemainingTime() {
        return this.remainingTime;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        Long l10 = this.endTime;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.f19374id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.remainingTime;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.roomId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.startTime;
        if (l12 != null) {
            i10 = l12.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        StringBuilder q10 = a.q("BiddingTimeout(endTime=");
        q10.append(this.endTime);
        q10.append(", id=");
        q10.append(this.f19374id);
        q10.append(", remainingTime=");
        q10.append(this.remainingTime);
        q10.append(", roomId=");
        q10.append(this.roomId);
        q10.append(", startTime=");
        q10.append(this.startTime);
        q10.append(')');
        return q10.toString();
    }
}
