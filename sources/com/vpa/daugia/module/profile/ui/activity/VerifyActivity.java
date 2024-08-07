package com.vpa.daugia.module.profile.ui.activity;

import al.a0;
import al.g0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.google.android.material.button.MaterialButton;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.profile.ui.ProfileViewModel;
import ek.i;
import gi.d1;
import gi.e1;
import java.util.WeakHashMap;
import kh.h;
import mg.y1;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;

/* compiled from: VerifyActivity.kt */
public final class VerifyActivity extends Hilt_VerifyActivity<y1> {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f19818a0 = 0;
    public final d0 R = new d0(s.a(ProfileViewModel.class), new f(this), new e(this), new g(this));
    public boolean S;
    public String T;
    public Uri U;
    public String V = "";
    public String W = "";
    public String X = "FRONT";
    public f.d Y = ((f.d) F(new u5.a(this, 6), new g.d()));
    public final f.d Z = ((f.d) F(new ef.a(this, 4), new g.c()));

    /* compiled from: VerifyActivity.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VerifyActivity f19819a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(VerifyActivity verifyActivity) {
            super(1);
            this.f19819a = verifyActivity;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            VerifyActivity verifyActivity = this.f19819a;
            verifyActivity.X = "FRONT";
            verifyActivity.Z.a("android.permission.CAMERA");
            return i.f20112a;
        }
    }

    /* compiled from: VerifyActivity.kt */
    public static final class b extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VerifyActivity f19820a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(VerifyActivity verifyActivity) {
            super(1);
            this.f19820a = verifyActivity;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            VerifyActivity verifyActivity = this.f19820a;
            verifyActivity.X = "BACK";
            verifyActivity.Z.a("android.permission.CAMERA");
            return i.f20112a;
        }
    }

    /* compiled from: VerifyActivity.kt */
    public static final class c extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VerifyActivity f19821a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(VerifyActivity verifyActivity) {
            super(1);
            this.f19821a = verifyActivity;
        }

        public final Object invoke(Object obj) {
            boolean z10;
            boolean z11;
            j.f((View) obj, "it");
            if (this.f19821a.V.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f19821a.W.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    VerifyActivity verifyActivity = this.f19821a;
                    l0.j0(g0.W(verifyActivity), (a0) null, new e1(j7.a.e(verifyActivity.V, verifyActivity.W), verifyActivity, (ik.d<? super e1>) null), 3);
                }
            }
            return i.f20112a;
        }
    }

    /* compiled from: VerifyActivity.kt */
    public static final class d implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19822a;

        public d(d1 d1Var) {
            this.f19822a = d1Var;
        }

        public final ek.a<?> a() {
            return this.f19822a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19822a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19822a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19822a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19823a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19823a = componentActivity;
        }

        public final Object invoke() {
            return this.f19823a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19824a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19824a = componentActivity;
        }

        public final Object invoke() {
            return this.f19824a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class g extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19825a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f19825a = componentActivity;
        }

        public final Object invoke() {
            return this.f19825a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_verify;
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        h hVar = new h(5);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, hVar);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.S = extras.getBoolean("ON_VERIFY_PROFILE");
        }
        ((ProfileViewModel) this.R.getValue()).f19803f.e(this, new d(new d1(this)));
        LinearLayout linearLayout = ((y1) M()).C;
        j.e(linearLayout, "lnFontFace");
        linearLayout.setOnClickListener(new kf.b(500, linearLayout, new a(this)));
        LinearLayout linearLayout2 = ((y1) M()).f21487w;
        j.e(linearLayout2, "backSide");
        linearLayout2.setOnClickListener(new kf.b(500, linearLayout2, new b(this)));
        MaterialButton materialButton = ((y1) M()).f21490z;
        j.e(materialButton, "button");
        materialButton.setOnClickListener(new kf.b(500, materialButton, new c(this)));
        ((y1) M()).f21488x.setOnClickListener(new ai.c(this, 4));
        ((y1) M()).f21489y.setOnClickListener(new zh.d(this, 7));
    }
}
