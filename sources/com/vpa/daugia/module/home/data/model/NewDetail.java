package com.vpa.daugia.module.home.data.model;

import android.support.v4.media.a;
import cc.b;
import n0.l;
import sk.e;
import sk.j;

/* compiled from: NewDetail.kt */
public final class NewDetail {
    @b("articleId")
    private Long articleId;
    @b("author")
    private String author;
    @b("categoryId")
    private Long categoryId;
    @b("categoryTitle")
    private String categoryTitle;
    @b("content")
    private String content;
    @b("description")
    private Object description;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f19666id;
    @b("publishedAt")
    private Double publishedAt;
    @b("source")
    private String source;
    @b("summary")
    private String summary;
    @b("thumbnailUrl")
    private String thumbnailUrl;
    @b("title")
    private String title;

    public NewDetail() {
        this((Long) null, (String) null, (Long) null, (String) null, (String) null, (Object) null, (String) null, (Double) null, (String) null, (String) null, (String) null, (String) null, 4095, (e) null);
    }

    public NewDetail(Long l10, String str, Long l11, String str2, String str3, Object obj, String str4, Double d10, String str5, String str6, String str7, String str8) {
        this.articleId = l10;
        this.author = str;
        this.categoryId = l11;
        this.categoryTitle = str2;
        this.content = str3;
        this.description = obj;
        this.f19666id = str4;
        this.publishedAt = d10;
        this.source = str5;
        this.summary = str6;
        this.thumbnailUrl = str7;
        this.title = str8;
    }

    public static /* synthetic */ NewDetail copy$default(NewDetail newDetail, Long l10, String str, Long l11, String str2, String str3, Object obj, String str4, Double d10, String str5, String str6, String str7, String str8, int i10, Object obj2) {
        NewDetail newDetail2 = newDetail;
        int i11 = i10;
        return newDetail.copy((i11 & 1) != 0 ? newDetail2.articleId : l10, (i11 & 2) != 0 ? newDetail2.author : str, (i11 & 4) != 0 ? newDetail2.categoryId : l11, (i11 & 8) != 0 ? newDetail2.categoryTitle : str2, (i11 & 16) != 0 ? newDetail2.content : str3, (i11 & 32) != 0 ? newDetail2.description : obj, (i11 & 64) != 0 ? newDetail2.f19666id : str4, (i11 & 128) != 0 ? newDetail2.publishedAt : d10, (i11 & 256) != 0 ? newDetail2.source : str5, (i11 & 512) != 0 ? newDetail2.summary : str6, (i11 & 1024) != 0 ? newDetail2.thumbnailUrl : str7, (i11 & 2048) != 0 ? newDetail2.title : str8);
    }

    public final Long component1() {
        return this.articleId;
    }

    public final String component10() {
        return this.summary;
    }

    public final String component11() {
        return this.thumbnailUrl;
    }

    public final String component12() {
        return this.title;
    }

    public final String component2() {
        return this.author;
    }

    public final Long component3() {
        return this.categoryId;
    }

    public final String component4() {
        return this.categoryTitle;
    }

    public final String component5() {
        return this.content;
    }

    public final Object component6() {
        return this.description;
    }

    public final String component7() {
        return this.f19666id;
    }

    public final Double component8() {
        return this.publishedAt;
    }

    public final String component9() {
        return this.source;
    }

    public final NewDetail copy(Long l10, String str, Long l11, String str2, String str3, Object obj, String str4, Double d10, String str5, String str6, String str7, String str8) {
        return new NewDetail(l10, str, l11, str2, str3, obj, str4, d10, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewDetail)) {
            return false;
        }
        NewDetail newDetail = (NewDetail) obj;
        return j.a(this.articleId, newDetail.articleId) && j.a(this.author, newDetail.author) && j.a(this.categoryId, newDetail.categoryId) && j.a(this.categoryTitle, newDetail.categoryTitle) && j.a(this.content, newDetail.content) && j.a(this.description, newDetail.description) && j.a(this.f19666id, newDetail.f19666id) && j.a(this.publishedAt, newDetail.publishedAt) && j.a(this.source, newDetail.source) && j.a(this.summary, newDetail.summary) && j.a(this.thumbnailUrl, newDetail.thumbnailUrl) && j.a(this.title, newDetail.title);
    }

    public final Long getArticleId() {
        return this.articleId;
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

    public final String getContent() {
        return this.content;
    }

    public final Object getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f19666id;
    }

    public final Double getPublishedAt() {
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
        Long l10 = this.articleId;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.author;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.categoryId;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.categoryTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.description;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.f19666id;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d10 = this.publishedAt;
        int hashCode8 = (hashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str5 = this.source;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.summary;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.thumbnailUrl;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.title;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return hashCode11 + i10;
    }

    public final void setArticleId(Long l10) {
        this.articleId = l10;
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

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setDescription(Object obj) {
        this.description = obj;
    }

    public final void setId(String str) {
        this.f19666id = str;
    }

    public final void setPublishedAt(Double d10) {
        this.publishedAt = d10;
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
        StringBuilder q10 = a.q("NewDetail(articleId=");
        q10.append(this.articleId);
        q10.append(", author=");
        q10.append(this.author);
        q10.append(", categoryId=");
        q10.append(this.categoryId);
        q10.append(", categoryTitle=");
        q10.append(this.categoryTitle);
        q10.append(", content=");
        q10.append(this.content);
        q10.append(", description=");
        q10.append(this.description);
        q10.append(", id=");
        q10.append(this.f19666id);
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
    public /* synthetic */ NewDetail(java.lang.Long r14, java.lang.String r15, java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, java.lang.String r20, java.lang.Double r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, sk.e r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            r12 = r2
            goto L_0x0059
        L_0x0057:
            r12 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = r25
        L_0x0060:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.home.data.model.NewDetail.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, sk.e):void");
    }
}
