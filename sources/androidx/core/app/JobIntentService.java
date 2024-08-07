package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<ComponentName, f> f2086f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public e f2087a;

    /* renamed from: b  reason: collision with root package name */
    public f f2088b;

    /* renamed from: c  reason: collision with root package name */
    public a f2089c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2090d = false;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<c> f2091e;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        public final Object doInBackground(Object[] objArr) {
            d dVar;
            Void[] voidArr = (Void[]) objArr;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                e eVar = jobIntentService.f2087a;
                if (eVar != null) {
                    dVar = eVar.a();
                } else {
                    synchronized (jobIntentService.f2091e) {
                        if (jobIntentService.f2091e.size() > 0) {
                            dVar = jobIntentService.f2091e.remove(0);
                        } else {
                            dVar = null;
                        }
                    }
                }
                if (dVar == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                dVar.getIntent();
                jobIntentService2.b();
                dVar.a();
            }
            while (true) {
            }
        }

        public final void onCancelled(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.c();
        }

        public final void onPostExecute(Object obj) {
            Void voidR = (Void) obj;
            JobIntentService.this.c();
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final PowerManager.WakeLock f2093a;

        /* renamed from: b  reason: collision with root package name */
        public final PowerManager.WakeLock f2094b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2095c;

        public b(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2093a = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2094b = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public final void a() {
            synchronized (this) {
                if (this.f2095c) {
                    this.f2095c = false;
                    this.f2094b.release();
                }
            }
        }

        public final void b() {
            synchronized (this) {
                if (!this.f2095c) {
                    this.f2095c = true;
                    this.f2094b.acquire(600000);
                    this.f2093a.release();
                }
            }
        }

        public final void c() {
            synchronized (this) {
            }
        }
    }

    public final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f2096a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2097b;

        public c(Intent intent, int i10) {
            this.f2096a = intent;
            this.f2097b = i10;
        }

        public final void a() {
            JobIntentService.this.stopSelf(this.f2097b);
        }

        public final Intent getIntent() {
            return this.f2096a;
        }
    }

    public interface d {
        void a();

        Intent getIntent();
    }

    public static final class e extends JobServiceEngine {

        /* renamed from: a  reason: collision with root package name */
        public final JobIntentService f2099a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f2100b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public JobParameters f2101c;

        public final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final JobWorkItem f2102a;

            public a(JobWorkItem jobWorkItem) {
                this.f2102a = jobWorkItem;
            }

            public final void a() {
                synchronized (e.this.f2100b) {
                    JobParameters jobParameters = e.this.f2101c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2102a);
                    }
                }
            }

            public final Intent getIntent() {
                return this.f2102a.getIntent();
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2099a = jobIntentService;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2099a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.e.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.core.app.JobIntentService.e.a a() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2100b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2101c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f2099a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$e$a r0 = new androidx.core.app.JobIntentService$e$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.e.a():androidx.core.app.JobIntentService$e$a");
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f2101c = jobParameters;
            this.f2099a.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f2099a.f2089c;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f2100b) {
                this.f2101c = null;
            }
            return true;
        }
    }

    public static abstract class f {
        public f(ComponentName componentName) {
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2091e = null;
        } else {
            this.f2091e = new ArrayList<>();
        }
    }

    public final void a(boolean z10) {
        if (this.f2089c == null) {
            this.f2089c = new a();
            f fVar = this.f2088b;
            if (fVar != null && z10) {
                fVar.b();
            }
            this.f2089c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList<c> arrayList = this.f2091e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2089c = null;
                ArrayList<c> arrayList2 = this.f2091e;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f2090d) {
                    this.f2088b.a();
                }
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        e eVar = this.f2087a;
        if (eVar != null) {
            return eVar.getBinder();
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f2087a = new e(this);
            this.f2088b = null;
            return;
        }
        this.f2087a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, f> hashMap = f2086f;
        f fVar = hashMap.get(componentName);
        if (fVar == null) {
            if (i10 < 26) {
                fVar = new b(this, componentName);
                hashMap.put(componentName, fVar);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
        }
        this.f2088b = fVar;
    }

    public final void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f2091e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2090d = true;
                this.f2088b.a();
            }
        }
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f2091e == null) {
            return 2;
        }
        this.f2088b.c();
        synchronized (this.f2091e) {
            ArrayList<c> arrayList = this.f2091e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i11));
            a(true);
        }
        return 3;
    }
}
