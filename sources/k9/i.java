package k9;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: EngineWrapper */
public interface i<T> {

    /* compiled from: EngineWrapper */
    public static class a implements i<Cipher> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return Cipher.getInstance(str);
            }
            return Cipher.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class b implements i<KeyAgreement> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyAgreement.getInstance(str);
            }
            return KeyAgreement.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class c implements i<KeyFactory> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance(str);
            }
            return KeyFactory.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class d implements i<KeyPairGenerator> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(str);
            }
            return KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class e implements i<Mac> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class f implements i<MessageDigest> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, provider);
        }
    }

    /* compiled from: EngineWrapper */
    public static class g implements i<Signature> {
        public final Object a(String str, Provider provider) {
            if (provider == null) {
                return Signature.getInstance(str);
            }
            return Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider);
}
