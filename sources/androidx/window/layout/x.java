package androidx.window.layout;

import android.app.Activity;
import cl.g;
import dl.f;
import ik.d;
import kk.e;
import kk.i;
import rk.p;
import v1.a;

@e(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* compiled from: WindowInfoTrackerImpl.kt */
public final class x extends i implements p<f<? super z>, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public a f3715a;

    /* renamed from: b  reason: collision with root package name */
    public g f3716b;

    /* renamed from: c  reason: collision with root package name */
    public int f3717c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f3718d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f3719e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f3720f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(y yVar, Activity activity, d<? super x> dVar) {
        super(2, dVar);
        this.f3719e = yVar;
        this.f3720f = activity;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        x xVar = new x(this.f3719e, this.f3720f, dVar);
        xVar.f3718d = obj;
        return xVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((f) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: dl.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: e0.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: e0.b0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[Catch:{ all -> 0x009d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r9.f3717c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0031
            if (r1 == r2) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            cl.g r1 = r9.f3716b
            v1.a r4 = r9.f3715a
            java.lang.Object r5 = r9.f3718d
            dl.f r5 = (dl.f) r5
            p3.l0.Q0(r10)     // Catch:{ all -> 0x00a5 }
            goto L_0x0059
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0020:
            cl.g r1 = r9.f3716b
            v1.a r4 = r9.f3715a
            java.lang.Object r5 = r9.f3718d
            dl.f r5 = (dl.f) r5
            p3.l0.Q0(r10)     // Catch:{ all -> 0x00a5 }
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x0070
        L_0x0031:
            p3.l0.Q0(r10)
            java.lang.Object r10 = r9.f3718d
            r5 = r10
            dl.f r5 = (dl.f) r5
            r10 = 10
            r1 = 4
            cl.a r10 = cl.h.a(r10, r3, r1)
            e0.b0 r4 = new e0.b0
            r1 = 3
            r4.<init>(r10, r1)
            androidx.window.layout.y r1 = r9.f3719e
            androidx.window.layout.u r1 = r1.f3721b
            android.app.Activity r6 = r9.f3720f
            n.a r7 = new n.a
            r7.<init>(r3)
            r1.a(r6, r7, r4)
            cl.a$a r1 = new cl.a$a     // Catch:{ all -> 0x00a5 }
            r1.<init>()     // Catch:{ all -> 0x00a5 }
        L_0x0059:
            r10 = r9
        L_0x005a:
            r10.f3718d = r5     // Catch:{ all -> 0x00a0 }
            r10.f3715a = r4     // Catch:{ all -> 0x00a0 }
            r10.f3716b = r1     // Catch:{ all -> 0x00a0 }
            r10.f3717c = r2     // Catch:{ all -> 0x00a0 }
            java.lang.Object r6 = r1.a(r10)     // Catch:{ all -> 0x00a0 }
            if (r6 != r0) goto L_0x0069
            return r0
        L_0x0069:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L_0x0070:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009d }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x0093
            java.lang.Object r10 = r4.next()     // Catch:{ all -> 0x009d }
            androidx.window.layout.z r10 = (androidx.window.layout.z) r10     // Catch:{ all -> 0x009d }
            r0.f3718d = r6     // Catch:{ all -> 0x009d }
            r0.f3715a = r5     // Catch:{ all -> 0x009d }
            r0.f3716b = r4     // Catch:{ all -> 0x009d }
            r0.f3717c = r3     // Catch:{ all -> 0x009d }
            java.lang.Object r10 = r6.e(r10, r0)     // Catch:{ all -> 0x009d }
            if (r10 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L_0x005a
        L_0x0093:
            androidx.window.layout.y r10 = r0.f3719e
            androidx.window.layout.u r10 = r10.f3721b
            r10.b(r5)
            ek.i r10 = ek.i.f20112a
            return r10
        L_0x009d:
            r10 = move-exception
            r4 = r5
            goto L_0x00a7
        L_0x00a0:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x00a7
        L_0x00a5:
            r10 = move-exception
            r0 = r9
        L_0x00a7:
            androidx.window.layout.y r0 = r0.f3719e
            androidx.window.layout.u r0 = r0.f3721b
            r0.b(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
