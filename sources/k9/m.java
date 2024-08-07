package k9;

import h9.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* compiled from: PrfMac */
public final class m implements w8.m {

    /* renamed from: a  reason: collision with root package name */
    public final a f12106a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12107b;

    public m(a aVar, int i10) {
        this.f12106a = aVar;
        this.f12107b = i10;
        if (i10 >= 10) {
            aVar.a(i10, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] b(byte[] bArr) {
        return this.f12106a.a(this.f12107b, bArr);
    }
}
