package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i7.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t6.f;
import t6.n;
import t6.q;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f5317a;

    public CloudMessagingReceiver() {
        zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5317a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public abstract int a(Context context, CloudMessage cloudMessage);

    public void b(Bundle bundle) {
    }

    public final int c(Context context, Intent intent) {
        Task task;
        int i10;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            task = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            q a10 = q.a(context);
            synchronized (a10) {
                i10 = a10.f14877d;
                a10.f14877d = i10 + 1;
            }
            task = a10.b(new n(i10, bundle));
        }
        int a11 = a(context, new CloudMessage(intent));
        try {
            Tasks.await(task, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            new StringBuilder(String.valueOf(e10).length() + 20);
        }
        return a11;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.f5317a.execute(new f(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
