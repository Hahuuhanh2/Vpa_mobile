package sg;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import ef.n;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class h extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionResultActivity f22880b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22881a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionResultActivity f22882b;

        public a(String str, AuctionResultActivity auctionResultActivity) {
            this.f22881a = str;
            this.f22882b = auctionResultActivity;
        }

        public final void run() {
            String str = this.f22881a;
            if (str == null) {
                str = "";
            }
            AuctionResultActivity auctionResultActivity = this.f22882b;
            int i10 = AuctionResultActivity.U;
            auctionResultActivity.U().f19386g = new n<>((Object) null);
            AuctionViewModel.e(this.f22882b.U(), str, 6);
        }
    }

    public h(String str, AuctionResultActivity auctionResultActivity) {
        this.f22879a = str;
        this.f22880b = auctionResultActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f22879a, this.f22880b));
    }
}
