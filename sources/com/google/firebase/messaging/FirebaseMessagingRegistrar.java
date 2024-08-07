package com.google.firebase.messaging;

import androidx.annotation.Keep;
import c0.i0;
import ca.b;
import ca.c;
import ca.m;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.d;
import ub.f;
import ub.g;
import xa.e;
import ya.a;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        return new FirebaseMessaging((d) cVar.a(d.class), (a) cVar.a(a.class), cVar.c(g.class), cVar.c(e.class), (ab.c) cVar.a(ab.c.class), (c6.g) cVar.a(c6.g.class), (wa.d) cVar.a(wa.d.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b.a<FirebaseMessaging> b10 = b.b(FirebaseMessaging.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(m.b(d.class));
        b10.a(new m(0, 0, a.class));
        b10.a(m.a(g.class));
        b10.a(m.a(e.class));
        b10.a(new m(0, 0, c6.g.class));
        b10.a(m.b(ab.c.class));
        b10.a(m.b(wa.d.class));
        b10.f4619f = new i0(4);
        b10.c(1);
        return Arrays.asList(new b[]{b10.b(), f.a(LIBRARY_NAME, "23.2.1")});
    }
}
