package x8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import x8.p;
import z.d;

/* compiled from: AesGcmSivKey */
public final class n extends b {

    /* compiled from: AesGcmSivKey */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public p f17135a = null;

        /* renamed from: b  reason: collision with root package name */
        public d f17136b = null;

        /* renamed from: c  reason: collision with root package name */
        public Integer f17137c = null;

        public final n a() {
            d dVar;
            boolean z10;
            boolean z11;
            p pVar = this.f17135a;
            if (pVar == null || (dVar = this.f17136b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (pVar.f17139c == dVar.g()) {
                p.a aVar = this.f17135a.f17140d;
                p.a aVar2 = p.a.f17143d;
                if (aVar != aVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || this.f17137c != null) {
                    if (aVar != aVar2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || this.f17137c == null) {
                        if (aVar == aVar2) {
                            l9.a.a(new byte[0]);
                        } else if (aVar == p.a.f17142c) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17137c.intValue()).array());
                        } else if (aVar == p.a.f17141b) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17137c.intValue()).array());
                        } else {
                            StringBuilder q10 = android.support.v4.media.a.q("Unknown AesGcmSivParameters.Variant: ");
                            q10.append(this.f17135a.f17140d);
                            throw new IllegalStateException(q10.toString());
                        }
                        return new n();
                    }
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else {
                throw new GeneralSecurityException("Key size mismatch");
            }
        }
    }
}
