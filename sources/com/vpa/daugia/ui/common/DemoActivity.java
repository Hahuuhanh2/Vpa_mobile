package com.vpa.daugia.ui.common;

import android.annotation.SuppressLint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.TransitionManager;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.home.data.model.Action;
import com.vpa.daugia.module.home.data.model.Item;
import ek.g;
import ek.i;
import java.util.ArrayList;
import mg.i2;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.q;
import sk.s;

@SuppressLint({"CustomSplashScreen"})
/* compiled from: DemoActivity.kt */
public final class DemoActivity extends Hilt_DemoActivity<i2> {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f19915a0 = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new d(this), new c(this), new e(this));
    public float S;
    public float T;
    public float U;
    public float V;
    public Path W = new Path();
    public boolean X;
    public lg.b Y;
    public final g Z = j7.a.b0(new a(this));

    /* compiled from: DemoActivity.kt */
    public static final class a extends k implements rk.a<oh.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DemoActivity f19916a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DemoActivity demoActivity) {
            super(0);
            this.f19916a = demoActivity;
        }

        public final Object invoke() {
            lg.b bVar = this.f19916a.Y;
            if (bVar != null) {
                return new oh.a(bVar, a.f19922a);
            }
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    /* compiled from: DemoActivity.kt */
    public static final class b extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DemoActivity f19917a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f19918b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(DemoActivity demoActivity, q qVar) {
            super(1);
            this.f19917a = demoActivity;
            this.f19918b = qVar;
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            j.f(view, "it");
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            Explode explode = new Explode();
            explode.setEpicenterCallback(new b(rect));
            explode.setDuration(1000);
            TransitionManager.beginDelayedTransition(((i2) this.f19917a.M()).f21110y, explode);
            if (this.f19918b.f22930a) {
                ((i2) this.f19917a.M()).f21110y.setAdapter((RecyclerView.e) null);
            } else {
                ((i2) this.f19917a.M()).f21110y.setAdapter((oh.a) this.f19917a.Z.getValue());
            }
            q qVar = this.f19918b;
            qVar.f22930a = !qVar.f22930a;
            return i.f20112a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19919a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19919a = componentActivity;
        }

        public final Object invoke() {
            return this.f19919a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19920a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19920a = componentActivity;
        }

        public final Object invoke() {
            return this.f19920a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19921a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19921a = componentActivity;
        }

        public final Object invoke() {
            return this.f19921a.g();
        }
    }

    public final int N() {
        return C0535R$layout.demo_input_view;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((i2) M()).v((LoginViewModel) this.R.getValue());
        Integer valueOf = Integer.valueOf(C0531R$drawable.ic_action_docs);
        Integer valueOf2 = Integer.valueOf(C0531R$drawable.ic_action_list);
        Integer valueOf3 = Integer.valueOf(C0531R$drawable.ic_actions_support);
        Integer num = valueOf3;
        Integer num2 = valueOf3;
        Integer num3 = valueOf3;
        Integer num4 = valueOf2;
        ArrayList g02 = j7.a.g0(new Item((Action) null, valueOf, (String) null, false, "Thông báo đấu giá", 13, (sk.e) null), new Item((Action) null, valueOf2, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, Integer.valueOf(C0531R$drawable.ic_action_result), (String) null, false, "Biển số sắp đấu giá", 13, (sk.e) null), new Item((Action) null, num, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, valueOf, (String) null, false, "Thông báo đấu giá", 13, (sk.e) null), new Item((Action) null, num2, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num2, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, valueOf, (String) null, false, "Thông báo đấu giá", 13, (sk.e) null), new Item((Action) null, num3, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num3, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num3, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num3, (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, valueOf, (String) null, false, "Thông báo đấu giá", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, num4, (String) null, false, "Danh sách công bố", 13, (sk.e) null));
        ((i2) M()).f21110y.setAdapter((oh.a) this.Z.getValue());
        RecyclerView recyclerView = ((i2) M()).f21110y;
        j.e(recyclerView, "rcv");
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((androidx.recyclerview.widget.w) itemAnimator).f3302g = false;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((oh.a) this.Z.getValue());
        recyclerView.i(new kf.i(4, 10));
        ((oh.a) this.Z.getValue()).A(g02);
        ((i2) M()).f21108w.setOnTouchListener(new com.google.android.material.search.c(this, 1));
        q qVar = new q();
        qVar.f22930a = true;
        MaterialButton materialButton = ((i2) M()).f21108w;
        j.e(materialButton, "btn");
        materialButton.setOnClickListener(new kf.b(1000, materialButton, new b(this, qVar)));
    }
}
