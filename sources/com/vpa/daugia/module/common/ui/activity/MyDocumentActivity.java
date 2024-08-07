package com.vpa.daugia.module.common.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import ek.g;
import java.util.WeakHashMap;
import mg.i0;
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

/* compiled from: MyDocumentActivity.kt */
public final class MyDocumentActivity extends Hilt_MyDocumentActivity<i0> {
    public static final /* synthetic */ int V = 0;
    public final d0 R = new d0(s.a(CommonViewModel.class), new d(this), new c(this), new e(this));
    public v1.c<Long, Long> S;
    public boolean T = true;
    public final g U = j7.a.b0(new a(this));

    /* compiled from: MyDocumentActivity.kt */
    public static final class a extends k implements rk.a<jh.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MyDocumentActivity f19628a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(MyDocumentActivity myDocumentActivity) {
            super(0);
            this.f19628a = myDocumentActivity;
        }

        public final Object invoke() {
            return new jh.b(new a(this.f19628a));
        }
    }

    /* compiled from: MyDocumentActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19629a;

        public b(ih.f fVar) {
            this.f19629a = fVar;
        }

        public final ek.a<?> a() {
            return this.f19629a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19629a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19629a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19629a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19630a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19630a = componentActivity;
        }

        public final Object invoke() {
            return this.f19630a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19631a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19631a = componentActivity;
        }

        public final Object invoke() {
            return this.f19631a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19632a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19632a = componentActivity;
        }

        public final Object invoke() {
            return this.f19632a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_my_document;
    }

    public final jh.b T() {
        return (jh.b) this.U.getValue();
    }

    public final CommonViewModel U() {
        return (CommonViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        a0 a0Var = new a0(2);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, a0Var);
        U().f19620g.e(this, new b(new ih.f(this)));
        ((AppTextView) ((i0) M()).A.f10530d).setText(getString(C0540R$string.my_document));
        ((i0) M()).f21104y.getRecyclerView().setAdapter(T());
        ((i0) M()).f21104y.setOnPullRefreshAction(new ih.b(this));
        ((i0) M()).f21104y.setOnLoadMoreAction(new ih.c(this));
        CommonViewModel.e(U(), (String) null, 7);
        kf.j.a(this, "Chưa có tài liệu nào", "", C0531R$drawable.ic_note_history, (Integer) null, ((i0) M()).f21104y.getEmptyStateView());
        ((i0) M()).f21102w.setOnClickListener(new com.google.android.material.datepicker.q(this, 19));
        SearchView searchView = ((i0) M()).f21105z;
        j.e(searchView, "searchView");
        searchView.setOnQueryTextListener(new ih.e(this));
        ((ImageButton) ((i0) M()).A.f10528b).setOnClickListener(new com.google.android.material.textfield.b(this, 18));
    }
}
