package mb;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.vpa.daugia.module.auction.data.model.sse.BiddingRoomId;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import java.io.InputStream;
import mg.f1;
import mg.k;
import qb.a;
import qb.c;
import sk.j;
import tb.d;
import tb.e;
import tb.m;
import vg.h;
import zg.a0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13244b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13245c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f13243a = i10;
        this.f13244b = obj;
        this.f13245c = obj2;
    }

    public final void run() {
        switch (this.f13243a) {
            case 0:
                ((AppStartTrace) this.f13244b).f7624b.d((m) ((m.a) this.f13245c).q(), d.FOREGROUND_BACKGROUND);
                return;
            case 1:
                a aVar = (a) this.f13244b;
                lb.a aVar2 = a.f14388g;
                e b10 = aVar.b((Timer) this.f13245c);
                if (b10 != null) {
                    aVar.f14390a.add(b10);
                    return;
                }
                return;
            case 2:
                c cVar = (c) this.f13244b;
                lb.a aVar3 = c.f14399f;
                tb.b b11 = cVar.b((Timer) this.f13245c);
                if (b11 != null) {
                    cVar.f14401b.add(b11);
                    return;
                }
                return;
            case 3:
                SessionAuctionActivity sessionAuctionActivity = (SessionAuctionActivity) this.f13244b;
                BiddingRoomId biddingRoomId = (BiddingRoomId) this.f13245c;
                j.f(sessionAuctionActivity, "this$0");
                vg.a aVar4 = sessionAuctionActivity.T;
                if (aVar4 != null) {
                    aVar4.a();
                }
                new h(sessionAuctionActivity, biddingRoomId).h();
                return;
            case 4:
                AuctionReportActivity auctionReportActivity = (AuctionReportActivity) this.f13244b;
                int i10 = AuctionReportActivity.V;
                j.f(auctionReportActivity, "this$0");
                PDFView pDFView = ((k) auctionReportActivity.M()).f21141z;
                pDFView.getClass();
                PDFView.a aVar5 = new PDFView.a(new z.j((InputStream) this.f13245c, 5));
                aVar5.f5067k = null;
                aVar5.f5064h = 0;
                aVar5.f5058b = true;
                aVar5.f5065i = false;
                aVar5.f5059c = true;
                aVar5.f5063g = new kh.k(auctionReportActivity);
                aVar5.f5060d = new a0(3);
                aVar5.f5062f = new kh.h(1);
                aVar5.f5061e = new kh.k(auctionReportActivity);
                aVar5.f5069m = 0;
                aVar5.f5066j = false;
                aVar5.f5068l = true;
                aVar5.a();
                ((k) auctionReportActivity.M()).f21141z.r();
                ((k) auctionReportActivity.M()).f21141z.S = true;
                return;
            default:
                RegulationActivity regulationActivity = (RegulationActivity) this.f13244b;
                int i11 = RegulationActivity.O;
                j.f(regulationActivity, "this$0");
                PDFView pDFView2 = ((f1) regulationActivity.M()).f21058z;
                pDFView2.getClass();
                PDFView.a aVar6 = new PDFView.a(new z.j((InputStream) this.f13245c, 5));
                aVar6.f5067k = null;
                aVar6.f5064h = 0;
                aVar6.f5058b = true;
                aVar6.f5065i = false;
                aVar6.f5059c = true;
                aVar6.f5063g = new zh.e(regulationActivity);
                aVar6.f5060d = new a0(6);
                aVar6.f5062f = new kh.h(3);
                aVar6.f5061e = new zh.e(regulationActivity);
                aVar6.f5069m = 0;
                aVar6.f5066j = false;
                aVar6.f5068l = true;
                aVar6.a();
                ((f1) regulationActivity.M()).f21058z.r();
                ((f1) regulationActivity.M()).f21058z.S = true;
                return;
        }
    }
}
