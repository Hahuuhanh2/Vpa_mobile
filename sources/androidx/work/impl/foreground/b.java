package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Notification f3843b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3844c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f3845d;

    public b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f3845d = systemForegroundService;
        this.f3842a = i10;
        this.f3843b = notification;
        this.f3844c = i11;
    }

    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            SystemForegroundService.b.a(this.f3845d, this.f3842a, this.f3843b, this.f3844c);
        } else if (i10 >= 29) {
            SystemForegroundService.a.a(this.f3845d, this.f3842a, this.f3843b, this.f3844c);
        } else {
            this.f3845d.startForeground(this.f3842a, this.f3843b);
        }
    }
}
