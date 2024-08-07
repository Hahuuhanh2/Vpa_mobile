package f2;

import al.a0;
import al.d0;
import al.i1;
import cl.a;
import cl.h;
import cl.i;
import ek.i;
import f2.p;
import ik.d;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p3.l0;
import rk.p;
import sk.j;

/* compiled from: SimpleActor.kt */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f9803a;

    /* renamed from: b  reason: collision with root package name */
    public final p<T, d<? super i>, Object> f9804b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9805c = h.a(Integer.MAX_VALUE, 0, 6);

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f9806d = new AtomicInteger(0);

    public o(d0 d0Var, q qVar, r rVar, s sVar) {
        j.f(rVar, "onUndeliveredElement");
        this.f9803a = d0Var;
        this.f9804b = sVar;
        i1 i1Var = (i1) d0Var.s().get(i1.b.f19045a);
        if (i1Var != null) {
            i1Var.invokeOnCompletion(new m(qVar, this, rVar));
        }
    }

    public final void a(p.a aVar) {
        i.a aVar2;
        Object l10 = this.f9805c.l(aVar);
        boolean z10 = l10 instanceof i.a;
        Throwable th2 = null;
        if (z10) {
            if (z10) {
                aVar2 = (i.a) l10;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                th2 = aVar2.f19257a;
            }
            if (th2 == null) {
                th2 = new ClosedSendChannelException("Channel was closed normally");
            }
            throw th2;
        } else if (!(!(l10 instanceof i.b))) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f9806d.getAndIncrement() == 0) {
            l0.j0(this.f9803a, (a0) null, new n(this, (d<? super n>) null), 3);
        }
    }
}
