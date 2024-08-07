package dl;

import al.g0;
import dl.i;
import kk.c;
import kk.e;
import rk.l;
import rk.p;
import sk.r;

/* compiled from: Distinct.kt */
public final class d<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f19967a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Object> f19968b;

    /* renamed from: c  reason: collision with root package name */
    public final p<Object, Object, Boolean> f19969c;

    /* compiled from: Distinct.kt */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d<T> f19970a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r<Object> f19971b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<T> f19972c;

        @e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {77}, m = "emit")
        /* renamed from: dl.d$a$a  reason: collision with other inner class name */
        /* compiled from: Distinct.kt */
        public static final class C0275a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f19973a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a<T> f19974b;

            /* renamed from: c  reason: collision with root package name */
            public int f19975c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0275a(a<? super T> aVar, ik.d<? super C0275a> dVar) {
                super(dVar);
                this.f19974b = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f19973a = obj;
                this.f19975c |= Integer.MIN_VALUE;
                return this.f19974b.e(null, this);
            }
        }

        public a(d<T> dVar, r<Object> rVar, f<? super T> fVar) {
            this.f19970a = dVar;
            this.f19971b = rVar;
            this.f19972c = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e(T r6, ik.d<? super ek.i> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dl.d.a.C0275a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                dl.d$a$a r0 = (dl.d.a.C0275a) r0
                int r1 = r0.f19975c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f19975c = r1
                goto L_0x0018
            L_0x0013:
                dl.d$a$a r0 = new dl.d$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f19973a
                jk.a r1 = jk.a.COROUTINE_SUSPENDED
                int r2 = r0.f19975c
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                p3.l0.Q0(r7)
                goto L_0x0065
            L_0x0027:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x002f:
                p3.l0.Q0(r7)
                dl.d<T> r7 = r5.f19970a
                rk.l<T, java.lang.Object> r7 = r7.f19968b
                java.lang.Object r7 = r7.invoke(r6)
                sk.r<java.lang.Object> r2 = r5.f19971b
                T r2 = r2.f22931a
                u9.b r4 = al.g0.f19020c
                if (r2 == r4) goto L_0x0056
                dl.d<T> r4 = r5.f19970a
                rk.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f19969c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0053
                goto L_0x0056
            L_0x0053:
                ek.i r6 = ek.i.f20112a
                return r6
            L_0x0056:
                sk.r<java.lang.Object> r2 = r5.f19971b
                r2.f22931a = r7
                dl.f<T> r7 = r5.f19972c
                r0.f19975c = r3
                java.lang.Object r6 = r7.e(r6, r0)
                if (r6 != r1) goto L_0x0065
                return r1
            L_0x0065:
                ek.i r6 = ek.i.f20112a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.d.a.e(java.lang.Object, ik.d):java.lang.Object");
        }
    }

    public d(e eVar, i.b bVar, i.a aVar) {
        this.f19967a = eVar;
        this.f19968b = bVar;
        this.f19969c = aVar;
    }

    public final Object a(f<? super T> fVar, ik.d<? super ek.i> dVar) {
        r rVar = new r();
        rVar.f22931a = g0.f19020c;
        Object a10 = this.f19967a.a(new a(this, rVar, fVar), dVar);
        if (a10 == jk.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return ek.i.f20112a;
    }
}
