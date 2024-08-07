package com.vpa.daugia.module.profile.ui.activity;

import ai.c;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.C0535R$layout;
import ei.a;
import gi.h0;
import gi.i0;
import mg.u0;
import yk.l;
import zg.b0;
import zh.d;

/* compiled from: PolicyAndTermActivity.kt */
public final class PolicyAndTermActivity extends BaseActivity<u0> {
    public static final /* synthetic */ int P = 0;
    public boolean O;

    public final int N() {
        return C0535R$layout.activity_policy_and_term;
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.O = extras.getBoolean("ON_VERIFY_PROFILE");
            Intent intent2 = new Intent(this, InstructVerifyActivity.class);
            intent2.putExtra("ON_VERIFY_PROFILE", this.O);
            startActivity(intent2);
            finish();
        }
        int S0 = l.S0("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.", "Chính sách bảo mật", 0, false, 6);
        int S02 = l.S0("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.", "Điều khoản sử dụng", 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.");
        int i10 = S0 + 18;
        spannableStringBuilder.setSpan(new StyleSpan(1), S0, i10, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(2131100275)), S0, i10, 33);
        int i11 = S02 + 18;
        spannableStringBuilder.setSpan(new h0(this), S02, i11, 0);
        spannableStringBuilder.setSpan(new i0(), S0, i10, 0);
        spannableStringBuilder.setSpan(new StyleSpan(1), S02, i11, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(2131100275)), S02, i11, 33);
        ((u0) M()).B.setText(spannableStringBuilder);
        ((u0) M()).B.setMovementMethod(LinkMovementMethod.getInstance());
        ((u0) M()).f21374z.setOnCheckedChangeListener(new b0(this, 3));
        ((u0) M()).f21373y.setOnClickListener(new c(this, 3));
        ((u0) M()).f21371w.setOnClickListener(new d(this, 6));
        ((u0) M()).f21372x.setOnClickListener(new a(this, 2));
    }
}
