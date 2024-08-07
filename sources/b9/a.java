package b9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.p;
import i9.q;
import i9.y;
import j9.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.d;
import k9.n;
import k9.o;
import w8.c;

/* compiled from: AesSivKeyManager */
public final class a extends e<p> {

    /* renamed from: b9.a$a  reason: collision with other inner class name */
    /* compiled from: AesSivKeyManager */
    public class C0044a extends q<c, p> {
        public C0044a() {
            super(c.class);
        }

        public final Object a(x xVar) {
            return new d(((p) xVar).G().s());
        }
    }

    /* compiled from: AesSivKeyManager */
    public class b extends e.a<i9.q, p> {
        public b() {
            super(i9.q.class);
        }

        public final x a(x xVar) {
            p.a I = p.I();
            byte[] a10 = n.a(((i9.q) xVar).F());
            c.f l10 = j9.c.l(a10, 0, a10.length);
            I.o();
            p.F((p) I.f7405b, l10);
            a.this.getClass();
            I.o();
            p.E((p) I.f7405b);
            return (p) I.build();
        }

        public final Map<String, e.a.C0090a<i9.q>> b() {
            HashMap hashMap = new HashMap();
            q.a G = i9.q.G();
            G.o();
            i9.q.E((i9.q) G.f7405b);
            hashMap.put("AES256_SIV", new e.a.C0090a((i9.q) G.build(), 1));
            q.a G2 = i9.q.G();
            G2.o();
            i9.q.E((i9.q) G2.f7405b);
            hashMap.put("AES256_SIV_RAW", new e.a.C0090a((i9.q) G2.build(), 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(j9.c cVar) {
            return i9.q.H(cVar, i.a());
        }

        public final void d(x xVar) {
            i9.q qVar = (i9.q) xVar;
            if (qVar.F() != 64) {
                StringBuilder q10 = android.support.v4.media.a.q("invalid key size: ");
                q10.append(qVar.F());
                q10.append(". Valid keys must have ");
                q10.append(64);
                q10.append(" bytes.");
                throw new InvalidAlgorithmParameterException(q10.toString());
            }
        }
    }

    public a() {
        super(p.class, new C0044a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final e.a<i9.q, p> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(j9.c cVar) {
        return p.J(cVar, i.a());
    }

    public final void g(x xVar) {
        p pVar = (p) xVar;
        o.c(pVar.H());
        if (pVar.G().size() != 64) {
            StringBuilder q10 = android.support.v4.media.a.q("invalid key size: ");
            q10.append(pVar.G().size());
            q10.append(". Valid keys must have ");
            q10.append(64);
            q10.append(" bytes.");
            throw new InvalidKeyException(q10.toString());
        }
    }
}
