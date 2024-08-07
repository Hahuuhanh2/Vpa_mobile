package k9;

import a9.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesEaxJce */
public final class b implements w8.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f12066e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final C0137b f12067f = new C0137b();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12068a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12069b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f12070c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12071d;

    /* compiled from: AesEaxJce */
    public class a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return h.f12092b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: k9.b$b  reason: collision with other inner class name */
    /* compiled from: AesEaxJce */
    public class C0137b extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return h.f12092b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10) {
        if (!a.C0003a.f116a.b()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i10 == 12 || i10 == 16) {
            this.f12071d = i10;
            o.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f12070c = secretKeySpec;
            Cipher cipher = (Cipher) f12066e.get();
            cipher.init(1, secretKeySpec);
            byte[] c10 = c(cipher.doFinal(new byte[16]));
            this.f12068a = c10;
            this.f12069b = c(c10);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        int i10 = this.f12071d;
        if (length <= (Integer.MAX_VALUE - i10) - 16) {
            byte[] bArr5 = new byte[(bArr4.length + i10 + 16)];
            byte[] a10 = n.a(i10);
            System.arraycopy(a10, 0, bArr5, 0, this.f12071d);
            Cipher cipher = (Cipher) f12066e.get();
            cipher.init(1, this.f12070c);
            byte[] d10 = d(cipher, 0, a10, 0, a10.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d11 = d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = (Cipher) f12067f.get();
            cipher2.init(1, this.f12070c, new IvParameterSpec(d10));
            cipher2.doFinal(bArr, 0, bArr4.length, bArr5, this.f12071d);
            byte[] d12 = d(cipher, 2, bArr5, this.f12071d, bArr4.length);
            int length2 = bArr4.length + this.f12071d;
            for (int i11 = 0; i11 < 16; i11++) {
                bArr5[length2 + i11] = (byte) ((d11[i11] ^ d10[i11]) ^ d12[i11]);
            }
            return bArr5;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f12071d) - 16;
        if (length >= 0) {
            Cipher cipher = (Cipher) f12066e.get();
            cipher.init(1, this.f12070c);
            byte[] d10 = d(cipher, 0, bArr, 0, this.f12071d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d11 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d12 = d(cipher, 2, bArr, this.f12071d, length);
            int length2 = bArr.length - 16;
            byte b10 = 0;
            for (int i10 = 0; i10 < 16; i10++) {
                b10 = (byte) (b10 | (((bArr[length2 + i10] ^ d11[i10]) ^ d10[i10]) ^ d12[i10]));
            }
            if (b10 == 0) {
                Cipher cipher2 = (Cipher) f12067f.get();
                cipher2.init(1, this.f12070c, new IvParameterSpec(d10));
                return cipher2.doFinal(bArr, this.f12071d, length);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(e(bArr3, this.f12068a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, this.f12068a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f12069b, 16);
            for (int i15 = 0; i15 < copyOfRange.length; i15++) {
                copyOf[i15] = (byte) (copyOf[i15] ^ copyOfRange[i15]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}
