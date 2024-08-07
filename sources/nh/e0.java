package nh;

import com.vpa.daugia.module.home.ui.HomeFragment;
import ek.i;
import q.rorbin.badgeview.QBadgeView;
import rk.l;
import sk.k;

/* compiled from: HomeFragment.kt */
public final class e0 extends k implements l<Integer, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeFragment f21653a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(HomeFragment homeFragment) {
        super(1);
        this.f21653a = homeFragment;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        QBadgeView qBadgeView = this.f21653a.f19684r0;
        if (qBadgeView != null) {
            qBadgeView.f(String.valueOf(num));
        }
        return i.f20112a;
    }
}
