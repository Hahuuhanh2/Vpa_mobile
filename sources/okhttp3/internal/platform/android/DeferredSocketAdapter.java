package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import sk.j;

/* compiled from: DeferredSocketAdapter.kt */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Factory f22589a;

    /* renamed from: b  reason: collision with root package name */
    public SocketAdapter f22590b;

    /* compiled from: DeferredSocketAdapter.kt */
    public interface Factory {
        boolean a(SSLSocket sSLSocket);

        SocketAdapter b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        j.f(factory, "socketAdapterFactory");
        this.f22589a = factory;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f22589a.a(sSLSocket);
    }

    public final boolean b() {
        return true;
    }

    public final String c(SSLSocket sSLSocket) {
        SocketAdapter socketAdapter;
        synchronized (this) {
            if (this.f22590b == null && this.f22589a.a(sSLSocket)) {
                this.f22590b = this.f22589a.b(sSLSocket);
            }
            socketAdapter = this.f22590b;
        }
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        SocketAdapter socketAdapter;
        j.f(list, "protocols");
        synchronized (this) {
            if (this.f22590b == null && this.f22589a.a(sSLSocket)) {
                this.f22590b = this.f22589a.b(sSLSocket);
            }
            socketAdapter = this.f22590b;
        }
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, list);
        }
    }
}
