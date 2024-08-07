package com.vpa.daugia.module.home.data.api.request;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: NotifyAuctionRequest.kt */
public final class NotifyAuctionRequest {
    @b("fromDate")
    private Long fromDate;
    @b("limit")
    private Integer limit;
    @b("page")
    private Integer page;
    @b("search")
    private String search;
    @b("toDate")
    private Long toDate;
    @b("totalPages")
    private Integer totalPages;

    public NotifyAuctionRequest() {
        this((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, 63, (e) null);
    }

    public NotifyAuctionRequest(Integer num, Integer num2, Long l10, Long l11, String str, Integer num3) {
        this.page = num;
        this.limit = num2;
        this.fromDate = l10;
        this.toDate = l11;
        this.search = str;
        this.totalPages = num3;
    }

    public static /* synthetic */ NotifyAuctionRequest copy$default(NotifyAuctionRequest notifyAuctionRequest, Integer num, Integer num2, Long l10, Long l11, String str, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = notifyAuctionRequest.page;
        }
        if ((i10 & 2) != 0) {
            num2 = notifyAuctionRequest.limit;
        }
        Integer num4 = num2;
        if ((i10 & 4) != 0) {
            l10 = notifyAuctionRequest.fromDate;
        }
        Long l12 = l10;
        if ((i10 & 8) != 0) {
            l11 = notifyAuctionRequest.toDate;
        }
        Long l13 = l11;
        if ((i10 & 16) != 0) {
            str = notifyAuctionRequest.search;
        }
        String str2 = str;
        if ((i10 & 32) != 0) {
            num3 = notifyAuctionRequest.totalPages;
        }
        return notifyAuctionRequest.copy(num, num4, l12, l13, str2, num3);
    }

    public final Integer component1() {
        return this.page;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final Long component3() {
        return this.fromDate;
    }

    public final Long component4() {
        return this.toDate;
    }

    public final String component5() {
        return this.search;
    }

    public final Integer component6() {
        return this.totalPages;
    }

    public final NotifyAuctionRequest copy(Integer num, Integer num2, Long l10, Long l11, String str, Integer num3) {
        return new NotifyAuctionRequest(num, num2, l10, l11, str, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyAuctionRequest)) {
            return false;
        }
        NotifyAuctionRequest notifyAuctionRequest = (NotifyAuctionRequest) obj;
        return j.a(this.page, notifyAuctionRequest.page) && j.a(this.limit, notifyAuctionRequest.limit) && j.a(this.fromDate, notifyAuctionRequest.fromDate) && j.a(this.toDate, notifyAuctionRequest.toDate) && j.a(this.search, notifyAuctionRequest.search) && j.a(this.totalPages, notifyAuctionRequest.totalPages);
    }

    public final Long getFromDate() {
        return this.fromDate;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final int getPageSize() {
        if (this.page == null && this.totalPages == null) {
            return 20;
        }
        Integer num = this.limit;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getSearch() {
        return this.search;
    }

    public final Long getToDate() {
        return this.toDate;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final boolean hasMoreData() {
        int i10;
        int i11;
        Integer num = this.page;
        if (num == null && this.totalPages == null) {
            return true;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        Integer num2 = this.totalPages;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = 0;
        }
        if (i10 < i11 - 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.page;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.limit;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.fromDate;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.toDate;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.search;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.totalPages;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode5 + i10;
    }

    public final int nextOffset() {
        int i10;
        Integer num = this.page;
        int i11 = 0;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        Integer num2 = this.limit;
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return i12 * i11;
    }

    public final int nextPage() {
        Integer num = this.page;
        int i10 = 0;
        if (num == null && this.totalPages == null) {
            return 0;
        }
        if (num != null) {
            i10 = num.intValue();
        }
        return i10 + 1;
    }

    public final void setFromDate(Long l10) {
        this.fromDate = l10;
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

    public final void setToDate(Long l10) {
        this.toDate = l10;
    }

    public final void setTotalPages(Integer num) {
        this.totalPages = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("NotifyAuctionRequest(page=");
        q10.append(this.page);
        q10.append(", limit=");
        q10.append(this.limit);
        q10.append(", fromDate=");
        q10.append(this.fromDate);
        q10.append(", toDate=");
        q10.append(this.toDate);
        q10.append(", search=");
        q10.append(this.search);
        q10.append(", totalPages=");
        q10.append(this.totalPages);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotifyAuctionRequest(java.lang.Integer r6, java.lang.Integer r7, java.lang.Long r8, java.lang.Long r9, java.lang.String r10, java.lang.Integer r11, int r12, sk.e r13) {
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
            if (r6 == 0) goto L_0x0012
            r6 = 20
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            java.lang.String r10 = ""
        L_0x0027:
            r4 = r10
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest.<init>(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, int, sk.e):void");
    }
}
