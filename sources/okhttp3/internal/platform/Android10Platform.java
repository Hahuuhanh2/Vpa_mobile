package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import fk.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import sk.j;

@SuppressSignatureCheck
/* compiled from: Android10Platform.kt */
public final class Android10Platform extends Platform {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22532e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f22533f;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f22534d;

    /* compiled from: Android10Platform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        boolean z10 = false;
        Platform.f22562a.getClass();
        if (Platform.Companion.c() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        f22533f = z10;
    }

    public Android10Platform() {
        boolean z10;
        Android10SocketAdapter android10SocketAdapter;
        SocketAdapter[] socketAdapterArr = new SocketAdapter[4];
        Android10SocketAdapter.f22565a.getClass();
        Platform.f22562a.getClass();
        if (!Platform.Companion.c() || Build.VERSION.SDK_INT < 29) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            android10SocketAdapter = new Android10SocketAdapter();
        } else {
            android10SocketAdapter = null;
        }
        socketAdapterArr[0] = android10SocketAdapter;
        AndroidSocketAdapter.f22573f.getClass();
        socketAdapterArr[1] = new DeferredSocketAdapter(AndroidSocketAdapter.f22574g);
        ConscryptSocketAdapter.f22587a.getClass();
        socketAdapterArr[2] = new DeferredSocketAdapter(ConscryptSocketAdapter.f22588b);
        BouncyCastleSocketAdapter.f22581a.getClass();
        socketAdapterArr[3] = new DeferredSocketAdapter(BouncyCastleSocketAdapter.f22582b);
        ArrayList r02 = h.r0(socketAdapterArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((SocketAdapter) next).b()) {
                arrayList.add(next);
            }
        }
        this.f22534d = arrayList;
    }

    public final CertificateChainCleaner b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AndroidCertificateChainCleaner.f22566d.getClass();
        AndroidCertificateChainCleaner androidCertificateChainCleaner = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            androidCertificateChainCleaner = new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
        }
        if (androidCertificateChainCleaner != null) {
            return androidCertificateChainCleaner;
        }
        return new BasicCertificateChainCleaner(c(x509TrustManager));
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        j.f(list, "protocols");
        Iterator it = this.f22534d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).a(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22534d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).a(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final boolean h(String str) {
        j.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
