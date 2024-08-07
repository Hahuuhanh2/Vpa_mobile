package dl;

import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import ik.d;
import kk.c;
import kk.e;
import rk.q;

/* compiled from: SafeCollector.common.kt */
public final class j implements e<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f19988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f19989b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {114, 115}, m = "collect")
    /* compiled from: SafeCollector.common.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19990a;

        /* renamed from: b  reason: collision with root package name */
        public int f19991b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f19992c;

        /* renamed from: d  reason: collision with root package name */
        public j f19993d;

        /* renamed from: e  reason: collision with root package name */
        public f f19994e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, d dVar) {
            super(dVar);
            this.f19992c = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19990a = obj;
            this.f19991b |= Integer.MIN_VALUE;
            return this.f19992c.a((f<Object>) null, this);
        }
    }

    public j(p pVar, AuctionRoomViewModel.b.C0263b bVar) {
        this.f19988a = pVar;
        this.f19989b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dl.f<java.lang.Object> r6, ik.d<? super ek.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dl.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dl.j$a r0 = (dl.j.a) r0
            int r1 = r0.f19991b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19991b = r1
            goto L_0x0018
        L_0x0013:
            dl.j$a r0 = new dl.j$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f19990a
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19991b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p3.l0.Q0(r7)
            goto L_0x0061
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            dl.f r6 = r0.f19994e
            dl.j r2 = r0.f19993d
            p3.l0.Q0(r7)
            goto L_0x004d
        L_0x003a:
            p3.l0.Q0(r7)
            dl.e r7 = r5.f19988a
            r0.f19993d = r5
            r0.f19994e = r6
            r0.f19991b = r4
            java.io.Serializable r7 = j7.a.l(r0, r7, r6)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x0061
            rk.q r2 = r2.f19989b
            r4 = 0
            r0.f19993d = r4
            r0.f19994e = r4
            r0.f19991b = r3
            java.lang.Object r6 = r2.d(r6, r7, r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            ek.i r6 = ek.i.f20112a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.j.a(dl.f, ik.d):java.lang.Object");
    }
}
