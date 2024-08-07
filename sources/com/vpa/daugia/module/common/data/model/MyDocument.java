package com.vpa.daugia.module.common.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import sk.e;
import sk.j;

/* compiled from: MyDocument.kt */
public final class MyDocument implements Serializable {
    @b("auctionNotification")
    private AuctionNotification auctionNotification;
    @b("auctionRegulation")
    private AuctionRegulation auctionRegulation;
    @b("auctionTime")
    private Long auctionTime;
    @b("licensePlate")
    private String licensePlate;
    @b("promulgateRegulation")
    private PromulgateRegulation promulgateRegulation;
    @b("reConfirm")
    private Integer reConfirm;
    @b("winningAnnounce")
    private WinningAnnounce winningAnnounce;

    public MyDocument() {
        this((AuctionNotification) null, (AuctionRegulation) null, (Long) null, (String) null, (PromulgateRegulation) null, (Integer) null, (WinningAnnounce) null, 127, (e) null);
    }

    public MyDocument(AuctionNotification auctionNotification2, AuctionRegulation auctionRegulation2, Long l10, String str, PromulgateRegulation promulgateRegulation2, Integer num, WinningAnnounce winningAnnounce2) {
        this.auctionNotification = auctionNotification2;
        this.auctionRegulation = auctionRegulation2;
        this.auctionTime = l10;
        this.licensePlate = str;
        this.promulgateRegulation = promulgateRegulation2;
        this.reConfirm = num;
        this.winningAnnounce = winningAnnounce2;
    }

