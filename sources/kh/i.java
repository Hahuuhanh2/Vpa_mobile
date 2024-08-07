package kh;

import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import j7.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import lg.b;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f20820a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AuctionReportActivity f20821b;

    public /* synthetic */ i(long j10, AuctionReportActivity auctionReportActivity) {
        this.f20820a = j10;
        this.f20821b = auctionReportActivity;
    }

    public final void run() {
        long j10 = this.f20820a;
        AuctionReportActivity auctionReportActivity = this.f20821b;
        int i10 = AuctionReportActivity.V;
        j.f(auctionReportActivity, "this$0");
        try {
            URLConnection openConnection = new URL(a.f11713u + "web-api/user-bidding/api/document/user/download?documentId=" + j10 + "&timestamp=" + System.currentTimeMillis()).openConnection();
            j.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Bearer ");
            b bVar = auctionReportActivity.U;
            if (bVar != null) {
                sb2.append(bVar.a());
                httpURLConnection.setRequestProperty("Authorization", sb2.toString());
                httpURLConnection.connect();
                we.b.d(new mb.b(4, auctionReportActivity, httpURLConnection.getInputStream()));
                return;
            }
            j.l("sharedPrefsHelper");
            throw null;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
