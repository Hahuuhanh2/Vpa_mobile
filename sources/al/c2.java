package al;

import ik.f;

/* compiled from: Unconfined.kt */
public final class c2 extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f19002c = 0;

    static {
        new c2();
    }

    public final void s(f fVar, Runnable runnable) {
        g2 g2Var = (g2) fVar.get(g2.f19036c);
        if (g2Var != null) {
            g2Var.f19037b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
