package tg;

import android.view.View;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.data.api.response.Plate;
import d2.l;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.a6;
import mg.g5;
import rk.p;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f22985b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f22986c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Serializable f22987d;

    public /* synthetic */ h(l lVar, d dVar, Serializable serializable, int i10) {
        this.f22984a = i10;
        this.f22985b = lVar;
        this.f22986c = dVar;
        this.f22987d = serializable;
    }

    public final void onClick(View view) {
        int i10 = 0;
        switch (this.f22984a) {
            case 0:
                g5 g5Var = (g5) this.f22985b;
                m mVar = (m) this.f22986c;
                AwaitAuction awaitAuction = (AwaitAuction) this.f22987d;
                j.f(g5Var, "$this_apply");
                j.f(mVar, "this$0");
                j.f(awaitAuction, "$model");
                if (App.f19364o.a().a()) {
                    AppTextView appTextView = g5Var.C;
                    appTextView.setSelected(!appTextView.isSelected());
                }
                p<? super Boolean, ? super AwaitAuction, i> pVar = mVar.f22998s;
                if (pVar != null) {
                    pVar.invoke(Boolean.valueOf(g5Var.C.isSelected()), awaitAuction);
                }
                if (g5Var.C.isSelected()) {
                    AppTextView appTextView2 = g5Var.C;
                    Integer wishListCount = awaitAuction.getWishListCount();
                    if (wishListCount != null) {
                        i10 = wishListCount.intValue();
                    }
                    appTextView2.setText(String.valueOf(i10 + 1));
                    return;
                }
                g5Var.C.setText(String.valueOf(awaitAuction.getWishListCount()));
                return;
            default:
                a6 a6Var = (a6) this.f22985b;
                oh.i iVar = (oh.i) this.f22986c;
                Plate plate = (Plate) this.f22987d;
                j.f(a6Var, "$this_apply");
                j.f(iVar, "this$0");
                j.f(plate, "$model");
                if (App.f19364o.a().a()) {
                    AppTextView appTextView3 = a6Var.B;
                    appTextView3.setSelected(!appTextView3.isSelected());
                }
                p<? super Boolean, ? super Plate, i> pVar2 = iVar.f21807r;
                if (pVar2 != null) {
                    pVar2.invoke(Boolean.valueOf(a6Var.B.isSelected()), plate);
                }
                if (a6Var.B.isSelected()) {
                    AppTextView appTextView4 = a6Var.B;
                    Integer totalInterested = plate.getTotalInterested();
                    if (totalInterested != null) {
                        i10 = totalInterested.intValue();
                    }
                    appTextView4.setText(String.valueOf(i10 + 1));
                    return;
                }
                a6Var.B.setText(String.valueOf(plate.getTotalInterested()));
                return;
        }
    }
}
