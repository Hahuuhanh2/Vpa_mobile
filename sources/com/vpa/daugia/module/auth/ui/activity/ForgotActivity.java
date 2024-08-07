package com.vpa.daugia.module.auth.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import mg.b0;
import n0.l;
import r2.q;
import r2.w;
import sk.j;
import sk.k;
import sk.s;
import v.g0;
import w1.d0;
import w1.q0;
import zg.h;

/* compiled from: ForgotActivity.kt */
public final class ForgotActivity extends Hilt_ForgotActivity<b0> {
    public static final /* synthetic */ int S = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new f(this), new e(this), new g(this));

    /* compiled from: EditTextExtensions.kt */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForgotActivity f19492a;

        /* renamed from: com.vpa.daugia.module.auth.ui.activity.ForgotActivity$a$a  reason: collision with other inner class name */
        /* compiled from: EditTextExtensions.kt */
        public static final class C0268a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19493a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ForgotActivity f19494b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ForgotActivity$a$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0269a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19495a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ForgotActivity f19496b;

                public C0269a(Editable editable, ForgotActivity forgotActivity) {
                    this.f19495a = editable;
                    this.f19496b = forgotActivity;
                }

                public final void run() {
                    Editable editable = this.f19495a;
                    if (editable != null) {
                        String obj = editable.toString();
                    }
                    ((b0) this.f19496b.M()).f20964w.setEnabled(this.f19496b.T());
                }
            }

            public C0268a(Editable editable, ForgotActivity forgotActivity) {
                this.f19493a = editable;
                this.f19494b = forgotActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0269a(this.f19493a, this.f19494b));
            }
        }

        public a(ForgotActivity forgotActivity) {
            this.f19492a = forgotActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new C0268a(editable, this.f19492a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: EditTextExtensions.kt */
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForgotActivity f19497a;

        /* compiled from: EditTextExtensions.kt */
        public static final class a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19498a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ForgotActivity f19499b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ForgotActivity$b$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0270a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19500a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ForgotActivity f19501b;

                public C0270a(Editable editable, ForgotActivity forgotActivity) {
                    this.f19500a = editable;
                    this.f19501b = forgotActivity;
                }

                public final void run() {
                    Editable editable = this.f19500a;
                    if (editable != null) {
                        String obj = editable.toString();
                    }
                    ((b0) this.f19501b.M()).f20964w.setEnabled(this.f19501b.T());
                }
            }

            public a(Editable editable, ForgotActivity forgotActivity) {
                this.f19498a = editable;
                this.f19499b = forgotActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0270a(this.f19498a, this.f19499b));
            }
        }

        public b(ForgotActivity forgotActivity) {
            this.f19497a = forgotActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new a(editable, this.f19497a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: EditTextExtensions.kt */
    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForgotActivity f19502a;

        /* compiled from: EditTextExtensions.kt */
        public static final class a extends TimerTask {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Editable f19503a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ForgotActivity f19504b;

            /* renamed from: com.vpa.daugia.module.auth.ui.activity.ForgotActivity$c$a$a  reason: collision with other inner class name */
            /* compiled from: EditTextExtensions.kt */
            public static final class C0271a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Editable f19505a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ ForgotActivity f19506b;

                public C0271a(Editable editable, ForgotActivity forgotActivity) {
                    this.f19505a = editable;
                    this.f19506b = forgotActivity;
                }

                public final void run() {
                    Editable editable = this.f19505a;
                    if (editable != null) {
                        String obj = editable.toString();
                    }
                    ((b0) this.f19506b.M()).f20964w.setEnabled(this.f19506b.T());
                }
            }

            public a(Editable editable, ForgotActivity forgotActivity) {
                this.f19503a = editable;
                this.f19504b = forgotActivity;
            }

            public final void run() {
                new Handler(Looper.getMainLooper()).post(new C0271a(this.f19503a, this.f19504b));
            }
        }

        public c(ForgotActivity forgotActivity) {
            this.f19502a = forgotActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Timer n10 = l.n(df.a.f8965a);
            df.a.f8965a = n10;
            n10.schedule(new a(editable, this.f19502a), 500);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* compiled from: ForgotActivity.kt */
    public static final class d implements q, sk.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rk.l f19507a;

        public d(h hVar) {
            this.f19507a = hVar;
        }

        public final ek.a<?> a() {
            return this.f19507a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19507a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(this.f19507a, ((sk.f) obj).a());
        }

        public final int hashCode() {
            return this.f19507a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19508a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19508a = componentActivity;
        }

        public final Object invoke() {
            return this.f19508a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19509a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19509a = componentActivity;
        }

        public final Object invoke() {
            return this.f19509a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class g extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19510a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f19510a = componentActivity;
        }

        public final Object invoke() {
            return this.f19510a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_forgot;
    }

    public final boolean T() {
        String str;
        boolean z10;
        boolean z11;
        String str2;
        boolean z12;
        boolean z13;
        String str3 = "";
        if (((b0) M()).E.isChecked()) {
            Editable text = ((b0) M()).f20965x.getText();
            if (text == null) {
                str2 = str3;
            } else {
                str2 = android.support.v4.media.a.j(text);
            }
            if (str2.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                Editable text2 = ((b0) M()).f20967z.getText();
                if (text2 != null) {
                    str3 = android.support.v4.media.a.j(text2);
                }
                if (str3.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    return true;
                }
            }
            return false;
        }
        Editable text3 = ((b0) M()).A.getText();
        if (text3 == null) {
            str = str3;
        } else {
            str = android.support.v4.media.a.j(text3);
        }
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Editable text4 = ((b0) M()).f20965x.getText();
            if (text4 != null) {
                str3 = android.support.v4.media.a.j(text4);
            }
            if (str3.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final LoginViewModel U() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        g0 g0Var = new g0(29);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, g0Var);
        ((b0) M()).v(U());
        ((AppTextView) ((b0) M()).H.f10530d).setText("Quên mật khẩu");
        U().f19564w.e(this, new d(new h(this)));
        ((b0) M()).G.setOnCheckedChangeListener(new zg.g(this));
        ((b0) M()).f20964w.setOnClickListener(new com.google.android.material.datepicker.q(this, 10));
        ((ImageButton) ((b0) M()).H.f10528b).setOnClickListener(new com.google.android.material.search.h(this, 12));
        AppCompatEditText appCompatEditText = ((b0) M()).f20965x;
        j.e(appCompatEditText, "card");
        appCompatEditText.addTextChangedListener(new a(this));
        AppCompatEditText appCompatEditText2 = ((b0) M()).f20967z;
        j.e(appCompatEditText2, "edtEmail");
        appCompatEditText2.addTextChangedListener(new b(this));
        AppCompatEditText appCompatEditText3 = ((b0) M()).A;
        j.e(appCompatEditText3, "edtPhone");
        appCompatEditText3.addTextChangedListener(new c(this));
    }
}
