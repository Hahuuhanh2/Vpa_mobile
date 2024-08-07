package com.vpa.daugia.module.auction.ui.activity;

import al.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import bc.h;
import c0.i0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auction.data.model.AuctionResult;
import com.vpa.daugia.module.auction.ui.AuctionViewModel;
import ek.g;
import java.util.WeakHashMap;
import mg.v;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sg.m;
import sg.o;
import sg.p;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import tg.n;
import w1.d0;
import w1.q0;

/* compiled from: DetailAuctionResultActivity.kt */
public final class DetailAuctionResultActivity extends Hilt_DetailAuctionResultActivity<v> {
    public static final /* synthetic */ int U = 0;
    public final d0 R = new d0(s.a(AuctionViewModel.class), new d(this), new c(this), new e(this));
    public AuctionResult S = new AuctionResult((Long) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, 511, (sk.e) null);
    public final g T = j7.a.b0(a.f19413a);

    /* compiled from: DetailAuctionResultActivity.kt */
    public static final class a extends k implements rk.a<n> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19413a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new n(c.f19426a);
        }
    }

    /* compiled from: DetailAuctionResultActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19414a;

        public b(p pVar) {
            this.f19414a = pVar;
        }

        public final ek.a<?> a() {
            return this.f19414a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19414a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19414a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19414a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19415a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19415a = componentActivity;
        }

        public final Object invoke() {
            return this.f19415a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19416a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19416a = componentActivity;
        }

        public final Object invoke() {
            return this.f19416a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19417a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19417a = componentActivity;
        }

        public final Object invoke() {
            return this.f19417a.g();
        }
    }

    public DetailAuctionResultActivity() {
    }

    public final int N() {
        return C0535R$layout.activity_detail_auction_result;
    }

    public final AuctionViewModel T() {
        return (AuctionViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        i0 i0Var = new i0(26);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, i0Var);
        ((AppTextView) ((v) M()).f21396z.f10530d).setText(getString(C0540R$string.detail));
        T().f19390k.e(this, new b(new p(this)));
        ((v) M()).f21394x.getRecyclerView().setAdapter((n) this.T.getValue());
        ((v) M()).f21394x.setOnPullRefreshAction(new m(this));
        kf.j.a(this, "Chưa có lịch sử đấu giá", "", C0531R$drawable.ic_note_history, (Integer) null, ((v) M()).f21394x.getEmptyStateView());
        SearchView searchView = ((v) M()).f21395y;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new o(this));
        ((ImageButton) ((v) M()).f21396z.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 7));
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("DATA_AUCTION")) != null) {
            Object d10 = new h().d(AuctionResult.class, string);
            j.e(d10, "fromJson(...)");
            this.S = (AuctionResult) d10;
            ((v) M()).v(new ug.a(this.S));
            AuctionViewModel T2 = T();
            l0.j0(l0.d0(T2), r0.f19085b, new rg.c(T2, String.valueOf(this.S.getSessionId()), (String) null, (ik.d<? super rg.c>) null), 2);
        }
    }
}
