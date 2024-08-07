package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: BouncyCastleSocketAdapter.kt */
public final class BouncyCastleSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public final boolean a(SSLSocket sSLSocket) {
        BouncyCastlePlatform.f22541e.getClass();
        if (!BouncyCastlePlatform.f22542f || !(sSLSocket instanceof BCSSLSocket)) {
            return false;
        }
        return true;
    }

    public final SocketAdapter b(SSLSocket sSLSocket) {
        return new BouncyCastleSocketAdapter();
    }
}
