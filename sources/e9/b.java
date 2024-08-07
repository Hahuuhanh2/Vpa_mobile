package e9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.o;
import d9.q;
import i9.a;
import i9.b;
import i9.c;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.k;
import k9.n;
import kh.h;
import w8.m;

/* compiled from: AesCmacKeyManager */
public final class b extends e<i9.a> {

    /* renamed from: d  reason: collision with root package name */
    public static final o f9271d = new o(new h(19), a.class);

    /* compiled from: AesCmacKeyManager */
    public class a extends q<m, i9.a> {
        public a() {
            super(m.class);
        }

        public final Object a(x xVar) {
            i9.a aVar = (i9.a) xVar;
            return new k9.m(new k(aVar.H().s()), aVar.I().G());
        }
    }

    /* renamed from: e9.b$b  reason: collision with other inner class name */
    /* compiled from: AesCmacKeyManager */
    public class C0101b extends e.a<i9.b, i9.a> {
        public C0101b() {
            super(i9.b.class);
        }

        public final x a(x xVar) {
            i9.b bVar = (i9.b) xVar;
            a.C0125a K = i9.a.K();
            K.o();
            i9.a.E((i9.a) K.f7405b);
            byte[] a10 = n.a(bVar.G());
            c.f l10 = c.l(a10, 0, a10.length);
            K.o();
            i9.a.F((i9.a) K.f7405b, l10);
            i9.c H = bVar.H();
            K.o();
            i9.a.G((i9.a) K.f7405b, H);
            return (i9.a) K.build();
        }

        public final Map<String, e.a.C0090a<i9.b>> b() {
            HashMap hashMap = new HashMap();
            b.a I = i9.b.I();
            I.o();
            i9.b.E((i9.b) I.f7405b);
            c.a H = i9.c.H();
            H.o();
            i9.c.E((i9.c) H.f7405b);
            I.o();
            i9.b.F((i9.b) I.f7405b, (i9.c) H.build());
            hashMap.put("AES_CMAC", new e.a.C0090a((i9.b) I.build(), 1));
            b.a I2 = i9.b.I();
            I2.o();
            i9.b.E((i9.b) I2.f7405b);
            c.a H2 = i9.c.H();
            H2.o();
            i9.c.E((i9.c) H2.f7405b);
            I2.o();
            i9.b.F((i9.b) I2.f7405b, (i9.c) H2.build());
            hashMap.put("AES256_CMAC", new e.a.C0090a((i9.b) I2.build(), 1));
            b.a I3 = i9.b.I();
            I3.o();
            i9.b.E((i9.b) I3.f7405b);
            c.a H3 = i9.c.H();
            H3.o();
            i9.c.E((i9.c) H3.f7405b);
            I3.o();
            i9.b.F((i9.b) I3.f7405b, (i9.c) H3.build());
            hashMap.put("AES256_CMAC_RAW", new e.a.C0090a((i9.b) I3.build(), 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(j9.c cVar) {
            return i9.b.J(cVar, i.a());
        }

        public final void d(x xVar) {
            i9.b bVar = (i9.b) xVar;
            b.h(bVar.H());
            if (bVar.G() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public b() {
        super(i9.a.class, new a());
    }

    public static void h(i9.c cVar) {
        if (cVar.G() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.G() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final e.a<i9.b, i9.a> d() {
        return new C0101b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(j9.c cVar) {
        return i9.a.L(cVar, i.a());
    }

    public final void g(x xVar) {
        i9.a aVar = (i9.a) xVar;
        k9.o.c(aVar.J());
        if (aVar.H().size() == 32) {
            h(aVar.I());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
