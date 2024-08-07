package com.ots.core.utils.customview;

import ek.i;
import gf.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: ImageRecyclerview.kt */
public final class d extends k implements l<a, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageRecyclerview f8390a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ImageRecyclerview imageRecyclerview) {
        super(1);
        this.f8390a = imageRecyclerview;
    }

    public final Object invoke(Object obj) {
        j.f((a) obj, "it");
        this.f8390a.getRequestCamera().invoke();
        return i.f20112a;
    }
}
