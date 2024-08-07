package x8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import l9.a;
import x8.a0;
import z.d;

/* compiled from: XChaCha20Poly1305Key */
public final class y extends b {
    public static y J(a0.a aVar, d dVar, Integer num) {
        a0.a aVar2 = a0.a.f17090d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        } else if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (dVar.g() == 32) {
            if (aVar == aVar2) {
                a.a(new byte[0]);
            } else if (aVar == a0.a.f17089c) {
                a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (aVar == a0.a.f17088b) {
                a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: " + aVar);
            }
            return new y();
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            q10.append(dVar.g());
            throw new GeneralSecurityException(q10.toString());
        }
    }
}
