package sg;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class i implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f22883a;

    public i(AuctionResultActivity auctionResultActivity) {
        this.f22883a = auctionResultActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new h(str, this.f22883a), 500);
    }

    public final void b() {
    }
}
