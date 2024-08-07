package kh;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.history.HistoryViewModel;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import ef.n;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionHistoryActivity f20814b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20815a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionHistoryActivity f20816b;

        public a(String str, AuctionHistoryActivity auctionHistoryActivity) {
            this.f20815a = str;
            this.f20816b = auctionHistoryActivity;
        }

        public final void run() {
            String str = this.f20815a;
            if (str == null) {
                str = "";
            }
            AuctionHistoryActivity auctionHistoryActivity = this.f20816b;
            int i10 = AuctionHistoryActivity.U;
            auctionHistoryActivity.U().f19638f = new n<>((Object) null);
            HistoryViewModel.e(this.f20816b.U(), str, 6);
        }
    }

    public d(String str, AuctionHistoryActivity auctionHistoryActivity) {
        this.f20813a = str;
        this.f20814b = auctionHistoryActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f20813a, this.f20814b));
    }
}
