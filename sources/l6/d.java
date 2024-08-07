package l6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f6.s;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import l6.e;
import p6.a;

/* compiled from: JobInfoScheduler */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12722a;

    /* renamed from: b  reason: collision with root package name */
    public final m6.d f12723b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12724c;

    public d(Context context, m6.d dVar, e eVar) {
        this.f12722a = context;
        this.f12723b = dVar;
        this.f12724c = eVar;
    }

    public final void a(s sVar, int i10) {
        b(sVar, i10, false);
    }

    public final void b(s sVar, int i10, boolean z10) {
        boolean z11;
        s sVar2 = sVar;
        int i11 = i10;
        ComponentName componentName = new ComponentName(this.f12722a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f12722a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f12722a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i12 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i12 >= i11) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                j6.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", sVar2);
                return;
            }
        }
        long h02 = this.f12723b.h0(sVar2);
        e eVar = this.f12724c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        c6.d d10 = sVar.d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(eVar.b(d10, h02, i11));
        Set<e.b> b10 = eVar.c().get(d10).b();
        if (b10.contains(e.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(e.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(e.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar2, Integer.valueOf(value), Long.valueOf(this.f12724c.b(sVar.d(), h02, i11)), Long.valueOf(h02), Integer.valueOf(i10)};
        if (Log.isLoggable(j6.a.b(str), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
