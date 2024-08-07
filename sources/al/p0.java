package al;

import gl.g;
import ik.d;
import java.util.concurrent.CancellationException;
import sk.j;

/* compiled from: DispatchedTask.kt */
public abstract class p0<T> extends g {

    /* renamed from: c  reason: collision with root package name */
    public int f19082c;

    public p0(int i10) {
        this.f19082c = i10;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract d<T> c();

    public Throwable d(Object obj) {
        u uVar;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar.f19094a;
        }
        return null;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void g(Throwable th2, Throwable th3) {
        if (th2 != null || th3 != null) {
            if (!(th2 == null || th3 == null)) {
                g0.s(th2, th3);
            }
            if (th2 == null) {
                th2 = th3;
            }
            j.c(th2);
            c0.a(c().getContext(), new f0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r4.l0() != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r4.l0() != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[Catch:{ all -> 0x005f, all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[Catch:{ all -> 0x005f, all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[SYNTHETIC, Splitter:B:29:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            gl.h r0 = r12.f20486b
            ik.d r1 = r12.c()     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            sk.j.d(r1, r2)     // Catch:{ all -> 0x009e }
            fl.f r1 = (fl.f) r1     // Catch:{ all -> 0x009e }
            ik.d<T> r2 = r1.f20229e     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r1.f20231n     // Catch:{ all -> 0x009e }
            ik.f r3 = r2.getContext()     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = fl.v.b(r3, r1)     // Catch:{ all -> 0x009e }
            u9.b r4 = fl.v.f20264a     // Catch:{ all -> 0x009e }
            r5 = 0
            if (r1 == r4) goto L_0x0023
            al.d2 r4 = al.y.c(r2, r3, r1)     // Catch:{ all -> 0x009e }
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            ik.f r6 = r2.getContext()     // Catch:{ all -> 0x005f }
            java.lang.Object r7 = r12.h()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r8 = r12.d(r7)     // Catch:{ all -> 0x005f }
            if (r8 != 0) goto L_0x0047
            int r9 = r12.f19082c     // Catch:{ all -> 0x005f }
            r10 = 1
            if (r9 == r10) goto L_0x003c
            r11 = 2
            if (r9 != r11) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x0047
            al.i1$b r9 = al.i1.b.f19045a     // Catch:{ all -> 0x005f }
            ik.f$b r6 = r6.get(r9)     // Catch:{ all -> 0x005f }
            al.i1 r6 = (al.i1) r6     // Catch:{ all -> 0x005f }
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.isActive()     // Catch:{ all -> 0x005f }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()     // Catch:{ all -> 0x005f }
            r12.a(r7, r6)     // Catch:{ all -> 0x005f }
            ek.f$a r6 = p3.l0.A(r6)     // Catch:{ all -> 0x005f }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0072
        L_0x005f:
            r2 = move-exception
            goto L_0x0092
        L_0x0061:
            if (r8 == 0) goto L_0x006b
            ek.f$a r6 = p3.l0.A(r8)     // Catch:{ all -> 0x005f }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0072
        L_0x006b:
            java.lang.Object r6 = r12.e(r7)     // Catch:{ all -> 0x005f }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005f }
        L_0x0072:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x007c
            boolean r2 = r4.l0()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x007f
        L_0x007c:
            fl.v.a(r3, r1)     // Catch:{ all -> 0x009e }
        L_0x007f:
            r0.a()     // Catch:{ all -> 0x0085 }
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            r0 = move-exception
            ek.f$a r0 = p3.l0.A(r0)
        L_0x008a:
            java.lang.Throwable r0 = ek.f.a(r0)
            r12.g(r5, r0)
            goto L_0x00b1
        L_0x0092:
            if (r4 == 0) goto L_0x009a
            boolean r4 = r4.l0()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x009d
        L_0x009a:
            fl.v.a(r3, r1)     // Catch:{ all -> 0x009e }
        L_0x009d:
            throw r2     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            r0.a()     // Catch:{ all -> 0x00a5 }
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x00a5 }
            goto L_0x00aa
        L_0x00a5:
            r0 = move-exception
            ek.f$a r0 = p3.l0.A(r0)
        L_0x00aa:
            java.lang.Throwable r0 = ek.f.a(r0)
            r12.g(r1, r0)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.p0.run():void");
    }
}
