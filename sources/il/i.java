package il;

import al.k;
import android.support.v4.media.a;
import fl.s;
import hl.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p3.l0;
import u9.b;

/* compiled from: Semaphore.kt */
public class i {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20668c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20669d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20670e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20671f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20672g;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f20673a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final g f20674b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    static {
        Class<Object> cls = Object.class;
        Class<i> cls2 = i.class;
        f20668c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f20669d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f20670e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f20671f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f20672g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public i(int i10) {
        boolean z10;
        if (i10 < 0 || i10 > 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            k kVar = new k(0, (k) null, 2);
            this.head = kVar;
            this.tail = kVar;
            this._availablePermits = 1 - i10;
            this.f20674b = new g(this);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x006e, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(il.d.a r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
        L_0x0004:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f20672g
            int r2 = r2.getAndDecrement(r0)
            int r3 = r0.f20673a
            if (r2 > r3) goto L_0x0004
            if (r2 <= 0) goto L_0x0019
            ek.i r2 = ek.i.f20112a
            il.g r3 = r0.f20674b
            r1.k(r2, r3)
            goto L_0x00c1
        L_0x0019:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f20670e
            java.lang.Object r3 = r2.get(r0)
            il.k r3 = (il.k) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f20671f
            long r4 = r4.getAndIncrement(r0)
            il.f r6 = il.f.f20665p
            int r7 = il.j.f20680f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x002e:
            java.lang.Object r9 = p3.l0.R(r3, r7, r6)
            boolean r10 = j7.a.R(r9)
            if (r10 != 0) goto L_0x007b
            fl.s r10 = j7.a.M(r9)
        L_0x003c:
            java.lang.Object r13 = r2.get(r0)
            fl.s r13 = (fl.s) r13
            long r14 = r13.f20261c
            long r11 = r10.f20261c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x004b
            goto L_0x006d
        L_0x004b:
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x0053
            r10 = 0
            goto L_0x006e
        L_0x0053:
            boolean r11 = r2.compareAndSet(r0, r13, r10)
            if (r11 == 0) goto L_0x005b
            r11 = 1
            goto L_0x0062
        L_0x005b:
            java.lang.Object r11 = r2.get(r0)
            if (r11 == r13) goto L_0x0053
            r11 = 0
        L_0x0062:
            if (r11 == 0) goto L_0x0071
            boolean r10 = r13.e()
            if (r10 == 0) goto L_0x006d
            r13.d()
        L_0x006d:
            r10 = 1
        L_0x006e:
            if (r10 == 0) goto L_0x002e
            goto L_0x007b
        L_0x0071:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x003c
            r10.d()
            goto L_0x003c
        L_0x007b:
            fl.s r2 = j7.a.M(r9)
            il.k r2 = (il.k) r2
            int r3 = il.j.f20680f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.f20681e
        L_0x0089:
            boolean r6 = r5.compareAndSet(r3, r4, r1)
            if (r6 == 0) goto L_0x0091
            r4 = 1
            goto L_0x0098
        L_0x0091:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == 0) goto L_0x0089
            r4 = 0
        L_0x0098:
            if (r4 == 0) goto L_0x009e
            r1.b(r2, r3)
            goto L_0x00bc
        L_0x009e:
            u9.b r6 = il.j.f20676b
            u9.b r7 = il.j.f20677c
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.f20681e
        L_0x00a4:
            boolean r2 = r8.compareAndSet(r3, r6, r7)
            if (r2 == 0) goto L_0x00ac
            r2 = 1
            goto L_0x00b3
        L_0x00ac:
            java.lang.Object r2 = r8.get(r3)
            if (r2 == r6) goto L_0x00a4
            r2 = 0
        L_0x00b3:
            if (r2 == 0) goto L_0x00be
            ek.i r2 = ek.i.f20112a
            il.g r3 = r0.f20674b
            r1.k(r2, r3)
        L_0x00bc:
            r11 = 1
            goto L_0x00bf
        L_0x00be:
            r11 = 0
        L_0x00bf:
            if (r11 == 0) goto L_0x0004
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il.i.c(il.d$a):void");
    }

    public final void d() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        Object R;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        do {
            int andIncrement = f20672g.getAndIncrement(this);
            if (andIncrement >= this.f20673a) {
                do {
                    atomicIntegerFieldUpdater = f20672g;
                    i10 = atomicIntegerFieldUpdater.get(this);
                    i11 = this.f20673a;
                    if (i10 <= i11 || atomicIntegerFieldUpdater.compareAndSet(this, i10, i11)) {
                        StringBuilder q10 = a.q("The number of released permits cannot be greater than ");
                        q10.append(this.f20673a);
                    }
                    atomicIntegerFieldUpdater = f20672g;
                    i10 = atomicIntegerFieldUpdater.get(this);
                    i11 = this.f20673a;
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                StringBuilder q102 = a.q("The number of released permits cannot be greater than ");
                q102.append(this.f20673a);
                throw new IllegalStateException(q102.toString().toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20668c;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = f20669d.getAndIncrement(this);
                long j10 = andIncrement2 / ((long) j.f20680f);
                h hVar = h.f20667p;
                do {
                    R = l0.R(kVar, j10, hVar);
                    if (j7.a.R(R)) {
                        break;
                    }
                    s M = j7.a.M(R);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
                        if (sVar.f20261c >= M.f20261c) {
                            break;
                        } else if (!M.i()) {
                            z13 = false;
                            continue;
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, M)) {
                                    if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                        z14 = false;
                                        break;
                                    }
                                } else {
                                    z14 = true;
                                    break;
                                }
                            }
                            if (z14) {
                                if (sVar.e()) {
                                    sVar.d();
                                }
                            } else if (M.e()) {
                                M.d();
                            }
                        }
                    }
                    z13 = true;
                    continue;
                } while (!z13);
                k kVar2 = (k) j7.a.M(R);
                kVar2.a();
                if (kVar2.f20261c <= j10) {
                    int i12 = (int) (andIncrement2 % ((long) j.f20680f));
                    Object andSet = kVar2.f20681e.getAndSet(i12, j.f20676b);
                    if (andSet == null) {
                        int i13 = j.f20675a;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                b bVar = j.f20676b;
                                b bVar2 = j.f20678d;
                                AtomicReferenceArray atomicReferenceArray = kVar2.f20681e;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i12, bVar, bVar2)) {
                                        if (atomicReferenceArray.get(i12) != bVar) {
                                            z11 = true;
                                            z12 = false;
                                            break;
                                        }
                                    } else {
                                        z11 = true;
                                        z12 = true;
                                        break;
                                    }
                                }
                                z10 = z11 ^ z12;
                                continue;
                            } else if (kVar2.f20681e.get(i12) == j.f20677c) {
                                z10 = true;
                                continue;
                                break;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        z10 = true;
                        if (andSet != j.f20679e) {
                            if (andSet instanceof k) {
                                k kVar3 = (k) andSet;
                                b f10 = kVar3.f(ek.i.f20112a, this.f20674b);
                                if (f10 != null) {
                                    kVar3.n(f10);
                                    continue;
                                }
                            } else if (andSet instanceof f) {
                                z10 = ((f) andSet).e(this, ek.i.f20112a);
                                continue;
                            } else {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                }
                z10 = false;
                continue;
            } else {
                return;
            }
        } while (!z10);
    }
}
