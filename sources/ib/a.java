package ib;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.t;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import i1.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mb.c;
import rb.d;
import sb.e;
import sb.h;
import tb.k;
import tb.m;

/* compiled from: AppStateMonitor */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: y  reason: collision with root package name */
    public static final lb.a f11396y = lb.a.d();

    /* renamed from: z  reason: collision with root package name */
    public static volatile a f11397z;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Activity, Boolean> f11398a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Activity, d> f11399b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap<Activity, c> f11400c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Activity, Trace> f11401d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f11402e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f11403f = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public HashSet f11404n = new HashSet();

    /* renamed from: o  reason: collision with root package name */
    public final AtomicInteger f11405o = new AtomicInteger(0);

    /* renamed from: p  reason: collision with root package name */
    public final d f11406p;

    /* renamed from: q  reason: collision with root package name */
    public final jb.a f11407q;

    /* renamed from: r  reason: collision with root package name */
    public final lb.b f11408r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f11409s;

    /* renamed from: t  reason: collision with root package name */
    public Timer f11410t;

    /* renamed from: u  reason: collision with root package name */
    public Timer f11411u;

    /* renamed from: v  reason: collision with root package name */
    public tb.d f11412v = tb.d.BACKGROUND;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11413w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11414x = true;

    /* renamed from: ib.a$a  reason: collision with other inner class name */
    /* compiled from: AppStateMonitor */
    public interface C0126a {
        void a();
    }

    /* compiled from: AppStateMonitor */
    public interface b {
        void a(tb.d dVar);
    }

    public a(d dVar, lb.b bVar) {
        jb.a e10 = jb.a.e();
        lb.a aVar = d.f11425e;
        this.f11406p = dVar;
        this.f11408r = bVar;
        this.f11407q = e10;
        this.f11409s = true;
    }

    public static a a() {
        if (f11397z == null) {
            synchronized (a.class) {
                if (f11397z == null) {
                    f11397z = new a(d.f14546z, new lb.b(7));
                }
            }
        }
        return f11397z;
    }

    public final void b(String str) {
        synchronized (this.f11402e) {
            Long l10 = (Long) this.f11402e.get(str);
            if (l10 == null) {
                this.f11402e.put(str, 1L);
            } else {
                this.f11402e.put(str, Long.valueOf(l10.longValue() + 1));
            }
        }
    }

    public final void c(Activity activity) {
        e<c> eVar;
        Trace trace = this.f11401d.get(activity);
        if (trace != null) {
            this.f11401d.remove(activity);
            d dVar = this.f11399b.get(activity);
            if (!dVar.f11429d) {
                d.f11425e.a();
                eVar = new e<>();
            } else {
                if (!dVar.f11428c.isEmpty()) {
                    d.f11425e.a();
                    dVar.f11428c.clear();
                }
                e<c> a10 = dVar.a();
                try {
                    i iVar = dVar.f11427b;
                    iVar.f10946a.c(dVar.f11426a);
                } catch (IllegalArgumentException | NullPointerException e10) {
                    if (!(e10 instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                        d.f11425e.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
                        a10 = new e<>();
                    } else {
                        throw e10;
                    }
                }
                dVar.f11427b.f10946a.d();
                dVar.f11429d = false;
                eVar = a10;
            }
            if (!eVar.b()) {
                f11396y.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            h.a(trace, eVar.a());
            trace.stop();
        }
    }

    public final void d(String str, Timer timer, Timer timer2) {
        if (this.f11407q.p()) {
            m.a Z = m.Z();
            Z.A(str);
            Z.y(timer.f7662a);
            Z.z(timer2.f7663b - timer.f7663b);
            k a10 = SessionManager.getInstance().perfSession().a();
            Z.s();
            m.L((m) Z.f7906b, a10);
            int andSet = this.f11405o.getAndSet(0);
            synchronized (this.f11402e) {
                HashMap hashMap = this.f11402e;
                Z.s();
                m.H((m) Z.f7906b).putAll(hashMap);
                if (andSet != 0) {
                    Z.x((long) andSet, "_tsns");
                }
                this.f11402e.clear();
            }
            this.f11406p.d((m) Z.q(), tb.d.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.f11409s && this.f11407q.p()) {
            d dVar = new d(activity);
            this.f11399b.put(activity, dVar);
            if (activity instanceof FragmentActivity) {
                c cVar = new c(this.f11408r, this.f11406p, this, dVar);
                this.f11400c.put(activity, cVar);
                ((FragmentActivity) activity).G().f2496m.f2705a.add(new t.a(cVar, true));
            }
        }
    }

    public final void f(tb.d dVar) {
        this.f11412v = dVar;
        synchronized (this.f11403f) {
            Iterator it = this.f11403f.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.a(this.f11412v);
                } else {
                    it.remove();
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f11399b.remove(activity);
        if (this.f11400c.containsKey(activity)) {
            ((FragmentActivity) activity).G().f0(this.f11400c.remove(activity));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final synchronized void onActivityResumed(Activity activity) {
        tb.d dVar = tb.d.FOREGROUND;
        synchronized (this) {
            if (this.f11398a.isEmpty()) {
                this.f11408r.getClass();
                this.f11410t = new Timer();
                this.f11398a.put(activity, Boolean.TRUE);
                if (this.f11414x) {
                    f(dVar);
                    synchronized (this.f11404n) {
                        Iterator it = this.f11404n.iterator();
                        while (it.hasNext()) {
                            C0126a aVar = (C0126a) it.next();
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    }
                    this.f11414x = false;
                } else {
                    d("_bs", this.f11411u, this.f11410t);
                    f(dVar);
                }
            } else {
                this.f11398a.put(activity, Boolean.TRUE);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f11409s && this.f11407q.p()) {
            if (!this.f11399b.containsKey(activity)) {
                e(activity);
            }
            d dVar = this.f11399b.get(activity);
            if (dVar.f11429d) {
                d.f11425e.b("FrameMetricsAggregator is already recording %s", dVar.f11426a.getClass().getSimpleName());
            } else {
                i iVar = dVar.f11427b;
                iVar.f10946a.a(dVar.f11426a);
                dVar.f11429d = true;
            }
            Trace trace = new Trace("_st_" + activity.getClass().getSimpleName(), this.f11406p, this.f11408r, this);
            trace.start();
            this.f11401d.put(activity, trace);
        }
    }

    public final synchronized void onActivityStopped(Activity activity) {
        if (this.f11409s) {
            c(activity);
        }
        if (this.f11398a.containsKey(activity)) {
            this.f11398a.remove(activity);
            if (this.f11398a.isEmpty()) {
                this.f11408r.getClass();
                Timer timer = new Timer();
                this.f11411u = timer;
                d("_fs", this.f11410t, timer);
                f(tb.d.BACKGROUND);
            }
        }
    }
}
