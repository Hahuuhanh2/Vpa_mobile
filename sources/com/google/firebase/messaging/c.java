package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.i;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection */
public final class c implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7615a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f7616b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f7617c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f7618d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public b f7619e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7620f = false;

    /* compiled from: WithinAppServiceConnection */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f7621a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f7622b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f7621a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public c(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new i7.a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f7615a = applicationContext;
        this.f7616b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f7617c = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r1.c(r2, r2.getClass().getName(), r8.f7616b, r8, 65, (java.util.concurrent.Executor) null) != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
        L_0x0007:
            java.util.ArrayDeque r0 = r8.f7618d     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            com.google.firebase.messaging.b r0 = r8.f7619e     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            java.util.ArrayDeque r0 = r8.f7618d     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0077 }
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.c.a) r0     // Catch:{ all -> 0x0077 }
            com.google.firebase.messaging.b r2 = r8.f7619e     // Catch:{ all -> 0x0077 }
            r2.a(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0007
        L_0x0031:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0077 }
            boolean r0 = r8.f7620f     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x003b
            goto L_0x0073
        L_0x003b:
            r0 = 1
            r8.f7620f = r0     // Catch:{ all -> 0x0077 }
            g7.a r1 = g7.a.a()     // Catch:{ SecurityException -> 0x0059 }
            android.content.Context r2 = r8.f7615a     // Catch:{ SecurityException -> 0x0059 }
            android.content.Intent r4 = r8.f7616b     // Catch:{ SecurityException -> 0x0059 }
            r6 = 65
            java.lang.Class r0 = r2.getClass()     // Catch:{ SecurityException -> 0x0059 }
            java.lang.String r3 = r0.getName()     // Catch:{ SecurityException -> 0x0059 }
            r7 = 0
            r5 = r8
            boolean r0 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0059 }
            if (r0 == 0) goto L_0x0059
            goto L_0x0073
        L_0x0059:
            r0 = 0
            r8.f7620f = r0     // Catch:{ all -> 0x0077 }
        L_0x005c:
            java.util.ArrayDeque r0 = r8.f7618d     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0073
            java.util.ArrayDeque r0 = r8.f7618d     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0077 }
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.c.a) r0     // Catch:{ all -> 0x0077 }
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f7622b     // Catch:{ all -> 0x0077 }
            r1 = 0
            r0.trySetResult(r1)     // Catch:{ all -> 0x0077 }
            goto L_0x005c
        L_0x0073:
            monitor-exit(r8)
            return
        L_0x0075:
            monitor-exit(r8)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.c.a():void");
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f7617c;
        aVar.f7622b.getTask().addOnCompleteListener((Executor) scheduledExecutorService, new ca.a(scheduledExecutorService.schedule(new i(aVar, 21), 20, TimeUnit.SECONDS), 0));
        this.f7618d.add(aVar);
        a();
        return aVar.f7622b.getTask();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        this.f7620f = false;
        if (!(iBinder instanceof b)) {
            Objects.toString(iBinder);
            while (!this.f7618d.isEmpty()) {
                ((a) this.f7618d.poll()).f7622b.trySetResult(null);
            }
            return;
        }
        this.f7619e = (b) iBinder;
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
