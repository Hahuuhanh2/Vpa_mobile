package com.vpa.daugia.ui;

import al.a0;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.viewpager2.widget.ViewPager2;
import c0.q0;
import com.google.android.recaptcha.RecaptchaClient;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.data.model.LastNotification;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import ef.m;
import ii.q;
import lf.g;
import lf.i;
import mg.g0;
import p3.l0;
import p7.a;
import r2.w;
import sk.j;
import sk.k;
import sk.s;
import wi.e;
import wi.h;

/* compiled from: MainActivity.kt */
public final class MainActivity extends Hilt_MainActivity<g0> implements a.C0179a, i {
    public static final /* synthetic */ int Z = 0;
    public int R;
    public boolean S;
    public final d0 T = new d0(s.a(AuctionRoomViewModel.class), new c(this), new b(this), new d(this));
    public RecaptchaClient U;
    public ph.b V;
    public lg.b W;
    public m X;
    public final MainActivity$mNotificationReceiver$1 Y = new MainActivity$mNotificationReceiver$1();

    /* compiled from: MainActivity.kt */
    public static final class a implements jf.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MainActivity f19911a;

        public a(MainActivity mainActivity) {
            this.f19911a = mainActivity;
        }

        public final void a(boolean z10) {
            if (z10) {
                this.f19911a.moveTaskToBack(false);
                this.f19911a.finishAffinity();
            }
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19912a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19912a = componentActivity;
        }

        public final Object invoke() {
            return this.f19912a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19913a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19913a = componentActivity;
        }

        public final Object invoke() {
            return this.f19913a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19914a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19914a = componentActivity;
        }

        public final Object invoke() {
            return this.f19914a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_main;
    }

    public final void P() {
        if (this.R != 0) {
            this.R = 0;
            return;
        }
        jf.b bVar = new jf.b(this, "Thông báo", "Bạn có chắc chắn muốn thoát ứng dụng!", "Không", "Thoát", true);
        bVar.f11889j = new a(this);
        bVar.h();
    }

    public final void R() {
        d.k.a(this);
    }

    public final boolean T() {
        this.R = 3;
        ((g0) M()).f21069x.setCurrentItem(this.R, false);
        ((g0) M()).f21068w.setSelectedItemId(C0533R$id.navigation_action);
        return true;
    }

    public final void a() {
        ((g0) M()).f21068w.setSelectedItemId(C0533R$id.navigation_action);
    }

    public final void c(int i10) {
        u6.a aVar = u6.a.f15288d;
        if (aVar.e(i10)) {
            wi.c cVar = new wi.c(this);
            AlertDialog d10 = aVar.d(this, i10, 1, cVar);
            if (d10 != null) {
                u6.a.g(this, d10, "GooglePlayServicesErrorDialog", cVar);
                return;
            }
            return;
        }
        jf.b bVar = new jf.b(this, "Cập nhật phiên bản mới", "Đã có phiên bản mới. Vui lòng cập nhật để tiếp tục sử dụng", "Để sau", "Cập nhật", false);
        bVar.f11889j = new al.g0();
        bVar.h();
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.S = true;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar J = J();
        if (J != null) {
            J.l(new ColorDrawable(k1.a.getColor(this, 2131100623)));
        }
        ((AuctionRoomViewModel) this.T.getValue()).f19433h.e(this, new h(new e(this)));
        lg.b bVar = this.W;
        if (bVar != null) {
            j7.a.u(bVar, this);
            try {
                getIntent().getStringExtra("click_action");
                int i10 = kf.h.f12560a;
                if (getIntent().getStringExtra("click_action") != null) {
                    g.b.a(this, new nh.g0(this, 2), 2000);
                } else {
                    lg.b bVar2 = this.W;
                    if (bVar2 != null) {
                        LastNotification lastNotification = (LastNotification) bVar2.b(LastNotification.class, "LAST_NOTIFICATION");
                        if (lastNotification != null) {
                            g.b.a(this, new oa.c(4, this, lastNotification), 2000);
                        }
                    } else {
                        j.l("sharedPrefsHelper");
                        throw null;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            p7.a.b(this, this);
            try {
                this.X = new m(this, j7.a.d0(new HomeFragment(), new q(), new ch.b(), new wg.b(), new MenuFragment()));
                ((g0) M()).f21068w.setItemIconTintList((ColorStateList) null);
                ViewPager2 viewPager2 = ((g0) M()).f21069x;
                m mVar = this.X;
                if (mVar != null) {
                    viewPager2.setAdapter(mVar);
                    ((g0) M()).f21069x.setOffscreenPageLimit(2);
                    ((g0) M()).f21069x.setUserInputEnabled(false);
                    ((g0) M()).f21068w.setOnItemSelectedListener(new q0(this, 20));
                    Toolbar toolbar = this.K;
                    if (toolbar != null) {
                        toolbar.setOnClickListener(new zh.d(this, 13));
                    }
                    App a10 = App.f19364o.a();
                    lg.b bVar3 = this.W;
                    if (bVar3 != null) {
                        String a11 = bVar3.a();
                        j.f(a11, "<set-?>");
                        a10.f19366d = a11;
                        l0.j0(al.g0.W(this), (a0) null, new wi.d(this, (ik.d<? super wi.d>) null), 3);
                        if (getIntent().hasExtra("SELECTION_VIEW") && j.a(getIntent().getStringExtra("SELECTION_VIEW"), "WAITING_ACTION_VIEW")) {
                            T();
                            return;
                        }
                        return;
                    }
                    j.l("sharedPrefsHelper");
                    throw null;
                }
                j.l("adapter");
                throw null;
            } catch (Exception e11) {
                kf.h.a(e11);
            }
        } else {
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    public final void onPostResume() {
        super.onPostResume();
        if (this.S) {
            p7.a.b(this, this);
        }
        this.S = false;
    }

    public final void onStart() {
        super.onStart();
        u2.a.a(this).b(this.Y, new IntentFilter("BROADCAST_MAIN"));
    }

    public final void s() {
    }
}
