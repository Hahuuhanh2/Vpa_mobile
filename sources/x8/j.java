package x8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import x8.l;
import z.d;

/* compiled from: AesGcmKey */
public final class j extends b {

    /* compiled from: AesGcmKey */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public l f17119a = null;

        /* renamed from: b  reason: collision with root package name */
        public d f17120b = null;

        /* renamed from: c  reason: collision with root package name */
        public Integer f17121c = null;

        public final j a() {
            d dVar;
            boolean z10;
            boolean z11;
            l lVar = this.f17119a;
            if (lVar == null || (dVar = this.f17120b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (lVar.f17123c == dVar.g()) {
                l.a aVar = this.f17119a.f17126f;
                l.a aVar2 = l.a.f17129d;
                if (aVar != aVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || this.f17121c != null) {
                    if (aVar != aVar2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || this.f17121c == null) {
                        if (aVar == aVar2) {
                            l9.a.a(new byte[0]);
                        } else if (aVar == l.a.f17128c) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17121c.intValue()).array());
                        } else if (aVar == l.a.f17127b) {
                            l9.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17121c.intValue()).array());
                        } else {
                            StringBuilder q10 = android.support.v4.media.a.q("Unknown AesGcmParameters.Variant: ");
                            q10.append(this.f17119a.f17126f);
                            throw new IllegalStateException(q10.toString());
                        }
                        return new j();
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
