package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import sk.j;

@SuppressSignatureCheck
@SuppressLint({"NewApi"})
/* compiled from: Android10SocketAdapter.kt */
public final class Android10SocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22565a = new Companion(0);

    @SuppressSignatureCheck
    /* compiled from: Android10SocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final boolean b() {
        f22565a.getClass();
        Platform.f22562a.getClass();
        if (!Platform.Companion.c() || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        boolean z10;
        String g2 = sSLSocket.getApplicationProtocol();
        if (g2 == null) {
            z10 = true;
        } else {
            z10 = j.a(g2, "");
        }
        if (z10) {
            return null;
        }
        return g2;
    }

    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Platform.f22562a.getClass();
            sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
