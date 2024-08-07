package androidx.work;

import al.a0;
import al.d0;
import al.e0;
import al.i1;
import al.k1;
import al.r0;
import android.content.Context;
import androidx.work.d;
import ik.f;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;
import z3.c;

/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends d {

    /* renamed from: e  reason: collision with root package name */
    public final k1 f3723e = new k1((i1) null);

    /* renamed from: f  reason: collision with root package name */
    public final c<d.a> f3724f;

    /* renamed from: n  reason: collision with root package name */
    public final gl.c f3725n;

    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    public static final class a extends i implements p<d0, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public o3.i f3726a;

        /* renamed from: b  reason: collision with root package name */
        public int f3727b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o3.i<o3.d> f3728c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f3729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o3.i<o3.d> iVar, CoroutineWorker coroutineWorker, ik.d<? super a> dVar) {
            super(2, dVar);
            this.f3728c = iVar;
            this.f3729d = coroutineWorker;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            return new a(this.f3728c, this.f3729d, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f3727b;
            if (i10 == 0) {
                l0.Q0(obj);
                o3.i<o3.d> iVar = this.f3728c;
                CoroutineWorker coroutineWorker = this.f3729d;
                this.f3726a = iVar;
                this.f3727b = 1;
                coroutineWorker.getClass();
                throw new IllegalStateException("Not implemented");
            } else if (i10 == 1) {
                o3.i iVar2 = this.f3726a;
                l0.Q0(obj);
                iVar2.f13682b.i(obj);
                return ek.i.f20112a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "appContext");
        j.f(workerParameters, "params");
        c<d.a> cVar = new c<>();
        this.f3724f = cVar;
        cVar.b(new d.i(this, 11), this.f3757b.f3736d.c());
        this.f3725n = r0.f19084a;
    }

    public final v8.a<o3.d> a() {
        k1 k1Var = new k1((i1) null);
        gl.c cVar = this.f3725n;
        cVar.getClass();
        fl.d a10 = e0.a(f.a.a(cVar, k1Var));
        o3.i iVar = new o3.i(k1Var);
        l0.j0(a10, (a0) null, new a(iVar, this, (ik.d<? super a>) null), 3);
        return iVar;
    }

    public final void b() {
        this.f3724f.cancel(false);
    }

    public final c c() {
        l0.j0(e0.a(this.f3725n.plus(this.f3723e)), (a0) null, new b(this, (ik.d<? super b>) null), 3);
        return this.f3724f;
    }

    public abstract Object f();
}
