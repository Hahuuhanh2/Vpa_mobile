package ii;

import ek.i;
import q.rorbin.badgeview.QBadgeView;
import rk.l;
import sk.k;

/* compiled from: RegisterAuctionFragment.kt */
public final class b0 extends k implements l<Integer, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20579a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(q qVar) {
        super(1);
        this.f20579a = qVar;
    }

    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        QBadgeView qBadgeView = this.f20579a.f20609q0;
        if (qBadgeView != null) {
            qBadgeView.f(String.valueOf(num));
        }
        return i.f20112a;
    }
}
