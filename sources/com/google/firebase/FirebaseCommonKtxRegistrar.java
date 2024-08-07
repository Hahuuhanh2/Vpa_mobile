package com.google.firebase;

import al.a0;
import androidx.annotation.Keep;
import ca.b;
import ca.f;
import ca.m;
import ca.r;
import ca.s;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p3.l0;
import sk.j;

@Keep
/* compiled from: Firebase.kt */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f7449a = new a<>();

        public final Object k(s sVar) {
            Object d10 = sVar.d(new r(r9.a.class, Executor.class));
            j.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return l0.U((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f7450a = new b<>();

        public final Object k(s sVar) {
            Object d10 = sVar.d(new r(r9.c.class, Executor.class));
            j.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return l0.U((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f7451a = new c<>();

        public final Object k(s sVar) {
            Object d10 = sVar.d(new r(r9.b.class, Executor.class));
            j.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return l0.U((Executor) d10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f7452a = new d<>();

        public final Object k(s sVar) {
            Object d10 = sVar.d(new r(r9.d.class, Executor.class));
            j.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return l0.U((Executor) d10);
        }
    }

    public List<ca.b<?>> getComponents() {
        Class<a0> cls = a0.class;
        b.a a10 = ca.b.a(new r(r9.a.class, cls));
        a10.a(new m((r<?>) new r(r9.a.class, Executor.class), 1, 0));
        a10.f4619f = a.f7449a;
        b.a a11 = ca.b.a(new r(r9.c.class, cls));
        a11.a(new m((r<?>) new r(r9.c.class, Executor.class), 1, 0));
        a11.f4619f = b.f7450a;
        b.a a12 = ca.b.a(new r(r9.b.class, cls));
        a12.a(new m((r<?>) new r(r9.b.class, Executor.class), 1, 0));
        a12.f4619f = c.f7451a;
        b.a a13 = ca.b.a(new r(r9.d.class, cls));
        a13.a(new m((r<?>) new r(r9.d.class, Executor.class), 1, 0));
        a13.f4619f = d.f7452a;
        return j7.a.d0(a10.b(), a11.b(), a12.b(), a13.b());
    }
}
