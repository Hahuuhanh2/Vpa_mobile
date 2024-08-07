package com.vpa.daugia.module.home.ui;

import al.r0;
import com.vpa.daugia.module.home.data.model.News;
import ek.i;
import ik.d;
import nh.u0;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: HomeFragment.kt */
public final class e extends k implements l<News, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f19746a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(HomeFragment homeFragment) {
        super(1);
        this.f19746a = homeFragment;
    }

    public final Object invoke(Object obj) {
        News news = (News) obj;
        j.f(news, "it");
        HomeFragment homeFragment = this.f19746a;
        int i10 = HomeFragment.f19678z0;
        HomeViewModel n02 = homeFragment.n0();
        l0.j0(l0.d0(n02), r0.f19085b, new u0(n02, news.getId(), (d<? super u0>) null), 2);
        return i.f20112a;
    }
}
