package com.ots.base.utils.customview;

import af.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.vpa.daugia.C0535R$layout;
import d2.e;
import d2.f;
import d2.l;
import jf.c;
import lg.b;
import mg.v7;
import sk.j;
import v.h;

/* compiled from: DebugView.kt */
public final class DebugView extends Hilt_DebugView {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f8249f = 0;

    /* renamed from: c  reason: collision with root package name */
    public v7 f8250c;

    /* renamed from: d  reason: collision with root package name */
    public b f8251d;

    /* renamed from: e  reason: collision with root package name */
    public int f8252e;

    /* compiled from: DebugView.kt */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DebugView f8253a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f8254b;

        public a(DebugView debugView, Context context) {
            this.f8253a = debugView;
            this.f8254b = context;
        }

        public final void a(boolean z10) {
            if (z10) {
                View view = this.f8253a.getBinding().f8554e;
                j.e(view, "getRoot(...)");
                af.c.a(new af.c(view), "Xác nhận đổi => DEV API", 500, this.f8254b);
                b sharedPrefsHelper = this.f8253a.getSharedPrefsHelper();
                sharedPrefsHelper.getClass();
                j7.a.f11713u = "https://stg-dgbs.vpa.com.vn/";
                sharedPrefsHelper.f20850a.edit().putString("pref_base_url", "https://stg-dgbs.vpa.com.vn/").apply();
                this.f8253a.getSharedPrefsHelper().h("");
                this.f8253a.getSharedPrefsHelper().j(Boolean.FALSE, "IS_SHOW_BIOMETRIC");
                this.f8253a.getSharedPrefsHelper().f20850a.edit().putBoolean("OnDebug", true).apply();
                this.f8253a.postDelayed(new l6.a(1), 1000);
                return;
            }
            View view2 = this.f8253a.getBinding().f8554e;
            j.e(view2, "getRoot(...)");
            af.c.a(new af.c(view2), "Xác nhận đổi => PRODUCTION API", 200, this.f8254b);
            b sharedPrefsHelper2 = this.f8253a.getSharedPrefsHelper();
            sharedPrefsHelper2.getClass();
            j7.a.f11713u = "https://dgbs.vpa.com.vn/";
            sharedPrefsHelper2.f20850a.edit().putString("pref_base_url", "https://dgbs.vpa.com.vn/").apply();
            this.f8253a.getSharedPrefsHelper().h("");
            this.f8253a.getSharedPrefsHelper().j(Boolean.FALSE, "IS_SHOW_BIOMETRIC");
            this.f8253a.getSharedPrefsHelper().f20850a.edit().putBoolean("OnDebug", false).apply();
            this.f8253a.postDelayed(new h(1), 1000);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugView(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        l c10 = f.c((LayoutInflater) systemService, C0535R$layout.widget_debug_view, this, true, (e) null);
        j.e(c10, "inflate(...)");
        setBinding((v7) c10);
        String string = getSharedPrefsHelper().f20850a.getString("pref_base_url", (String) null);
        if (string == null) {
            string = "https://dgbs.vpa.com.vn/";
        }
        getBinding().f21409x.setText("Phiên bản 0.1.0");
        if (getSharedPrefsHelper().f20850a.getBoolean("OnDebug", false)) {
            getBinding().f21408w.setText(string);
        }
        setOnClickListener(new d(0, this, context));
    }

    public final v7 getBinding() {
        v7 v7Var = this.f8250c;
        if (v7Var != null) {
            return v7Var;
        }
        j.l("binding");
        throw null;
    }

    public final int getCountClick() {
        return this.f8252e;
    }

    public final b getSharedPrefsHelper() {
        b bVar = this.f8251d;
        if (bVar != null) {
            return bVar;
        }
        j.l("sharedPrefsHelper");
        throw null;
    }

    public final void setBinding(v7 v7Var) {
        j.f(v7Var, "<set-?>");
        this.f8250c = v7Var;
    }

    public final void setCountClick(int i10) {
        this.f8252e = i10;
    }

    public final void setSharedPrefsHelper(b bVar) {
        j.f(bVar, "<set-?>");
        this.f8251d = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context, attributeSet);
    }
}
