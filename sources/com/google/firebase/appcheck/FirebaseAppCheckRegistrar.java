package com.google.firebase.appcheck;

import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p3.l0;
import r9.a;
import r9.c;
import r9.d;
import ub.f;

public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    public final List<b<?>> getComponents() {
        r rVar = new r(d.class, Executor.class);
        r rVar2 = new r(c.class, Executor.class);
        r rVar3 = new r(a.class, Executor.class);
        r rVar4 = new r(r9.b.class, ScheduledExecutorService.class);
        b.a aVar = new b.a(s9.b.class, new Class[]{x9.a.class});
        aVar.f4614a = "fire-app-check";
        aVar.a(m.b(m9.d.class));
        aVar.a(new m((r<?>) rVar, 1, 0));
        aVar.a(new m((r<?>) rVar2, 1, 0));
        aVar.a(new m((r<?>) rVar3, 1, 0));
        aVar.a(new m((r<?>) rVar4, 1, 0));
        aVar.a(m.a(xa.d.class));
        aVar.f4619f = new s9.c(rVar, rVar2, rVar3, rVar4);
        aVar.c(1);
        l0 l0Var = new l0();
        b.a<xa.c> b10 = b.b(xa.c.class);
        b10.f4618e = 1;
        b10.f4619f = new ca.a(l0Var, 0);
        return Arrays.asList(new b[]{aVar.b(), b10.b(), f.a("fire-app-check", "17.1.1")});
    }
}
