package com.vpa.daugia.module.auction.data.api.request;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: AwaitAuctionRequest.kt */
public final class AwaitAuctionRequest {
    @b("limit")
    private Integer limit;
    @b("page")
    private Integer page;
    @b("provinceId")
    private String provinceId;
    @b("search")
    private String search;
    @b("typeVehicle")
    private Integer typeVehicle;
    @b("vehicle")
    private Integer vehicle;

    public AwaitAuctionRequest() {
        this((Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (e) null);
    }

    public AwaitAuctionRequest(Integer num, Integer num2, String str, Integer num3, Integer num4, String str2) {
        this.limit = num;
        this.page = num2;
        this.provinceId = str;
        this.vehicle = num3;
        this.typeVehicle = num4;
        this.search = str2;
    }

    public static /* synthetic */ AwaitAuctionRequest copy$default(AwaitAuctionRequest awaitAuctionRequest, Integer num, Integer num2, String str, Integer num3, Integer num4, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = awaitAuctionRequest.limit;
        }
        if ((i10 & 2) != 0) {
            num2 = awaitAuctionRequest.page;
        }
        Integer num5 = num2;
        if ((i10 & 4) != 0) {
            str = awaitAuctionRequest.provinceId;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            num3 = awaitAuctionRequest.vehicle;
        }
        Integer num6 = num3;
        if ((i10 & 16) != 0) {
            num4 = awaitAuctionRequest.typeVehicle;
        }
        Integer num7 = num4;
        if ((i10 & 32) != 0) {
            str2 = awaitAuctionRequest.search;
        }
        return awaitAuctionRequest.copy(num, num5, str3, num6, num7, str2);
    }

    public final Integer component1() {
        return this.limit;
    }

    public final Integer component2() {
        return this.page;
    }

    public final String component3() {
        return this.provinceId;
    }

    public final Integer component4() {
        return this.vehicle;
    }

    public final Integer component5() {
        return this.typeVehicle;
    }

    public final String component6() {
        return this.search;
    }

    public final AwaitAuctionRequest copy(Integer num, Integer num2, String str, Integer num3, Integer num4, String str2) {
        return new AwaitAuctionRequest(num, num2, str, num3, num4, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwaitAuctionRequest)) {
            return false;
        }
        AwaitAuctionRequest awaitAuctionRequest = (AwaitAuctionRequest) obj;
        return j.a(this.limit, awaitAuctionRequest.limit) && j.a(this.page, awaitAuctionRequest.page) && j.a(this.provinceId, awaitAuctionRequest.provinceId) && j.a(this.vehicle, awaitAuctionRequest.vehicle) && j.a(this.typeVehicle, awaitAuctionRequest.typeVehicle) && j.a(this.search, awaitAuctionRequest.search);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final String getProvinceId() {
        return this.provinceId;
    }

    public final String getSearch() {
        return this.search;
    }

    public final Integer getTypeVehicle() {
        return this.typeVehicle;
    }

    public final Integer getVehicle() {
        return this.vehicle;
    }

    public int hashCode() {
        Integer num = this.limit;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.page;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.provinceId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.vehicle;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.typeVehicle;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.search;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setPage(Integer num) {
        this.page = num;
    }

    public final void setProvinceId(String str) {
        this.provinceId = str;
    }

    public final void setSearch(String str) {
        this.search = str;
    }

    public final void setTypeVehicle(Integer num) {
        this.typeVehicle = num;
    }

    public final void setVehicle(Integer num) {
        this.vehicle = num;
    }

    public String toString() {
        StringBuilder q10 = a.q("AwaitAuctionRequest(limit=");
        q10.append(this.limit);
        q10.append(", page=");
        q10.append(this.page);
        q10.append(", provinceId=");
        q10.append(this.provinceId);
        q10.append(", vehicle=");
        q10.append(this.vehicle);
        q10.append(", typeVehicle=");
        q10.append(this.typeVehicle);
        q10.append(", search=");
        return l.k(q10, this.search, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AwaitAuctionRequest(java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, int r11, sk.e r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x000a
            r5 = 20
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x000a:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0013
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0013:
            r12 = r6
            r6 = r11 & 4
            r0 = 0
            if (r6 == 0) goto L_0x001b
            r1 = r0
            goto L_0x001c
        L_0x001b:
            r1 = r7
        L_0x001c:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0022
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r2 = r8
        L_0x0023:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0029
            r3 = r0
            goto L_0x002a
        L_0x0029:
            r3 = r9
        L_0x002a:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r10
        L_0x0030:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, int, sk.e):void");
    }
}
