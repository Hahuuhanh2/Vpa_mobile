package f2;

import al.d0;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* compiled from: SimpleActor.kt */
public final class n extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public p f9800a;

    /* renamed from: b  reason: collision with root package name */
    public int f9801b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o<Object> f9802c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(o<Object> oVar, d<? super n> dVar) {
        super(2, dVar);
        this.f9802c = oVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new n(this.f9802c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.f9801b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0022
            if (r1 == r2) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            p3.l0.Q0(r7)
            r7 = r6
            goto L_0x005d
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            rk.p r1 = r6.f9800a
            p3.l0.Q0(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L_0x0051
        L_0x0022:
            p3.l0.Q0(r7)
            f2.o<java.lang.Object> r7 = r6.f9802c
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f9806d
            int r7 = r7.get()
            if (r7 <= 0) goto L_0x0031
            r7 = r2
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r7 == 0) goto L_0x006a
            r7 = r6
        L_0x0035:
            f2.o<java.lang.Object> r1 = r7.f9802c
            al.d0 r1 = r1.f9803a
            ik.f r1 = r1.s()
            al.g0.O(r1)
            f2.o<java.lang.Object> r1 = r7.f9802c
            rk.p<T, ik.d<? super ek.i>, java.lang.Object> r4 = r1.f9804b
            cl.a r1 = r1.f9805c
            r7.f9800a = r4
            r7.f9801b = r2
            java.lang.Object r1 = r1.D(r7)
            if (r1 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r5 = 0
            r7.f9800a = r5
            r7.f9801b = r3
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L_0x005d
            return r0
        L_0x005d:
            f2.o<java.lang.Object> r1 = r7.f9802c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f9806d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L_0x0035
            ek.i r7 = ek.i.f20112a
            return r7
        L_0x006a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
