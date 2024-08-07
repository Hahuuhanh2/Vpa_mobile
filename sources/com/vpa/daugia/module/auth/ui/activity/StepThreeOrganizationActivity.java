package com.vpa.daugia.module.auth.ui.activity;

import al.a0;
import al.g0;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.ots.base.ui.AddressEdittext;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ek.i;
import kf.g;
import mg.y3;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import yk.h;
import zg.h0;
import zg.i0;
import zg.j0;
import zg.k0;
import zg.m0;
import zg.n0;
import zg.o0;
import zg.p0;
import zg.q0;
import zg.r0;
import zg.s0;
import zg.t0;
import zg.u0;
import zg.v0;

/* compiled from: StepThreeOrganizationActivity.kt */
public final class StepThreeOrganizationActivity extends Hilt_StepThreeOrganizationActivity<y3> {
    public static final /* synthetic */ int Z = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new d(this), new c(this), new e(this));
    public lg.b S;
    public final int T = 2;
    public final int U = 1;
    public String V;
    public Uri W;
    public f.d X = ((f.d) F(new ef.a(this, 1), new g.d()));
    public final f.d Y = ((f.d) F(new h0(this, 0), new g.c()));

    /* compiled from: StepThreeOrganizationActivity.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StepThreeOrganizationActivity f19529a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StepThreeOrganizationActivity stepThreeOrganizationActivity) {
            super(1);
            this.f19529a = stepThreeOrganizationActivity;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            jf.a aVar = new jf.a();
            StepThreeOrganizationActivity stepThreeOrganizationActivity = this.f19529a;
            aVar.f11887v0 = new a(stepThreeOrganizationActivity);
            aVar.n0(stepThreeOrganizationActivity.G(), "ModalBottomSheet");
            return i.f20112a;
        }
    }

    /* compiled from: StepThreeOrganizationActivity.kt */
    public static final class b implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19530a;

        public b(l lVar) {
            this.f19530a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19530a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19530a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19530a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19530a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19531a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19531a = componentActivity;
        }

        public final Object invoke() {
            return this.f19531a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19532a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19532a = componentActivity;
        }

        public final Object invoke() {
            return this.f19532a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19533a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19533a = componentActivity;
        }

        public final Object invoke() {
            return this.f19533a.g();
        }
    }

    public final int N() {
        return C0535R$layout.fragment_step_three;
    }

    public final LoginViewModel T() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        Uri uri;
        boolean z10;
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == this.T) {
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                try {
                    String type = getContentResolver().getType(uri);
                    if (type == null || !h.L0(type, "image/", false)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        String[] strArr = new String[1];
                        String c10 = g.c(this, uri);
                        if (c10 == null) {
                            c10 = "";
                        }
                        strArr[0] = c10;
                        l0.j0(g0.W(this), (a0) null, new v0(j7.a.e(strArr), this, (ik.d<? super v0>) null), 3);
                        return;
                    }
                    View view = ((y3) M()).f8554e;
                    j.e(view, "getRoot(...)");
                    new of.a(view).a("Định dạng file không hợp lệ", of.b.ERROR);
                } catch (Exception e10) {
                    View view2 = ((y3) M()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new of.a(view2).a("Định dạng file không hợp lệ", of.b.ERROR);
                    e10.printStackTrace();
                }
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String string;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((y3) M()).v(T());
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("DATA_ORG")) == null)) {
            int i10 = kf.h.f12560a;
            T().L.g(new bc.h().d(User.class, string));
        }
        ((y3) M()).X.setOnLongClickListener(new i0(this));
        T().f19562u.e(this, new b(new t0(this)));
        T().f19566y.e(this, new b(new u0(this)));
        ((y3) M()).J.requestFocus();
        ((y3) M()).O.requestFocus();
        ((y3) M()).M.requestFocus();
        ((y3) M()).L.requestFocus();
        ((y3) M()).I.requestFocus();
        ((y3) M()).K.requestFocus();
        ((y3) M()).N.requestFocus();
        AddressEdittext addressEdittext = ((y3) M()).U;
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        addressEdittext.setFragmentManager(G);
        AddressEdittext addressEdittext2 = ((y3) M()).U;
        j.e(addressEdittext2, "tvCity");
        kf.e.c(addressEdittext2, new k0(this));
        ((y3) M()).U.setOnItemSelected(new zg.l0(this));
        AddressEdittext addressEdittext3 = ((y3) M()).W;
        androidx.fragment.app.w G2 = G();
        j.e(G2, "getSupportFragmentManager(...)");
        addressEdittext3.setFragmentManager(G2);
        AddressEdittext addressEdittext4 = ((y3) M()).W;
        j.e(addressEdittext4, "tvDistrict");
        kf.e.c(addressEdittext4, new m0(this));
        ((y3) M()).W.setOnItemSelected(new n0(this));
        AddressEdittext addressEdittext5 = ((y3) M()).Y;
        androidx.fragment.app.w G3 = G();
        j.e(G3, "getSupportFragmentManager(...)");
        addressEdittext5.setFragmentManager(G3);
        AddressEdittext addressEdittext6 = ((y3) M()).Y;
        j.e(addressEdittext6, "tvWard");
        kf.e.c(addressEdittext6, new o0(this));
        AddressEdittext addressEdittext7 = ((y3) M()).T;
        androidx.fragment.app.w G4 = G();
        j.e(G4, "getSupportFragmentManager(...)");
        addressEdittext7.setFragmentManager(G4);
        AddressEdittext addressEdittext8 = ((y3) M()).T;
        j.e(addressEdittext8, "tvBank");
        kf.e.c(addressEdittext8, new p0(this));
        AddressEdittext addressEdittext9 = ((y3) M()).V;
        androidx.fragment.app.w G5 = G();
        j.e(G5, "getSupportFragmentManager(...)");
        addressEdittext9.setFragmentManager(G5);
        AddressEdittext addressEdittext10 = ((y3) M()).V;
        j.e(addressEdittext10, "tvDateOfIssue");
        kf.e.c(addressEdittext10, new q0(this));
        sk.q qVar = new sk.q();
        TextView textView = ((y3) M()).f21497z;
        j.e(textView, "btnInfo");
        kf.e.c(textView, new r0(this, qVar));
        sk.q qVar2 = new sk.q();
        TextView textView2 = ((y3) M()).f21494w;
        j.e(textView2, "btnBank");
        kf.e.c(textView2, new s0(this, qVar2));
        sk.q qVar3 = new sk.q();
        TextView textView3 = ((y3) M()).f21496y;
        j.e(textView3, "btnId");
        kf.e.c(textView3, new j0(this, qVar3, qVar2));
        ((y3) M()).A.setOnClickListener(new com.google.android.material.datepicker.q(this, 14));
        ((y3) M()).f21495x.setOnClickListener(new com.google.android.material.search.h(this, 17));
        ImageView imageView = ((y3) M()).P;
        j.e(imageView, "iv");
        kf.e.c(imageView, new a(this));
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        j.f(strArr, "permissions");
        j.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.U) {
            int i11 = kf.h.f12560a;
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                if (iArr[0] == 0 || iArr[1] == 0 || iArr[2] == 0) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                    startActivityForResult(intent, this.T);
                    return;
                }
                View view = ((y3) M()).f8554e;
                j.e(view, "getRoot(...)");
                new of.a(view).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
            } else if (iArr[0] == 0) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.GET_CONTENT");
                intent2.setType("*/*");
                startActivityForResult(intent2, this.T);
            } else {
                View view2 = ((y3) M()).f8554e;
                j.e(view2, "getRoot(...)");
                new of.a(view2).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
            }
        }
    }
}
