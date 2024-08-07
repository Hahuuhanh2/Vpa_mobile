package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import f0.b0;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m9.f;
import r2.k;
import rb.d;
import tb.m;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, k {
    public static final Timer D = new Timer();
    public static final long E = TimeUnit.MINUTES.toMicros(1);
    public static volatile AppStartTrace F;
    public static ExecutorService G;
    public int A;
    public final a B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7623a = false;

    /* renamed from: b  reason: collision with root package name */
    public final d f7624b;

    /* renamed from: c  reason: collision with root package name */
    public final lb.b f7625c;

    /* renamed from: d  reason: collision with root package name */
    public final jb.a f7626d;

    /* renamed from: e  reason: collision with root package name */
    public final m.a f7627e;

    /* renamed from: f  reason: collision with root package name */
    public Context f7628f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7629n = false;

    /* renamed from: o  reason: collision with root package name */
    public final Timer f7630o;

    /* renamed from: p  reason: collision with root package name */
    public final Timer f7631p;

    /* renamed from: q  reason: collision with root package name */
    public Timer f7632q;

    /* renamed from: r  reason: collision with root package name */
    public Timer f7633r;

    /* renamed from: s  reason: collision with root package name */
    public Timer f7634s;

    /* renamed from: t  reason: collision with root package name */
    public Timer f7635t;

    /* renamed from: u  reason: collision with root package name */
    public Timer f7636u;

    /* renamed from: v  reason: collision with root package name */
    public Timer f7637v;

    /* renamed from: w  reason: collision with root package name */
    public Timer f7638w;

    /* renamed from: x  reason: collision with root package name */
    public Timer f7639x;

    /* renamed from: y  reason: collision with root package name */
    public PerfSession f7640y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7641z;

    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        public final void onDraw() {
            AppStartTrace.this.A++;
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final AppStartTrace f7643a;

        public b(AppStartTrace appStartTrace) {
            this.f7643a = appStartTrace;
        }

        public final void run() {
            AppStartTrace appStartTrace = this.f7643a;
            if (appStartTrace.f7632q == null) {
                appStartTrace.f7641z = true;
            }
        }
    }

    public AppStartTrace(d dVar, lb.b bVar, jb.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        Timer timer2 = null;
        this.f7632q = null;
        this.f7633r = null;
        this.f7634s = null;
        this.f7635t = null;
        this.f7636u = null;
        this.f7637v = null;
        this.f7638w = null;
        this.f7639x = null;
        this.f7641z = false;
        this.A = 0;
        this.B = new a();
        this.C = false;
        this.f7624b = dVar;
        this.f7625c = bVar;
        this.f7626d = aVar;
        G = threadPoolExecutor;
        m.a Z = m.Z();
        Z.A("_experiment_app_start_ttid");
        this.f7627e = Z;
        if (Build.VERSION.SDK_INT >= 24) {
            long d10 = Process.getStartElapsedRealtime();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(d10);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.f7630o = timer;
        f fVar = (f) m9.d.d().b(f.class);
        if (fVar != null) {
            long a10 = fVar.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(a10);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f7631p = timer2;
    }

    public static boolean c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String r10 = b0.r(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(r10))) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.f7631p;
        if (timer != null) {
            return timer;
        }
        return D;
    }

    public final Timer b() {
        Timer timer = this.f7630o;
        if (timer != null) {
            return timer;
        }
        return a();
    }

    public final void d(m.a aVar) {
        if (this.f7637v != null && this.f7638w != null && this.f7639x != null) {
            G.execute(new mb.b(0, this, aVar));
            e();
        }
    }

    public final synchronized void e() {
        if (this.f7623a) {
            s.f2817p.f2823f.c(this);
            ((Application) this.f7628f).unregisterActivityLifecycleCallbacks(this);
            this.f7623a = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f7641z     // Catch:{ all -> 0x0048 }
            if (r5 != 0) goto L_0x0046
            com.google.firebase.perf.util.Timer r5 = r3.f7632q     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x000a
            goto L_0x0046
        L_0x000a:
            boolean r5 = r3.C     // Catch:{ all -> 0x0048 }
            r0 = 1
            if (r5 != 0) goto L_0x001a
            android.content.Context r5 = r3.f7628f     // Catch:{ all -> 0x0048 }
            boolean r5 = c(r5)     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r5 = 0
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            r3.C = r5     // Catch:{ all -> 0x0048 }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0048 }
            r5.<init>(r4)     // Catch:{ all -> 0x0048 }
            lb.b r4 = r3.f7625c     // Catch:{ all -> 0x0048 }
            r4.getClass()     // Catch:{ all -> 0x0048 }
            com.google.firebase.perf.util.Timer r4 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r3.f7632q = r4     // Catch:{ all -> 0x0048 }
            com.google.firebase.perf.util.Timer r4 = r3.b()     // Catch:{ all -> 0x0048 }
            com.google.firebase.perf.util.Timer r5 = r3.f7632q     // Catch:{ all -> 0x0048 }
            r4.getClass()     // Catch:{ all -> 0x0048 }
            long r1 = r5.f7663b     // Catch:{ all -> 0x0048 }
            long r4 = r4.f7663b     // Catch:{ all -> 0x0048 }
            long r1 = r1 - r4
            long r4 = E     // Catch:{ all -> 0x0048 }
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0044
            r3.f7629n = r0     // Catch:{ all -> 0x0048 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            monitor-exit(r3)
            return
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (!this.f7641z && !this.f7629n && this.f7626d.f()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.B);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onActivityResumed(android.app.Activity r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f7641z     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r7.f7629n     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x000b
            goto L_0x00b9
        L_0x000b:
            jb.a r0 = r7.f7626d     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.f()     // Catch:{ all -> 0x00bb }
            r1 = 1
            if (r0 == 0) goto L_0x0072
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r8.findViewById(r2)     // Catch:{ all -> 0x00bb }
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.metrics.AppStartTrace$a r4 = r7.B     // Catch:{ all -> 0x00bb }
            r3.addOnDrawListener(r4)     // Catch:{ all -> 0x00bb }
            mb.a r3 = new mb.a     // Catch:{ all -> 0x00bb }
            r4 = 0
            r3.<init>(r7, r4)     // Catch:{ all -> 0x00bb }
            sb.c r5 = new sb.c     // Catch:{ all -> 0x00bb }
            r5.<init>(r2, r3)     // Catch:{ all -> 0x00bb }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00bb }
            r6 = 26
            if (r3 >= r6) goto L_0x0051
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.isAlive()     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0046
            boolean r3 = r2.isAttachedToWindow()     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x0046
            r4 = r1
        L_0x0046:
            if (r4 != 0) goto L_0x0051
            sb.b r3 = new sb.b     // Catch:{ all -> 0x00bb }
            r3.<init>(r5)     // Catch:{ all -> 0x00bb }
            r2.addOnAttachStateChangeListener(r3)     // Catch:{ all -> 0x00bb }
            goto L_0x0058
        L_0x0051:
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()     // Catch:{ all -> 0x00bb }
            r3.addOnDrawListener(r5)     // Catch:{ all -> 0x00bb }
        L_0x0058:
            d.h r3 = new d.h     // Catch:{ all -> 0x00bb }
            r4 = 23
            r3.<init>(r7, r4)     // Catch:{ all -> 0x00bb }
            d.i r4 = new d.i     // Catch:{ all -> 0x00bb }
            r5 = 22
            r4.<init>(r7, r5)     // Catch:{ all -> 0x00bb }
            sb.f r5 = new sb.f     // Catch:{ all -> 0x00bb }
            r5.<init>(r2, r3, r4)     // Catch:{ all -> 0x00bb }
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch:{ all -> 0x00bb }
            r2.addOnPreDrawListener(r5)     // Catch:{ all -> 0x00bb }
        L_0x0072:
            com.google.firebase.perf.util.Timer r2 = r7.f7634s     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0078
            monitor-exit(r7)
            return
        L_0x0078:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00bb }
            r2.<init>(r8)     // Catch:{ all -> 0x00bb }
            lb.b r2 = r7.f7625c     // Catch:{ all -> 0x00bb }
            r2.getClass()     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.util.Timer r2 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            r7.f7634s = r2     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.session.SessionManager r2 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.session.PerfSession r2 = r2.perfSession()     // Catch:{ all -> 0x00bb }
            r7.f7640y = r2     // Catch:{ all -> 0x00bb }
            lb.a r2 = lb.a.d()     // Catch:{ all -> 0x00bb }
            r8.getClass()     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.util.Timer r8 = r7.a()     // Catch:{ all -> 0x00bb }
            com.google.firebase.perf.util.Timer r3 = r7.f7634s     // Catch:{ all -> 0x00bb }
            r8.getClass()     // Catch:{ all -> 0x00bb }
            long r3 = r3.f7663b     // Catch:{ all -> 0x00bb }
            r2.a()     // Catch:{ all -> 0x00bb }
            java.util.concurrent.ExecutorService r8 = G     // Catch:{ all -> 0x00bb }
            mb.a r2 = new mb.a     // Catch:{ all -> 0x00bb }
            r2.<init>(r7, r1)     // Catch:{ all -> 0x00bb }
            r8.execute(r2)     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00b7
            r7.e()     // Catch:{ all -> 0x00bb }
        L_0x00b7:
            monitor-exit(r7)
            return
        L_0x00b9:
            monitor-exit(r7)
            return
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f7641z     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            com.google.firebase.perf.util.Timer r1 = r0.f7633r     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            boolean r1 = r0.f7629n     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x000e
            goto L_0x001c
        L_0x000e:
            lb.b r1 = r0.f7625c     // Catch:{ all -> 0x001e }
            r1.getClass()     // Catch:{ all -> 0x001e }
            com.google.firebase.perf.util.Timer r1 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            r0.f7633r = r1     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)
            return
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public final void onActivityStopped(Activity activity) {
    }

    @Keep
    @q(i.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f7641z && !this.f7629n && this.f7636u == null) {
            this.f7625c.getClass();
            this.f7636u = new Timer();
            m.a aVar = this.f7627e;
            m.a Z = m.Z();
            Z.A("_experiment_firstBackgrounding");
            Z.y(b().f7662a);
            Timer b10 = b();
            Timer timer = this.f7636u;
            b10.getClass();
            Z.z(timer.f7663b - b10.f7663b);
            aVar.w((m) Z.q());
        }
    }

    @Keep
    @q(i.a.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f7641z && !this.f7629n && this.f7635t == null) {
            this.f7625c.getClass();
            this.f7635t = new Timer();
            m.a aVar = this.f7627e;
            m.a Z = m.Z();
            Z.A("_experiment_firstForegrounding");
            Z.y(b().f7662a);
            Timer b10 = b();
            Timer timer = this.f7635t;
            b10.getClass();
            Z.z(timer.f7663b - b10.f7663b);
            aVar.w((m) Z.q());
        }
    }
}
