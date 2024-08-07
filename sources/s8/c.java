package s8;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class c extends b0 {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f14662n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f14663o;

    public /* synthetic */ c(Object obj, int i10) {
        this.f14662n = i10;
        this.f14663o = obj;
    }

    public final void b() {
        switch (this.f14662n) {
            case 0:
                e eVar = ((d) this.f14663o).f14665a;
                eVar.f14670b.b("unlinkToDeath", new Object[0]);
                eVar.f14682n.asBinder().unlinkToDeath(eVar.f14679k, 0);
                e eVar2 = ((d) this.f14663o).f14665a;
                eVar2.f14682n = null;
                eVar2.f14675g = false;
                return;
            default:
                synchronized (((e) this.f14663o).f14674f) {
                    if (((e) this.f14663o).f14680l.get() <= 0 || ((e) this.f14663o).f14680l.decrementAndGet() <= 0) {
                        e eVar3 = (e) this.f14663o;
                        if (eVar3.f14682n != null) {
                            eVar3.f14670b.b("Unbind from service.", new Object[0]);
                            e eVar4 = (e) this.f14663o;
                            eVar4.f14669a.unbindService(eVar4.f14681m);
                            Object obj = this.f14663o;
                            ((e) obj).f14675g = false;
                            ((e) obj).f14682n = null;
                            ((e) obj).f14681m = null;
                        }
                        ((e) this.f14663o).e();
                        return;
                    }
                    ((e) this.f14663o).f14670b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
        }
    }
}
