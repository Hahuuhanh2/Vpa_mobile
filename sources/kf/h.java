package kf;

import ea.e;
import java.util.concurrent.locks.ReentrantLock;
import m9.d;

/* compiled from: Log.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12560a = 0;

    static {
        new ReentrantLock(true);
    }

    public static void a(Exception exc) {
        Class cls = e.class;
        try {
            e eVar = (e) d.d().b(cls);
            if (eVar != null) {
                eVar.a(exc);
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Exception e10) {
            e eVar2 = (e) d.d().b(cls);
            if (eVar2 != null) {
                eVar2.a(e10);
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
    }
}
