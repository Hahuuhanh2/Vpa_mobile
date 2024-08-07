package com.ots.core.utils.customview;

import android.os.Handler;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: BaseBottomSheetSelectDialog.kt */
public final class b extends k implements l<gf.b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f8388a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f8388a = aVar;
    }

    public final Object invoke(Object obj) {
        j.f((gf.b) obj, "it");
        if (!this.f8388a.B0) {
            new Handler().postDelayed(new d.i(this.f8388a, 26), 500);
        }
        return i.f20112a;
    }
}
