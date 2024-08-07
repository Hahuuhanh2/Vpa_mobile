package fb;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.kizitonwose.calendar.view.CalendarView;
import com.ots.core.base.BaseRecyclerView;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import com.vpa.daugia.module.qr.ScanQrActivity;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import ii.q;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import mg.z;
import ph.c;
import sk.j;
import we.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10147b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f10146a = i10;
        this.f10147b = obj;
    }

    public final void run() {
        boolean z10;
        Integer profileStatus;
        int i10 = 0;
        switch (this.f10146a) {
            case 0:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f10147b;
                a aVar = FirebaseMessaging.f7583m;
                FirebaseMessaging.a aVar2 = firebaseMessaging.f7592g;
                synchronized (aVar2) {
                    aVar2.a();
                    Boolean bool = aVar2.f7599c;
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = FirebaseMessaging.this.f7586a.j();
                    }
                }
                if (z10) {
                    firebaseMessaging.d();
                    return;
                }
                return;
            case 1:
                w wVar = (w) this.f10147b;
                synchronized (wVar.f10175d) {
                    SharedPreferences.Editor edit = wVar.f10172a.edit();
                    String str = wVar.f10173b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = wVar.f10175d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(wVar.f10174c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 2:
                CalendarView.r0((CalendarView) this.f10147b);
                return;
            case 3:
                BaseRecyclerView baseRecyclerView = (BaseRecyclerView) this.f10147b;
                int i11 = BaseRecyclerView.f8338p;
                j.f(baseRecyclerView, "this$0");
                RecyclerView recyclerView = baseRecyclerView.getBinding().f10824x;
                j.e(recyclerView, "recyclerView");
                recyclerView.setVisibility(8);
                return;
            case 4:
                SessionAuctionActivity sessionAuctionActivity = (SessionAuctionActivity) this.f10147b;
                j.f(sessionAuctionActivity, "this$0");
                sessionAuctionActivity.finish();
                return;
            case 5:
                HomeFragment homeFragment = (HomeFragment) this.f10147b;
                int i12 = HomeFragment.f19678z0;
                j.f(homeFragment, "this$0");
                User e10 = homeFragment.m0().e();
                if (!(e10 == null || (profileStatus = e10.getProfileStatus()) == null)) {
                    i10 = profileStatus.intValue();
                }
                if (i10 < 2) {
                    c cVar = new c(homeFragment.d0());
                    cVar.f22649n = new HomeFragment.f(homeFragment);
                    cVar.show();
                    return;
                }
                return;
            case 6:
                RegulationActivity regulationActivity = (RegulationActivity) this.f10147b;
                int i13 = RegulationActivity.O;
                j.f(regulationActivity, "this$0");
                try {
                    b.d(new mb.b(5, regulationActivity, new URL("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf").openStream()));
                    return;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return;
                }
            case 7:
                ScanQrActivity scanQrActivity = (ScanQrActivity) this.f10147b;
                int i14 = ScanQrActivity.P;
                j.f(scanQrActivity, "this$0");
                scanQrActivity.finish();
                return;
            case 8:
                q qVar = (q) this.f10147b;
                j.f(qVar, "this$0");
                Intent intent = new Intent(qVar.d0(), PaymentActivity.class);
                intent.putExtra("DATA_CART", qVar.f20607o0);
                qVar.h0(intent);
                return;
            default:
                FilterActivity filterActivity = (FilterActivity) this.f10147b;
                j.f(filterActivity, "this$0");
                NestedScrollView nestedScrollView = ((z) filterActivity.M()).E;
                j.e(nestedScrollView, "scrollView");
                nestedScrollView.u(0, (nestedScrollView.getPaddingBottom() + nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getBottom()) - (nestedScrollView.getHeight() + nestedScrollView.getScrollY()), false);
                return;
        }
    }
}
