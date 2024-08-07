package j2;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.t;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: Protobuf */
public final class s {

    /* renamed from: c  reason: collision with root package name */
    public static final s f11516c = new s();

    /* renamed from: a  reason: collision with root package name */
    public final j f11517a = new j();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f11518b = new ConcurrentHashMap();

    public final <T> u<T> a(Class<T> cls) {
        u<T> uVar;
        c0 c0Var;
        Class<?> cls2;
        Charset charset = p.f2318a;
        if (cls != null) {
            u<T> uVar2 = (u) this.f11518b.get(cls);
            if (uVar2 != null) {
                return uVar2;
            }
            j jVar = this.f11517a;
            jVar.getClass();
            Class<n> cls3 = n.class;
            Class<?> cls4 = g0.f2265a;
            if (cls3.isAssignableFrom(cls) || (cls2 = g0.f2265a) == null || cls2.isAssignableFrom(cls)) {
                l a10 = jVar.f11510a.a(cls);
                if (a10.a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        c0Var = new c0(g0.f2268d, e.f11489a, a10.b());
                    } else {
                        j0<?, ?> j0Var = g0.f2266b;
                        j<?> jVar2 = e.f11490b;
                        if (jVar2 != null) {
                            c0Var = new c0(j0Var, jVar2, a10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    uVar = c0Var;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z10 = false;
                    if (isAssignableFrom) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            uVar = b0.x(a10, p.f11515b, t.f2326b, g0.f2268d, e.f11489a, k.f11513b);
                        } else {
                            uVar = b0.x(a10, p.f11515b, t.f2326b, g0.f2268d, (j) null, k.f11513b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            o oVar = p.f11514a;
                            t.a aVar = t.f2325a;
                            j0<?, ?> j0Var2 = g0.f2266b;
                            j<?> jVar3 = e.f11490b;
                            if (jVar3 != null) {
                                uVar = b0.x(a10, oVar, aVar, j0Var2, jVar3, k.f11512a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            uVar = b0.x(a10, p.f11514a, t.f2325a, g0.f2267c, (j) null, k.f11512a);
                        }
                    }
                }
                u<T> uVar3 = (u) this.f11518b.putIfAbsent(cls, uVar);
                if (uVar3 != null) {
                    return uVar3;
                }
                return uVar;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
