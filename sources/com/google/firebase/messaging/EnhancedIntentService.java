package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.b;
import fb.e0;
import fb.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v.i;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f7575f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f7576a;

    /* renamed from: b  reason: collision with root package name */
    public b f7577b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7578c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f7579d;

    /* renamed from: e  reason: collision with root package name */
    public int f7580e = 0;

    public class a implements b.a {
        public a() {
        }
    }

    public EnhancedIntentService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i7.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7576a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            e0.a(intent);
        }
        synchronized (this.f7578c) {
            int i10 = this.f7580e - 1;
            this.f7580e = i10;
            if (i10 == 0) {
                stopSelfResult(this.f7579d);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Log.isLoggable("EnhancedIntentService", 3);
        if (this.f7577b == null) {
            this.f7577b = new b(new a());
        }
        return this.f7577b;
    }

    public final void onDestroy() {
        this.f7576a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f7578c) {
            this.f7579d = i11;
            this.f7580e++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7576a.execute(new i(6, this, b10, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) new w2.b(2), new h(this, intent));
        return 3;
    }
}
