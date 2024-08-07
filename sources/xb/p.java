package xb;

import ab.c;
import ik.d;
import kk.e;

/* compiled from: SessionCoordinator.kt */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final c f17235a;

    /* renamed from: b  reason: collision with root package name */
    public final k f17236b;

    @e(c = "com.google.firebase.sessions.SessionCoordinator", f = "SessionCoordinator.kt", l = {36}, m = "attemptLoggingSessionEvent")
    /* compiled from: SessionCoordinator.kt */
    public static final class a extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f17237a;

        /* renamed from: b  reason: collision with root package name */
        public r f17238b;

        /* renamed from: c  reason: collision with root package name */
        public v f17239c;

        /* renamed from: d  reason: collision with root package name */
        public v f17240d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f17241e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p f17242f;

        /* renamed from: n  reason: collision with root package name */
        public int f17243n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, d<? super a> dVar) {
            super(dVar);
            this.f17242f = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17241e = obj;
            this.f17243n |= Integer.MIN_VALUE;
            return this.f17242f.a((r) null, this);
        }
    }

    public p(c cVar, j jVar) {
        this.f17235a = cVar;
        this.f17236b = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(xb.r r7, ik.d<? super ek.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xb.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xb.p$a r0 = (xb.p.a) r0
            int r1 = r0.f17243n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17243n = r1
            goto L_0x0018
        L_0x0013:
            xb.p$a r0 = new xb.p$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f17241e
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17243n
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            xb.v r7 = r0.f17240d
            xb.v r1 = r0.f17239c
            xb.r r2 = r0.f17238b
            xb.p r0 = r0.f17237a
            p3.l0.Q0(r8)     // Catch:{ Exception -> 0x0035 }
            r5 = r8
            r8 = r7
            r7 = r2
            r2 = r1
            r1 = r0
            r0 = r5
            goto L_0x0062
        L_0x0035:
            r7 = move-exception
            goto L_0x006f
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            p3.l0.Q0(r8)
            xb.v r8 = r7.f17249b
            ab.c r2 = r6.f17235a     // Catch:{ Exception -> 0x0072 }
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = "firebaseInstallations.id"
            sk.j.e(r2, r4)     // Catch:{ Exception -> 0x0072 }
            r0.f17237a = r6     // Catch:{ Exception -> 0x0072 }
            r0.f17238b = r7     // Catch:{ Exception -> 0x0072 }
            r0.f17239c = r8     // Catch:{ Exception -> 0x0072 }
            r0.f17240d = r8     // Catch:{ Exception -> 0x0072 }
            r0.f17243n = r3     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r0 = jl.c.a(r2, r0)     // Catch:{ Exception -> 0x0072 }
            if (r0 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r1 = r6
            r2 = r8
        L_0x0062:
            java.lang.String r3 = "{\n        firebaseInstallations.id.await()\n      }"
            sk.j.e(r0, r3)     // Catch:{ Exception -> 0x006a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x006a }
            goto L_0x007c
        L_0x006a:
            r8 = move-exception
            r0 = r1
            r1 = r2
            r2 = r7
            r7 = r8
        L_0x006f:
            r8 = r1
            r1 = r0
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            r1 = r6
            r2 = r7
            r7 = r0
        L_0x0076:
            r7.toString()
            java.lang.String r0 = ""
            r7 = r2
        L_0x007c:
            r8.getClass()
            r8.f17264f = r0
            xb.k r8 = r1.f17236b     // Catch:{ RuntimeException -> 0x008a }
            r8.a(r7)     // Catch:{ RuntimeException -> 0x008a }
            xb.v r7 = r7.f17249b     // Catch:{ RuntimeException -> 0x008a }
            java.lang.String r7 = r7.f17259a     // Catch:{ RuntimeException -> 0x008a }
        L_0x008a:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.p.a(xb.r, ik.d):java.lang.Object");
    }
}
