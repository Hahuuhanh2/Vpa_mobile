package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: EndRoomSSE.kt */
public final class EndRoomSSE {
    @b("biddingRoomIds")
    private List<BiddingRoomId> biddingRoomIds;
    @b("sessionId")
    private Long sessionId;

    public EndRoomSSE() {
        this((List) null, (Long) null, 3, (e) null);
    }

    public EndRoomSSE(List<BiddingRoomId> list, Long l10) {
        this.biddingRoomIds = list;
        this.sessionId = l10;
    }

    public static /* synthetic */ EndRoomSSE copy$default(EndRoomSSE endRoomSSE, List<BiddingRoomId> list, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = endRoomSSE.biddingRoomIds;
        }
        if ((i10 & 2) != 0) {
            l10 = endRoomSSE.sessionId;
        }
        return endRoomSSE.copy(list, l10);
    }

    public final List<BiddingRoomId> component1() {
        return this.biddingRoomIds;
    }

    public final Long component2() {
        return this.sessionId;
    }

    public final EndRoomSSE copy(List<BiddingRoomId> list, Long l10) {
        return new EndRoomSSE(list, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndRoomSSE)) {
            return false;
        }
        EndRoomSSE endRoomSSE = (EndRoomSSE) obj;
        return j.a(this.biddingRoomIds, endRoomSSE.biddingRoomIds) && j.a(this.sessionId, endRoomSSE.sessionId);
    }

    public final List<BiddingRoomId> getBiddingRoomIds() {
        return this.biddingRoomIds;
    }

    public final Long getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        List<BiddingRoomId> list = this.biddingRoomIds;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l10 = this.sessionId;
        if (l10 != null) {
            i10 = l10.hashCode();
        }
        return hashCode + i10;
    }

    public final void setBiddingRoomIds(List<BiddingRoomId> list) {
        this.biddingRoomIds = list;
    }

    public final void setSessionId(Long l10) {
        this.sessionId = l10;
    }

    public String toString() {
        StringBuilder q10 = a.q("EndRoomSSE(biddingRoomIds=");
        q10.append(this.biddingRoomIds);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EndRoomSSE(List list, Long l10, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : l10);
    }
}
