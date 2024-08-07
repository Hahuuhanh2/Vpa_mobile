package ii;

import ek.i;
import q.rorbin.badgeview.QBadgeView;
import rk.l;
import sk.k;

/* compiled from: RegisterAuctionFragment.kt */
public final class c0 extends k implements l<Integer, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20585a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(q qVar) {
        super(1);
        this.f20585a = qVar;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        QBadgeView qBadgeView = this.f20585a.f20610r0;
        if (qBadgeView != null) {
            qBadgeView.f(String.valueOf(num));
        }
        return i.f20112a;
    }
}
