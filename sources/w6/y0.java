package w6;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import v6.c;
import v6.d;
import v6.e;
import v6.f;
import v6.h;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class y0<R extends e> extends h<R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    public y0 f16676a = null;

    /* renamed from: b  reason: collision with root package name */
    public c f16677b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16678c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public Status f16679d = null;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f16680e;

    /* renamed from: f  reason: collision with root package name */
    public final w0 f16681f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16682g = false;

    public y0(WeakReference weakReference) {
        Looper looper;
        if (weakReference != null) {
            this.f16680e = weakReference;
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) weakReference.get();
            if (cVar != null) {
                looper = cVar.b();
            } else {
                looper = Looper.getMainLooper();
            }
            this.f16681f = new w0(this, looper);
            return;
        }
        throw new NullPointerException("GoogleApiClient reference must not be null");
    }

    public static final void e(e eVar) {
        if (eVar instanceof d) {
            try {
                ((d) eVar).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(eVar));
            }
        }
    }

    public final void a(e eVar) {
        synchronized (this.f16678c) {
            if (eVar.getStatus().P0()) {
                com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f16680e.get();
            } else {
                b(eVar.getStatus());
                e(eVar);
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.f16678c) {
            this.f16679d = status;
            d(status);
        }
    }

    public final void c() {
    }

    public final void d(Status status) {
        synchronized (this.f16678c) {
            com.google.android.gms.common.api.c cVar = (com.google.android.gms.common.api.c) this.f16680e.get();
        }
    }
}
