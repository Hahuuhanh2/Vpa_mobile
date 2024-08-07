package com.vpa.daugia.module.searching.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.h;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.button.MaterialButton;
import com.ots.core.R$dimen;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.searching.ui.viewmodel.FilterViewModel;
import kf.i;
import mg.z;
import r2.q;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: FilterActivity.kt */
public final class FilterActivity extends Hilt_FilterActivity<z> {
    public static final /* synthetic */ int Y = 0;
    public gf.b R;
    public gf.b S;
    public final d0 T = new d0(s.a(FilterViewModel.class), new e(this), new d(this), new f(this));
    public boolean U;
    public final ek.g V = j7.a.b0(new g(this));
    public final ek.g W = j7.a.b0(new a(this));
    public final ek.g X = j7.a.b0(new c(this));

    /* compiled from: FilterActivity.kt */
    public static final class a extends k implements rk.a<pi.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FilterActivity f19865a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(FilterActivity filterActivity) {
            super(0);
            this.f19865a = filterActivity;
        }

        public final Object invoke() {
            return new pi.a(new a(this.f19865a));
        }
    }

    /* compiled from: FilterActivity.kt */
    public static final class b implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19866a;

        public b(l lVar) {
            this.f19866a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19866a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19866a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19866a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19866a.hashCode();
        }
    }

    /* compiled from: FilterActivity.kt */
    public static final class c extends k implements rk.a<pi.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FilterActivity f19867a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(FilterActivity filterActivity) {
            super(0);
            this.f19867a = filterActivity;
        }

        public final Object invoke() {
            return new pi.b(new b(this.f19867a));
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19868a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19868a = componentActivity;
        }

        public final Object invoke() {
            return this.f19868a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19869a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19869a = componentActivity;
        }

        public final Object invoke() {
            return this.f19869a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19870a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19870a = componentActivity;
        }

        public final Object invoke() {
            return this.f19870a.g();
        }
    }

    /* compiled from: FilterActivity.kt */
    public static final class g extends k implements rk.a<pi.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FilterActivity f19871a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(FilterActivity filterActivity) {
            super(0);
            this.f19871a = filterActivity;
        }

        public final Object invoke() {
            return new pi.c(new c(this.f19871a));
        }
    }

    public static final void T(FilterActivity filterActivity) {
        MaterialButton materialButton = ((z) filterActivity.M()).f21507x;
        boolean z10 = true;
        if (!(!filterActivity.V().B().isEmpty()) && !(!filterActivity.U().u().isEmpty())) {
            z10 = false;
        }
        materialButton.setEnabled(z10);
    }

    public final int N() {
        return C0535R$layout.activity_filter;
    }

    public final pi.a U() {
        return (pi.a) this.W.getValue();
    }

    public final pi.c V() {
        return (pi.c) this.V.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((z) M()).G.f10530d).setText(getString(C0540R$string.filter_title));
        this.R = (gf.b) new h().d(gf.b.class, getIntent().getStringExtra("selected_vehicles"));
        this.S = (gf.b) new h().d(gf.b.class, getIntent().getStringExtra("selected_provinces"));
        ((z) M()).D.setAdapter(V());
        RecyclerView recyclerView = ((z) M()).D;
        j.e(recyclerView, "rvVehicle");
        pi.c V2 = V();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.dp_16);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((androidx.recyclerview.widget.w) itemAnimator).f3302g = false;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(V2);
        recyclerView.i(new i(2, dimensionPixelSize));
        RecyclerView recyclerView2 = ((z) M()).B;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        recyclerView2.setAdapter(U());
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.f1(0);
        flexboxLayoutManager.g1(1);
        RecyclerView recyclerView3 = ((z) M()).C;
        recyclerView3.setLayoutManager(flexboxLayoutManager);
        recyclerView3.setAdapter((pi.b) this.X.getValue());
        ((FilterViewModel) this.T.getValue()).f19881g.e(this, new b(new oi.g(this)));
        ((FilterViewModel) this.T.getValue()).f19879e.e(this, new b(new oi.h(this)));
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new oi.a(this));
        ((ImageButton) ((z) M()).G.f10528b).setOnClickListener(new oi.b(this, 0));
        ((z) M()).f21507x.setOnClickListener(new ai.c(this, 8));
        ((z) M()).f21506w.setOnClickListener(new zh.d(this, 10));
        SearchView searchView = ((z) M()).F;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new oi.e(this));
        ((z) M()).I.setOnClickListener(new oi.b(this, 1));
        TextView textView = ((z) M()).H;
        j.e(textView, "tvProvince");
        textView.setOnClickListener(new kf.b(100, textView, new oi.f(this)));
    }

    public final void onDestroy() {
        super.onDestroy();
        getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(new oi.c());
    }
}
