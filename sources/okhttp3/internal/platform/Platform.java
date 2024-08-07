package okhttp3.internal.platform;

import android.support.v4.media.a;
import f0.b0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ll.f;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import sk.j;

/* compiled from: Platform.kt */
public class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22562a = new Companion(0);

    /* renamed from: b  reason: collision with root package name */
    public static volatile Platform f22563b;

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f22564c = Logger.getLogger(OkHttpClient.class.getName());

    /* compiled from: Platform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static ArrayList a(List list) {
            boolean z10;
            j.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(fk.j.H0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f22103a);
            }
            return arrayList2;
        }

        public static byte[] b(List list) {
            j.f(list, "protocols");
            f fVar = new f();
            Iterator it = a(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fVar.g0(str.length());
                fVar.w0(str);
            }
            return fVar.L(fVar.f20878b);
        }

        public static boolean c() {
            return j.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: okhttp3.internal.platform.AndroidPlatform} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0128, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x018b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018f  */
    static {
        /*
            okhttp3.internal.platform.Platform$Companion r0 = new okhttp3.internal.platform.Platform$Companion
            r1 = 0
            r0.<init>(r1)
            f22562a = r0
            boolean r0 = okhttp3.internal.platform.Platform.Companion.c()
            r2 = 0
            if (r0 == 0) goto L_0x008a
            okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.f22569a
            r0.getClass()
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.f22571c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = okhttp3.internal.platform.android.AndroidLog.f22570b
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001e
            r4.setUseParentHandlers(r1)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x004f
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005b
        L_0x004f:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x0059
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005b
        L_0x0059:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005b:
            r4.setLevel(r3)
            okhttp3.internal.platform.android.AndroidLogHandler r3 = okhttp3.internal.platform.android.AndroidLogHandler.f22572a
            r4.addHandler(r3)
            goto L_0x001e
        L_0x0064:
            okhttp3.internal.platform.Android10Platform$Companion r0 = okhttp3.internal.platform.Android10Platform.f22532e
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.Android10Platform.f22533f
            if (r0 == 0) goto L_0x0073
            okhttp3.internal.platform.Android10Platform r0 = new okhttp3.internal.platform.Android10Platform
            r0.<init>()
            goto L_0x0074
        L_0x0073:
            r0 = r2
        L_0x0074:
            if (r0 != 0) goto L_0x0194
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.f22535f
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.AndroidPlatform.f22536g
            if (r0 == 0) goto L_0x0084
            okhttp3.internal.platform.AndroidPlatform r2 = new okhttp3.internal.platform.AndroidPlatform
            r2.<init>()
        L_0x0084:
            sk.j.c(r2)
        L_0x0087:
            r0 = r2
            goto L_0x0194
        L_0x008a:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "Conscrypt"
            boolean r0 = sk.j.a(r3, r0)
            if (r0 == 0) goto L_0x00b0
            okhttp3.internal.platform.ConscryptPlatform$Companion r0 = okhttp3.internal.platform.ConscryptPlatform.f22544e
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.ConscryptPlatform.f22545f
            if (r0 == 0) goto L_0x00ab
            okhttp3.internal.platform.ConscryptPlatform r0 = new okhttp3.internal.platform.ConscryptPlatform
            r0.<init>(r1)
            goto L_0x00ac
        L_0x00ab:
            r0 = r2
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x0194
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "BC"
            boolean r0 = sk.j.a(r3, r0)
            if (r0 == 0) goto L_0x00d6
            okhttp3.internal.platform.BouncyCastlePlatform$Companion r0 = okhttp3.internal.platform.BouncyCastlePlatform.f22541e
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.BouncyCastlePlatform.f22542f
            if (r0 == 0) goto L_0x00d1
            okhttp3.internal.platform.BouncyCastlePlatform r0 = new okhttp3.internal.platform.BouncyCastlePlatform
            r0.<init>(r1)
            goto L_0x00d2
        L_0x00d1:
            r0 = r2
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x0194
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = sk.j.a(r3, r0)
            if (r0 == 0) goto L_0x00fc
            okhttp3.internal.platform.OpenJSSEPlatform$Companion r0 = okhttp3.internal.platform.OpenJSSEPlatform.f22559e
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.OpenJSSEPlatform.f22560f
            if (r0 == 0) goto L_0x00f7
            okhttp3.internal.platform.OpenJSSEPlatform r0 = new okhttp3.internal.platform.OpenJSSEPlatform
            r0.<init>(r1)
            goto L_0x00f8
        L_0x00f7:
            r0 = r2
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x0194
        L_0x00fc:
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = okhttp3.internal.platform.Jdk9Platform.f22557d
            r0.getClass()
            boolean r0 = okhttp3.internal.platform.Jdk9Platform.f22558e
            if (r0 == 0) goto L_0x010b
            okhttp3.internal.platform.Jdk9Platform r0 = new okhttp3.internal.platform.Jdk9Platform
            r0.<init>()
            goto L_0x010c
        L_0x010b:
            r0 = r2
        L_0x010c:
            if (r0 == 0) goto L_0x0110
            goto L_0x0194
        L_0x0110:
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion r0 = okhttp3.internal.platform.Jdk8WithJettyBootPlatform.f22548i
            r0.getClass()
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            sk.j.e(r0, r3)     // Catch:{ NumberFormatException -> 0x012b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x012b }
            r3 = 9
            if (r0 < r3) goto L_0x012b
            goto L_0x018b
        L_0x012b:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r1] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r1] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r1] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform r0 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r1 = "putMethod"
            sk.j.e(r7, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r1 = "getMethod"
            sk.j.e(r8, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r1 = "removeMethod"
            sk.j.e(r9, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r1 = "clientProviderClass"
            sk.j.e(r10, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            java.lang.String r1 = "serverProviderClass"
            sk.j.e(r11, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x018b }
            r2 = r0
        L_0x018b:
            if (r2 == 0) goto L_0x018f
            goto L_0x0087
        L_0x018f:
            okhttp3.internal.platform.Platform r0 = new okhttp3.internal.platform.Platform
            r0.<init>()
        L_0x0194:
            f22563b = r0
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f22564c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.<clinit>():void");
    }

    public static void i(int i10, String str, Throwable th2) {
        Level level;
        j.f(str, "message");
        if (i10 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f22564c.log(level, str, th2);
    }

    public static /* synthetic */ void j(Platform platform, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        platform.getClass();
        i(i10, str, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner b(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(c(x509TrustManager));
    }

    public TrustRootIndex c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        j.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        j.f(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        j.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f22564c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        j.f(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        j.f(str, "message");
        if (obj == null) {
            str = b0.r(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        j.e(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l10 = l();
            l10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l10.getSocketFactory();
            j.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        j.c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            j.d(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder q10 = a.q("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        j.e(arrays, "toString(this)");
        q10.append(arrays);
        throw new IllegalStateException(q10.toString().toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
