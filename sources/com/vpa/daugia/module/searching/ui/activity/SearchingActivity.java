package com.vpa.daugia.module.searching.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel;
import java.util.List;
import mg.l1;
import r2.w;
import sk.k;
import sk.s;

/* compiled from: SearchingActivity.kt */
public final class SearchingActivity extends BaseActivity<l1> {
    public static final /* synthetic */ int Q = 0;
    public final d0 O = new d0(s.a(SearchViewModel.class), new c(this), new b(this), new d(this));
    public final f.d P = ((f.d) F(new u5.a(this, 8), new g.d()));

    /* compiled from: SearchingActivity.kt */
    public static final class a extends gc.a<List<? extends gf.b>> {
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19872a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19872a = componentActivity;
        }

        public final Object invoke() {
            return this.f19872a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19873a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19873a = componentActivity;
        }

        public final Object invoke() {
            return this.f19873a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19874a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19874a = componentActivity;
        }

        public final Object invoke() {
            return this.f19874a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_searching;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((l1) M()).f21162y.f10530d).setText(getString(C0540R$string.searching));
        ((ImageButton) ((l1) M()).f21162y.f10528b).setOnClickListener(new ai.c(this, 9));
        ((l1) M()).f21160w.setOnClickListener(new zh.d(this, 11));
    }
}
