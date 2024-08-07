package ii;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import java.util.TimerTask;
import sk.e;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ListAwaitAuctionActivity f20587b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20588a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ListAwaitAuctionActivity f20589b;

        public a(ListAwaitAuctionActivity listAwaitAuctionActivity, String str) {
            this.f20588a = str;
            this.f20589b = listAwaitAuctionActivity;
        }

        public final void run() {
            String str = this.f20588a;
            if (str == null) {
                str = "";
            }
            ListAwaitAuctionActivity listAwaitAuctionActivity = this.f20589b;
            int i10 = ListAwaitAuctionActivity.Z;
            HomeViewModel U = listAwaitAuctionActivity.U();
            AwaitAuctionRequest awaitAuctionRequest = new AwaitAuctionRequest((Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (e) null);
            U.getClass();
            U.I = awaitAuctionRequest;
            this.f20589b.U().g(str);
        }
    }

    public d(ListAwaitAuctionActivity listAwaitAuctionActivity, String str) {
        this.f20586a = str;
        this.f20587b = listAwaitAuctionActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f20587b, this.f20586a));
    }
}
