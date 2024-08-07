package com.vpa.daugia.module.home.ui;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.h;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import ek.g;
import nh.o;
import nh.p;
import nh.t;
import nh.u;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: AuctionNotifyActivity.kt */
public final class AuctionNotifyActivity extends Hilt_AuctionNotifyActivity<mg.c> {
    public static final /* synthetic */ int T = 0;
    public final d0 R = new d0(s.a(HomeViewModel.class), new d(this), new c(this), new e(this));
    public final g S = j7.a.b0(new a(this));

    /* compiled from: AuctionNotifyActivity.kt */
    public static final class a extends k implements rk.a<oh.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AuctionNotifyActivity f19673a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AuctionNotifyActivity auctionNotifyActivity) {
            super(0);
            this.f19673a = auctionNotifyActivity;
        }

        public final Object invoke() {
            return new oh.d(new b(this.f19673a));
        }
    }

    /* compiled from: AuctionNotifyActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19674a;

        public b(t tVar) {
            this.f19674a = tVar;
        }

        public final ek.a<?> a() {
            return this.f19674a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19674a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19674a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19674a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19675a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19675a = componentActivity;
        }

        public final Object invoke() {
            return this.f19675a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19676a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19676a = componentActivity;
        }

        public final Object invoke() {
            return this.f19676a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19677a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19677a = componentActivity;
        }

        public final Object invoke() {
            return this.f19677a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_document;
    }

    public final oh.d T() {
        return (oh.d) this.S.getValue();
    }

    public final HomeViewModel U() {
        return (HomeViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((mg.c) M()).A.f10530d).setText("Thông báo đấu giá");
        RecyclerView recyclerView = ((mg.c) M()).f20997y.getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(T());
        HomeViewModel.f(U(), (String) null, 7);
        SearchView searchView = ((mg.c) M()).f20998z;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new nh.s(this));
        ((ImageButton) ((mg.c) M()).A.f10528b).setOnClickListener(new h(this, 23));
        ImageButton imageButton = ((mg.c) M()).f20995w;
        j.e(imageButton, "btnCalendar");
        imageButton.setOnClickListener(new kf.b(500, imageButton, new u(this)));
        try {
            ((mg.c) M()).f20997y.getRecyclerView().setAdapter(T());
            ((mg.c) M()).f20997y.setOnPullRefreshAction(new o(this));
            ((mg.c) M()).f20997y.setSetClearAdapterAction(new p(this));
            ((mg.c) M()).f20997y.setOnLoadMoreAction(new nh.q(this));
            kf.j.a(this, "Không có kết quả phù hợp", "", C0531R$drawable.ic_notebook, -1, ((mg.c) M()).f20997y.getEmptyStateView());
            U().f19723u.e(this, new b(new t(this)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
