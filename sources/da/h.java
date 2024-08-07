package da;

import android.os.Build;
import android.os.StrictMode;
import ca.o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import za.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8850a;

    public /* synthetic */ h(int i10) {
        this.f8850a = i10;
    }

    public final Object get() {
        switch (this.f8850a) {
            case 0:
                o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f7566a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f7569d.get());
            case 1:
                o<ScheduledExecutorService> oVar2 = ExecutorsRegistrar.f7566a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, (StrictMode.ThreadPolicy) null));
            default:
                return GaugeManager.lambda$new$1();
        }
    }
}
