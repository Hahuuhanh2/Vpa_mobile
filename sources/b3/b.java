package b3;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import v.v;

/* compiled from: MasterKey */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3995a;

    /* compiled from: MasterKey */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f3996a = "_androidx_security_master_key_";

        /* renamed from: b  reason: collision with root package name */
        public KeyGenParameterSpec f3997b;

        /* renamed from: c  reason: collision with root package name */
        public int f3998c;

        /* renamed from: b3.b$a$a  reason: collision with other inner class name */
        /* compiled from: MasterKey */
        public static class C0043a {
            public static String a(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            context.getApplicationContext();
        }

        public final b a() {
            int i10 = this.f3998c;
            if (i10 == 0 && this.f3997b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (i10 == 1) {
                this.f3997b = new KeyGenParameterSpec.Builder(this.f3996a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f3997b;
            if (keyGenParameterSpec != null) {
                Object obj = c.f3999a;
                if (keyGenParameterSpec.getKeySize() != 256) {
                    StringBuilder q10 = android.support.v4.media.a.q("invalid key size, want 256 bits got ");
                    q10.append(keyGenParameterSpec.getKeySize());
                    q10.append(" bits");
                    throw new IllegalArgumentException(q10.toString());
                } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                    StringBuilder q11 = android.support.v4.media.a.q("invalid block mode, want GCM got ");
                    q11.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
                    throw new IllegalArgumentException(q11.toString());
                } else if (keyGenParameterSpec.getPurposes() != 3) {
                    StringBuilder q12 = android.support.v4.media.a.q("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                    q12.append(keyGenParameterSpec.getPurposes());
                    throw new IllegalArgumentException(q12.toString());
                } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                    StringBuilder q13 = android.support.v4.media.a.q("invalid padding mode, want NoPadding got ");
                    q13.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                    throw new IllegalArgumentException(q13.toString());
                } else if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
                    synchronized (c.f3999a) {
                        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                        instance.load((KeyStore.LoadStoreParameter) null);
                        if (!instance.containsAlias(keystoreAlias)) {
                            try {
                                KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                instance2.init(keyGenParameterSpec);
                                instance2.generateKey();
                            } catch (ProviderException e10) {
                                throw new GeneralSecurityException(e10.getMessage(), e10);
                            }
                        }
                    }
                    return new b(keyGenParameterSpec.getKeystoreAlias(), this.f3997b);
                } else {
                    throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                }
            } else {
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }
        }

        public final void b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f3998c != 0) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            } else if (this.f3996a.equals(C0043a.a(keyGenParameterSpec))) {
                this.f3997b = keyGenParameterSpec;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("KeyGenParamSpec's key alias does not match provided alias (");
                q10.append(this.f3996a);
                q10.append(" vs ");
                q10.append(C0043a.a(keyGenParameterSpec));
                throw new IllegalArgumentException(q10.toString());
            }
        }

        public final void c() {
            if (v.g(1) != 0) {
                StringBuilder q10 = android.support.v4.media.a.q("Unsupported scheme: ");
                q10.append(android.support.v4.media.a.x(1));
                throw new IllegalArgumentException(q10.toString());
            } else if (this.f3997b == null) {
                this.f3998c = 1;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }
    }

    public b(String str, KeyGenParameterSpec keyGenParameterSpec) {
        this.f3995a = str;
    }

    public final String toString() {
        boolean z10;
        StringBuilder q10 = android.support.v4.media.a.q("MasterKey{keyAlias=");
        q10.append(this.f3995a);
        q10.append(", isKeyStoreBacked=");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            z10 = instance.containsAlias(this.f3995a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            z10 = false;
        }
        q10.append(z10);
        q10.append("}");
        return q10.toString();
    }
}
