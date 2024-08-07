package com.vpa.daugia.module.auth.ui.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.o;
import com.google.android.material.search.h;
import com.vpa.daugia.C0535R$layout;
import kf.a;
import mg.p7;
import sk.j;

/* compiled from: SuccessActivity.kt */
public final class SuccessActivity extends Hilt_SuccessActivity<p7> {
    public static final /* synthetic */ int R = 0;

    public final int N() {
        return C0535R$layout.success_view;
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.getString("KEY_FLOW") == null)) {
            ((p7) M()).f21299x.setText("Quên mật khẩu");
        }
        ((p7) M()).f21298w.setOnClickListener(new h(this, 19));
    }
}
