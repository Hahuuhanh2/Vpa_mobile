package com.google.firebase.appcheck.debug;

import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m9.d;
import r9.a;
import r9.c;
import ub.f;

public class FirebaseAppCheckDebugRegistrar implements ComponentRegistrar {
    public final List<b<?>> getComponents() {
        r rVar = new r(c.class, Executor.class);
        r rVar2 = new r(a.class, Executor.class);
        r rVar3 = new r(r9.b.class, Executor.class);
        b.a<u9.a> b10 = b.b(u9.a.class);
        b10.f4614a = "fire-app-check-debug";
        b10.a(m.b(d.class));
        b10.a(m.a(t9.b.class));
        b10.a(new m((r<?>) rVar, 1, 0));
        b10.a(new m((r<?>) rVar2, 1, 0));
        b10.a(new m((r<?>) rVar3, 1, 0));
        b10.f4619f = new t9.a(rVar, rVar2, rVar3);
        return Arrays.asList(new b[]{b10.b(), f.a("fire-app-check-debug", "17.1.1")});
    }
}
