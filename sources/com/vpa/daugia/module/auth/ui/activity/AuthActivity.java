package com.vpa.daugia.module.auth.ui.activity;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.w;
import com.vpa.daugia.C0535R$layout;
import d.k;
import hf.i;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import sk.j;
import tj.b;
import u5.c;
import u5.f;
import vb.d;
import w1.d0;
import w1.q0;
import yg.g;

/* compiled from: AuthActivity.kt */
public final class AuthActivity extends Hilt_AuthActivity<i> {
    public static final /* synthetic */ int R = 0;

    /* compiled from: AuthActivity.kt */
    public static final class a<T> implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f19468a = new a<>();

        public final void accept(Object obj) {
            j.f((List) obj, "result");
        }
    }

    public final int N() {
        return C0535R$layout.activity_auth;
    }

    public final void T() {
        String str;
        g gVar = new g();
        w G = G();
        G.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(G);
        aVar.g(2131362022, gVar, (String) null, 2);
        aVar.e(false);
        w G2 = G();
        j.e(G2, "supportFragmentManager");
        c cVar = new c(G2);
        s5.a aVar2 = new s5.a(this);
        String[] strArr = (String[]) Arrays.copyOf(new String[0], 0);
        j.f(strArr, "otherPermissions");
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 == 0) {
                str = "android.permission.POST_NOTIFICATIONS";
            } else {
                str = strArr[i10 - 1];
            }
            strArr2[i10] = str;
        }
        f J = aVar2.J(strArr2, cVar);
        ck.a aVar3 = new ck.a();
        v5.a aVar4 = new v5.a(aVar3);
        new yj.b(new yj.c(aVar3, new v5.b(new v5.c(aVar3, J, aVar4))), new r0.f(aVar3, J, aVar4)).b(new wj.c(a.f19468a));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.a(this);
        View findViewById = findViewById(2131362022);
        d dVar = new d(1);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(findViewById, dVar);
        if (getIntent().getIntExtra("arg_type", 0) == 17) {
            T();
        } else {
            T();
        }
    }
}
