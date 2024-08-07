package okhttp3;

import f0.b0;
import fk.h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import sk.j;

/* compiled from: Dns.kt */
public interface Dns {

    /* renamed from: a  reason: collision with root package name */
    public static final Dns f21986a = new Companion.DnsSystem();

    /* compiled from: Dns.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f21987a = 0;

        /* compiled from: Dns.kt */
        public static final class DnsSystem implements Dns {
            public final List<InetAddress> a(String str) {
                j.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    j.e(allByName, "getAllByName(hostname)");
                    return h.z0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(b0.r("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f21987a;
    }

    List<InetAddress> a(String str);
}
