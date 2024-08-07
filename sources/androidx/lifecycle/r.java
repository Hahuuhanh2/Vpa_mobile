package androidx.lifecycle;

import al.d0;
import al.i1;
import al.r0;
import androidx.lifecycle.i;
import fl.m;
import gl.c;
import ik.d;
import ik.f;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

/* compiled from: PausingDispatcher.kt */
public final class r {

    @e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {203}, m = "invokeSuspend")
    /* compiled from: PausingDispatcher.kt */
    public static final class a extends i implements p<d0, d<? super T>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f2812a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f2813b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f2814c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i.b f2815d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ p<d0, d<? super T>, Object> f2816e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, i.b bVar, p<? super d0, ? super d<? super T>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f2814c = iVar;
            this.f2815d = bVar;
            this.f2816e = pVar;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f2814c, this.f2815d, this.f2816e, dVar);
            aVar.f2813b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            j jVar;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f2812a;
            if (i10 == 0) {
                l0.Q0(obj);
                f s10 = ((d0) this.f2813b).s();
                int i11 = i1.f19044g;
                i1 i1Var = (i1) s10.get(i1.b.f19045a);
                if (i1Var != null) {
                    r2.r rVar = new r2.r();
                    j jVar2 = new j(this.f2814c, this.f2815d, rVar.f14488c, i1Var);
                    try {
                        p<d0, d<? super T>, Object> pVar = this.f2816e;
                        this.f2813b = jVar2;
                        this.f2812a = 1;
                        obj = l0.V0(this, rVar, pVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        jVar = jVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar = jVar2;
                        jVar.a();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i10 == 1) {
                jVar = (j) this.f2813b;
                try {
                    l0.Q0(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar.a();
            return obj;
        }
    }

    public static final <T> Object a(i iVar, i.b bVar, p<? super d0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        c cVar = r0.f19084a;
        return l0.V0(dVar, m.f20254a.a0(), new a(iVar, bVar, pVar, (d<? super a>) null));
    }
}
