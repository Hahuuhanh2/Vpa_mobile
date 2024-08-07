package com.vpa.daugia.module.common.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: WinningAnnounce.kt */
public final class WinningAnnounce {
    @b("biddingEndTime")
    private Long biddingEndTime;
    @b("documentId")
    private Long documentId;
    @b("documentStatus")
    private Integer documentStatus;
    @b("filename")
    private String filename;
    @b("url")
    private String url;

    public WinningAnnounce() {
        this((Long) null, (Long) null, (Integer) null, (String) null, (String) null, 31, (e) null);
    }

    public WinningAnnounce(Long l10, Long l11, Integer num, String str, String str2) {
        this.biddingEndTime = l10;
        this.documentId = l11;
        this.documentStatus = num;
        this.filename = str;
        this.url = str2;
    }

    public static /* synthetic */ WinningAnnounce copy$default(WinningAnnounce winningAnnounce, Long l10, Long l11, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = winningAnnounce.biddingEndTime;
        }
        if ((i10 & 2) != 0) {
            l11 = winningAnnounce.documentId;
        }
        Long l12 = l11;
        if ((i10 & 4) != 0) {
            num = winningAnnounce.documentStatus;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            str = winningAnnounce.filename;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = winningAnnounce.url;
        }
        return winningAnnounce.copy(l10, l12, num2, str3, str2);
    }

    public final Long component1() {
        return this.biddingEndTime;
    }

    public final Long component2() {
        return this.documentId;
    }

    public final Integer component3() {
        return this.documentStatus;
    }

    public final String component4() {
        return this.filename;
    }

    public final String component5() {
        return this.url;
    }

    public final WinningAnnounce copy(Long l10, Long l11, Integer num, String str, String str2) {
        return new WinningAnnounce(l10, l11, num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinningAnnounce)) {
            return false;
        }
        WinningAnnounce winningAnnounce = (WinningAnnounce) obj;
        return j.a(this.biddingEndTime, winningAnnounce.biddingEndTime) && j.a(this.documentId, winningAnnounce.documentId) && j.a(this.documentStatus, winningAnnounce.documentStatus) && j.a(this.filename, winningAnnounce.filename) && j.a(this.url, winningAnnounce.url);
    }

    public final Long getBiddingEndTime() {
        return this.biddingEndTime;
    }

    public final Long getDocumentId() {
        return this.documentId;
    }

    public final Integer getDocumentStatus() {
        return this.documentStatus;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l10 = this.biddingEndTime;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.documentId;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.documentStatus;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.filename;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setBiddingEndTime(Long l10) {
        this.biddingEndTime = l10;
    }

    public final void setDocumentId(Long l10) {
        this.documentId = l10;
    }

    public final void setDocumentStatus(Integer num) {
        this.documentStatus = num;
    }

    public final void setFilename(String str) {
        this.filename = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("WinningAnnounce(biddingEndTime=");
        q10.append(this.biddingEndTime);
        q10.append(", documentId=");
        q10.append(this.documentId);
        q10.append(", documentStatus=");
        q10.append(this.documentStatus);
        q10.append(", filename=");
        q10.append(this.filename);
        q10.append(", url=");
        return l.k(q10, this.url, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WinningAnnounce(java.lang.Long r5, java.lang.Long r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, int r10, sk.e r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.common.data.model.WinningAnnounce.<init>(java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
