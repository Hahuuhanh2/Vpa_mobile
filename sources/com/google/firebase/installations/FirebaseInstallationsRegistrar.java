package com.google.firebase.installations;

import ab.b;
import ab.c;
import androidx.annotation.Keep;
import c0.i0;
import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import da.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m9.d;
import p3.l0;
import r9.a;
import ub.f;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static c lambda$getComponents$0(ca.c cVar) {
        return new b((d) cVar.a(d.class), cVar.c(xa.d.class), (ExecutorService) cVar.d(new r(a.class, ExecutorService.class)), new k((Executor) cVar.d(new r(r9.b.class, Executor.class))));
    }

    public List<ca.b<?>> getComponents() {
        b.a<c> b10 = ca.b.b(c.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(d.class));
        b10.a(m.a(xa.d.class));
        b10.a(new m((r<?>) new r(a.class, ExecutorService.class), 1, 0));
        b10.a(new m((r<?>) new r(r9.b.class, Executor.class), 1, 0));
        b10.f4619f = new i0(3);
        l0 l0Var = new l0();
        b.a<xa.c> b11 = ca.b.b(xa.c.class);
        b11.f4618e = 1;
        b11.f4619f = new ca.a(l0Var, 0);
        return Arrays.asList(new ca.b[]{b10.b(), b11.b(), f.a(LIBRARY_NAME, "17.1.4")});
    }
}
