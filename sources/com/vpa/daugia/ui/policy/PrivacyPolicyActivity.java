package com.vpa.daugia.ui.policy;

import android.content.Intent;
import android.os.Bundle;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.module.support.ui.activity.SupportActivity;
import hf.c;

/* compiled from: PrivacyPolicyActivity.kt */
public final class PrivacyPolicyActivity extends BaseActivity<c> {
    public final int N() {
        return C0535R$layout.activity_privacy_policy;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent(this, SupportActivity.class));
        finish();
    }
}
