package androidx.work;

import al.d0;
import androidx.work.d;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
/* compiled from: CoroutineWorker.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3751a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f3752b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(CoroutineWorker coroutineWorker, d<? super b> dVar) {
        super(2, dVar);
        this.f3752b = coroutineWorker;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f3752b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f3751a;
        if (i10 == 0) {
            l0.Q0(obj);
            CoroutineWorker coroutineWorker = this.f3752b;
            this.f3751a = 1;
            obj = coroutineWorker.f();
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Throwable th2) {
                this.f3752b.f3724f.j(th2);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f3752b.f3724f.i((d.a) obj);
        return ek.i.f20112a;
    }
}
