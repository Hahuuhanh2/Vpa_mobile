package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import o3.j;
import p3.j0;
import y3.n;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public static final long f3846e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3847a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f3848b;

    /* renamed from: c  reason: collision with root package name */
    public final n f3849c;

    /* renamed from: d  reason: collision with root package name */
    public int f3850d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            j.b("ForceStopRunnable$Rcvr");
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                j.a().getClass();
                ForceStopRunnable.b(context);
            }
        }
    }

    static {
        j.b("ForceStopRunnable");
    }

    public ForceStopRunnable(Context context, j0 j0Var) {
        this.f3847a = context.getApplicationContext();
        this.f3848b = j0Var;
        this.f3849c = j0Var.f13943g;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void b(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f3846e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            java.lang.String r0 = "last_force_stop_ms"
            android.content.Context r1 = r14.f3847a
            p3.j0 r2 = r14.f3848b
            androidx.work.impl.WorkDatabase r2 = r2.f13939c
            int r3 = s3.b.f14605f
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            java.util.ArrayList r1 = s3.b.f(r1, r3)
            x3.j r4 = r2.r()
            java.util.ArrayList r4 = r4.a()
            r5 = 0
            if (r1 == 0) goto L_0x0026
            int r6 = r1.size()
            goto L_0x0027
        L_0x0026:
            r6 = r5
        L_0x0027:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r6)
            if (r1 == 0) goto L_0x0058
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x0058
            java.util.Iterator r1 = r1.iterator()
        L_0x0038:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r1.next()
            android.app.job.JobInfo r6 = (android.app.job.JobInfo) r6
            x3.l r8 = s3.b.g(r6)
            if (r8 == 0) goto L_0x0050
            java.lang.String r6 = r8.f17010a
            r7.add(r6)
            goto L_0x0038
        L_0x0050:
            int r6 = r6.getId()
            s3.b.c(r3, r6)
            goto L_0x0038
        L_0x0058:
            java.util.Iterator r1 = r4.iterator()
        L_0x005c:
            boolean r3 = r1.hasNext()
            r6 = 1
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x005c
            o3.j r1 = o3.j.a()
            r1.getClass()
            r1 = r6
            goto L_0x0079
        L_0x0078:
            r1 = r5
        L_0x0079:
            r7 = -1
            if (r1 == 0) goto L_0x00a4
            r2.c()
            x3.t r3 = r2.u()     // Catch:{ all -> 0x009f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x009f }
        L_0x0088:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x009f }
            if (r9 == 0) goto L_0x0098
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x009f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x009f }
            r3.e(r7, r9)     // Catch:{ all -> 0x009f }
            goto L_0x0088
        L_0x0098:
            r2.n()     // Catch:{ all -> 0x009f }
            r2.j()
            goto L_0x00a4
        L_0x009f:
            r0 = move-exception
            r2.j()
            throw r0
        L_0x00a4:
            p3.j0 r2 = r14.f3848b
            androidx.work.impl.WorkDatabase r2 = r2.f13939c
            x3.t r3 = r2.u()
            x3.q r4 = r2.t()
            r2.c()
            java.util.ArrayList r9 = r3.n()     // Catch:{ all -> 0x0213 }
            if (r9 == 0) goto L_0x00c1
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0213 }
            if (r10 != 0) goto L_0x00c1
            r10 = r6
            goto L_0x00c2
        L_0x00c1:
            r10 = r5
        L_0x00c2:
            if (r10 == 0) goto L_0x00e8
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0213 }
        L_0x00c8:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0213 }
            if (r11 == 0) goto L_0x00e8
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0213 }
            x3.s r11 = (x3.s) r11     // Catch:{ all -> 0x0213 }
            o3.o r12 = o3.o.ENQUEUED     // Catch:{ all -> 0x0213 }
            java.lang.String r13 = r11.f17019a     // Catch:{ all -> 0x0213 }
            r3.m(r12, r13)     // Catch:{ all -> 0x0213 }
            java.lang.String r12 = r11.f17019a     // Catch:{ all -> 0x0213 }
            r13 = -512(0xfffffffffffffe00, float:NaN)
            r3.o(r13, r12)     // Catch:{ all -> 0x0213 }
            java.lang.String r11 = r11.f17019a     // Catch:{ all -> 0x0213 }
            r3.e(r7, r11)     // Catch:{ all -> 0x0213 }
            goto L_0x00c8
        L_0x00e8:
            r4.b()     // Catch:{ all -> 0x0213 }
            r2.n()     // Catch:{ all -> 0x0213 }
            r2.j()
            if (r10 != 0) goto L_0x00f8
            if (r1 == 0) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r1 = r5
            goto L_0x00f9
        L_0x00f8:
            r1 = r6
        L_0x00f9:
            p3.j0 r2 = r14.f3848b
            y3.n r2 = r2.f13943g
            androidx.work.impl.WorkDatabase r2 = r2.f17404a
            x3.e r2 = r2.q()
            java.lang.String r3 = "reschedule_needed"
            java.lang.Long r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0117
            long r7 = r2.longValue()
            r9 = 1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0117
            r2 = r6
            goto L_0x0118
        L_0x0117:
            r2 = r5
        L_0x0118:
            r7 = 0
            if (r2 == 0) goto L_0x0143
            o3.j r0 = o3.j.a()
            r0.getClass()
            p3.j0 r0 = r14.f3848b
            r0.e()
            p3.j0 r0 = r14.f3848b
            y3.n r0 = r0.f13943g
            r0.getClass()
            x3.d r1 = new x3.d
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r1.<init>(r3, r2)
            androidx.work.impl.WorkDatabase r0 = r0.f17404a
            x3.e r0 = r0.q()
            r0.b(r1)
            goto L_0x0212
        L_0x0143:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r4 = 31
            if (r3 < r4) goto L_0x014d
            r2 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x014d:
            android.content.Context r4 = r14.f3847a     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r9.<init>()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            android.content.ComponentName r10 = new android.content.ComponentName     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r11 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r10.<init>(r4, r11)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r9.setComponent(r10)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            java.lang.String r10 = "ACTION_FORCE_STOP_RESCHEDULE"
            r9.setAction(r10)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r10 = -1
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r4, r10, r9, r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r4 = 30
            if (r3 < r4) goto L_0x01bb
            if (r2 == 0) goto L_0x0171
            r2.cancel()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
        L_0x0171:
            android.content.Context r2 = r14.f3847a     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r3 = 0
            java.util.List r2 = r2.getHistoricalProcessExitReasons(r3, r5, r5)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            if (r2 == 0) goto L_0x01cb
            boolean r3 = r2.isEmpty()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            if (r3 != 0) goto L_0x01cb
            y3.n r3 = r14.f3849c     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            androidx.work.impl.WorkDatabase r3 = r3.f17404a     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            x3.e r3 = r3.q()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            java.lang.Long r3 = r3.a(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            if (r3 == 0) goto L_0x019a
            long r7 = r3.longValue()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
        L_0x019a:
            r3 = r5
        L_0x019b:
            int r4 = r2.size()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            if (r3 >= r4) goto L_0x01cb
            java.lang.Object r4 = r2.get(r3)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            android.app.ApplicationExitInfo r4 = (android.app.ApplicationExitInfo) r4     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            int r9 = r4.getReason()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            r10 = 10
            if (r9 != r10) goto L_0x01b8
            long r9 = r4.getTimestamp()     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x01b8
            goto L_0x01ca
        L_0x01b8:
            int r3 = r3 + 1
            goto L_0x019b
        L_0x01bb:
            if (r2 != 0) goto L_0x01cb
            android.content.Context r2 = r14.f3847a     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            b(r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x01c3 }
            goto L_0x01ca
        L_0x01c3:
            o3.j r2 = o3.j.a()
            r2.getClass()
        L_0x01ca:
            r5 = r6
        L_0x01cb:
            if (r5 == 0) goto L_0x01fe
            o3.j r1 = o3.j.a()
            r1.getClass()
            p3.j0 r1 = r14.f3848b
            r1.e()
            y3.n r1 = r14.f3849c
            p3.j0 r2 = r14.f3848b
            androidx.work.a r2 = r2.f13938b
            j7.a r2 = r2.f3743c
            r2.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            r1.getClass()
            x3.d r4 = new x3.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.<init>(r0, r2)
            androidx.work.impl.WorkDatabase r0 = r1.f17404a
            x3.e r0 = r0.q()
            r0.b(r4)
            goto L_0x0212
        L_0x01fe:
            if (r1 == 0) goto L_0x0212
            o3.j r0 = o3.j.a()
            r0.getClass()
            p3.j0 r0 = r14.f3848b
            androidx.work.a r1 = r0.f13938b
            androidx.work.impl.WorkDatabase r2 = r0.f13939c
            java.util.List<p3.t> r0 = r0.f13941e
            p3.v.b(r1, r2, r0)
        L_0x0212:
            return
        L_0x0213:
            r0 = move-exception
            r2.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:8|9|10|11|12|13|39|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d A[LOOP:0: B:8:0x002d->B:38:0x002d, LOOP_START, SYNTHETIC, Splitter:B:8:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            p3.j0 r0 = r5.f3848b     // Catch:{ all -> 0x0089 }
            androidx.work.a r0 = r0.f13938b     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0089 }
            r2 = 1
            if (r1 == 0) goto L_0x0018
            o3.j r0 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            r0 = r2
            goto L_0x0025
        L_0x0018:
            android.content.Context r1 = r5.f3847a     // Catch:{ all -> 0x0089 }
            boolean r0 = y3.o.a(r1, r0)     // Catch:{ all -> 0x0089 }
            o3.j r1 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r1.getClass()     // Catch:{ all -> 0x0089 }
        L_0x0025:
            if (r0 != 0) goto L_0x002d
            p3.j0 r0 = r5.f3848b
            r0.d()
            return
        L_0x002d:
            android.content.Context r0 = r5.f3847a     // Catch:{ SQLiteException -> 0x008b }
            p3.a0.a(r0)     // Catch:{ SQLiteException -> 0x008b }
            o3.j r0 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            r5.a()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x004e, SQLiteDiskIOException -> 0x004c, SQLiteDatabaseCorruptException -> 0x004a, SQLiteDatabaseLockedException -> 0x0048, SQLiteTableLockedException -> 0x0046, SQLiteConstraintException -> 0x0044, SQLiteAccessPermException -> 0x0042 }
            p3.j0 r0 = r5.f3848b
            r0.d()
            return
        L_0x0042:
            r0 = move-exception
            goto L_0x004f
        L_0x0044:
            r0 = move-exception
            goto L_0x004f
        L_0x0046:
            r0 = move-exception
            goto L_0x004f
        L_0x0048:
            r0 = move-exception
            goto L_0x004f
        L_0x004a:
            r0 = move-exception
            goto L_0x004f
        L_0x004c:
            r0 = move-exception
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            int r1 = r5.f3850d     // Catch:{ all -> 0x0089 }
            int r1 = r1 + r2
            r5.f3850d = r1     // Catch:{ all -> 0x0089 }
            r3 = 3
            if (r1 < r3) goto L_0x0078
            android.content.Context r1 = r5.f3847a     // Catch:{ all -> 0x0089 }
            boolean r1 = s1.o.a(r1)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            goto L_0x0064
        L_0x0062:
            java.lang.String r1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
        L_0x0064:
            o3.j r2 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r2.getClass()     // Catch:{ all -> 0x0089 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0089 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0089 }
            p3.j0 r0 = r5.f3848b     // Catch:{ all -> 0x0089 }
            androidx.work.a r0 = r0.f13938b     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            throw r2     // Catch:{ all -> 0x0089 }
        L_0x0078:
            o3.j r0 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            int r0 = r5.f3850d     // Catch:{ all -> 0x0089 }
            long r0 = (long) r0
            r3 = 300(0x12c, double:1.48E-321)
            long r0 = r0 * r3
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x002d }
            goto L_0x002d
        L_0x0089:
            r0 = move-exception
            goto L_0x00a2
        L_0x008b:
            r0 = move-exception
            java.lang.String r1 = "Unexpected SQLite exception during migrations"
            o3.j r2 = o3.j.a()     // Catch:{ all -> 0x0089 }
            r2.getClass()     // Catch:{ all -> 0x0089 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0089 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0089 }
            p3.j0 r0 = r5.f3848b     // Catch:{ all -> 0x0089 }
            androidx.work.a r0 = r0.f13938b     // Catch:{ all -> 0x0089 }
            r0.getClass()     // Catch:{ all -> 0x0089 }
            throw r2     // Catch:{ all -> 0x0089 }
        L_0x00a2:
            p3.j0 r1 = r5.f3848b
            r1.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
