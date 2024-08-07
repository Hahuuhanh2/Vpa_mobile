package ia;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import na.c;
import vl.d;

/* compiled from: CrashlyticsCore */
public final class c0 implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f11279a;

    public c0(b0 b0Var) {
        this.f11279a = b0Var;
    }

    public final Object call() {
        t tVar = this.f11279a.f11267g;
        d dVar = tVar.f11365c;
        c cVar = (c) dVar.f23363c;
        cVar.getClass();
        boolean exists = new File(cVar.f13552b, (String) dVar.f23362b).exists();
        boolean z10 = true;
        if (!exists) {
            String d10 = tVar.d();
            if (d10 == null || !tVar.f11372j.c(d10)) {
                z10 = false;
            }
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
            d dVar2 = tVar.f11365c;
            c cVar2 = (c) dVar2.f23363c;
            cVar2.getClass();
            new File(cVar2.f13552b, (String) dVar2.f23362b).delete();
        }
        return Boolean.valueOf(z10);
    }
}
