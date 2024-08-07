package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

final class r extends m {

    /* renamed from: h  reason: collision with root package name */
    private static final Unsafe f18445h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f18446i;

    /* renamed from: e  reason: collision with root package name */
    s f18447e;

    /* renamed from: f  reason: collision with root package name */
    volatile s f18448f;

    /* renamed from: g  reason: collision with root package name */
    volatile Thread f18449g;
    volatile int lockState;

    static {
        Class<ConcurrentHashMap> cls = ConcurrentHashMap.class;
        try {
            Unsafe c10 = v.c();
            f18445h = c10;
            f18446i = c10.objectFieldOffset(r.class.getDeclaredField("lockState"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r6 = j$.util.concurrent.ConcurrentHashMap.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r8 = j$.util.concurrent.ConcurrentHashMap.d(r6, r3, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    r(j$.util.concurrent.s r10) {
        /*
            r9 = this;
            r0 = -2
            r1 = 0
            r9.<init>(r0, r1, r1, r1)
            r9.f18448f = r10
            r0 = r1
        L_0x0008:
            if (r10 == 0) goto L_0x005c
            j$.util.concurrent.m r2 = r10.f18432d
            j$.util.concurrent.s r2 = (j$.util.concurrent.s) r2
            r10.f18452g = r1
            r10.f18451f = r1
            if (r0 != 0) goto L_0x001b
            r10.f18450e = r1
            r0 = 0
            r10.f18454i = r0
        L_0x0019:
            r0 = r10
            goto L_0x0058
        L_0x001b:
            java.lang.Object r3 = r10.f18430b
            int r4 = r10.f18429a
            r5 = r0
            r6 = r1
        L_0x0021:
            java.lang.Object r7 = r5.f18430b
            int r8 = r5.f18429a
            if (r8 <= r4) goto L_0x0029
            r7 = -1
            goto L_0x0041
        L_0x0029:
            if (r8 >= r4) goto L_0x002d
            r7 = 1
            goto L_0x0041
        L_0x002d:
            if (r6 != 0) goto L_0x0035
            java.lang.Class r6 = j$.util.concurrent.ConcurrentHashMap.c(r3)
            if (r6 == 0) goto L_0x003b
        L_0x0035:
            int r8 = j$.util.concurrent.ConcurrentHashMap.d(r6, r3, r7)
            if (r8 != 0) goto L_0x0040
        L_0x003b:
            int r7 = j(r3, r7)
            goto L_0x0041
        L_0x0040:
            r7 = r8
        L_0x0041:
            if (r7 > 0) goto L_0x0046
            j$.util.concurrent.s r8 = r5.f18451f
            goto L_0x0048
        L_0x0046:
            j$.util.concurrent.s r8 = r5.f18452g
        L_0x0048:
            if (r8 != 0) goto L_0x005a
            r10.f18450e = r5
            if (r7 > 0) goto L_0x0051
            r5.f18451f = r10
            goto L_0x0053
        L_0x0051:
            r5.f18452g = r10
        L_0x0053:
            j$.util.concurrent.s r10 = c(r0, r10)
            goto L_0x0019
        L_0x0058:
            r10 = r2
            goto L_0x0008
        L_0x005a:
            r5 = r8
            goto L_0x0021
        L_0x005c:
            r9.f18447e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.<init>(j$.util.concurrent.s):void");
    }

    static s b(s sVar, s sVar2) {
        s sVar3;
        while (sVar2 != null && sVar2 != sVar) {
            s sVar4 = sVar2.f18450e;
            if (sVar4 == null) {
                sVar2.f18454i = false;
                return sVar2;
            } else if (sVar2.f18454i) {
                sVar2.f18454i = false;
                return sVar;
            } else {
                s sVar5 = sVar4.f18451f;
                s sVar6 = null;
                if (sVar5 == sVar2) {
                    sVar3 = sVar4.f18452g;
                    if (sVar3 != null && sVar3.f18454i) {
                        sVar3.f18454i = false;
                        sVar4.f18454i = true;
                        sVar = h(sVar, sVar4);
                        sVar4 = sVar2.f18450e;
                        sVar3 = sVar4 == null ? null : sVar4.f18452g;
                    }
                    if (sVar3 != null) {
                        s sVar7 = sVar3.f18451f;
                        s sVar8 = sVar3.f18452g;
                        if ((sVar8 != null && sVar8.f18454i) || (sVar7 != null && sVar7.f18454i)) {
                            if (sVar8 == null || !sVar8.f18454i) {
                                if (sVar7 != null) {
                                    sVar7.f18454i = false;
                                }
                                sVar3.f18454i = true;
                                sVar = i(sVar, sVar3);
                                sVar4 = sVar2.f18450e;
                                if (sVar4 != null) {
                                    sVar6 = sVar4.f18452g;
                                }
                                sVar3 = sVar6;
                            }
                            if (sVar3 != null) {
                                sVar3.f18454i = sVar4 == null ? false : sVar4.f18454i;
                                s sVar9 = sVar3.f18452g;
                                if (sVar9 != null) {
                                    sVar9.f18454i = false;
                                }
                            }
                            if (sVar4 != null) {
                                sVar4.f18454i = false;
                                sVar = h(sVar, sVar4);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar3.f18454i = true;
                    }
                } else {
                    if (sVar5 != null && sVar5.f18454i) {
                        sVar5.f18454i = false;
                        sVar4.f18454i = true;
                        sVar = i(sVar, sVar4);
                        sVar4 = sVar2.f18450e;
                        sVar5 = sVar4 == null ? null : sVar4.f18451f;
                    }
                    if (sVar3 != null) {
                        s sVar10 = sVar3.f18451f;
                        s sVar11 = sVar3.f18452g;
                        if ((sVar10 != null && sVar10.f18454i) || (sVar11 != null && sVar11.f18454i)) {
                            if (sVar10 == null || !sVar10.f18454i) {
                                if (sVar11 != null) {
                                    sVar11.f18454i = false;
                                }
                                sVar3.f18454i = true;
                                sVar = h(sVar, sVar3);
                                sVar4 = sVar2.f18450e;
                                if (sVar4 != null) {
                                    sVar6 = sVar4.f18451f;
                                }
                                sVar3 = sVar6;
                            }
                            if (sVar3 != null) {
                                sVar3.f18454i = sVar4 == null ? false : sVar4.f18454i;
                                s sVar12 = sVar3.f18451f;
                                if (sVar12 != null) {
                                    sVar12.f18454i = false;
                                }
                            }
                            if (sVar4 != null) {
                                sVar4.f18454i = false;
                                sVar = i(sVar, sVar4);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar3.f18454i = true;
                    }
                }
                sVar2 = sVar4;
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.f18454i = true;
        while (true) {
            s sVar4 = sVar2.f18450e;
            if (sVar4 == null) {
                sVar2.f18454i = false;
                return sVar2;
            } else if (!sVar4.f18454i || (sVar3 = sVar4.f18450e) == null) {
                return sVar;
            } else {
                s sVar5 = sVar3.f18451f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.f18452g;
                    if (sVar5 == null || !sVar5.f18454i) {
                        if (sVar2 == sVar4.f18452g) {
                            sVar = h(sVar, sVar4);
                            s sVar6 = sVar4.f18450e;
                            sVar3 = sVar6 == null ? null : sVar6.f18450e;
                            s sVar7 = sVar4;
                            sVar4 = sVar6;
                            sVar2 = sVar7;
                        }
                        if (sVar4 != null) {
                            sVar4.f18454i = false;
                            if (sVar3 != null) {
                                sVar3.f18454i = true;
                                sVar = i(sVar, sVar3);
                            }
                        }
                    }
                } else if (sVar5 == null || !sVar5.f18454i) {
                    if (sVar2 == sVar4.f18451f) {
                        sVar = i(sVar, sVar4);
                        s sVar8 = sVar4.f18450e;
                        sVar3 = sVar8 == null ? null : sVar8.f18450e;
                        s sVar9 = sVar4;
                        sVar4 = sVar8;
                        sVar2 = sVar9;
                    }
                    if (sVar4 != null) {
                        sVar4.f18454i = false;
                        if (sVar3 != null) {
                            sVar3.f18454i = true;
                            sVar = h(sVar, sVar3);
                        }
                    }
                }
                sVar5.f18454i = false;
                sVar4.f18454i = false;
                sVar3.f18454i = true;
                sVar2 = sVar3;
            }
        }
        return sVar;
    }

    private final void d() {
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & -3) == 0) {
                if (f18445h.compareAndSwapInt(this, f18446i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (f18445h.compareAndSwapInt(this, f18446i, i10, i10 | 2)) {
                    z10 = true;
                    this.f18449g = Thread.currentThread();
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.f18449g = null;
        }
    }

    private final void e() {
        if (!f18445h.compareAndSwapInt(this, f18446i, 0, 1)) {
            d();
        }
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f18452g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f18451f;
            sVar2.f18452g = sVar4;
            if (sVar4 != null) {
                sVar4.f18450e = sVar2;
            }
            s sVar5 = sVar2.f18450e;
            sVar3.f18450e = sVar5;
            if (sVar5 == null) {
                sVar3.f18454i = false;
                sVar = sVar3;
            } else if (sVar5.f18451f == sVar2) {
                sVar5.f18451f = sVar3;
            } else {
                sVar5.f18452g = sVar3;
            }
            sVar3.f18451f = sVar2;
            sVar2.f18450e = sVar3;
        }
        return sVar;
    }

    static s i(s sVar, s sVar2) {
        s sVar3 = sVar2.f18451f;
        if (sVar3 != null) {
            s sVar4 = sVar3.f18452g;
            sVar2.f18451f = sVar4;
            if (sVar4 != null) {
                sVar4.f18450e = sVar2;
            }
            s sVar5 = sVar2.f18450e;
            sVar3.f18450e = sVar5;
            if (sVar5 == null) {
                sVar3.f18454i = false;
                sVar = sVar3;
            } else if (sVar5.f18452g == sVar2) {
                sVar5.f18452g = sVar3;
            } else {
                sVar5.f18451f = sVar3;
            }
            sVar3.f18452g = sVar2;
            sVar2.f18450e = sVar3;
        }
        return sVar;
    }

    static int j(Object obj, Object obj2) {
        int compareTo;
        if (obj != null && obj2 != null && (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) != 0) {
            return compareTo;
        }
        return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
    }

    /* access modifiers changed from: package-private */
    public final m a(int i10, Object obj) {
        Thread thread;
        Thread thread2;
        Object obj2;
        s sVar = null;
        if (obj != null) {
            m mVar = this.f18448f;
            while (mVar != null) {
                int i11 = this.lockState;
                if ((i11 & 3) == 0) {
                    Unsafe unsafe = f18445h;
                    long j10 = f18446i;
                    if (unsafe.compareAndSwapInt(this, j10, i11, i11 + 4)) {
                        try {
                            s sVar2 = this.f18447e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i10, obj, (Class) null);
                            }
                            if (v.a(unsafe, this, j10) == 6 && (thread2 = this.f18449g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th2) {
                            if (v.a(f18445h, this, f18446i) == 6 && (thread = this.f18449g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th2;
                        }
                    }
                } else if (mVar.f18429a == i10 && ((obj2 = mVar.f18430b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                } else {
                    mVar = mVar.f18432d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7 A[LOOP:0: B:1:0x000c->B:53:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0071 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j$.util.concurrent.s f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f18447e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        L_0x000c:
            if (r10 != 0) goto L_0x0022
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f18447e = r9
            r1.f18448f = r9
            goto L_0x00a2
        L_0x0022:
            int r5 = r10.f18429a
            r11 = 1
            if (r5 <= r0) goto L_0x0029
            r5 = -1
            goto L_0x0065
        L_0x0029:
            if (r5 >= r0) goto L_0x002d
            r12 = r11
            goto L_0x0068
        L_0x002d:
            java.lang.Object r5 = r10.f18430b
            if (r5 == r4) goto L_0x00aa
            if (r5 == 0) goto L_0x003b
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x003b
            goto L_0x00aa
        L_0x003b:
            if (r2 != 0) goto L_0x0043
            java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.c(r17)
            if (r2 == 0) goto L_0x0049
        L_0x0043:
            int r6 = j$.util.concurrent.ConcurrentHashMap.d(r2, r4, r5)
            if (r6 != 0) goto L_0x0067
        L_0x0049:
            if (r3 != 0) goto L_0x0061
            j$.util.concurrent.s r3 = r10.f18451f
            if (r3 == 0) goto L_0x0055
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 != 0) goto L_0x005f
        L_0x0055:
            j$.util.concurrent.s r3 = r10.f18452g
            if (r3 == 0) goto L_0x0060
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 == 0) goto L_0x0060
        L_0x005f:
            return r3
        L_0x0060:
            r3 = r11
        L_0x0061:
            int r5 = j(r4, r5)
        L_0x0065:
            r12 = r5
            goto L_0x0068
        L_0x0067:
            r12 = r6
        L_0x0068:
            if (r12 > 0) goto L_0x006d
            j$.util.concurrent.s r5 = r10.f18451f
            goto L_0x006f
        L_0x006d:
            j$.util.concurrent.s r5 = r10.f18452g
        L_0x006f:
            if (r5 != 0) goto L_0x00a7
            j$.util.concurrent.s r13 = r1.f18448f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f18448f = r14
            if (r13 == 0) goto L_0x0087
            r13.f18453h = r14
        L_0x0087:
            if (r12 > 0) goto L_0x008c
            r10.f18451f = r14
            goto L_0x008e
        L_0x008c:
            r10.f18452g = r14
        L_0x008e:
            boolean r0 = r10.f18454i
            if (r0 != 0) goto L_0x0095
            r14.f18454i = r11
            goto L_0x00a2
        L_0x0095:
            r15.e()
            j$.util.concurrent.s r0 = r1.f18447e     // Catch:{ all -> 0x00a3 }
            j$.util.concurrent.s r0 = c(r0, r14)     // Catch:{ all -> 0x00a3 }
            r1.f18447e = r0     // Catch:{ all -> 0x00a3 }
            r1.lockState = r9
        L_0x00a2:
            return r8
        L_0x00a3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        L_0x00a7:
            r10 = r5
            goto L_0x000c
        L_0x00aa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008e A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00a9 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00aa A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00bd A[Catch:{ all -> 0x00c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(j$.util.concurrent.s r11) {
        /*
            r10 = this;
            j$.util.concurrent.m r0 = r11.f18432d
            j$.util.concurrent.s r0 = (j$.util.concurrent.s) r0
            j$.util.concurrent.s r1 = r11.f18453h
            if (r1 != 0) goto L_0x000b
            r10.f18448f = r0
            goto L_0x000d
        L_0x000b:
            r1.f18432d = r0
        L_0x000d:
            if (r0 == 0) goto L_0x0011
            r0.f18453h = r1
        L_0x0011:
            j$.util.concurrent.s r0 = r10.f18448f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r10.f18447e = r2
            return r1
        L_0x001a:
            j$.util.concurrent.s r0 = r10.f18447e
            if (r0 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r0.f18452g
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r0.f18451f
            if (r3 == 0) goto L_0x00cc
            j$.util.concurrent.s r3 = r3.f18451f
            if (r3 != 0) goto L_0x002c
            goto L_0x00cc
        L_0x002c:
            r10.e()
            r1 = 0
            j$.util.concurrent.s r3 = r11.f18451f     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r4 = r11.f18452g     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x0084
            if (r4 == 0) goto L_0x0084
            r5 = r4
        L_0x0039:
            j$.util.concurrent.s r6 = r5.f18451f     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x003f
            r5 = r6
            goto L_0x0039
        L_0x003f:
            boolean r6 = r5.f18454i     // Catch:{ all -> 0x00c8 }
            boolean r7 = r11.f18454i     // Catch:{ all -> 0x00c8 }
            r5.f18454i = r7     // Catch:{ all -> 0x00c8 }
            r11.f18454i = r6     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r6 = r5.f18452g     // Catch:{ all -> 0x00c8 }
            j$.util.concurrent.s r7 = r11.f18450e     // Catch:{ all -> 0x00c8 }
            if (r5 != r4) goto L_0x0052
            r11.f18450e = r5     // Catch:{ all -> 0x00c8 }
            r5.f18452g = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0065
        L_0x0052:
            j$.util.concurrent.s r8 = r5.f18450e     // Catch:{ all -> 0x00c8 }
            r11.f18450e = r8     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x0061
            j$.util.concurrent.s r9 = r8.f18451f     // Catch:{ all -> 0x00c8 }
            if (r5 != r9) goto L_0x005f
            r8.f18451f = r11     // Catch:{ all -> 0x00c8 }
            goto L_0x0061
        L_0x005f:
            r8.f18452g = r11     // Catch:{ all -> 0x00c8 }
        L_0x0061:
            r5.f18452g = r4     // Catch:{ all -> 0x00c8 }
            r4.f18450e = r5     // Catch:{ all -> 0x00c8 }
        L_0x0065:
            r11.f18451f = r2     // Catch:{ all -> 0x00c8 }
            r11.f18452g = r6     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x006d
            r6.f18450e = r11     // Catch:{ all -> 0x00c8 }
        L_0x006d:
            r5.f18451f = r3     // Catch:{ all -> 0x00c8 }
            r3.f18450e = r5     // Catch:{ all -> 0x00c8 }
            r5.f18450e = r7     // Catch:{ all -> 0x00c8 }
            if (r7 != 0) goto L_0x0077
            r0 = r5
            goto L_0x0080
        L_0x0077:
            j$.util.concurrent.s r3 = r7.f18451f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x007e
            r7.f18451f = r5     // Catch:{ all -> 0x00c8 }
            goto L_0x0080
        L_0x007e:
            r7.f18452g = r5     // Catch:{ all -> 0x00c8 }
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            r3 = r6
            goto L_0x008c
        L_0x0084:
            if (r3 == 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            r3 = r4
            goto L_0x008c
        L_0x008b:
            r3 = r11
        L_0x008c:
            if (r3 == r11) goto L_0x00a5
            j$.util.concurrent.s r4 = r11.f18450e     // Catch:{ all -> 0x00c8 }
            r3.f18450e = r4     // Catch:{ all -> 0x00c8 }
            if (r4 != 0) goto L_0x0096
            r0 = r3
            goto L_0x009f
        L_0x0096:
            j$.util.concurrent.s r5 = r4.f18451f     // Catch:{ all -> 0x00c8 }
            if (r11 != r5) goto L_0x009d
            r4.f18451f = r3     // Catch:{ all -> 0x00c8 }
            goto L_0x009f
        L_0x009d:
            r4.f18452g = r3     // Catch:{ all -> 0x00c8 }
        L_0x009f:
            r11.f18450e = r2     // Catch:{ all -> 0x00c8 }
            r11.f18452g = r2     // Catch:{ all -> 0x00c8 }
            r11.f18451f = r2     // Catch:{ all -> 0x00c8 }
        L_0x00a5:
            boolean r4 = r11.f18454i     // Catch:{ all -> 0x00c8 }
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            j$.util.concurrent.s r0 = b(r0, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00ae:
            r10.f18447e = r0     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c5
            j$.util.concurrent.s r0 = r11.f18450e     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            j$.util.concurrent.s r3 = r0.f18451f     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00bd
            r0.f18451f = r2     // Catch:{ all -> 0x00c8 }
            goto L_0x00c3
        L_0x00bd:
            j$.util.concurrent.s r3 = r0.f18452g     // Catch:{ all -> 0x00c8 }
            if (r11 != r3) goto L_0x00c3
            r0.f18452g = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c3:
            r11.f18450e = r2     // Catch:{ all -> 0x00c8 }
        L_0x00c5:
            r10.lockState = r1
            return r1
        L_0x00c8:
            r11 = move-exception
            r10.lockState = r1
            throw r11
        L_0x00cc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.g(j$.util.concurrent.s):boolean");
    }
}
