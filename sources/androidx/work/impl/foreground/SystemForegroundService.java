package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.a;
import java.util.Objects;
import java.util.UUID;
import o3.j;
import p3.j0;

public class SystemForegroundService extends LifecycleService implements a.C0038a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f3827f = 0;

    /* renamed from: b  reason: collision with root package name */
    public Handler f3828b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3829c;

    /* renamed from: d  reason: collision with root package name */
    public a f3830d;

    /* renamed from: e  reason: collision with root package name */
    public NotificationManager f3831e;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                j a10 = j.a();
                int i12 = SystemForegroundService.f3827f;
                a10.getClass();
            }
        }
    }

    static {
        j.b("SystemFgService");
    }

    public final void a() {
        this.f3828b = new Handler(Looper.getMainLooper());
        this.f3831e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f3830d = aVar;
        if (aVar.f3841p != null) {
            j.a().getClass();
        } else {
            aVar.f3841p = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3830d.f();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3829c) {
            j.a().getClass();
            this.f3830d.f();
            a();
            this.f3829c = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f3830d;
        aVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j a10 = j.a();
            Objects.toString(intent);
            a10.getClass();
            aVar.f3834b.d(new w3.b(aVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            aVar.d(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            aVar.d(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            j a11 = j.a();
            Objects.toString(intent);
            a11.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            j0 j0Var = aVar.f3833a;
            UUID fromString = UUID.fromString(stringExtra);
            j0Var.getClass();
            j0Var.f13940d.d(new y3.b(j0Var, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            j.a().getClass();
            a.C0038a aVar2 = aVar.f3841p;
            if (aVar2 == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) aVar2;
            systemForegroundService.f3829c = true;
            j.a().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
