package x8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import x8.h;
import z.d;

/* compiled from: AesEaxKey */
public final class f extends b {

    /* compiled from: AesEaxKey */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public h f17103a = null;

        /* renamed from: b  reason: collision with root package name */
        public d f17104b = null;

        /* renamed from: c  reason: collision with root package name */
        public Integer f17105c = null;

        public final f a() {
            d dVar;
            boolean z10;
            boolean z11;
            h hVar = this.f17103a;
            if (hVar == null || (dVar = this.f17104b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (hVar.f17107c == dVar.g()) {
                h.a aVar = this.f17103a.f17110f;
                h.a aVar2 = h.a.f17113d;
                if (aVar != aVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || this.f17105c != null) {
                    if (aVar != aVar2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || this.f17105c == null) {
                        if (aVar == aVar2) {
                            l9.a.a(new byte[0]);
                        } else if (aVar == h.a.f17112c) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17105c.intValue()).array());
                        } else if (aVar == h.a.f17111b) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17105c.intValue()).array());
                        } else {
                            StringBuilder q10 = android.support.v4.media.a.q("Unknown AesEaxParameters.Variant: ");
                            q10.append(this.f17103a.f17110f);
                            throw new IllegalStateException(q10.toString());
                        }
                        return new f();
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
