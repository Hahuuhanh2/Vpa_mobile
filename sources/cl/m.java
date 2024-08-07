package cl;

import ek.i;
import rk.l;
import sk.k;

/* compiled from: Produce.kt */
public final class m extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ al.k<i> f19265a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(al.l lVar) {
        super(1);
        this.f19265a = lVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        al.k<i> kVar = this.f19265a;
        i iVar = i.f20112a;
        kVar.resumeWith(iVar);
        return iVar;
    }
}
