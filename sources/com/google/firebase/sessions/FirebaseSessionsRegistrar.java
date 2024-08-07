package com.google.firebase.sessions;

import ab.c;
import al.a0;
import androidx.annotation.Keep;
import c0.i0;
import c6.g;
import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import m9.d;
import r9.b;
import sk.j;
import ub.f;
import xb.n;

@Keep
/* compiled from: FirebaseSessionsRegistrar.kt */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    public static final a Companion = new a();
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final r<a0> backgroundDispatcher;
    private static final r<a0> blockingDispatcher;
    private static final r<d> firebaseApp = r.a(d.class);
    private static final r<c> firebaseInstallationsApi = r.a(c.class);
    private static final r<g> transportFactory = r.a(g.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    public static final class a {
    }

    static {
        Class<a0> cls = a0.class;
        backgroundDispatcher = new r<>(r9.a.class, cls);
        blockingDispatcher = new r<>(b.class, cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final n m10getComponents$lambda0(ca.c cVar) {
        Object d10 = cVar.d(firebaseApp);
        j.e(d10, "container.get(firebaseApp)");
        Object d11 = cVar.d(firebaseInstallationsApi);
        j.e(d11, "container.get(firebaseInstallationsApi)");
        Object d12 = cVar.d(backgroundDispatcher);
        j.e(d12, "container.get(backgroundDispatcher)");
        Object d13 = cVar.d(blockingDispatcher);
        j.e(d13, "container.get(blockingDispatcher)");
        za.b<g> b10 = cVar.b(transportFactory);
        j.e(b10, "container.getProvider(transportFactory)");
        return new n((d) d10, (c) d11, (a0) d12, (a0) d13, b10);
    }

    public List<ca.b<? extends Object>> getComponents() {
        b.a<n> b10 = ca.b.b(n.class);
        b10.f4614a = LIBRARY_NAME;
        b10.a(new m((r<?>) firebaseApp, 1, 0));
        b10.a(new m((r<?>) firebaseInstallationsApi, 1, 0));
        b10.a(new m((r<?>) backgroundDispatcher, 1, 0));
        b10.a(new m((r<?>) blockingDispatcher, 1, 0));
        b10.a(new m((r<?>) transportFactory, 1, 1));
        b10.f4619f = new i0(6);
        return j7.a.d0(b10.b(), f.a(LIBRARY_NAME, "1.0.2"));
    }
}
