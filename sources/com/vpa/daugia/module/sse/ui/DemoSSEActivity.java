package com.vpa.daugia.module.sse.ui;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.vpa.daugia.C0535R$layout;
import mg.t;
import r2.w;
import ri.d;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: DemoSSEActivity.kt */
public final class DemoSSEActivity extends Hilt_DemoSSEActivity<t> {
    public final d0 R = new d0(s.a(d.class), new b(this), new a(this), new c(this));

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class a extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19883a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f19883a = componentActivity;
        }

        public final Object invoke() {
            return this.f19883a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19884a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19884a = componentActivity;
        }

        public final Object invoke() {
            return this.f19884a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19885a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19885a = componentActivity;
        }

        public final Object invoke() {
            return this.f19885a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_demo_sseactivity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d dVar = (d) this.R.getValue();
        j.f(ri.a.f22795a, "function");
        throw null;
    }
}
