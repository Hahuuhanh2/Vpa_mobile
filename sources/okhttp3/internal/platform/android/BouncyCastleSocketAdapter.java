package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import sk.j;

/* compiled from: BouncyCastleSocketAdapter.kt */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22581a = new Companion(0);

    /* renamed from: b  reason: collision with root package name */
    public static final BouncyCastleSocketAdapter$Companion$factory$1 f22582b = new BouncyCastleSocketAdapter$Companion$factory$1();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    public final boolean b() {
        BouncyCastlePlatform.f22541e.getClass();
        return BouncyCastlePlatform.f22542f;
    }

    public final String c(SSLSocket sSLSocket) {
        boolean z10;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
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

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform.f22562a.getClass();
            parameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
