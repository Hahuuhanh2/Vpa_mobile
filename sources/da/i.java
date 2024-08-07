package da;

import android.os.StrictMode;
import ca.o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import vb.h;
import za.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8851a;

    public /* synthetic */ i(int i10) {
        this.f8851a = i10;
    }

    public final Object get() {
        switch (this.f8851a) {
            case 0:
                o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f7566a;
                return new f(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, (StrictMode.ThreadPolicy) null)), ExecutorsRegistrar.f7569d.get());
            case 1:
                return GaugeManager.lambda$new$0();
            default:
                Random random = h.f16154j;
                return null;
        }
    }
}
