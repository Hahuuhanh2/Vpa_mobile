package com.vpa.daugia.module.auction.data.model.sse;

import android.support.v4.media.a;
import cc.b;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: ResultRoomSSE.kt */
public final class ResultRoomSSE {
    @b("biddingRoomIds")
    private List<BiddingRoomId> biddingRoomIds;
    @b("sessionId")
    private Long sessionId;

    public ResultRoomSSE() {
        this((List) null, (Long) null, 3, (e) null);
    }

    public ResultRoomSSE(List<BiddingRoomId> list, Long l10) {
        this.biddingRoomIds = list;
        this.sessionId = l10;
    }

    public static /* synthetic */ ResultRoomSSE copy$default(ResultRoomSSE resultRoomSSE, List<BiddingRoomId> list, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = resultRoomSSE.biddingRoomIds;
        }
        if ((i10 & 2) != 0) {
            l10 = resultRoomSSE.sessionId;
        }
        return resultRoomSSE.copy(list, l10);
    }

    public final List<BiddingRoomId> component1() {
        return this.biddingRoomIds;
    }

    public final Long component2() {
        return this.sessionId;
    }

    public final ResultRoomSSE copy(List<BiddingRoomId> list, Long l10) {
        return new ResultRoomSSE(list, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRoomSSE)) {
            return false;
        }
        ResultRoomSSE resultRoomSSE = (ResultRoomSSE) obj;
        return j.a(this.biddingRoomIds, resultRoomSSE.biddingRoomIds) && j.a(this.sessionId, resultRoomSSE.sessionId);
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
        StringBuilder q10 = a.q("ResultRoomSSE(biddingRoomIds=");
        q10.append(this.biddingRoomIds);
        q10.append(", sessionId=");
        q10.append(this.sessionId);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResultRoomSSE(List list, Long l10, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : l10);
    }
}
