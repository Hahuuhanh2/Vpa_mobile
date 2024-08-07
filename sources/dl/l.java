package dl;

import ik.d;
import kk.c;
import kk.e;
import sk.r;

/* compiled from: Errors.kt */
public final class l<T> implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f<T> f19998a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r<Throwable> f19999b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    /* compiled from: Errors.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public l f20000a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f20001b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l<T> f20002c;

        /* renamed from: d  reason: collision with root package name */
        public int f20003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<? super T> lVar, d<? super a> dVar) {
            super(dVar);
            this.f20002c = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f20001b = obj;
            this.f20003d |= Integer.MIN_VALUE;
            return this.f20002c.e(null, this);
        }
    }

    public l(f<? super T> fVar, r<Throwable> rVar) {
        this.f19998a = fVar;
        this.f19999b = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(T r5, ik.d<? super ek.i> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dl.l.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            dl.l$a r0 = (dl.l.a) r0
            int r1 = r0.f20003d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f20003d = r1
            goto L_0x0018
        L_0x0013:
            dl.l$a r0 = new dl.l$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f20001b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20003d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            dl.l r5 = r0.f20000a
            p3.l0.Q0(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0043
        L_0x0029:
            r6 = move-exception
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p3.l0.Q0(r6)
            dl.f<T> r6 = r4.f19998a     // Catch:{ all -> 0x0046 }
            r0.f20000a = r4     // Catch:{ all -> 0x0046 }
            r0.f20003d = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r6.e(r5, r0)     // Catch:{ all -> 0x0046 }
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ek.i r5 = ek.i.f20112a
            return r5
        L_0x0046:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x0049:
            sk.r<java.lang.Throwable> r5 = r5.f19999b
            r5.f22931a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.l.e(java.lang.Object, ik.d):java.lang.Object");
    }
}
