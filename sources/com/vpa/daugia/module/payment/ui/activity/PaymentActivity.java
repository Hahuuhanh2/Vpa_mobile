package com.vpa.daugia.module.payment.ui.activity;

import al.r0;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.viewpager2.widget.ViewPager2;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.payment.ui.PaymentViewModel;
import mg.q0;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: PaymentActivity.kt */
public final class PaymentActivity extends Hilt_PaymentActivity<q0> {
    public static String S = "";
    public final d0 R = new d0(s.a(PaymentViewModel.class), new c(this), new b(this), new d(this));

    /* compiled from: PaymentActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19795a;

        public a(zh.b bVar) {
            this.f19795a = bVar;
        }

        public final ek.a<?> a() {
            return this.f19795a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19795a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19795a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19795a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19796a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19796a = componentActivity;
        }

        public final Object invoke() {
            return this.f19796a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19797a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19797a = componentActivity;
        }

        public final Object invoke() {
            return this.f19797a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19798a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19798a = componentActivity;
        }

        public final Object invoke() {
            return this.f19798a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_payment;
    }

    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        ((PaymentViewModel) this.R.getValue()).f19794i.e(this, new a(new zh.b(this)));
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || (string = extras.getString("DATA_CART")) == null)) {
            S = string;
            PaymentViewModel paymentViewModel = (PaymentViewModel) this.R.getValue();
            l0.j0(l0.d0(paymentViewModel), r0.f19085b, new yh.c(paymentViewModel, string, (ik.d<? super yh.c>) null), 2);
        }
        ((AppTextView) ((q0) M()).f21302y.f10530d).setText(getString(C0540R$string.payment));
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        lf.j jVar = new lf.j(G, this);
        ai.j jVar2 = new ai.j();
        String string2 = getString(C0540R$string.transfer_payment);
        j.e(string2, "getString(...)");
        jVar.A(jVar2, string2);
        ai.b bVar = new ai.b();
        String string3 = getString(C0540R$string.online_payment);
        j.e(string3, "getString(...)");
        jVar.A(bVar, string3);
        ViewPager2 viewPager2 = ((q0) M()).f21303z;
        viewPager2.setAdapter(jVar);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setUserInputEnabled(false);
        new com.google.android.material.tabs.c(((q0) M()).f21301x, ((q0) M()).f21303z, new dh.a(jVar, 1)).a();
        PaymentViewModel paymentViewModel2 = (PaymentViewModel) this.R.getValue();
        l0.j0(l0.d0(paymentViewModel2), r0.f19085b, new yh.b(paymentViewModel2, S, (ik.d<? super yh.b>) null), 2);
        ((ImageButton) ((q0) M()).f21302y.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 29));
    }
}
