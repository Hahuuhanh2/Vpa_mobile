package com.vpa.daugia.module.cart.ui;

import al.g0;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.ots.core.R$font;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import gh.h;
import gh.t;
import java.util.WeakHashMap;
import mg.p;
import p3.l0;
import q.rorbin.badgeview.QBadgeView;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import vk.g;
import w1.d0;
import w1.q0;
import zg.a0;

/* compiled from: CartManagerActivity.kt */
public final class CartManagerActivity extends Hilt_CartManagerActivity<p> {
    public static final /* synthetic */ int W = 0;
    public final d0 R = new d0(s.a(CartViewModel.class), new d(this), new c(this), new e(this));
    public tl.a S;
    public tl.a T;
    public int U;
    public int V;

    /* compiled from: CartManagerActivity.kt */
    public static final class a extends ViewPager2.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CartManagerActivity f19592a;

        public a(CartManagerActivity cartManagerActivity) {
            this.f19592a = cartManagerActivity;
        }

        public final void c(int i10) {
            boolean z10;
            CartManagerActivity cartManagerActivity = this.f19592a;
            boolean z11 = true;
            if (cartManagerActivity.S != null) {
                if (i10 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                CartManagerActivity.T(cartManagerActivity, z10, cartManagerActivity.U, 1);
            }
            CartManagerActivity cartManagerActivity2 = this.f19592a;
            if (cartManagerActivity2.T != null) {
                if (i10 != 0) {
                    z11 = false;
                }
                CartManagerActivity.T(cartManagerActivity2, z11, cartManagerActivity2.V, 0);
            }
            this.f19592a.getClass();
        }
    }

    /* compiled from: CartManagerActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19593a;

        public b(l lVar) {
            this.f19593a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19593a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19593a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19593a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19593a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19594a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19594a = componentActivity;
        }

        public final Object invoke() {
            return this.f19594a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19595a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19595a = componentActivity;
        }

        public final Object invoke() {
            return this.f19595a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19596a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19596a = componentActivity;
        }

        public final Object invoke() {
            return this.f19596a.g();
        }
    }

    public static final QBadgeView T(CartManagerActivity cartManagerActivity, boolean z10, int i10, int i11) {
        int i12;
        String str;
        TabLayout.TabView tabView;
        cartManagerActivity.getClass();
        if (z10) {
            i12 = C0531R$drawable.bg_badge_active;
        } else {
            i12 = C0531R$drawable.bg_badge_inactive;
        }
        if (i10 > 100) {
            str = "99+";
        } else {
            str = String.valueOf(i10);
        }
        QBadgeView qBadgeView = new QBadgeView(cartManagerActivity);
        TabLayout.g h10 = ((p) cartManagerActivity.M()).f21280x.h(i11);
        if (h10 != null) {
            tabView = h10.f6932h;
        } else {
            tabView = null;
        }
        qBadgeView.a(tabView);
        qBadgeView.f(str);
        qBadgeView.f22735f = (float) l0.E(qBadgeView.getContext(), 12.0f);
        qBadgeView.e();
        qBadgeView.invalidate();
        Drawable drawable = k1.a.getDrawable(cartManagerActivity, i12);
        qBadgeView.f22734e = false;
        qBadgeView.f22732c = drawable;
        qBadgeView.b();
        qBadgeView.invalidate();
        return qBadgeView;
    }

    public final int N() {
        return C0535R$layout.activity_cart_manager;
    }

    public final CartViewModel U() {
        return (CartViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        a0 a0Var = new a0(1);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, a0Var);
        l0.j0(g0.W(this), (al.a0) null, new dh.b(this, (ik.d<? super dh.b>) null), 3);
        U().f19602i.e(this, new b(new dh.c(this)));
        U().f19604k.e(this, new b(new dh.d(this)));
        U().e(CartStatus.NOT_PAID);
        U().e(CartStatus.PAID);
        ((ImageButton) ((p) M()).f21281y.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 17));
        ((AppTextView) ((p) M()).f21281y.f10530d).setText(getString(C0540R$string.cart));
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        lf.j jVar = new lf.j(G, this);
        t tVar = new t();
        String string = getString(C0540R$string.unpaid);
        j.e(string, "getString(...)");
        jVar.A(tVar, string);
        h hVar = new h();
        String string2 = getString(C0540R$string.paid);
        j.e(string2, "getString(...)");
        jVar.A(hVar, string2);
        gh.l lVar = new gh.l();
        String string3 = getString(C0540R$string.refund);
        j.e(string3, "getString(...)");
        jVar.A(lVar, string3);
        ViewPager2 viewPager2 = ((p) M()).f21282z;
        viewPager2.setAdapter(jVar);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setUserInputEnabled(false);
        new com.google.android.material.tabs.c(((p) M()).f21280x, ((p) M()).f21282z, new dh.a(jVar, 0)).a();
        ((p) M()).f21282z.f3593c.f3627a.add(new a(this));
        TabLayout tabLayout = ((p) M()).f21280x;
        j.e(tabLayout, "tabLayout");
        Typeface create = Typeface.create(m1.e.a(this, R$font.sf_pro_display), 0);
        j.e(create, "create(...)");
        View childAt = tabLayout.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            g m10 = l0.U0(0, viewGroup.getChildCount()).iterator();
            while (m10.f23340c) {
                View childAt2 = viewGroup.getChildAt(m10.nextInt());
                if (childAt2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt2;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < viewGroup2.getChildCount()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            continue;
                            break;
                        }
                        int i11 = i10 + 1;
                        View childAt3 = viewGroup2.getChildAt(i10);
                        if (childAt3 != null) {
                            if (childAt3 instanceof TextView) {
                                ((TextView) childAt3).setTypeface(create);
                            }
                            i10 = i11;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    }
                }
            }
        }
        if (getIntent().hasExtra("SELECTION_VIEW") && j.a(getIntent().getStringExtra("SELECTION_VIEW"), "PAYMENT_SUCCESS_VIEW")) {
            ((p) M()).f21282z.setCurrentItem(1);
        }
    }
}
