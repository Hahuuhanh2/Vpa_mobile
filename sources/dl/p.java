package dl;

import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ek.i;
import ik.d;
import kk.c;
import kk.e;

/* compiled from: SafeCollector.common.kt */
public final class p implements e<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f20017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ rk.p f20018b;

    /* compiled from: Emitters.kt */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f20019a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ rk.p f20020b;

        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: dl.p$a$a  reason: collision with other inner class name */
        /* compiled from: Emitters.kt */
        public static final class C0276a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f20021a;

            /* renamed from: b  reason: collision with root package name */
            public int f20022b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f20023c;

            /* renamed from: d  reason: collision with root package name */
            public Object f20024d;

            /* renamed from: e  reason: collision with root package name */
            public f f20025e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0276a(a aVar, d dVar) {
                super(dVar);
                this.f20023c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f20021a = obj;
                this.f20022b |= Integer.MIN_VALUE;
                return this.f20023c.e(null, this);
            }
        }

        public a(f fVar, rk.p pVar) {
            this.f20019a = fVar;
            this.f20020b = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e(T r6, ik.d<? super ek.i> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dl.p.a.C0276a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                dl.p$a$a r0 = (dl.p.a.C0276a) r0
                int r1 = r0.f20022b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f20022b = r1
                goto L_0x0018
            L_0x0013:
                dl.p$a$a r0 = new dl.p$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f20021a
                jk.a r1 = jk.a.COROUTINE_SUSPENDED
                int r2 = r0.f20022b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                p3.l0.Q0(r7)
                goto L_0x005e
            L_0x002a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0032:
                dl.f r6 = r0.f20025e
                java.lang.Object r2 = r0.f20024d
                p3.l0.Q0(r7)
                goto L_0x0050
            L_0x003a:
                p3.l0.Q0(r7)
                dl.f r7 = r5.f20019a
                rk.p r2 = r5.f20020b
                r0.f20024d = r6
                r0.f20025e = r7
                r0.f20022b = r4
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L_0x004e
                return r1
            L_0x004e:
                r2 = r6
                r6 = r7
            L_0x0050:
                r7 = 0
                r0.f20024d = r7
                r0.f20025e = r7
                r0.f20022b = r3
                java.lang.Object r6 = r6.e(r2, r0)
                if (r6 != r1) goto L_0x005e
                return r1
            L_0x005e:
                ek.i r6 = ek.i.f20112a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dl.p.a.e(java.lang.Object, ik.d):java.lang.Object");
        }
    }

    public p(r rVar, AuctionRoomViewModel.b.a aVar) {
        this.f20017a = rVar;
        this.f20018b = aVar;
    }

    public final Object a(f fVar, d dVar) {
        Object a10 = this.f20017a.a(new a(fVar, this.f20018b), dVar);
        if (a10 == jk.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return i.f20112a;
    }
}
