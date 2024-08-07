package com.vpa.daugia.module.common.data.model;

import android.support.v4.media.a;
import cc.b;
import sk.e;
import sk.j;

/* compiled from: AuctionRegulation.kt */
public final class AuctionRegulation {
    @b("biddingEndTime")
    private Integer biddingEndTime;
    @b("documentId")
    private Object documentId;
    @b("documentStatus")
    private Object documentStatus;
    @b("filename")
    private Object filename;
    @b("url")
    private Object url;

    public AuctionRegulation() {
        this((Integer) null, (Object) null, (Object) null, (Object) null, (Object) null, 31, (e) null);
    }

    public AuctionRegulation(Integer num, Object obj, Object obj2, Object obj3, Object obj4) {
        this.biddingEndTime = num;
        this.documentId = obj;
        this.documentStatus = obj2;
        this.filename = obj3;
        this.url = obj4;
    }

    public static /* synthetic */ AuctionRegulation copy$default(AuctionRegulation auctionRegulation, Integer num, Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5) {
        if ((i10 & 1) != 0) {
            num = auctionRegulation.biddingEndTime;
        }
        if ((i10 & 2) != 0) {
            obj = auctionRegulation.documentId;
        }
        Object obj6 = obj;
        if ((i10 & 4) != 0) {
            obj2 = auctionRegulation.documentStatus;
        }
        Object obj7 = obj2;
        if ((i10 & 8) != 0) {
            obj3 = auctionRegulation.filename;
        }
        Object obj8 = obj3;
        if ((i10 & 16) != 0) {
            obj4 = auctionRegulation.url;
        }
        return auctionRegulation.copy(num, obj6, obj7, obj8, obj4);
    }

    public final Integer component1() {
        return this.biddingEndTime;
    }

    public final Object component2() {
        return this.documentId;
    }

    public final Object component3() {
        return this.documentStatus;
    }

    public final Object component4() {
        return this.filename;
    }

    public final Object component5() {
        return this.url;
    }

    public final AuctionRegulation copy(Integer num, Object obj, Object obj2, Object obj3, Object obj4) {
        return new AuctionRegulation(num, obj, obj2, obj3, obj4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionRegulation)) {
            return false;
        }
        AuctionRegulation auctionRegulation = (AuctionRegulation) obj;
        return j.a(this.biddingEndTime, auctionRegulation.biddingEndTime) && j.a(this.documentId, auctionRegulation.documentId) && j.a(this.documentStatus, auctionRegulation.documentStatus) && j.a(this.filename, auctionRegulation.filename) && j.a(this.url, auctionRegulation.url);
    }

    public final Integer getBiddingEndTime() {
        return this.biddingEndTime;
    }

    public final Object getDocumentId() {
        return this.documentId;
    }

    public final Object getDocumentStatus() {
        return this.documentStatus;
    }

    public final Object getFilename() {
        return this.filename;
    }

    public final Object getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer num = this.biddingEndTime;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Object obj = this.documentId;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.documentStatus;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.filename;
        int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.url;
        if (obj4 != null) {
            i10 = obj4.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setBiddingEndTime(Integer num) {
        this.biddingEndTime = num;
    }

    public final void setDocumentId(Object obj) {
        this.documentId = obj;
    }

    public final void setDocumentStatus(Object obj) {
        this.documentStatus = obj;
    }

    public final void setFilename(Object obj) {
        this.filename = obj;
    }

    public final void setUrl(Object obj) {
        this.url = obj;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionRegulation(biddingEndTime=");
        q10.append(this.biddingEndTime);
        q10.append(", documentId=");
        q10.append(this.documentId);
        q10.append(", documentStatus=");
        q10.append(this.documentStatus);
        q10.append(", filename=");
        q10.append(this.filename);
        q10.append(", url=");
        q10.append(this.url);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AuctionRegulation(java.lang.Integer r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, int r10, sk.e r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.common.data.model.AuctionRegulation.<init>(java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, int, sk.e):void");
    }
}
