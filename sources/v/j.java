package v;

import c0.q0;
import i0.a;
import i0.d;
import i0.f;
import java.util.List;
import java.util.Objects;
import kh.h;
import v.c0;
import z.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f15710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f15711b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15712c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15713d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f15714e;

    public /* synthetic */ j(o oVar, List list, int i10, int i11, int i12) {
        this.f15710a = oVar;
        this.f15711b = list;
        this.f15712c = i10;
        this.f15713d = i11;
        this.f15714e = i12;
    }

    public final v8.a apply(Object obj) {
        v8.a aVar;
        o oVar = this.f15710a;
        List list = this.f15711b;
        int i10 = this.f15712c;
        int i11 = this.f15713d;
        int i12 = this.f15714e;
        Void voidR = (Void) obj;
        c0 c0Var = oVar.f15768n;
        l lVar = new l(c0Var.f15609d);
        c0.c cVar = new c0.c(c0Var.f15612g, c0Var.f15610e, c0Var.f15606a, c0Var.f15611f, lVar);
        if (i10 == 0) {
            cVar.f15628g.add(new c0.b(c0Var.f15606a));
        }
        if (c0Var.f15608c) {
            boolean z10 = true;
            if (!(c0Var.f15607b.f17766a || c0Var.f15612g == 3 || i12 == 1)) {
                z10 = false;
            }
            if (z10) {
                cVar.f15628g.add(new c0.f(c0Var.f15606a, i11, c0Var.f15610e));
            } else {
                cVar.f15628g.add(new c0.a(c0Var.f15606a, i11, lVar));
            }
        }
        v8.a c10 = f.c((Object) null);
        if (!cVar.f15628g.isEmpty()) {
            if (cVar.f15629h.b()) {
                o oVar2 = cVar.f15624c;
                c0.e eVar = new c0.e(0, (h) null);
                oVar2.i(eVar);
                aVar = eVar.f15632b;
            } else {
                aVar = f.c((Object) null);
            }
            c10 = d.a(aVar).d(new d0(cVar, i11), cVar.f15623b).d(new q0(cVar, 0), cVar.f15623b);
        }
        d d10 = d.a(c10).d(new e0(cVar, list, i11), cVar.f15623b);
        c0.c.a aVar2 = cVar.f15629h;
        Objects.requireNonNull(aVar2);
        d10.b(new d.d(aVar2, 6), cVar.f15623b);
        return f.d(d10);
    }
}
