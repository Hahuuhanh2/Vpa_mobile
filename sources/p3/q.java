package p3;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import x3.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14006a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14007b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14008c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f14009d;

    public /* synthetic */ q(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f14008c = context;
        this.f14007b = z10;
        this.f14009d = taskCompletionSource;
    }

    public /* synthetic */ q(r rVar, l lVar) {
        this.f14008c = rVar;
        this.f14009d = lVar;
        this.f14007b = false;
    }

    public final void run() {
        boolean z10;
        switch (this.f14006a) {
            case 0:
                r rVar = (r) this.f14008c;
                l lVar = (l) this.f14009d;
                boolean z11 = this.f14007b;
                synchronized (rVar.f14021k) {
                    Iterator it = rVar.f14020j.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).c(lVar, z11);
                    }
                }
                return;
            default:
                Context context = (Context) this.f14008c;
                boolean z12 = this.f14007b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f14009d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        context.getPackageName();
                    } else {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z12) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate((String) null);
                        }
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
        }
    }
}
