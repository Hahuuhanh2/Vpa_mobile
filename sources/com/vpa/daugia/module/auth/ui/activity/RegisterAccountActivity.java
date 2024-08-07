package com.vpa.daugia.module.auth.ui.activity;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.google.android.material.search.h;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.ui.viewmodel.RegisterViewModel;
import java.util.WeakHashMap;
import mg.b1;
import r2.w;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import zg.a0;
import zg.b0;
import zg.c0;

/* compiled from: RegisterAccountActivity.kt */
public final class RegisterAccountActivity extends Hilt_RegisterAccountActivity<b1> {
    public static String T = "OPTIONS";
    public static String U = "PERSONAL";
    public static String V = "ORGANIZATION";
    public final d0 R = new d0(s.a(RegisterViewModel.class), new b(this), new a(this), new c(this));
    public final RegisterAccountActivity$mMessageReceiver$1 S = new RegisterAccountActivity$mMessageReceiver$1(this);

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class a extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19517a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f19517a = componentActivity;
        }

        public final Object invoke() {
            return this.f19517a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19518a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19518a = componentActivity;
        }

        public final Object invoke() {
            return this.f19518a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19519a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19519a = componentActivity;
        }

        public final Object invoke() {
            return this.f19519a.g();
        }
    }

    static {
        new ck.a();
        new ck.a();
    }

    public final int N() {
        return C0535R$layout.activity_register_account;
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        Spanned spanned;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        a0 a0Var = new a0(0);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, a0Var);
        AppTextView appTextView = ((b1) M()).B;
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml("Bạn là <strong><font color = '#01B49A'>cá nhân</font></strong> hay <strong><font color = '#01B49A'>tổ chức</font></strong>?", 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml("Bạn là <strong><font color = '#01B49A'>cá nhân</font></strong> hay <strong><font color = '#01B49A'>tổ chức</font></strong>?");
            j.c(spanned);
        }
        appTextView.setText(spanned);
        ((b1) M()).f20971z.setOnCheckedChangeListener(new b0(this, 0));
        ((b1) M()).A.setOnCheckedChangeListener(new c0(this, 0));
        ((b1) M()).f20969x.setOnClickListener(new h(this, 14));
        ((b1) M()).f20968w.setOnClickListener(new com.google.android.material.textfield.b(this, 14));
    }

    public final void onStart() {
        super.onStart();
        u2.a.a(this).b(this.S, new IntentFilter("QR_CODE"));
    }
}
