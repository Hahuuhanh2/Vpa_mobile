package ia;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorUtils */
public final class i0 extends d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f11314b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f11315c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f11316d;

    public i0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f11313a = str;
        this.f11314b = executorService;
        this.f11316d = timeUnit;
    }

    public final void a() {
        try {
            boolean isLoggable = Log.isLoggable("FirebaseCrashlytics", 3);
            this.f11314b.shutdown();
            if (!this.f11314b.awaitTermination(this.f11315c, this.f11316d)) {
                boolean isLoggable2 = Log.isLoggable("FirebaseCrashlytics", 3);
                this.f11314b.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f11313a});
            boolean isLoggable3 = Log.isLoggable("FirebaseCrashlytics", 3);
            this.f11314b.shutdownNow();
        }
    }
}
