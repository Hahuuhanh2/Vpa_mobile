package ii;

import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.utils.customview.EmptyView;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import ek.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mg.r3;
import rk.l;
import sk.j;
import sk.k;
import tg.m;
import ze.f;

/* compiled from: RegisterAuctionFragment.kt */
public final class u extends k implements l<f<? extends ArrayList<AwaitAuction>>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20635a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(q qVar) {
        super(1);
        this.f20635a = qVar;
    }

    public final Object invoke(Object obj) {
        int i10;
        f fVar = (f) obj;
        if (!(fVar instanceof f.a) && !j.a(fVar, f.b.f18005a) && (fVar instanceof f.c)) {
            q qVar = this.f20635a;
            int i11 = q.f20604x0;
            f.c cVar = (f.c) fVar;
            ((m) qVar.f20611s0.getValue()).A((List) cVar.f18006a);
            RecyclerView recyclerView = ((r3) this.f20635a.i0()).C;
            j.e(recyclerView, "rcv");
            int i12 = 0;
            if (!((Collection) cVar.f18006a).isEmpty()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            recyclerView.setVisibility(i10);
            EmptyView emptyView = ((r3) this.f20635a.i0()).f21329z;
            j.e(emptyView, "epvAll");
            if (!((ArrayList) cVar.f18006a).isEmpty()) {
                i12 = 8;
            }
            emptyView.setVisibility(i12);
        }
        return i.f20112a;
    }
}
