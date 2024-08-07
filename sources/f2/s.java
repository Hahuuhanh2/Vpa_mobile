package f2;

import f2.p;
import ik.d;
import kk.e;
import kk.i;
import rk.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
public final class s extends i implements p<p.a<Object>, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9865a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f9866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<Object> f9867c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(p<Object> pVar, d<? super s> dVar) {
        super(2, dVar);
        this.f9867c = pVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        s sVar = new s(this.f9867c, dVar);
        sVar.f9866b = obj;
        return sVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((p.a) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r4.f9865a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0015:
            p3.l0.Q0(r5)
            goto L_0x0082
        L_0x001a:
            p3.l0.Q0(r5)
            java.lang.Object r5 = r4.f9866b
            f2.p$a r5 = (f2.p.a) r5
            boolean r1 = r5 instanceof f2.p.a.C0104a
            if (r1 == 0) goto L_0x0071
            f2.p<java.lang.Object> r1 = r4.f9867c
            f2.p$a$a r5 = (f2.p.a.C0104a) r5
            r4.f9865a = r3
            dl.z r2 = r1.f9816h
            java.lang.Object r2 = r2.h()
            f2.a0 r2 = (f2.a0) r2
            boolean r3 = r2 instanceof f2.b
            if (r3 == 0) goto L_0x0038
            goto L_0x0060
        L_0x0038:
            boolean r3 = r2 instanceof f2.k
            if (r3 == 0) goto L_0x004a
            f2.a0<T> r5 = r5.f9819a
            if (r2 != r5) goto L_0x0060
            java.lang.Object r5 = r1.g(r4)
            if (r5 != r0) goto L_0x0047
            goto L_0x0062
        L_0x0047:
            ek.i r5 = ek.i.f20112a
            goto L_0x0062
        L_0x004a:
            f2.b0 r5 = f2.b0.f9776a
            boolean r5 = sk.j.a(r2, r5)
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r1.g(r4)
            if (r5 != r0) goto L_0x0059
            goto L_0x0062
        L_0x0059:
            ek.i r5 = ek.i.f20112a
            goto L_0x0062
        L_0x005c:
            boolean r5 = r2 instanceof f2.i
            if (r5 != 0) goto L_0x0065
        L_0x0060:
            ek.i r5 = ek.i.f20112a
        L_0x0062:
            if (r5 != r0) goto L_0x0082
            return r0
        L_0x0065:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0071:
            boolean r1 = r5 instanceof f2.p.a.b
            if (r1 == 0) goto L_0x0082
            f2.p<java.lang.Object> r1 = r4.f9867c
            f2.p$a$b r5 = (f2.p.a.b) r5
            r4.f9865a = r2
            java.lang.Object r5 = f2.p.c(r1, r5, r4)
            if (r5 != r0) goto L_0x0082
            return r0
        L_0x0082:
            ek.i r5 = ek.i.f20112a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
