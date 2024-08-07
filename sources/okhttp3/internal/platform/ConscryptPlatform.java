package okhttp3.internal.platform;

import android.support.v4.media.a;
import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import sk.j;

/* compiled from: ConscryptPlatform.kt */
public final class ConscryptPlatform extends Platform {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22544e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22545f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f22546d;

    /* compiled from: ConscryptPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static boolean a() {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != 2) {
                if (version.major() > 2) {
                    return true;
                }
                return false;
            } else if (version.minor() != 1) {
                if (version.minor() > 1) {
                    return true;
                }
                return false;
            } else if (version.patch() >= 0) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean b() {
            return ConscryptPlatform.f22545f;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final DisabledHostnameVerifier f22547a = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, Companion.class.getClassLoader());
            if (Conscrypt.isAvailable() && Companion.a()) {
                z10 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f22545f = z10;
    }

    private ConscryptPlatform() {
        Provider newProvider = Conscrypt.newProvider();
        j.e(newProvider, "newProvider()");
        this.f22546d = newProvider;
    }

    public /* synthetic */ ConscryptPlatform(int i10) {
        this();
    }

    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        j.f(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.f22562a.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(list).toArray(new String[0]));
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f22546d);
        j.e(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l10 = l();
        l10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = l10.getSocketFactory();
        j.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public final X509TrustManager n() {
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
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.f22547a);
            return x509TrustManager;
        }
        StringBuilder q10 = a.q("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        j.e(arrays, "toString(this)");
        q10.append(arrays);
        throw new IllegalStateException(q10.toString().toString());
    }
}
