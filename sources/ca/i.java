package ca;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import da.a;
import da.f;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import za.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4628a;

    public /* synthetic */ i(int i10) {
        this.f4628a = i10;
    }

    public final Object get() {
        switch (this.f4628a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f7566a;
                return new f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f7569d.get());
            default:
                return Executors.newSingleThreadScheduledExecutor();
        }
    }
}
