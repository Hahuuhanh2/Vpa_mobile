package s3;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import o3.j;

@SuppressLint({"ClassVerificationFailure"})
/* compiled from: SystemJobInfoConverter */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f14603a;

    /* renamed from: b  reason: collision with root package name */
    public final o3.a f14604b;

    static {
        j.b("SystemJobInfoConverter");
    }

    public a(Context context, j7.a aVar) {
        this.f14604b = aVar;
        this.f14603a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (r2 < 26) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r2 >= 24) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo a(x3.s r13, int r14) {
        /*
            r12 = this;
            o3.c r0 = r13.f17028j
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r13.f17019a
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r3, r2)
            int r2 = r13.f17038t
            java.lang.String r3 = "EXTRA_WORK_SPEC_GENERATION"
            r1.putInt(r3, r2)
            boolean r2 = r13.c()
            java.lang.String r3 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r3, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = r12.f14603a
            r2.<init>(r14, r3)
            boolean r14 = r0.f13667b
            android.app.job.JobInfo$Builder r14 = r2.setRequiresCharging(r14)
            boolean r2 = r0.f13668c
            android.app.job.JobInfo$Builder r14 = r14.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r14 = r14.setExtras(r1)
            int r1 = r0.f13666a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 2
            r4 = 30
            r5 = 26
            r6 = 24
            r7 = 0
            r8 = 1
            if (r2 < r4) goto L_0x005a
            r4 = 6
            if (r1 != r4) goto L_0x005a
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r4 = 25
            android.net.NetworkRequest$Builder r1 = r1.addCapability(r4)
            android.net.NetworkRequest r1 = r1.build()
            r14.setRequiredNetwork(r1)
            goto L_0x0084
        L_0x005a:
            int r4 = v.v.g(r1)
            if (r4 == 0) goto L_0x0080
            if (r4 == r8) goto L_0x007e
            if (r4 == r3) goto L_0x007c
            r9 = 3
            if (r4 == r9) goto L_0x006e
            r9 = 4
            if (r4 == r9) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            if (r2 < r5) goto L_0x0071
            goto L_0x0081
        L_0x006e:
            if (r2 < r6) goto L_0x0071
            goto L_0x0081
        L_0x0071:
            o3.j r4 = o3.j.a()
            n0.l.q(r1)
            r4.getClass()
            goto L_0x007e
        L_0x007c:
            r9 = r3
            goto L_0x0081
        L_0x007e:
            r9 = r8
            goto L_0x0081
        L_0x0080:
            r9 = r7
        L_0x0081:
            r14.setRequiredNetworkType(r9)
        L_0x0084:
            boolean r1 = r0.f13668c
            if (r1 != 0) goto L_0x0094
            int r1 = r13.f17030l
            if (r1 != r3) goto L_0x008e
            r1 = r7
            goto L_0x008f
        L_0x008e:
            r1 = r8
        L_0x008f:
            long r3 = r13.f17031m
            r14.setBackoffCriteria(r3, r1)
        L_0x0094:
            long r3 = r13.a()
            o3.a r1 = r12.f14604b
            long r9 = r1.a()
            long r3 = r3 - r9
            r9 = 0
            long r3 = java.lang.Math.max(r3, r9)
            r1 = 28
            if (r2 > r1) goto L_0x00ad
            r14.setMinimumLatency(r3)
            goto L_0x00bc
        L_0x00ad:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r14.setMinimumLatency(r3)
            goto L_0x00bc
        L_0x00b5:
            boolean r1 = r13.f17035q
            if (r1 != 0) goto L_0x00bc
            r14.setImportantWhileForeground(true)
        L_0x00bc:
            if (r2 < r6) goto L_0x00ed
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x00ed
            java.util.Set<o3.c$a> r1 = r0.f13673h
            java.util.Iterator r1 = r1.iterator()
        L_0x00ca:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r1.next()
            o3.c$a r2 = (o3.c.a) r2
            boolean r6 = r2.f13675b
            android.app.job.JobInfo$TriggerContentUri r11 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r2 = r2.f13674a
            r11.<init>(r2, r6)
            r14.addTriggerContentUri(r11)
            goto L_0x00ca
        L_0x00e3:
            long r1 = r0.f13671f
            r14.setTriggerContentUpdateDelay(r1)
            long r1 = r0.f13672g
            r14.setTriggerContentMaxDelay(r1)
        L_0x00ed:
            r14.setPersisted(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L_0x00fe
            boolean r2 = r0.f13669d
            r14.setRequiresBatteryNotLow(r2)
            boolean r0 = r0.f13670e
            r14.setRequiresStorageNotLow(r0)
        L_0x00fe:
            int r0 = r13.f17029k
            if (r0 <= 0) goto L_0x0104
            r0 = r8
            goto L_0x0105
        L_0x0104:
            r0 = r7
        L_0x0105:
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x010a
            r7 = r8
        L_0x010a:
            r2 = 31
            if (r1 < r2) goto L_0x0119
            boolean r13 = r13.f17035q
            if (r13 == 0) goto L_0x0119
            if (r0 != 0) goto L_0x0119
            if (r7 != 0) goto L_0x0119
            r14.setExpedited(true)
        L_0x0119:
            android.app.job.JobInfo r13 = r14.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.a.a(x3.s, int):android.app.job.JobInfo");
    }
}
