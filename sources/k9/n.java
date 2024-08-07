package k9;

import java.security.SecureRandom;

/* compiled from: Random */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12108a = new a();

    /* compiled from: Random */
    public class a extends ThreadLocal<SecureRandom> {
        public final Object initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f12108a.get()).nextBytes(bArr);
        return bArr;
    }
}
