package dl;

import el.k;
import ik.d;
import kk.c;
import kk.e;

/* compiled from: Flow.kt */
public abstract class a<T> implements e<T> {

    @e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: dl.a$a  reason: collision with other inner class name */
    /* compiled from: Flow.kt */
    public static final class C0274a extends c {

        /* renamed from: a  reason: collision with root package name */
        public k f19951a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f19952b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a<T> f19953c;

        /* renamed from: d  reason: collision with root package name */
        public int f19954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0274a(a<T> aVar, d<? super C0274a> dVar) {
            super(dVar);
            this.f19953c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19952b = obj;
            this.f19954d |= Integer.MIN_VALUE;
            return this.f19953c.a((f) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dl.f<? super T> r6, ik.d<? super ek.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dl.a.C0274a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            dl.a$a r0 = (dl.a.C0274a) r0
            int r1 = r0.f19954d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19954d = r1
            goto L_0x0018
        L_0x0013:
            dl.a$a r0 = new dl.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f19952b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19954d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            el.k r6 = r0.f19951a
            p3.l0.Q0(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            r7 = move-exception
            goto L_0x005f
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p3.l0.Q0(r7)
            el.k r7 = new el.k
            ik.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f19951a = r7     // Catch:{ all -> 0x005b }
            r0.f19954d = r3     // Catch:{ all -> 0x005b }
            r6 = r5
            dl.t r6 = (dl.t) r6     // Catch:{ all -> 0x005b }
            rk.p<dl.f<? super T>, ik.d<? super ek.i>, java.lang.Object> r6 = r6.f20027a     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            ek.i r6 = ek.i.f20112a     // Catch:{ all -> 0x005b }
        L_0x0051:
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r7
        L_0x0055:
            r6.releaseIntercepted()
            ek.i r6 = ek.i.f20112a
            return r6
        L_0x005b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.a.a(dl.f, ik.d):java.lang.Object");
    }
}
