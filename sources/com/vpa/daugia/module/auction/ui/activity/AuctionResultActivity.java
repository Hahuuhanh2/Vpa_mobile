package com.vpa.daugia.module.auction.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import ek.g;
import mg.m;
import r2.q;
import r2.w;
import rk.l;
import sg.i;
import sg.j;
import sk.f;
import sk.k;
import sk.s;

/* compiled from: AuctionResultActivity.kt */
public final class AuctionResultActivity extends Hilt_AuctionResultActivity<m> {
    public static final /* synthetic */ int U = 0;
    public final d0 R = new d0(s.a(AuctionViewModel.class), new d(this), new c(this), new e(this));
    public v1.c<Long, Long> S;
    public final g T = j7.a.b0(new a(this));

    /* compiled from: AuctionResultActivity.kt */
    public static final class a extends k implements rk.a<tg.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionResultActivity f19408a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionResultActivity auctionResultActivity) {
            super(0);
            this.f19408a = auctionResultActivity;
        }

        public final Object invoke() {
            return new tg.c(new b(this.f19408a));
        }
    }

    /* compiled from: AuctionResultActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19409a;

        public b(j jVar) {
            this.f19409a = jVar;
        }

        public final ek.a<?> a() {
            return this.f19409a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19409a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return sk.j.a(this.f19409a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19409a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19410a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19410a = componentActivity;
        }

        public final Object invoke() {
            return this.f19410a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19411a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19411a = componentActivity;
        }

        public final Object invoke() {
            return this.f19411a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19412a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19412a = componentActivity;
        }

        public final Object invoke() {
            return this.f19412a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_result;
    }

    public final tg.c T() {
        return (tg.c) this.T.getValue();
    }

    public final AuctionViewModel U() {
        return (AuctionViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((m) M()).A.f10530d).setText("Kết quả đấu giá");
        U().f19388i.e(this, new b(new j(this)));
        ((m) M()).f21181y.getRecyclerView().setAdapter(T());
        ((m) M()).f21181y.setOnPullRefreshAction(new sg.f(this));
        ((m) M()).f21181y.setOnLoadMoreAction(new sg.g(this));
        AuctionViewModel.e(U(), (String) null, 7);
        kf.j.a(this, "Chưa có lịch sử đấu giá", "", C0531R$drawable.ic_note_history, (Integer) null, ((m) M()).f21181y.getEmptyStateView());
        SearchView searchView = ((m) M()).f21182z;
        sk.j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new i(this));
        ((m) M()).f21179w.setOnClickListener(new com.google.android.material.textfield.b(this, 10));
        ((ImageButton) ((m) M()).A.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 6));
    }
}
