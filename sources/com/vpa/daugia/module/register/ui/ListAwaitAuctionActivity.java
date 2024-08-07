package com.vpa.daugia.module.register.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.R$dimen;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import ek.i;
import kf.h;
import mg.d1;
import r2.q;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.s;
import tg.m;

/* compiled from: ListAwaitAuctionActivity.kt */
public final class ListAwaitAuctionActivity extends Hilt_ListAwaitAuctionActivity<d1> {
    public static final /* synthetic */ int Z = 0;
    public final d0 R = new d0(s.a(HomeViewModel.class), new f(this), new e(this), new g(this));
    public lg.b S;
    public String T = "REGISTER_AUCTION";
    public String U = "";
    public final ek.g V = j7.a.b0(c.f19850a);
    public gf.b W;
    public gf.b X;
    public final f.d Y = ((f.d) F(new ef.a(this, 5), new g.d()));

    /* compiled from: ListAwaitAuctionActivity.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ListAwaitAuctionActivity f19848a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ListAwaitAuctionActivity listAwaitAuctionActivity) {
            super(0);
            this.f19848a = listAwaitAuctionActivity;
        }

        public final Object invoke() {
            ListAwaitAuctionActivity listAwaitAuctionActivity = this.f19848a;
            int i10 = ListAwaitAuctionActivity.Z;
            listAwaitAuctionActivity.U().I.setPage(-1);
            this.f19848a.U().g(((d1) this.f19848a.M()).f21022z.getQuery().toString());
            return i.f20112a;
        }
    }

    /* compiled from: ListAwaitAuctionActivity.kt */
    public static final class b extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ListAwaitAuctionActivity f19849a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ListAwaitAuctionActivity listAwaitAuctionActivity) {
            super(0);
            this.f19849a = listAwaitAuctionActivity;
        }

        public final Object invoke() {
            ListAwaitAuctionActivity listAwaitAuctionActivity = this.f19849a;
            int i10 = ListAwaitAuctionActivity.Z;
            listAwaitAuctionActivity.U().g(((d1) this.f19849a.M()).f21022z.getQuery().toString());
            return i.f20112a;
        }
    }

    /* compiled from: ListAwaitAuctionActivity.kt */
    public static final class c extends k implements rk.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19850a = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            return new m(a.f19855a);
        }
    }

    /* compiled from: ListAwaitAuctionActivity.kt */
    public static final class d implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19851a;

        public d(l lVar) {
            this.f19851a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19851a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19851a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19851a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19851a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19852a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19852a = componentActivity;
        }

        public final Object invoke() {
            return this.f19852a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19853a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19853a = componentActivity;
        }

        public final Object invoke() {
            return this.f19853a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class g extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19854a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f19854a = componentActivity;
        }

        public final Object invoke() {
            return this.f19854a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_register_auction_list;
    }

    public final m T() {
        return (m) this.V.getValue();
    }

    public final HomeViewModel U() {
        return (HomeViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z11 = false;
        if (intent == null || !intent.hasExtra("AUTO_SEARCH")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            overridePendingTransition(2130772049, 2130772050);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ((d1) M()).B.setText(extras.getString("PROVINCE_TEXT"));
            U().I.setProvinceId(extras.getString("PROVINCE_ID"));
            if (extras.getBoolean("AUTO_FILTER")) {
                int i10 = h.f12560a;
                Intent intent2 = new Intent(this, FilterActivity.class);
                intent2.putExtra("selected_vehicles", new bc.h().i(this.W));
                intent2.putExtra("selected_provinces", new bc.h().i(this.X));
                this.Y.a(intent2);
            }
            extras.getBoolean("AUTO_FILTER");
        }
        ((AppTextView) ((d1) M()).A.f10530d).setText("Biển số sắp đấu giá");
        U().f19725w.e(this, new d(new ii.h(this)));
        U().f19719q.e(this, new d(new ii.i(this)));
        U().f19721s.e(this, new d(new ii.k(this)));
        U().E.e(this, new d(new ii.l(this)));
        U().g(((d1) M()).f21022z.getQuery().toString());
        T().f22997r = new ii.f(this);
        ((ImageButton) ((d1) M()).A.f10528b).setOnClickListener(new zh.d(this, 8));
        ((d1) M()).f21019w.setOnClickListener(new ei.a(this, 4));
        SearchView searchView = ((d1) M()).f21022z;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new ii.e(this));
        T().f22998s = new ii.g(this);
        Intent intent3 = getIntent();
        if (intent3 != null && intent3.hasExtra("AUTO_SEARCH")) {
            z11 = true;
        }
        if (z11) {
            ((d1) M()).f21022z.requestFocus();
        }
        T().f22996q = true;
        ((d1) M()).f21021y.getRecyclerView().setAdapter(T());
        RecyclerView recyclerView = ((d1) M()).f21021y.getRecyclerView();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.dp_8);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setHasFixedSize(true);
        recyclerView.i(new ii.a(dimensionPixelSize));
        ((d1) M()).f21021y.setOnPullRefreshAction(new a(this));
        ((d1) M()).f21021y.setOnLoadMoreAction(new b(this));
        kf.j.a(this, "Chưa có biển số", "Chúng tôi sẽ thông báo đến bạn ngay khi danh sách đấu giá được công bố.", C0531R$drawable.ic_notebook, (Integer) null, ((d1) M()).f21021y.getEmptyStateView());
    }

    public final void onPause() {
        super.onPause();
        Intent intent = getIntent();
        boolean z10 = true;
        if (intent == null || !intent.hasExtra("AUTO_SEARCH")) {
            z10 = false;
        }
        if (z10) {
            overridePendingTransition(2130772049, 2130772050);
        }
    }
}
