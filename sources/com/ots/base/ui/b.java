package com.ots.base.ui;

import android.os.Handler;
import ek.i;
import rk.l;
import sk.j;
import sk.k;
import v.f;

/* compiled from: AddressSelectDialog.kt */
public final class b extends k implements l<gf.b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f8247a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f8247a = aVar;
    }

    public final Object invoke(Object obj) {
        gf.b bVar = (gf.b) obj;
        j.f(bVar, "item");
        if (!this.f8247a.B0) {
            new Handler().postDelayed(new f(27, this.f8247a, bVar), 300);
        }
        return i.f20112a;
    }
}
