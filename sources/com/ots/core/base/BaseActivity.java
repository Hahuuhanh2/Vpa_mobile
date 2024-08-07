package com.ots.core.base;

import android.app.Dialog;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import c0.i0;
import com.ots.core.R$drawable;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import d.r;
import d2.e;
import d2.f;
import d2.l;
import java.util.WeakHashMap;
import kf.h;
import lf.g;
import sk.j;
import sk.k;
import w1.d0;
import w1.q0;

/* compiled from: BaseActivity.kt */
public abstract class BaseActivity<DB extends l> extends AppCompatActivity implements g {
    public static final /* synthetic */ int N = 0;
    public final ek.g I = j7.a.b0(a.f8332a);
    public final ek.g J = j7.a.b0(new c(this));
    public Toolbar K;
    public final ek.g L = j7.a.b0(new b(this));
    public BaseActivity$broadcastReceiver$1 M;

    /* compiled from: BaseActivity.kt */
    public static final class a extends k implements rk.a<kf.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8332a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new kf.a();
        }
    }

    /* compiled from: BaseActivity.kt */
    public static final class b extends k implements rk.a<DB> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseActivity<DB> f8333a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(BaseActivity<DB> baseActivity) {
            super(0);
            this.f8333a = baseActivity;
        }

        public final Object invoke() {
            BaseActivity<DB> baseActivity = this.f8333a;
            int N = baseActivity.N();
            DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
            baseActivity.setContentView(N);
            l b10 = f.b((e) null, (ViewGroup) baseActivity.getWindow().getDecorView().findViewById(16908290), 0, N);
            j.d(b10, "null cannot be cast to non-null type DB of com.ots.core.base.BaseActivity");
            return b10;
        }
    }

    /* compiled from: BaseActivity.kt */
    public static final class c extends k implements rk.a<Dialog> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseActivity<DB> f8335a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BaseActivity<DB> baseActivity) {
            super(0);
            this.f8335a = baseActivity;
        }

        public final Object invoke() {
            BaseActivity<DB> baseActivity = this.f8335a;
            j.f(baseActivity, "context");
            try {
                Dialog dialog = new Dialog(baseActivity);
                dialog.setContentView(LayoutInflater.from(baseActivity).inflate(R$layout.widget_progress_dialog, (ViewGroup) null));
                dialog.setCancelable(false);
                Window window = dialog.getWindow();
                if (window == null) {
                    return dialog;
                }
                window.setBackgroundDrawable(new ColorDrawable(0));
                return dialog;
            } catch (Exception e10) {
                h.a(e10);
                return new Dialog(baseActivity);
            }
        }
    }

    /* compiled from: BaseActivity.kt */
    public static final class d extends r {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ BaseActivity<DB> f8336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(BaseActivity<DB> baseActivity) {
            super(true);
            this.f8336d = baseActivity;
        }

        public final void a() {
            this.f8336d.P();
        }
    }

    public BaseActivity() {
        F(new ef.a(this, 0), new g.c());
        this.M = new BaseActivity$broadcastReceiver$1(this);
    }

    public final kf.a L() {
        return (kf.a) this.I.getValue();
    }

    public final DB M() {
        return (l) this.L.getValue();
    }

    public abstract int N();

    public final Dialog O() {
        return (Dialog) this.J.getValue();
    }

    public void P() {
        finish();
    }

    public void Q(lf.f fVar) {
        j.f(fVar, "it");
    }

    public void R() {
    }

    public void S() {
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View currentFocus;
        boolean z11;
        super.dispatchTouchEvent(motionEvent);
        if (motionEvent == null || motionEvent.getAction() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (currentFocus = getCurrentFocus()) != null) {
            int[] iArr = {0, 0};
            currentFocus.getLocationOnScreen(iArr);
            float rawX = (motionEvent.getRawX() + ((float) currentFocus.getLeft())) - ((float) iArr[0]);
            float rawY = (motionEvent.getRawY() + ((float) currentFocus.getTop())) - ((float) iArr[1]);
            if (rawX < ((float) currentFocus.getLeft()) || rawX > ((float) currentFocus.getRight()) || rawY < ((float) currentFocus.getTop()) || rawY > ((float) currentFocus.getBottom())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Object systemService = getSystemService("input_method");
                j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                return true;
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Configuration configuration = getResources().getConfiguration();
        j.e(configuration, "getConfiguration(...)");
        configuration.fontScale = 0.92f;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Object systemService = getSystemService("window");
        j.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
        R();
        int i10 = h.f12560a;
        View findViewById = findViewById(R$id.main);
        if (findViewById != null) {
            d.k.a(this);
            i0 i0Var = new i0(25);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.u(findViewById, i0Var);
        }
        setContentView(M().f8554e);
        try {
            Toolbar toolbar = (Toolbar) M().f8554e.findViewById(R$id.toolbar);
            this.K = toolbar;
            I().w(toolbar);
            Toolbar toolbar2 = this.K;
            if (toolbar2 != null) {
                toolbar2.setNavigationIcon(R$drawable.ic_home_back_24dp);
            }
            ActionBar J2 = J();
            if (J2 != null) {
                J2.n();
            }
            Toolbar toolbar3 = this.K;
            if (toolbar3 != null) {
                toolbar3.bringToFront();
            }
            Toolbar toolbar4 = this.K;
            if (toolbar4 != null) {
                toolbar4.setNavigationOnClickListener(new com.google.android.material.search.h(this, 1));
            }
        } catch (Exception unused) {
        }
        S();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.M, intentFilter);
        b().a(this, new d(this));
    }

    public void onDestroy() {
        super.onDestroy();
        g.f12998l.getClass();
        g.a.f13000b.removeCallbacksAndMessages(this);
    }

    public final boolean p(Runnable runnable, long j10) {
        g.f12998l.getClass();
        return g.a.f13000b.postAtTime(runnable, this, j10);
    }
}
