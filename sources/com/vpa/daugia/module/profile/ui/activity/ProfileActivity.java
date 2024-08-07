package com.vpa.daugia.module.profile.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.ots.base.ui.AddressEdittext;
import com.ots.core.R$drawable;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import gi.a1;
import gi.j0;
import gi.k0;
import gi.l0;
import gi.m0;
import gi.n0;
import gi.o0;
import gi.p0;
import gi.r0;
import gi.s0;
import gi.t0;
import gi.u0;
import gi.v0;
import gi.w0;
import gi.y0;
import java.util.WeakHashMap;
import kh.h;
import mg.x0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import zg.h0;

/* compiled from: ProfileActivity.kt */
public final class ProfileActivity extends Hilt_ProfileActivity<x0> {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f19812b0 = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new c(this), new b(this), new d(this));
    public String S;
    public Uri T;
    public boolean U;
    public boolean V;
    public String W = "FRONT";
    public String X = "";
    public String Y = "";
    public f.d Z = ((f.d) F(new ef.a(this, 3), new g.d()));

    /* renamed from: a0  reason: collision with root package name */
    public final f.d f19813a0 = ((f.d) F(new h0(this, 2), new g.c()));

    /* compiled from: ProfileActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19814a;

        public a(l lVar) {
            this.f19814a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19814a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19814a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19814a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19814a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19815a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19815a = componentActivity;
        }

        public final Object invoke() {
            return this.f19815a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19816a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19816a = componentActivity;
        }

        public final Object invoke() {
            return this.f19816a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19817a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19817a = componentActivity;
        }

        public final Object invoke() {
            return this.f19817a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_profile;
    }

    public final LoginViewModel T() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        h hVar = new h(4);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, hVar);
        ((x0) M()).w(T());
        T().f19562u.e(this, new a(new w0(this)));
        T().M.e(this, new a(new gi.x0(this)));
        T().f19566y.e(this, new a(new y0(this)));
        T().N.e(this, new a(new a1(this)));
        ((x0) M()).L.requestFocus();
        ((x0) M()).J.requestFocus();
        ((x0) M()).K.requestFocus();
        ((x0) M()).D.requestFocus();
        ((x0) M()).f21431c0.requestFocus();
        ((x0) M()).f21444w.requestFocus();
        ((x0) M()).V.requestFocus();
        ((x0) M()).X.requestFocus();
        ((x0) M()).U.requestFocus();
        ((x0) M()).T.requestFocus();
        AddressEdittext addressEdittext = ((x0) M()).H;
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        addressEdittext.setFragmentManager(G);
        ((x0) M()).H.setOnRightDrawableClicked(new n0(this));
        ((x0) M()).H.setOnItemSelected(new o0(this));
        AddressEdittext addressEdittext2 = ((x0) M()).I;
        androidx.fragment.app.w G2 = G();
        j.e(G2, "getSupportFragmentManager(...)");
        addressEdittext2.setFragmentManager(G2);
        ((x0) M()).I.setOnRightDrawableClicked(new p0(this));
        ((x0) M()).I.setOnItemSelected(new gi.q0(this));
        AddressEdittext addressEdittext3 = ((x0) M()).P;
        androidx.fragment.app.w G3 = G();
        j.e(G3, "getSupportFragmentManager(...)");
        addressEdittext3.setFragmentManager(G3);
        ((x0) M()).P.setOnRightDrawableClicked(new r0(this));
        ((x0) M()).P.setOnRightDrawableClicked(new s0(this));
        AddressEdittext addressEdittext4 = ((x0) M()).f21436h0;
        androidx.fragment.app.w G4 = G();
        j.e(G4, "getSupportFragmentManager(...)");
        addressEdittext4.setFragmentManager(G4);
        ((x0) M()).f21436h0.setOnRightDrawableClicked(new t0(this));
        AddressEdittext addressEdittext5 = ((x0) M()).f21439k0;
        androidx.fragment.app.w G5 = G();
        j.e(G5, "getSupportFragmentManager(...)");
        addressEdittext5.setFragmentManager(G5);
        ((x0) M()).f21439k0.setOnRightDrawableClicked(new u0(this));
        AddressEdittext addressEdittext6 = ((x0) M()).X;
        androidx.fragment.app.w G6 = G();
        j.e(G6, "getSupportFragmentManager(...)");
        addressEdittext6.setFragmentManager(G6);
        ((x0) M()).X.setOnRightDrawableClicked(new v0(this));
        ((x0) M()).C.setOnClickListener(new af.a(1, this, new sk.q()));
        ((x0) M()).f21447z.setOnClickListener(new af.d(3, this, new sk.q()));
        ((x0) M()).B.setOnClickListener(new tg.d(4, this, new sk.q()));
        ((x0) M()).D.setOnClickListener(new j0(this, 0));
        ((AppTextView) ((x0) M()).f21435g0.f10530d).setText("Thông tin tài khoản");
        ((ImageButton) ((x0) M()).f21435g0.f10528b).setOnClickListener(new k0(this, 0));
        yg.a aVar = ((x0) M()).f21443o0;
        if (aVar != null) {
            str = aVar.b();
        } else {
            str = null;
        }
        if (str == null) {
            ((x0) M()).Z.setImageResource(0);
        }
        yg.a aVar2 = ((x0) M()).f21443o0;
        if (aVar2 != null) {
            str2 = aVar2.a();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            ((x0) M()).Y.setImageResource(0);
        }
        ((x0) M()).A.setOnClickListener(new ei.a(this, 3));
        ((x0) M()).f21446y.setOnClickListener(new j0(this, 1));
        LinearLayout linearLayout = ((x0) M()).f21431c0;
        j.e(linearLayout, "lnFontFace");
        linearLayout.setOnClickListener(new kf.b(500, linearLayout, new l0(this)));
        LinearLayout linearLayout2 = ((x0) M()).f21444w;
        j.e(linearLayout2, "backSide");
        linearLayout2.setOnClickListener(new kf.b(500, linearLayout2, new m0(this)));
        ((ImageButton) ((x0) M()).f21435g0.f10529c).setOnClickListener(new k0(this, 1));
        Intent intent = getIntent();
        if (!(intent == null || (extras2 = intent.getExtras()) == null || extras2.getString("ON_CREATE_PROFILE") == null)) {
            this.U = true;
            ((x0) M()).f21434f0.setVisibility(0);
            ((AppTextView) ((x0) M()).f21435g0.f10530d).setText("Hoàn thiện hồ sơ");
        }
        if (!this.U) {
            ((ImageButton) ((x0) M()).f21435g0.f10529c).setImageResource(R$drawable.ic_camera);
        } else {
            ((ImageButton) ((x0) M()).f21435g0.f10529c).setImageResource(C0531R$drawable.button_close);
        }
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null)) {
            this.V = extras.getBoolean("ON_VERIFY_PROFILE");
        }
        T().h((Auth) null);
    }

    public final void onResume() {
        super.onResume();
    }
}
