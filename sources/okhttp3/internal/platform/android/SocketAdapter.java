package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* compiled from: SocketAdapter.kt */
public interface SocketAdapter {

    /* compiled from: SocketAdapter.kt */
    public static final class DefaultImpls {
    }

    boolean a(SSLSocket sSLSocket);

    boolean b();

    String c(SSLSocket sSLSocket);

    void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list);
}
