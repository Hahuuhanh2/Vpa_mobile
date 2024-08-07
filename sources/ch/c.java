package ch;

import al.r0;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import ek.i;
import lg.b;
import mg.e3;
import p3.l0;
import rg.d;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: AwaitAuctionFragment.kt */
public final class c extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f19190a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        this.f19190a = bVar;
    }

    public final Object invoke() {
        boolean z10;
        b bVar = this.f19190a.f19180o0;
        if (bVar != null) {
            if (bVar.a().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                AuctionViewModel n02 = this.f19190a.n0();
                l0.j0(l0.d0(n02), r0.f19085b, new d(n02, (ik.d<? super d>) null), 2);
            } else {
                ((e3) this.f19190a.i0()).f21043x.b(this.f19190a.m0().f9444f);
            }
            return i.f20112a;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }
}
