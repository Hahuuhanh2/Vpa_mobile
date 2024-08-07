package com.vpa.daugia.module.profile.ui.activity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.base.ui.AddressEdittext;
import com.ots.core.utils.customview.ImageRecyclerview;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import gi.a0;
import gi.c0;
import gi.e0;
import gi.g;
import gi.h;
import gi.i;
import gi.m;
import gi.n;
import gi.o;
import gi.p;
import gi.r;
import gi.t;
import gi.u;
import gi.v;
import gi.x;
import gi.y;
import gi.z;
import kf.e;
import mg.m0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import zg.h0;

/* compiled from: OrganizationProfileActivity.kt */
public final class OrganizationProfileActivity extends Hilt_OrganizationProfileActivity<m0> {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f19804d0 = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new c(this), new b(this), new d(this));
    public lg.b S;
    public boolean T;
    public String U;
    public String V = "";
    public Uri W;
    public f.d X = ((f.d) F(new h0(this, 1), new g.d()));
    public String Y = "FRONT";
    public String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public String f19805a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    public String f19806b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    public final f.d f19807c0 = ((f.d) F(new u5.a(this, 5), new g.c()));

    /* compiled from: OrganizationProfileActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19808a;

        public a(l lVar) {
            this.f19808a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19808a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19808a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19808a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19808a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19809a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19809a = componentActivity;
        }

        public final Object invoke() {
            return this.f19809a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19810a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19810a = componentActivity;
        }

        public final Object invoke() {
            return this.f19810a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19811a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19811a = componentActivity;
        }

        public final Object invoke() {
            return this.f19811a.g();
        }
    }

    public static final void T(OrganizationProfileActivity organizationProfileActivity) {
        String str;
        CharSequence text = ((m0) organizationProfileActivity.M()).G.getText();
        if (text == null) {
            str = "";
        } else {
            str = yk.l.k1(text.toString()).toString();
        }
        if (j.a(str, "Tỉnh/ thành phố *")) {
            View view = ((m0) organizationProfileActivity.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a("Vui lòng chọn Tỉnh/Thành phố", of.b.ERROR);
            ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21203u0.getY());
            return;
        }
        ((m0) organizationProfileActivity.M()).f21206w0.b();
    }

    public static final void U(OrganizationProfileActivity organizationProfileActivity) {
        String str;
        CharSequence text = ((m0) organizationProfileActivity.M()).J.getText();
        if (text == null) {
            str = "";
        } else {
            str = yk.l.k1(text.toString()).toString();
        }
        if (j.a(str, "Quận/ huyện *")) {
            View view = ((m0) organizationProfileActivity.M()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a("Vui lòng chọn Quận/Huyện", of.b.ERROR);
            ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21206w0.getY());
            return;
        }
        ((m0) organizationProfileActivity.M()).f21208x0.b();
    }

    public final int N() {
        return C0535R$layout.activity_organization_profile;
    }

    public final LoginViewModel V() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((m0) M()).v(V());
        V().f19562u.e(this, new a(new c0(this)));
        V().f19566y.e(this, new a(new gi.d0(this)));
        V().N.e(this, new a(new e0(this)));
        AddressEdittext addressEdittext = ((m0) M()).f21203u0;
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        addressEdittext.setFragmentManager(G);
        AddressEdittext addressEdittext2 = ((m0) M()).f21203u0;
        j.e(addressEdittext2, "tvCity");
        e.c(addressEdittext2, new o(this));
        ((m0) M()).f21203u0.setOnRightDrawableClicked(new t(this));
        ((m0) M()).f21203u0.setOnItemSelected(new u(this));
        AddressEdittext addressEdittext3 = ((m0) M()).f21206w0;
        androidx.fragment.app.w G2 = G();
        j.e(G2, "getSupportFragmentManager(...)");
        addressEdittext3.setFragmentManager(G2);
        AddressEdittext addressEdittext4 = ((m0) M()).f21206w0;
        j.e(addressEdittext4, "tvDistrict");
        e.c(addressEdittext4, new v(this));
        ((m0) M()).f21206w0.setOnRightDrawableClicked(new gi.w(this));
        ((m0) M()).f21206w0.setOnItemSelected(new x(this));
        AddressEdittext addressEdittext5 = ((m0) M()).f21208x0;
        androidx.fragment.app.w G3 = G();
        j.e(G3, "getSupportFragmentManager(...)");
        addressEdittext5.setFragmentManager(G3);
        AddressEdittext addressEdittext6 = ((m0) M()).f21208x0;
        j.e(addressEdittext6, "tvWard");
        e.c(addressEdittext6, new y(this));
        ((m0) M()).f21208x0.setOnRightDrawableClicked(new z(this));
        AddressEdittext addressEdittext7 = ((m0) M()).f21202t0;
        androidx.fragment.app.w G4 = G();
        j.e(G4, "getSupportFragmentManager(...)");
        addressEdittext7.setFragmentManager(G4);
        AddressEdittext addressEdittext8 = ((m0) M()).f21202t0;
        j.e(addressEdittext8, "tvBank");
        e.c(addressEdittext8, new a0(this));
        ((m0) M()).f21202t0.setOnRightDrawableClicked(new h(this));
        AddressEdittext addressEdittext9 = ((m0) M()).f21204v0;
        androidx.fragment.app.w G5 = G();
        j.e(G5, "getSupportFragmentManager(...)");
        addressEdittext9.setFragmentManager(G5);
        AddressEdittext addressEdittext10 = ((m0) M()).f21204v0;
        j.e(addressEdittext10, "tvDateOfIssue");
        e.c(addressEdittext10, new i(this));
        ((m0) M()).B.setOnClickListener(new g(this, 0));
        ((m0) M()).f21209y.setOnClickListener(new zh.d(this, 5));
        sk.q qVar = new sk.q();
        AppTextView appTextView = ((m0) M()).E;
        j.e(appTextView, "btnInfoBasic");
        e.c(appTextView, new gi.j(this, qVar));
        sk.q qVar2 = new sk.q();
        AppTextView appTextView2 = ((m0) M()).D;
        j.e(appTextView2, "btnInfo");
        e.c(appTextView2, new gi.k(this, qVar2));
        sk.q qVar3 = new sk.q();
        AppTextView appTextView3 = ((m0) M()).f21211z;
        j.e(appTextView3, "btnBank");
        e.c(appTextView3, new gi.l(this, qVar3));
        sk.q qVar4 = new sk.q();
        AppTextView appTextView4 = ((m0) M()).C;
        j.e(appTextView4, "btnId");
        e.c(appTextView4, new m(this, qVar4));
        sk.q qVar5 = new sk.q();
        AppTextView appTextView5 = ((m0) M()).A;
        j.e(appTextView5, "btnContact");
        e.c(appTextView5, new n(this, qVar5));
        ((m0) M()).F.setOnClickListener(new ei.a(this, 1));
        ((ImageButton) ((m0) M()).f21201s0.f10528b).setOnClickListener(new g(this, 1));
        ImageView imageView = ((m0) M()).f21191i0;
        j.e(imageView, "ivFront");
        e.c(imageView, new p(this));
        ImageView imageView2 = ((m0) M()).f21190h0;
        j.e(imageView2, "ivBack");
        e.c(imageView2, new gi.q(this));
        ((m0) M()).V.setRequestCamera(new r(this));
        ((m0) M()).V.setCheckPermission(gi.s.f20410a);
        ((AppTextView) ((m0) M()).f21201s0.f10530d).setText("Thông tin tải khoản");
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.getString("ON_CREATE_PROFILE") == null)) {
            this.T = true;
            ((m0) M()).f21200r0.setVisibility(0);
            ((AppTextView) ((m0) M()).f21201s0.f10530d).setText("Hoàn thiện hồ sơ");
        }
        V().h((Auth) null);
        ImageRecyclerview imageRecyclerview = ((m0) M()).V;
        lg.b bVar = this.S;
        if (bVar != null) {
            imageRecyclerview.setAccessToken(bVar.a());
        } else {
            j.l("sharedPrefsHelper");
            throw null;
        }
    }
}
