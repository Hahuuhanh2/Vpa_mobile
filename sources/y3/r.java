package y3;

import java.util.Set;
import p3.o0;
import p3.w;
import sk.j;

/* compiled from: StopWorkRunnable.kt */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p3.r f17414a;

    /* renamed from: b  reason: collision with root package name */
    public final w f17415b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17416c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17417d;

    public r(p3.r rVar, w wVar, boolean z10, int i10) {
        j.f(rVar, "processor");
        j.f(wVar, "token");
        this.f17414a = rVar;
        this.f17415b = wVar;
        this.f17416c = z10;
        this.f17417d = i10;
    }

    public final void run() {
        o0 b10;
        if (this.f17416c) {
            p3.r rVar = this.f17414a;
            w wVar = this.f17415b;
            int i10 = this.f17417d;
            rVar.getClass();
            String str = wVar.f14028a.f17010a;
            synchronized (rVar.f14021k) {
                b10 = rVar.b(str);
            }
            p3.r.d(b10, i10);
        } else {
            p3.r rVar2 = this.f17414a;
            w wVar2 = this.f17415b;
            int i11 = this.f17417d;
            rVar2.getClass();
            String str2 = wVar2.f14028a.f17010a;
            synchronized (rVar2.f14021k) {
                if (rVar2.f14016f.get(str2) != null) {
                    o3.j.a().getClass();
                } else {
                    Set set = (Set) rVar2.f14018h.get(str2);
                    if (set != null) {
                        if (set.contains(wVar2)) {
                            o0 b11 = rVar2.b(str2);
                            p3.r.d(b11, i11);
                        }
                    }
                }
            }
        }
        o3.j a10 = o3.j.a();
        o3.j.b("StopWorkRunnable");
        String str3 = this.f17415b.f14028a.f17010a;
        a10.getClass();
    }
}
