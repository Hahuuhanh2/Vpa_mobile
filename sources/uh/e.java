package uh;

import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import ek.i;
import mg.k3;
import rh.f;
import rk.l;
import sk.k;

/* compiled from: MenuFragment.kt */
public final class e extends k implements l<User, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MenuFragment f23062a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(MenuFragment menuFragment) {
        super(1);
        this.f23062a = menuFragment;
    }

    public final Object invoke(Object obj) {
        User user = (User) obj;
        if (user != null) {
            MenuFragment menuFragment = this.f23062a;
            ((k3) menuFragment.i0()).v(new f(menuFragment.d0(), user, menuFragment.m0()));
        }
        return i.f20112a;
    }
}
