package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import sk.j;
import yk.h;

/* compiled from: AndroidSocketAdapter.kt */
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22580a = "com.google.android.gms.org.conscrypt";

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return h.L0(name, this.f22580a + '.', false);
    }

    public final SocketAdapter b(SSLSocket sSLSocket) {
        AndroidSocketAdapter.Companion companion = AndroidSocketAdapter.f22573f;
        Class<?> cls = sSLSocket.getClass();
        companion.getClass();
        Class<?> cls2 = cls;
        while (!j.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new AndroidSocketAdapter(cls2);
    }
}
