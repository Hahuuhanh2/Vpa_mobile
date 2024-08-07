package k9;

import a9.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCtrJceCipher */
public final class a implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final C0136a f12062d = new C0136a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f12063a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12064b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12065c;

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    /* compiled from: AesCtrJceCipher */
    public class C0136a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return h.f12092b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, int i10) {
        if (a.C0003a.f117b.b()) {
            o.a(bArr.length);
            this.f12063a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f12062d.get()).getBlockSize();
            this.f12065c = blockSize;
            if (i10 < 12 || i10 > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f12064b = i10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f12064b;
        if (length <= Integer.MAX_VALUE - i10) {
            byte[] bArr2 = new byte[(bArr.length + i10)];
            byte[] a10 = n.a(i10);
            System.arraycopy(a10, 0, bArr2, 0, this.f12064b);
            c(bArr, 0, bArr.length, bArr2, this.f12064b, a10, true);
            return bArr2;
        }
        StringBuilder q10 = android.support.v4.media.a.q("plaintext length can not exceed ");
        q10.append(Integer.MAX_VALUE - this.f12064b);
        throw new GeneralSecurityException(q10.toString());
    }

    public final byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f12064b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int length2 = bArr.length;
            int i11 = this.f12064b;
            byte[] bArr3 = new byte[(length2 - i11)];
            c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) {
        Cipher cipher = (Cipher) f12062d.get();
        byte[] bArr4 = new byte[this.f12065c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f12064b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f12063a, ivParameterSpec);
        } else {
            cipher.init(2, this.f12063a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
