package fa;

import android.util.Log;
import ca.q;
import java.util.concurrent.atomic.AtomicReference;
import ka.d0;

/* compiled from: CrashlyticsNativeComponentDeferredProxy */
public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10072c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final za.a<a> f10073a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f10074b = new AtomicReference<>((Object) null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy */
    public static final class a implements e {
    }

    public c(za.a<a> aVar) {
        this.f10073a = aVar;
        ((q) aVar).a(new ca.a(this, 16));
    }

    public final e a(String str) {
        a aVar = this.f10074b.get();
        if (aVar == null) {
            return f10072c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = this.f10074b.get();
        if (aVar == null || !aVar.b()) {
            return false;
        }
        return true;
    }

    public final boolean c(String str) {
        a aVar = this.f10074b.get();
        if (aVar == null || !aVar.c(str)) {
            return false;
        }
        return true;
    }

    public final void d(String str, String str2, long j10, d0 d0Var) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        ((q) this.f10073a).a(new b(str, str2, j10, d0Var));
    }
}
