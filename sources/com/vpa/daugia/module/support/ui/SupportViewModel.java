package com.vpa.daugia.module.support.ui;

import com.vpa.daugia.module.support.data.api.SupportApiHelper;
import com.vpa.daugia.module.support.data.model.Article;
import com.vpa.daugia.module.support.data.model.Categories;
import com.vpa.daugia.module.support.data.model.FAQ;
import java.util.ArrayList;
import lg.b;
import r2.p;
import r2.v;
import sk.j;
import ze.f;

/* compiled from: SupportViewModel.kt */
public final class SupportViewModel extends v {

    /* renamed from: d  reason: collision with root package name */
    public final SupportApiHelper f19888d;

    /* renamed from: e  reason: collision with root package name */
    public final p<f<ArrayList<FAQ>>> f19889e;

    /* renamed from: f  reason: collision with root package name */
    public final p f19890f;

    /* renamed from: g  reason: collision with root package name */
    public final p<f<ArrayList<Categories>>> f19891g;

    /* renamed from: h  reason: collision with root package name */
    public final p f19892h;

    /* renamed from: i  reason: collision with root package name */
    public final p<f<Article>> f19893i;

    /* renamed from: j  reason: collision with root package name */
    public final p f19894j;

    public SupportViewModel(SupportApiHelper supportApiHelper, b bVar) {
        j.f(supportApiHelper, "apiHelper");
        j.f(bVar, "sharedPrefsHelper");
        this.f19888d = supportApiHelper;
        p<f<ArrayList<FAQ>>> pVar = new p<>();
        this.f19889e = pVar;
        this.f19890f = pVar;
        p<f<ArrayList<Categories>>> pVar2 = new p<>();
        this.f19891g = pVar2;
        this.f19892h = pVar2;
        p<f<Article>> pVar3 = new p<>();
        this.f19893i = pVar3;
        this.f19894j = pVar3;
    }
}
