package el;

import al.i1;
import fl.r;
import ik.f;
import rk.p;
import sk.k;

/* compiled from: SafeCollector.common.kt */
public final class m extends k implements p<Integer, f.b, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k<?> f20160a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(k<?> kVar) {
        super(2);
        this.f20160a = kVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj).intValue();
        f.b bVar = (f.b) obj2;
        f.c key = bVar.getKey();
        f.b bVar2 = this.f20160a.f20153b.get(key);
        int i11 = i1.f19044g;
        if (key != i1.b.f19045a) {
            if (bVar != bVar2) {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = intValue + 1;
            }
            return Integer.valueOf(i10);
        }
        i1 i1Var = (i1) bVar2;
        i1 i1Var2 = (i1) bVar;
        while (true) {
            if (i1Var2 != null) {
                if (i1Var2 == i1Var || !(i1Var2 instanceof r)) {
                    break;
                }
                i1Var2 = i1Var2.getParent();
            } else {
                i1Var2 = null;
                break;
            }
        }
        if (i1Var2 == i1Var) {
            if (i1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + i1Var2 + ", expected child of " + i1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
