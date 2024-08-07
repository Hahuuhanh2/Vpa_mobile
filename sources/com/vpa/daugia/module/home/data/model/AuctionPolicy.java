package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: AuctionPolicy.kt */
public final class AuctionPolicy {
    @b("createDate")
    private String createDate;
    @b("htmlContent")
    private String htmlContent;
    @b("namePolicy")
    private String namePolicy;

    public AuctionPolicy() {
        this((String) null, (String) null, (String) null, 7, (e) null);
    }

    public AuctionPolicy(String str, String str2, String str3) {
        this.createDate = str;
        this.htmlContent = str2;
        this.namePolicy = str3;
    }

    public static /* synthetic */ AuctionPolicy copy$default(AuctionPolicy auctionPolicy, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = auctionPolicy.createDate;
        }
        if ((i10 & 2) != 0) {
            str2 = auctionPolicy.htmlContent;
        }
        if ((i10 & 4) != 0) {
            str3 = auctionPolicy.namePolicy;
        }
        return auctionPolicy.copy(str, str2, str3);
    }

    public final String component1() {
        return this.createDate;
    }

    public final String component2() {
        return this.htmlContent;
    }

    public final String component3() {
        return this.namePolicy;
    }

    public final AuctionPolicy copy(String str, String str2, String str3) {
        return new AuctionPolicy(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionPolicy)) {
            return false;
        }
        AuctionPolicy auctionPolicy = (AuctionPolicy) obj;
        return j.a(this.createDate, auctionPolicy.createDate) && j.a(this.htmlContent, auctionPolicy.htmlContent) && j.a(this.namePolicy, auctionPolicy.namePolicy);
    }

    public final String getCreateDate() {
        return this.createDate;
    }

    public final String getHtmlContent() {
        return this.htmlContent;
    }

    public final String getNamePolicy() {
        return this.namePolicy;
    }

    public int hashCode() {
        String str = this.createDate;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.htmlContent;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.namePolicy;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setCreateDate(String str) {
        this.createDate = str;
    }

    public final void setHtmlContent(String str) {
        this.htmlContent = str;
    }

    public final void setNamePolicy(String str) {
        this.namePolicy = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("AuctionPolicy(createDate=");
        q10.append(this.createDate);
        q10.append(", htmlContent=");
        q10.append(this.htmlContent);
        q10.append(", namePolicy=");
        return l.k(q10, this.namePolicy, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuctionPolicy(String str, String str2, String str3, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
