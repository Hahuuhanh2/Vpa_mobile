package okhttp3.internal.proxy;

import j7.a;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: NullProxySelector.kt */
public final class NullProxySelector extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final NullProxySelector f22592a = new NullProxySelector();

    private NullProxySelector() {
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return a.c0(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
