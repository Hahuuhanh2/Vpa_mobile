package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: News.kt */
public final class News implements Serializable {
    @b("author")
    private String author;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Long f19667id;
    @b("publishedAt")
    private Long publishedAt;
    @b("summary")
    private String summary;
    @b("thumbnailUrl")
    private String thumbnailUrl;
    @b("title")
    private String title;

    public News() {
        this((String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 63, (e) null);
    }

    public News(String str, Long l10, Long l11, String str2, String str3, String str4) {
        this.author = str;
        this.f19667id = l10;
        this.publishedAt = l11;
        this.summary = str2;
        this.thumbnailUrl = str3;
        this.title = str4;
    }

    public static /* synthetic */ News copy$default(News news, String str, Long l10, Long l11, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = news.author;
        }
        if ((i10 & 2) != 0) {
            l10 = news.f19667id;
        }
        Long l12 = l10;
        if ((i10 & 4) != 0) {
            l11 = news.publishedAt;
        }
        Long l13 = l11;
        if ((i10 & 8) != 0) {
            str2 = news.summary;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = news.thumbnailUrl;
        }
        String str6 = str3;
        if ((i10 & 32) != 0) {
            str4 = news.title;
        }
        return news.copy(str, l12, l13, str5, str6, str4);
    }

    public final String component1() {
        return this.author;
    }

    public final Long component2() {
        return this.f19667id;
    }

    public final Long component3() {
        return this.publishedAt;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.thumbnailUrl;
    }

    public final String component6() {
        return this.title;
    }

    public final News copy(String str, Long l10, Long l11, String str2, String str3, String str4) {
        return new News(str, l10, l11, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof News)) {
            return false;
        }
        News news = (News) obj;
        return j.a(this.author, news.author) && j.a(this.f19667id, news.f19667id) && j.a(this.publishedAt, news.publishedAt) && j.a(this.summary, news.summary) && j.a(this.thumbnailUrl, news.thumbnailUrl) && j.a(this.title, news.title);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Long getId() {
        return this.f19667id;
    }

    public final Long getPublishedAt() {
        return this.publishedAt;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.author;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f19667id;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.publishedAt;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.summary;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setId(Long l10) {
        this.f19667id = l10;
    }

    public final void setPublishedAt(Long l10) {
        this.publishedAt = l10;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public final void setThumbnailUrl(String str) {
        this.thumbnailUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder q10 = a.q("News(author=");
        q10.append(this.author);
        q10.append(", id=");
        q10.append(this.f19667id);
        q10.append(", publishedAt=");
        q10.append(this.publishedAt);
        q10.append(", summary=");
        q10.append(this.summary);
        q10.append(", thumbnailUrl=");
        q10.append(this.thumbnailUrl);
        q10.append(", title=");
        return l.k(q10, this.title, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ News(java.lang.String r6, java.lang.Long r7, java.lang.Long r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, sk.e r13) {
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
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.home.data.model.News.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
