package com.vpa.daugia.module.history.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.history.HistoryViewModel;
import ek.g;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: AuctionHistoryActivity.kt */
public final class AuctionHistoryActivity extends Hilt_AuctionHistoryActivity<mg.e> {
    public static final /* synthetic */ int U = 0;
    public final d0 R = new d0(s.a(HistoryViewModel.class), new d(this), new c(this), new e(this));
    public v1.c<Long, Long> S;
    public final g T = j7.a.b0(new a(this));

    /* compiled from: AuctionHistoryActivity.kt */
    public static final class a extends k implements rk.a<lh.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionHistoryActivity f19653a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionHistoryActivity auctionHistoryActivity) {
            super(0);
            this.f19653a = auctionHistoryActivity;
        }

        public final Object invoke() {
            return new lh.a(new a(this.f19653a));
        }
    }

    /* compiled from: AuctionHistoryActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19654a;

        public b(kh.c cVar) {
            this.f19654a = cVar;
        }

        public final ek.a<?> a() {
            return this.f19654a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19654a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19654a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19654a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19655a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19655a = componentActivity;
        }

        public final Object invoke() {
            return this.f19655a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19656a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19656a = componentActivity;
        }

        public final Object invoke() {
            return this.f19656a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19657a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19657a = componentActivity;
        }

        public final Object invoke() {
            return this.f19657a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_history;
    }

    public final lh.a T() {
        return (lh.a) this.T.getValue();
    }

    public final HistoryViewModel U() {
        return (HistoryViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((mg.e) M()).A.f10530d).setText(getString(C0540R$string.auction_history));
        U().f19641i.e(this, new b(new kh.c(this)));
        HistoryViewModel.e(U(), (String) null, 7);
        ((mg.e) M()).f21032y.getRecyclerView().setAdapter(T());
        ((mg.e) M()).f21032y.setOnPullRefreshAction(new kh.a(this));
        ((mg.e) M()).f21032y.setOnLoadMoreAction(new kh.b(this));
        kf.j.a(this, "Chưa có lịch sử đấu giá", "", C0531R$drawable.ic_note_history, (Integer) null, ((mg.e) M()).f21032y.getEmptyStateView());
        ((ImageButton) ((mg.e) M()).A.f10528b).setOnClickListener(new com.google.android.material.textfield.b(this, 19));
        SearchView searchView = ((mg.e) M()).f21033z;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new kh.e(this));
        ((mg.e) M()).f21030w.setOnClickListener(new com.google.android.material.datepicker.q(this, 21));
    }
}
