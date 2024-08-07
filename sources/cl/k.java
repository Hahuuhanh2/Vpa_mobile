package cl;

import al.g0;
import cl.i;
import el.f;
import fk.u;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m9.b;
import rk.l;

/* compiled from: ConflatedBufferedChannel.kt */
public final class k<E> extends a<E> {

    /* renamed from: s  reason: collision with root package name */
    public final int f19260s;

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(int r2, java.lang.Object r3, rk.l<? super E, ek.i> r4) {
        /*
            r1 = this;
            r1.<init>(r2, r4)
            r1.f19260s = r3
            r4 = 1
            r0 = 0
            if (r3 == r4) goto L_0x000b
            r3 = r4
            goto L_0x000c
        L_0x000b:
            r3 = r0
        L_0x000c:
            if (r3 == 0) goto L_0x0027
            if (r2 < r4) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r4 = r0
        L_0x0012:
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r3 = "Buffered channel capacity must be at least 1, but "
            java.lang.String r4 = " was specified"
            java.lang.String r2 = v.v.d(r3, r2, r4)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x0027:
            java.lang.String r2 = "This implementation does not support suspension for senders, use "
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
            java.lang.Class<cl.a> r3 = cl.a.class
            sk.d r3 = sk.s.a(r3)
            java.lang.String r3 = r3.b()
            r2.append(r3)
            java.lang.String r3 = " instead"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.k.<init>(int, int, rk.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return ek.i.f20112a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(E r20, boolean r21) {
        /*
            r19 = this;
            r8 = r19
            int r0 = r8.f19260s
            r9 = 0
            r10 = 3
            r11 = 1
            if (r0 != r10) goto L_0x002c
            java.lang.Object r0 = super.l(r20)
            boolean r1 = r0 instanceof cl.i.b
            r1 = r1 ^ r11
            if (r1 != 0) goto L_0x00f3
            boolean r1 = r0 instanceof cl.i.a
            if (r1 == 0) goto L_0x0018
            goto L_0x00f3
        L_0x0018:
            if (r21 == 0) goto L_0x0028
            rk.l<E, ek.i> r0 = r8.f19217b
            if (r0 == 0) goto L_0x0028
            r12 = r20
            kotlinx.coroutines.internal.UndeliveredElementException r0 = m9.b.g(r0, r12, r9)
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            throw r0
        L_0x0028:
            ek.i r0 = ek.i.f20112a
            goto L_0x00f3
        L_0x002c:
            r12 = r20
            u9.b r13 = cl.d.f19235d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = cl.a.f19211n
            java.lang.Object r0 = r0.get(r8)
            cl.j r0 = (cl.j) r0
        L_0x0038:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = cl.a.f19207c
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r1 & r3
            r3 = 0
            boolean r16 = r8.x(r1, r3)
            int r7 = cl.d.f19233b
            long r4 = (long) r7
            long r1 = r14 / r4
            long r9 = r14 % r4
            int r9 = (int) r9
            long r11 = r0.f20261c
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0074
            cl.j r1 = cl.a.f(r8, r1, r0)
            if (r1 != 0) goto L_0x0072
            if (r16 == 0) goto L_0x006c
            java.lang.Throwable r0 = r19.u()
            cl.i$a r1 = new cl.i$a
            r1.<init>(r0)
        L_0x0069:
            r0 = r1
            goto L_0x00f3
        L_0x006c:
            r12 = r20
            r9 = 0
            r10 = 3
            r11 = 1
            goto L_0x0038
        L_0x0072:
            r11 = r1
            goto L_0x0075
        L_0x0074:
            r11 = r0
        L_0x0075:
            r0 = r19
            r1 = r11
            r2 = r9
            r3 = r20
            r17 = r4
            r4 = r14
            r6 = r13
            r12 = r7
            r7 = r16
            int r0 = cl.a.h(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00ee
            r1 = 1
            if (r0 == r1) goto L_0x00f1
            r2 = 2
            if (r0 == r2) goto L_0x00c3
            r2 = 3
            if (r0 == r2) goto L_0x00b7
            r3 = 4
            if (r0 == r3) goto L_0x00a2
            r3 = 5
            if (r0 == r3) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r11.a()
        L_0x009b:
            r12 = r20
            r10 = r2
            r0 = r11
            r9 = 0
            r11 = r1
            goto L_0x0038
        L_0x00a2:
            long r0 = r19.t()
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            r11.a()
        L_0x00ad:
            java.lang.Throwable r0 = r19.u()
            cl.i$a r1 = new cl.i$a
            r1.<init>(r0)
            goto L_0x0069
        L_0x00b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            if (r16 == 0) goto L_0x00d2
            r11.h()
            java.lang.Throwable r0 = r19.u()
            cl.i$a r1 = new cl.i$a
            r1.<init>(r0)
            goto L_0x0069
        L_0x00d2:
            boolean r0 = r13 instanceof al.f2
            if (r0 == 0) goto L_0x00da
            r0 = r13
            al.f2 r0 = (al.f2) r0
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            if (r0 == 0) goto L_0x00e2
            int r7 = r9 + r12
            r0.b(r11, r7)
        L_0x00e2:
            long r0 = r11.f20261c
            long r0 = r0 * r17
            long r2 = (long) r9
            long r0 = r0 + r2
            r8.n(r0)
            ek.i r0 = ek.i.f20112a
            goto L_0x00f3
        L_0x00ee:
            r11.a()
        L_0x00f1:
            ek.i r0 = ek.i.f20112a
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.k.M(java.lang.Object, boolean):java.lang.Object");
    }

    public final Object e(u uVar, f.a.C0280a.C0281a aVar) {
        UndeliveredElementException g2;
        Object M = M(uVar, true);
        boolean z10 = M instanceof i.a;
        if (!z10) {
            return ek.i.f20112a;
        }
        if (z10) {
            i.a aVar2 = (i.a) M;
        }
        l<E, ek.i> lVar = this.f19217b;
        if (lVar == null || (g2 = b.g(lVar, uVar, (UndeliveredElementException) null)) == null) {
            throw u();
        }
        g0.s(g2, u());
        throw g2;
    }

    public final Object l(E e10) {
        return M(e10, false);
    }

    public final boolean z() {
        if (this.f19260s == 2) {
            return true;
        }
        return false;
    }
}
