package pa;

import a.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import ia.g0;
import java.util.concurrent.atomic.AtomicReference;
import k4.d;
import org.json.JSONObject;
import v.v;
import z.j;

/* compiled from: SettingsController */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14122a;

    /* renamed from: b  reason: collision with root package name */
    public final h f14123b;

    /* renamed from: c  reason: collision with root package name */
    public final j f14124c;

    /* renamed from: d  reason: collision with root package name */
    public final a f14125d;

    /* renamed from: e  reason: collision with root package name */
    public final d f14126e;

    /* renamed from: f  reason: collision with root package name */
    public final i f14127f;

    /* renamed from: g  reason: collision with root package name */
    public final g0 f14128g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<c> f14129h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<c>> f14130i = new AtomicReference<>(new TaskCompletionSource());

    public e(Context context, h hVar, a aVar, j jVar, d dVar, b bVar, g0 g0Var) {
        AtomicReference<c> atomicReference = new AtomicReference<>();
        this.f14129h = atomicReference;
        this.f14122a = context;
        this.f14123b = hVar;
        this.f14125d = aVar;
        this.f14124c = jVar;
        this.f14126e = dVar;
        this.f14127f = bVar;
        this.f14128g = g0Var;
        atomicReference.set(a.b(aVar));
    }

    public final c a(int i10) {
        boolean z10;
        try {
            if (!v.a(2, i10)) {
                JSONObject g2 = this.f14126e.g();
                if (g2 != null) {
                    c a10 = this.f14124c.a(g2);
                    if (a10 != null) {
                        g2.toString();
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        this.f14125d.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!v.a(3, i10)) {
                            if (a10.f14113c < currentTimeMillis) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                Log.isLoggable("FirebaseCrashlytics", 2);
                            }
                        }
                        try {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            return a10;
                        } catch (Exception unused) {
                            return a10;
                        }
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public final c b() {
        return this.f14129h.get();
    }
}
