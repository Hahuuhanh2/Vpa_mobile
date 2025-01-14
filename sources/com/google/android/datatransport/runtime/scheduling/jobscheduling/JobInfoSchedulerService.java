package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import f6.j;
import f6.s;
import f6.w;
import l6.f;
import p6.a;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5202a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i10));
        if (string2 != null) {
            a10.f10006b = Base64.decode(string2, 0);
        }
        l6.j jVar = w.a().f10033d;
        jVar.f12747e.execute(new f(jVar, a10.a(), i11, new v.f(21, this, jobParameters)));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
