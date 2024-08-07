package ga;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import z.j;

/* compiled from: BlockingAnalyticsEventLogger */
public final class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final j f10407a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeUnit f10408b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10409c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public CountDownLatch f10410d;

    public c(j jVar, TimeUnit timeUnit) {
        this.f10407a = jVar;
        this.f10408b = timeUnit;
    }

    public final void a(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f10410d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public final void c(Bundle bundle) {
        synchronized (this.f10409c) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.f10410d = new CountDownLatch(1);
            this.f10407a.c(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (this.f10410d.await((long) 500, this.f10408b)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
            }
            this.f10410d = null;
        }
    }
}
