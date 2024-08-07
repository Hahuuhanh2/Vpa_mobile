package com.vpa.daugia.module.profile.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.C0535R$layout;
import d.k;
import gi.d;
import gi.e;
import gi.f;
import java.util.WeakHashMap;
import mg.e0;
import w1.d0;
import w1.q0;
import yk.l;
import zg.a0;
import zg.c0;

/* compiled from: InstructVerifyActivity.kt */
public final class InstructVerifyActivity extends BaseActivity<e0> {
    public static final /* synthetic */ int P = 0;
    public boolean O;

    public final int N() {
        return C0535R$layout.activity_instruct_verify;
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        k.a(this);
        View findViewById = findViewById(2131362339);
        a0 a0Var = new a0(7);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(findViewById, a0Var);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.O = extras.getBoolean("ON_VERIFY_PROFILE");
        }
        ((e0) M()).f21036y.setOnClickListener(new d(this, 0));
        ((e0) M()).f21037z.setOnCheckedChangeListener(new c0(this, 4));
        ((e0) M()).f21034w.setOnClickListener(new zh.d(this, 4));
        ((e0) M()).f21035x.setOnClickListener(new d(this, 1));
        int S0 = l.S0("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.", "Chính sách bảo mật", 0, false, 6);
        int S02 = l.S0("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.", "Điều khoản sử dụng", 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Tôi đồng ý với Chính sách bảo mật và Điều khoản sử dụng của VPA khi tiến hành xác minh danh tính.");
        int i10 = S0 + 18;
        spannableStringBuilder.setSpan(new StyleSpan(1), S0, i10, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(2131100275)), S0, i10, 33);
        int i11 = S02 + 18;
        spannableStringBuilder.setSpan(new e(this), S02, i11, 0);
        spannableStringBuilder.setSpan(new f(), S0, i10, 0);
        spannableStringBuilder.setSpan(new StyleSpan(1), S02, i11, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(2131100275)), S02, i11, 33);
        ((e0) M()).B.setText(spannableStringBuilder);
        ((e0) M()).B.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
