package r0;

import androidx.camera.view.a;
import c0.o;
import f0.f;
import f0.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PreviewStreamStateObserver */
public final class c implements i0.c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f14454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f14455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f14456c;

    public c(a aVar, ArrayList arrayList, q qVar) {
        this.f14456c = aVar;
        this.f14454a = arrayList;
        this.f14455b = qVar;
    }

    public final void a(Throwable th2) {
        this.f14456c.f1485e = null;
        if (!this.f14454a.isEmpty()) {
            for (f c10 : this.f14454a) {
                ((q) this.f14455b).c(c10);
            }
            this.f14454a.clear();
        }
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f14456c.f1485e = null;
    }
}
