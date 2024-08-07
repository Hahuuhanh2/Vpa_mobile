package al;

/* compiled from: JobSupport.kt */
public class k1 extends m1 {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19046c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(i1 i1Var) {
        super(true);
        p pVar;
        p pVar2;
        boolean z10 = true;
        Q(i1Var);
        o oVar = (o) m1.f19055b.get(this);
        if (oVar instanceof p) {
            pVar = (p) oVar;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            m1 n10 = pVar.n();
            while (true) {
                if (!n10.H()) {
                    o oVar2 = (o) m1.f19055b.get(n10);
                    if (oVar2 instanceof p) {
                        pVar2 = (p) oVar2;
                    } else {
                        pVar2 = null;
                    }
                    if (pVar2 == null) {
                        break;
                    }
                    n10 = pVar2.n();
                } else {
                    break;
                }
            }
        }
        z10 = false;
        this.f19046c = z10;
    }

    public final boolean H() {
        return this.f19046c;
    }

    public final boolean I() {
        return true;
    }
}
