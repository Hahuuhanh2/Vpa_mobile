package sg;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class o implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DetailAuctionResultActivity f22891a;

    public o(DetailAuctionResultActivity detailAuctionResultActivity) {
        this.f22891a = detailAuctionResultActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new n(str, this.f22891a), 500);
    }

    public final void b() {
    }
}
