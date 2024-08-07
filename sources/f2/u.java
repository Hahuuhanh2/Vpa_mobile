package f2;

import dl.f;
import ik.d;
import kk.c;
import kk.e;

/* compiled from: Collect.kt */
public final class u implements f<a0<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f9873a;

    @e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f9874a;

        /* renamed from: b  reason: collision with root package name */
        public int f9875b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u f9876c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u uVar, d dVar) {
            super(dVar);
            this.f9876c = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9874a = obj;
            this.f9875b |= Integer.MIN_VALUE;
            return this.f9876c.e((Object) null, this);
        }
    }

    public u(f fVar) {
        this.f9873a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.Object r5, ik.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f2.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            f2.u$a r0 = (f2.u.a) r0
            int r1 = r0.f9875b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9875b = r1
            goto L_0x0018
        L_0x0013:
            f2.u$a r0 = new f2.u$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f9874a
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9875b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r6)
            goto L_0x004f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p3.l0.Q0(r6)
            dl.f r6 = r4.f9873a
            f2.a0 r5 = (f2.a0) r5
            boolean r2 = r5 instanceof f2.k
            if (r2 != 0) goto L_0x006d
            boolean r2 = r5 instanceof f2.i
            if (r2 != 0) goto L_0x0068
            boolean r2 = r5 instanceof f2.b
            if (r2 == 0) goto L_0x0052
            f2.b r5 = (f2.b) r5
            T r5 = r5.f9774a
            r0.f9875b = r3
            java.lang.Object r5 = r6.e(r5, r0)
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            ek.i r5 = ek.i.f20112a
            return r5
        L_0x0052:
            boolean r5 = r5 instanceof f2.b0
            if (r5 == 0) goto L_0x0062
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0062:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0068:
            f2.i r5 = (f2.i) r5
            java.lang.Throwable r5 = r5.f9795a
            throw r5
        L_0x006d:
            f2.k r5 = (f2.k) r5
            java.lang.Throwable r5 = r5.f9796a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.u.e(java.lang.Object, ik.d):java.lang.Object");
    }
}
