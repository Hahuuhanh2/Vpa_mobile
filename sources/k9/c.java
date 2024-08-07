package k9;

import a9.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import w8.a;
import y8.b;

/* compiled from: AesGcmJce */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final b f12072a;

    public c(byte[] bArr) {
        if (a.C0003a.f117b.b()) {
            this.f12072a = new b(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        byte[] a10 = n.a(12);
        b bVar = this.f12072a;
        bVar.getClass();
        if (a10.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        } else if (bArr.length <= 2147483619) {
            boolean z10 = bVar.f17621b;
            if (z10) {
                i10 = bArr.length + 12;
            } else {
                i10 = bArr.length;
            }
            byte[] bArr3 = new byte[(i10 + 16)];
            if (z10) {
                System.arraycopy(a10, 0, bArr3, 0, 12);
            }
            AlgorithmParameterSpec a11 = b.a(a10);
            b.a aVar = b.f17619c;
            ((Cipher) aVar.get()).init(1, bVar.f17620a, a11);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            if (bVar.f17621b) {
                i11 = 12;
            } else {
                i11 = 0;
            }
            int doFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, i11);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        } else {
            throw new GeneralSecurityException("plaintext too long");
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        b bVar = this.f12072a;
        bVar.getClass();
        if (copyOf.length == 12) {
            boolean z10 = bVar.f17621b;
            if (z10) {
                i10 = 28;
            } else {
                i10 = 16;
            }
            if (bArr.length >= i10) {
                int i12 = 0;
                if (!z10 || ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    AlgorithmParameterSpec a10 = b.a(copyOf);
                    b.a aVar = b.f17619c;
                    ((Cipher) aVar.get()).init(2, bVar.f17620a, a10);
                    if (!(bArr2 == null || bArr2.length == 0)) {
                        ((Cipher) aVar.get()).updateAAD(bArr2);
                    }
                    boolean z11 = bVar.f17621b;
                    if (z11) {
                        i12 = 12;
                    }
                    if (z11) {
                        i11 = bArr.length - 12;
                    } else {
                        i11 = bArr.length;
                    }
                    return ((Cipher) aVar.get()).doFinal(bArr, i12, i11);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
