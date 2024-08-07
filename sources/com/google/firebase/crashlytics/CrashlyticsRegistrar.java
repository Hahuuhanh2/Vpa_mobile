package com.google.firebase.crashlytics;

import ab.c;
import ca.b;
import ca.m;
import com.google.firebase.components.ComponentRegistrar;
import ea.e;
import java.util.Arrays;
import java.util.List;
import m9.d;
import ub.f;
import xb.n;
import yb.a;
import yb.b;

public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7570a = 0;

    static {
        a aVar = a.f17628a;
        a.a(b.a.CRASHLYTICS);
    }

    public final List<ca.b<?>> getComponents() {
        b.a<e> b10 = ca.b.b(e.class);
        b10.f4614a = "fire-cls";
        b10.a(m.b(d.class));
        b10.a(m.b(c.class));
        b10.a(m.b(n.class));
        b10.a(new m(0, 2, fa.a.class));
        b10.a(new m(0, 2, p9.a.class));
        b10.f4619f = new ea.c(this, 0);
        b10.c(2);
        return Arrays.asList(new ca.b[]{b10.b(), f.a("fire-cls", "18.4.3")});
    }
}
