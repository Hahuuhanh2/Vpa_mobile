package f0;

import java.util.HashMap;

/* compiled from: ExtendedCameraConfigProviderStore */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9617a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f9618b = new HashMap();

    public static m a(a0 a0Var) {
        m mVar;
        synchronized (f9617a) {
            mVar = (m) f9618b.get(a0Var);
        }
        if (mVar == null) {
            return m.f9563a;
        }
        return mVar;
    }
}
