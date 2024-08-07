package com.vpa.daugia.module.payment.ui.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import com.google.android.material.textfield.b;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import fb.l;
import mg.f1;
import zg.c0;
import zh.d;

/* compiled from: RegulationActivity.kt */
public final class RegulationActivity extends BaseActivity<f1> {
    public static final /* synthetic */ int O = 0;

    public final int N() {
        return C0535R$layout.activity_regulation;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((f1) M()).A.f10530d).setText(getString(C0540R$string.auction_regulation));
        ((ImageButton) ((f1) M()).A.f10528b).setOnClickListener(new b(this, 28));
        ((f1) M()).f21056x.setOnCheckedChangeListener(new c0(this, 3));
        ((f1) M()).f21055w.setOnClickListener(new d(this, 0));
        new Thread(new l(this, 6)).start();
    }
}
