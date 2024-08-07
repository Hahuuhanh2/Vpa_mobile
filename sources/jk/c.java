package jk;

import ik.d;
import ik.f;
import p3.l0;
import rk.p;
import sk.j;
import sk.u;

/* compiled from: IntrinsicsJvm.kt */
public final class c extends kk.c {

    /* renamed from: a  reason: collision with root package name */
    public int f20799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f20800b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f20801c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f20800b = pVar;
        this.f20801c = obj;
        j.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20799a;
        if (i10 == 0) {
            this.f20799a = 1;
            l0.Q0(obj);
            j.d(this.f20800b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            p pVar = this.f20800b;
            u.a(2, pVar);
            return pVar.invoke(this.f20801c, this);
        } else if (i10 == 1) {
            this.f20799a = 2;
            l0.Q0(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
