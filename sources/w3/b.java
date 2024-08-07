package w3;

import al.g0;
import androidx.work.impl.foreground.a;
import p3.o0;
import p3.r;
import t3.h;
import x3.s;

/* compiled from: SystemForegroundDispatcher */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f16453b;

    public b(a aVar, String str) {
        this.f16453b = aVar;
        this.f16452a = str;
    }

    public final void run() {
        s sVar;
        r rVar = this.f16453b.f3833a.f13942f;
        String str = this.f16452a;
        synchronized (rVar.f14021k) {
            o0 c10 = rVar.c(str);
            if (c10 != null) {
                sVar = c10.f13979c;
            } else {
                sVar = null;
            }
        }
        if (sVar != null && sVar.b()) {
            synchronized (this.f16453b.f3835c) {
                this.f16453b.f3838f.put(g0.Q(sVar), sVar);
                a aVar = this.f16453b;
                this.f16453b.f3839n.put(g0.Q(sVar), h.a(aVar.f3840o, sVar, aVar.f3834b.a(), this.f16453b));
            }
        }
    }
}
