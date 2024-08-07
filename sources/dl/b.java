package dl;

import ek.i;
import ik.d;
import ik.g;
import kk.c;
import kk.e;
import rk.p;

/* compiled from: Builders.kt */
public final class b<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    public final p<cl.p<? super T>, d<? super i>, Object> f19956e;

    @e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {334}, m = "collectTo")
    /* compiled from: Builders.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public cl.p f19957a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f19958b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b<T> f19959c;

        /* renamed from: d  reason: collision with root package name */
        public int f19960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.f19959c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19958b = obj;
            this.f19960d |= Integer.MIN_VALUE;
            return this.f19959c.c((cl.p) null, this);
        }
    }

    public b(u3.c cVar) {
        super(cVar, g.f20653a, -2, 1);
        this.f19956e = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(cl.p<? super T> r5, ik.d<? super ek.i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dl.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            dl.b$a r0 = (dl.b.a) r0
            int r1 = r0.f19960d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19960d = r1
            goto L_0x0018
        L_0x0013:
            dl.b$a r0 = new dl.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f19958b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19960d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            cl.p r5 = r0.f19957a
            p3.l0.Q0(r6)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p3.l0.Q0(r6)
            r0.f19957a = r5
            r0.f19960d = r3
            rk.p<cl.p<? super T>, ik.d<? super ek.i>, java.lang.Object> r6 = r4.f19966d
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            ek.i r6 = ek.i.f20112a
        L_0x0043:
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x004f
            ek.i r5 = ek.i.f20112a
            return r5
        L_0x004f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.b.c(cl.p, ik.d):java.lang.Object");
    }
}
