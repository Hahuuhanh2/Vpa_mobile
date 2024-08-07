package mb;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.k;
import tb.m;

/* compiled from: TraceMetricBuilder */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Trace f13257a;

    public e(Trace trace) {
        this.f13257a = trace;
    }

    public final m a() {
        List unmodifiableList;
        m.a Z = m.Z();
        Z.A(this.f13257a.f7650o);
        Z.y(this.f13257a.f7657v.f7662a);
        Trace trace = this.f13257a;
        Timer timer = trace.f7657v;
        Timer timer2 = trace.f7658w;
        timer.getClass();
        Z.z(timer2.f7663b - timer.f7663b);
        for (Counter counter : this.f13257a.f7651p.values()) {
            Z.x(counter.f7645b.get(), counter.f7644a);
        }
        ArrayList<Trace> arrayList = this.f13257a.f7654s;
        if (!arrayList.isEmpty()) {
            for (Trace eVar : arrayList) {
                Z.w(new e(eVar).a());
            }
        }
        Map<String, String> attributes = this.f13257a.getAttributes();
        Z.s();
        m.K((m) Z.f7906b).putAll(attributes);
        Trace trace2 = this.f13257a;
        synchronized (trace2.f7653r) {
            ArrayList arrayList2 = new ArrayList();
            for (PerfSession next : trace2.f7653r) {
                if (next != null) {
                    arrayList2.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        k[] d10 = PerfSession.d(unmodifiableList);
        if (d10 != null) {
            List asList = Arrays.asList(d10);
            Z.s();
            m.M((m) Z.f7906b, asList);
        }
        return (m) Z.q();
    }
}
