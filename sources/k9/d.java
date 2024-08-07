package k9;

import a9.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m9.b;
import v.v;
import w8.c;

/* compiled from: AesSiv */
public final class d implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final List f12073c = Arrays.asList(new Integer[]{64});

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f12074d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f12075e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public final k f12076a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12077b;

    public d(byte[] bArr) {
        if (!a.C0003a.f116a.b()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        } else if (f12073c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f12077b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f12076a = new k(copyOfRange);
        } else {
            throw new InvalidKeyException(v.e(android.support.v4.media.a.q("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a10 = h.f12092b.a("AES/CTR/NoPadding");
            byte[] c10 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c10.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(1, new SecretKeySpec(this.f12077b, "AES"), new IvParameterSpec(bArr3));
            return b.n(c10, a10.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a10 = h.f12092b.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a10.init(2, new SecretKeySpec(this.f12077b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a10.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && b.F()) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] bArr2;
        if (bArr.length == 0) {
            return this.f12076a.a(16, f12075e);
        }
        byte[] a10 = this.f12076a.a(16, f12074d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr3 = bArr[i10];
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            a10 = b.j0(b.r(a10), this.f12076a.a(16, bArr3));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            if (bArr4.length >= a10.length) {
                int length = bArr4.length - a10.length;
                bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                for (int i11 = 0; i11 < a10.length; i11++) {
                    int i12 = length + i11;
                    bArr2[i12] = (byte) (bArr2[i12] ^ a10[i11]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr4.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr4, 16);
            copyOf[bArr4.length] = Byte.MIN_VALUE;
            bArr2 = b.j0(copyOf, b.r(a10));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return this.f12076a.a(16, bArr2);
    }
}
