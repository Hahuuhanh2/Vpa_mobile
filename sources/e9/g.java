package e9;

import e9.i;
import i3.y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import z.d;

/* compiled from: HmacKey */
public final class g extends l {

    /* renamed from: b  reason: collision with root package name */
    public final i f9288b;

    /* renamed from: c  reason: collision with root package name */
    public final l9.a f9289c;

    /* compiled from: HmacKey */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public i f9290a = null;

        /* renamed from: b  reason: collision with root package name */
        public d f9291b = null;

        /* renamed from: c  reason: collision with root package name */
        public Integer f9292c = null;

        public final g a() {
            d dVar;
            boolean z10;
            boolean z11;
            l9.a aVar;
            i iVar = this.f9290a;
            if (iVar == null || (dVar = this.f9291b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (iVar.f9295c == dVar.g()) {
                i.c cVar = this.f9290a.f9297e;
                i.c cVar2 = i.c.f9312e;
                if (cVar != cVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || this.f9292c != null) {
                    if (cVar != cVar2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || this.f9292c == null) {
                        if (cVar == cVar2) {
                            aVar = l9.a.a(new byte[0]);
                        } else if (cVar == i.c.f9311d || cVar == i.c.f9310c) {
                            aVar = l9.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f9292c.intValue()).array());
                        } else if (cVar == i.c.f9309b) {
                            aVar = l9.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f9292c.intValue()).array());
                        } else {
                            StringBuilder q10 = android.support.v4.media.a.q("Unknown HmacParameters.Variant: ");
                            q10.append(this.f9290a.f9297e);
                            throw new IllegalStateException(q10.toString());
                        }
                        return new g(this.f9290a, aVar);
                    }
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else {
                throw new GeneralSecurityException("Key size mismatch");
            }
        }
    }

    public g(i iVar, l9.a aVar) {
        this.f9288b = iVar;
        this.f9289c = aVar;
    }

    public final l9.a J() {
        return this.f9289c;
    }

    public final y K() {
        return this.f9288b;
    }
}
