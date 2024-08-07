package com.vpa.daugia.module.history.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import java.util.WeakHashMap;
import kh.h;
import kh.i;
import mg.k;
import r2.q;
import r2.w;
import rk.l;
import sk.f;
import sk.j;
import sk.s;
import w1.d0;
import w1.q0;
import zg.b0;

/* compiled from: AuctionReportActivity.kt */
public final class AuctionReportActivity extends Hilt_AuctionReportActivity<k> {
    public static final /* synthetic */ int V = 0;
    public final d0 R = new d0(s.a(CommonViewModel.class), new c(this), new b(this), new d(this));
    public String S = "";
    public final int T = 1;
    public lg.b U;

    /* compiled from: AuctionReportActivity.kt */
    public static final class a implements q, f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f19658a;

        public a(kh.l lVar) {
            this.f19658a = lVar;
        }

        public final ek.a<?> a() {
            return this.f19658a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f19658a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.f19658a, ((f) obj).a());
        }

        public final int hashCode() {
            return this.f19658a.hashCode();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends sk.k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19659a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19659a = componentActivity;
        }

        public final Object invoke() {
            return this.f19659a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends sk.k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19660a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19660a = componentActivity;
        }

        public final Object invoke() {
            return this.f19660a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class d extends sk.k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19661a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19661a = componentActivity;
        }

        public final Object invoke() {
            return this.f19661a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_auction_report;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.k.a(this);
        View findViewById = findViewById(2131362339);
        h hVar = new h(0);
        WeakHashMap<View, q0> weakHashMap = w1.d0.f16298a;
        d0.i.u(findViewById, hVar);
        ((CommonViewModel) this.R.getValue()).f19622i.e(this, new a(new kh.l(this)));
        ((AppTextView) ((k) M()).A.f10530d).setText(getString(C0540R$string.auction_report));
        ((ImageButton) ((k) M()).A.f10529c).setBackgroundResource(C0531R$drawable.ic_download_document);
        ((ImageButton) ((k) M()).A.f10528b).setOnClickListener(new kh.j(this, 0));
        ((k) M()).f21139x.setOnCheckedChangeListener(new b0(this, 2));
        ((ImageButton) ((k) M()).A.f10529c).setOnClickListener(new com.google.android.material.datepicker.q(this, 22));
        ((k) M()).f21138w.setOnClickListener(new kh.j(this, 1));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            long j10 = extras.getLong("DATA_DOCUMENT");
            this.S = String.valueOf(j10);
            new Thread(new i(j10, this)).start();
        }
    }

    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        j.f(strArr, "permissions");
        j.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.T) {
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
                if (iArr[0] == 0 || iArr[1] == 0) {
                    View view = ((k) M()).f8554e;
                    j.e(view, "getRoot(...)");
                    String str = j7.a.f11713u + "web-api/user-bidding/api/document/user/download?documentId=" + this.S + "&timestamp=" + System.currentTimeMillis();
                    lg.b bVar = this.U;
                    if (bVar != null) {
                        ze.b.m(view, str, bVar.a());
                    } else {
                        j.l("sharedPrefsHelper");
                        throw null;
                    }
                } else {
                    View view2 = ((k) M()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new of.a(view2).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
                }
            } else if (iArr[0] == 0) {
                View view3 = ((k) M()).f8554e;
                j.e(view3, "getRoot(...)");
                String str2 = j7.a.f11713u + "web-api/user-bidding/api/document/user/download?documentId=" + this.S + "&timestamp=" + System.currentTimeMillis();
                lg.b bVar2 = this.U;
                if (bVar2 != null) {
                    ze.b.m(view3, str2, bVar2.a());
                } else {
                    j.l("sharedPrefsHelper");
                    throw null;
                }
            } else {
                View view4 = ((k) M()).f8554e;
                j.e(view4, "getRoot(...)");
                new of.a(view4).a("Bạn đã từ chối quyền truy cập", of.b.ERROR);
            }
        }
    }
}
