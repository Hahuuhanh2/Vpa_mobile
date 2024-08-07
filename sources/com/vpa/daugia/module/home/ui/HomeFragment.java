package com.vpa.daugia.module.home.ui;

import al.r0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.home.data.model.Action;
import com.vpa.daugia.module.home.data.model.Item;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import lf.g;
import mg.g3;
import nh.a0;
import nh.b0;
import nh.c0;
import nh.e0;
import nh.i0;
import nh.k0;
import nh.l0;
import nh.m0;
import nh.n0;
import nh.o0;
import nh.p0;
import nh.q0;
import nh.w0;
import nh.z;
import nh.z0;
import q.l;
import q.rorbin.badgeview.QBadgeView;
import r2.q;
import r2.w;
import r2.x;
import s2.a;
import sk.s;

/* compiled from: HomeFragment.kt */
public final class HomeFragment extends z<g3> {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f19678z0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final d0 f19679m0;

    /* renamed from: n0  reason: collision with root package name */
    public lg.b f19680n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f19681o0 = "REGISTER_AUCTION";

    /* renamed from: p0  reason: collision with root package name */
    public String f19682p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    public QBadgeView f19683q0;

    /* renamed from: r0  reason: collision with root package name */
    public QBadgeView f19684r0;

    /* renamed from: s0  reason: collision with root package name */
    public q.l f19685s0;

    /* renamed from: t0  reason: collision with root package name */
    public l.d f19686t0;

    /* renamed from: u0  reason: collision with root package name */
    public final androidx.fragment.app.h f19687u0 = ((androidx.fragment.app.h) Z(new u5.a(this, 4), new g.d()));

    /* renamed from: v0  reason: collision with root package name */
    public final ek.g f19688v0 = j7.a.b0(new a(this));

    /* renamed from: w0  reason: collision with root package name */
    public final ek.g f19689w0 = j7.a.b0(new g(this));

    /* renamed from: x0  reason: collision with root package name */
    public final ek.g f19690x0 = j7.a.b0(new c(this));

    /* renamed from: y0  reason: collision with root package name */
    public final ek.g f19691y0 = j7.a.b0(new b(this));

