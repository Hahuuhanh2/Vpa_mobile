package w3;

import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16458b;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f16458b = systemForegroundService;
        this.f16457a = i10;
    }

    public final void run() {
        this.f16458b.f3831e.cancel(this.f16457a);
    }
}
