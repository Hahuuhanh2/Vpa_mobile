package e9;

import e9.c;
import i3.y;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import z.d;

/* compiled from: AesCmacKey */
public final class a extends l {

    /* renamed from: b  reason: collision with root package name */
    public final c f9266b;

    /* renamed from: c  reason: collision with root package name */
    public final l9.a f9267c;

    /* renamed from: e9.a$a  reason: collision with other inner class name */
    /* compiled from: AesCmacKey */
    public static class C0100a {

        /* renamed from: a  reason: collision with root package name */
        public c f9268a = null;

        /* renamed from: b  reason: collision with root package name */
        public d f9269b = null;

        /* renamed from: c  reason: collision with root package name */
        public Integer f9270c = null;

        public final a a() {
            d dVar;
            boolean z10;
            boolean z11;
            l9.a aVar;
            c cVar = this.f9268a;
            if (cVar == null || (dVar = this.f9269b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (cVar.f9272c == dVar.g()) {
                c.b bVar = this.f9268a.f9274e;
                c.b bVar2 = c.b.f9281e;
                if (bVar != bVar2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || this.f9270c != null) {
                    if (bVar != bVar2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || this.f9270c == null) {
                        if (bVar == bVar2) {
                            aVar = l9.a.a(new byte[0]);
                        } else if (bVar == c.b.f9280d || bVar == c.b.f9279c) {
                            aVar = l9.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f9270c.intValue()).array());
                        } else if (bVar == c.b.f9278b) {
                            aVar = l9.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f9270c.intValue()).array());
                        } else {
                            StringBuilder q10 = android.support.v4.media.a.q("Unknown AesCmacParametersParameters.Variant: ");
                            q10.append(this.f9268a.f9274e);
                            throw new IllegalStateException(q10.toString());
                        }
                        return new a(this.f9268a, aVar);
                    }
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else {
                throw new GeneralSecurityException("Key size mismatch");
            }
        }
    }

    public a(c cVar, l9.a aVar) {
        this.f9266b = cVar;
        this.f9267c = aVar;
    }

    public final l9.a J() {
        return this.f9267c;
    }

    public final y K() {
        return this.f9266b;
    }
}
