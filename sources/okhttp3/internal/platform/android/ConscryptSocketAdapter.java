package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import sk.j;

/* compiled from: ConscryptSocketAdapter.kt */
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f22587a = new Companion(0);

    /* renamed from: b  reason: collision with root package name */
    public static final ConscryptSocketAdapter$Companion$factory$1 f22588b = new ConscryptSocketAdapter$Companion$factory$1();

    /* compiled from: ConscryptSocketAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final boolean b() {
        ConscryptPlatform.f22544e.getClass();
        return ConscryptPlatform.f22545f;
    }

    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.f22562a.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.Companion.a(list).toArray(new String[0]));
        }
    }
}
