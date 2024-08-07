package hb;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.s;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jb.c;
import jb.l;
import m9.d;
import m9.f;
import sb.e;
import sb.j;
import xb.n;
import yb.b;

/* compiled from: FirebasePerfEarly */
public final class b {

    /* compiled from: FirebasePerfEarly */
    public class a implements yb.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jb.a f10697a;

        public a(jb.a aVar) {
            this.f10697a = aVar;
        }

        public final boolean a() {
            l lVar;
            c cVar;
            boolean z10;
            jb.a aVar = this.f10697a;
            aVar.getClass();
            synchronized (l.class) {
                if (l.f11853b == null) {
                    l.f11853b = new l();
                }
                lVar = l.f11853b;
            }
            RemoteConfigManager remoteConfigManager = aVar.f11839a;
            lVar.getClass();
            e<Boolean> eVar = remoteConfigManager.getBoolean("fpr_enabled");
            synchronized (c.class) {
                if (c.f11843b == null) {
                    c.f11843b = new c();
                }
                cVar = c.f11843b;
            }
            if (aVar.a(cVar).b() || eVar.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return jb.a.e().p();
        }

        public final b.a b() {
            return b.a.PERFORMANCE;
        }

        public final void c(b.C0236b bVar) {
            SessionManager.getInstance().updatePerfSession(PerfSession.e(bVar.f17644a));
        }
    }

    public b(d dVar, n nVar, f fVar, Executor executor) {
        AppStartTrace appStartTrace;
        boolean z10;
        dVar.a();
        Context context = dVar.f13218a;
        jb.a e10 = jb.a.e();
        e10.getClass();
        jb.a.f11837d.f12901b = j.a(context);
        e10.f11841c.b(context);
        ib.a a10 = ib.a.a();
        synchronized (a10) {
            if (!a10.f11413w) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(a10);
                    a10.f11413w = true;
                }
            }
        }
        d dVar2 = new d();
        synchronized (a10.f11404n) {
            a10.f11404n.add(dVar2);
        }
        if (fVar != null) {
            if (AppStartTrace.F != null) {
                appStartTrace = AppStartTrace.F;
            } else {
                rb.d dVar3 = rb.d.f14546z;
                lb.b bVar = new lb.b(7);
                if (AppStartTrace.F == null) {
                    synchronized (AppStartTrace.class) {
                        if (AppStartTrace.F == null) {
                            AppStartTrace.F = new AppStartTrace(dVar3, bVar, jb.a.e(), new ThreadPoolExecutor(0, 1, AppStartTrace.E + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                        }
                    }
                }
                appStartTrace = AppStartTrace.F;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f7623a) {
                    s.f2817p.f2823f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        if (!appStartTrace.C) {
                            if (!AppStartTrace.c(applicationContext2)) {
                                z10 = false;
                                appStartTrace.C = z10;
                                appStartTrace.f7623a = true;
                                appStartTrace.f7628f = applicationContext2;
                            }
                        }
                        z10 = true;
                        appStartTrace.C = z10;
                        appStartTrace.f7623a = true;
                        appStartTrace.f7628f = applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.b(appStartTrace));
        }
        nVar.b(new a(e10));
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
