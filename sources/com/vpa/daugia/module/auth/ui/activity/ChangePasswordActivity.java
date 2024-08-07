package com.vpa.daugia.module.auth.ui.activity;

import al.r0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import c0.i0;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.R;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import mg.r;
import n0.l;
import p3.l0;
import r2.q;
import r2.w;
import sk.s;
import w1.d0;
import w1.q0;

/* compiled from: ChangePasswordActivity.kt */
public final class ChangePasswordActivity extends Hilt_ChangePasswordActivity<r> {
    public static final /* synthetic */ int Y = 0;
    public final d0 R;
    public Animator S;
    public String T = "Nhập lại mật khẩu cũ";
    public String U = "Mật khẩu mới";
    public String V = "Nhập lại mật khẩu mới";
    public String W = "ACTION_EMAIL";
    public String X = "CHANGE_PASSWORD";

    /* compiled from: EditTextExtensions.kt */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangePasswordActivity f19469a;

        /* renamed from: com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0264a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19470a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f19471b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity$a$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0265a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19472a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ChangePasswordActivity f19473b;

                public C0265a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                    this.f19472a = editable;
                    this.f19473b = changePasswordActivity;
                }

                public final void run() {
                    String str;
                    boolean z10;
                    Editable editable = this.f19472a;
                    if (editable == null || (str = editable.toString()) == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        AppTextView appTextView = ((r) this.f19473b.M()).H;
                        sk.j.e(appTextView, "tvErrorConfirmPassword");
                        appTextView.setVisibility(8);
                    }
                    ((r) this.f19473b.M()).f21321x.setEnabled(this.f19473b.T(false));
                }
            }

            public C0264a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                this.f19470a = editable;
                this.f19471b = changePasswordActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0265a(this.f19470a, this.f19471b));
            }
        }

        public a(ChangePasswordActivity changePasswordActivity) {
            this.f19469a = changePasswordActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new C0264a(editable, this.f19469a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: EditTextExtensions.kt */
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangePasswordActivity f19474a;

        /* compiled from: EditTextExtensions.kt */
        public static final class a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19475a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f19476b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity$b$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0266a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19477a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ChangePasswordActivity f19478b;

