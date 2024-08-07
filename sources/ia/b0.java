package ia;

import android.content.Context;
import android.util.Log;
import c0.q0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ha.b;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import na.c;
import pa.e;
import pa.g;
import vl.d;

/* compiled from: CrashlyticsCore */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11261a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f11262b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11263c = new d(8);

    /* renamed from: d  reason: collision with root package name */
    public final long f11264d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public d f11265e;

    /* renamed from: f  reason: collision with root package name */
    public d f11266f;

    /* renamed from: g  reason: collision with root package name */
    public t f11267g;

    /* renamed from: h  reason: collision with root package name */
    public final k0 f11268h;

    /* renamed from: i  reason: collision with root package name */
    public final c f11269i;

    /* renamed from: j  reason: collision with root package name */
    public final b f11270j;

    /* renamed from: k  reason: collision with root package name */
    public final ga.a f11271k;

    /* renamed from: l  reason: collision with root package name */
    public final ExecutorService f11272l;

    /* renamed from: m  reason: collision with root package name */
    public final l f11273m;

    /* renamed from: n  reason: collision with root package name */
    public final k f11274n;

    /* renamed from: o  reason: collision with root package name */
    public final fa.a f11275o;

    /* compiled from: CrashlyticsCore */
    public class a implements Callable<Boolean> {
        public a() {
        }

        public final Object call() {
            try {
                d dVar = b0.this.f11265e;
                c cVar = (c) dVar.f23363c;
                cVar.getClass();
                return Boolean.valueOf(new File(cVar.f13552b, (String) dVar.f23362b).delete());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    public b0(m9.d dVar, k0 k0Var, fa.c cVar, g0 g0Var, q0 q0Var, ca.a aVar, c cVar2, ExecutorService executorService, k kVar) {
        this.f11262b = g0Var;
        dVar.a();
        this.f11261a = dVar.f13218a;
        this.f11268h = k0Var;
        this.f11275o = cVar;
        this.f11270j = q0Var;
        this.f11271k = aVar;
        this.f11272l = executorService;
        this.f11269i = cVar2;
        this.f11273m = new l(executorService);
        this.f11274n = kVar;
    }

    public static Task a(b0 b0Var, g gVar) {
        Task<Void> task;
        boolean z10;
        if (Boolean.TRUE.equals(b0Var.f11273m.f11335d.get())) {
            d dVar = b0Var.f11265e;
            dVar.getClass();
            try {
                c cVar = (c) dVar.f23363c;
                cVar.getClass();
                new File(cVar.f13552b, (String) dVar.f23362b).createNewFile();
            } catch (IOException unused) {
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                b0Var.f11270j.c(new y(b0Var));
                b0Var.f11267g.e();
                e eVar = (e) gVar;
                if (!eVar.b().f14112b.f14117a) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    task = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                } else {
                    t tVar = b0Var.f11267g;
                    if (Boolean.TRUE.equals(tVar.f11367e.f11335d.get())) {
                        f0 f0Var = tVar.f11376n;
                        if (f0Var == null || !f0Var.f11296e.get()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            try {
                                tVar.c(true, eVar);
                                Log.isLoggable("FirebaseCrashlytics", 2);
                            } catch (Exception unused2) {
                            }
                        }
                        task = b0Var.f11267g.f(eVar.f14130i.get().getTask());
                    } else {
                        throw new IllegalStateException("Not running on background worker thread as intended.");
                    }
                }
            } catch (Exception e10) {
                task = Tasks.forException(e10);
            } catch (Throwable th2) {
                b0Var.b();
                throw th2;
            }
            b0Var.b();
            return task;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b() {
        this.f11273m.a(new a());
    }
}
