package com.vpa.daugia.module.qr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import df.b;
import f.d;
import g.c;
import java.util.Timer;
import java.util.regex.Pattern;
import kf.h;
import lf.g;
import mg.h1;
import mj.e;
import mj.m;
import n0.l;
import sk.f;
import sk.i;
import sk.j;

/* compiled from: ScanQrActivity.kt */
public final class ScanQrActivity extends BaseActivity<h1> {
    public static final /* synthetic */ int P = 0;
    public final d O = ((d) F(new a(), new m()));

    /* compiled from: ScanQrActivity.kt */
    public /* synthetic */ class a implements f.a, f {
        public a() {
        }

        public final ek.a<?> a() {
            return new i(1, (Object) ScanQrActivity.this, ScanQrActivity.class, "handleResult", "handleResult(Lio/github/g00fy2/quickie/QRResult;)V");
        }

        public final void b(Object obj) {
            boolean z10;
            e eVar = (e) obj;
            j.f(eVar, "p0");
            ScanQrActivity scanQrActivity = ScanQrActivity.this;
            int i10 = ScanQrActivity.P;
            scanQrActivity.getClass();
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
                        Intent intent = new Intent(scanQrActivity, StepTwoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putString(RegisterAccountActivity.T, RegisterAccountActivity.U);
                        bundle.putString("QR_CODE", a10);
                        intent.putExtras(bundle);
                        scanQrActivity.startActivity(intent);
                        Timer n10 = l.n(b.f8966a);
                        b.f8966a = n10;
                        n10.schedule(new hi.d(scanQrActivity, intent), 500);
                        int i11 = h.f12560a;
                        return;
                    }
                    View view = ((h1) scanQrActivity.M()).f8554e;
                    j.e(view, "getRoot(...)");
                    new of.a(view).a("Mã QR không hợp lệ", of.b.ERROR);
                    g.b.a(scanQrActivity, new fb.l(scanQrActivity, 7), 1000);
                    return;
                }
                return;
            }
            scanQrActivity.finish();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f.a) || !(obj instanceof f)) {
                return false;
            }
            return j.a(a(), ((f) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public final int N() {
        return C0535R$layout.activity_scan_qr;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F(new u5.a(this, 7), new c()).a("android.permission.CAMERA");
    }
}
