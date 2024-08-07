package e9;

import d9.g;
import d9.h;
import g9.b;
import i9.i0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import w8.n;
import w8.o;

/* compiled from: MacWrapper */
public final class m implements o<w8.m, w8.m> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f9318a = Logger.getLogger(m.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9319b = {0};

    /* renamed from: c  reason: collision with root package name */
    public static final m f9320c = new m();

    /* compiled from: MacWrapper */
    public static class a implements w8.m {

        /* renamed from: a  reason: collision with root package name */
        public final n<w8.m> f9321a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f9322b;

        /* renamed from: c  reason: collision with root package name */
        public final b.a f9323c;

        public a(n nVar) {
            this.f9321a = nVar;
            if (!nVar.f16731c.f10399a.isEmpty()) {
                b bVar = h.f8784b.f8786a.get();
                bVar = bVar == null ? h.f8785c : bVar;
                g.a(nVar);
                bVar.a();
                g.a aVar = g.f8783a;
                this.f9322b = aVar;
                bVar.a();
                this.f9323c = aVar;
                return;
            }
            g.a aVar2 = g.f8783a;
            this.f9322b = aVar2;
            this.f9323c = aVar2;
        }

        public final void a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (n.b next : this.f9321a.a(copyOf)) {
                    if (next.f16740e.equals(i0.LEGACY)) {
                        bArr3 = m9.b.n(bArr2, m.f9319b);
                    } else {
                        bArr3 = bArr2;
                    }
                    try {
                        ((w8.m) next.f16737b).a(copyOfRange, bArr3);
                        b.a aVar = this.f9323c;
                        int length = bArr3.length;
                        aVar.getClass();
                        return;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = m.f9318a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e10);
                    }
                }
                for (n.b bVar : this.f9321a.a(w8.b.f16712a)) {
                    try {
                        ((w8.m) bVar.f16737b).a(bArr, bArr2);
                        b.a aVar2 = this.f9323c;
                        int length2 = bArr2.length;
                        aVar2.getClass();
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                this.f9323c.getClass();
                throw new GeneralSecurityException("invalid MAC");
            }
            this.f9323c.getClass();
            throw new GeneralSecurityException("tag too short");
        }

        public final byte[] b(byte[] bArr) {
            if (this.f9321a.f16730b.f16740e.equals(i0.LEGACY)) {
                bArr = m9.b.n(bArr, m.f9319b);
            }
            try {
                byte[] n10 = m9.b.n(this.f9321a.f16730b.a(), ((w8.m) this.f9321a.f16730b.f16737b).b(bArr));
                b.a aVar = this.f9322b;
                int i10 = this.f9321a.f16730b.f16741f;
                int length = bArr.length;
                aVar.getClass();
                return n10;
            } catch (GeneralSecurityException e10) {
                this.f9322b.getClass();
                throw e10;
            }
        }
    }

    public final Class<w8.m> a() {
        return w8.m.class;
    }

    public final Class<w8.m> b() {
        return w8.m.class;
    }

    public final Object c(n nVar) {
        for (List<n.b<P>> it : nVar.f16729a.values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    n.b bVar = (n.b) it2.next();
                    androidx.fragment.app.o oVar = bVar.f16743h;
                    if (oVar instanceof l) {
                        l lVar = (l) oVar;
                        l9.a a10 = l9.a.a(bVar.a());
                        if (!a10.equals(lVar.J())) {
                            StringBuilder q10 = android.support.v4.media.a.q("Mac Key with parameters ");
                            q10.append(lVar.K());
                            q10.append(" has wrong output prefix (");
                            q10.append(lVar.J());
                            q10.append(") instead of (");
                            q10.append(a10);
                            q10.append(")");
                            throw new GeneralSecurityException(q10.toString());
                        }
                    }
                }
            }
        }
        return new a(nVar);
    }
}
