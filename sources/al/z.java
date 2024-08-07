package al;

import ik.f;
import rk.p;
import sk.k;

/* compiled from: CoroutineContext.kt */
public final class z extends k implements p<Boolean, f.b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final z f19118a = new z();

    public z() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        f.b bVar = (f.b) obj2;
        if (((Boolean) obj).booleanValue() || (bVar instanceof x)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
