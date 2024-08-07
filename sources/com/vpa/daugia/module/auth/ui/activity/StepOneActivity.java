package com.vpa.daugia.module.auth.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import com.google.android.material.datepicker.q;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.ui.viewmodel.RegisterViewModel;
import ek.i;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kf.h;
import mg.w3;
import mj.e;
import mj.m;
import nj.b;
import r2.w;
import rk.l;
import sk.j;
import sk.k;
import sk.s;
import w1.d0;
import w1.q0;
import zg.b0;
import zg.f0;

/* compiled from: StepOneActivity.kt */
public final class StepOneActivity extends Hilt_StepOneActivity<w3> {
    public static final /* synthetic */ int T = 0;
    public final f.d R = ((f.d) F(new c(), new m()));
    public final f.d S = ((f.d) F(new u5.a(this, 1), new g.c()));

    /* compiled from: StepOneActivity.kt */
    public static final class a extends k implements l<b.a, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StepOneActivity f19522a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StepOneActivity stepOneActivity) {
            super(1);
            this.f19522a = stepOneActivity;
        }

        public final Object invoke(Object obj) {
            b.a aVar = (b.a) obj;
            j.f(aVar, "$this$build");
            aVar.f21733a = j7.a.c0(nj.a.FORMAT_QR_CODE);
            aVar.f21735c = true;
            aVar.f21736d = false;
            aVar.f21739g = false;
            aVar.f21737e = 1.0f;
            aVar.f21738f = false;
            this.f19522a.setTitle(C0540R$string.title_home);
            return i.f20112a;
        }
    }

    /* compiled from: SearchViewExtensions.kt */
    public static final class b extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StepOneActivity f19523a;

        /* compiled from: SearchViewExtensions.kt */
        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ StepOneActivity f19524a;

            public a(StepOneActivity stepOneActivity) {
                this.f19524a = stepOneActivity;
            }

            public final void run() {
                this.f19524a.finish();
            }
        }

        public b(StepOneActivity stepOneActivity) {
            this.f19523a = stepOneActivity;
        }

        public final void run() {
            new Handler(Looper.getMainLooper()).post(new a(this.f19523a));
        }
    }

    /* compiled from: StepOneActivity.kt */
    public /* synthetic */ class c implements f.a, sk.f {
        public c() {
        }

        public final ek.a<?> a() {
            return new sk.i(1, (Object) StepOneActivity.this, StepOneActivity.class, "handleResult", "handleResult(Lio/github/g00fy2/quickie/QRResult;)V");
        }

        public final void b(Object obj) {
            boolean z10;
            mj.e eVar = (mj.e) obj;
            j.f(eVar, "p0");
            StepOneActivity stepOneActivity = StepOneActivity.this;
            int i10 = StepOneActivity.T;
            stepOneActivity.getClass();
            if (eVar instanceof e.c) {
                String a10 = ((e.c) eVar).f21559a.a();
                if (a10 != null) {
                    try {
                        Pattern compile = Pattern.compile("\\d+\\|\\d+\\|[^|]+\\|\\d+\\|[A-Za-zÀ-ỹ]+\\|[^|]+\\|\\d+");
                        j.e(compile, "compile(pattern)");
                        z10 = compile.matcher(a10).matches();
                    } catch (Exception e10) {
                        h.a(e10);
                        z10 = false;
                    }
                    if (z10) {
                        Intent intent = new Intent(stepOneActivity, StepTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString(RegisterAccountActivity.T, RegisterAccountActivity.U);
                        bundle.putString("QR_CODE", a10);
                        intent.putExtras(bundle);
                        stepOneActivity.startActivity(intent);
                        Timer n10 = n0.l.n(df.b.f8966a);
                        df.b.f8966a = n10;
                        n10.schedule(new f0(stepOneActivity, intent), 500);
                        int i11 = h.f12560a;
                        return;
                    }
                    View view = ((w3) stepOneActivity.M()).f8554e;
                    j.e(view, "getRoot(...)");
                    new of.a(view).a("Mã QR không hợp lệ. Vui lòng quét lại", of.b.ERROR);
                    return;
                }
                return;
            }
            stepOneActivity.finish();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f.a) || !(obj instanceof sk.f)) {
                return false;
            }
            return j.a(a(), ((sk.f) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19526a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19526a = componentActivity;
        }

        public final Object invoke() {
            return this.f19526a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class e extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19527a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f19527a = componentActivity;
        }

        public final Object invoke() {
            return this.f19527a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class f extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19528a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f19528a = componentActivity;
        }

        public final Object invoke() {
            return this.f19528a.g();
        }
    }

    public StepOneActivity() {
        new d(this);
        s.a(RegisterViewModel.class);
        new e(this);
        new f(this);
        j.e(Pattern.compile("^(\\+?84|0)\\d{9,10}$"), "compile(pattern)");
    }

    public final int N() {
        return C0535R$layout.fragment_step_one;
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        vb.d dVar = new vb.d(2);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(findViewById, dVar);
        ((w3) M()).f21417z.setOnCheckedChangeListener(new y7.a(this, 1));
        ((w3) M()).A.setOnCheckedChangeListener(new b0(this, 1));
        ((w3) M()).f21415x.setOnClickListener(new q(this, 13));
        ((w3) M()).f21414w.setOnClickListener(new com.google.android.material.search.h(this, 16));
    }
}
