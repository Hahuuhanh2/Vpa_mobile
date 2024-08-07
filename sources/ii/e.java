package ii;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class e implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20590a;

    public e(ListAwaitAuctionActivity listAwaitAuctionActivity) {
        this.f20590a = listAwaitAuctionActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new d(this.f20590a, str), 500);
    }

    public final void b() {
    }
}
