package ib;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import lb.a;
import lb.b;
import rb.d;
import sb.e;
import sb.h;

/* compiled from: FragmentStateMonitor */
public final class c extends FragmentManager.k {

    /* renamed from: f  reason: collision with root package name */
    public static final a f11419f = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Fragment, Trace> f11420a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f11421b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11422c;

    /* renamed from: d  reason: collision with root package name */
    public final a f11423d;

    /* renamed from: e  reason: collision with root package name */
    public final d f11424e;

    public c(b bVar, d dVar, a aVar, d dVar2) {
        this.f11421b = bVar;
        this.f11422c = dVar;
        this.f11423d = aVar;
        this.f11424e = dVar2;
    }

    public final void a(Fragment fragment) {
        e eVar;
        a aVar = f11419f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f11420a.containsKey(fragment)) {
            aVar.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f11420a.get(fragment);
        this.f11420a.remove(fragment);
        d dVar = this.f11424e;
        if (!dVar.f11429d) {
            d.f11425e.a();
            eVar = new e();
        } else if (!dVar.f11428c.containsKey(fragment)) {
            d.f11425e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            eVar = new e();
        } else {
            mb.c remove = dVar.f11428c.remove(fragment);
            e<mb.c> a10 = dVar.a();
            if (!a10.b()) {
                d.f11425e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                eVar = new e();
            } else {
                mb.c a11 = a10.a();
                eVar = new e(new mb.c(a11.f13246a - remove.f13246a, a11.f13247b - remove.f13247b, a11.f13248c - remove.f13248c));
            }
        }
        if (!eVar.b()) {
            aVar.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        h.a(trace, (mb.c) eVar.a());
        trace.stop();
    }

    public final void b(Fragment fragment) {
        String str;
        f11419f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        StringBuilder q10 = android.support.v4.media.a.q("_st_");
        q10.append(fragment.getClass().getSimpleName());
        Trace trace = new Trace(q10.toString(), this.f11422c, this.f11421b, this.f11423d);
        trace.start();
        Fragment fragment2 = fragment.B;
        if (fragment2 == null) {
            str = "No parent";
        } else {
            str = fragment2.getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", str);
        if (fragment.m() != null) {
            trace.putAttribute("Hosting_activity", fragment.m().getClass().getSimpleName());
        }
        this.f11420a.put(fragment, trace);
        d dVar = this.f11424e;
        if (!dVar.f11429d) {
            d.f11425e.a();
        } else if (dVar.f11428c.containsKey(fragment)) {
            d.f11425e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            e<mb.c> a10 = dVar.a();
            if (!a10.b()) {
                d.f11425e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return;
            }
            dVar.f11428c.put(fragment, a10.a());
        }
    }
}
