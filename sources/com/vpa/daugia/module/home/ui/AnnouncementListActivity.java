package com.vpa.daugia.module.home.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.h;
import com.ots.core.R$dimen;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import ek.g;
import java.util.WeakHashMap;
import kf.i;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import zg.a0;

/* compiled from: AnnouncementListActivity.kt */
public final class AnnouncementListActivity extends Hilt_AnnouncementListActivity<mg.a> {
    public static final /* synthetic */ int Z = 0;
    public final d0 R = new d0(s.a(HomeViewModel.class), new d(this), new c(this), new e(this));
    public String S = "";
    public String T = "";
    public lg.b U;
    public final g V = j7.a.b0(a.f19668a);
    public gf.b W;
    public gf.b X;
    public final f.d Y = ((f.d) F(new u5.a(this, 3), new g.d()));

    /* compiled from: AnnouncementListActivity.kt */
    public static final class a extends k implements rk.a<oh.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19668a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new oh.c(a.f19742a);
        }
    }

    /* compiled from: AnnouncementListActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19669a;

        public b(l lVar) {
            this.f19669a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19669a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19669a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19669a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19669a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19670a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19670a = componentActivity;
        }

        public final Object invoke() {
            return this.f19670a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19671a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19671a = componentActivity;
        }

        public final Object invoke() {
            return this.f19671a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19672a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19672a = componentActivity;
        }

        public final Object invoke() {
            return this.f19672a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_announcement_list;
    }

    public final oh.c T() {
        return (oh.c) this.V.getValue();
    }

    public final HomeViewModel U() {
        return (HomeViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        a0 a0Var = new a0(4);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, a0Var);
        Intent intent = getIntent();
        boolean z11 = true;
        if (intent == null || !intent.hasExtra("AUTO_SEARCH")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            overridePendingTransition(2130772049, 2130772050);
        }
        AppTextView appTextView = (AppTextView) ((mg.a) M()).A.f10530d;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (str = extras.getString("title")) == null) {
            str = "Danh sách công bố";
        }
        appTextView.setText(str);
        ((mg.a) M()).f20932y.getRecyclerView().setAdapter(T());
        RecyclerView recyclerView = ((mg.a) M()).f20932y.getRecyclerView();
        oh.c T2 = T();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.dp_8);
        j.f(recyclerView, "view");
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((androidx.recyclerview.widget.w) itemAnimator).f3302g = false;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(T2);
        recyclerView.i(new i(2, dimensionPixelSize));
        ((mg.a) M()).f20932y.setOnPullRefreshAction(new nh.a(this));
        ((mg.a) M()).f20932y.setOnLoadMoreAction(new nh.b(this));
        T().f21796r = new nh.c(this);
        kf.j.a(this, "Chưa có biển số", "Chúng tôi sẽ thông báo đến bạn ngay khi danh sách đấu giá được công bố.", C0531R$drawable.ic_notebook, (Integer) null, ((mg.a) M()).f20932y.getEmptyStateView());
        ((ImageButton) ((mg.a) M()).A.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 23));
        ((mg.a) M()).f20930w.setOnClickListener(new h(this, 22));
        SearchView searchView = ((mg.a) M()).f20933z;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new nh.e(this));
        T().f21795q = new nh.f(this);
        T().f21795q = new nh.g(this);
        Intent intent2 = getIntent();
        if (intent2 == null || !intent2.hasExtra("AUTO_SEARCH")) {
            z11 = false;
        }
        if (z11) {
            ((mg.a) M()).f20933z.requestFocus();
        }
        U().f19713k.e(this, new b(new nh.h(this)));
        U().f19719q.e(this, new b(new nh.i(this)));
        U().f19721s.e(this, new b(new nh.k(this)));
        U().E.e(this, new b(new nh.l(this)));
        U().e((String) null);
        getIntent();
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
