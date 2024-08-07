package com.vpa.daugia.module.auth.ui.activity;

import al.r0;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import c0.i0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.search.h;
import com.ots.base.utils.customview.otp.helpers.OTPChildEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ek.i;
import java.util.WeakHashMap;
import mg.o0;
import p3.l0;
import r2.q;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import zg.v;
import zg.x;

/* compiled from: OtpActivity.kt */
public final class OtpActivity extends Hilt_OtpActivity<o0> {
    public static final /* synthetic */ int V = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new e(this), new d(this), new f(this));
    public String S = "REGISTER";
    public String T = "ACTION_EMAIL";
    public boolean U;

    /* compiled from: OtpActivity.kt */
    public static final class a implements cf.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OtpActivity f19511a;

        public a(OtpActivity otpActivity) {
            this.f19511a = otpActivity;
        }

        public final void a() {
        }

        public final void b(String str) {
            j.f(str, "otp");
            OtpActivity otpActivity = this.f19511a;
            int i10 = OtpActivity.V;
            User user = (User) otpActivity.T().L.f8545b;
            if (user != null) {
                user.setPhoneVerificationCode(str);
            }
            if (j.a(this.f19511a.T, "ACTION_EMAIL")) {
                LoginViewModel T = this.f19511a.T();
                l0.j0(l0.d0(T), r0.f19085b, new bh.b(T, (ik.d<? super bh.b>) null), 2);
            } else {
                LoginViewModel T2 = this.f19511a.T();
                l0.j0(l0.d0(T2), r0.f19085b, new bh.c(T2, (ik.d<? super bh.c>) null), 2);
            }
            View currentFocus = this.f19511a.getCurrentFocus();
            if (currentFocus != null) {
                Object systemService = this.f19511a.getSystemService("input_method");
                j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    /* compiled from: OtpActivity.kt */
    public static final class b extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OtpActivity f19512a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(OtpActivity otpActivity) {
            super(1);
            this.f19512a = otpActivity;
        }

        public final Object invoke(Object obj) {
            boolean z10;
            j.f((View) obj, "it");
            String otp = ((o0) this.f19512a.M()).B.getOtp();
            if (otp == null || otp.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                View view = ((o0) this.f19512a.M()).f8554e;
                j.e(view, "getRoot(...)");
                new of.a(view).a("Vui lòng nhập mã OTP", of.b.ERROR);
            } else if (j.a(this.f19512a.T, "ACTION_EMAIL")) {
                LoginViewModel T = this.f19512a.T();
                l0.j0(l0.d0(T), r0.f19085b, new bh.b(T, (ik.d<? super bh.b>) null), 2);
            } else {
                LoginViewModel T2 = this.f19512a.T();
                l0.j0(l0.d0(T2), r0.f19085b, new bh.c(T2, (ik.d<? super bh.c>) null), 2);
            }
            return i.f20112a;
        }
    }

    /* compiled from: OtpActivity.kt */
    public static final class c implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19513a;

        public c(l lVar) {
            this.f19513a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19513a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19513a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19513a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19513a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19514a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19514a = componentActivity;
        }

        public final Object invoke() {
            return this.f19514a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19515a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19515a = componentActivity;
        }

        public final Object invoke() {
            return this.f19515a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19516a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19516a = componentActivity;
        }

        public final Object invoke() {
            return this.f19516a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_otp;
    }

    public final void S() {
        OTPChildEditText otpEditText = ((o0) M()).B.getOtpEditText();
        if (otpEditText != null) {
            otpEditText.requestFocus();
        }
        ((o0) M()).B.setOtpListener(new a(this));
        MaterialButton materialButton = ((o0) M()).f21262w;
        j.e(materialButton, "button");
        materialButton.setOnClickListener(new kf.b(500, materialButton, new b(this)));
        ((o0) M()).E.setOnClickListener(new h(this, 13));
    }

    public final LoginViewModel T() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        boolean z10;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        i0 i0Var = new i0(28);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, i0Var);
        ((AppTextView) ((o0) M()).C.f10530d).setText("Quên mật khẩu");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("KEY_FLOW");
            String str2 = "";
            if (string == null) {
                string = str2;
            }
            this.S = string;
            User user = (User) T().L.f8545b;
            if (user != null) {
                String string2 = extras.getString("PHONE");
                if (string2 == null) {
                    string2 = str2;
                }
                user.setPhone(string2);
            }
            if (user != null) {
                String string3 = extras.getString("EMAIL");
                if (string3 == null) {
                    string3 = str2;
                }
                user.setEmail(string3);
            }
            User user2 = (User) T().L.f8545b;
            if (user2 != null) {
                str = user2.getPhone();
            } else {
                str = null;
            }
            int i10 = 0;
            if (str == null || str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ((o0) M()).D.setText("Vui lòng nhập mã OTP được gửi về số \nđiện thoại của bạn.");
            } else {
                ((o0) M()).D.setText("Vui lòng nhập mã OTP được gửi về số \nemail của bạn.");
            }
            String string4 = extras.getString("ACTION_FORGOT");
            if (string4 != null) {
                str2 = string4;
            }
            this.T = str2;
            LinearLayout linearLayout = ((o0) M()).f21265z;
            j.e(linearLayout, "lnStep");
            if (!j.a(this.S, "REGISTER")) {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
        }
        T().A.e(this, new c(new v(this)));
        T().f19564w.e(this, new c(new zg.w(this)));
        new x(this).start();
        ((ImageButton) ((o0) M()).C.f10528b).setOnClickListener(new com.google.android.material.datepicker.q(this, 11));
    }
}