    public static /* synthetic */ MyDocument copy$default(MyDocument myDocument, AuctionNotification auctionNotification2, AuctionRegulation auctionRegulation2, Long l10, String str, PromulgateRegulation promulgateRegulation2, Integer num, WinningAnnounce winningAnnounce2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            auctionNotification2 = myDocument.auctionNotification;
        }
        if ((i10 & 2) != 0) {
            auctionRegulation2 = myDocument.auctionRegulation;
        }
        AuctionRegulation auctionRegulation3 = auctionRegulation2;
        if ((i10 & 4) != 0) {
            l10 = myDocument.auctionTime;
        }
        Long l11 = l10;
        if ((i10 & 8) != 0) {
            str = myDocument.licensePlate;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            promulgateRegulation2 = myDocument.promulgateRegulation;
        }
        PromulgateRegulation promulgateRegulation3 = promulgateRegulation2;
        if ((i10 & 32) != 0) {
            num = myDocument.reConfirm;
        }
        Integer num2 = num;
        if ((i10 & 64) != 0) {
            winningAnnounce2 = myDocument.winningAnnounce;
        }
        return myDocument.copy(auctionNotification2, auctionRegulation3, l11, str2, promulgateRegulation3, num2, winningAnnounce2);
    }

    public final AuctionNotification component1() {
        return this.auctionNotification;
    }

    public final AuctionRegulation component2() {
        return this.auctionRegulation;
    }

    public final Long component3() {
        return this.auctionTime;
    }

    public final String component4() {
        return this.licensePlate;
    }

    public final PromulgateRegulation component5() {
        return this.promulgateRegulation;
    }

    public final Integer component6() {
        return this.reConfirm;
    }

    public final WinningAnnounce component7() {
        return this.winningAnnounce;
    }

    public final MyDocument copy(AuctionNotification auctionNotification2, AuctionRegulation auctionRegulation2, Long l10, String str, PromulgateRegulation promulgateRegulation2, Integer num, WinningAnnounce winningAnnounce2) {
        return new MyDocument(auctionNotification2, auctionRegulation2, l10, str, promulgateRegulation2, num, winningAnnounce2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyDocument)) {
            return false;
        }
        MyDocument myDocument = (MyDocument) obj;
        return j.a(this.auctionNotification, myDocument.auctionNotification) && j.a(this.auctionRegulation, myDocument.auctionRegulation) && j.a(this.auctionTime, myDocument.auctionTime) && j.a(this.licensePlate, myDocument.licensePlate) && j.a(this.promulgateRegulation, myDocument.promulgateRegulation) && j.a(this.reConfirm, myDocument.reConfirm) && j.a(this.winningAnnounce, myDocument.winningAnnounce);
    }

    public final AuctionNotification getAuctionNotification() {
        return this.auctionNotification;
    }

    public final AuctionRegulation getAuctionRegulation() {
        return this.auctionRegulation;
    }

    public final Long getAuctionTime() {
        return this.auctionTime;
    }

    public final String getLicensePlate() {
        return this.licensePlate;
    }

    public final PromulgateRegulation getPromulgateRegulation() {
        return this.promulgateRegulation;
    }

    public final Integer getReConfirm() {
        return this.reConfirm;
    }

    public final WinningAnnounce getWinningAnnounce() {
        return this.winningAnnounce;
    }

    public int hashCode() {
        AuctionNotification auctionNotification2 = this.auctionNotification;
        int i10 = 0;
        int hashCode = (auctionNotification2 == null ? 0 : auctionNotification2.hashCode()) * 31;
        AuctionRegulation auctionRegulation2 = this.auctionRegulation;
        int hashCode2 = (hashCode + (auctionRegulation2 == null ? 0 : auctionRegulation2.hashCode())) * 31;
        Long l10 = this.auctionTime;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.licensePlate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PromulgateRegulation promulgateRegulation2 = this.promulgateRegulation;
        int hashCode5 = (hashCode4 + (promulgateRegulation2 == null ? 0 : promulgateRegulation2.hashCode())) * 31;
        Integer num = this.reConfirm;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        WinningAnnounce winningAnnounce2 = this.winningAnnounce;
        if (winningAnnounce2 != null) {
            i10 = winningAnnounce2.hashCode();
        }
        return hashCode6 + i10;
    }

    public final void setAuctionNotification(AuctionNotification auctionNotification2) {
        this.auctionNotification = auctionNotification2;
    }

    public final void setAuctionRegulation(AuctionRegulation auctionRegulation2) {
        this.auctionRegulation = auctionRegulation2;
    }

    public final void setAuctionTime(Long l10) {
        this.auctionTime = l10;
    }

    public final void setLicensePlate(String str) {
        this.licensePlate = str;
    }

    public final void setPromulgateRegulation(PromulgateRegulation promulgateRegulation2) {
        this.promulgateRegulation = promulgateRegulation2;
    }

    public final void setReConfirm(Integer num) {
        this.reConfirm = num;
    }

    public final void setWinningAnnounce(WinningAnnounce winningAnnounce2) {
        this.winningAnnounce = winningAnnounce2;
    }

    public String toString() {
        StringBuilder q10 = a.q("MyDocument(auctionNotification=");
        q10.append(this.auctionNotification);
        q10.append(", auctionRegulation=");
        q10.append(this.auctionRegulation);
        q10.append(", auctionTime=");
        q10.append(this.auctionTime);
        q10.append(", licensePlate=");
        q10.append(this.licensePlate);
        q10.append(", promulgateRegulation=");
        q10.append(this.promulgateRegulation);
        q10.append(", reConfirm=");
        q10.append(this.reConfirm);
        q10.append(", winningAnnounce=");
        q10.append(this.winningAnnounce);
        q10.append(')');
        return q10.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MyDocument(com.vpa.daugia.module.common.data.model.AuctionNotification r7, com.vpa.daugia.module.common.data.model.AuctionRegulation r8, java.lang.Long r9, java.lang.String r10, com.vpa.daugia.module.common.data.model.PromulgateRegulation r11, java.lang.Integer r12, com.vpa.daugia.module.common.data.model.WinningAnnounce r13, int r14, sk.e r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.common.data.model.MyDocument.<init>(com.vpa.daugia.module.common.data.model.AuctionNotification, com.vpa.daugia.module.common.data.model.AuctionRegulation, java.lang.Long, java.lang.String, com.vpa.daugia.module.common.data.model.PromulgateRegulation, java.lang.Integer, com.vpa.daugia.module.common.data.model.WinningAnnounce, int, sk.e):void");
    }
}
