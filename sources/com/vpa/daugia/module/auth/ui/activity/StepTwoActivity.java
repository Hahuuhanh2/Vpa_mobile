package com.vpa.daugia.module.auth.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.SuppressLint;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Patterns;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.ots.core.utils.customview.edit.PasswordEditText;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.R;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import fk.p;
import java.util.regex.Pattern;
import kf.e;
import kf.h;
import mg.c4;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.k;
import sk.s;
import zg.a2;
import zg.b2;
import zg.c0;
import zg.c2;
import zg.d2;
import zg.e2;
import zg.f2;
import zg.g2;
import zg.h2;
import zg.i2;
import zg.j2;
import zg.r1;
import zg.s1;
import zg.t1;
import zg.u1;
import zg.v1;
import zg.w1;
import zg.x1;
import zg.y1;
import zg.z1;

/* compiled from: StepTwoActivity.kt */
public final class StepTwoActivity extends Hilt_StepTwoActivity<c4> {
    public static final /* synthetic */ int V = 0;
    public final d0 R = new d0(s.a(LoginViewModel.class), new c(this), new b(this), new d(this));
    public Animator S;
    public final String T = "Mã OTP";
    public final StepTwoActivity$mMessageReceiver$1 U = new StepTwoActivity$mMessageReceiver$1(this);

