package com.vpa.daugia.module.support.data.api;

import com.vpa.daugia.module.support.data.model.Article;
import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.data.model.FAQ;
import ik.d;
import java.util.ArrayList;
import lg.b;
import sk.j;
import ze.a;

/* compiled from: SupportApiHelper.kt */
public final class SupportApiHelper {
    private final SupportService api;
    private final b sharedPrefs;

    public SupportApiHelper(SupportService supportService, b bVar) {
        j.f(supportService, "api");
        j.f(bVar, "sharedPrefs");
        this.api = supportService;
        this.sharedPrefs = bVar;
    }

    public final Object getArticle(Long l10, d<? super Article> dVar) {
        return this.api.getArticle(a.b(this.sharedPrefs, true), l10, dVar);
    }

    public final Object getCategory(d<? super ArrayList<Categories>> dVar) {
        return this.api.getCategory(a.b(this.sharedPrefs, true), dVar);
    }

    public final Object getFAQ(Object obj, d<? super ArrayList<FAQ>> dVar) {
        return this.api.getFAQ(a.b(this.sharedPrefs, true), obj, dVar);
    }
}
