package p3;

import a4.b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o3.j;
import o3.p;
import v3.l;
import y3.e;
import y3.n;

/* compiled from: WorkManagerImpl */
public final class j0 extends p {

    /* renamed from: k  reason: collision with root package name */
    public static j0 f13934k = null;

    /* renamed from: l  reason: collision with root package name */
    public static j0 f13935l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f13936m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f13937a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.a f13938b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f13939c;

    /* renamed from: d  reason: collision with root package name */
    public b f13940d;

    /* renamed from: e  reason: collision with root package name */
    public List<t> f13941e;

    /* renamed from: f  reason: collision with root package name */
    public r f13942f;

    /* renamed from: g  reason: collision with root package name */
    public n f13943g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13944h = false;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f13945i;

    /* renamed from: j  reason: collision with root package name */
    public final l f13946j;

    /* compiled from: WorkManagerImpl */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        j.b("WorkManagerImpl");
    }

    public j0(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, List<t> list, r rVar, l lVar) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 24 || !a.a(applicationContext)) {
            j.a aVar2 = new j.a(aVar.f3747g);
            synchronized (j.f13683a) {
                j.f13684b = aVar2;
            }
            this.f13937a = applicationContext;
            this.f13940d = bVar;
            this.f13939c = workDatabase;
            this.f13942f = rVar;
            this.f13946j = lVar;
            this.f13938b = aVar;
            this.f13941e = list;
            this.f13943g = new n(workDatabase);
            y3.p c10 = bVar.c();
            WorkDatabase workDatabase2 = this.f13939c;
            int i10 = v.f14027a;
            rVar.a(new u(c10, list, aVar, workDatabase2));
            this.f13940d.d(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static p3.j0 b(android.content.Context r2) {
        /*
            java.lang.Object r0 = f13936m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            p3.j0 r1 = f13934k     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            p3.j0 r1 = f13935l     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof androidx.work.a.b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.a$b r1 = (androidx.work.a.b) r1     // Catch:{ all -> 0x0035 }
            androidx.work.a r1 = r1.a()     // Catch:{ all -> 0x0035 }
            c(r2, r1)     // Catch:{ all -> 0x0035 }
            p3.j0 r1 = b(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.j0.b(android.content.Context):p3.j0");
    }

    public static void c(Context context, androidx.work.a aVar) {
        synchronized (f13936m) {
            j0 j0Var = f13934k;
            if (j0Var != null) {
                if (f13935l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (j0Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (f13935l == null) {
                    f13935l = l0.C(applicationContext, aVar);
                }
                f13934k = f13935l;
            }
        }
    }

    public final o a(List list) {
        if (!list.isEmpty()) {
            x xVar = new x(this, list);
            if (!xVar.f14036p) {
                e eVar = new e(xVar);
                this.f13940d.d(eVar);
                xVar.f14037q = eVar.f17398b;
            } else {
                j a10 = j.a();
                TextUtils.join(", ", xVar.f14033f);
                a10.getClass();
            }
            return xVar.f14037q;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void d() {
        synchronized (f13936m) {
            this.f13944h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f13945i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f13945i = null;
            }
        }
    }

    public final void e() {
        ArrayList f10;
        Context context = this.f13937a;
        int i10 = s3.b.f14605f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (f10 = s3.b.f(context, jobScheduler)) == null || f10.isEmpty())) {
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                s3.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.f13939c.u().z();
        v.b(this.f13938b, this.f13939c, this.f13941e);
    }
}
