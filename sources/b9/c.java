package b9;

import d9.g;
import d9.h;
import g9.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import w8.n;
import w8.o;

/* compiled from: DeterministicAeadWrapper */
public final class c implements o<w8.c, w8.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f4094a = Logger.getLogger(c.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final c f4095b = new c();

    /* compiled from: DeterministicAeadWrapper */
    public static class a implements w8.c {

        /* renamed from: a  reason: collision with root package name */
        public final n<w8.c> f4096a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f4097b;

        /* renamed from: c  reason: collision with root package name */
        public final b.a f4098c;

        public a(n<w8.c> nVar) {
            this.f4096a = nVar;
            if (!nVar.f16731c.f10399a.isEmpty()) {
                b bVar = h.f8784b.f8786a.get();
                bVar = bVar == null ? h.f8785c : bVar;
                g.a(nVar);
                bVar.a();
                g.a aVar = g.f8783a;
                this.f4097b = aVar;
                bVar.a();
                this.f4098c = aVar;
                return;
            }
            g.a aVar2 = g.f8783a;
            this.f4097b = aVar2;
            this.f4098c = aVar2;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] n10 = m9.b.n(this.f4096a.f16730b.a(), ((w8.c) this.f4096a.f16730b.f16737b).a(bArr, bArr2));
                b.a aVar = this.f4097b;
                int i10 = this.f4096a.f16730b.f16741f;
                int length = bArr.length;
                aVar.getClass();
                return n10;
            } catch (GeneralSecurityException e10) {
                this.f4097b.getClass();
                throw e10;
            }
        }

        public final byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (n.b bVar : this.f4096a.a(copyOf)) {
                    try {
                        byte[] b10 = ((w8.c) bVar.f16737b).b(copyOfRange, bArr2);
                        b.a aVar = this.f4098c;
                        int length = copyOfRange.length;
                        aVar.getClass();
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        Logger logger = c.f4094a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (n.b bVar2 : this.f4096a.a(w8.b.f16712a)) {
                try {
                    byte[] b11 = ((w8.c) bVar2.f16737b).b(bArr, bArr2);
                    this.f4098c.getClass();
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f4098c.getClass();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public final Class<w8.c> a() {
        return w8.c.class;
    }

    public final Class<w8.c> b() {
        return w8.c.class;
    }

    public final Object c(n nVar) {
        return new a(nVar);
    }
}
