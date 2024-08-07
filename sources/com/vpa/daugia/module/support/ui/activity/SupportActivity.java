package com.vpa.daugia.module.support.ui.activity;

import al.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.support.ui.SupportViewModel;
import ek.g;
import java.util.WeakHashMap;
import kh.h;
import mg.t1;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;

/* compiled from: SupportActivity.kt */
public final class SupportActivity extends Hilt_SupportActivity<t1> {
    public static final /* synthetic */ int U = 0;
    public final d0 R = new d0(s.a(SupportViewModel.class), new d(this), new c(this), new e(this));
    public String S = "";
    public final g T = j7.a.b0(a.f19900a);

    /* compiled from: SupportActivity.kt */
    public static final class a extends k implements rk.a<ui.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19900a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new ui.c(b.f19906a);
        }
    }

    /* compiled from: SupportActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19901a;

        public b(l lVar) {
            this.f19901a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19901a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19901a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19901a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19901a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19902a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19902a = componentActivity;
        }

        public final Object invoke() {
            return this.f19902a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19903a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19903a = componentActivity;
        }

        public final Object invoke() {
            return this.f19903a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19904a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19904a = componentActivity;
        }

        public final Object invoke() {
            return this.f19904a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_support;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        h hVar = new h(6);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, hVar);
        ((AppTextView) ((t1) M()).f21357y.f10530d).setText("Hướng dẫn tham gia");
        ((SupportViewModel) this.R.getValue()).f19892h.e(this, new b(new ti.f(this)));
        ((SupportViewModel) this.R.getValue()).f19894j.e(this, new b(new ti.g(this)));
        SupportViewModel supportViewModel = (SupportViewModel) this.R.getValue();
        l0.j0(l0.d0(supportViewModel), r0.f19085b, new si.b(supportViewModel, (ik.d<? super si.b>) null), 2);
        RecyclerView recyclerView = ((t1) M()).f21356x;
        recyclerView.setAdapter((ui.c) this.T.getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((ui.c) this.T.getValue()).f23071q = new ti.e(this);
        ((ImageButton) ((t1) M()).f21357y.f10528b).setOnClickListener(new ai.c(this, 10));
    }
}
