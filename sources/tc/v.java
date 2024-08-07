package tc;

import com.google.protobuf.c0;
import com.google.protobuf.f;
import com.google.protobuf.i;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.w;
import com.google.protobuf.x;
import com.google.protobuf.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: Protobuf */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f15013c = new v();

    /* renamed from: a  reason: collision with root package name */
    public final l f15014a = new l();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f15015b = new ConcurrentHashMap();

    public final <T> x<T> a(Class<T> cls) {
        x<T> xVar;
        x xVar2;
        Class<?> cls2;
        Charset charset = k.f7917a;
        if (cls != null) {
            x<T> xVar3 = (x) this.f15015b.get(cls);
            if (xVar3 != null) {
                return xVar3;
            }
            l lVar = this.f15014a;
            lVar.getClass();
            Class<i> cls3 = i.class;
            Class<?> cls4 = z.f7961a;
            if (cls3.isAssignableFrom(cls) || (cls2 = z.f7961a) == null || cls2.isAssignableFrom(cls)) {
                n a10 = lVar.f15007a.a(cls);
                if (a10.a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        xVar2 = new x(z.f7964d, f.f14986a, a10.b());
                    } else {
                        c0<?, ?> c0Var = z.f7962b;
                        f<?> fVar = f.f14987b;
                        if (fVar != null) {
                            xVar2 = new x(c0Var, fVar, a10.b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    xVar = xVar2;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z10 = false;
                    if (isAssignableFrom) {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            xVar = w.u(a10, s.f15012b, o.f7925b, z.f7964d, f.f14986a, m.f15010b);
                        } else {
                            xVar = w.u(a10, s.f15012b, o.f7925b, z.f7964d, (f) null, m.f15010b);
                        }
                    } else {
                        if (a10.c() == 1) {
                            z10 = true;
                        }
                        if (z10) {
                            q qVar = s.f15011a;
                            o.a aVar = o.f7924a;
                            c0<?, ?> c0Var2 = z.f7962b;
                            f<?> fVar2 = f.f14987b;
                            if (fVar2 != null) {
                                xVar = w.u(a10, qVar, aVar, c0Var2, fVar2, m.f15009a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            xVar = w.u(a10, s.f15011a, o.f7924a, z.f7963c, (f) null, m.f15009a);
                        }
                    }
                }
                x<T> xVar4 = (x) this.f15015b.putIfAbsent(cls, xVar);
                if (xVar4 != null) {
                    return xVar4;
                }
                return xVar;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
