package x8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import l9.a;
import x8.t;
import z.d;

/* compiled from: ChaCha20Poly1305Key */
public final class r extends b {
    public static r J(t.a aVar, d dVar, Integer num) {
        t.a aVar2 = t.a.f17152d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        } else if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (dVar.g() == 32) {
            if (aVar == aVar2) {
                a.a(new byte[0]);
            } else if (aVar == t.a.f17151c) {
                a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (aVar == t.a.f17150b) {
                a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: " + aVar);
            }
            return new r();
        } else {
            StringBuilder q10 = android.support.v4.media.a.q("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            q10.append(dVar.g());
            throw new GeneralSecurityException(q10.toString());
        }
    }
}
