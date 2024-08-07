package ul;

import al.g0;
import ik.d;
import kk.c;
import kk.e;
import p3.l0;

/* compiled from: KotlinExtensions.kt */
public final class p {

    /* compiled from: KotlinExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f23128a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Exception f23129b;

        public a(Exception exc, b bVar) {
            this.f23128a = bVar;
            this.f23129b = exc;
        }

        public final void run() {
            g0.b0(this.f23128a).resumeWith(l0.A(this.f23129b));
        }
    }

    @e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* compiled from: KotlinExtensions.kt */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f23130a;

        /* renamed from: b  reason: collision with root package name */
        public int f23131b;

        public b(d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f23130a = obj;
            this.f23131b |= Integer.MIN_VALUE;
            return p.a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, ik.d<?> r5) {
        /*
            boolean r0 = r5 instanceof ul.p.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ul.p$b r0 = (ul.p.b) r0
            int r1 = r0.f23131b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23131b = r1
            goto L_0x0018
        L_0x0013:
            ul.p$b r0 = new ul.p$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f23130a
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f23131b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p3.l0.Q0(r5)
            ek.i r4 = ek.i.f20112a
            return r4
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p3.l0.Q0(r5)
            r0.getClass()
            r0.f23131b = r3
            gl.c r5 = al.r0.f19084a
            ik.f r2 = r0.getContext()
            ul.p$a r3 = new ul.p$a
            r3.<init>(r4, r0)
            r5.s(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ul.p.a(java.lang.Exception, ik.d):java.lang.Object");
    }
}
