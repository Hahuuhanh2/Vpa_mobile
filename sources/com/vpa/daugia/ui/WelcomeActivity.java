package com.vpa.daugia.ui;

import android.os.Bundle;
import com.vpa.daugia.C0535R$layout;
import lg.b;
import mg.c2;
import zh.d;

/* compiled from: WelcomeActivity.kt */
public final class WelcomeActivity extends Hilt_WelcomeActivity<c2> {
    public static final /* synthetic */ int S = 0;
    public b R;

    public final int N() {
        return C0535R$layout.activity_welcome;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((c2) M()).f21002w.setOnClickListener(new d(this, 14));
    }
}
