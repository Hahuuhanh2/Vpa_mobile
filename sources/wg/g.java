package wg;

import android.widget.LinearLayout;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import ek.i;
import java.util.ArrayList;
import mg.c3;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionFragment.kt */
public final class g extends k implements l<ArrayList<PriceTable>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23398a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(b bVar) {
        super(1);
        this.f23398a = bVar;
    }

    public final Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        LinearLayout linearLayout = ((c3) this.f23398a.i0()).f21005x;
        j.e(linearLayout, "llRcv");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = ((c3) this.f23398a.i0()).f21004w;
        j.e(linearLayout2, "llLogin");
        linearLayout2.setVisibility(8);
        if (arrayList.isEmpty()) {
            ((c3) this.f23398a.i0()).f21007z.b(new ArrayList());
        } else {
            this.f23398a.m0().A(arrayList);
            ((c3) this.f23398a.i0()).f21007z.b(this.f23398a.m0().f9444f);
        }
        return i.f20112a;
    }
}