                public C0266a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                    this.f19477a = editable;
                    this.f19478b = changePasswordActivity;
                }

                public final void run() {
                    String str;
                    boolean z10;
                    String str2;
                    Editable editable = this.f19477a;
                    String str3 = "";
                    if (editable == null || (str = editable.toString()) == null) {
                        str = str3;
                    }
                    if (str.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Editable text = ((r) this.f19478b.M()).A.getText();
                        if (text == null) {
                            str2 = str3;
                        } else {
                            str2 = android.support.v4.media.a.j(text);
                        }
                        int i10 = 8;
                        if (!sk.j.a(str, str2)) {
                            ((r) this.f19478b.M()).H.setText("Mật khẩu không đúng");
                            AppTextView appTextView = ((r) this.f19478b.M()).H;
                            sk.j.e(appTextView, "tvErrorConfirmPassword");
                            appTextView.setVisibility(0);
                        } else {
                            AppTextView appTextView2 = ((r) this.f19478b.M()).H;
                            sk.j.e(appTextView2, "tvErrorConfirmPassword");
                            appTextView2.setVisibility(8);
                        }
                        AppTextView appTextView3 = ((r) this.f19478b.M()).H;
                        sk.j.e(appTextView3, "tvErrorConfirmPassword");
                        Editable text2 = ((r) this.f19478b.M()).A.getText();
                        if (text2 != null) {
                            str3 = android.support.v4.media.a.j(text2);
                        }
                        if (!sk.j.a(str, str3)) {
                            i10 = 0;
                        }
                        appTextView3.setVisibility(i10);
                    } else if (((r) this.f19478b.M()).f21322y.hasFocus()) {
                        ((r) this.f19478b.M()).H.setText("Vui lòng nhập mật khẩu");
                        AppTextView appTextView4 = ((r) this.f19478b.M()).H;
                        sk.j.e(appTextView4, "tvErrorConfirmPassword");
                        appTextView4.setVisibility(0);
                    }
                    ((r) this.f19478b.M()).f21321x.setEnabled(this.f19478b.T(false));
                }
            }

            public a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                this.f19475a = editable;
                this.f19476b = changePasswordActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0266a(this.f19475a, this.f19476b));
            }
        }

        public b(ChangePasswordActivity changePasswordActivity) {
            this.f19474a = changePasswordActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new a(editable, this.f19474a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: EditTextExtensions.kt */
    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangePasswordActivity f19479a;

        /* compiled from: EditTextExtensions.kt */
        public static final class a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19480a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ChangePasswordActivity f19481b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity$c$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0267a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19482a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ChangePasswordActivity f19483b;

                public C0267a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                    this.f19482a = editable;
                    this.f19483b = changePasswordActivity;
                }

                public final void run() {
                    String str;
                    boolean z10;
                    Editable editable = this.f19482a;
                    if (editable == null || (str = editable.toString()) == null) {
                        str = "";
                    }
                    ChangePasswordActivity changePasswordActivity = this.f19483b;
                    String obj = yk.l.k1(str).toString();
                    int i10 = ChangePasswordActivity.Y;
                    changePasswordActivity.X(obj);
                    if (kf.e.a(((r) this.f19483b.M()).f21322y.getText()).length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (((r) this.f19483b.M()).f21322y.hasFocus()) {
                            ((r) this.f19483b.M()).H.setText("Vui lòng nhập mật khẩu");
                        }
                        AppTextView appTextView = ((r) this.f19483b.M()).H;
                        sk.j.e(appTextView, "tvErrorConfirmPassword");
                        appTextView.setVisibility(8);
                    } else if (sk.j.a(str, kf.e.a(((r) this.f19483b.M()).f21322y.getText())) || ((r) this.f19483b.M()).f21322y.getText() == null) {
                        AppTextView appTextView2 = ((r) this.f19483b.M()).H;
                        sk.j.e(appTextView2, "tvErrorConfirmPassword");
                        appTextView2.setVisibility(8);
                    } else {
                        ((r) this.f19483b.M()).H.setText("Mật khẩu không đúng");
                        AppTextView appTextView3 = ((r) this.f19483b.M()).H;
                        sk.j.e(appTextView3, "tvErrorConfirmPassword");
                        appTextView3.setVisibility(0);
                    }
                    ((r) this.f19483b.M()).f21321x.setEnabled(this.f19483b.T(false));
                    if (!((r) this.f19483b.M()).f21322y.hasFocus()) {
                        AppTextView appTextView4 = ((r) this.f19483b.M()).H;
                        sk.j.e(appTextView4, "tvErrorConfirmPassword");
                        appTextView4.setVisibility(8);
                    }
                }
            }

            public a(Editable editable, ChangePasswordActivity changePasswordActivity) {
                this.f19480a = editable;
                this.f19481b = changePasswordActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0267a(this.f19480a, this.f19481b));
            }
        }

        public c(ChangePasswordActivity changePasswordActivity) {
            this.f19479a = changePasswordActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new a(editable, this.f19479a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ChangePasswordActivity.kt */
    public static final class d extends sk.k implements rk.l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangePasswordActivity f19484a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ChangePasswordActivity changePasswordActivity) {
            super(1);
            this.f19484a = changePasswordActivity;
        }

        public final Object invoke(Object obj) {
            sk.j.f((View) obj, "it");
            ChangePasswordActivity changePasswordActivity = this.f19484a;
            int i10 = ChangePasswordActivity.Y;
            if (changePasswordActivity.T(true)) {
                if (sk.j.a(this.f19484a.X, "CHANGE_PASSWORD")) {
                    LoginViewModel W = this.f19484a.W();
                    l0.j0(l0.d0(W), r0.f19085b, new bh.a(W, (ik.d<? super bh.a>) null), 2);
                } else if (sk.j.a(this.f19484a.W, "ACTION_EMAIL")) {
                    LoginViewModel W2 = this.f19484a.W();
                    l0.j0(l0.d0(W2), r0.f19085b, new bh.j(W2, (ik.d<? super bh.j>) null), 2);
                } else {
                    LoginViewModel W3 = this.f19484a.W();
                    l0.j0(l0.d0(W3), r0.f19085b, new bh.k(W3, (ik.d<? super bh.k>) null), 2);
                }
            }
            return ek.i.f20112a;
        }
    }

    /* compiled from: ChangePasswordActivity.kt */
    public static final class e implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f19485a;

        public e(zg.e eVar) {
            this.f19485a = eVar;
        }

        public final ek.a<?> a() {
            return this.f19485a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19485a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return sk.j.a(this.f19485a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19485a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends sk.k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19486a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19486a = componentActivity;
        }

        public final Object invoke() {
            return this.f19486a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class g extends sk.k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19487a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f19487a = componentActivity;
        }

        public final Object invoke() {
            return this.f19487a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class h extends sk.k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19488a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f19488a = componentActivity;
        }

        public final Object invoke() {
            return this.f19488a.g();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class i extends sk.k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19489a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f19489a = componentActivity;
        }

        public final Object invoke() {
            return this.f19489a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class j extends sk.k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19490a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f19490a = componentActivity;
        }

        public final Object invoke() {
            return this.f19490a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class k extends sk.k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19491a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f19491a = componentActivity;
        }

        public final Object invoke() {
            return this.f19491a.g();
        }
    }

    public ChangePasswordActivity() {
        Class<LoginViewModel> cls = LoginViewModel.class;
        this.R = new d0(s.a(cls), new g(this), new f(this), new h(this));
        new i(this);
        s.a(cls);
        new j(this);
        new k(this);
    }

    public static void V(AppTextView appTextView, PasswordEditText passwordEditText, String str) {
        Spanned spanned;
        appTextView.setVisibility(8);
        String str2 = "<strong>" + str + "</strong> <font color = '#FC0808'>*</font>";
        sk.j.f(str2, "string");
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(str2, 0);
            sk.j.c(spanned);
        } else {
            spanned = Html.fromHtml(str2);
            sk.j.c(spanned);
        }
        passwordEditText.setHint(spanned);
    }

    public final int N() {
        return C0535R$layout.activity_change_password;
    }

    public final boolean T(boolean z10) {
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        if (sk.j.a(this.X, "CHANGE_PASSWORD")) {
            Editable text = ((r) M()).f21323z.getText();
            if (text == null) {
                str = "";
            } else {
                str = android.support.v4.media.a.j(text);
            }
            if (str.length() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (z10) {
                    View view = ((r) M()).f8554e;
                    sk.j.e(view, "getRoot(...)");
                    new of.a(view).a("Vui lòng nhập mật khẩu cũ ", of.b.ERROR);
                    ((r) M()).f21323z.requestFocus();
                }
                return false;
            }
        }
        if (kf.e.a(((r) M()).A.getText()).length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                View view2 = ((r) M()).f8554e;
                sk.j.e(view2, "getRoot(...)");
                new of.a(view2).a("Vui lòng nhập mật khẩu mới", of.b.ERROR);
                ((r) M()).A.requestFocus();
            }
            return false;
        }
        if (kf.e.a(((r) M()).f21322y.getText()).length() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z10) {
                View view3 = ((r) M()).f8554e;
                sk.j.e(view3, "getRoot(...)");
                new of.a(view3).a("Vui lòng nhập xác nhận mật khẩu ", of.b.ERROR);
                ((r) M()).f21322y.requestFocus();
            }
            return false;
        } else if (!X(kf.e.a(((r) M()).A.getText())) || !sk.j.a(kf.e.a(((r) M()).f21322y.getText()), kf.e.a(((r) M()).A.getText()))) {
            return false;
        } else {
            return true;
        }
    }

    public final void U(AppTextView appTextView, PasswordEditText passwordEditText) {
        String str;
        boolean z10;
        Editable text = passwordEditText.getText();
        if (text == null) {
            str = "";
        } else {
            str = android.support.v4.media.a.j(text);
        }
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(this, R.animator.fade_in);
            sk.j.e(loadAnimator, "loadAnimator(...)");
            this.S = loadAnimator;
            loadAnimator.setTarget(appTextView);
            Animator animator = this.S;
            if (animator != null) {
                animator.start();
            } else {
                sk.j.l("fadeInAnimation");
                throw null;
            }
        }
        passwordEditText.setHint("");
        appTextView.setVisibility(0);
    }

    public final LoginViewModel W() {
        return (LoginViewModel) this.R.getValue();
    }

    public final boolean X(String str) {
        boolean z10;
        Pattern compile = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9])");
        sk.j.e(compile, "compile(pattern)");
        AppTextView appTextView = ((r) M()).I;
        sk.j.e(appTextView, "tvErrorPassword");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            appTextView.setText("Vui lòng nhập mật khẩu");
            appTextView.setVisibility(0);
            return false;
        }
        appTextView.setVisibility(8);
        sk.j.f(str, "input");
        if (!compile.matcher(str).find()) {
            appTextView.setText("Mật khẩu phải có độ dài từ 8 đến 50 ký tự và chứa ký tự hoa, chữ thường, ký tự số, ký tự đặc biệt");
            appTextView.setVisibility(0);
            return false;
        }
        appTextView.setVisibility(8);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int i10;
        Spanned spanned;
        User user;
        User user2;
        User user3;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        sk.j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((r) M()).f21320w.setOnClickListener(new com.google.android.material.search.h(this, 11));
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        i0 i0Var = new i0(27);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, i0Var);
        ((r) M()).f21323z.setOnFocusChangeListener(new com.google.android.material.datepicker.e(this, 3));
        int i11 = 0;
        ((r) M()).A.setOnFocusChangeListener(new zg.b(this, 0));
        ((r) M()).f21322y.setOnFocusChangeListener(new zg.c(this));
        W().C.e(this, new e(new zg.e(this)));
        ((r) M()).v(W());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("KEY_FLOW");
            if (string != null) {
                this.X = string;
            }
            String string2 = extras.getString("PHONE");
            if (!(string2 == null || (user3 = (User) W().L.f8545b) == null)) {
                user3.setPhone(string2);
            }
            String string3 = extras.getString("EMAIL");
            if (!(string3 == null || (user2 = (User) W().L.f8545b) == null)) {
                user2.setEmail(string3);
            }
            String string4 = extras.getString("OTP");
            if (!(string4 == null || (user = (User) W().L.f8545b) == null)) {
                user.setPhoneVerificationCode(string4);
            }
            String string5 = extras.getString("ACTION_FORGOT");
            if (string5 != null) {
                this.W = string5;
            }
            if (sk.j.a(this.X, "FORGOT")) {
                ((r) M()).L.setText("Quên mật khẩu");
                ((r) M()).f21321x.setText("Xác nhận");
                AppTextView appTextView = ((r) M()).J;
                sk.j.e(appTextView, "tvNote");
                appTextView.setVisibility(8);
                AppTextView appTextView2 = ((r) M()).K;
                if (Build.VERSION.SDK_INT >= 24) {
                    spanned = Html.fromHtml("<strong>Nhập mật khẩu mới</strong> <font color = '#FC0808'>*</font>", 0);
                    sk.j.c(spanned);
                } else {
                    spanned = Html.fromHtml("<strong>Nhập mật khẩu mới</strong> <font color = '#FC0808'>*</font>");
                    sk.j.c(spanned);
                }
                appTextView2.setText(spanned);
            } else {
                ((r) M()).L.setText("Đổi mật khẩu");
                ((r) M()).f21321x.setText("Đổi mật khẩu");
                AppTextView appTextView3 = ((r) M()).J;
                sk.j.e(appTextView3, "tvNote");
                appTextView3.setVisibility(0);
                AppTextView appTextView4 = ((r) M()).K;
                sk.j.e(appTextView4, "tvTile");
                appTextView4.setVisibility(8);
            }
            LinearLayout linearLayout = ((r) M()).F;
            sk.j.e(linearLayout, "oldPassContainer");
            if (sk.j.a(this.X, "CHANGE_PASSWORD")) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = ((r) M()).G;
            sk.j.e(linearLayout2, "step");
            if (!sk.j.a(this.X, "REGISTER")) {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
        }
        PasswordEditText passwordEditText = ((r) M()).f21323z;
        sk.j.e(passwordEditText, "edtOldPassword");
        passwordEditText.addTextChangedListener(new a(this));
        PasswordEditText passwordEditText2 = ((r) M()).f21322y;
        sk.j.e(passwordEditText2, "edtConfirmPassword");
        passwordEditText2.addTextChangedListener(new b(this));
        PasswordEditText passwordEditText3 = ((r) M()).A;
        sk.j.e(passwordEditText3, "edtPassword");
        passwordEditText3.addTextChangedListener(new c(this));
        MaterialButton materialButton = ((r) M()).f21321x;
        sk.j.e(materialButton, "button");
        materialButton.setOnClickListener(new kf.b(500, materialButton, new d(this)));
    }
}
