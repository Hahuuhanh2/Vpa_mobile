package com.vpa.daugia.module.menu.ui.fragment;

import al.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import java.util.WeakHashMap;
import mg.k3;
import p3.l0;
import r2.q;
import r2.w;
import r2.x;
import rk.l;
import s2.a;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;

/* compiled from: MenuFragment.kt */
public final class MenuFragment extends uh.a<k3> {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f19755o0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public lg.b f19756m0;

    /* renamed from: n0  reason: collision with root package name */
    public final d0 f19757n0;

    /* compiled from: MenuFragment.kt */
    public static final class a extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MenuFragment f19758a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(MenuFragment menuFragment) {
            super(1);
            this.f19758a = menuFragment;
        }

        public final Object invoke(Object obj) {
            sk.j.f((View) obj, "it");
            this.f19758a.h0(new Intent(this.f19758a.d0(), AuctionResultActivity.class));
            return ek.i.f20112a;
        }
    }

    /* compiled from: MenuFragment.kt */
    public static final class b extends k implements l<String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MenuFragment f19759a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MenuFragment menuFragment) {
            super(1);
            this.f19759a = menuFragment;
        }

        public final Object invoke(Object obj) {
            ((k3) this.f19759a.i0()).G.setText((String) obj);
            return ek.i.f20112a;
        }
    }

    /* compiled from: MenuFragment.kt */
    public static final class c extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MenuFragment f19760a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MenuFragment menuFragment) {
            super(1);
            this.f19760a = menuFragment;
        }

        public final Object invoke(Object obj) {
            sk.j.f((View) obj, "it");
            Context d02 = this.f19760a.d0();
            String x10 = this.f19760a.x(C0540R$string.confirm_logout);
            sk.j.e(x10, "getString(...)");
            String x11 = this.f19760a.x(C0540R$string.ask_to_logout);
            sk.j.e(x11, "getString(...)");
            String x12 = this.f19760a.x(2132017215);
            sk.j.e(x12, "getString(...)");
            String x13 = this.f19760a.x(2132017249);
            sk.j.e(x13, "getString(...)");
            jf.b bVar = new jf.b(d02, x10, x11, x12, x13, true);
            bVar.f11889j = new a(this.f19760a);
            bVar.h();
            return ek.i.f20112a;
        }
    }

    /* compiled from: MenuFragment.kt */
    public static final class d extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MenuFragment f19761a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(MenuFragment menuFragment) {
            super(1);
            this.f19761a = menuFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r4) {
            /*
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.String r0 = "it"
                sk.j.f(r4, r0)
                com.vpa.daugia.module.menu.ui.fragment.MenuFragment r4 = r3.f19761a
                lg.b r4 = r4.m0()
                com.vpa.daugia.module.auth.data.model.User r4 = r4.e()
                r0 = 0
                if (r4 == 0) goto L_0x0029
                java.lang.Integer r4 = r4.getAccountType()
                com.vpa.daugia.module.auth.data.model.AccountType r1 = com.vpa.daugia.module.auth.data.model.AccountType.ORGANIZATION
                int r1 = r1.getValue()
                if (r4 != 0) goto L_0x0021
                goto L_0x0029
            L_0x0021:
                int r4 = r4.intValue()
                if (r4 != r1) goto L_0x0029
                r4 = 1
                goto L_0x002a
            L_0x0029:
                r4 = r0
            L_0x002a:
                if (r4 == 0) goto L_0x003f
                com.vpa.daugia.module.menu.ui.fragment.MenuFragment r4 = r3.f19761a
                android.content.Intent r0 = new android.content.Intent
                com.vpa.daugia.module.menu.ui.fragment.MenuFragment r1 = r3.f19761a
                android.content.Context r1 = r1.d0()
                java.lang.Class<com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity> r2 = com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity.class
                r0.<init>(r1, r2)
                r4.h0(r0)
                goto L_0x0056
            L_0x003f:
                android.content.Intent r4 = new android.content.Intent
                com.vpa.daugia.module.menu.ui.fragment.MenuFragment r1 = r3.f19761a
                android.content.Context r1 = r1.d0()
                java.lang.Class<com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity> r2 = com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity.class
                r4.<init>(r1, r2)
                java.lang.String r1 = "ON_VERIFY_PROFILE"
                r4.putExtra(r1, r0)
                com.vpa.daugia.module.menu.ui.fragment.MenuFragment r0 = r3.f19761a
                r0.h0(r4)
            L_0x0056:
                ek.i r4 = ek.i.f20112a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.module.menu.ui.fragment.MenuFragment.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MenuFragment.kt */
    public static final class e implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19762a;

        public e(l lVar) {
            this.f19762a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19762a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19762a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return sk.j.a(this.f19762a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19762a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f19763a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f19763a = fragment;
        }

        public final Object invoke() {
            return this.f19763a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f19764a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f19764a = fVar;
        }

        public final Object invoke() {
            return (x) this.f19764a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class h extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19765a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ek.c cVar) {
            super(0);
            this.f19765a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f19765a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class i extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19766a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ek.c cVar) {
            super(0);
            this.f19766a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f19766a);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                return fVar.g();
            }
            return a.C0190a.f14602b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class j extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f19767a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f19768b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment, ek.c cVar) {
            super(0);
            this.f19767a = fragment;
            this.f19768b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f19768b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f19767a.f();
            sk.j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public MenuFragment() {
        f fVar = new f(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new g(fVar));
        this.f19757n0 = j0.b(this, s.a(MenuViewModel.class), new h(a02), new i(a02), new j(this, a02));
    }

    public final void S() {
        this.J = true;
        MenuViewModel n02 = n0();
        l0.j0(l0.d0(n02), r0.f19085b, new rh.b(n02, (ik.d<? super rh.b>) null), 2);
    }

    public final void W(View view, Bundle bundle) {
        sk.j.f(view, "view");
        ea.c cVar = new ea.c(this, 27);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(view, cVar);
        n0().f19750f.e(y(), new e(new uh.d(this)));
        n0().f19752h.e(y(), new e(new uh.e(this)));
        n0().f19751g.e(y(), new e(new uh.f(this)));
        MenuViewModel n02 = n0();
        l0.j0(l0.d0(n02), r0.f19085b, new rh.a(n02, (ik.d<? super rh.a>) null), 2);
        n0().f19754j.e(y(), new e(new b(this)));
        AppTextView appTextView = ((k3) i0()).f21153z;
        sk.j.e(appTextView, "btnLogout");
        appTextView.setOnClickListener(new kf.b(500, appTextView, new c(this)));
        ((k3) i0()).f21150w.setOnClickListener(new uh.b(this, 0));
        ((k3) i0()).B.setOnClickListener(new uh.c(this, 0));
        ((k3) i0()).f21152y.setOnClickListener(new com.google.android.material.textfield.b(this, 26));
        ((k3) i0()).f21151x.setOnClickListener(new uh.b(this, 1));
        ((k3) i0()).F.setOnClickListener(new uh.c(this, 1));
        AppTextView appTextView2 = ((k3) i0()).I;
        sk.j.e(appTextView2, "tvVerify");
        appTextView2.setOnClickListener(new kf.b(500, appTextView2, new d(this)));
        AppTextView appTextView3 = ((k3) i0()).A;
        sk.j.e(appTextView3, "btnResult");
        appTextView3.setOnClickListener(new kf.b(500, appTextView3, new a(this)));
        User e10 = m0().e();
        if (e10 != null) {
            ((k3) i0()).v(new rh.f(d0(), e10, m0()));
        }
    }

    public final int j0() {
        return C0535R$layout.fragment_menu;
    }

    public final lg.b m0() {
        lg.b bVar = this.f19756m0;
        if (bVar != null) {
            return bVar;
        }
        sk.j.l("sharedPrefsHelper");
        throw null;
    }

    public final MenuViewModel n0() {
        return (MenuViewModel) this.f19757n0.getValue();
    }
}
