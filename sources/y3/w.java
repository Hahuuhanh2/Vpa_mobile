package y3;

import al.g0;
import android.content.Context;
import java.util.UUID;
import o3.d;
import p3.r;
import x3.s;
import z3.a;
import z3.c;

/* compiled from: WorkForegroundUpdater */
public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17430a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UUID f17431b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f17432c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f17433d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x f17434e;

    public w(x xVar, c cVar, UUID uuid, d dVar, Context context) {
        this.f17434e = xVar;
        this.f17430a = cVar;
        this.f17431b = uuid;
        this.f17432c = dVar;
        this.f17433d = context;
    }

    public final void run() {
        try {
            if (!(this.f17430a.f17841a instanceof a.b)) {
                String uuid = this.f17431b.toString();
                s t10 = this.f17434e.f17437c.t(uuid);
                if (t10 == null || t10.f17020b.b()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((r) this.f17434e.f17436b).e(uuid, this.f17432c);
                this.f17433d.startService(androidx.work.impl.foreground.a.a(this.f17433d, g0.Q(t10), this.f17432c));
            }
            this.f17430a.i(null);
        } catch (Throwable th2) {
            this.f17430a.j(th2);
        }
    }
}
