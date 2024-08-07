package j9;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: Protobuf */
public final class w {

    /* renamed from: c  reason: collision with root package name */
    public static final w f11791c = new w();

    /* renamed from: a  reason: collision with root package name */
    public final k f11792a = new k();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f11793b = new ConcurrentHashMap();

    public final <T> c0<T> a(Class<T> cls) {
        c0<T> c0Var;
        a0 a0Var;
        Class<?> cls2;
        Charset charset = p.f7415a;
        if (cls != null) {
            c0<T> c0Var2 = (c0) this.f11793b.get(cls);
            if (c0Var2 != null) {
                return c0Var2;
            }
            k kVar = this.f11792a;
            kVar.getClass();
            Class<n> cls3 = n.class;
            Class<?> cls4 = d0.f7338a;
            if (cls3.isAssignableFrom(cls) || (cls2 = d0.f7338a) == null || cls2.isAssignableFrom(cls)) {
                o a10 = kVar.f11785a.a(cls);
                if (a10.a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        a0Var = new a0(d0.f7341d, f.f11764a, a10.b());
                    } else {
                        g0<?, ?> g0Var = d0.f7339b;
                        j<?> jVar = f.f11765b;
                        if (jVar != null) {
                            a0Var = new a0(g0Var, jVar, a10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    c0Var = a0Var;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z10 = false;
                    if (isAssignableFrom) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            c0Var = z.C(a10, t.f11790b, t.f7423b, d0.f7341d, f.f11764a, n.f11788b);
                        } else {
                            c0Var = z.C(a10, t.f11790b, t.f7423b, d0.f7341d, (j) null, n.f11788b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            r rVar = t.f11789a;
                            t.a aVar = t.f7422a;
                            g0<?, ?> g0Var2 = d0.f7339b;
                            j<?> jVar2 = f.f11765b;
                            if (jVar2 != null) {
                                c0Var = z.C(a10, rVar, aVar, g0Var2, jVar2, n.f11787a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            c0Var = z.C(a10, t.f11789a, t.f7422a, d0.f7340c, (j) null, n.f11787a);
                        }
                    }
                }
                c0<T> c0Var3 = (c0) this.f11793b.putIfAbsent(cls, c0Var);
                if (c0Var3 != null) {
                    return c0Var3;
                }
                return c0Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
