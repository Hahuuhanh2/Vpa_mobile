package sl;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n0.l;

/* compiled from: ZoneRulesInitializer */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f22961a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference<g> f22962b = new AtomicReference<>();

    /* compiled from: ZoneRulesInitializer */
    public static class a extends g {
        public final void a() {
        }
    }

    /* compiled from: ZoneRulesInitializer */
    public static class b extends g {
        public final void a() {
            Iterator m10 = l.m();
            while (m10.hasNext()) {
                try {
                    h.d((h) m10.next());
                } catch (ServiceConfigurationError e10) {
                    if (!(e10.getCause() instanceof SecurityException)) {
                        throw e10;
                    }
                }
            }
        }
    }

    static {
        new a();
    }

    public abstract void a();
}
