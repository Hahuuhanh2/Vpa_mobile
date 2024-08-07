package com.vpa.daugia.module.auction.ui.activity;

import al.r0;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.g;
import java.util.Calendar;
import java.util.WeakHashMap;
import kf.h;
import mg.n1;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sg.a0;
import sg.b0;
import sg.c0;
import sg.v;
import sg.x;
import sg.y;
import sg.z;
import sk.j;
import sk.k;
import sk.s;
import v.g0;
import w1.d0;
import w1.q0;
import xg.i;

/* compiled from: SessionAuctionActivity.kt */
public final class SessionAuctionActivity extends Hilt_SessionAuctionActivity<n1> {
    public static final /* synthetic */ int X = 0;
    public final d0 R = new d0(s.a(AuctionRoomViewModel.class), new e(this), new d(this), new f(this));
    public lg.b S;
    public vg.a T;
    public boolean U = true;
    public final g V = j7.a.b0(new a(this));
    public final g W = j7.a.b0(new b(this));

    /* compiled from: SessionAuctionActivity.kt */
    public static final class a extends k implements rk.a<tg.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionAuctionActivity f19418a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SessionAuctionActivity sessionAuctionActivity) {
            super(0);
            this.f19418a = sessionAuctionActivity;
        }

        public final Object invoke() {
            lg.b bVar = this.f19418a.S;
            if (bVar != null) {
                return new tg.a(bVar, d.f19427a);
            }
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    /* compiled from: SessionAuctionActivity.kt */
    public static final class b extends k implements rk.a<tg.s> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionAuctionActivity f19419a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SessionAuctionActivity sessionAuctionActivity) {
            super(0);
            this.f19419a = sessionAuctionActivity;
        }

        public final Object invoke() {
            SessionAuctionActivity sessionAuctionActivity = this.f19419a;
            lg.b bVar = sessionAuctionActivity.S;
            if (bVar != null) {
                return new tg.s(bVar, new e(sessionAuctionActivity));
            }
            j.l("sharedPrefsHelper");
            throw null;
        }
    }

    /* compiled from: SessionAuctionActivity.kt */
    public static final class c implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19420a;

        public c(l lVar) {
            this.f19420a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19420a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19420a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19420a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19420a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19421a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19421a = componentActivity;
        }

        public final Object invoke() {
            return this.f19421a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19422a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19422a = componentActivity;
        }

        public final Object invoke() {
            return this.f19422a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19423a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19423a = componentActivity;
        }

        public final Object invoke() {
            return this.f19423a.g();
        }
    }

    public static final void T(SessionAuctionActivity sessionAuctionActivity, long j10, long j11) {
        long j12;
        sessionAuctionActivity.getClass();
        int i10 = h.f12560a;
        PriceTable d10 = sessionAuctionActivity.U().f19443r.d();
        if (d10 != null) {
            ((n1) sessionAuctionActivity.M()).v(new ug.f(d10, (Long) null));
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (j11 >= timeInMillis) {
            if (j10 >= timeInMillis) {
                ((n1) sessionAuctionActivity.M()).G.setText("Bắt đầu sau");
                j12 = j10;
            } else {
                ((n1) sessionAuctionActivity.M()).G.setText("Thời gian còn lại");
                j12 = j11;
            }
            AuctionRoomViewModel U2 = sessionAuctionActivity.U();
            c0 c0Var = new c0(sessionAuctionActivity, j10, j11);
            i iVar = U2.f19450y;
            if (iVar != null) {
                iVar.cancel();
            }
            U2.f19451z.g(AuctionRoomViewModel.d(j12 - Calendar.getInstance().getTimeInMillis()).toString());
            i iVar2 = new i(U2, c0Var, j12 - Calendar.getInstance().getTimeInMillis());
            U2.f19450y = iVar2;
            iVar2.start();
            return;
        }
        ((n1) sessionAuctionActivity.M()).G.setText("Vui lòng đợi");
        ((n1) sessionAuctionActivity.M()).f21241w.setEnabled(false);
    }

    public final int N() {
        return C0535R$layout.activity_session_auction;
    }

    public final void Q(lf.f fVar) {
        String str;
        boolean z10;
        String str2;
        j.f(fVar, "it");
        if (fVar == lf.f.CONNECTED || fVar == lf.f.SLOW) {
            PriceTable d10 = U().f19443r.d();
            if (d10 != null) {
                str = d10.getChannel();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int i10 = h.f12560a;
                AuctionRoomViewModel U2 = U();
                PriceTable d11 = U().f19443r.d();
                if (d11 == null || (str2 = d11.getChannel()) == null) {
                    str2 = "";
                }
                U2.g(str2);
            }
        }
    }

    public final AuctionRoomViewModel U() {
        return (AuctionRoomViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        g0 g0Var = new g0(28);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, g0Var);
        getWindow().addFlags(128);
        ((n1) M()).w(U());
        U().f19439n.e(this, new c(new v(this)));
        U().f19443r.e(this, new c(new sg.w(this)));
        U().A.e(this, new c(new x(this)));
        U().B.e(this, new c(new y(this)));
        U().f19442q.e(this, new c(new z(this)));
        U().E.e(this, new c(new a0(this)));
        U().D.e(this, new c(new b0(this)));
        ((n1) M()).f21242x.setOnClickListener(new com.google.android.material.textfield.b(this, 11));
        ((n1) M()).H.setOnClickListener(new com.google.android.material.datepicker.q(this, 8));
        MaterialButton materialButton = ((n1) M()).f21241w;
        j.e(materialButton, "btnAuction");
        materialButton.setOnClickListener(new kf.b(500, materialButton, new sg.d0(this)));
        RecyclerView recyclerView = ((n1) M()).B;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter((tg.a) this.V.getValue());
        RecyclerView recyclerView2 = ((n1) M()).C;
        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
        recyclerView2.setAdapter((tg.s) this.W.getValue());
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("DATA_PRICE_TABLE")) {
            U().f19443r.k(new bc.h().d(PriceTable.class, extras.getString("DATA_PRICE_TABLE")));
            AuctionRoomViewModel.e(U());
        }
    }

    public final void onResume() {
        boolean z10;
        String str;
        super.onResume();
        int i10 = h.f12560a;
        AuctionRoomViewModel U2 = U();
        String str2 = null;
        l0.j0(l0.d0(U2), r0.f19085b, new xg.f(U2, (ik.d<? super xg.f>) null), 2);
        PriceTable d10 = U().f19443r.d();
        if (d10 != null) {
            str2 = d10.getChannel();
        }
        if (str2 == null || str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            AuctionRoomViewModel U3 = U();
            PriceTable d11 = U().f19443r.d();
            if (d11 == null || (str = d11.getChannel()) == null) {
                str = "";
            }
            U3.g(str);
        }
    }
}
