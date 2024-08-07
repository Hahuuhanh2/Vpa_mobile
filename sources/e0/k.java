package e0;

import al.g0;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f9016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f9017b;

    public /* synthetic */ k(l lVar, s sVar) {
        this.f9016a = lVar;
        this.f9017b = sVar;
    }

    public final void accept(Object obj) {
        boolean z10;
        l lVar = this.f9016a;
        s sVar = this.f9017b;
        w wVar = (w) obj;
        lVar.c(wVar);
        if (sVar.f9037b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Pending request should be null", z10);
        sVar.f9037b = wVar;
    }
}
