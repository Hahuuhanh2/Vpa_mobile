package z8;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k9.h;
import k9.n;
import k9.o;
import m9.b;

/* compiled from: AesGcmSiv */
public final class a implements w8.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0250a f17894b = new C0250a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f17895a;

    /* renamed from: z8.a$a  reason: collision with other inner class name */
    /* compiled from: AesGcmSiv */
    public class C0250a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return h.f12092b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr) {
        o.a(bArr.length);
        this.f17895a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i10) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i10);
        } catch (ClassNotFoundException unused) {
            if (b.F()) {
                return new IvParameterSpec(bArr, 0, i10);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a10 = n.a(12);
            System.arraycopy(a10, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c10 = c(a10, a10.length);
            C0250a aVar = f17894b;
            ((Cipher) aVar.get()).init(1, this.f17895a, c10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) aVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c10 = c(bArr, 12);
            C0250a aVar = f17894b;
            ((Cipher) aVar.get()).init(2, this.f17895a, c10);
            if (!(bArr2 == null || bArr2.length == 0)) {
                ((Cipher) aVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) aVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
