package dl;

import el.k;
import ik.d;
import kk.c;
import kk.e;

@e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
/* compiled from: Share.kt */
public final class b0 extends c {

    /* renamed from: a  reason: collision with root package name */
    public c0 f19961a;

    /* renamed from: b  reason: collision with root package name */
    public k f19962b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f19963c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0<Object> f19964d;

    /* renamed from: e  reason: collision with root package name */
    public int f19965e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(c0<Object> c0Var, d<? super b0> dVar) {
        super(dVar);
        this.f19964d = c0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f19963c = obj;
        this.f19965e |= Integer.MIN_VALUE;
        return this.f19964d.a(this);
    }
}
