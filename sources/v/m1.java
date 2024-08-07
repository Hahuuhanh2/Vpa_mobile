package v;

import androidx.camera.core.impl.u;
import c0.q0;
import ca.a;
import java.util.concurrent.ExecutionException;
import v.o1;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m1 implements u.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o1 f15749a;

    public /* synthetic */ m1(o1 o1Var) {
        this.f15749a = o1Var;
    }

    public final void a() {
        o1 o1Var = this.f15749a;
        o1Var.f15786b = o1Var.a();
        o1.c cVar = o1Var.f15789e;
        if (cVar != null) {
            u uVar = (u) ((q0) cVar).f4316b;
            uVar.getClass();
            try {
                if (((Boolean) b.a(new a(uVar, 0)).get()).booleanValue()) {
                    o1 o1Var2 = uVar.f15881z;
                    u uVar2 = o1Var2.f15786b;
                    o1.b bVar = o1Var2.f15787c;
                    uVar.f15865c.execute(new s(uVar, u.v(o1Var2), uVar2, bVar, 0));
                }
            } catch (InterruptedException | ExecutionException e10) {
                throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
            }
        }
    }
}
