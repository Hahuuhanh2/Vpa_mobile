package k9;

import a9.a;
import h9.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m9.b;

/* compiled from: PrfAesCmac */
public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f12098a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f12099b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f12100c;

    public k(byte[] bArr) {
        o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12098a = secretKeySpec;
        if (a.C0003a.f116a.b()) {
            Cipher a10 = h.f12092b.a("AES/ECB/NoPadding");
            a10.init(1, secretKeySpec);
            byte[] r10 = b.r(a10.doFinal(new byte[16]));
            this.f12099b = r10;
            this.f12100c = b.r(r10);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] a(int i10, byte[] bArr) {
        byte[] bArr2;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (a.C0003a.f116a.b()) {
            Cipher a10 = h.f12092b.a("AES/ECB/NoPadding");
            boolean z10 = true;
            a10.init(1, this.f12098a);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 != bArr.length) {
                z10 = false;
            }
            if (z10) {
                bArr2 = b.i0(bArr, (max - 1) * 16, this.f12099b, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    bArr2 = b.j0(copyOf, this.f12100c);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr3 = a10.doFinal(b.i0(bArr3, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(a10.doFinal(b.j0(bArr2, bArr3)), i10);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
