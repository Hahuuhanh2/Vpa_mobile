package dl;

import al.i1;
import ik.d;
import jk.a;
import kk.c;
import kk.e;

@e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
/* compiled from: SharedFlow.kt */
public final class w<T> extends c {

    /* renamed from: a  reason: collision with root package name */
    public v f20040a;

    /* renamed from: b  reason: collision with root package name */
    public f f20041b;

    /* renamed from: c  reason: collision with root package name */
    public x f20042c;

    /* renamed from: d  reason: collision with root package name */
    public i1 f20043d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f20044e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v<T> f20045f;

    /* renamed from: n  reason: collision with root package name */
    public int f20046n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(v<T> vVar, d<? super w> dVar) {
        super(dVar);
        this.f20045f = vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f20044e = obj;
        this.f20046n |= Integer.MIN_VALUE;
        v.j(this.f20045f, (f) null, this);
        return a.COROUTINE_SUSPENDED;
    }
}
