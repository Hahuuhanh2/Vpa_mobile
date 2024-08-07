package com.vpa.daugia.module.support.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: Article.kt */
public final class Article {
    @b("articleContent")
    private String articleContent;
    @b("articleId")
    private Long articleId;
    @b("attachments")
    private Object attachments;
    @b("author")
    private String author;
    @b("categoryId")
    private Long categoryId;
    @b("categoryTitle")
    private String categoryTitle;
    @b("publishedAt")
    private Long publishedAt;
    @b("source")
    private String source;
    @b("summary")
    private String summary;
    @b("thumbnailUrl")
    private String thumbnailUrl;
    @b("title")
    private String title;

    public Article() {
        this((String) null, (Long) null, (Object) null, (String) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 2047, (e) null);
    }

    public Article(String str, Long l10, Object obj, String str2, Long l11, String str3, Long l12, String str4, String str5, String str6, String str7) {
        this.articleContent = str;
        this.articleId = l10;
        this.attachments = obj;
        this.author = str2;
        this.categoryId = l11;
        this.categoryTitle = str3;
        this.publishedAt = l12;
        this.source = str4;
        this.summary = str5;
        this.thumbnailUrl = str6;
        this.title = str7;
    }

    public static /* synthetic */ Article copy$default(Article article, String str, Long l10, Object obj, String str2, Long l11, String str3, Long l12, String str4, String str5, String str6, String str7, int i10, Object obj2) {
        Article article2 = article;
        int i11 = i10;
        return article.copy((i11 & 1) != 0 ? article2.articleContent : str, (i11 & 2) != 0 ? article2.articleId : l10, (i11 & 4) != 0 ? article2.attachments : obj, (i11 & 8) != 0 ? article2.author : str2, (i11 & 16) != 0 ? article2.categoryId : l11, (i11 & 32) != 0 ? article2.categoryTitle : str3, (i11 & 64) != 0 ? article2.publishedAt : l12, (i11 & 128) != 0 ? article2.source : str4, (i11 & 256) != 0 ? article2.summary : str5, (i11 & 512) != 0 ? article2.thumbnailUrl : str6, (i11 & 1024) != 0 ? article2.title : str7);
    }

    public final String component1() {
        return this.articleContent;
    }

    public final String component10() {
        return this.thumbnailUrl;
    }

    public final String component11() {
        return this.title;
    }

    public final Long component2() {
        return this.articleId;
    }

    public final Object component3() {
        return this.attachments;
    }

    public final String component4() {
        return this.author;
    }

    public final Long component5() {
        return this.categoryId;
    }

    public final String component6() {
        return this.categoryTitle;
    }

    public final Long component7() {
        return this.publishedAt;
    }

    public final String component8() {
        return this.source;
    }

    public final String component9() {
        return this.summary;
    }

    public final Article copy(String str, Long l10, Object obj, String str2, Long l11, String str3, Long l12, String str4, String str5, String str6, String str7) {
        return new Article(str, l10, obj, str2, l11, str3, l12, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return j.a(this.articleContent, article.articleContent) && j.a(this.articleId, article.articleId) && j.a(this.attachments, article.attachments) && j.a(this.author, article.author) && j.a(this.categoryId, article.categoryId) && j.a(this.categoryTitle, article.categoryTitle) && j.a(this.publishedAt, article.publishedAt) && j.a(this.source, article.source) && j.a(this.summary, article.summary) && j.a(this.thumbnailUrl, article.thumbnailUrl) && j.a(this.title, article.title);
    }

    public final String getArticleContent() {
        return this.articleContent;
    }

    public final Long getArticleId() {
        return this.articleId;
    }

    public final Object getAttachments() {
        return this.attachments;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final Long getPublishedAt() {
        return this.publishedAt;
    }

    public final String getSource() {
        return this.source;
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
        String str = this.articleContent;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.articleId;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Object obj = this.attachments;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.author;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.categoryId;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.categoryTitle;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.publishedAt;
        int hashCode7 = (hashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.source;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.summary;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thumbnailUrl;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode10 + i10;
    }

    public final void setArticleContent(String str) {
        this.articleContent = str;
    }

    public final void setArticleId(Long l10) {
        this.articleId = l10;
    }

    public final void setAttachments(Object obj) {
        this.attachments = obj;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setCategoryId(Long l10) {
        this.categoryId = l10;
    }

    public final void setCategoryTitle(String str) {
        this.categoryTitle = str;
    }

    public final void setPublishedAt(Long l10) {
        this.publishedAt = l10;
    }

    public final void setSource(String str) {
        this.source = str;
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
        StringBuilder q10 = a.q("Article(articleContent=");
        q10.append(this.articleContent);
        q10.append(", articleId=");
        q10.append(this.articleId);
        q10.append(", attachments=");
        q10.append(this.attachments);
        q10.append(", author=");
        q10.append(this.author);
        q10.append(", categoryId=");
        q10.append(this.categoryId);
        q10.append(", categoryTitle=");
        q10.append(this.categoryTitle);
        q10.append(", publishedAt=");
        q10.append(this.publishedAt);
        q10.append(", source=");
        q10.append(this.source);
        q10.append(", summary=");
        q10.append(this.summary);
        q10.append(", thumbnailUrl=");
        q10.append(this.thumbnailUrl);
        q10.append(", title=");
        return l.k(q10, this.title, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Article(java.lang.String r13, java.lang.Long r14, java.lang.Object r15, java.lang.String r16, java.lang.Long r17, java.lang.String r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, sk.e r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.support.data.model.Article.<init>(java.lang.String, java.lang.Long, java.lang.Object, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
