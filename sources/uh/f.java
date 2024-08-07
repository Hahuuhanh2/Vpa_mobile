package uh;

import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import ek.i;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: MenuFragment.kt */
public final class f extends k implements l<ze.f<? extends Object>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MenuFragment f23063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(MenuFragment menuFragment) {
        super(1);
        this.f23063a = menuFragment;
    }

    public final Object invoke(Object obj) {
        ze.f fVar = (ze.f) obj;
        if (fVar instanceof f.a) {
            this.f23063a.k0().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23063a.k0().dismiss();
        } else if (fVar instanceof f.c) {
            this.f23063a.k0().dismiss();
        }
        return i.f20112a;
    }
}
