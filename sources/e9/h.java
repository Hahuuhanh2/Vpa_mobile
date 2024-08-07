package e9;

import a9.a;
import c0.i0;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.o;
import d9.q;
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
import javax.crypto.spec.SecretKeySpec;
import k9.l;
import k9.n;
import w8.m;

/* compiled from: HmacKeyManager */
public final class h extends e<v> {

    /* renamed from: d  reason: collision with root package name */
    public static final o f9293d = new o(new i0(17), g.class);

    /* compiled from: HmacKeyManager */
    public class a extends q<m, v> {
        public a() {
            super(m.class);
        }

        public final Object a(x xVar) {
            v vVar = (v) xVar;
            u H = vVar.J().H();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.I().s(), "HMAC");
            int I = vVar.J().I();
            int ordinal = H.ordinal();
            if (ordinal == 1) {
                return new k9.m(new l("HMACSHA1", secretKeySpec), I);
            }
            if (ordinal == 2) {
                return new k9.m(new l("HMACSHA384", secretKeySpec), I);
            }
            if (ordinal == 3) {
                return new k9.m(new l("HMACSHA256", secretKeySpec), I);
            }
            if (ordinal == 4) {
                return new k9.m(new l("HMACSHA512", secretKeySpec), I);
            }
            if (ordinal == 5) {
                return new k9.m(new l("HMACSHA224", secretKeySpec), I);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* compiled from: HmacKeyManager */
    public class b extends e.a<w, v> {
        public b() {
            super(w.class);
        }

        public final x a(x xVar) {
            w wVar = (w) xVar;
            v.a L = v.L();
            h.this.getClass();
            L.o();
            v.E((v) L.f7405b);
            i9.x I = wVar.I();
            L.o();
            v.F((v) L.f7405b, I);
            byte[] a10 = n.a(wVar.H());
            c.f l10 = c.l(a10, 0, a10.length);
            L.o();
            v.G((v) L.f7405b, l10);
            return (v) L.build();
        }

        public final Map<String, e.a.C0090a<w>> b() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            hashMap.put("HMAC_SHA256_128BITTAG", h.h(32, 16, uVar, 1));
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", h.h(32, 16, uVar, 3));
            hashMap.put("HMAC_SHA256_256BITTAG", h.h(32, 32, uVar, 1));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", h.h(32, 32, uVar, 3));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", h.h(64, 16, uVar2, 1));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", h.h(64, 16, uVar2, 3));
            hashMap.put("HMAC_SHA512_256BITTAG", h.h(64, 32, uVar2, 1));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", h.h(64, 32, uVar2, 3));
            hashMap.put("HMAC_SHA512_512BITTAG", h.h(64, 64, uVar2, 1));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", h.h(64, 64, uVar2, 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return w.K(cVar, i.a());
        }

        public final void d(x xVar) {
            w wVar = (w) xVar;
            if (wVar.H() >= 16) {
                h.j(wVar.I());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    public h() {
        super(v.class, new a());
    }

    public static e.a.C0090a h(int i10, int i11, u uVar, int i12) {
        w.a J = w.J();
        x.a J2 = i9.x.J();
        J2.o();
        i9.x.E((i9.x) J2.f7405b, uVar);
        J2.o();
        i9.x.F((i9.x) J2.f7405b, i11);
        J.o();
        w.E((w) J.f7405b, (i9.x) J2.build());
        J.o();
        w.F((w) J.f7405b, i10);
        return new e.a.C0090a((w) J.build(), i12);
    }

    public static void i(v vVar) {
        k9.o.c(vVar.K());
        if (vVar.I().size() >= 16) {
            j(vVar.J());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static void j(i9.x xVar) {
        if (xVar.I() >= 10) {
            int ordinal = xVar.H().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (xVar.I() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (xVar.I() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (xVar.I() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.I() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.I() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final a.C0003a a() {
        return a.C0003a.f117b;
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final e.a<w, v> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final com.google.crypto.tink.shaded.protobuf.x f(c cVar) {
        return v.M(cVar, i.a());
    }

    public final /* bridge */ /* synthetic */ void g(com.google.crypto.tink.shaded.protobuf.x xVar) {
        i((v) xVar);
    }
}
