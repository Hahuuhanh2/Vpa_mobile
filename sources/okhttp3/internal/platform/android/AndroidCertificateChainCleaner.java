package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;
import sk.j;

@SuppressSignatureCheck
/* compiled from: AndroidCertificateChainCleaner.kt */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22566d = new Companion(0);

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f22567b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f22568c;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f22567b = x509TrustManager;
        this.f22568c = x509TrustManagerExtensions;
    }

    @SuppressSignatureCheck
    public final List a(String str, List list) {
        j.f(list, "chain");
        j.f(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f22568c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            j.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidCertificateChainCleaner) || ((AndroidCertificateChainCleaner) obj).f22567b != this.f22567b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22567b);
    }
}
