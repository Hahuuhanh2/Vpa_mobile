package sb;

import com.google.firebase.perf.metrics.Trace;
import lb.a;
import mb.c;

/* compiled from: ScreenTraceUtil */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14719a = a.d();

    public static void a(Trace trace, c cVar) {
        int i10 = cVar.f13246a;
        if (i10 > 0) {
            trace.putMetric("_fr_tot", (long) i10);
        }
        int i11 = cVar.f13247b;
        if (i11 > 0) {
            trace.putMetric("_fr_slo", (long) i11);
        }
        int i12 = cVar.f13248c;
        if (i12 > 0) {
            trace.putMetric("_fr_fzn", (long) i12);
        }
        a aVar = f14719a;
        String str = trace.f7650o;
        aVar.a();
    }
}