    /* compiled from: HomeFragment.kt */
    public static final class a extends sk.k implements rk.a<oh.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19692a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HomeFragment homeFragment) {
            super(0);
            this.f19692a = homeFragment;
        }

        public final Object invoke() {
            return new oh.a(this.f19692a.m0(), new c(this.f19692a));
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class b extends sk.k implements rk.a<oh.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19693a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(HomeFragment homeFragment) {
            super(0);
            this.f19693a = homeFragment;
        }

        public final Object invoke() {
            return new oh.i(this.f19693a.m0(), new d(this.f19693a));
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class c extends sk.k implements rk.a<oh.e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19694a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(HomeFragment homeFragment) {
            super(0);
            this.f19694a = homeFragment;
        }

        public final Object invoke() {
            return new oh.e(new e(this.f19694a));
        }
    }

    /* compiled from: SearchViewExtensions.kt */
    public static final class d extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19695a;

        /* compiled from: SearchViewExtensions.kt */
        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HomeFragment f19696a;

            public a(HomeFragment homeFragment) {
                this.f19696a = homeFragment;
            }

            public final void run() {
                String str;
                User e10 = this.f19696a.m0().e();
                if (e10 != null) {
                    ((g3) this.f19696a.i0()).v(new rh.f(this.f19696a.d0(), e10, this.f19696a.m0()));
                    Context d02 = this.f19696a.d0();
                    com.bumptech.glide.l f10 = com.bumptech.glide.b.c(d02).f(d02);
                    f10.getClass();
                    com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) new com.bumptech.glide.k(f10.f4948a, f10, Drawable.class, f10.f4949b).E("").y(new k5.g()).r()).l(C0531R$drawable.ic_user_default)).f(C0531R$drawable.ic_user_default);
                    kVar.getClass();
                    ((com.bumptech.glide.k) ((com.bumptech.glide.k) kVar.s(b5.k.f4026b, new b5.j())).u(new s4.f(new b5.j()), true)).B(((g3) this.f19696a.i0()).f21077y);
                }
                User e11 = this.f19696a.m0().e();
                if (e11 != null) {
                    str = e11.getId();
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f19696a.n0().i();
                    this.f19696a.n0().h();
                    HomeViewModel.f(this.f19696a.n0(), (String) null, 7);
                }
            }
        }

        public d(HomeFragment homeFragment) {
            this.f19695a = homeFragment;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new a(this.f19695a));
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class e extends sk.k implements rk.l<View, ek.i> {
        public e() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sk.j.f((View) obj, "it");
            return ek.i.f20112a;
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class f extends sk.k implements rk.a<ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19697a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(HomeFragment homeFragment) {
            super(0);
            this.f19697a = homeFragment;
        }

        public final Object invoke() {
            User e10 = this.f19697a.m0().e();
            boolean z10 = false;
            if (e10 != null) {
                Integer accountType = e10.getAccountType();
                int value = AccountType.PERSON.getValue();
                if (accountType != null && accountType.intValue() == value) {
                    z10 = true;
                }
            }
            if (z10) {
                this.f19697a.h0(new Intent(this.f19697a.d0(), PolicyAndTermActivity.class));
            } else {
                this.f19697a.h0(new Intent(this.f19697a.d0(), OrganizationProfileActivity.class));
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class g extends sk.k implements rk.a<tg.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeFragment f19698a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(HomeFragment homeFragment) {
            super(0);
            this.f19698a = homeFragment;
        }

        public final Object invoke() {
            return new tg.m(new f(this.f19698a));
        }
    }

    /* compiled from: HomeFragment.kt */
    public static final class h implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f19699a;

        public h(rk.l lVar) {
            this.f19699a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19699a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19699a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return sk.j.a(this.f19699a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19699a.hashCode();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class i extends sk.k implements rk.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f19700a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f19700a = fragment;
        }

        public final Object invoke() {
            return this.f19700a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class j extends sk.k implements rk.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.a f19701a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f19701a = iVar;
        }

        public final Object invoke() {
            return (x) this.f19701a.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class k extends sk.k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19702a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(ek.c cVar) {
            super(0);
            this.f19702a = cVar;
        }

        public final Object invoke() {
            return j0.a(this.f19702a).n();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class l extends sk.k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ek.c f19703a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(ek.c cVar) {
            super(0);
            this.f19703a = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            x a10 = j0.a(this.f19703a);
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
    public static final class m extends sk.k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f19704a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ek.c f19705b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment, ek.c cVar) {
            super(0);
            this.f19704a = fragment;
            this.f19705b = cVar;
        }

        public final Object invoke() {
            androidx.lifecycle.f fVar;
            f0.b f10;
            x a10 = j0.a(this.f19705b);
            if (a10 instanceof androidx.lifecycle.f) {
                fVar = (androidx.lifecycle.f) a10;
            } else {
                fVar = null;
            }
            if (fVar != null && (f10 = fVar.f()) != null) {
                return f10;
            }
            f0.b f11 = this.f19704a.f();
            sk.j.e(f11, "defaultViewModelProviderFactory");
            return f11;
        }
    }

    public HomeFragment() {
        i iVar = new i(this);
        ek.d[] dVarArr = ek.d.f20101a;
        ek.c a02 = j7.a.a0(new j(iVar));
        this.f19679m0 = j0.b(this, s.a(HomeViewModel.class), new k(a02), new l(a02), new m(this, a02));
    }

    public final void S() {
        this.J = true;
        Timer n10 = n0.l.n(df.b.f8966a);
        df.b.f8966a = n10;
        n10.schedule(new d(this), 200);
    }

    public final void W(View view, Bundle bundle) {
        sk.j.f(view, "view");
        Executor mainExecutor = k1.a.getMainExecutor(d0());
        sk.j.e(mainExecutor, "getMainExecutor(...)");
        q.l lVar = new q.l((Fragment) this, mainExecutor, (l.a) new n0(this));
        this.f19685s0 = lVar;
        lVar.b();
        l.d.a aVar = new l.d.a();
        aVar.f14221d = false;
        aVar.f14218a = w().getString(C0540R$string.biometric_title);
        aVar.f14219b = "";
        aVar.f14220c = w().getString(2132017215);
        aVar.f14222e = 255;
        this.f19686t0 = aVar.a();
        n0().f19713k.e(y(), new h(new c0(this)));
        n0().f19715m.e(y(), new h(new nh.d0(this)));
        ImageView imageView = ((g3) i0()).f21076x;
        sk.j.e(imageView, "btnNotify");
        this.f19683q0 = o0(imageView);
        ImageView imageView2 = ((g3) i0()).f21075w;
        sk.j.e(imageView2, "btnCart");
        this.f19684r0 = o0(imageView2);
        n0().f19717o.e(y(), new h(new e0(this)));
        n0().f19719q.e(y(), new h(new nh.f0(this)));
        n0().f19721s.e(y(), new h(new i0(this)));
        n0().f19725w.e(y(), new h(new nh.j0(this)));
        n0().E.e(y(), new h(new k0(this)));
        n0().C.e(y(), new h(new l0(this)));
        n0().G.e(y(), new h(new m0(this)));
        n0().H.setLimit(8);
        n0().I.setLimit(8);
        n0().e((String) null);
        HomeViewModel n02 = n0();
        al.d0 d02 = p3.l0.d0(n02);
        gl.b bVar = r0.f19085b;
        p3.l0.j0(d02, bVar, new w0(n02, (String) null, (ik.d<? super w0>) null), 2);
        HomeViewModel n03 = n0();
        p3.l0.j0(p3.l0.d0(n03), bVar, new z0(n03, (Integer) null, (ik.d<? super z0>) null), 2);
        ((g3) i0()).F.setOnClickListener(new a0(this, 0));
        ((g3) i0()).f21076x.setOnClickListener(new b0(this, 0));
        ((g3) i0()).G.setOnClickListener(new com.google.android.material.textfield.b(this, 20));
        ((g3) i0()).f21075w.setOnClickListener(new a0(this, 1));
        ((tg.m) this.f19689w0.getValue()).f22997r = new o0(this);
        ((tg.m) this.f19689w0.getValue()).f22998s = new p0(this);
        ((oh.i) this.f19691y0.getValue()).f21806q = new q0(this);
        ((oh.i) this.f19691y0.getValue()).f21807r = new nh.r0(this);
        ((g3) i0()).E.setOnClickListener(new b0(this, 1));
        ImageView imageView3 = ((g3) i0()).f21078z;
        sk.j.e(imageView3, "ivLogo");
        imageView3.setOnClickListener(new kf.b(500, imageView3, new e()));
        ((g3) i0()).H.setMovementMethod(LinkMovementMethod.getInstance());
        User e10 = m0().e();
        if (e10 != null) {
            ((g3) i0()).v(new rh.f(d0(), e10, m0()));
            Context d03 = d0();
            com.bumptech.glide.l f10 = com.bumptech.glide.b.c(d03).f(d03);
            f10.getClass();
            com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) new com.bumptech.glide.k(f10.f4948a, f10, Drawable.class, f10.f4949b).E("").y(new k5.g()).r()).l(C0531R$drawable.ic_user_default)).f(C0531R$drawable.ic_user_default);
            kVar.getClass();
            ((com.bumptech.glide.k) ((com.bumptech.glide.k) kVar.s(b5.k.f4026b, new b5.j())).u(new s4.f(new b5.j()), true)).B(((g3) i0()).f21077y);
        }
        ((g3) i0()).B.setAdapter((oh.a) this.f19688v0.getValue());
        RecyclerView recyclerView = ((g3) i0()).B;
        sk.j.e(recyclerView, "rcvAuctions");
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.c());
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        sk.j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((androidx.recyclerview.widget.w) itemAnimator).f3302g = false;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((oh.a) this.f19688v0.getValue());
        recyclerView.i(new kf.i(4, 10));
        RecyclerView recyclerView2 = ((g3) i0()).A;
        recyclerView2.setAdapter((tg.m) this.f19689w0.getValue());
        d0();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = ((g3) i0()).C;
        recyclerView3.setAdapter((oh.e) this.f19690x0.getValue());
        d0();
        recyclerView3.setLayoutManager(new LinearLayoutManager(0));
        recyclerView3.setHasFixedSize(true);
        RecyclerView recyclerView4 = ((g3) i0()).D;
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setAdapter((oh.i) this.f19691y0.getValue());
        d0();
        recyclerView4.setLayoutManager(new LinearLayoutManager(0));
        ((oh.a) this.f19688v0.getValue()).A(j7.a.g0(new Item((Action) null, Integer.valueOf(C0531R$drawable.ic_action_docs), (String) null, false, "Thông báo đấu giá", 13, (sk.e) null), new Item((Action) null, Integer.valueOf(C0531R$drawable.ic_action_list), (String) null, false, "Danh sách công bố", 13, (sk.e) null), new Item((Action) null, Integer.valueOf(C0531R$drawable.ic_action_result), (String) null, false, "Biển số sắp đấu giá", 13, (sk.e) null), new Item((Action) null, Integer.valueOf(C0531R$drawable.ic_actions_support), (String) null, false, "Hướng dẫn tham gia", 13, (sk.e) null)));
        if (App.f19364o.a().a()) {
            g.b.a(this, new fb.l(this, 5), 3000);
        }
    }

    public final int j0() {
        return C0535R$layout.fragment_home;
    }

    public final lg.b m0() {
        lg.b bVar = this.f19680n0;
        if (bVar != null) {
            return bVar;
        }
        sk.j.l("sharedPrefsHelper");
        throw null;
    }

    public final HomeViewModel n0() {
        return (HomeViewModel) this.f19679m0.getValue();
    }

    public final QBadgeView o0(ImageView imageView) {
        try {
            String valueOf = String.valueOf(0);
            QBadgeView qBadgeView = new QBadgeView(r());
            qBadgeView.a(imageView);
            qBadgeView.f(valueOf);
            qBadgeView.g();
            return qBadgeView;
        } catch (Exception unused) {
            return null;
        }
    }
}
