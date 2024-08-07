package x8;

import a9.a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import e9.h;
import i9.d;
import i9.e;
import i9.f;
import i9.g;
import i9.h;
import i9.u;
import i9.v;
import i9.w;
import i9.x;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.g;
import k9.j;
import k9.n;
import k9.o;
import w8.m;

/* compiled from: AesCtrHmacAeadKeyManager */
public final class d extends e<i9.d> {

    /* compiled from: AesCtrHmacAeadKeyManager */
    public class a extends q<w8.a, i9.d> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            i9.d dVar = (i9.d) xVar;
            return new g((j) new e().c(dVar.H(), j.class), (m) new h().c(dVar.I(), m.class), dVar.I().J().I());
        }
    }

    /* compiled from: AesCtrHmacAeadKeyManager */
    public class b extends e.a<i9.e, i9.d> {
        public b() {
            super(i9.e.class);
        }

        public final x a(x xVar) {
            i9.e eVar = (i9.e) xVar;
            new e();
            i9.g G = eVar.G();
            f.a L = f.L();
            i9.h I = G.I();
            L.o();
            f.F((f) L.f7405b, I);
            byte[] a10 = n.a(G.H());
            c.f l10 = c.l(a10, 0, a10.length);
            L.o();
            f.G((f) L.f7405b, l10);
            L.o();
            f.E((f) L.f7405b);
            new h();
            w H = eVar.H();
            v.a L2 = v.L();
            L2.o();
            v.E((v) L2.f7405b);
            i9.x I2 = H.I();
            L2.o();
            v.F((v) L2.f7405b, I2);
            byte[] a11 = n.a(H.H());
            c.f l11 = c.l(a11, 0, a11.length);
            L2.o();
            v.G((v) L2.f7405b, l11);
            d.a K = i9.d.K();
            K.o();
            i9.d.F((i9.d) K.f7405b, (f) L.build());
            K.o();
            i9.d.G((i9.d) K.f7405b, (v) L2.build());
            d.this.getClass();
            K.o();
            i9.d.E((i9.d) K.f7405b);
            return (i9.d) K.build();
        }

        public final Map<String, e.a.C0090a<i9.e>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", d.h(16, 16, 1));
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", d.h(16, 16, 3));
            hashMap.put("AES256_CTR_HMAC_SHA256", d.h(32, 32, 1));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", d.h(32, 32, 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return i9.e.J(cVar, i.a());
        }

        public final void d(x xVar) {
            i9.e eVar = (i9.e) xVar;
            new e();
            i9.g G = eVar.G();
            o.a(G.H());
            i9.h I = G.I();
            if (I.G() < 12 || I.G() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            new h();
            w H = eVar.H();
            if (H.H() >= 16) {
                h.j(H.I());
                o.a(eVar.G().H());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    public d() {
        super(i9.d.class, new a());
    }

    public static e.a.C0090a h(int i10, int i11, int i12) {
        u uVar = u.SHA256;
        g.a J = i9.g.J();
        h.a H = i9.h.H();
        H.o();
        i9.h.E((i9.h) H.f7405b);
        J.o();
        i9.g.E((i9.g) J.f7405b, (i9.h) H.build());
        J.o();
        i9.g.F((i9.g) J.f7405b, i10);
        w.a J2 = w.J();
        x.a J3 = i9.x.J();
        J3.o();
        i9.x.E((i9.x) J3.f7405b, uVar);
        J3.o();
        i9.x.F((i9.x) J3.f7405b, i11);
        J2.o();
        w.E((w) J2.f7405b, (i9.x) J3.build());
        J2.o();
        w.F((w) J2.f7405b, 32);
        e.a I = i9.e.I();
        I.o();
        i9.e.E((i9.e) I.f7405b, (i9.g) J.build());
        I.o();
        i9.e.F((i9.e) I.f7405b, (w) J2.build());
        return new e.a.C0090a((i9.e) I.build(), i12);
    }

    public final a.C0003a a() {
        return a.C0003a.f117b;
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final e.a<i9.e, i9.d> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final com.google.crypto.tink.shaded.protobuf.x f(c cVar) {
        return i9.d.L(cVar, i.a());
    }

    public final void g(com.google.crypto.tink.shaded.protobuf.x xVar) {
        i9.d dVar = (i9.d) xVar;
        o.c(dVar.J());
        new e();
        f H = dVar.H();
        o.c(H.K());
        o.a(H.I().size());
        i9.h J = H.J();
        if (J.G() < 12 || J.G() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
        new e9.h();
        e9.h.i(dVar.I());
    }
}
