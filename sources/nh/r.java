package nh;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.home.data.api.request.NotifyAuctionRequest;
import com.vpa.daugia.module.home.ui.AuctionNotifyActivity;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import java.util.TimerTask;
import sk.e;

/* compiled from: SearchViewExtensions.kt */
public final class r extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionNotifyActivity f21680b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21681a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AuctionNotifyActivity f21682b;

        public a(String str, AuctionNotifyActivity auctionNotifyActivity) {
            this.f21681a = str;
            this.f21682b = auctionNotifyActivity;
        }

        public final void run() {
            String str = this.f21681a;
            if (str == null) {
                str = "";
            }
            AuctionNotifyActivity auctionNotifyActivity = this.f21682b;
            int i10 = AuctionNotifyActivity.T;
            auctionNotifyActivity.U().f19710h = new NotifyAuctionRequest((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (Integer) null, 63, (e) null);
            HomeViewModel.f(this.f21682b.U(), str, 6);
        }
    }

    public r(String str, AuctionNotifyActivity auctionNotifyActivity) {
        this.f21679a = str;
        this.f21680b = auctionNotifyActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f21679a, this.f21680b));
    }
}
