package s3;

import al.g0;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o3.j;
import o3.o;
import p3.t;
import x3.i;
import x3.l;
import x3.s;
import y3.h;

/* compiled from: SystemJobScheduler */
public final class b implements t {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f14605f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14606a;

    /* renamed from: b  reason: collision with root package name */
    public final JobScheduler f14607b;

    /* renamed from: c  reason: collision with root package name */
    public final a f14608c;

    /* renamed from: d  reason: collision with root package name */
    public final WorkDatabase f14609d;

    /* renamed from: e  reason: collision with root package name */
    public final a f14610e;

    static {
        j.b("SystemJobScheduler");
    }

    public b(Context context, WorkDatabase workDatabase, a aVar) {
        a aVar2 = new a(context, aVar.f3743c);
        this.f14606a = context;
        this.f14607b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f14608c = aVar2;
        this.f14609d = workDatabase;
        this.f14610e = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable unused) {
            j a10 = j.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)});
            a10.getClass();
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f10 = f(context, jobScheduler);
        if (f10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            l g2 = g(jobInfo);
            if (g2 != null && str.equals(g2.f17010a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            j.a().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static l g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b(String str) {
        ArrayList e10 = e(this.f14606a, this.f14607b, str);
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                c(this.f14607b, ((Integer) it.next()).intValue());
            }
            this.f14609d.r().d(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(s... sVarArr) {
        int i10;
        ArrayList e10;
        int i11;
        z.j jVar = new z.j(this.f14609d);
        int length = sVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            s sVar = sVarArr[i12];
            this.f14609d.c();
            try {
                s t10 = this.f14609d.u().t(sVar.f17019a);
                if (t10 == null) {
                    j.a().getClass();
                    this.f14609d.n();
                } else if (t10.f17020b != o.ENQUEUED) {
                    j.a().getClass();
                    this.f14609d.n();
                } else {
                    l Q = g0.Q(sVar);
                    i e11 = this.f14609d.r().e(Q);
                    if (e11 != null) {
                        i10 = e11.f17005c;
                    } else {
                        this.f14610e.getClass();
                        Object m10 = ((WorkDatabase) jVar.f17753b).m(new h(jVar, this.f14610e.f3748h));
                        sk.j.e(m10, "workDatabase.runInTransa…            id\n        })");
                        i10 = ((Number) m10).intValue();
                    }
                    if (e11 == null) {
                        this.f14609d.r().c(new i(Q.f17010a, Q.f17011b, i10));
                    }
                    h(sVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f14606a, this.f14607b, sVar.f17019a)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        if (!e10.isEmpty()) {
                            i11 = ((Integer) e10.get(0)).intValue();
                        } else {
                            this.f14610e.getClass();
                            Object m11 = ((WorkDatabase) jVar.f17753b).m(new h(jVar, this.f14610e.f3748h));
                            sk.j.e(m11, "workDatabase.runInTransa…            id\n        })");
                            i11 = ((Number) m11).intValue();
                        }
                        h(sVar, i11);
                    }
                    this.f14609d.n();
                }
                this.f14609d.j();
                i12++;
            } catch (Throwable th2) {
                this.f14609d.j();
                throw th2;
            }
        }
    }

    public final void h(s sVar, int i10) {
        int i11;
        JobInfo a10 = this.f14608c.a(sVar, i10);
        j.a().getClass();
        try {
            if (this.f14607b.schedule(a10) == 0) {
                j.a().getClass();
                if (sVar.f17035q && sVar.f17036r == 1) {
                    sVar.f17035q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{sVar.f17019a});
                    j.a().getClass();
                    h(sVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f10 = f(this.f14606a, this.f14607b);
            if (f10 != null) {
                i11 = f10.size();
            } else {
                i11 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i11), Integer.valueOf(this.f14609d.u().k().size()), Integer.valueOf(this.f14610e.f3750j)});
            j.a().getClass();
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            this.f14610e.getClass();
            throw illegalStateException;
        } catch (Throwable unused) {
            j a11 = j.a();
            sVar.toString();
            a11.getClass();
        }
    }
}
