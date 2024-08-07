package kh;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class e implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20817a;

    public e(AuctionHistoryActivity auctionHistoryActivity) {
        this.f20817a = auctionHistoryActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new d(str, this.f20817a), 500);
    }

    public final void b() {
    }
}
