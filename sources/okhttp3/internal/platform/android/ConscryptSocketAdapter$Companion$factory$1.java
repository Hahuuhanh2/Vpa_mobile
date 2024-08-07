package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptSocketAdapter.kt */
public final class ConscryptSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    public final boolean a(SSLSocket sSLSocket) {
        ConscryptPlatform.f22544e.getClass();
        if (!ConscryptPlatform.Companion.b() || !Conscrypt.isConscrypt(sSLSocket)) {
            return false;
        }
        return true;
    }

    public final SocketAdapter b(SSLSocket sSLSocket) {
        return new ConscryptSocketAdapter();
    }
}
