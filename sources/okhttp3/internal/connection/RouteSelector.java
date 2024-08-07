package okhttp3.internal.connection;

import fk.r;
import j7.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: RouteSelector.kt */
public final class RouteSelector {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f22301i = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final Address f22302a;

    /* renamed from: b  reason: collision with root package name */
    public final RouteDatabase f22303b;

    /* renamed from: c  reason: collision with root package name */
    public final Call f22304c;

    /* renamed from: d  reason: collision with root package name */
    public final EventListener f22305d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends Proxy> f22306e;

    /* renamed from: f  reason: collision with root package name */
    public int f22307f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends InetSocketAddress> f22308g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f22309h = new ArrayList();

    /* compiled from: RouteSelector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: RouteSelector.kt */
    public static final class Selection {

        /* renamed from: a  reason: collision with root package name */
        public final List<Route> f22310a;

        /* renamed from: b  reason: collision with root package name */
        public int f22311b;

        public Selection(ArrayList arrayList) {
            this.f22310a = arrayList;
        }

        public final boolean a() {
            if (this.f22311b < this.f22310a.size()) {
                return true;
            }
            return false;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, EventListener eventListener) {
        List<? extends Proxy> list;
        boolean z10;
        j.f(address, "address");
        j.f(routeDatabase, "routeDatabase");
        j.f(realCall, "call");
        j.f(eventListener, "eventListener");
        this.f22302a = address;
        this.f22303b = routeDatabase;
        this.f22304c = realCall;
        this.f22305d = eventListener;
        r rVar = r.f20213a;
        this.f22306e = rVar;
        this.f22308g = rVar;
        HttpUrl httpUrl = address.f21901i;
        Proxy proxy = address.f21899g;
        eventListener.p(realCall, httpUrl);
        if (proxy != null) {
            list = a.c0(proxy);
        } else {
            URI g2 = httpUrl.g();
            if (g2.getHost() == null) {
                list = Util.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = address.f21900h.select(g2);
                if (select == null || select.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    list = Util.k(Proxy.NO_PROXY);
                } else {
                    j.e(select, "proxiesOrNull");
                    list = Util.x(select);
                }
            }
        }
        this.f22306e = list;
        this.f22307f = 0;
        eventListener.o(realCall, httpUrl, list);
    }

    public final boolean a() {
        boolean z10;
        if (this.f22307f < this.f22306e.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (!this.f22309h.isEmpty())) {
            return true;
        }
        return false;
    }
}
