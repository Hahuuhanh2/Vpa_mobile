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

/* compiled from: QuestionActivity.kt */
public final class QuestionActivity extends Hilt_QuestionActivity<t1> {
    public static final /* synthetic */ int T = 0;
    public final d0 R = new d0(s.a(SupportViewModel.class), new d(this), new c(this), new e(this));
    public final g S = j7.a.b0(a.f19895a);

    /* compiled from: QuestionActivity.kt */
    public static final class a extends k implements rk.a<ui.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19895a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new ui.g(a.f19905a);
        }
    }

    /* compiled from: QuestionActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19896a;

        public b(ti.c cVar) {
            this.f19896a = cVar;
        }

        public final ek.a<?> a() {
            return this.f19896a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19896a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19896a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19896a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19897a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19897a = componentActivity;
        }

        public final Object invoke() {
            return this.f19897a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19898a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19898a = componentActivity;
        }

        public final Object invoke() {
            return this.f19898a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19899a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19899a = componentActivity;
        }

        public final Object invoke() {
            return this.f19899a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_support;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        vb.d dVar = new vb.d(3);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, dVar);
        ((AppTextView) ((t1) M()).f21357y.f10530d).setText("Câu hỏi thường gặp");
        ((SupportViewModel) this.R.getValue()).f19890f.e(this, new b(new ti.c(this)));
        SupportViewModel supportViewModel = (SupportViewModel) this.R.getValue();
        l0.j0(l0.d0(supportViewModel), r0.f19085b, new si.c(supportViewModel, (ik.d<? super si.c>) null), 2);
        RecyclerView recyclerView = ((t1) M()).f21356x;
        recyclerView.setAdapter((ui.g) this.S.getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ((ImageButton) ((t1) M()).f21357y.f10528b).setOnClickListener(new zh.d(this, 12));
    }
}
