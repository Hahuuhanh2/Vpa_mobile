package ia;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker */
public final class m implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11337a;

    public m(v vVar) {
        this.f11337a = vVar;
    }

    public final Object call() {
        this.f11337a.run();
        return null;
    }
}
