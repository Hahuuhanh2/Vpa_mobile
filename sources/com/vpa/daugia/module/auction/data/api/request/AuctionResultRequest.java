package com.vpa.daugia.module.auction.data.api.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: AuctionResultRequest.kt */
public final class AuctionResultRequest {
    @b("limit")
    private Integer limit;
    @b("page")
    private Integer page;
    @b("search")
    private String search;
    @b("sessionId")
    private String sessionId;

    public AuctionResultRequest() {
        this((Integer) null, (Integer) null, (String) null, (String) null, 15, (e) null);
    }

    public AuctionResultRequest(Integer num, Integer num2, String str, String str2) {
        this.limit = num;
        this.page = num2;
        this.search = str;
        this.sessionId = str2;
    }

    public static /* synthetic */ AuctionResultRequest copy$default(AuctionResultRequest auctionResultRequest, Integer num, Integer num2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = auctionResultRequest.limit;
        }
        if ((i10 & 2) != 0) {
            num2 = auctionResultRequest.page;
        }
        if ((i10 & 4) != 0) {
            str = auctionResultRequest.search;
        }
        if ((i10 & 8) != 0) {
            str2 = auctionResultRequest.sessionId;
        }
        return auctionResultRequest.copy(num, num2, str, str2);
    }

    public final Integer component1() {
        return this.limit;
    }

    public final Integer component2() {
        return this.page;
    }

    public final String component3() {
        return this.search;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final AuctionResultRequest copy(Integer num, Integer num2, String str, String str2) {
        return new AuctionResultRequest(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionResultRequest)) {
            return false;
        }
        AuctionResultRequest auctionResultRequest = (AuctionResultRequest) obj;
        return j.a(this.limit, auctionResultRequest.limit) && j.a(this.page, auctionResultRequest.page) && j.a(this.search, auctionResultRequest.search) && j.a(this.sessionId, auctionResultRequest.sessionId);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final String getSearch() {
        return this.search;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        Integer num = this.limit;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.page;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.search;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setPage(Integer num) {
        this.page = num;
    }

    public final void setSearch(String str) {
        this.search = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionResultRequest(limit=");
        q10.append(this.limit);
        q10.append(", page=");
        q10.append(this.page);
        q10.append(", search=");
        q10.append(this.search);
        q10.append(", sessionId=");
        return l.k(q10, this.sessionId, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuctionResultRequest(Integer num, Integer num2, String str, String str2, int i10, e eVar) {
        this((i10 & 1) != 0 ? 20 : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
