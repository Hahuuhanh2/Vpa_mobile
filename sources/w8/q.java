package w8;

import android.support.v4.media.a;
import androidx.fragment.app.o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.i;
import d9.p;
import d9.r;
import i9.a0;
import i9.i0;
import i9.y;
import j$.util.concurrent.ConcurrentHashMap;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import v.v;
import w8.f;

/* compiled from: Registry */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<f> f16745a = new AtomicReference<>(new f());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f16746b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f16747c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f16748d = new ConcurrentHashMap();

    static {
        Logger.getLogger(q.class.getName());
        new ConcurrentHashMap();
    }

    public static synchronized <KeyProtoT extends x, KeyFormatProtoT extends x> void a(String str, Map<String, e.a.C0090a<KeyFormatProtoT>> map, boolean z10) {
        synchronized (q.class) {
            if (z10) {
                ConcurrentHashMap concurrentHashMap = f16747c;
                if (concurrentHashMap.containsKey(str)) {
                    if (!((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                }
            }
            if (z10) {
                if (f16745a.get().f16717a.containsKey(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f16748d.containsKey(next.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) next.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f16748d.containsKey(next2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) next2.getKey()));
                        }
                    }
                }
            }
        }
    }

    public static <KeyT extends o, P> P b(KeyT keyt, Class<P> cls) {
        r rVar = i.f8787b.f8788a.get();
        rVar.getClass();
        r.b bVar = new r.b(keyt.getClass(), cls);
        if (rVar.f8799a.containsKey(bVar)) {
            return ((p) rVar.f8799a.get(bVar)).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + bVar + " available");
    }

    public static <P> P c(String str, c cVar, Class<P> cls) {
        f fVar = f16745a.get();
        fVar.getClass();
        f.a a10 = fVar.a(str);
        if (a10.d().contains(cls)) {
            d a11 = a10.a(cls);
            a11.getClass();
            try {
                KeyProtoT f10 = a11.f16713a.f(cVar);
                if (!Void.class.equals(a11.f16714b)) {
                    a11.f16713a.g(f10);
                    return a11.f16713a.c(f10, a11.f16714b);
                }
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            } catch (InvalidProtocolBufferException e10) {
                StringBuilder q10 = a.q("Failures parsing proto of type ");
                q10.append(a11.f16713a.f8777a.getName());
                throw new GeneralSecurityException(q10.toString(), e10);
            }
        } else {
            StringBuilder q11 = a.q("Primitive type ");
            q11.append(cls.getName());
            q11.append(" not supported by key manager of type ");
            q11.append(a10.c());
            q11.append(", supported primitives: ");
            Set<Class<?>> d10 = a10.d();
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = true;
            for (Class next : d10) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(next.getCanonicalName());
                z10 = false;
            }
            q11.append(sb2.toString());
            throw new GeneralSecurityException(q11.toString());
        }
    }

    public static synchronized y d(a0 a0Var) {
        y b10;
        synchronized (q.class) {
            d b11 = f16745a.get().a(a0Var.J()).b();
            if (((Boolean) f16747c.get(a0Var.J())).booleanValue()) {
                b10 = b11.b(a0Var.K());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.J());
            }
        }
        return b10;
    }

    public static synchronized <KeyProtoT extends x> void e(e<KeyProtoT> eVar, boolean z10) {
        Map<String, e.a.C0090a<?>> map;
        synchronized (q.class) {
            AtomicReference<f> atomicReference = f16745a;
            f fVar = new f(atomicReference.get());
            fVar.b(eVar);
            String b10 = eVar.b();
            if (z10) {
                map = eVar.d().b();
            } else {
                map = Collections.emptyMap();
            }
            a(b10, map, z10);
            if (!atomicReference.get().f16717a.containsKey(b10)) {
                f16746b.put(b10, new p());
                if (z10) {
                    f(b10, eVar.d().b());
                }
            }
            f16747c.put(b10, Boolean.valueOf(z10));
            atomicReference.set(fVar);
        }
    }

    public static <KeyFormatProtoT extends x> void f(String str, Map<String, e.a.C0090a<KeyFormatProtoT>> map) {
        i0 i0Var;
        for (Map.Entry next : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f16748d;
            String str2 = (String) next.getKey();
            byte[] k10 = ((x) ((e.a.C0090a) next.getValue()).f8781a).k();
            int i10 = ((e.a.C0090a) next.getValue()).f8782b;
            a0.a L = a0.L();
            L.o();
            a0.E((a0) L.f7405b, str);
            c.f fVar = c.f11735b;
            c.f l10 = c.l(k10, 0, k10.length);
            L.o();
            a0.F((a0) L.f7405b, l10);
            int g2 = v.g(i10);
            if (g2 == 0) {
                i0Var = i0.TINK;
            } else if (g2 == 1) {
                i0Var = i0.LEGACY;
            } else if (g2 == 2) {
                i0Var = i0.RAW;
            } else if (g2 == 3) {
                i0Var = i0.CRUNCHY;
            } else {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            L.o();
            a0.G((a0) L.f7405b, i0Var);
            concurrentHashMap.put(str2, new h((a0) L.build()));
        }
    }

    public static synchronized <B, P> void g(o<B, P> oVar) {
        synchronized (q.class) {
            i iVar = i.f8787b;
            synchronized (iVar) {
                r.a aVar = new r.a(iVar.f8788a.get());
                aVar.b(oVar);
                iVar.f8788a.set(new r(aVar));
            }
        }
    }
}
