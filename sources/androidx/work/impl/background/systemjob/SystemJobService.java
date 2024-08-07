package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.HashMap;
import o3.j;
import p3.d;
import p3.i0;
import p3.j0;
import p3.r;
import p3.w;
import x3.l;
import y0.h;

public class SystemJobService extends JobService implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f3820e = 0;

    /* renamed from: a  reason: collision with root package name */
    public j0 f3821a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3822b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final h f3823c = new h(1);

    /* renamed from: d  reason: collision with root package name */
    public i0 f3824d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            int c10 = jobParameters.getStopReason();
            int i10 = SystemJobService.f3820e;
            switch (c10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return c10;
                default:
                    return -512;
            }
        }
    }

    static {
        j.b("SystemJobService");
    }

    public static l a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void c(l lVar, boolean z10) {
        JobParameters jobParameters;
        j a10 = j.a();
        String str = lVar.f17010a;
        a10.getClass();
        synchronized (this.f3822b) {
            jobParameters = (JobParameters) this.f3822b.remove(lVar);
        }
        this.f3823c.i(lVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            j0 b10 = j0.b(getApplicationContext());
            this.f3821a = b10;
            r rVar = b10.f13942f;
            this.f3824d = new i0(rVar, b10.f13940d);
            rVar.a(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                j.a().getClass();
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        j0 j0Var = this.f3821a;
        if (j0Var != null) {
            r rVar = j0Var.f13942f;
            synchronized (rVar.f14021k) {
                rVar.f14020j.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 < 24) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.b(r6) == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r2.f3740b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.b(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.a(r6) == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r2.f3739a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.a(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r3 < 28) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        androidx.work.impl.background.systemjob.SystemJobService.b.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        r6 = r5.f3824d;
        r6.f13932b.d(new y3.q(r6.f13931a, r5.f3823c.m(r0), r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            p3.j0 r0 = r5.f3821a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            o3.j r0 = o3.j.a()
            r0.getClass()
            r5.jobFinished(r6, r1)
            return r2
        L_0x0011:
            x3.l r0 = a(r6)
            if (r0 != 0) goto L_0x001f
            o3.j r6 = o3.j.a()
            r6.getClass()
            return r2
        L_0x001f:
            java.util.HashMap r3 = r5.f3822b
            monitor-enter(r3)
            java.util.HashMap r4 = r5.f3822b     // Catch:{ all -> 0x008e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0036
            o3.j r6 = o3.j.a()     // Catch:{ all -> 0x008e }
            r0.toString()     // Catch:{ all -> 0x008e }
            r6.getClass()     // Catch:{ all -> 0x008e }
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0036:
            o3.j r2 = o3.j.a()     // Catch:{ all -> 0x008e }
            r0.toString()     // Catch:{ all -> 0x008e }
            r2.getClass()     // Catch:{ all -> 0x008e }
            java.util.HashMap r2 = r5.f3822b     // Catch:{ all -> 0x008e }
            r2.put(r0, r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0079
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r6)
            if (r4 == 0) goto L_0x0062
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r6)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f3740b = r4
        L_0x0062:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r6)
            if (r4 == 0) goto L_0x0072
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r6)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f3739a = r4
        L_0x0072:
            r4 = 28
            if (r3 < r4) goto L_0x0079
            androidx.work.impl.background.systemjob.SystemJobService.b.a(r6)
        L_0x0079:
            p3.i0 r6 = r5.f3824d
            y0.h r3 = r5.f3823c
            p3.w r0 = r3.m(r0)
            y3.q r3 = new y3.q
            p3.r r4 = r6.f13931a
            r3.<init>(r4, r0, r2)
            a4.b r6 = r6.f13932b
            r6.d(r3)
            return r1
        L_0x008e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i10;
        if (this.f3821a == null) {
            j.a().getClass();
            return true;
        }
        l a10 = a(jobParameters);
        if (a10 == null) {
            j.a().getClass();
            return false;
        }
        j a11 = j.a();
        a10.toString();
        a11.getClass();
        synchronized (this.f3822b) {
            this.f3822b.remove(a10);
        }
        w i11 = this.f3823c.i(a10);
        if (i11 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = c.a(jobParameters);
            } else {
                i10 = -512;
            }
            i0 i0Var = this.f3824d;
            i0Var.getClass();
            i0Var.a(i11, i10);
        }
        r rVar = this.f3821a.f13942f;
        String str = a10.f17010a;
        synchronized (rVar.f14021k) {
            contains = rVar.f14019i.contains(str);
        }
        return !contains;
    }
}
