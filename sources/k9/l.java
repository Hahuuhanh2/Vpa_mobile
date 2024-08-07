package k9;

import a9.a;
import f0.b0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PrfHmacJce */
public final class l implements h9.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f12101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12102b;

    /* renamed from: c  reason: collision with root package name */
    public final Key f12103c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12104d;

    /* compiled from: PrfHmacJce */
    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        public final Object initialValue() {
            try {
                Mac a10 = h.f12093c.a(l.this.f12102b);
                a10.init(l.this.f12103c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public l(String str, SecretKeySpec secretKeySpec) {
        a aVar = new a();
        this.f12101a = aVar;
        if (a.C0003a.f117b.b()) {
            this.f12102b = str;
            this.f12103c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f12104d = 20;
                        break;
                    case 1:
                        this.f12104d = 28;
                        break;
                    case 2:
                        this.f12104d = 32;
                        break;
                    case 3:
                        this.f12104d = 48;
                        break;
                    case 4:
                        this.f12104d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException(b0.r("unknown Hmac algorithm: ", str));
                }
                aVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] a(int i10, byte[] bArr) {
        if (i10 <= this.f12104d) {
            ((Mac) this.f12101a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f12101a.get()).doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
