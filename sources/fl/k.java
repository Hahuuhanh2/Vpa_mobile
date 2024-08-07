package fl;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u9.b;

/* compiled from: LockFreeTaskQueue.kt */
public final class k<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20246e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20247f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f20248g = new b("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f20249a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20250b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20251c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f20252d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20253a;

        public a(int i10) {
            this.f20253a = i10;
        }
    }

    static {
        Class<k> cls = k.class;
        f20246e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f20247f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public k(int i10, boolean z10) {
        boolean z11;
        this.f20249a = i10;
        this.f20250b = z10;
        int i11 = i10 - 1;
        this.f20251c = i11;
        this.f20252d = new AtomicReferenceArray(i10);
        boolean z12 = false;
        if (i11 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!((i10 & i11) == 0 ? true : z12)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        E e11 = e10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20247f;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) == 0) {
                int i10 = (int) ((1073741823 & j10) >> 0);
                int i11 = (int) ((1152921503533105152L & j10) >> 30);
                int i12 = this.f20251c;
                if (((i11 + 2) & i12) == (i10 & i12)) {
                    return 1;
                }
                if (this.f20250b || this.f20252d.get(i11 & i12) == null) {
                    if (f20247f.compareAndSet(this, j10, (-1152921503533105153L & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                        this.f20252d.set(i11 & i12, e11);
                        k kVar = this;
                        while ((f20247f.get(kVar) & 1152921504606846976L) != 0) {
                            kVar = kVar.c();
                            Object obj = kVar.f20252d.get(kVar.f20251c & i11);
                            if (!(obj instanceof a) || ((a) obj).f20253a != i11) {
                                kVar = null;
                                continue;
                            } else {
                                kVar.f20252d.set(kVar.f20251c & i11, e11);
                                continue;
                            }
                            if (kVar == null) {
                                break;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i13 = this.f20249a;
                    if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                        return 1;
                    }
                }
            } else if ((j10 & 2305843009213693952L) != 0) {
                return 2;
            } else {
                return 1;
            }
        }
        return 1;
    }

    public final boolean b() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20247f;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[LOOP:3: B:18:0x0071->B:21:0x007c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fl.k<E> c() {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f20247f
        L_0x0002:
            long r2 = r6.get(r11)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            long r7 = r2 | r0
            r0 = r6
            r1 = r11
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0002
            r2 = r7
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20246e
        L_0x001f:
            java.lang.Object r1 = r0.get(r11)
            fl.k r1 = (fl.k) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f20246e
            r4 = 0
            fl.k r5 = new fl.k
            int r6 = r11.f20249a
            int r6 = r6 * 2
            boolean r7 = r11.f20250b
            r5.<init>(r6, r7)
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r2
            r8 = 0
            long r6 = r6 >> r8
            int r6 = (int) r6
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
        L_0x0047:
            int r8 = r11.f20251c
            r9 = r6 & r8
            r8 = r8 & r7
            if (r9 == r8) goto L_0x0066
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r11.f20252d
            java.lang.Object r8 = r8.get(r9)
            if (r8 != 0) goto L_0x005b
            fl.k$a r8 = new fl.k$a
            r8.<init>(r6)
        L_0x005b:
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r5.f20252d
            int r10 = r5.f20251c
            r10 = r10 & r6
            r9.set(r10, r8)
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0066:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f20247f
            r7 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r7 = r7 & r2
            r6.set(r5, r7)
        L_0x0071:
            boolean r6 = r1.compareAndSet(r11, r4, r5)
            if (r6 == 0) goto L_0x0078
            goto L_0x001f
        L_0x0078:
            java.lang.Object r6 = r1.get(r11)
            if (r6 == 0) goto L_0x0071
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.k.c():fl.k");
    }

    public final Object d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20247f;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f20248g;
            }
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f20251c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f20252d.get(i13);
            if (obj == null) {
                if (this.f20250b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j11 = ((long) ((i10 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f20247f.compareAndSet(this, j10, (j10 & -1073741824) | j11)) {
                    this.f20252d.set(this.f20251c & i10, (Object) null);
                    return obj2;
                } else if (this.f20250b) {
                    k kVar = this;
                    do {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f20247f;
                        while (true) {
                            long j12 = atomicLongFieldUpdater2.get(kVar);
                            int i14 = (int) ((j12 & 1073741823) >> 0);
                            if ((j12 & 1152921504606846976L) == 0) {
                                if (f20247f.compareAndSet(kVar, j12, (j12 & -1073741824) | j11)) {
                                    kVar.f20252d.set(kVar.f20251c & i14, (Object) null);
                                    kVar = null;
                                    continue;
                                    break;
                                }
                            } else {
                                kVar = kVar.c();
                                continue;
                                break;
                            }
                        }
                    } while (kVar != null);
                    return obj2;
                }
            }
        }
    }
}
