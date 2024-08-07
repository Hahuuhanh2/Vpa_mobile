package hb;

import ib.a;

/* compiled from: FirebasePerformanceInitializer */
public final class d implements a.C0126a {

    /* renamed from: a  reason: collision with root package name */
    public static final lb.a f10703a = lb.a.d();

    public final void a() {
        try {
            lb.a aVar = c.f10698e;
            c cVar = (c) m9.d.d().b(c.class);
        } catch (IllegalStateException e10) {
            f10703a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
