package com.vpa.daugia.di;

import al.g0;
import com.airbnb.lottie.c;
import com.ots.core.base.BaseApp;
import ej.d;
import ej.e;
import hj.b;
import ng.p;
import og.f;

public abstract class Hilt_App extends BaseApp implements b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f19370b = false;

    /* renamed from: c  reason: collision with root package name */
    public final d f19371c = new d(new a());

    public class a implements e {
        public a() {
        }

        public final p a() {
            return new p(new og.d(), new og.e(), new c(Hilt_App.this), new lb.b(13), new g0(13), new lb.b(14), new a.a(), new f(), new a.a(), new lb.b(15), new a.a(), new g0(14), new lb.b(16), new lb.b(17));
        }
    }

    public final Object d() {
        return this.f19371c.d();
    }

    public void onCreate() {
        if (!this.f19370b) {
            this.f19370b = true;
            ((ng.a) d()).b((App) this);
        }
        super.onCreate();
    }
}
