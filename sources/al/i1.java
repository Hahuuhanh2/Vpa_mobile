package al;

import ek.i;
import ik.d;
import ik.f;
import java.util.concurrent.CancellationException;
import rk.l;
import xk.e;

/* compiled from: Job.kt */
public interface i1 extends f.b {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19044g = 0;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ t0 a(i1 i1Var, boolean z10, l1 l1Var, int i10) {
            boolean z11 = false;
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return i1Var.invokeOnCompletion(z10, z11, l1Var);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements f.c<i1> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f19045a = new b();
    }

    o attachChild(q qVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th2);

    CancellationException getCancellationException();

    e<i1> getChildren();

    hl.a getOnJoin();

    i1 getParent();

    t0 invokeOnCompletion(l<? super Throwable, i> lVar);

    t0 invokeOnCompletion(boolean z10, boolean z11, l<? super Throwable, i> lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(d<? super i> dVar);

    i1 plus(i1 i1Var);

    boolean start();
}
