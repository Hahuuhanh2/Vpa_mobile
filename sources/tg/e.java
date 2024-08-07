package tg;

import android.view.View;
import com.ots.core.utils.customview.textview.AppTextView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.home.data.api.response.Plate;
import d2.l;
import ef.d;
import ek.i;
import java.io.Serializable;
import mg.a7;
import mg.e5;
import mg.q4;
import oh.c;
import rk.p;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f22976b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f22977c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Serializable f22978d;

    public /* synthetic */ e(l lVar, d dVar, Serializable serializable, int i10) {
        this.f22975a = i10;
        this.f22976b = lVar;
        this.f22977c = dVar;
        this.f22978d = serializable;
    }

    public final void onClick(View view) {
        int i10;
        int i11 = 0;
        switch (this.f22975a) {
            case 0:
                e5 e5Var = (e5) this.f22976b;
                g gVar = (g) this.f22977c;
                OrderWaitAuction orderWaitAuction = (OrderWaitAuction) this.f22978d;
                j.f(e5Var, "$this_apply");
                j.f(gVar, "this$0");
                j.f(orderWaitAuction, "$model");
                AppTitleTextView appTitleTextView = e5Var.f21050y;
                appTitleTextView.setSelected(!appTitleTextView.isSelected());
                p<? super Boolean, ? super OrderWaitAuction, i> pVar = gVar.f22983r;
                if (pVar != null) {
                    pVar.invoke(Boolean.valueOf(e5Var.f21050y.isSelected()), orderWaitAuction);
                }
                if (e5Var.f21050y.isSelected()) {
                    AppTitleTextView appTitleTextView2 = e5Var.f21050y;
                    Integer wishlistCount = orderWaitAuction.getWishlistCount();
                    if (wishlistCount != null) {
                        i11 = wishlistCount.intValue();
                    }
                    appTitleTextView2.setText(String.valueOf(i11 + 1));
                    return;
                }
                AppTitleTextView appTitleTextView3 = e5Var.f21050y;
                Integer wishlistCount2 = orderWaitAuction.getWishlistCount();
                if (wishlistCount2 != null) {
                    i10 = wishlistCount2.intValue();
                } else {
                    i10 = 1;
                }
                appTitleTextView3.setText(String.valueOf(i10 - 1));
                return;
            case 1:
                a7 a7Var = (a7) this.f22976b;
                j.f(a7Var, "$this_apply");
                j.f((q) this.f22977c, "this$0");
                j.f((PriceTable) this.f22978d, "$model");
                AppTextView appTextView = a7Var.f20963z;
                appTextView.setSelected(!appTextView.isSelected());
                if (a7Var.f20963z.isSelected()) {
                    a7Var.f20963z.setText("1");
                    return;
                } else {
                    a7Var.f20963z.setText("0");
                    return;
                }
            default:
                q4 q4Var = (q4) this.f22976b;
                c cVar = (c) this.f22977c;
                Plate plate = (Plate) this.f22978d;
                j.f(q4Var, "$this_apply");
                j.f(cVar, "this$0");
                j.f(plate, "$model");
                if (App.f19364o.a().a()) {
                    AppTextView appTextView2 = q4Var.f21314z;
                    appTextView2.setSelected(!appTextView2.isSelected());
                }
                p<? super Boolean, ? super Plate, i> pVar2 = cVar.f21796r;
                if (pVar2 != null) {
                    pVar2.invoke(Boolean.valueOf(q4Var.f21314z.isSelected()), plate);
                }
                if (q4Var.f21314z.isSelected()) {
                    AppTextView appTextView3 = q4Var.f21314z;
                    Integer totalInterested = plate.getTotalInterested();
                    if (totalInterested != null) {
                        i11 = totalInterested.intValue();
                    }
                    appTextView3.setText(String.valueOf(i11 + 1));
                    return;
                }
                q4Var.f21314z.setText(String.valueOf(plate.getTotalInterested()));
                return;
        }
    }
}
