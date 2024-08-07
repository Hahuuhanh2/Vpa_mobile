package okhttp3;

import android.support.v4.media.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import sk.j;

/* compiled from: Route.kt */
public final class Route {

    /* renamed from: a  reason: collision with root package name */
    public final Address f22160a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f22161b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f22162c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        j.f(address, "address");
        j.f(inetSocketAddress, "socketAddress");
        this.f22160a = address;
        this.f22161b = proxy;
        this.f22162c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (!j.a(route.f22160a, this.f22160a) || !j.a(route.f22161b, this.f22161b) || !j.a(route.f22162c, this.f22162c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f22161b.hashCode();
        return this.f22162c.hashCode() + ((hashCode + ((this.f22160a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("Route{");
        q10.append(this.f22162c);
        q10.append('}');
        return q10.toString();
    }
}
