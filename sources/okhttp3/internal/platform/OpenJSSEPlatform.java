package okhttp3.internal.platform;

import android.support.v4.media.a;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import sk.j;

/* compiled from: OpenJSSEPlatform.kt */
public final class OpenJSSEPlatform extends Platform {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22559e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22560f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f22561d;

    /* compiled from: OpenJSSEPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, Companion.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f22560f = z10;
    }

    private OpenJSSEPlatform() {
        this.f22561d = new OpenJSSE();
    }

    public /* synthetic */ OpenJSSEPlatform(int i10) {
        this();
    }

    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        j.f(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Platform.f22562a.getClass();
                sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        boolean z10;
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null) {
                z10 = true;
            } else {
                z10 = j.a(applicationProtocol, "");
            }
            if (z10) {
                return null;
            }
            return applicationProtocol;
        }
        return null;
    }

    public final SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f22561d);
        j.e(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public final X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f22561d);
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
}
