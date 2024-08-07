package w3;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f16455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16456c;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f16456c = systemForegroundService;
        this.f16454a = i10;
        this.f16455b = notification;
    }

    public final void run() {
        this.f16456c.f3831e.notify(this.f16454a, this.f16455b);
    }
}
