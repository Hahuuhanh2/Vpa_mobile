package c9;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import k9.n;
import k9.o;
import w8.k;

/* compiled from: AndroidKeystoreKmsClient */
public final class c implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4602b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f4603a = new a().f4604a;

    /* compiled from: AndroidKeystoreKmsClient */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public KeyStore f4604a = null;

        public a() {
            Object obj = c.f4602b;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.f4604a = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static boolean c(String str) {
        c cVar = new c();
        synchronized (f4602b) {
            if (cVar.e(str)) {
                return false;
            }
            d(str);
            return true;
        }
    }

    public static void d(String str) {
        String b10 = o.b(str);
        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        instance.generateKey();
    }

    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    public final synchronized b b(String str) {
        b bVar;
        bVar = new b(o.b(str), this.f4603a);
        byte[] a10 = n.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, bVar.b(bVar.a(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.sleep((long) ((int) (java.lang.Math.random() * 40.0d)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r4.f4603a = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return r4.f4603a.containsAlias(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        throw new java.security.GeneralSecurityException(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean e(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r5 = k9.o.b(r5)     // Catch:{ all -> 0x0034 }
            java.security.KeyStore r0 = r4.f4603a     // Catch:{ NullPointerException -> 0x000d }
            boolean r5 = r0.containsAlias(r5)     // Catch:{ NullPointerException -> 0x000d }
            monitor-exit(r4)
            return r5
        L_0x000d:
            double r0 = java.lang.Math.random()     // Catch:{ IOException -> 0x002d }
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0019 }
        L_0x0019:
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002d }
            r4.f4603a = r0     // Catch:{ IOException -> 0x002d }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002d }
            java.security.KeyStore r0 = r4.f4603a     // Catch:{ all -> 0x0034 }
            boolean r5 = r0.containsAlias(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)
            return r5
        L_0x002d:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0034 }
            r0.<init>(r5)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.c.e(java.lang.String):boolean");
    }
}
