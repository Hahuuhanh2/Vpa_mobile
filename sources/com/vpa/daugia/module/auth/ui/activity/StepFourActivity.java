package com.vpa.daugia.module.auth.ui.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.o;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.search.h;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import kf.b;
import lf.g;
import mg.u3;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: StepFourActivity.kt */
public final class StepFourActivity extends Hilt_StepFourActivity<u3> {
    public static final /* synthetic */ int R = 0;

    /* compiled from: StepFourActivity.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StepFourActivity f19521a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StepFourActivity stepFourActivity) {
            super(1);
            this.f19521a = stepFourActivity;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            StepFourActivity stepFourActivity = this.f19521a;
            int i10 = StepFourActivity.R;
            stepFourActivity.getClass();
            Intent intent = new Intent(stepFourActivity, MainActivity.class);
            intent.setFlags(268435456);
            stepFourActivity.startActivity(intent);
            stepFourActivity.finish();
            return i.f20112a;
        }
    }

    public final int N() {
        return C0535R$layout.fragment_step_four;
    }

    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (extras2 = intent.getExtras()) == null)) {
            extras2.getBoolean("ON_VERIFY_PROFILE");
        }
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null || !extras.getBoolean("REGISTER_ORG"))) {
            LinearLayout linearLayout = ((u3) M()).f21384y;
            j.e(linearLayout, "llButton");
            linearLayout.setVisibility(8);
            g.b.a(this, new d.i(this, 29), 3000);
        }
        kf.a L = L();
        o oVar = this.f270d;
        j.e(oVar, "<get-lifecycle>(...)");
        L.a(oVar);
        ((u3) M()).f21382w.setOnClickListener(new h(this, 15));
        MaterialButton materialButton = ((u3) M()).f21383x;
        j.e(materialButton, "btnVerify");
        materialButton.setOnClickListener(new b(500, materialButton, new a(this)));
    }
}
