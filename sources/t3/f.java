package t3;

import dl.e;
import el.h;
import ik.d;
import kk.i;
import p3.l0;
import rk.q;
import sk.j;
import sk.k;
import t3.b;

/* compiled from: SafeCollector.common.kt */
public final class f implements e<b> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e[] f14811a;

    /* compiled from: Zip.kt */
    public static final class a extends k implements rk.a<b[]> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e[] f14812a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e[] eVarArr) {
            super(0);
            this.f14812a = eVarArr;
        }

        public final Object invoke() {
            return new b[this.f14812a.length];
        }
    }

    @kk.e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
    /* compiled from: Zip.kt */
    public static final class b extends i implements q<dl.f<? super b>, b[], d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14813a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ dl.f f14814b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object[] f14815c;

        public b(d dVar) {
            super(3, dVar);
        }

        public final Object d(dl.f fVar, Object obj, Object obj2) {
            b bVar = new b((d) obj2);
            bVar.f14814b = fVar;
            bVar.f14815c = (Object[]) obj;
            return bVar.invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            b bVar;
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f14813a;
            if (i10 == 0) {
                l0.Q0(obj);
                dl.f fVar = this.f14814b;
                b[] bVarArr = (b[]) this.f14815c;
                int i11 = 0;
                int length = bVarArr.length;
                while (true) {
                    if (i11 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i11];
                    if (!j.a(bVar, b.a.f14803a)) {
                        break;
                    }
                    i11++;
                }
                if (bVar == null) {
                    bVar = b.a.f14803a;
                }
                this.f14813a = 1;
                if (fVar.e(bVar, this) == aVar) {
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

    public f(e[] eVarArr) {
        this.f14811a = eVarArr;
    }

    public final Object a(dl.f fVar, d dVar) {
        e[] eVarArr = this.f14811a;
        el.f fVar2 = new el.f((d) null, new a(eVarArr), new b((d) null), fVar, eVarArr);
        h hVar = new h(dVar, dVar.getContext());
        Object J0 = l0.J0(hVar, hVar, fVar2);
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        if (J0 != aVar) {
            J0 = ek.i.f20112a;
        }
        if (J0 == aVar) {
            return J0;
        }
        return ek.i.f20112a;
    }
}
