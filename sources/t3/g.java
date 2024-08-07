package t3;

import al.d0;
import dl.b;
import dl.f;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;
import u3.c;
import x3.s;

@e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {54}, m = "invokeSuspend")
/* compiled from: WorkConstraintsTracker.kt */
public final class g extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f14817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f14818c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f14819d;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f14820a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f14821b;

        public a(d dVar, s sVar) {
            this.f14820a = dVar;
            this.f14821b = sVar;
        }

        public final Object e(Object obj, d dVar) {
            this.f14820a.e(this.f14821b, (b) obj);
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(e eVar, s sVar, d dVar, d<? super g> dVar2) {
        super(2, dVar2);
        this.f14817b = eVar;
        this.f14818c = sVar;
        this.f14819d = dVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new g(this.f14817b, this.f14818c, this.f14819d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f14816a;
        if (i10 == 0) {
            l0.Q0(obj);
            e eVar = this.f14817b;
            s sVar = this.f14818c;
            eVar.getClass();
            j.f(sVar, "spec");
            List<u3.d<?>> list = eVar.f14809a;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((u3.d) next).b(sVar)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(fk.j.H0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u3.d dVar = (u3.d) it.next();
                dVar.getClass();
                arrayList2.add(new b(new c(dVar, (d<? super c>) null)));
            }
            dl.e y10 = j7.a.y(new f((dl.e[]) fk.p.Z0(arrayList2).toArray(new dl.e[0])));
            a aVar2 = new a(this.f14819d, this.f14818c);
            this.f14816a = 1;
            if (y10.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
