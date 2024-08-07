package sg;

import al.r0;
import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import ik.d;
import java.util.TimerTask;
import p3.l0;
import rg.c;

/* compiled from: SearchViewExtensions.kt */
public final class n extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DetailAuctionResultActivity f22888b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22889a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ DetailAuctionResultActivity f22890b;

        public a(String str, DetailAuctionResultActivity detailAuctionResultActivity) {
            this.f22889a = str;
            this.f22890b = detailAuctionResultActivity;
        }

        public final void run() {
            String str = this.f22889a;
            if (str == null) {
                str = "";
            }
            DetailAuctionResultActivity detailAuctionResultActivity = this.f22890b;
            int i10 = DetailAuctionResultActivity.U;
            detailAuctionResultActivity.T();
            AuctionViewModel T = this.f22890b.T();
            l0.j0(l0.d0(T), r0.f19085b, new c(T, String.valueOf(this.f22890b.S.getSessionId()), str, (d<? super c>) null), 2);
        }
    }

    public n(String str, DetailAuctionResultActivity detailAuctionResultActivity) {
        this.f22887a = str;
        this.f22888b = detailAuctionResultActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f22887a, this.f22888b));
    }
}
