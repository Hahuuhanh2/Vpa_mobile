package dl;

import ik.d;
import kk.c;
import kk.e;
import rk.p;
import sk.q;

/* compiled from: Limit.kt */
public final class m<T> implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f20004a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f<T> f20005b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<T, d<? super Boolean>, Object> f20006c;

    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
    /* compiled from: Limit.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public m f20007a;

        /* renamed from: b  reason: collision with root package name */
        public Object f20008b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f20009c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m<T> f20010d;

        /* renamed from: e  reason: collision with root package name */
        public int f20011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m<? super T> mVar, d<? super a> dVar) {
            super(dVar);
            this.f20010d = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f20009c = obj;
            this.f20011e |= Integer.MIN_VALUE;
            return this.f20010d.e(null, this);
        }
    }

    public m(q qVar, f<? super T> fVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        this.f20004a = qVar;
        this.f20005b = fVar;
        this.f20006c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(T r7, ik.d<? super ek.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dl.m.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            dl.m$a r0 = (dl.m.a) r0
            int r1 = r0.f20011e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f20011e = r1
            goto L_0x0018
        L_0x0013:
            dl.m$a r0 = new dl.m$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f20009c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20011e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p3.l0.Q0(r8)
            goto L_0x0084
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f20008b
            dl.m r2 = r0.f20007a
            p3.l0.Q0(r8)
            goto L_0x0068
        L_0x003d:
            p3.l0.Q0(r8)
            goto L_0x0055
        L_0x0041:
            p3.l0.Q0(r8)
            sk.q r8 = r6.f20004a
            boolean r8 = r8.f22930a
            if (r8 == 0) goto L_0x0058
            dl.f<T> r8 = r6.f20005b
            r0.f20011e = r5
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            ek.i r7 = ek.i.f20112a
            return r7
        L_0x0058:
            rk.p<T, ik.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f20006c
            r0.f20007a = r6
            r0.f20008b = r7
            r0.f20011e = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0087
            sk.q r8 = r2.f20004a
            r8.f22930a = r5
            dl.f<T> r8 = r2.f20005b
            r2 = 0
            r0.f20007a = r2
            r0.f20008b = r2
            r0.f20011e = r3
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 != r1) goto L_0x0084
            return r1
        L_0x0084:
            ek.i r7 = ek.i.f20112a
            return r7
        L_0x0087:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.m.e(java.lang.Object, ik.d):java.lang.Object");
    }
}
