package com.vpa.daugia.module.support.data.model;

import android.support.v4.media.a;
import cc.b;
import java.io.Serializable;
import java.util.List;
import sk.e;
import sk.j;

/* compiled from: Categories.kt */
public final class Categories implements Serializable {
    @b("categoryId")
    private Long categoryId;
    @b("categoryTitle")
    private String categoryTitle;
    @b("code")
    private String code;
    @b("topArticles")
    private List<TopArticle> topArticles;

    public Categories() {
        this((Long) null, (String) null, (String) null, (List) null, 15, (e) null);
    }

    public Categories(Long l10, String str, String str2, List<TopArticle> list) {
        this.categoryId = l10;
        this.categoryTitle = str;
        this.code = str2;
        this.topArticles = list;
    }

    public static /* synthetic */ Categories copy$default(Categories categories, Long l10, String str, String str2, List<TopArticle> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = categories.categoryId;
        }
        if ((i10 & 2) != 0) {
            str = categories.categoryTitle;
        }
        if ((i10 & 4) != 0) {
            str2 = categories.code;
        }
        if ((i10 & 8) != 0) {
            list = categories.topArticles;
        }
        return categories.copy(l10, str, str2, list);
    }

    public final Long component1() {
        return this.categoryId;
    }

    public final String component2() {
        return this.categoryTitle;
    }

    public final String component3() {
        return this.code;
    }

    public final List<TopArticle> component4() {
        return this.topArticles;
    }

    public final Categories copy(Long l10, String str, String str2, List<TopArticle> list) {
        return new Categories(l10, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Categories)) {
            return false;
        }
        Categories categories = (Categories) obj;
        return j.a(this.categoryId, categories.categoryId) && j.a(this.categoryTitle, categories.categoryTitle) && j.a(this.code, categories.code) && j.a(this.topArticles, categories.topArticles);
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final String getCode() {
        return this.code;
    }

    public final List<TopArticle> getTopArticles() {
        return this.topArticles;
    }

    public int hashCode() {
        Long l10 = this.categoryId;
        int i10 = 0;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.categoryTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TopArticle> list = this.topArticles;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setCategoryId(Long l10) {
        this.categoryId = l10;
    }

    public final void setCategoryTitle(String str) {
        this.categoryTitle = str;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setTopArticles(List<TopArticle> list) {
        this.topArticles = list;
    }

    public String toString() {
        StringBuilder q10 = a.q("Categories(categoryId=");
        q10.append(this.categoryId);
        q10.append(", categoryTitle=");
        q10.append(this.categoryTitle);
        q10.append(", code=");
        q10.append(this.code);
        q10.append(", topArticles=");
        q10.append(this.topArticles);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Categories(Long l10, String str, String str2, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : list);
    }
}
