package ia;

import android.util.Log;

/* compiled from: CrashlyticsController */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f11385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f11386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f11387c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f11388d;

    public v(t tVar, long j10, Exception exc, Thread thread) {
        this.f11388d = tVar;
        this.f11385a = j10;
        this.f11386b = exc;
        this.f11387c = thread;
    }

    public final void run() {
        boolean z10;
        f0 f0Var = this.f11388d.f11376n;
        if (f0Var == null || !f0Var.f11296e.get()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            long j10 = this.f11385a / 1000;
            String d10 = this.f11388d.d();
            if (d10 != null) {
                m0 m0Var = this.f11388d.f11375m;
                Throwable th2 = this.f11386b;
                Thread thread = this.f11387c;
                m0Var.getClass();
                Log.isLoggable("FirebaseCrashlytics", 2);
                m0Var.d(th2, thread, d10, "error", j10, false);
            }
        }
    }
}
