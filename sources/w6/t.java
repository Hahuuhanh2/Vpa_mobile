package w6;

import com.google.android.gms.common.util.VisibleForTesting;
import u6.a;
import v0.d;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class t extends j1 {

    /* renamed from: e  reason: collision with root package name */
    public final d f16656e = new d();

    /* renamed from: f  reason: collision with root package name */
    public final d f16657f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public t(g gVar, d dVar) {
        super(gVar);
        Object obj = a.f15287c;
        this.f16657f = dVar;
        this.mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
    }

    public final void onResume() {
        super.onResume();
        if (!this.f16656e.isEmpty()) {
            this.f16657f.a(this);
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.f16656e.isEmpty()) {
            this.f16657f.a(this);
        }
    }

    public final void onStop() {
        super.onStop();
        d dVar = this.f16657f;
        dVar.getClass();
        synchronized (d.f16567r) {
            if (dVar.f16579k == this) {
                dVar.f16579k = null;
                dVar.f16580l.clear();
            }
        }
    }
}
