package com.vpa.daugia.module.regulation.ui;

import ah.d;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import ek.g;
import j$.time.LocalDate;
import ki.c;
import mg.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AuctionRegulationActivity.kt */
public final class AuctionRegulationActivity extends BaseActivity<i> {
    public static final /* synthetic */ int Q = 0;
    public LocalDate O = LocalDate.now();
    public final g P = j7.a.b0(new b(this));

    /* compiled from: AuctionRegulationActivity.kt */
    public static final class a extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionRegulationActivity f19856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionRegulationActivity auctionRegulationActivity) {
            super(1);
            this.f19856a = auctionRegulationActivity;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            AuctionRegulationActivity auctionRegulationActivity = this.f19856a;
            LocalDate localDate = auctionRegulationActivity.O;
            j.e(localDate, "access$getDate$p(...)");
            d dVar = new d(auctionRegulationActivity, localDate);
            dVar.f18961j = new a(this.f19856a);
            dVar.h();
            return ek.i.f20112a;
        }
    }

    /* compiled from: AuctionRegulationActivity.kt */
    public static final class b extends k implements rk.a<li.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionRegulationActivity f19857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AuctionRegulationActivity auctionRegulationActivity) {
            super(0);
            this.f19857a = auctionRegulationActivity;
        }

        public final Object invoke() {
            return new li.a(new b(this.f19857a));
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_regulation;
    }

    public final li.a T() {
        return (li.a) this.P.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((i) M()).f21100y.f10530d).setText("Quy chế đấu giá");
        try {
            ((i) M()).f21099x.getRecyclerView().setAdapter(T());
            ((i) M()).f21099x.setOnPullRefreshAction(new ki.a(this));
            ((i) M()).f21099x.setSetClearAdapterAction(new ki.b(this));
            ((i) M()).f21099x.setOnLoadMoreAction(c.f20830a);
            kf.j.a(this, "Không có kết quả phù hợp", "", C0531R$drawable.ic_notebook, -1, ((i) M()).f21099x.getEmptyStateView());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        T().A(j7.a.e("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"));
        ((i) M()).f21099x.b(T().f9444f);
        ImageButton imageButton = ((i) M()).f21098w;
        j.e(imageButton, "btnFilter");
        imageButton.setOnClickListener(new kf.b(500, imageButton, new a(this)));
    }
}
