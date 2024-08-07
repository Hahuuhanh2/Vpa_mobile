package ai;

import android.view.View;
import ek.i;
import mg.e4;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: TransferPaymentFragment.kt */
public final class f extends k implements l<String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f18976a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(1);
        this.f18976a = jVar;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        j.f(str, "it");
        View view = ((e4) this.f18976a.i0()).f8554e;
        j.e(view, "getRoot(...)");
        new a(view).a(str, b.SUCCESS);
        return i.f20112a;
    }
}
