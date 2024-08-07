package q;

import android.annotation.SuppressLint;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import q.l;

/* compiled from: CryptoObjectUtils */
public final class p {

    /* compiled from: CryptoObjectUtils */
    public static class a {
        public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        public static KeyGenParameterSpec.Builder b(String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        public static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes(new String[]{"CBC"});
        }

        public static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
        }
    }

    /* compiled from: CryptoObjectUtils */
    public static class b {
        public static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        public static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        public static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        public static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        public static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        public static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    /* compiled from: CryptoObjectUtils */
    public static class c {
        public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    /* compiled from: CryptoObjectUtils */
    public static class d {
        public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    @SuppressLint({"TrulyRandom"})
    public static l.c a() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder b10 = a.b("androidxBiometric", 3);
            a.d(b10);
            a.e(b10);
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(instance2, a.a(b10));
            instance2.generateKey();
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, (SecretKey) instance.getKey("androidxBiometric", (char[]) null));
            return new l.c(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(l.c cVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cVar == null) {
            return null;
        }
        Cipher cipher = cVar.f14209b;
        if (cipher != null) {
            return b.b(cipher);
        }
        Signature signature = cVar.f14208a;
        if (signature != null) {
            return b.a(signature);
        }
        Mac mac = cVar.f14210c;
        if (mac != null) {
            return b.c(mac);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 && (identityCredential = cVar.f14211d) != null) {
            return c.a(identityCredential);
        }
        if (i10 < 33 || (presentationSession = cVar.f14212e) == null) {
            return null;
        }
        return d.a(presentationSession);
    }
}
