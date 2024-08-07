package fk;

import ek.i;
import ik.d;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.h;
import rk.p;
import xk.g;

@e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
/* compiled from: SlidingWindow.kt */
public final class b0 extends h implements p<g<? super List<Object>>, d<? super i>, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Object f20183b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f20184c;

    /* renamed from: d  reason: collision with root package name */
    public int f20185d;

    /* renamed from: e  reason: collision with root package name */
    public int f20186e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f20187f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f20188n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f20189o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f20190p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f20191q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f20192r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(int i10, int i11, Iterator<Object> it, boolean z10, boolean z11, d<? super b0> dVar) {
        super(dVar);
        this.f20188n = i10;
        this.f20189o = i11;
        this.f20190p = it;
        this.f20191q = z10;
        this.f20192r = z11;
    }

    public final d<i> create(Object obj, d<?> dVar) {
        b0 b0Var = new b0(this.f20188n, this.f20189o, this.f20190p, this.f20191q, this.f20192r, dVar);
        b0Var.f20187f = obj;
        return b0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((g) obj, (d) obj2)).invokeSuspend(i.f20112a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r2.f20187f = r7;
        r2.f20183b = r6;
        r2.f20184c = r5;
        r2.f20185d = r12;
        r2.f20186e = 1;
        r7.a(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (jk.a.COROUTINE_SUSPENDED != r1) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20186e
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 4
            r7 = 5
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r9) goto L_0x0045
            if (r2 == r4) goto L_0x0040
            if (r2 == r5) goto L_0x0030
            if (r2 == r6) goto L_0x0022
            if (r2 != r7) goto L_0x001a
            goto L_0x0040
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            java.lang.Object r2 = r0.f20183b
            fk.a0 r2 = (fk.a0) r2
            java.lang.Object r4 = r0.f20187f
            xk.g r4 = (xk.g) r4
            p3.l0.Q0(r18)
            r11 = r0
            goto L_0x0199
        L_0x0030:
            java.util.Iterator r2 = r0.f20184c
            java.lang.Object r4 = r0.f20183b
            fk.a0 r4 = (fk.a0) r4
            java.lang.Object r10 = r0.f20187f
            xk.g r10 = (xk.g) r10
            p3.l0.Q0(r18)
            r11 = r0
            goto L_0x0162
        L_0x0040:
            p3.l0.Q0(r18)
            goto L_0x01b6
        L_0x0045:
            int r2 = r0.f20185d
            java.util.Iterator r5 = r0.f20184c
            java.lang.Object r6 = r0.f20183b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.f20187f
            xk.g r7 = (xk.g) r7
            p3.l0.Q0(r18)
            r12 = r2
            r2 = r0
            goto L_0x00a5
        L_0x0057:
            p3.l0.Q0(r18)
            java.lang.Object r2 = r0.f20187f
            xk.g r2 = (xk.g) r2
            int r10 = r0.f20188n
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 <= r11) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r11 = r10
        L_0x0066:
            int r12 = r0.f20189o
            int r12 = r12 - r10
            if (r12 < 0) goto L_0x00d9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            java.util.Iterator<java.lang.Object> r6 = r0.f20190p
            r7 = r2
            r2 = r0
            r16 = r6
            r6 = r5
            r5 = r16
        L_0x0079:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00b6
            java.lang.Object r10 = r5.next()
            if (r8 <= 0) goto L_0x0088
            int r8 = r8 + -1
            goto L_0x0079
        L_0x0088:
            r6.add(r10)
            int r10 = r6.size()
            int r11 = r2.f20188n
            if (r10 != r11) goto L_0x0079
            r2.f20187f = r7
            r2.f20183b = r6
            r2.f20184c = r5
            r2.f20185d = r12
            r2.f20186e = r9
            r7.a(r6, r2)
            jk.a r8 = jk.a.COROUTINE_SUSPENDED
            if (r8 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            boolean r8 = r2.f20191q
            if (r8 == 0) goto L_0x00ad
            r6.clear()
            goto L_0x00b4
        L_0x00ad:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r2.f20188n
            r6.<init>(r8)
        L_0x00b4:
            r8 = r12
            goto L_0x0079
        L_0x00b6:
            boolean r5 = r6.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b6
            boolean r5 = r2.f20192r
            if (r5 != 0) goto L_0x00c9
            int r5 = r6.size()
            int r8 = r2.f20188n
            if (r5 != r8) goto L_0x01b6
        L_0x00c9:
            r2.f20187f = r3
            r2.f20183b = r3
            r2.f20184c = r3
            r2.f20186e = r4
            r7.a(r6, r2)
            jk.a r2 = jk.a.COROUTINE_SUSPENDED
            if (r2 != r1) goto L_0x01b6
            return r1
        L_0x00d9:
            fk.a0 r4 = new fk.a0
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r4.<init>(r10, r8)
            java.util.Iterator<java.lang.Object> r10 = r0.f20190p
            r11 = r0
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x00e8:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0172
            java.lang.Object r12 = r2.next()
            int r13 = r4.g()
            int r14 = r4.f20175b
            if (r13 != r14) goto L_0x00fc
            r13 = r9
            goto L_0x00fd
        L_0x00fc:
            r13 = r8
        L_0x00fd:
            if (r13 != 0) goto L_0x016a
            java.lang.Object[] r13 = r4.f20174a
            int r15 = r4.f20176c
            int r8 = r4.f20177d
            int r15 = r15 + r8
            int r15 = r15 % r14
            r13[r15] = r12
            int r8 = r8 + 1
            r4.f20177d = r8
            int r8 = r4.g()
            int r12 = r4.f20175b
            if (r8 != r12) goto L_0x0117
            r8 = r9
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 == 0) goto L_0x0167
            int r8 = r4.f20177d
            int r13 = r11.f20188n
            if (r8 >= r13) goto L_0x0147
            int r8 = r12 >> 1
            int r12 = r12 + r8
            int r12 = r12 + r9
            if (r12 <= r13) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r13 = r12
        L_0x0128:
            int r8 = r4.f20176c
            if (r8 != 0) goto L_0x0138
            java.lang.Object[] r8 = r4.f20174a
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r13)
            java.lang.String r12 = "copyOf(this, newSize)"
            sk.j.e(r8, r12)
            goto L_0x013e
        L_0x0138:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.Object[] r8 = r4.toArray(r8)
        L_0x013e:
            fk.a0 r12 = new fk.a0
            int r4 = r4.f20177d
            r12.<init>(r8, r4)
            r4 = r12
            goto L_0x0167
        L_0x0147:
            boolean r8 = r11.f20191q
            if (r8 == 0) goto L_0x014d
            r8 = r4
            goto L_0x0152
        L_0x014d:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x0152:
            r11.f20187f = r10
            r11.f20183b = r4
            r11.f20184c = r2
            r11.f20186e = r5
            r10.a(r8, r11)
            jk.a r8 = jk.a.COROUTINE_SUSPENDED
            if (r8 != r1) goto L_0x0162
            return r1
        L_0x0162:
            int r8 = r11.f20189o
            r4.i(r8)
        L_0x0167:
            r8 = 0
            goto L_0x00e8
        L_0x016a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ring buffer is full"
            r1.<init>(r2)
            throw r1
        L_0x0172:
            boolean r2 = r11.f20192r
            if (r2 == 0) goto L_0x01b6
            r2 = r4
            r4 = r10
        L_0x0178:
            int r5 = r2.f20177d
            int r8 = r11.f20189o
            if (r5 <= r8) goto L_0x019f
            boolean r5 = r11.f20191q
            if (r5 == 0) goto L_0x0184
            r5 = r2
            goto L_0x0189
        L_0x0184:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x0189:
            r11.f20187f = r4
            r11.f20183b = r2
            r11.f20184c = r3
            r11.f20186e = r6
            r4.a(r5, r11)
            jk.a r5 = jk.a.COROUTINE_SUSPENDED
            if (r5 != r1) goto L_0x0199
            return r1
        L_0x0199:
            int r5 = r11.f20189o
            r2.i(r5)
            goto L_0x0178
        L_0x019f:
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x01b6
            r11.f20187f = r3
            r11.f20183b = r3
            r11.f20184c = r3
            r11.f20186e = r7
            r4.a(r2, r11)
            jk.a r2 = jk.a.COROUTINE_SUSPENDED
            if (r2 != r1) goto L_0x01b6
            return r1
        L_0x01b6:
            ek.i r1 = ek.i.f20112a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
