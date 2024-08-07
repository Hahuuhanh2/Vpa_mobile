package ch;

import android.view.View;
import ek.i;
import mg.e3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: AwaitAuctionFragment.kt */
public final class g extends k implements l<f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f19194a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(b bVar) {
        super(1);
        this.f19194a = bVar;
    }

    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            View view = ((e3) this.f19194a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        }
        return i.f20112a;
    }
}
