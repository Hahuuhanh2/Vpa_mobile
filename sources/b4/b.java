package b4;

import al.g0;
import android.support.v4.media.a;
import fk.p;
import java.util.Iterator;
import java.util.List;
import rk.l;
import sk.j;
import x3.i;
import x3.n;
import x3.s;
import x3.w;

/* compiled from: DiagnosticsWorker.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4001a = 0;

    static {
        j.e(o3.j.b("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(n nVar, w wVar, x3.j jVar, List list) {
        Integer num;
        StringBuilder q10 = a.q("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            i e10 = jVar.e(g0.Q(sVar));
            if (e10 != null) {
                num = Integer.valueOf(e10.f17005c);
            } else {
                num = null;
            }
            String Q0 = p.Q0(nVar.b(sVar.f17019a), ",", (String) null, (String) null, (l) null, 62);
            String Q02 = p.Q0(wVar.a(sVar.f17019a), ",", (String) null, (String) null, (l) null, 62);
            StringBuilder p10 = a.p(10);
            p10.append(sVar.f17019a);
            p10.append("\t ");
            p10.append(sVar.f17021c);
            p10.append("\t ");
            p10.append(num);
            p10.append("\t ");
            p10.append(sVar.f17020b.name());
            p10.append("\t ");
            p10.append(Q0);
            p10.append("\t ");
            p10.append(Q02);
            p10.append(9);
            q10.append(p10.toString());
        }
        j.e(q10.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
