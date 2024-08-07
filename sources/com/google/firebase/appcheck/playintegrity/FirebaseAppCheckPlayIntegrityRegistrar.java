package com.google.firebase.appcheck.playintegrity;

import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import m9.d;
import r9.c;
import ub.f;
import y9.a;

public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    public final List<b<?>> getComponents() {
        r rVar = new r(c.class, Executor.class);
        r rVar2 = new r(r9.b.class, Executor.class);
        b.a<z9.b> b10 = b.b(z9.b.class);
        b10.f4614a = "fire-app-check-play-integrity";
        b10.a(m.b(d.class));
        b10.a(new m((r<?>) rVar, 1, 0));
        b10.a(new m((r<?>) rVar2, 1, 0));
        b10.f4619f = new a(rVar, rVar2);
        return Arrays.asList(new b[]{b10.b(), f.a("fire-app-check-play-integrity", "17.1.1")});
    }
}