    /* compiled from: StepTwoActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19539a;

        public a(l lVar) {
            this.f19539a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19539a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19539a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19539a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19539a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19540a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19540a = componentActivity;
        }

        public final Object invoke() {
            return this.f19540a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19541a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19541a = componentActivity;
        }

        public final Object invoke() {
            return this.f19541a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19542a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19542a = componentActivity;
        }

        public final Object invoke() {
            return this.f19542a.g();
        }
    }

    public static final boolean T(StepTwoActivity stepTwoActivity) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (e.a(((c4) stepTwoActivity.M()).f21010y.f21159z.getText()).length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (e.a(((c4) stepTwoActivity.M()).f21010y.E.getText()).length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (e.a(((c4) stepTwoActivity.M()).f21010y.D.getText()).length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (e.a(((c4) stepTwoActivity.M()).f21010y.B.getText()).length() > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (e.a(((c4) stepTwoActivity.M()).f21010y.f21158y.getText()).length() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (e.a(((c4) stepTwoActivity.M()).f21010y.C.getText()).length() > 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (e.a(((c4) stepTwoActivity.M()).f21010y.A.getText()).length() > 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16 && Z(((c4) stepTwoActivity.M()).f21010y.N, e.a(((c4) stepTwoActivity.M()).f21010y.B.getText())) && j.a(e.a(((c4) stepTwoActivity.M()).f21010y.f21158y.getText()), e.a(((c4) stepTwoActivity.M()).f21010y.B.getText()))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean Z(AppTextView appTextView, String str) {
        boolean z10;
        Pattern compile = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,50}$");
        j.e(compile, "compile(pattern)");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (appTextView != null) {
                appTextView.setText("Vui lòng nhập mật khẩu");
            }
            if (appTextView != null) {
                appTextView.setVisibility(0);
            }
            return false;
        }
        if (appTextView != null) {
            appTextView.setVisibility(4);
        }
        if (!compile.matcher(str).find()) {
            if (appTextView != null) {
                appTextView.setText("Mật khẩu phải có độ dài từ 8 đến 50 ký tự và chứa ký tự hoa, chữ thường, ký tự số, ký tự đặc biệt");
            }
            if (appTextView != null) {
                appTextView.setVisibility(0);
            }
            return false;
        }
        if (appTextView != null) {
            appTextView.setVisibility(4);
        }
        return true;
    }

    public final int N() {
        return C0535R$layout.fragment_step_two;
    }

    public final boolean U() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (e.a(((c4) M()).f21011z.B.getText()).length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (e.a(((c4) M()).f21011z.A.getText()).length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && Patterns.EMAIL_ADDRESS.matcher(e.a(((c4) M()).f21011z.A.getText())).matches()) {
                if (e.a(((c4) M()).f21011z.C.getText()).length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (e.a(((c4) M()).f21011z.E.getText()).length() > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        if (e.a(((c4) M()).f21011z.f21278z.getText()).length() > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            if (e.a(((c4) M()).f21011z.F.getText()).length() > 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                if (e.a(((c4) M()).f21011z.D.getText()).length() > 0) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16 && ((c4) M()).f21011z.f21276x.isChecked() && Z((AppTextView) null, e.a(((c4) M()).f21011z.E.getText())) && j.a(e.a(((c4) M()).f21011z.f21278z.getText()), e.a(((c4) M()).f21011z.E.getText()))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void V() {
        String str;
        boolean z10;
        String str2;
        Editable text = ((c4) M()).f21011z.D.getText();
        if (text == null) {
            str = "";
        } else {
            str = android.support.v4.media.a.j(text);
        }
        boolean z11 = true;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(this, R.animator.fade_in);
            j.e(loadAnimator, "loadAnimator(...)");
            this.S = loadAnimator;
            loadAnimator.setTarget(((c4) M()).f21011z.O);
            Animator animator = this.S;
            if (animator != null) {
                animator.start();
            } else {
                j.l("fadeInAnimation");
                throw null;
            }
        }
        ((c4) M()).f21011z.D.setHint("");
        AppTextView appTextView = ((c4) M()).f21011z.O;
        j.e(appTextView, "tvTitleOtp");
        appTextView.setVisibility(0);
        Editable text2 = ((c4) M()).f21010y.A.getText();
        if (text2 == null) {
            str2 = "";
        } else {
            str2 = android.support.v4.media.a.j(text2);
        }
        if (str2.length() != 0) {
            z11 = false;
        }
        if (z11) {
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(this, R.animator.fade_in);
            j.e(loadAnimator2, "loadAnimator(...)");
            this.S = loadAnimator2;
            loadAnimator2.setTarget(((c4) M()).f21010y.P);
            Animator animator2 = this.S;
            if (animator2 != null) {
                animator2.start();
            } else {
                j.l("fadeInAnimation");
                throw null;
            }
        }
        ((c4) M()).f21010y.A.setHint("");
        AppTextView appTextView2 = ((c4) M()).f21010y.P;
        j.e(appTextView2, "tvTitleOtp");
        appTextView2.setVisibility(0);
    }

    public final void W() {
        Spanned spanned;
        Spanned spanned2;
        AppTextView appTextView = ((c4) M()).f21011z.O;
        j.e(appTextView, "tvTitleOtp");
        appTextView.setVisibility(8);
        AppCompatEditText appCompatEditText = ((c4) M()).f21011z.D;
        StringBuilder q10 = android.support.v4.media.a.q("<strong>");
        q10.append(this.T);
        q10.append("</strong> <font color = '#FC0808'>*</font>");
        String sb2 = q10.toString();
        j.f(sb2, "string");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            spanned = Html.fromHtml(sb2, 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml(sb2);
            j.c(spanned);
        }
        appCompatEditText.setHint(spanned);
        AppTextView appTextView2 = ((c4) M()).f21010y.P;
        j.e(appTextView2, "tvTitleOtp");
        appTextView2.setVisibility(8);
        AppCompatEditText appCompatEditText2 = ((c4) M()).f21010y.A;
        StringBuilder q11 = android.support.v4.media.a.q("<strong>");
        q11.append(this.T);
        q11.append("</strong> <font color = '#FC0808'>*</font>");
        String sb3 = q11.toString();
        j.f(sb3, "string");
        if (i10 >= 24) {
            spanned2 = Html.fromHtml(sb3, 0);
            j.c(spanned2);
        } else {
            spanned2 = Html.fromHtml(sb3);
            j.c(spanned2);
        }
        appCompatEditText2.setHint(spanned2);
    }

    public final LoginViewModel X() {
        return (LoginViewModel) this.R.getValue();
    }

    public final void Y(String str) {
        boolean z10;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            User user = (User) X().L.f8545b;
            if (user != null) {
                user.setIdentityNumber((String) p.M0(yk.l.f1(str, new String[]{"|"})));
            }
            User user2 = (User) X().L.f8545b;
            if (user2 != null) {
                user2.setFullname((String) yk.l.f1(str, new String[]{"|"}).get(2));
            }
            ((c4) M()).f21011z.B.setEnabled(false);
            ((c4) M()).f21011z.C.setEnabled(false);
            int i10 = h.f12560a;
        }
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((c4) M()).f21011z.v(X());
        ((c4) M()).f21010y.v(X());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(RegisterAccountActivity.T)) {
                LinearLayout linearLayout = ((c4) M()).f21011z.f21277y;
                j.e(linearLayout, "container");
                int i11 = 8;
                if (j.a(extras.getString(RegisterAccountActivity.T), RegisterAccountActivity.U)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                linearLayout.setVisibility(i10);
                LinearLayout linearLayout2 = ((c4) M()).f21010y.f21157x;
                j.e(linearLayout2, "container");
                if (j.a(extras.getString(RegisterAccountActivity.T), RegisterAccountActivity.V)) {
                    i11 = 0;
                }
                linearLayout2.setVisibility(i11);
                X().f19558q.e(this, new a(new h2(this)));
                X().f19560s.e(this, new a(new i2(this)));
                X().f19564w.e(this, new a(new j2(this)));
                int S0 = yk.l.S0("Tôi cam kết chịu trách nghiệm về các thông tin cá nhân đã kê khai, chính sách bảo mật thông tin khách hàng, cơ chế giải quyết tranh chấp, Quy chế hoạt động của ứng dụng.", "Quy chế hoạt động", 0, false, 6);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Tôi cam kết chịu trách nghiệm về các thông tin cá nhân đã kê khai, chính sách bảo mật thông tin khách hàng, cơ chế giải quyết tranh chấp, Quy chế hoạt động của ứng dụng.");
                int i12 = S0 + 17;
                spannableStringBuilder.setSpan(new StyleSpan(1), S0, i12, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(2131100275)), S0, i12, 33);
                spannableStringBuilder.setSpan(new g2(this), S0, i12, 0);
                ((c4) M()).f21011z.N.setText(spannableStringBuilder);
                ((c4) M()).f21011z.N.setMovementMethod(LinkMovementMethod.getInstance());
                AppCompatEditText appCompatEditText = ((c4) M()).f21011z.B;
                j.e(appCompatEditText, "edtFullName");
                appCompatEditText.addTextChangedListener(new s1(this));
                AppCompatEditText appCompatEditText2 = ((c4) M()).f21011z.C;
                j.e(appCompatEditText2, "edtId");
                appCompatEditText2.addTextChangedListener(new y1(this));
                AppCompatEditText appCompatEditText3 = ((c4) M()).f21011z.A;
                j.e(appCompatEditText3, "edtEmail");
                appCompatEditText3.addTextChangedListener(new z1(this));
                PasswordEditText passwordEditText = ((c4) M()).f21011z.E;
                j.e(passwordEditText, "edtPassword");
                passwordEditText.addTextChangedListener(new a2(this));
                PasswordEditText passwordEditText2 = ((c4) M()).f21011z.f21278z;
                j.e(passwordEditText2, "edtConfirmPassword");
                passwordEditText2.addTextChangedListener(new b2(this));
                PasswordEditText passwordEditText3 = ((c4) M()).f21010y.B;
                j.e(passwordEditText3, "edtPassword");
                passwordEditText3.addTextChangedListener(new c2(this));
                PasswordEditText passwordEditText4 = ((c4) M()).f21010y.f21158y;
                j.e(passwordEditText4, "edtConfirmPassword");
                passwordEditText4.addTextChangedListener(new d2(this));
                AppCompatEditText appCompatEditText4 = ((c4) M()).f21011z.F;
                j.e(appCompatEditText4, "edtPhone");
                appCompatEditText4.addTextChangedListener(new e2(this));
                AppCompatEditText appCompatEditText5 = ((c4) M()).f21011z.D;
                j.e(appCompatEditText5, "edtOtp");
                appCompatEditText5.addTextChangedListener(new f2(this));
                ((c4) M()).f21011z.f21276x.setOnCheckedChangeListener(new c0(this, 1));
                AppCompatEditText appCompatEditText6 = ((c4) M()).f21010y.f21159z;
                j.e(appCompatEditText6, "edtOrganizationName");
                appCompatEditText6.addTextChangedListener(new t1(this));
                AppCompatEditText appCompatEditText7 = ((c4) M()).f21010y.E;
                j.e(appCompatEditText7, "edtRepresentative");
                appCompatEditText7.addTextChangedListener(new u1(this));
                AppCompatEditText appCompatEditText8 = ((c4) M()).f21010y.D;
                j.e(appCompatEditText8, "edtPosition");
                appCompatEditText8.addTextChangedListener(new v1(this));
                AppCompatEditText appCompatEditText9 = ((c4) M()).f21010y.C;
                j.e(appCompatEditText9, "edtPhone");
                appCompatEditText9.addTextChangedListener(new w1(this));
                AppCompatEditText appCompatEditText10 = ((c4) M()).f21010y.A;
                j.e(appCompatEditText10, "edtOtp");
                appCompatEditText10.addTextChangedListener(new x1(this));
                ((c4) M()).f21011z.f21275w.setOnClickListener(new com.google.android.material.search.h(this, 18));
                ((c4) M()).f21010y.f21156w.setOnClickListener(new r1(this, 1));
                ((c4) M()).f21011z.D.setOnFocusChangeListener(new com.google.android.material.datepicker.e(this, 4));
                ((c4) M()).f21010y.A.setOnFocusChangeListener(new zg.b(this, 1));
                ((c4) M()).f21011z.M.setOnClickListener(new r1(this, 2));
                ((c4) M()).f21010y.O.setOnClickListener(new com.google.android.material.datepicker.q(this, 16));
            }
            if (extras.containsKey("QR_CODE")) {
                String string = extras.getString("QR_CODE", "");
                j.e(string, "getString(...)");
                Y(string);
            }
        }
        ((c4) M()).f21008w.setOnClickListener(new r1(this, 0));
    }

    public final void onStart() {
        super.onStart();
        u2.a.a(this).b(this.U, new IntentFilter("QR_CODE"));
    }
}
