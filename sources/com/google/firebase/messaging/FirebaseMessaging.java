package com.google.firebase.messaging;

import ab.c;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import c6.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.a;
import d.i;
import fb.a0;
import fb.b0;
import fb.k;
import fb.l;
import fb.m;
import fb.n;
import fb.q;
import fb.u;
import fb.x;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.d;
import r0.f;
import xa.e;
import y6.j;
import za.b;

public class FirebaseMessaging {

    /* renamed from: l  reason: collision with root package name */
    public static final long f7582l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m  reason: collision with root package name */
    public static a f7583m;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: n  reason: collision with root package name */
    public static g f7584n;

    /* renamed from: o  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f7585o;

    /* renamed from: a  reason: collision with root package name */
    public final d f7586a;

    /* renamed from: b  reason: collision with root package name */
    public final ya.a f7587b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7588c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f7589d;

    /* renamed from: e  reason: collision with root package name */
    public final n f7590e;

    /* renamed from: f  reason: collision with root package name */
    public final u f7591f;

    /* renamed from: g  reason: collision with root package name */
    public final a f7592g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f7593h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f7594i;

    /* renamed from: j  reason: collision with root package name */
    public final q f7595j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7596k;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final wa.d f7597a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7598b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f7599c;

        public a(wa.d dVar) {
            this.f7597a = dVar;
        }

        public final synchronized void a() {
            if (!this.f7598b) {
                Boolean b10 = b();
                this.f7599c = b10;
                if (b10 == null) {
                    this.f7597a.b(new m(this));
                }
                this.f7598b = true;
            }
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            d dVar = FirebaseMessaging.this.f7586a;
            dVar.a();
            Context context = dVar.f13218a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(d dVar, ya.a aVar, b<ub.g> bVar, b<e> bVar2, c cVar, g gVar, wa.d dVar2) {
        d dVar3 = dVar;
        ya.a aVar2 = aVar;
        dVar.a();
        q qVar = new q(dVar3.f13218a);
        n nVar = new n(dVar, qVar, bVar, bVar2, cVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new i7.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i7.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i7.a("Firebase-Messaging-File-Io"));
        this.f7596k = false;
        f7584n = gVar;
        this.f7586a = dVar3;
        this.f7587b = aVar2;
        this.f7588c = cVar;
        this.f7592g = new a(dVar2);
        dVar.a();
        Context context = dVar3.f13218a;
        this.f7589d = context;
        k kVar = new k();
        this.f7595j = qVar;
        this.f7590e = nVar;
        this.f7591f = new u(newSingleThreadExecutor);
        this.f7593h = scheduledThreadPoolExecutor;
        this.f7594i = threadPoolExecutor;
        dVar.a();
        Context context2 = dVar3.f13218a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(kVar);
        } else {
            Objects.toString(context2);
        }
        if (aVar2 != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new l(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new i7.a("Firebase-Messaging-Topics-Io"));
        int i10 = b0.f10103j;
        Tasks.call(scheduledThreadPoolExecutor2, new a0(context, this, nVar, qVar, scheduledThreadPoolExecutor2)).addOnSuccessListener((Executor) scheduledThreadPoolExecutor, new ea.c(this, 22));
        scheduledThreadPoolExecutor.execute(new i(this, 20));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(x xVar, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f7585o == null) {
                f7585o = new ScheduledThreadPoolExecutor(1, new i7.a("TAG"));
            }
            f7585o.schedule(xVar, j10, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(d dVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) dVar.b(cls);
            j.g(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task<TContinuationResult> task;
        ya.a aVar = this.f7587b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a.C0070a c10 = c();
            if (!f(c10)) {
                return c10.f7611a;
            }
            String a10 = q.a(this.f7586a);
            u uVar = this.f7591f;
            synchronized (uVar) {
                task = (Task) uVar.f10166b.getOrDefault(a10, null);
                if (task != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                    n nVar = this.f7590e;
                    task = nVar.a(nVar.c(q.a(nVar.f10149a), "*", new Bundle())).onSuccessTask(this.f7594i, new f(this, a10, c10)).continueWithTask(uVar.f10165a, new b0.e(6, uVar, a10));
                    uVar.f10166b.put(a10, task);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public final a.C0070a c() {
        a aVar;
        String str;
        a.C0070a a10;
        Context context = this.f7589d;
        synchronized (FirebaseMessaging.class) {
            if (f7583m == null) {
                f7583m = new a(context);
            }
            aVar = f7583m;
        }
        d dVar = this.f7586a;
        dVar.a();
        if ("[DEFAULT]".equals(dVar.f13219b)) {
            str = "";
        } else {
            str = this.f7586a.f();
        }
        String a11 = q.a(this.f7586a);
        synchronized (aVar) {
            a10 = a.C0070a.a(aVar.f7608a.getString(a.a(str, a11), (String) null));
        }
        return a10;
    }

    public final void d() {
        ya.a aVar = this.f7587b;
        if (aVar != null) {
            aVar.a();
        } else if (f(c())) {
            synchronized (this) {
                if (!this.f7596k) {
                    e(0);
                }
            }
        }
    }

    public final synchronized void e(long j10) {
        b(new x(this, Math.min(Math.max(30, 2 * j10), f7582l)), j10);
        this.f7596k = true;
    }

    public final boolean f(a.C0070a aVar) {
        String str;
        boolean z10;
        if (aVar != null) {
            q qVar = this.f7595j;
            synchronized (qVar) {
                if (qVar.f10159b == null) {
                    qVar.c();
                }
                str = qVar.f10159b;
            }
            if (System.currentTimeMillis() > aVar.f7613c + a.C0070a.f7609d || !str.equals(aVar.f7612b)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
