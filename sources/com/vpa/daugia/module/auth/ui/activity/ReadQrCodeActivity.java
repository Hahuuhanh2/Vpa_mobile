package com.vpa.daugia.module.auth.ui.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.o;
import com.google.android.material.datepicker.q;
import com.vpa.daugia.C0535R$layout;
import kf.a;
import mg.z0;
import sk.j;

/* compiled from: ReadQrCodeActivity.kt */
public final class ReadQrCodeActivity extends Hilt_ReadQrCodeActivity<z0> {
    public static final /* synthetic */ int R = 0;

    public final int N() {
        return C0535R$layout.activity_read_qr_code;
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((z0) M()).f21510w.setOnClickListener(new q(this, 12));
    }
}
