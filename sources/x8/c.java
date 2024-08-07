package x8;

import d9.g;
import d9.h;
import g9.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import w8.n;
import w8.o;

/* compiled from: AeadWrapper */
public final class c implements o<w8.a, w8.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f17096a = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final c f17097b = new c();

    /* compiled from: AeadWrapper */
    public static class a implements w8.a {

        /* renamed from: a  reason: collision with root package name */
        public final n<w8.a> f17098a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f17099b;

        /* renamed from: c  reason: collision with root package name */
        public final b.a f17100c;

        public a(n nVar) {
            this.f17098a = nVar;
            if (!nVar.f16731c.f10399a.isEmpty()) {
                b bVar = h.f8784b.f8786a.get();
                bVar = bVar == null ? h.f8785c : bVar;
                g.a(nVar);
                bVar.a();
                g.a aVar = g.f8783a;
                this.f17099b = aVar;
                bVar.a();
                this.f17100c = aVar;
                return;
            }
            g.a aVar2 = g.f8783a;
            this.f17099b = aVar2;
            this.f17100c = aVar2;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] n10 = m9.b.n(this.f17098a.f16730b.a(), ((w8.a) this.f17098a.f16730b.f16737b).a(bArr, bArr2));
                b.a aVar = this.f17099b;
                int i10 = this.f17098a.f16730b.f16741f;
                int length = bArr.length;
                aVar.getClass();
                return n10;
            } catch (GeneralSecurityException e10) {
                this.f17099b.getClass();
                throw e10;
            }
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (n.b bVar : this.f17098a.a(copyOf)) {
                    try {
                        byte[] b10 = ((w8.a) bVar.f16737b).b(copyOfRange, bArr2);
                        b.a aVar = this.f17100c;
                        int length = copyOfRange.length;
                        aVar.getClass();
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = c.f17096a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (n.b bVar2 : this.f17098a.a(w8.b.f16712a)) {
                try {
                    byte[] b11 = ((w8.a) bVar2.f16737b).b(bArr, bArr2);
                    this.f17100c.getClass();
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f17100c.getClass();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public final Class<w8.a> a() {
        return w8.a.class;
    }

    public final Class<w8.a> b() {
        return w8.a.class;
    }

    public final Object c(n nVar) {
        return new a(nVar);
    }
}
