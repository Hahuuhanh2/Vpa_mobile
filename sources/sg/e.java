package sg;

import com.google.android.material.datepicker.t;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import rk.l;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f22876b;

    public /* synthetic */ e(int i10, l lVar) {
        this.f22875a = i10;
        this.f22876b = lVar;
    }

    public final void a(Object obj) {
        switch (this.f22875a) {
            case 0:
                l lVar = this.f22876b;
                int i10 = AuctionResultActivity.U;
                j.f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 1:
                l lVar2 = this.f22876b;
                int i11 = MyDocumentActivity.V;
                j.f(lVar2, "$tmp0");
                lVar2.invoke(obj);
                return;
            default:
                l lVar3 = this.f22876b;
                int i12 = AuctionHistoryActivity.U;
                j.f(lVar3, "$tmp0");
                lVar3.invoke(obj);
                return;
        }
    }
}
