package nh;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class s implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21684a;

    public s(AuctionNotifyActivity auctionNotifyActivity) {
        this.f21684a = auctionNotifyActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new r(str, this.f21684a), 500);
    }

    public final void b() {
    }
}
