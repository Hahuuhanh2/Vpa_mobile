package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.v4.media.a;
import fk.h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import sk.j;

@SuppressSignatureCheck
/* compiled from: AndroidPlatform.kt */
public final class AndroidPlatform extends Platform {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f22535f = new Companion(0);

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f22536g;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f22537d;

    /* renamed from: e  reason: collision with root package name */
    public final CloseGuard f22538e;

    /* compiled from: AndroidPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f22539a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f22540b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f22539a = x509TrustManager;
            this.f22540b = method;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f22540b.invoke(this.f22539a, new Object[]{x509Certificate});
                j.d(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return j.a(this.f22539a, customTrustRootIndex.f22539a) && j.a(this.f22540b, customTrustRootIndex.f22540b);
        }

        public final int hashCode() {
            return this.f22540b.hashCode() + (this.f22539a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder q10 = a.q("CustomTrustRootIndex(trustManager=");
            q10.append(this.f22539a);
            q10.append(", findByIssuerAndSignatureMethod=");
            q10.append(this.f22540b);
            q10.append(')');
            return q10.toString();
        }
    }

    static {
        boolean z10 = false;
        Platform.f22562a.getClass();
        if (Platform.Companion.c() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f22536g = z10;
    }

    public AndroidPlatform() {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        SocketAdapter[] socketAdapterArr = new SocketAdapter[4];
        StandardAndroidSocketAdapter.f22591h.getClass();
        Method method3 = null;
        try {
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (Exception e10) {
            Platform.f22562a.getClass();
            Platform.f22563b.getClass();
            Platform.i(5, "unable to load android socket classes", e10);
            standardAndroidSocketAdapter = null;
        }
        socketAdapterArr[0] = standardAndroidSocketAdapter;
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
        this.f22537d = arrayList;
        CloseGuard.f22583d.getClass();
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f22538e = new CloseGuard(method3, method, method2);
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

    public final TrustRootIndex c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object obj;
        j.f(list, "protocols");
        Iterator it = this.f22537d.iterator();
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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        j.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22537d.iterator();
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

    public final Object g() {
        CloseGuard closeGuard = this.f22538e;
        closeGuard.getClass();
        Method method = closeGuard.f22584a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = closeGuard.f22585b;
            j.c(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        j.f(str, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public final void k(Object obj, String str) {
        j.f(str, "message");
        CloseGuard closeGuard = this.f22538e;
        closeGuard.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = closeGuard.f22586c;
                j.c(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            Platform.j(this, str, 5, 4);
        }
    }
}
