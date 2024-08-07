package com.google.firebase.auth;

import aa.j;
import androidx.annotation.Keep;
import ba.j0;
import ca.b;
import ca.c;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p3.l0;
import ub.f;
import x9.a;
import xa.d;
import za.b;

@Keep
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(r rVar, r rVar2, r rVar3, r rVar4, r rVar5, c cVar) {
        b<a> c10 = cVar.c(a.class);
        b<d> c11 = cVar.c(d.class);
        Executor executor = (Executor) cVar.d(rVar);
        Executor executor2 = (Executor) cVar.d(rVar3);
        return new j0((m9.d) cVar.a(m9.d.class), c10, c11, (Executor) cVar.d(rVar2), (ScheduledExecutorService) cVar.d(rVar4), (Executor) cVar.d(rVar5));
    }

    @Keep
    public List<ca.b<?>> getComponents() {
        r rVar = new r(r9.a.class, Executor.class);
        r rVar2 = new r(r9.b.class, Executor.class);
        r rVar3 = new r(r9.c.class, Executor.class);
        r rVar4 = new r(r9.c.class, ScheduledExecutorService.class);
        r rVar5 = new r(r9.d.class, Executor.class);
        b.a aVar = new b.a(FirebaseAuth.class, new Class[]{ba.b.class});
        aVar.a(m.b(m9.d.class));
        aVar.a(m.c(d.class));
        aVar.a(new m((r<?>) rVar, 1, 0));
        aVar.a(new m((r<?>) rVar2, 1, 0));
        aVar.a(new m((r<?>) rVar3, 1, 0));
        aVar.a(new m((r<?>) rVar4, 1, 0));
        aVar.a(new m((r<?>) rVar5, 1, 0));
        aVar.a(m.a(a.class));
        aVar.f4619f = new j(rVar, rVar2, rVar3, rVar4, rVar5);
        l0 l0Var = new l0();
        b.a<xa.c> b10 = ca.b.b(xa.c.class);
        b10.f4618e = 1;
        b10.f4619f = new ca.a(l0Var, 0);
        return Arrays.asList(new ca.b[]{aVar.b(), b10.b(), f.a("fire-auth", "22.1.2")});
    }
}
