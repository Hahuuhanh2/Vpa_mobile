package y8;

import a9.a;
import android.os.Build;
import d9.w;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k9.h;
import k9.o;

/* compiled from: InsecureNonceAesGcmJce */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17619c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f17620a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17621b;

    /* compiled from: InsecureNonceAesGcmJce */
    public class a extends ThreadLocal<Cipher> {
        public final Object initialValue() {
            try {
                return h.f12092b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr) {
        if (a.C0003a.f117b.b()) {
            o.a(bArr.length);
            this.f17620a = new SecretKeySpec(bArr, "AES");
            this.f17621b = true;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer num;
        int i10;
        int length = bArr.length;
        if (m9.b.F()) {
            int i11 = w.f8823a;
            if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                num = null;
            } else {
                num = Integer.valueOf(Build.VERSION.SDK_INT);
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = -1;
            }
            if (i10 <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
