package cl;

import al.f2;
import al.g0;
import cl.i;
import ek.i;
import el.f;
import fk.u;
import fl.n;
import fl.s;
import fl.t;
import hl.f;
import hl.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p3.l0;
import rk.l;
import rk.q;
import sk.j;
import sk.k;
import v.v;

/* compiled from: BufferedChannel.kt */
public class a<E> implements e<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19207c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19208d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19209e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f19210f;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19211n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19212o;

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19213p;

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19214q;

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19215r;
    private volatile Object _closeCause;

    /* renamed from: a  reason: collision with root package name */
    public final int f19216a;

    /* renamed from: b  reason: collision with root package name */
    public final l<E, i> f19217b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: cl.a$a  reason: collision with other inner class name */
    /* compiled from: BufferedChannel.kt */
    public final class C0259a implements g<E>, f2 {

        /* renamed from: a  reason: collision with root package name */
        public Object f19218a = d.f19247p;

        /* renamed from: b  reason: collision with root package name */
        public al.l<? super Boolean> f19219b;

        public C0259a() {
        }

        public final Object a(kk.c cVar) {
            j<E> jVar;
            Boolean bool;
            j<E> jVar2;
            a<E> aVar = a.this;
            j<E> jVar3 = (j) a.f19212o.get(aVar);
            while (!aVar.y()) {
                long andIncrement = a.f19208d.getAndIncrement(aVar);
                long j10 = (long) d.f19233b;
                long j11 = andIncrement / j10;
                int i10 = (int) (andIncrement % j10);
                if (jVar3.f20261c != j11) {
                    j<E> p10 = aVar.p(j11, jVar3);
                    if (p10 == null) {
                        continue;
                    } else {
                        jVar = p10;
                    }
                } else {
                    jVar = jVar3;
                }
                Object J = aVar.J(jVar, i10, andIncrement, (Object) null);
                u9.b bVar = d.f19244m;
                if (J != bVar) {
                    u9.b bVar2 = d.f19246o;
                    if (J == bVar2) {
                        if (andIncrement < aVar.v()) {
                            jVar.a();
                        }
                        jVar3 = jVar;
                    } else if (J == d.f19245n) {
                        a<E> aVar2 = a.this;
                        al.l<? super Boolean> Y = g0.Y(g0.b0(cVar));
                        try {
                            this.f19219b = Y;
                            Object J2 = aVar2.J(jVar, i10, andIncrement, this);
                            if (J2 == bVar) {
                                b(jVar, i10);
                            } else {
                                n nVar = null;
                                if (J2 == bVar2) {
                                    if (andIncrement < aVar2.v()) {
                                        jVar.a();
                                    }
                                    j<E> jVar4 = (j) a.f19212o.get(aVar2);
                                    while (true) {
                                        if (aVar2.y()) {
                                            al.l<? super Boolean> lVar = this.f19219b;
                                            j.c(lVar);
                                            this.f19219b = null;
                                            this.f19218a = d.f19243l;
                                            Throwable r10 = a.this.r();
                                            if (r10 == null) {
                                                lVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                lVar.resumeWith(l0.A(r10));
                                            }
                                        } else {
                                            long andIncrement2 = a.f19208d.getAndIncrement(aVar2);
                                            long j12 = (long) d.f19233b;
                                            long j13 = andIncrement2 / j12;
                                            int i11 = (int) (andIncrement2 % j12);
                                            if (jVar4.f20261c != j13) {
                                                j<E> p11 = aVar2.p(j13, jVar4);
                                                if (p11 != null) {
                                                    jVar2 = p11;
                                                }
                                            } else {
                                                jVar2 = jVar4;
                                            }
                                            Object J3 = aVar2.J(jVar2, i11, andIncrement2, this);
                                            if (J3 == d.f19244m) {
                                                b(jVar2, i11);
                                                break;
                                            } else if (J3 == d.f19246o) {
                                                if (andIncrement2 < aVar2.v()) {
                                                    jVar2.a();
                                                }
                                                jVar4 = jVar2;
                                            } else if (J3 != d.f19245n) {
                                                jVar2.a();
                                                this.f19218a = J3;
                                                this.f19219b = null;
                                                bool = Boolean.TRUE;
                                                l<E, i> lVar2 = aVar2.f19217b;
                                                if (lVar2 != null) {
                                                    nVar = new n(lVar2, J3, Y.f19051e);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                        }
                                    }
                                } else {
                                    jVar.a();
                                    this.f19218a = J2;
                                    this.f19219b = null;
                                    bool = Boolean.TRUE;
                                    l<E, i> lVar3 = aVar2.f19217b;
                                    if (lVar3 != null) {
                                        nVar = new n(lVar3, J2, Y.f19051e);
                                    }
                                }
                                Y.k(bool, nVar);
                            }
                            Object s10 = Y.s();
                            jk.a aVar3 = jk.a.COROUTINE_SUSPENDED;
                            return s10;
                        } catch (Throwable th2) {
                            Y.A();
                            throw th2;
                        }
                    } else {
                        jVar.a();
                        this.f19218a = J;
                        return Boolean.TRUE;
                    }
                } else {
                    throw new IllegalStateException("unreachable".toString());
                }
            }
            this.f19218a = d.f19243l;
            Throwable r11 = a.this.r();
            if (r11 == null) {
                return Boolean.FALSE;
            }
            int i12 = t.f20262a;
            throw r11;
        }

        public final void b(s<?> sVar, int i10) {
            al.l<? super Boolean> lVar = this.f19219b;
            if (lVar != null) {
                lVar.b(sVar, i10);
            }
        }

        public final E next() {
            boolean z10;
            E e10 = this.f19218a;
            E e11 = d.f19247p;
            if (e10 != e11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f19218a = e11;
                if (e10 != d.f19243l) {
                    return e10;
                }
                a<E> aVar = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f19207c;
                Throwable s10 = aVar.s();
                int i10 = t.f20262a;
                throw s10;
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* compiled from: BufferedChannel.kt */
    public static final class b implements f2 {
        public final void b(s<?> sVar, int i10) {
            throw null;
        }
    }

    /* compiled from: BufferedChannel.kt */
    public static final class c extends k implements q<f<?>, Object, Object, l<? super Throwable, ? extends i>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a<E> f19221a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a<E> aVar) {
            super(3);
            this.f19221a = aVar;
        }

        public final Object d(dl.f fVar, Object obj, Object obj2) {
            return new b(obj2, this.f19221a, (f) fVar);
        }
    }

    @kk.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
    /* compiled from: BufferedChannel.kt */
    public static final class d<E> extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19222a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<E> f19223b;

        /* renamed from: c  reason: collision with root package name */
        public int f19224c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a<E> aVar, ik.d<? super d> dVar) {
            super(dVar);
            this.f19223b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19222a = obj;
            this.f19224c |= Integer.MIN_VALUE;
            Object E = a.E(this.f19223b, this);
            if (E == jk.a.COROUTINE_SUSPENDED) {
                return E;
            }
            return new i(E);
        }
    }

    @kk.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    /* compiled from: BufferedChannel.kt */
    public static final class e extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19225a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<E> f19226b;

        /* renamed from: c  reason: collision with root package name */
        public int f19227c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a<E> aVar, ik.d<? super e> dVar) {
            super(dVar);
            this.f19226b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19225a = obj;
            this.f19227c |= Integer.MIN_VALUE;
            a<E> aVar = this.f19226b;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f19207c;
            Object F = aVar.F((j<E>) null, 0, 0, this);
            if (F == jk.a.COROUTINE_SUSPENDED) {
                return F;
            }
            return new i(F);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<a> cls2 = a.class;
        f19207c = AtomicLongFieldUpdater.newUpdater(cls2, "sendersAndCloseStatus");
        f19208d = AtomicLongFieldUpdater.newUpdater(cls2, "receivers");
        f19209e = AtomicLongFieldUpdater.newUpdater(cls2, "bufferEnd");
        f19210f = AtomicLongFieldUpdater.newUpdater(cls2, "completedExpandBuffersAndPauseFlag");
        f19211n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "sendSegment");
        f19212o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "receiveSegment");
        f19213p = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "bufferEndSegment");
        f19214q = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_closeCause");
        f19215r = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "closeHandler");
    }

    public a(int i10, l<? super E, i> lVar) {
        boolean z10;
        long j10;
        this.f19216a = i10;
        this.f19217b = lVar;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j<Object> jVar = d.f19232a;
            if (i10 == 0) {
                j10 = 0;
            } else if (i10 != Integer.MAX_VALUE) {
                j10 = (long) i10;
            } else {
                j10 = Long.MAX_VALUE;
            }
            this.bufferEnd = j10;
            this.completedExpandBuffersAndPauseFlag = q();
            j<Object> jVar2 = new j<>(0, (j) null, this, 3);
            this.sendSegment = jVar2;
            this.receiveSegment = jVar2;
            if (A()) {
                jVar2 = d.f19232a;
                j.d(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar2;
            if (lVar != null) {
                new c(this);
            }
            this._closeCause = d.f19250s;
            return;
        }
        throw new IllegalArgumentException(v.d("Invalid channel capacity: ", i10, ", should be >=0").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> java.lang.Object E(cl.a<E> r14, ik.d<? super cl.i<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof cl.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            cl.a$d r0 = (cl.a.d) r0
            int r1 = r0.f19224c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19224c = r1
            goto L_0x0018
        L_0x0013:
            cl.a$d r0 = new cl.a$d
            r0.<init>(r14, r15)
        L_0x0018:
            r6 = r0
            java.lang.Object r15 = r6.f19222a
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.f19224c
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            p3.l0.Q0(r15)
            cl.i r15 = (cl.i) r15
            java.lang.Object r14 = r15.f19256a
            goto L_0x009d
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0035:
            p3.l0.Q0(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f19212o
            java.lang.Object r1 = r1.get(r14)
            cl.j r1 = (cl.j) r1
        L_0x0041:
            boolean r3 = r14.y()
            if (r3 == 0) goto L_0x0051
            java.lang.Throwable r14 = r14.r()
            cl.i$a r15 = new cl.i$a
            r15.<init>(r14)
            goto L_0x00a3
        L_0x0051:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f19208d
            long r4 = r3.getAndIncrement(r14)
            int r3 = cl.d.f19233b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f20261c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x006f
            cl.j r7 = r14.p(r7, r1)
            if (r7 != 0) goto L_0x006d
            goto L_0x0041
        L_0x006d:
            r13 = r7
            goto L_0x0070
        L_0x006f:
            r13 = r1
        L_0x0070:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.J(r8, r9, r10, r12)
            u9.b r7 = cl.d.f19244m
            if (r1 == r7) goto L_0x00a4
            u9.b r7 = cl.d.f19246o
            if (r1 != r7) goto L_0x008e
            long r7 = r14.v()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x008c
            r13.a()
        L_0x008c:
            r1 = r13
            goto L_0x0041
        L_0x008e:
            u9.b r15 = cl.d.f19245n
            if (r1 != r15) goto L_0x009f
            r6.f19224c = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.F(r2, r3, r4, r6)
            if (r14 != r0) goto L_0x009d
            return r0
        L_0x009d:
            r15 = r14
            goto L_0x00a3
        L_0x009f:
            r13.a()
            r15 = r1
        L_0x00a3:
            return r15
        L_0x00a4:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.E(cl.a, ik.d):java.lang.Object");
    }

    public static final j f(a aVar, long j10, j jVar) {
        Object R;
        long j11;
        long j12;
        boolean z10;
        aVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19211n;
        j<Object> jVar2 = d.f19232a;
        c cVar = c.f19231p;
        do {
            R = l0.R(jVar, j10, cVar);
            if (j7.a.R(R)) {
                break;
            }
            s M = j7.a.M(R);
            while (true) {
                s sVar = (s) atomicReferenceFieldUpdater.get(aVar);
                z10 = false;
                if (sVar.f20261c >= M.f20261c) {
                    break;
                } else if (!M.i()) {
                    continue;
                    break;
                } else {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(aVar, sVar, M)) {
                            if (atomicReferenceFieldUpdater.get(aVar) != sVar) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        if (sVar.e()) {
                            sVar.d();
                        }
                    } else if (M.e()) {
                        M.d();
                    }
                }
            }
            z10 = true;
            continue;
        } while (!z10);
        if (j7.a.R(R)) {
            aVar.m();
            if (jVar.f20261c * ((long) d.f19233b) >= aVar.t()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) j7.a.M(R);
        long j13 = jVar3.f20261c;
        if (j13 <= j10) {
            return jVar3;
        }
        long j14 = j13 * ((long) d.f19233b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19207c;
        do {
            j11 = atomicLongFieldUpdater.get(aVar);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j14) {
                break;
            }
            j<Object> jVar4 = d.f19232a;
        } while (!f19207c.compareAndSet(aVar, j11, (((long) ((int) (j11 >> 60))) << 60) + j12));
        if (jVar3.f20261c * ((long) d.f19233b) >= aVar.t()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final int h(a aVar, j jVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        aVar.getClass();
        jVar.m(i10, obj);
        if (z10) {
            return aVar.K(jVar, i10, obj, j10, obj2, z10);
        }
        Object k10 = jVar.k(i10);
        if (k10 == null) {
            if (aVar.i(j10)) {
                if (jVar.j(i10, (Object) null, d.f19235d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.j(i10, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (k10 instanceof f2) {
            jVar.m(i10, (Object) null);
            if (aVar.H(k10, obj)) {
                jVar.n(i10, d.f19240i);
                return 0;
            }
            u9.b bVar = d.f19242k;
            if (jVar.f19259f.getAndSet((i10 * 2) + 1, bVar) != bVar) {
                jVar.l(i10, true);
            }
            return 5;
        }
        return aVar.K(jVar, i10, obj, j10, obj2, z10);
    }

    public final boolean A() {
        long q10 = q();
        if (q10 == 0 || q10 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(long r5, cl.j<E> r7) {
        /*
            r4 = this;
        L_0x0000:
            long r0 = r7.f20261c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0011
            fl.c r0 = r7.b()
            cl.j r0 = (cl.j) r0
            if (r0 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r7 = r0
            goto L_0x0000
        L_0x0011:
            boolean r5 = r7.c()
            if (r5 == 0) goto L_0x0022
            fl.c r5 = r7.b()
            cl.j r5 = (cl.j) r5
            if (r5 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r7 = r5
            goto L_0x0011
        L_0x0022:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f19213p
        L_0x0024:
            java.lang.Object r6 = r5.get(r4)
            fl.s r6 = (fl.s) r6
            long r0 = r6.f20261c
            long r2 = r7.f20261c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0035
            goto L_0x0055
        L_0x0035:
            boolean r0 = r7.i()
            if (r0 != 0) goto L_0x003c
            goto L_0x0056
        L_0x003c:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L_0x0044
            r1 = r2
            goto L_0x004a
        L_0x0044:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L_0x003c
        L_0x004a:
            if (r1 == 0) goto L_0x0059
            boolean r5 = r6.e()
            if (r5 == 0) goto L_0x0055
            r6.d()
        L_0x0055:
            r1 = r2
        L_0x0056:
            if (r1 == 0) goto L_0x0011
            return
        L_0x0059:
            boolean r6 = r7.e()
            if (r6 == 0) goto L_0x0024
            r7.d()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.B(long, cl.j):void");
    }

    public final Object C(u uVar, f.a.C0280a.C0281a aVar) {
        UndeliveredElementException g2;
        al.l lVar = new al.l(1, g0.b0(aVar));
        lVar.t();
        l<E, i> lVar2 = this.f19217b;
        if (lVar2 == null || (g2 = m9.b.g(lVar2, uVar, (UndeliveredElementException) null)) == null) {
            lVar.resumeWith(l0.A(u()));
        } else {
            g0.s(g2, u());
            lVar.resumeWith(l0.A(g2));
        }
        Object s10 = lVar.s();
        if (s10 == jk.a.COROUTINE_SUSPENDED) {
            return s10;
        }
        return i.f20112a;
    }

    public final Object D(ik.d<? super E> dVar) {
        n nVar;
        j jVar = (j) f19212o.get(this);
        while (!y()) {
            long andIncrement = f19208d.getAndIncrement(this);
            long j10 = (long) d.f19233b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (jVar.f20261c != j11) {
                j p10 = p(j11, jVar);
                if (p10 == null) {
                    continue;
                } else {
                    jVar = p10;
                }
            }
            Object J = J(jVar, i10, andIncrement, (Object) null);
            u9.b bVar = d.f19244m;
            if (J != bVar) {
                u9.b bVar2 = d.f19246o;
                if (J == bVar2) {
                    if (andIncrement < v()) {
                        jVar.a();
                    }
                } else if (J == d.f19245n) {
                    al.l Y = g0.Y(g0.b0(dVar));
                    try {
                        Object J2 = J(jVar, i10, andIncrement, Y);
                        if (J2 == bVar) {
                            Y.b(jVar, i10);
                        } else {
                            n nVar2 = null;
                            if (J2 == bVar2) {
                                if (andIncrement < v()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) f19212o.get(this);
                                while (true) {
                                    if (y()) {
                                        Y.resumeWith(l0.A(s()));
                                        break;
                                    }
                                    long andIncrement2 = f19208d.getAndIncrement(this);
                                    long j12 = (long) d.f19233b;
                                    long j13 = andIncrement2 / j12;
                                    int i11 = (int) (andIncrement2 % j12);
                                    if (jVar2.f20261c != j13) {
                                        j p11 = p(j13, jVar2);
                                        if (p11 != null) {
                                            jVar2 = p11;
                                        }
                                    }
                                    J2 = J(jVar2, i11, andIncrement2, Y);
                                    if (J2 == d.f19244m) {
                                        Y.b(jVar2, i11);
                                        break;
                                    } else if (J2 == d.f19246o) {
                                        if (andIncrement2 < v()) {
                                            jVar2.a();
                                        }
                                    } else if (J2 != d.f19245n) {
                                        jVar2.a();
                                        l<E, i> lVar = this.f19217b;
                                        if (lVar != null) {
                                            nVar = new n(lVar, J2, Y.f19051e);
                                        }
                                    } else {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                }
                            } else {
                                jVar.a();
                                l<E, i> lVar2 = this.f19217b;
                                if (lVar2 != null) {
                                    nVar = new n(lVar2, J2, Y.f19051e);
                                }
                                Y.k(J2, nVar2);
                            }
                            nVar2 = nVar;
                            Y.k(J2, nVar2);
                        }
                        Object s10 = Y.s();
                        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                        return s10;
                    } catch (Throwable th2) {
                        Y.A();
                        throw th2;
                    }
                } else {
                    jVar.a();
                    return J;
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        Throwable s11 = s();
        int i12 = t.f20262a;
        throw s11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(cl.j<E> r10, int r11, long r12, ik.d<? super cl.i<? extends E>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof cl.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            cl.a$e r0 = (cl.a.e) r0
            int r1 = r0.f19227c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19227c = r1
            goto L_0x0018
        L_0x0013:
            cl.a$e r0 = new cl.a$e
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f19225a
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19227c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p3.l0.Q0(r14)
            goto L_0x010b
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            p3.l0.Q0(r14)
            r0.getClass()
            r0.getClass()
            r0.f19227c = r3
            ik.d r14 = al.g0.b0(r0)
            al.l r14 = al.g0.Y(r14)
            cl.q r0 = new cl.q     // Catch:{ all -> 0x0110 }
            r0.<init>(r14)     // Catch:{ all -> 0x0110 }
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r0
            java.lang.Object r2 = r2.J(r3, r4, r5, r7)     // Catch:{ all -> 0x0110 }
            u9.b r3 = cl.d.f19244m     // Catch:{ all -> 0x0110 }
            if (r2 != r3) goto L_0x005a
            r0.b(r10, r11)     // Catch:{ all -> 0x0110 }
            goto L_0x0102
        L_0x005a:
            u9.b r11 = cl.d.f19246o     // Catch:{ all -> 0x0110 }
            r8 = 0
            if (r2 != r11) goto L_0x00ec
            long r2 = r9.v()     // Catch:{ all -> 0x0110 }
            int r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x006a
            r10.a()     // Catch:{ all -> 0x0110 }
        L_0x006a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = f19212o     // Catch:{ all -> 0x0110 }
            java.lang.Object r10 = r10.get(r9)     // Catch:{ all -> 0x0110 }
            cl.j r10 = (cl.j) r10     // Catch:{ all -> 0x0110 }
        L_0x0072:
            boolean r11 = r9.y()     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x008b
            java.lang.Throwable r10 = r9.r()     // Catch:{ all -> 0x0110 }
            cl.i$a r11 = new cl.i$a     // Catch:{ all -> 0x0110 }
            r11.<init>(r10)     // Catch:{ all -> 0x0110 }
            cl.i r10 = new cl.i     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            r14.resumeWith(r10)     // Catch:{ all -> 0x0110 }
            goto L_0x0102
        L_0x008b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = f19208d     // Catch:{ all -> 0x0110 }
            long r11 = r11.getAndIncrement(r9)     // Catch:{ all -> 0x0110 }
            int r13 = cl.d.f19233b     // Catch:{ all -> 0x0110 }
            long r2 = (long) r13     // Catch:{ all -> 0x0110 }
            long r4 = r11 / r2
            long r2 = r11 % r2
            int r13 = (int) r2     // Catch:{ all -> 0x0110 }
            long r2 = r10.f20261c     // Catch:{ all -> 0x0110 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00a7
            cl.j r2 = r9.p(r4, r10)     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00a6
            goto L_0x0072
        L_0x00a6:
            r10 = r2
        L_0x00a7:
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r11
            r7 = r0
            java.lang.Object r2 = r2.J(r3, r4, r5, r7)     // Catch:{ all -> 0x0110 }
            u9.b r3 = cl.d.f19244m     // Catch:{ all -> 0x0110 }
            if (r2 != r3) goto L_0x00b8
            r0.b(r10, r13)     // Catch:{ all -> 0x0110 }
            goto L_0x0102
        L_0x00b8:
            u9.b r13 = cl.d.f19246o     // Catch:{ all -> 0x0110 }
            if (r2 != r13) goto L_0x00c8
            long r2 = r9.v()     // Catch:{ all -> 0x0110 }
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x0072
            r10.a()     // Catch:{ all -> 0x0110 }
            goto L_0x0072
        L_0x00c8:
            u9.b r11 = cl.d.f19245n     // Catch:{ all -> 0x0110 }
            if (r2 == r11) goto L_0x00e0
            r10.a()     // Catch:{ all -> 0x0110 }
            cl.i r10 = new cl.i     // Catch:{ all -> 0x0110 }
            r10.<init>(r2)     // Catch:{ all -> 0x0110 }
            rk.l<E, ek.i> r11 = r9.f19217b     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ff
            ik.f r12 = r14.f19051e     // Catch:{ all -> 0x0110 }
            fl.n r8 = new fl.n     // Catch:{ all -> 0x0110 }
            r8.<init>(r11, r2, r12)     // Catch:{ all -> 0x0110 }
            goto L_0x00ff
        L_0x00e0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = "unexpected"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x00ec:
            r10.a()     // Catch:{ all -> 0x0110 }
            cl.i r10 = new cl.i     // Catch:{ all -> 0x0110 }
            r10.<init>(r2)     // Catch:{ all -> 0x0110 }
            rk.l<E, ek.i> r11 = r9.f19217b     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ff
            ik.f r12 = r14.f19051e     // Catch:{ all -> 0x0110 }
            fl.n r8 = new fl.n     // Catch:{ all -> 0x0110 }
            r8.<init>(r11, r2, r12)     // Catch:{ all -> 0x0110 }
        L_0x00ff:
            r14.k(r10, r8)     // Catch:{ all -> 0x0110 }
        L_0x0102:
            java.lang.Object r14 = r14.s()
            jk.a r10 = jk.a.COROUTINE_SUSPENDED
            if (r14 != r1) goto L_0x010b
            return r1
        L_0x010b:
            cl.i r14 = (cl.i) r14
            java.lang.Object r10 = r14.f19256a
            return r10
        L_0x0110:
            r10 = move-exception
            r14.A()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.F(cl.j, int, long, ik.d):java.lang.Object");
    }

    public final void G(f2 f2Var, boolean z10) {
        Throwable th2;
        if (f2Var instanceof b) {
            ((b) f2Var).getClass();
            throw null;
        } else if (f2Var instanceof al.k) {
            ik.d dVar = (ik.d) f2Var;
            if (z10) {
                th2 = s();
            } else {
                th2 = u();
            }
            dVar.resumeWith(l0.A(th2));
        } else if (f2Var instanceof q) {
            ((q) f2Var).f19266a.resumeWith(new i(new i.a(r())));
        } else if (f2Var instanceof C0259a) {
            C0259a aVar = (C0259a) f2Var;
            al.l<? super Boolean> lVar = aVar.f19219b;
            j.c(lVar);
            aVar.f19219b = null;
            aVar.f19218a = d.f19243l;
            Throwable r10 = a.this.r();
            if (r10 == null) {
                lVar.resumeWith(Boolean.FALSE);
            } else {
                lVar.resumeWith(l0.A(r10));
            }
        } else if (f2Var instanceof hl.f) {
            ((hl.f) f2Var).e(this, d.f19243l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + f2Var).toString());
        }
    }

    public final boolean H(Object obj, E e10) {
        if (obj instanceof hl.f) {
            return ((hl.f) obj).e(this, e10);
        }
        n nVar = null;
        if (obj instanceof q) {
            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            al.l<i<? extends E>> lVar = ((q) obj).f19266a;
            i iVar = new i(e10);
            l<E, ek.i> lVar2 = this.f19217b;
            if (lVar2 != null) {
                nVar = new n(lVar2, e10, lVar.f19051e);
            }
            return d.a(lVar, iVar, nVar);
        } else if (obj instanceof C0259a) {
            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0259a aVar = (C0259a) obj;
            al.l<? super Boolean> lVar3 = aVar.f19219b;
            j.c(lVar3);
            aVar.f19219b = null;
            aVar.f19218a = e10;
            Boolean bool = Boolean.TRUE;
            l<E, ek.i> lVar4 = a.this.f19217b;
            if (lVar4 != null) {
                nVar = new n(lVar4, e10, lVar3.f19051e);
            }
            return d.a(lVar3, bool, nVar);
        } else if (obj instanceof al.k) {
            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            al.k kVar = (al.k) obj;
            l<E, ek.i> lVar5 = this.f19217b;
            if (lVar5 != null) {
                nVar = new n(lVar5, e10, kVar.getContext());
            }
            return d.a(kVar, e10, nVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final boolean I(Object obj, j<E> jVar, int i10) {
        if (obj instanceof al.k) {
            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((al.k) obj, ek.i.f20112a, (l<? super Throwable, ek.i>) null);
        } else if (obj instanceof hl.f) {
            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            ek.i iVar = ek.i.f20112a;
            int i11 = ((hl.e) obj).i(this);
            g.a aVar = g.f20542a;
            char c10 = 3;
            if (i11 == 0) {
                c10 = 1;
            } else if (i11 == 1) {
                c10 = 2;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    c10 = 4;
                } else {
                    throw new IllegalStateException(("Unexpected internal result: " + i11).toString());
                }
            }
            if (c10 == 2) {
                jVar.m(i10, (Object) null);
            }
            if (c10 == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof b) {
            ((b) obj).getClass();
            d.a((al.k) null, Boolean.TRUE, (l<? super Throwable, ek.i>) null);
            throw null;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    public final Object J(j<E> jVar, int i10, long j10, Object obj) {
        Object k10 = jVar.k(i10);
        if (k10 == null) {
            if (j10 >= (f19207c.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f19245n;
                }
                if (jVar.j(i10, k10, obj)) {
                    o();
                    return d.f19244m;
                }
            }
        } else if (k10 == d.f19235d && jVar.j(i10, k10, d.f19240i)) {
            o();
            Object obj2 = jVar.f19259f.get(i10 * 2);
            jVar.m(i10, (Object) null);
            return obj2;
        }
        while (true) {
            Object k11 = jVar.k(i10);
            if (k11 == null || k11 == d.f19236e) {
                if (j10 < (f19207c.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i10, k11, d.f19239h)) {
                        o();
                        return d.f19246o;
                    }
                } else if (obj == null) {
                    return d.f19245n;
                } else {
                    if (jVar.j(i10, k11, obj)) {
                        o();
                        return d.f19244m;
                    }
                }
            } else if (k11 != d.f19235d) {
                u9.b bVar = d.f19241j;
                if (k11 == bVar) {
                    return d.f19246o;
                }
                if (k11 == d.f19239h) {
                    return d.f19246o;
                }
                if (k11 == d.f19243l) {
                    o();
                    return d.f19246o;
                } else if (k11 != d.f19238g && jVar.j(i10, k11, d.f19237f)) {
                    boolean z10 = k11 instanceof t;
                    if (z10) {
                        k11 = ((t) k11).f19267a;
                    }
                    if (I(k11, jVar, i10)) {
                        jVar.n(i10, d.f19240i);
                        o();
                        Object obj3 = jVar.f19259f.get(i10 * 2);
                        jVar.m(i10, (Object) null);
                        return obj3;
                    }
                    jVar.n(i10, bVar);
                    jVar.l(i10, false);
                    if (z10) {
                        o();
                    }
                    return d.f19246o;
                }
            } else if (jVar.j(i10, k11, d.f19240i)) {
                o();
                Object obj4 = jVar.f19259f.get(i10 * 2);
                jVar.m(i10, (Object) null);
                return obj4;
            }
        }
    }

    public final int K(j<E> jVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object k10 = jVar.k(i10);
            if (k10 == null) {
                if (!i(j10) || z10) {
                    if (z10) {
                        if (jVar.j(i10, (Object) null, d.f19241j)) {
                            jVar.l(i10, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (jVar.j(i10, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i10, (Object) null, d.f19235d)) {
                    return 1;
                }
            } else if (k10 != d.f19236e) {
                u9.b bVar = d.f19242k;
                if (k10 == bVar) {
                    jVar.m(i10, (Object) null);
                    return 5;
                } else if (k10 == d.f19239h) {
                    jVar.m(i10, (Object) null);
                    return 5;
                } else if (k10 == d.f19243l) {
                    jVar.m(i10, (Object) null);
                    m();
                    return 4;
                } else {
                    jVar.m(i10, (Object) null);
                    if (k10 instanceof t) {
                        k10 = ((t) k10).f19267a;
                    }
                    if (H(k10, e10)) {
                        jVar.n(i10, d.f19240i);
                        return 0;
                    }
                    if (jVar.f19259f.getAndSet((i10 * 2) + 1, bVar) != bVar) {
                        jVar.l(i10, true);
                    }
                    return 5;
                }
            } else if (jVar.j(i10, k10, d.f19235d)) {
                return 1;
            }
        }
    }

    public final void L(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z10;
        long j12;
        if (!A()) {
            do {
            } while (q() <= j10);
            int i10 = d.f19234c;
            int i11 = 0;
            while (i11 < i10) {
                long q10 = q();
                if (q10 != (f19210f.get(this) & 4611686018427387903L) || q10 != q()) {
                    i11++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19210f;
            do {
                j11 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + (j11 & 4611686018427387903L)));
            while (true) {
                long q11 = q();
                atomicLongFieldUpdater = f19210f;
                long j13 = atomicLongFieldUpdater.get(this);
                long j14 = j13 & 4611686018427387903L;
                if ((j13 & 4611686018427387904L) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (q11 == j14 && q11 == q()) {
                    break;
                } else if (!z10) {
                    atomicLongFieldUpdater.compareAndSet(this, j13, j14 + 4611686018427387904L);
                }
            }
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, 0 + (j12 & 4611686018427387903L)));
        }
    }

    public final Object a(el.f fVar) {
        return E(this, fVar);
    }

    public final Object b() {
        j jVar;
        f2 f2Var;
        long j10 = f19208d.get(this);
        long j11 = f19207c.get(this);
        if (x(j11, true)) {
            return new i.a(r());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return i.f19255b;
        }
        u9.b bVar = d.f19242k;
        j jVar2 = (j) f19212o.get(this);
        while (!y()) {
            long andIncrement = f19208d.getAndIncrement(this);
            long j12 = (long) d.f19233b;
            long j13 = andIncrement / j12;
            int i10 = (int) (andIncrement % j12);
            if (jVar2.f20261c != j13) {
                j p10 = p(j13, jVar2);
                if (p10 == null) {
                    continue;
                } else {
                    jVar = p10;
                }
            } else {
                jVar = jVar2;
            }
            Object J = J(jVar, i10, andIncrement, bVar);
            if (J == d.f19244m) {
                if (bVar instanceof f2) {
                    f2Var = (f2) bVar;
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    f2Var.b(jVar, i10);
                }
                L(andIncrement);
                jVar.h();
                return i.f19255b;
            } else if (J == d.f19246o) {
                if (andIncrement < v()) {
                    jVar.a();
                }
                jVar2 = jVar;
            } else if (J != d.f19245n) {
                jVar.a();
                return J;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return new i.a(r());
    }

    public final boolean c(Throwable th2) {
        return j(th2, false);
    }

    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: al.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: cl.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: cl.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: al.l} */
    /* JADX WARNING: type inference failed for: r1v11, types: [al.l] */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0118, code lost:
        if (r18 == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        r0.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0120, code lost:
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.b(r0, r19 + r22);
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(fk.u r24, el.f.a.C0280a.C0281a r25) {
        /*
            r23 = this;
            r9 = r23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19211n
            java.lang.Object r0 = r0.get(r9)
            cl.j r0 = (cl.j) r0
        L_0x000a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f19207c
            long r1 = r1.getAndIncrement(r9)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r10
            r14 = 0
            boolean r15 = r9.x(r1, r14)
            int r8 = cl.d.f19233b
            long r1 = (long) r8
            long r3 = r12 / r1
            long r1 = r12 % r1
            int r7 = (int) r1
            long r1 = r0.f20261c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            cl.j r1 = f(r9, r3, r0)
            if (r1 != 0) goto L_0x003c
            if (r15 == 0) goto L_0x000a
            java.lang.Object r0 = r23.C(r24, r25)
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x019e
            goto L_0x01a0
        L_0x003c:
            r0 = r1
        L_0x003d:
            r16 = 0
            r1 = r23
            r2 = r0
            r3 = r7
            r4 = r24
            r5 = r12
            r17 = r7
            r7 = r16
            r16 = r8
            r8 = r15
            int r1 = h(r1, r2, r3, r4, r5, r7, r8)
            if (r1 == 0) goto L_0x019b
            r8 = 1
            if (r1 == r8) goto L_0x019e
            r7 = 2
            if (r1 == r7) goto L_0x018b
            r15 = 4
            r5 = 3
            r6 = 5
            if (r1 == r5) goto L_0x007c
            if (r1 == r15) goto L_0x0067
            if (r1 == r6) goto L_0x0063
            goto L_0x000a
        L_0x0063:
            r0.a()
            goto L_0x000a
        L_0x0067:
            long r1 = r23.t()
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0072
            r0.a()
        L_0x0072:
            java.lang.Object r0 = r23.C(r24, r25)
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x019e
            goto L_0x01a0
        L_0x007c:
            ik.d r1 = al.g0.b0(r25)
            al.l r4 = al.g0.Y(r1)
            r18 = 0
            r1 = r23
            r2 = r0
            r3 = r17
            r25 = r4
            r4 = r24
            r14 = r6
            r5 = r12
            r10 = r7
            r7 = r25
            r11 = r8
            r8 = r18
            int r1 = h(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x016f
            if (r1 == r11) goto L_0x016c
            if (r1 == r10) goto L_0x0164
            if (r1 == r15) goto L_0x0140
            java.lang.String r12 = "unexpected"
            if (r1 != r14) goto L_0x0134
            r0.a()     // Catch:{ all -> 0x0130 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19211n     // Catch:{ all -> 0x0130 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0130 }
            cl.j r0 = (cl.j) r0     // Catch:{ all -> 0x0130 }
        L_0x00b2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f19207c     // Catch:{ all -> 0x0130 }
            long r1 = r1.getAndIncrement(r9)     // Catch:{ all -> 0x0130 }
            r16 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r20 = r1 & r16
            r13 = 0
            boolean r18 = r9.x(r1, r13)     // Catch:{ all -> 0x0130 }
            int r8 = cl.d.f19233b     // Catch:{ all -> 0x0130 }
            long r1 = (long) r8     // Catch:{ all -> 0x0130 }
            long r3 = r20 / r1
            long r1 = r20 % r1
            int r7 = (int) r1     // Catch:{ all -> 0x0130 }
            long r1 = r0.f20261c     // Catch:{ all -> 0x0130 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00dc
            cl.j r1 = f(r9, r3, r0)     // Catch:{ all -> 0x0130 }
            if (r1 != 0) goto L_0x00db
            if (r18 == 0) goto L_0x00b2
            goto L_0x011d
        L_0x00db:
            r0 = r1
        L_0x00dc:
            r1 = r23
            r2 = r0
            r3 = r7
            r4 = r24
            r5 = r20
            r19 = r7
            r7 = r25
            r22 = r8
            r8 = r18
            int r1 = h(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0130 }
            if (r1 == 0) goto L_0x012a
            if (r1 == r11) goto L_0x016c
            if (r1 == r10) goto L_0x0118
            r2 = 3
            if (r1 == r2) goto L_0x010e
            if (r1 == r15) goto L_0x0102
            if (r1 == r14) goto L_0x00fe
            goto L_0x00b2
        L_0x00fe:
            r0.a()     // Catch:{ all -> 0x0130 }
            goto L_0x00b2
        L_0x0102:
            long r1 = r23.t()     // Catch:{ all -> 0x0130 }
            int r1 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x011d
            r0.a()     // Catch:{ all -> 0x0130 }
            goto L_0x011d
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0130 }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x0130 }
            r0.<init>(r1)     // Catch:{ all -> 0x0130 }
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0118:
            if (r18 == 0) goto L_0x0120
            r0.h()     // Catch:{ all -> 0x0130 }
        L_0x011d:
            r1 = r25
            goto L_0x014d
        L_0x0120:
            int r7 = r19 + r22
            r1 = r25
            r1.b(r0, r7)     // Catch:{ all -> 0x0128 }
            goto L_0x0179
        L_0x0128:
            r0 = move-exception
            goto L_0x0187
        L_0x012a:
            r1 = r25
            r0.a()     // Catch:{ all -> 0x0128 }
            goto L_0x0174
        L_0x0130:
            r0 = move-exception
            r1 = r25
            goto L_0x0187
        L_0x0134:
            r1 = r25
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x0128 }
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0140:
            r1 = r25
            long r2 = r23.t()     // Catch:{ all -> 0x0128 }
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x014d
            r0.a()     // Catch:{ all -> 0x0128 }
        L_0x014d:
            rk.l<E, ek.i> r0 = r9.f19217b     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0158
            ik.f r2 = r1.f19051e     // Catch:{ all -> 0x0128 }
            r3 = r24
            m9.b.f(r0, r3, r2)     // Catch:{ all -> 0x0128 }
        L_0x0158:
            java.lang.Throwable r0 = r23.u()     // Catch:{ all -> 0x0128 }
            ek.f$a r0 = p3.l0.A(r0)     // Catch:{ all -> 0x0128 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0128 }
            goto L_0x0179
        L_0x0164:
            r1 = r25
            int r7 = r17 + r16
            r1.b(r0, r7)     // Catch:{ all -> 0x0128 }
            goto L_0x0179
        L_0x016c:
            r1 = r25
            goto L_0x0174
        L_0x016f:
            r1 = r25
            r0.a()     // Catch:{ all -> 0x0128 }
        L_0x0174:
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0128 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0128 }
        L_0x0179:
            java.lang.Object r0 = r1.s()
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            ek.i r0 = ek.i.f20112a
        L_0x0184:
            if (r0 != r1) goto L_0x019e
            goto L_0x01a0
        L_0x0187:
            r1.A()
            throw r0
        L_0x018b:
            r3 = r24
            if (r15 == 0) goto L_0x019e
            r0.h()
            java.lang.Object r0 = r23.C(r24, r25)
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x019e
            goto L_0x01a0
        L_0x019b:
            r0.a()
        L_0x019e:
            ek.i r0 = ek.i.f20112a
        L_0x01a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.e(fk.u, el.f$a$a$a):java.lang.Object");
    }

    public final void g(m mVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19215r;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19215r;
            do {
                Object obj = atomicReferenceFieldUpdater2.get(this);
                u9.b bVar = d.f19248q;
                if (obj == bVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f19215r;
                    u9.b bVar2 = d.f19249r;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, bVar, bVar2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != bVar) {
                                z11 = false;
                                continue;
                                break;
                            }
                        } else {
                            z11 = true;
                            continue;
                            break;
                        }
                    }
                } else if (obj == d.f19249r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                } else {
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!z11);
            mVar.invoke(r());
        }
    }

    public final boolean i(long j10) {
        if (j10 < q() || j10 < t() + ((long) this.f19216a)) {
            return true;
        }
        return false;
    }

    public final g<E> iterator() {
        return new C0259a();
    }

    public final boolean j(Throwable th2, boolean z10) {
        boolean z11;
        Object obj;
        u9.b bVar;
        boolean z12;
        long j10;
        int i10;
        long j11;
        long j12;
        long j13;
        if (z10) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19207c;
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) != 0) {
                    break;
                }
                j<Object> jVar = d.f19232a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (((long) 1) << 60) + (j13 & 1152921504606846975L)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19214q;
        u9.b bVar2 = d.f19250s;
        Throwable th3 = th2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, bVar2, th3)) {
                if (atomicReferenceFieldUpdater.get(this) != bVar2) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        if (z10) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f19207c;
            do {
                j12 = atomicLongFieldUpdater2.get(this);
                j<Object> jVar2 = d.f19232a;
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = f19207c;
            do {
                j10 = atomicLongFieldUpdater3.get(this);
                int i11 = (int) (j10 >> 60);
                if (i11 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    i10 = 2;
                    j<Object> jVar3 = d.f19232a;
                } else if (i11 != 1) {
                    break;
                } else {
                    j11 = j10 & 1152921504606846975L;
                    j<Object> jVar4 = d.f19232a;
                    i10 = 3;
                }
            } while (!atomicLongFieldUpdater3.compareAndSet(this, j10, (((long) i10) << 60) + j11));
        }
        m();
        if (z11) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19215r;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    bVar = d.f19248q;
                } else {
                    bVar = d.f19249r;
                }
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, bVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z12 = false;
                            continue;
                            break;
                        }
                    } else {
                        z12 = true;
                        continue;
                        break;
                    }
                }
            } while (!z12);
            if (obj != null) {
                sk.u.a(1, obj);
                ((l) obj).invoke(r());
            }
        }
        return z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        r1 = (cl.j) ((fl.c) fl.c.f20224b.get(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cl.j<E> k(long r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19213p
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f19211n
            java.lang.Object r1 = r1.get(r12)
            cl.j r1 = (cl.j) r1
            long r2 = r1.f20261c
            r4 = r0
            cl.j r4 = (cl.j) r4
            long r4 = r4.f20261c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f19212o
            java.lang.Object r1 = r1.get(r12)
            cl.j r1 = (cl.j) r1
            long r2 = r1.f20261c
            r4 = r0
            cl.j r4 = (cl.j) r4
            long r4 = r4.f20261c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            fl.c r0 = (fl.c) r0
        L_0x0030:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = fl.c.f20223a
            java.lang.Object r2 = r1.get(r0)
            u9.b r3 = p3.l0.f13951b
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0040
            goto L_0x0055
        L_0x0040:
            fl.c r2 = (fl.c) r2
            if (r2 != 0) goto L_0x012f
        L_0x0044:
            boolean r2 = r1.compareAndSet(r0, r5, r3)
            if (r2 == 0) goto L_0x004c
            r1 = r4
            goto L_0x0053
        L_0x004c:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L_0x0044
            r1 = 0
        L_0x0053:
            if (r1 == 0) goto L_0x0030
        L_0x0055:
            cl.j r0 = (cl.j) r0
            boolean r1 = r12.z()
            r2 = -1
            if (r1 == 0) goto L_0x00a9
            r1 = r0
        L_0x005f:
            int r3 = cl.d.f19233b
            int r3 = r3 + r2
        L_0x0062:
            r6 = -1
            if (r2 >= r3) goto L_0x0095
            long r8 = r1.f20261c
            int r10 = cl.d.f19233b
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r3
            long r8 = r8 + r10
            long r10 = r12.t()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0077
            goto L_0x00a1
        L_0x0077:
            java.lang.Object r10 = r1.k(r3)
            if (r10 == 0) goto L_0x0087
            u9.b r11 = cl.d.f19236e
            if (r10 != r11) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            u9.b r11 = cl.d.f19235d
            if (r10 != r11) goto L_0x0092
            goto L_0x00a2
        L_0x0087:
            u9.b r11 = cl.d.f19243l
            boolean r10 = r1.j(r3, r10, r11)
            if (r10 == 0) goto L_0x0077
            r1.h()
        L_0x0092:
            int r3 = r3 + -1
            goto L_0x0062
        L_0x0095:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = fl.c.f20224b
            java.lang.Object r1 = r3.get(r1)
            fl.c r1 = (fl.c) r1
            cl.j r1 = (cl.j) r1
            if (r1 != 0) goto L_0x005f
        L_0x00a1:
            r8 = r6
        L_0x00a2:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00a9
            r12.n(r8)
        L_0x00a9:
            r1 = r0
        L_0x00aa:
            if (r1 == 0) goto L_0x010d
            int r3 = cl.d.f19233b
            int r3 = r3 - r4
        L_0x00af:
            if (r2 >= r3) goto L_0x0102
            long r6 = r1.f20261c
            int r8 = cl.d.f19233b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r3
            long r6 = r6 + r8
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x010d
        L_0x00bd:
            java.lang.Object r6 = r1.k(r3)
            if (r6 == 0) goto L_0x00f4
            u9.b r7 = cl.d.f19236e
            if (r6 != r7) goto L_0x00c8
            goto L_0x00f4
        L_0x00c8:
            boolean r7 = r6 instanceof cl.t
            if (r7 == 0) goto L_0x00e0
            u9.b r7 = cl.d.f19243l
            boolean r7 = r1.j(r3, r6, r7)
            if (r7 == 0) goto L_0x00bd
            cl.t r6 = (cl.t) r6
            al.f2 r6 = r6.f19267a
            java.lang.Object r5 = p3.l0.q0(r5, r6)
            r1.l(r3, r4)
            goto L_0x00ff
        L_0x00e0:
            boolean r7 = r6 instanceof al.f2
            if (r7 == 0) goto L_0x00ff
            u9.b r7 = cl.d.f19243l
            boolean r7 = r1.j(r3, r6, r7)
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r5 = p3.l0.q0(r5, r6)
            r1.l(r3, r4)
            goto L_0x00ff
        L_0x00f4:
            u9.b r7 = cl.d.f19243l
            boolean r6 = r1.j(r3, r6, r7)
            if (r6 == 0) goto L_0x00bd
            r1.h()
        L_0x00ff:
            int r3 = r3 + -1
            goto L_0x00af
        L_0x0102:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = fl.c.f20224b
            java.lang.Object r1 = r3.get(r1)
            fl.c r1 = (fl.c) r1
            cl.j r1 = (cl.j) r1
            goto L_0x00aa
        L_0x010d:
            if (r5 == 0) goto L_0x012e
            boolean r13 = r5 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x0119
            al.f2 r5 = (al.f2) r5
            r12.G(r5, r4)
            goto L_0x012e
        L_0x0119:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r13 = r5.size()
            int r13 = r13 - r4
        L_0x0120:
            if (r2 >= r13) goto L_0x012e
            java.lang.Object r14 = r5.get(r13)
            al.f2 r14 = (al.f2) r14
            r12.G(r14, r4)
            int r13 = r13 + -1
            goto L_0x0120
        L_0x012e:
            return r0
        L_0x012f:
            r0 = r2
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.k(long):cl.j");
    }

    public Object l(E e10) {
        boolean z10;
        j jVar;
        f2 f2Var;
        j jVar2;
        long j10 = f19207c.get(this);
        if (x(j10, false)) {
            z10 = false;
        } else {
            z10 = !i(j10 & 1152921504606846975L);
        }
        if (z10) {
            return i.f19255b;
        }
        u9.b bVar = d.f19241j;
        j jVar3 = (j) f19211n.get(this);
        while (true) {
            long andIncrement = f19207c.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean x10 = x(andIncrement, false);
            int i10 = d.f19233b;
            long j12 = (long) i10;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            if (jVar3.f20261c != j13) {
                j f10 = f(this, j13, jVar3);
                if (f10 != null) {
                    jVar = f10;
                } else if (x10) {
                    return new i.a(u());
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int i12 = i11;
            int i13 = i10;
            int h10 = h(this, jVar, i11, e10, j11, bVar, x10);
            if (h10 != 0) {
                if (h10 == 1) {
                    break;
                } else if (h10 != 2) {
                    if (h10 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (h10 != 4) {
                        if (h10 == 5) {
                            jVar4.a();
                        }
                        jVar3 = jVar4;
                    } else {
                        if (j11 < t()) {
                            jVar4.a();
                        }
                        return new i.a(u());
                    }
                } else if (x10) {
                    jVar4.h();
                    return new i.a(u());
                } else {
                    if (bVar instanceof f2) {
                        f2Var = (f2) bVar;
                    } else {
                        f2Var = null;
                    }
                    if (f2Var != null) {
                        jVar2 = jVar4;
                        f2Var.b(jVar2, i12 + i13);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return i.f19255b;
                }
            } else {
                jVar4.a();
                break;
            }
        }
        return ek.i.f20112a;
    }

    public final boolean m() {
        return x(f19207c.get(this), false);
    }

    public final void n(long j10) {
        UndeliveredElementException g2;
        j jVar = (j) f19212o.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f19208d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 >= Math.max(((long) this.f19216a) + j11, q())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                    long j12 = (long) d.f19233b;
                    long j13 = j11 / j12;
                    int i10 = (int) (j11 % j12);
                    if (jVar.f20261c != j13) {
                        j p10 = p(j13, jVar);
                        if (p10 == null) {
                            continue;
                        } else {
                            jVar = p10;
                        }
                    }
                    Object J = J(jVar, i10, j11, (Object) null);
                    if (J != d.f19246o) {
                        jVar.a();
                        l<E, ek.i> lVar = this.f19217b;
                        if (!(lVar == null || (g2 = m9.b.g(lVar, J, (UndeliveredElementException) null)) == null)) {
                            throw g2;
                        }
                    } else if (j11 < v()) {
                        jVar.a();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [fl.s] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0157, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0011 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r15 = this;
            r6 = r15
            boolean r0 = r15.A()
            if (r0 == 0) goto L_0x0008
            return
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19213p
            java.lang.Object r0 = r0.get(r15)
            cl.j r0 = (cl.j) r0
            r7 = r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f19209e
            long r8 = r0.getAndIncrement(r15)
            int r0 = cl.d.f19233b
            long r0 = (long) r0
            long r0 = r8 / r0
            long r2 = r15.v()
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r10 = 1
            if (r2 > 0) goto L_0x0039
            long r2 = r7.f20261c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0035
            fl.c r2 = r7.b()
            if (r2 == 0) goto L_0x0035
            r15.B(r0, r7)
        L_0x0035:
            r15.w(r10)
            return
        L_0x0039:
            long r2 = r7.f20261c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d9
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f19213p
            cl.c r3 = cl.c.f19231p
        L_0x0043:
            java.lang.Object r4 = p3.l0.R(r7, r0, r3)
            boolean r5 = j7.a.R(r4)
            if (r5 != 0) goto L_0x0095
            fl.s r5 = j7.a.M(r4)
        L_0x0051:
            java.lang.Object r14 = r2.get(r15)
            fl.s r14 = (fl.s) r14
            long r12 = r14.f20261c
            long r10 = r5.f20261c
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            boolean r10 = r5.i()
            if (r10 != 0) goto L_0x0068
            r5 = 0
            goto L_0x0083
        L_0x0068:
            boolean r10 = r2.compareAndSet(r15, r14, r5)
            if (r10 == 0) goto L_0x0070
            r10 = 1
            goto L_0x0077
        L_0x0070:
            java.lang.Object r10 = r2.get(r15)
            if (r10 == r14) goto L_0x0068
            r10 = 0
        L_0x0077:
            if (r10 == 0) goto L_0x0089
            boolean r5 = r14.e()
            if (r5 == 0) goto L_0x0082
            r14.d()
        L_0x0082:
            r5 = 1
        L_0x0083:
            if (r5 == 0) goto L_0x0086
            goto L_0x0095
        L_0x0086:
            r10 = 1
            goto L_0x0043
        L_0x0089:
            boolean r10 = r5.e()
            if (r10 == 0) goto L_0x0092
            r5.d()
        L_0x0092:
            r10 = 1
            goto L_0x0051
        L_0x0095:
            boolean r2 = j7.a.R(r4)
            if (r2 == 0) goto L_0x00a7
            r15.m()
            r15.B(r0, r7)
            r2 = 1
            r15.w(r2)
            goto L_0x00d3
        L_0x00a7:
            r2 = 1
            fl.s r4 = j7.a.M(r4)
            r10 = r4
            cl.j r10 = (cl.j) r10
            long r4 = r10.f20261c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f19209e
            long r11 = r8 + r2
            int r1 = cl.d.f19233b
            long r13 = (long) r1
            long r4 = r4 * r13
            r1 = r15
            r2 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x00ce
            long r0 = r10.f20261c
            long r0 = r0 * r13
            long r0 = r0 - r8
            r15.w(r0)
            goto L_0x00d3
        L_0x00ce:
            r0 = 1
            r15.w(r0)
        L_0x00d3:
            r10 = 0
        L_0x00d4:
            if (r10 != 0) goto L_0x00d8
            goto L_0x0011
        L_0x00d8:
            r7 = r10
        L_0x00d9:
            int r0 = cl.d.f19233b
            long r0 = (long) r0
            long r0 = r8 % r0
            int r0 = (int) r0
            java.lang.Object r1 = r7.k(r0)
            boolean r2 = r1 instanceof al.f2
            if (r2 == 0) goto L_0x0112
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f19208d
            long r2 = r2.get(r15)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0112
            u9.b r2 = cl.d.f19238g
            boolean r2 = r7.j(r0, r1, r2)
            if (r2 == 0) goto L_0x0112
            boolean r1 = r15.I(r1, r7, r0)
            if (r1 == 0) goto L_0x0106
            u9.b r1 = cl.d.f19235d
            r7.n(r0, r1)
            goto L_0x019b
        L_0x0106:
            u9.b r1 = cl.d.f19241j
            r7.n(r0, r1)
            r1 = 0
            r7.l(r0, r1)
            r12 = 0
            goto L_0x019c
        L_0x0112:
            java.lang.Object r1 = r7.k(r0)
            boolean r2 = r1 instanceof al.f2
            if (r2 == 0) goto L_0x0152
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f19208d
            long r2 = r2.get(r15)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0134
            cl.t r2 = new cl.t
            r3 = r1
            al.f2 r3 = (al.f2) r3
            r2.<init>(r3)
            boolean r1 = r7.j(r0, r1, r2)
            if (r1 == 0) goto L_0x0112
            goto L_0x019b
        L_0x0134:
            u9.b r2 = cl.d.f19238g
            boolean r2 = r7.j(r0, r1, r2)
            if (r2 == 0) goto L_0x0112
            boolean r1 = r15.I(r1, r7, r0)
            if (r1 == 0) goto L_0x0148
            u9.b r1 = cl.d.f19235d
            r7.n(r0, r1)
            goto L_0x019b
        L_0x0148:
            u9.b r1 = cl.d.f19241j
            r7.n(r0, r1)
            r2 = 0
            r7.l(r0, r2)
            goto L_0x0157
        L_0x0152:
            r2 = 0
            u9.b r3 = cl.d.f19241j
            if (r1 != r3) goto L_0x0159
        L_0x0157:
            r12 = r2
            goto L_0x019c
        L_0x0159:
            if (r1 != 0) goto L_0x0164
            u9.b r3 = cl.d.f19236e
            boolean r1 = r7.j(r0, r1, r3)
            if (r1 == 0) goto L_0x0112
            goto L_0x019b
        L_0x0164:
            u9.b r3 = cl.d.f19235d
            if (r1 != r3) goto L_0x0169
            goto L_0x019b
        L_0x0169:
            u9.b r3 = cl.d.f19239h
            if (r1 == r3) goto L_0x019b
            u9.b r3 = cl.d.f19240i
            if (r1 == r3) goto L_0x019b
            u9.b r3 = cl.d.f19242k
            if (r1 != r3) goto L_0x0176
            goto L_0x019b
        L_0x0176:
            u9.b r3 = cl.d.f19243l
            if (r1 != r3) goto L_0x017b
            goto L_0x019b
        L_0x017b:
            u9.b r3 = cl.d.f19237f
            if (r1 != r3) goto L_0x0180
            goto L_0x0112
        L_0x0180:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected cell state: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019b:
            r12 = 1
        L_0x019c:
            if (r12 == 0) goto L_0x01a4
            r0 = 1
            r15.w(r0)
            return
        L_0x01a4:
            r0 = 1
            r15.w(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.o():void");
    }

    public final j<E> p(long j10, j<E> jVar) {
        Object R;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19212o;
        j<Object> jVar2 = d.f19232a;
        c cVar = c.f19231p;
        do {
            R = l0.R(jVar, j10, cVar);
            if (j7.a.R(R)) {
                break;
            }
            s M = j7.a.M(R);
            while (true) {
                s sVar = (s) atomicReferenceFieldUpdater.get(this);
                if (sVar.f20261c >= M.f20261c) {
                    break;
                } else if (!M.i()) {
                    z11 = false;
                    continue;
                    break;
                } else {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, M)) {
                            if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                z12 = false;
                                break;
                            }
                        } else {
                            z12 = true;
                            break;
                        }
                    }
                    if (z12) {
                        if (sVar.e()) {
                            sVar.d();
                        }
                    } else if (M.e()) {
                        M.d();
                    }
                }
            }
            z11 = true;
            continue;
        } while (!z11);
        if (j7.a.R(R)) {
            m();
            if (jVar.f20261c * ((long) d.f19233b) >= v()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j<E> jVar3 = (j) j7.a.M(R);
        if (!A() && j10 <= q() / ((long) d.f19233b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19213p;
            while (true) {
                s sVar2 = (s) atomicReferenceFieldUpdater2.get(this);
                if (sVar2.f20261c >= jVar3.f20261c || !jVar3.i()) {
                    break;
                }
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, jVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    if (sVar2.e()) {
                        sVar2.d();
                    }
                } else if (jVar3.e()) {
                    jVar3.d();
                }
            }
        }
        long j12 = jVar3.f20261c;
        if (j12 <= j10) {
            return jVar3;
        }
        long j13 = j12 * ((long) d.f19233b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19208d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j13 || f19208d.compareAndSet(this, j11, j13)) {
            }
            j11 = atomicLongFieldUpdater.get(this);
            break;
        } while (f19208d.compareAndSet(this, j11, j13));
        if (jVar3.f20261c * ((long) d.f19233b) >= v()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final long q() {
        return f19209e.get(this);
    }

    public final Throwable r() {
        return (Throwable) f19214q.get(this);
    }

    public final Throwable s() {
        Throwable r10 = r();
        if (r10 == null) {
            return new ClosedReceiveChannelException();
        }
        return r10;
    }

    public final long t() {
        return f19208d.get(this);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [fl.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c7, code lost:
        r2 = r2.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ce, code lost:
        if (r2 != null) goto L_0x0206;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f19207c
            long r1 = r1.get(r15)
            r3 = 60
            long r1 = r1 >> r3
            int r1 = (int) r1
            r2 = 2
            r3 = 3
            if (r1 == r2) goto L_0x001c
            if (r1 == r3) goto L_0x0016
            goto L_0x0021
        L_0x0016:
            java.lang.String r1 = "cancelled,"
            r0.append(r1)
            goto L_0x0021
        L_0x001c:
            java.lang.String r1 = "closed,"
            r0.append(r1)
        L_0x0021:
            java.lang.String r1 = "capacity="
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            int r4 = r15.f19216a
            r1.append(r4)
            r4 = 44
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "data=["
            r0.append(r1)
            cl.j[] r1 = new cl.j[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19212o
            java.lang.Object r3 = r3.get(r15)
            r5 = 0
            r1[r5] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19211n
            java.lang.Object r3 = r3.get(r15)
            r6 = 1
            r1[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19213p
            java.lang.Object r3 = r3.get(r15)
            r1[r2] = r3
            java.util.List r1 = j7.a.d0(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0066:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0080
            java.lang.Object r3 = r1.next()
            r7 = r3
            cl.j r7 = (cl.j) r7
            cl.j<java.lang.Object> r8 = cl.d.f19232a
            if (r7 == r8) goto L_0x0079
            r7 = r6
            goto L_0x007a
        L_0x0079:
            r7 = r5
        L_0x007a:
            if (r7 == 0) goto L_0x0066
            r2.add(r3)
            goto L_0x0066
        L_0x0080:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0209
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x0095
            goto L_0x00af
        L_0x0095:
            r3 = r2
            cl.j r3 = (cl.j) r3
            long r6 = r3.f20261c
        L_0x009a:
            java.lang.Object r3 = r1.next()
            r8 = r3
            cl.j r8 = (cl.j) r8
            long r8 = r8.f20261c
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a9
            r2 = r3
            r6 = r8
        L_0x00a9:
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L_0x009a
        L_0x00af:
            cl.j r2 = (cl.j) r2
            long r8 = r15.t()
            long r10 = r15.v()
        L_0x00b9:
            int r1 = cl.d.f19233b
        L_0x00bb:
            if (r5 >= r1) goto L_0x01c7
            long r6 = r2.f20261c
            int r3 = cl.d.f19233b
            long r12 = (long) r3
            long r6 = r6 * r12
            long r12 = (long) r5
            long r6 = r6 + r12
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x00cd
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x01d0
        L_0x00cd:
            java.lang.Object r12 = r2.k(r5)
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r2.f19259f
            int r14 = r5 * 2
            java.lang.Object r13 = r13.get(r14)
            boolean r14 = r12 instanceof al.k
            if (r14 == 0) goto L_0x00f3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e7
            if (r3 < 0) goto L_0x00e7
            java.lang.String r3 = "receive"
            goto L_0x018f
        L_0x00e7:
            if (r3 >= 0) goto L_0x00ef
            if (r6 < 0) goto L_0x00ef
            java.lang.String r3 = "send"
            goto L_0x018f
        L_0x00ef:
            java.lang.String r3 = "cont"
            goto L_0x018f
        L_0x00f3:
            boolean r14 = r12 instanceof hl.f
            if (r14 == 0) goto L_0x010d
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0101
            if (r3 < 0) goto L_0x0101
            java.lang.String r3 = "onReceive"
            goto L_0x018f
        L_0x0101:
            if (r3 >= 0) goto L_0x0109
            if (r6 < 0) goto L_0x0109
            java.lang.String r3 = "onSend"
            goto L_0x018f
        L_0x0109:
            java.lang.String r3 = "select"
            goto L_0x018f
        L_0x010d:
            boolean r3 = r12 instanceof cl.q
            if (r3 == 0) goto L_0x0115
            java.lang.String r3 = "receiveCatching"
            goto L_0x018f
        L_0x0115:
            boolean r3 = r12 instanceof cl.a.b
            if (r3 == 0) goto L_0x011d
            java.lang.String r3 = "sendBroadcast"
            goto L_0x018f
        L_0x011d:
            boolean r3 = r12 instanceof cl.t
            if (r3 == 0) goto L_0x0138
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "EB("
            r3.append(r6)
            r3.append(r12)
            r6 = 41
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto L_0x018f
        L_0x0138:
            u9.b r3 = cl.d.f19237f
            boolean r3 = sk.j.a(r12, r3)
            if (r3 == 0) goto L_0x0142
            r3 = 1
            goto L_0x0148
        L_0x0142:
            u9.b r3 = cl.d.f19238g
            boolean r3 = sk.j.a(r12, r3)
        L_0x0148:
            if (r3 == 0) goto L_0x014d
            java.lang.String r3 = "resuming_sender"
            goto L_0x018f
        L_0x014d:
            if (r12 != 0) goto L_0x0151
            r3 = 1
            goto L_0x0157
        L_0x0151:
            u9.b r3 = cl.d.f19236e
            boolean r3 = sk.j.a(r12, r3)
        L_0x0157:
            if (r3 == 0) goto L_0x015b
            r3 = 1
            goto L_0x0161
        L_0x015b:
            u9.b r3 = cl.d.f19240i
            boolean r3 = sk.j.a(r12, r3)
        L_0x0161:
            if (r3 == 0) goto L_0x0165
            r3 = 1
            goto L_0x016b
        L_0x0165:
            u9.b r3 = cl.d.f19239h
            boolean r3 = sk.j.a(r12, r3)
        L_0x016b:
            if (r3 == 0) goto L_0x016f
            r3 = 1
            goto L_0x0175
        L_0x016f:
            u9.b r3 = cl.d.f19242k
            boolean r3 = sk.j.a(r12, r3)
        L_0x0175:
            if (r3 == 0) goto L_0x0179
            r3 = 1
            goto L_0x017f
        L_0x0179:
            u9.b r3 = cl.d.f19241j
            boolean r3 = sk.j.a(r12, r3)
        L_0x017f:
            if (r3 == 0) goto L_0x0183
            r3 = 1
            goto L_0x0189
        L_0x0183:
            u9.b r3 = cl.d.f19243l
            boolean r3 = sk.j.a(r12, r3)
        L_0x0189:
            if (r3 != 0) goto L_0x01c3
            java.lang.String r3 = r12.toString()
        L_0x018f:
            if (r13 == 0) goto L_0x01b1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 40
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            r6.append(r13)
            java.lang.String r3 = "),"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r0.append(r3)
            goto L_0x01c3
        L_0x01b1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r0.append(r3)
        L_0x01c3:
            int r5 = r5 + 1
            goto L_0x00bb
        L_0x01c7:
            fl.c r1 = r2.b()
            r2 = r1
            cl.j r2 = (cl.j) r2
            if (r2 != 0) goto L_0x0206
        L_0x01d0:
            int r1 = r0.length()
            if (r1 != 0) goto L_0x01d8
            r1 = 1
            goto L_0x01d9
        L_0x01d8:
            r1 = 0
        L_0x01d9:
            if (r1 != 0) goto L_0x01fe
            int r1 = yk.l.O0(r0)
            char r1 = r0.charAt(r1)
            if (r1 != r4) goto L_0x01f4
            int r1 = r0.length()
            int r1 = r1 + -1
            java.lang.StringBuilder r1 = r0.deleteCharAt(r1)
            java.lang.String r2 = "this.deleteCharAt(index)"
            sk.j.e(r1, r2)
        L_0x01f4:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x01fe:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Char sequence is empty."
            r0.<init>(r1)
            throw r0
        L_0x0206:
            r5 = 0
            goto L_0x00b9
        L_0x0209:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.toString():java.lang.String");
    }

    public final Throwable u() {
        Throwable r10 = r();
        if (r10 == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return r10;
    }

    public final long v() {
        return f19207c.get(this) & 1152921504606846975L;
    }

    public final void w(long j10) {
        boolean z10;
        boolean z11;
        if ((f19210f.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            do {
                if ((f19210f.get(this) & 4611686018427387904L) != 0) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
            } while (z11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        r12 = (cl.j) ((fl.c) fl.c.f20224b.get(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0185, code lost:
        r12 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(long r12, boolean r14) {
        /*
            r11 = this;
            r0 = 60
            long r0 = r12 >> r0
            int r0 = (int) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0199
            if (r0 == r2) goto L_0x0199
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r5 = 2
            if (r0 == r5) goto L_0x0102
            r14 = 3
            if (r0 != r14) goto L_0x00f2
            long r12 = r12 & r3
            cl.j r12 = r11.k(r12)
            rk.l<E, ek.i> r13 = r11.f19217b
            r14 = 0
            r0 = r14
            r3 = r0
        L_0x0020:
            int r4 = cl.d.f19233b
            r5 = -1
            int r4 = r4 + r5
        L_0x0024:
            if (r5 >= r4) goto L_0x00c0
            long r6 = r12.f20261c
            int r8 = cl.d.f19233b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x002e:
            java.lang.Object r8 = r12.k(r4)
            u9.b r9 = cl.d.f19240i
            if (r8 == r9) goto L_0x00cc
            u9.b r9 = cl.d.f19235d
            if (r8 != r9) goto L_0x005f
            long r9 = r11.t()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00cc
            u9.b r9 = cl.d.f19243l
            boolean r8 = r12.j(r4, r8, r9)
            if (r8 == 0) goto L_0x002e
            if (r13 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r12.f19259f
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            kotlinx.coroutines.internal.UndeliveredElementException r0 = m9.b.g(r13, r6, r0)
        L_0x0058:
            r12.m(r4, r14)
            r12.h()
            goto L_0x00bc
        L_0x005f:
            u9.b r9 = cl.d.f19236e
            if (r8 == r9) goto L_0x00b1
            if (r8 != 0) goto L_0x0066
            goto L_0x00b1
        L_0x0066:
            boolean r9 = r8 instanceof al.f2
            if (r9 != 0) goto L_0x007b
            boolean r9 = r8 instanceof cl.t
            if (r9 == 0) goto L_0x006f
            goto L_0x007b
        L_0x006f:
            u9.b r9 = cl.d.f19238g
            if (r8 == r9) goto L_0x00cc
            u9.b r10 = cl.d.f19237f
            if (r8 != r10) goto L_0x0078
            goto L_0x00cc
        L_0x0078:
            if (r8 == r9) goto L_0x002e
            goto L_0x00bc
        L_0x007b:
            long r9 = r11.t()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00cc
            boolean r9 = r8 instanceof cl.t
            if (r9 == 0) goto L_0x008d
            r9 = r8
            cl.t r9 = (cl.t) r9
            al.f2 r9 = r9.f19267a
            goto L_0x0090
        L_0x008d:
            r9 = r8
            al.f2 r9 = (al.f2) r9
        L_0x0090:
            u9.b r10 = cl.d.f19243l
            boolean r8 = r12.j(r4, r8, r10)
            if (r8 == 0) goto L_0x002e
            if (r13 == 0) goto L_0x00a6
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r12.f19259f
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            kotlinx.coroutines.internal.UndeliveredElementException r0 = m9.b.g(r13, r6, r0)
        L_0x00a6:
            java.lang.Object r3 = p3.l0.q0(r3, r9)
            r12.m(r4, r14)
            r12.h()
            goto L_0x00bc
        L_0x00b1:
            u9.b r9 = cl.d.f19243l
            boolean r8 = r12.j(r4, r8, r9)
            if (r8 == 0) goto L_0x002e
            r12.h()
        L_0x00bc:
            int r4 = r4 + -1
            goto L_0x0024
        L_0x00c0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = fl.c.f20224b
            java.lang.Object r12 = r4.get(r12)
            fl.c r12 = (fl.c) r12
            cl.j r12 = (cl.j) r12
            if (r12 != 0) goto L_0x0020
        L_0x00cc:
            if (r3 == 0) goto L_0x00ed
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00d8
            al.f2 r3 = (al.f2) r3
            r11.G(r3, r1)
            goto L_0x00ed
        L_0x00d8:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 + r5
        L_0x00df:
            if (r5 >= r12) goto L_0x00ed
            java.lang.Object r13 = r3.get(r12)
            al.f2 r13 = (al.f2) r13
            r11.G(r13, r1)
            int r12 = r12 + -1
            goto L_0x00df
        L_0x00ed:
            if (r0 != 0) goto L_0x00f1
            goto L_0x0198
        L_0x00f1:
            throw r0
        L_0x00f2:
            java.lang.String r12 = "unexpected close status: "
            java.lang.String r12 = android.support.v4.media.a.m(r12, r0)
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L_0x0102:
            long r12 = r12 & r3
            r11.k(r12)
            if (r14 == 0) goto L_0x0198
        L_0x0108:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f19212o
            java.lang.Object r13 = r12.get(r11)
            cl.j r13 = (cl.j) r13
            long r5 = r11.t()
            long r3 = r11.v()
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            int r14 = cl.d.f19233b
            long r3 = (long) r14
            long r7 = r5 / r3
            long r9 = r13.f20261c
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x013c
            cl.j r13 = r11.p(r7, r13)
            if (r13 != 0) goto L_0x013c
            java.lang.Object r12 = r12.get(r11)
            cl.j r12 = (cl.j) r12
            long r12 = r12.f20261c
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x0108
        L_0x013a:
            r12 = r1
            goto L_0x0189
        L_0x013c:
            r13.a()
            long r3 = r5 % r3
            int r12 = (int) r3
        L_0x0142:
            java.lang.Object r14 = r13.k(r12)
            if (r14 == 0) goto L_0x017a
            u9.b r0 = cl.d.f19236e
            if (r14 != r0) goto L_0x014d
            goto L_0x017a
        L_0x014d:
            u9.b r12 = cl.d.f19235d
            if (r14 != r12) goto L_0x0152
            goto L_0x0178
        L_0x0152:
            u9.b r12 = cl.d.f19241j
            if (r14 != r12) goto L_0x0157
            goto L_0x0185
        L_0x0157:
            u9.b r12 = cl.d.f19243l
            if (r14 != r12) goto L_0x015c
            goto L_0x0185
        L_0x015c:
            u9.b r12 = cl.d.f19240i
            if (r14 != r12) goto L_0x0161
            goto L_0x0185
        L_0x0161:
            u9.b r12 = cl.d.f19239h
            if (r14 != r12) goto L_0x0166
            goto L_0x0185
        L_0x0166:
            u9.b r12 = cl.d.f19238g
            if (r14 != r12) goto L_0x016b
            goto L_0x0178
        L_0x016b:
            u9.b r12 = cl.d.f19237f
            if (r14 != r12) goto L_0x0170
            goto L_0x0185
        L_0x0170:
            long r12 = r11.t()
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0185
        L_0x0178:
            r12 = r2
            goto L_0x0186
        L_0x017a:
            u9.b r0 = cl.d.f19239h
            boolean r14 = r13.j(r12, r14, r0)
            if (r14 == 0) goto L_0x0142
            r11.o()
        L_0x0185:
            r12 = r1
        L_0x0186:
            if (r12 == 0) goto L_0x018c
            r12 = r2
        L_0x0189:
            if (r12 != 0) goto L_0x0199
            goto L_0x0198
        L_0x018c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f19208d
            r12 = 1
            long r7 = r5 + r12
            r4 = r11
            r3.compareAndSet(r4, r5, r7)
            goto L_0x0108
        L_0x0198:
            r1 = r2
        L_0x0199:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.a.x(long, boolean):boolean");
    }

    public final boolean y() {
        return x(f19207c.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
