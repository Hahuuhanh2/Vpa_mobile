package com.vpa.daugia.module.scope.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel;
import ek.g;
import java.util.List;
import kf.j;
import mg.j1;
import r2.w;
import sk.k;
import sk.s;

/* compiled from: ScopeActivity.kt */
public final class ScopeActivity extends BaseActivity<j1> {
    public static final /* synthetic */ int R = 0;
    public final d0 O = new d0(s.a(SearchViewModel.class), new d(this), new c(this), new e(this));
    public final g P = j7.a.b0(b.f19860a);
    public final f.d Q = ((f.d) F(new ef.a(this, 7), new g.d()));

    /* compiled from: ScopeActivity.kt */
    public static final class a extends gc.a<List<? extends gf.b>> {
    }

    /* compiled from: ScopeActivity.kt */
    public static final class b extends k implements rk.a<ni.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19860a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return new ni.d(a.f19864a);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19861a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19861a = componentActivity;
        }

        public final Object invoke() {
            return this.f19861a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19862a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19862a = componentActivity;
        }

        public final Object invoke() {
            return this.f19862a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19863a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19863a = componentActivity;
        }

        public final Object invoke() {
            return this.f19863a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_scope;
    }

    public final ni.d T() {
        return (ni.d) this.P.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((j1) M()).f21125y.f10530d).setText("Khoảng biển");
        try {
            ((j1) M()).f21124x.getRecyclerView().setAdapter(T());
            ((j1) M()).f21124x.setOnPullRefreshAction(new mi.a(this));
            ((j1) M()).f21124x.setSetClearAdapterAction(new mi.b(this));
            ((j1) M()).f21124x.setOnLoadMoreAction(mi.c.f21545a);
            j.a(this, "Không có kết quả phù hợp", "", C0531R$drawable.ic_notebook, -1, ((j1) M()).f21124x.getEmptyStateView());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        T().A(j7.a.e("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"));
        ((j1) M()).f21124x.b(T().f9444f);
        ((ImageButton) ((j1) M()).f21125y.f10528b).setOnClickListener(new zh.d(this, 9));
        ((j1) M()).f21123w.setOnClickListener(new ei.a(this, 6));
    }
}
