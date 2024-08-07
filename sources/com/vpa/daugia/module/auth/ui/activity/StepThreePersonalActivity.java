package com.vpa.daugia.module.auth.ui.activity;

import al.a0;
import al.g0;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.ots.base.ui.AddressEdittext;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kf.e;
import kf.g;
import mg.a4;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import yk.h;
import zg.b1;
import zg.c1;
import zg.d1;
import zg.e1;
import zg.f1;
import zg.g1;
import zg.h1;
import zg.i1;
import zg.j1;
import zg.k1;
import zg.l1;
import zg.m1;
import zg.n1;
import zg.o1;
import zg.p1;
import zg.x0;
import zg.y0;
import zg.z0;

/* compiled from: StepThreePersonalActivity.kt */
public final class StepThreePersonalActivity extends Hilt_StepThreePersonalActivity<a4> {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f19534a0 = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new c(this), new b(this), new d(this));
    public lg.b S;
    public final int T;
    public final int U;
    public String V;
    public Uri W;
    public String X;
    public f.d Y;
    public final f.d Z;

    /* compiled from: StepThreePersonalActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19535a;

        public a(l lVar) {
            this.f19535a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19535a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19535a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19535a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19535a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19536a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19536a = componentActivity;
        }

        public final Object invoke() {
            return this.f19536a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19537a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19537a = componentActivity;
        }

        public final Object invoke() {
            return this.f19537a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19538a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19538a = componentActivity;
        }

        public final Object invoke() {
            return this.f19538a.g();
        }
    }

    public StepThreePersonalActivity() {
        j.e(Pattern.compile("^(\\+?84|0)\\d{9,10}$"), "compile(pattern)");
        this.T = 2;
        this.U = 1;
        this.X = "FRONT";
        this.Y = (f.d) F(new u5.a(this, 2), new g.d());
        this.Z = (f.d) F(new ef.a(this, 2), new g.c());
    }

    public final int N() {
        return C0535R$layout.fragment_step_three_personal;
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
                        l0.j0(g0.W(this), (a0) null, new p1(j7.a.e(strArr), this, (ik.d<? super p1>) null), 3);
                        return;
                    }
                    View view = ((a4) M()).f8554e;
                    j.e(view, "getRoot(...)");
                    new of.a(view).a("Định dạng file không hợp lệ", of.b.ERROR);
                } catch (Exception e10) {
                    View view2 = ((a4) M()).f8554e;
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
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        ca.a aVar = new ca.a(this, 21);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, aVar);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((a4) M()).w(T());
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("DATA_USER")) == null)) {
            T().L.g(new bc.h().d(User.class, string));
        }
        T().f19562u.e(this, new a(new n1(this)));
        T().f19566y.e(this, new a(new o1(this)));
        ((a4) M()).J.requestFocus();
        ((a4) M()).G.requestFocus();
        ((a4) M()).I.requestFocus();
        ((a4) M()).H.requestFocus();
        ((a4) M()).E.requestFocus();
        ((a4) M()).U.requestFocus();
        ((a4) M()).f20949w.requestFocus();
        ((a4) M()).O.requestFocus();
        ((a4) M()).P.requestFocus();
        ((a4) M()).N.requestFocus();
        ((a4) M()).M.requestFocus();
        ((a4) M()).L.requestFocus();
        AddressEdittext addressEdittext = ((a4) M()).Y;
        androidx.fragment.app.w G = G();
        j.e(G, "getSupportFragmentManager(...)");
        addressEdittext.setFragmentManager(G);
        AddressEdittext addressEdittext2 = ((a4) M()).Y;
        j.e(addressEdittext2, "tvCity");
        e.c(addressEdittext2, new e1(this));
        ((a4) M()).Y.setOnItemSelected(new f1(this));
        AddressEdittext addressEdittext3 = ((a4) M()).f20944a0;
        androidx.fragment.app.w G2 = G();
        j.e(G2, "getSupportFragmentManager(...)");
        addressEdittext3.setFragmentManager(G2);
        AddressEdittext addressEdittext4 = ((a4) M()).f20944a0;
        j.e(addressEdittext4, "tvDistrict");
        e.c(addressEdittext4, new g1(this));
        ((a4) M()).f20944a0.setOnItemSelected(new h1(this));
        AddressEdittext addressEdittext5 = ((a4) M()).f20946c0;
        androidx.fragment.app.w G3 = G();
        j.e(G3, "getSupportFragmentManager(...)");
        addressEdittext5.setFragmentManager(G3);
        AddressEdittext addressEdittext6 = ((a4) M()).f20946c0;
        j.e(addressEdittext6, "tvWard");
        e.c(addressEdittext6, new i1(this));
        AddressEdittext addressEdittext7 = ((a4) M()).X;
        androidx.fragment.app.w G4 = G();
        j.e(G4, "getSupportFragmentManager(...)");
        addressEdittext7.setFragmentManager(G4);
        AddressEdittext addressEdittext8 = ((a4) M()).X;
        j.e(addressEdittext8, "tvBank");
        e.c(addressEdittext8, new j1(this));
        AddressEdittext addressEdittext9 = ((a4) M()).Z;
        androidx.fragment.app.w G5 = G();
        j.e(G5, "getSupportFragmentManager(...)");
        addressEdittext9.setFragmentManager(G5);
        AddressEdittext addressEdittext10 = ((a4) M()).Z;
        j.e(addressEdittext10, "tvDateOfIssue");
        e.c(addressEdittext10, new k1(this));
        sk.q qVar = new sk.q();
        TextView textView = ((a4) M()).C;
        j.e(textView, "btnInfo");
        e.c(textView, new l1(this, qVar));
        sk.q qVar2 = new sk.q();
        TextView textView2 = ((a4) M()).f20951y;
        j.e(textView2, "btnBank");
        e.c(textView2, new m1(this, qVar2));
        sk.q qVar3 = new sk.q();
        TextView textView3 = ((a4) M()).B;
        j.e(textView3, "btnId");
        e.c(textView3, new b1(this, qVar3));
        ((a4) M()).E.setOnClickListener(new x0(this, 0));
        ((a4) M()).f20952z.setOnClickListener(new y0(this, 0));
        ((a4) M()).f20945b0.setOnLongClickListener(new z0(this));
        ((a4) M()).A.setOnClickListener(new x0(this, 1));
        ((a4) M()).f20950x.setOnClickListener(new y0(this, 1));
        LinearLayout linearLayout = ((a4) M()).U;
        j.e(linearLayout, "lnFontFace");
        e.c(linearLayout, new c1(this));
        LinearLayout linearLayout2 = ((a4) M()).f20949w;
        j.e(linearLayout2, "backSide");
        e.c(linearLayout2, new d1(this));
        ((a4) M()).D.setOnClickListener(new com.google.android.material.datepicker.q(this, 15));
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
                View view = ((a4) M()).f8554e;
                j.e(view, "getRoot(...)");
                new of.a(view).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
            } else if (iArr[0] == 0) {
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.GET_CONTENT");
                intent2.setType("*/*");
                startActivityForResult(intent2, this.T);
            } else {
                View view2 = ((a4) M()).f8554e;
                j.e(view2, "getRoot(...)");
                new of.a(view2).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
            }
        }
    }
}
