package ia;

import android.util.Log;
import java.util.Objects;
import na.c;
import yb.b;

/* compiled from: CrashlyticsAppQualitySessionsSubscriber */
public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f11322a;

    /* renamed from: b  reason: collision with root package name */
    public final j f11323b;

    public k(g0 g0Var, c cVar) {
        this.f11322a = g0Var;
        this.f11323b = new j(cVar);
    }

    public final boolean a() {
        return this.f11322a.a();
    }

    public final b.a b() {
        return b.a.CRASHLYTICS;
    }

    public final void c(b.C0236b bVar) {
        Objects.toString(bVar);
        Log.isLoggable("FirebaseCrashlytics", 3);
        j jVar = this.f11323b;
        String str = bVar.f17644a;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f11321c, str)) {
                j.a(jVar.f11319a, jVar.f11320b, str);
                jVar.f11321c = str;
            }
        }
    }
}
