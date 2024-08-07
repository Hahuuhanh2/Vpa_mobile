package com.google.firebase.perf;

import androidx.annotation.Keep;
import c0.i0;
import c6.g;
import ca.b;
import ca.c;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import hb.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m9.d;
import m9.f;
import vb.h;
import xb.n;
import yb.a;
import yb.b;

@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    static {
        a aVar = a.f17628a;
        a.a(b.a.PERFORMANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hb.b lambda$getComponents$0(r rVar, c cVar) {
        return new hb.b((d) cVar.a(d.class), (n) cVar.a(n.class), cVar.c(f.class).get(), (Executor) cVar.d(rVar));
    }

    /* access modifiers changed from: private */
    public static hb.c providesFirebasePerformance(c cVar) {
        cVar.a(hb.b.class);
        kb.a aVar = new kb.a((d) cVar.a(d.class), (ab.c) cVar.a(ab.c.class), cVar.c(h.class), cVar.c(g.class));
        return (hb.c) ij.a.a(new e(new kb.c(aVar, 0), new kb.b(aVar, 1), new kb.d(aVar, 0), new kb.b(aVar, 2), new kb.c(aVar, 1), new kb.b(aVar, 0), new kb.d(aVar, 1))).get();
    }

    @Keep
    public List<ca.b<?>> getComponents() {
        Class<hb.b> cls = hb.b.class;
        Class<d> cls2 = d.class;
        r rVar = new r(r9.d.class, Executor.class);
        b.a<hb.c> b10 = ca.b.b(hb.c.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(cls2));
        b10.a(m.c(h.class));
        b10.a(m.b(ab.c.class));
        b10.a(m.c(g.class));
        b10.a(m.b(cls));
        b10.f4619f = new i0(5);
        b.a<hb.b> b11 = ca.b.b(cls);
        b11.f4614a = EARLY_LIBRARY_NAME;
        b11.a(m.b(cls2));
        b11.a(m.b(n.class));
        b11.a(m.a(f.class));
        b11.a(new m((r<?>) rVar, 1, 0));
        b11.c(2);
        b11.f4619f = new ea.c(rVar, 1);
        return Arrays.asList(new ca.b[]{b10.b(), b11.b(), ub.f.a(LIBRARY_NAME, "20.4.1")});
    }
}
