package com.vpa.daugia.module.support.data.api;

import com.vpa.daugia.module.support.data.model.Article;
import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.data.model.FAQ;
import ik.d;
import java.util.ArrayList;
import java.util.Map;
import xl.a;
import xl.j;
import xl.o;
import xl.s;

/* compiled from: SupportService.kt */
public interface SupportService {
    @o("api/tin-tuc/public/article/static/{categoryId}")
    Object getArticle(@j Map<String, String> map, @s("categoryId") Long l10, d<? super Article> dVar);

    @o("api/tin-tuc/public/static-categories")
    Object getCategory(@j Map<String, String> map, d<? super ArrayList<Categories>> dVar);

    @o("api/tin-tuc/faq/get-faq")
    Object getFAQ(@j Map<String, String> map, @a Object obj, d<? super ArrayList<FAQ>> dVar);
}
