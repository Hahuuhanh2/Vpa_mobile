package t6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v0.h;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static int f14835h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f14836i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f14837j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    public final h<String, TaskCompletionSource<Bundle>> f14838a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f14839b;

    /* renamed from: c  reason: collision with root package name */
    public final r f14840c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14841d;

    /* renamed from: e  reason: collision with root package name */
    public Messenger f14842e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f14843f;

    /* renamed from: g  reason: collision with root package name */
    public zzd f14844g;

    public a(Context context) {
        this.f14839b = context;
        this.f14840c = new r(context);
        this.f14842e = new Messenger(new c(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14841d = scheduledThreadPoolExecutor;
    }

    public final Task<Bundle> a(Bundle bundle) {
        String num;
        Class<a> cls = a.class;
        synchronized (cls) {
            int i10 = f14835h;
            f14835h = i10 + 1;
            num = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f14838a) {
            this.f14838a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f14840c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f14839b;
        synchronized (cls) {
            if (f14836i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f14836i = zza.zza(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f14836i);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(num).length() + 5);
        sb2.append("|ID|");
        sb2.append(num);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra("google.messenger", this.f14842e);
        if (!(this.f14843f == null && this.f14844g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14843f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f14844g.f5318a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            taskCompletionSource.getTask().addOnCompleteListener((Executor) t.f14884a, new s(this, num, this.f14841d.schedule(new h(taskCompletionSource, 1), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f14840c.a() == 2) {
            this.f14839b.sendBroadcast(intent);
        } else {
            this.f14839b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener((Executor) t.f14884a, new s(this, num, this.f14841d.schedule(new h(taskCompletionSource, 1), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.os.Bundle r3, java.lang.String r4) {
        /*
            r2 = this;
            v0.h<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r0 = r2.f14838a
            monitor-enter(r0)
            v0.h<java.lang.String, com.google.android.gms.tasks.TaskCompletionSource<android.os.Bundle>> r1 = r2.f14838a     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001e
            java.lang.String r3 = "Missing callback for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0023 }
            int r1 = r4.length()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            r3.concat(r4)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x001e:
            r1.setResult(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.a.b(android.os.Bundle, java.lang.String):void");
    }
}
