package mj;

import ek.i;
import java.util.Iterator;
import java.util.List;
import oc.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: QRCodeAnalyzer.kt */
public final class b extends k implements l<List<a>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f21548a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(1);
        this.f21548a = dVar;
    }

    public final Object invoke(Object obj) {
        a aVar;
        List list = (List) obj;
        j.c(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (a) it.next();
            if (aVar != null) {
                break;
            }
        }
        if (aVar != null) {
            this.f21548a.f21551b.invoke(aVar);
        }
        return i.f20112a;
    }
}
