package jk;

import ik.d;
import kk.g;
import p3.l0;
import rk.p;
import sk.j;
import sk.u;

/* compiled from: IntrinsicsJvm.kt */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public int f20796a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f20797b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f20798c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, p pVar) {
        super(dVar);
        this.f20797b = pVar;
        this.f20798c = obj;
        j.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20796a;
        if (i10 == 0) {
            this.f20796a = 1;
            l0.Q0(obj);
            j.d(this.f20797b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            p pVar = this.f20797b;
            u.a(2, pVar);
            return pVar.invoke(this.f20798c, this);
        } else if (i10 == 1) {
            this.f20796a = 2;
            l0.Q0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
