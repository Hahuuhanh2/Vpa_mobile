package al;

import al.i1;
import ek.i;
import fl.i;
import fl.o;
import ik.f;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import rk.l;
import rk.p;
import rk.q;
import sk.j;
import sk.u;

/* compiled from: JobSupport.kt */
public class m1 implements i1, q, u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19054a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19055b;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    public static final class a<T> extends l<T> {

        /* renamed from: p  reason: collision with root package name */
        public final m1 f19056p;

        public a(ik.d<? super T> dVar, m1 m1Var) {
            super(1, dVar);
            this.f19056p = m1Var;
        }

        public final Throwable r(m1 m1Var) {
            Throwable c10;
            Object M = this.f19056p.M();
            if ((M instanceof c) && (c10 = ((c) M).c()) != null) {
                return c10;
            }
            if (M instanceof u) {
                return ((u) M).f19094a;
            }
            return m1Var.getCancellationException();
        }

        public final String z() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class b extends l1 {

        /* renamed from: e  reason: collision with root package name */
        public final m1 f19057e;

        /* renamed from: f  reason: collision with root package name */
        public final c f19058f;

        /* renamed from: n  reason: collision with root package name */
        public final p f19059n;

        /* renamed from: o  reason: collision with root package name */
        public final Object f19060o;

        public b(m1 m1Var, c cVar, p pVar, Object obj) {
            this.f19057e = m1Var;
            this.f19058f = cVar;
            this.f19059n = pVar;
            this.f19060o = obj;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m((Throwable) obj);
            return i.f20112a;
        }

        public final void m(Throwable th2) {
            m1 m1Var = this.f19057e;
            c cVar = this.f19058f;
            p pVar = this.f19059n;
            Object obj = this.f19060o;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f19054a;
            m1Var.getClass();
            p X = m1.X(pVar);
            if (X == null || !m1Var.g0(cVar, X, obj)) {
                m1Var.p(m1Var.D(cVar, obj));
            }
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class c implements e1 {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f19061b;

        /* renamed from: c  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f19062c;

        /* renamed from: d  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f19063d;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting = 0;
        private volatile Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final r1 f19064a;

        static {
            Class<Object> cls = Object.class;
            Class<c> cls2 = c.class;
            f19061b = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleting");
            f19062c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_rootCause");
            f19063d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_exceptionsHolder");
        }

        public c(r1 r1Var, Throwable th2) {
            this.f19064a = r1Var;
            this._rootCause = th2;
        }

        public final r1 a() {
            return this.f19064a;
        }

        public final void b(Throwable th2) {
            Throwable c10 = c();
            if (c10 == null) {
                f19062c.set(this, th2);
            } else if (th2 != c10) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19063d;
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(this, th2);
                } else if (obj instanceof Throwable) {
                    if (th2 != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th2);
                        atomicReferenceFieldUpdater.set(this, arrayList);
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable c() {
            return (Throwable) f19062c.get(this);
        }

        public final boolean d() {
            if (c() != null) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            if (f19061b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final ArrayList f(Throwable th2) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19063d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable c10 = c();
            if (c10 != null) {
                arrayList.add(0, c10);
            }
            if (th2 != null && !j.a(th2, c10)) {
                arrayList.add(th2);
            }
            atomicReferenceFieldUpdater.set(this, m9.b.f13201f);
            return arrayList;
        }

        public final boolean isActive() {
            if (c() == null) {
                return true;
            }
            return false;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Finishing[cancelling=");
            q10.append(d());
            q10.append(", completing=");
            q10.append(e());
            q10.append(", rootCause=");
            q10.append(c());
            q10.append(", exceptions=");
            q10.append(f19063d.get(this));
            q10.append(", list=");
            q10.append(this.f19064a);
            q10.append(']');
            return q10.toString();
        }
    }

    /* compiled from: JobSupport.kt */
    public final class d extends l1 {

        /* renamed from: e  reason: collision with root package name */
        public final hl.f<?> f19065e;

        public d(hl.f<?> fVar) {
            this.f19065e = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m((Throwable) obj);
            return i.f20112a;
        }

        public final void m(Throwable th2) {
            Object M = m1.this.M();
            if (!(M instanceof u)) {
                M = m9.b.d0(M);
            }
            this.f19065e.e(m1.this, M);
        }
    }

    /* compiled from: JobSupport.kt */
    public final class e extends l1 {

        /* renamed from: e  reason: collision with root package name */
        public final hl.f<?> f19067e;

        public e(hl.f<?> fVar) {
            this.f19067e = fVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m((Throwable) obj);
            return i.f20112a;
        }

        public final void m(Throwable th2) {
            this.f19067e.e(m1.this, i.f20112a);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class f extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m1 f19069d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f19070e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(fl.i iVar, m1 m1Var, Object obj) {
            super(iVar);
            this.f19069d = m1Var;
            this.f19070e = obj;
        }

        public final u9.b c(Object obj) {
            boolean z10;
            fl.i iVar = (fl.i) obj;
            if (this.f19069d.M() == this.f19070e) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return j7.a.f11706n;
        }
    }

    @kk.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {956, 958}, m = "invokeSuspend")
    /* compiled from: JobSupport.kt */
    public static final class g extends kk.h implements p<xk.g<? super i1>, ik.d<? super ek.i>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public fl.h f19071b;

        /* renamed from: c  reason: collision with root package name */
        public fl.i f19072c;

        /* renamed from: d  reason: collision with root package name */
        public int f19073d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f19074e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ m1 f19075f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ik.d dVar, m1 m1Var) {
            super(dVar);
            this.f19075f = m1Var;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            g gVar = new g(dVar, this.f19075f);
            gVar.f19074e = obj;
            return gVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((g) create((xk.g) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                int r1 = r7.f19073d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                fl.i r1 = r7.f19072c
                fl.h r3 = r7.f19071b
                java.lang.Object r4 = r7.f19074e
                xk.g r4 = (xk.g) r4
                p3.l0.Q0(r8)
                r8 = r7
                goto L_0x007b
            L_0x0019:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0021:
                p3.l0.Q0(r8)
                goto L_0x0080
            L_0x0025:
                p3.l0.Q0(r8)
                java.lang.Object r8 = r7.f19074e
                xk.g r8 = (xk.g) r8
                al.m1 r1 = r7.f19075f
                java.lang.Object r1 = r1.M()
                boolean r4 = r1 instanceof al.p
                if (r4 == 0) goto L_0x0040
                al.p r1 = (al.p) r1
                al.q r1 = r1.f19081e
                r7.f19073d = r3
                r8.a(r1, r7)
                return r0
            L_0x0040:
                boolean r3 = r1 instanceof al.e1
                if (r3 == 0) goto L_0x0080
                al.e1 r1 = (al.e1) r1
                al.r1 r1 = r1.a()
                if (r1 == 0) goto L_0x0080
                java.lang.Object r3 = r1.h()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                sk.j.d(r3, r4)
                fl.i r3 = (fl.i) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x005c:
                boolean r5 = sk.j.a(r1, r3)
                if (r5 != 0) goto L_0x0080
                boolean r5 = r1 instanceof al.p
                if (r5 == 0) goto L_0x007b
                r5 = r1
                al.p r5 = (al.p) r5
                al.q r5 = r5.f19081e
                r8.f19074e = r4
                r8.f19071b = r3
                r8.f19072c = r1
                r8.f19073d = r2
                r4.a(r5, r8)
                jk.a r5 = jk.a.COROUTINE_SUSPENDED
                if (r5 != r0) goto L_0x007b
                return r0
            L_0x007b:
                fl.i r1 = r1.j()
                goto L_0x005c
            L_0x0080:
                ek.i r8 = ek.i.f20112a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: al.m1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: JobSupport.kt */
    public /* synthetic */ class h extends sk.i implements q<m1, hl.f<?>, Object, ek.i> {

        /* renamed from: p  reason: collision with root package name */
        public static final h f19076p = new h();

        public h() {
            super(3, m1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final Object d(dl.f fVar, Object obj, Object obj2) {
            boolean z10;
            m1 m1Var = (m1) fVar;
            hl.f fVar2 = (hl.f) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f19054a;
            while (true) {
                Object M = m1Var.M();
                if (M instanceof e1) {
                    if (m1Var.c0(M) >= 0) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                fVar2.f(ek.i.f20112a);
            } else {
                fVar2.a(m1Var.invokeOnCompletion(new e(fVar2)));
            }
            return ek.i.f20112a;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<m1> cls2 = m1.class;
        f19054a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f19055b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_parentHandle");
    }

    public m1(boolean z10) {
        w0 w0Var;
        if (z10) {
            w0Var = m9.b.f13203o;
        } else {
            w0Var = m9.b.f13202n;
        }
        this._state = w0Var;
    }

    public static p X(fl.i iVar) {
        while (iVar.l()) {
            iVar = iVar.k();
        }
        while (true) {
            iVar = iVar.j();
            if (!iVar.l()) {
                if (iVar instanceof p) {
                    return (p) iVar;
                }
                if (iVar instanceof r1) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else if (obj instanceof e1) {
            if (((e1) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof u) {
            return "Cancelled";
        } else {
            return "Completed";
        }
        return "Active";
    }

    public static CancellationException e0(m1 m1Var, Throwable th2) {
        CancellationException cancellationException;
        m1Var.getClass();
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new JobCancellationException(m1Var.w(), th2, m1Var);
        }
        return cancellationException;
    }

    public final void A(e1 e1Var, Object obj) {
        u uVar;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19055b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.b();
            atomicReferenceFieldUpdater.set(this, s1.f19087a);
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th2 = uVar.f19094a;
        } else {
            th2 = null;
        }
        if (e1Var instanceof l1) {
            try {
                ((l1) e1Var).m(th2);
            } catch (Throwable th3) {
                P(new CompletionHandlerException("Exception in completion handler " + e1Var + " for " + this, th3));
            }
        } else {
            r1 a10 = e1Var.a();
            if (a10 != null) {
                Object h10 = a10.h();
                j.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                for (fl.i iVar = (fl.i) h10; !j.a(iVar, a10); iVar = iVar.j()) {
                    if (iVar instanceof l1) {
                        l1 l1Var = (l1) iVar;
                        try {
                            l1Var.m(th2);
                        } catch (Throwable th4) {
                            if (completionHandlerException != null) {
                                g0.s(completionHandlerException, th4);
                            } else {
                                completionHandlerException = new CompletionHandlerException("Exception in completion handler " + l1Var + " for " + this, th4);
                                ek.i iVar2 = ek.i.f20112a;
                            }
                        }
                    }
                }
                if (completionHandlerException != null) {
                    P(completionHandlerException);
                }
            }
        }
    }

    public final Throwable C(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new JobCancellationException(w(), (Throwable) null, this);
            }
            return th2;
        }
        j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((u1) obj).L();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[LOOP:1: B:42:0x0094->B:45:0x009f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(al.m1.c r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof al.u
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r9
            al.u r0 = (al.u) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.f19094a
        L_0x000e:
            monitor-enter(r8)
            r8.d()     // Catch:{ all -> 0x00a5 }
            java.util.ArrayList r0 = r8.f(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r2 = r7.G(r8, r0)     // Catch:{ all -> 0x00a5 }
            r3 = 1
            if (r2 == 0) goto L_0x0053
            int r4 = r0.size()     // Catch:{ all -> 0x00a5 }
            if (r4 > r3) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r4 = r0.size()     // Catch:{ all -> 0x00a5 }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00a5 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a5 }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0035:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00a5 }
            if (r5 == r2) goto L_0x0035
            if (r5 == r2) goto L_0x0035
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00a5 }
            if (r6 != 0) goto L_0x0035
            boolean r6 = r4.add(r5)     // Catch:{ all -> 0x00a5 }
            if (r6 == 0) goto L_0x0035
            al.g0.s(r2, r5)     // Catch:{ all -> 0x00a5 }
            goto L_0x0035
        L_0x0053:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            if (r2 != r1) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            al.u r9 = new al.u
            r9.<init>(r2, r0)
        L_0x0060:
            if (r2 == 0) goto L_0x0081
            boolean r1 = r7.u(r2)
            if (r1 != 0) goto L_0x0071
            boolean r1 = r7.O(r2)
            if (r1 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = r0
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            if (r1 == 0) goto L_0x0081
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            sk.j.d(r9, r1)
            r1 = r9
            al.u r1 = (al.u) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = al.u.f19093b
            r2.compareAndSet(r1, r0, r3)
        L_0x0081:
            r7.Z(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19054a
            boolean r1 = r9 instanceof al.e1
            if (r1 == 0) goto L_0x0093
            al.f1 r1 = new al.f1
            r2 = r9
            al.e1 r2 = (al.e1) r2
            r1.<init>(r2)
            goto L_0x0094
        L_0x0093:
            r1 = r9
        L_0x0094:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L_0x0094
        L_0x00a1:
            r7.A(r8, r9)
            return r9
        L_0x00a5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.D(al.m1$c, java.lang.Object):java.lang.Object");
    }

    public final Object F() {
        Object M = M();
        if (!(!(M instanceof e1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(M instanceof u)) {
            return m9.b.d0(M);
        } else {
            throw ((u) M).f19094a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable G(al.m1.c r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.d()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.w()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r6 = r7.iterator()
        L_0x001c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0036
            return r0
        L_0x0036:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x0063
            java.util.Iterator r7 = r7.iterator()
        L_0x0045:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L_0x005a
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005a
            r4 = r2
            goto L_0x005b
        L_0x005a:
            r4 = r6
        L_0x005b:
            if (r4 == 0) goto L_0x0045
            r1 = r3
        L_0x005e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0063
            return r1
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.G(al.m1$c, java.util.ArrayList):java.lang.Throwable");
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof s;
    }

    public final r1 J(e1 e1Var) {
        r1 a10 = e1Var.a();
        if (a10 != null) {
            return a10;
        }
        if (e1Var instanceof w0) {
            return new r1();
        }
        if (e1Var instanceof l1) {
            b0((l1) e1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + e1Var).toString());
    }

    public final CancellationException L() {
        Throwable th2;
        Object M = M();
        CancellationException cancellationException = null;
        if (M instanceof c) {
            th2 = ((c) M).c();
        } else if (M instanceof u) {
            th2 = ((u) M).f19094a;
        } else if (!(M instanceof e1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + M).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Parent job is ");
        q10.append(d0(M));
        return new JobCancellationException(q10.toString(), th2, this);
    }

    public final Object M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19054a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public boolean O(Throwable th2) {
        return false;
    }

    public final void Q(i1 i1Var) {
        if (i1Var == null) {
            f19055b.set(this, s1.f19087a);
            return;
        }
        i1Var.start();
        o attachChild = i1Var.attachChild(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19055b;
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (isCompleted()) {
            attachChild.b();
            atomicReferenceFieldUpdater.set(this, s1.f19087a);
        }
    }

    public boolean T() {
        return this instanceof f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.M()
            java.lang.Object r0 = r3.f0(r0, r4)
            u9.b r1 = m9.b.f13197b
            if (r0 != r1) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            u9.b r1 = m9.b.f13198c
            r2 = 1
            if (r0 != r1) goto L_0x0014
            return r2
        L_0x0014:
            u9.b r1 = m9.b.f13199d
            if (r0 == r1) goto L_0x0000
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.U(java.lang.Object):boolean");
    }

    public final Object V(Object obj) {
        Object f02;
        u uVar;
        do {
            f02 = f0(M(), obj);
            if (f02 == m9.b.f13197b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof u) {
                    uVar = (u) obj;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    th2 = uVar.f19094a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (f02 == m9.b.f13199d);
        return f02;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(r1 r1Var, Throwable th2) {
        Object h10 = r1Var.h();
        j.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (fl.i iVar = (fl.i) h10; !j.a(iVar, r1Var); iVar = iVar.j()) {
            if (iVar instanceof j1) {
                l1 l1Var = (l1) iVar;
                try {
                    l1Var.m(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        g0.s(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + l1Var + " for " + this, th3);
                        ek.i iVar2 = ek.i.f20112a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            P(completionHandlerException);
        }
        u(th2);
    }

    public void Z(Object obj) {
    }

    public void a0() {
    }

    public final o attachChild(q qVar) {
        t0 a10 = i1.a.a(this, true, new p(qVar), 2);
        j.d(a10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (o) a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[LOOP:2: B:12:0x0036->B:15:0x0041, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0(al.l1 r6) {
        /*
            r5 = this;
            al.r1 r0 = new al.r1
            r0.<init>()
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = fl.i.f20241b
            r1.lazySet(r0, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = fl.i.f20240a
            r1.lazySet(r0, r6)
        L_0x0012:
            java.lang.Object r1 = r6.h()
            r2 = 0
            if (r1 == r6) goto L_0x001a
            goto L_0x0030
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = fl.i.f20240a
        L_0x001c:
            boolean r3 = r1.compareAndSet(r6, r6, r0)
            r4 = 1
            if (r3 == 0) goto L_0x0025
            r2 = r4
            goto L_0x002b
        L_0x0025:
            java.lang.Object r3 = r1.get(r6)
            if (r3 == r6) goto L_0x001c
        L_0x002b:
            if (r2 == 0) goto L_0x0012
            r0.f(r6)
        L_0x0030:
            fl.i r1 = r6.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f19054a
        L_0x0036:
            boolean r0 = r2.compareAndSet(r5, r6, r1)
            if (r0 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            java.lang.Object r0 = r2.get(r5)
            if (r0 == r6) goto L_0x0036
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.b0(al.l1):void");
    }

    public final int c0(Object obj) {
        boolean z10 = false;
        if (obj instanceof w0) {
            if (((w0) obj).f19100a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19054a;
            w0 w0Var = m9.b.f13203o;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            a0();
            return 1;
        } else if (!(obj instanceof d1)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19054a;
            r1 r1Var = ((d1) obj).f19008a;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, r1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            a0();
            return 1;
        }
    }

    public final /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c1, code lost:
        if (r6 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00c3, code lost:
        Y(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c8, code lost:
        if ((r9 instanceof al.p) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ca, code lost:
        r0 = (al.p) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ce, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        if (r0 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d1, code lost:
        r9 = r9.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d5, code lost:
        if (r9 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d7, code lost:
        r4 = X(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00dc, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00dd, code lost:
        if (r4 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e3, code lost:
        if (g0(r3, r4, r10) == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return D(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        return m9.b.f13198c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f0(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof al.e1
            if (r0 != 0) goto L_0x0007
            u9.b r9 = m9.b.f13197b
            return r9
        L_0x0007:
            boolean r0 = r9 instanceof al.w0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9 instanceof al.l1
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r9 instanceof al.p
            if (r0 != 0) goto L_0x004c
            boolean r0 = r10 instanceof al.u
            if (r0 != 0) goto L_0x004c
            r0 = r9
            al.e1 r0 = (al.e1) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19054a
            boolean r9 = r10 instanceof al.e1
            if (r9 == 0) goto L_0x002c
            al.f1 r9 = new al.f1
            r4 = r10
            al.e1 r4 = (al.e1) r4
            r9.<init>(r4)
            r4 = r9
            goto L_0x002d
        L_0x002c:
            r4 = r10
        L_0x002d:
            boolean r9 = r3.compareAndSet(r8, r0, r4)
            if (r9 == 0) goto L_0x0035
            r9 = r1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r9 = r3.get(r8)
            if (r9 == r0) goto L_0x002d
            r9 = r2
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r1 = r2
            goto L_0x0046
        L_0x0040:
            r8.Z(r10)
            r8.A(r0, r10)
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r10
        L_0x0049:
            u9.b r9 = m9.b.f13199d
            return r9
        L_0x004c:
            al.e1 r9 = (al.e1) r9
            al.r1 r0 = r8.J(r9)
            if (r0 != 0) goto L_0x0058
            u9.b r9 = m9.b.f13199d
            goto L_0x00ec
        L_0x0058:
            boolean r3 = r9 instanceof al.m1.c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r9
            al.m1$c r3 = (al.m1.c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            al.m1$c r3 = new al.m1$c
            r3.<init>(r0, r4)
        L_0x0069:
            sk.r r5 = new sk.r
            r5.<init>()
            monitor-enter(r3)
            boolean r6 = r3.e()     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x007a
            u9.b r9 = m9.b.f13197b     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)
            goto L_0x00ec
        L_0x007a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = al.m1.c.f19061b     // Catch:{ all -> 0x00ed }
            r6.set(r3, r1)     // Catch:{ all -> 0x00ed }
            if (r3 == r9) goto L_0x0097
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f19054a     // Catch:{ all -> 0x00ed }
        L_0x0083:
            boolean r7 = r6.compareAndSet(r8, r9, r3)     // Catch:{ all -> 0x00ed }
            if (r7 == 0) goto L_0x008b
            r2 = r1
            goto L_0x0091
        L_0x008b:
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x00ed }
            if (r7 == r9) goto L_0x0083
        L_0x0091:
            if (r2 != 0) goto L_0x0097
            u9.b r9 = m9.b.f13199d     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)
            goto L_0x00ec
        L_0x0097:
            boolean r2 = r3.d()     // Catch:{ all -> 0x00ed }
            boolean r6 = r10 instanceof al.u     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x00a3
            r6 = r10
            al.u r6 = (al.u) r6     // Catch:{ all -> 0x00ed }
            goto L_0x00a4
        L_0x00a3:
            r6 = r4
        L_0x00a4:
            if (r6 == 0) goto L_0x00ab
            java.lang.Throwable r6 = r6.f19094a     // Catch:{ all -> 0x00ed }
            r3.b(r6)     // Catch:{ all -> 0x00ed }
        L_0x00ab:
            java.lang.Throwable r6 = r3.c()     // Catch:{ all -> 0x00ed }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00ed }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r6 = r4
        L_0x00bc:
            r5.f22931a = r6     // Catch:{ all -> 0x00ed }
            ek.i r1 = ek.i.f20112a     // Catch:{ all -> 0x00ed }
            monitor-exit(r3)
            if (r6 == 0) goto L_0x00c6
            r8.Y(r0, r6)
        L_0x00c6:
            boolean r0 = r9 instanceof al.p
            if (r0 == 0) goto L_0x00ce
            r0 = r9
            al.p r0 = (al.p) r0
            goto L_0x00cf
        L_0x00ce:
            r0 = r4
        L_0x00cf:
            if (r0 != 0) goto L_0x00dc
            al.r1 r9 = r9.a()
            if (r9 == 0) goto L_0x00dd
            al.p r4 = X(r9)
            goto L_0x00dd
        L_0x00dc:
            r4 = r0
        L_0x00dd:
            if (r4 == 0) goto L_0x00e8
            boolean r9 = r8.g0(r3, r4, r10)
            if (r9 == 0) goto L_0x00e8
            u9.b r9 = m9.b.f13198c
            goto L_0x00ec
        L_0x00e8:
            java.lang.Object r9 = r8.D(r3, r10)
        L_0x00ec:
            return r9
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.f0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    public final boolean g0(c cVar, p pVar, Object obj) {
        while (i1.a.a(pVar.f19081e, false, new b(this, cVar, pVar, obj), 1) == s1.f19087a) {
            pVar = X(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final CancellationException getCancellationException() {
        Object M = M();
        CancellationException cancellationException = null;
        if (M instanceof c) {
            Throwable c10 = ((c) M).c();
            if (c10 != null) {
                String str = getClass().getSimpleName() + " is cancelling";
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException != null) {
                    return cancellationException;
                }
                if (str == null) {
                    str = w();
                }
                return new JobCancellationException(str, c10, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (M instanceof e1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (M instanceof u) {
            return e0(this, ((u) M).f19094a);
        } else {
            return new JobCancellationException(getClass().getSimpleName() + " has completed normally", (Throwable) null, this);
        }
    }

    public final xk.e<i1> getChildren() {
        return new xk.i(new g((ik.d) null, this));
    }

    public final Throwable getCompletionExceptionOrNull() {
        u uVar;
        Object M = M();
        if (!(M instanceof e1)) {
            if (M instanceof u) {
                uVar = (u) M;
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return uVar.f19094a;
            }
            return null;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final f.c<?> getKey() {
        return i1.b.f19045a;
    }

    public final hl.a getOnJoin() {
        h hVar = h.f19076p;
        u.a(3, hVar);
        return new hl.b((r) this, hVar);
    }

    public final i1 getParent() {
        o oVar = (o) f19055b.get(this);
        if (oVar != null) {
            return oVar.getParent();
        }
        return null;
    }

    public final t0 invokeOnCompletion(l<? super Throwable, ek.i> lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    public boolean isActive() {
        Object M = M();
        if (!(M instanceof e1) || !((e1) M).isActive()) {
            return false;
        }
        return true;
    }

    public final boolean isCancelled() {
        Object M = M();
        if ((M instanceof u) || ((M instanceof c) && ((c) M).d())) {
            return true;
        }
        return false;
    }

    public final boolean isCompleted() {
        return !(M() instanceof e1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object join(ik.d<? super ek.i> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.M()
            boolean r1 = r0 instanceof al.e1
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r3.c0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = r2
        L_0x0012:
            if (r0 != 0) goto L_0x001e
            ik.f r4 = r4.getContext()
            al.g0.O(r4)
            ek.i r4 = ek.i.f20112a
            return r4
        L_0x001e:
            al.l r0 = new al.l
            ik.d r4 = al.g0.b0(r4)
            r0.<init>(r2, r4)
            r0.t()
            al.w1 r4 = new al.w1
            r4.<init>(r0)
            al.t0 r4 = r3.invokeOnCompletion(r4)
            al.u0 r1 = new al.u0
            r1.<init>(r4)
            r0.v(r1)
            java.lang.Object r4 = r0.s()
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            ek.i r4 = ek.i.f20112a
        L_0x0046:
            if (r4 != r0) goto L_0x0049
            return r4
        L_0x0049:
            ek.i r4 = ek.i.f20112a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.join(ik.d):java.lang.Object");
    }

    public final ik.f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final boolean o(Object obj, r1 r1Var, l1 l1Var) {
        boolean z10;
        boolean z11;
        f fVar = new f(l1Var, this, obj);
        do {
            fl.i k10 = r1Var.k();
            fl.i.f20241b.lazySet(l1Var, k10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fl.i.f20240a;
            atomicReferenceFieldUpdater.lazySet(l1Var, r1Var);
            fVar.f20244c = r1Var;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(k10, r1Var, fVar)) {
                    if (atomicReferenceFieldUpdater.get(k10) != r1Var) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                z11 = false;
            } else if (fVar.a(k10) == null) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (z11) {
                return true;
            }
        } while (!z11);
        return false;
    }

    public void p(Object obj) {
    }

    public final i1 plus(i1 i1Var) {
        return i1Var;
    }

    public final ik.f plus(ik.f fVar) {
        j.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final Object q(ik.d<Object> dVar) {
        Object M;
        do {
            M = M();
            if (!(M instanceof e1)) {
                if (!(M instanceof u)) {
                    return m9.b.d0(M);
                }
                throw ((u) M).f19094a;
            }
        } while (c0(M) < 0);
        a aVar = new a(g0.b0(dVar), this);
        aVar.t();
        aVar.v(new u0(invokeOnCompletion(new v1(aVar))));
        Object s10 = aVar.s();
        jk.a aVar2 = jk.a.COROUTINE_SUSPENDED;
        return s10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0100, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(java.lang.Object r10) {
        /*
            r9 = this;
            u9.b r0 = m9.b.f13197b
            boolean r1 = r9.I()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r0 = r9.M()
            boolean r1 = r0 instanceof al.e1
            if (r1 == 0) goto L_0x0032
            boolean r1 = r0 instanceof al.m1.c
            if (r1 == 0) goto L_0x0020
            r1 = r0
            al.m1$c r1 = (al.m1.c) r1
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0020
            goto L_0x0032
        L_0x0020:
            al.u r1 = new al.u
            java.lang.Throwable r4 = r9.C(r10)
            r1.<init>(r4, r3)
            java.lang.Object r0 = r9.f0(r0, r1)
            u9.b r1 = m9.b.f13199d
            if (r0 == r1) goto L_0x000a
            goto L_0x0034
        L_0x0032:
            u9.b r0 = m9.b.f13197b
        L_0x0034:
            u9.b r1 = m9.b.f13198c
            if (r0 != r1) goto L_0x0039
            return r2
        L_0x0039:
            u9.b r1 = m9.b.f13197b
            if (r0 != r1) goto L_0x0101
            r0 = 0
            r1 = r0
        L_0x003f:
            java.lang.Object r4 = r9.M()
            boolean r5 = r4 instanceof al.m1.c
            if (r5 == 0) goto L_0x0093
            monitor-enter(r4)
            r5 = r4
            al.m1$c r5 = (al.m1.c) r5     // Catch:{ all -> 0x0090 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = al.m1.c.f19063d     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0090 }
            u9.b r6 = m9.b.f13201f     // Catch:{ all -> 0x0090 }
            if (r5 != r6) goto L_0x0057
            r5 = r2
            goto L_0x0058
        L_0x0057:
            r5 = r3
        L_0x0058:
            if (r5 == 0) goto L_0x005f
            u9.b r10 = m9.b.f13200e     // Catch:{ all -> 0x0090 }
            monitor-exit(r4)
            goto L_0x0100
        L_0x005f:
            r5 = r4
            al.m1$c r5 = (al.m1.c) r5     // Catch:{ all -> 0x0090 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0090 }
            if (r10 != 0) goto L_0x006a
            if (r5 != 0) goto L_0x0076
        L_0x006a:
            if (r1 != 0) goto L_0x0070
            java.lang.Throwable r1 = r9.C(r10)     // Catch:{ all -> 0x0090 }
        L_0x0070:
            r10 = r4
            al.m1$c r10 = (al.m1.c) r10     // Catch:{ all -> 0x0090 }
            r10.b(r1)     // Catch:{ all -> 0x0090 }
        L_0x0076:
            r10 = r4
            al.m1$c r10 = (al.m1.c) r10     // Catch:{ all -> 0x0090 }
            java.lang.Throwable r10 = r10.c()     // Catch:{ all -> 0x0090 }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x0082
            r0 = r10
        L_0x0082:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x008c
            al.m1$c r4 = (al.m1.c) r4
            al.r1 r10 = r4.f19064a
            r9.Y(r10, r0)
        L_0x008c:
            u9.b r10 = m9.b.f13197b
            goto L_0x0100
        L_0x0090:
            r10 = move-exception
            monitor-exit(r4)
            throw r10
        L_0x0093:
            boolean r5 = r4 instanceof al.e1
            if (r5 == 0) goto L_0x00fe
            if (r1 != 0) goto L_0x009d
            java.lang.Throwable r1 = r9.C(r10)
        L_0x009d:
            r5 = r4
            al.e1 r5 = (al.e1) r5
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L_0x00d0
            al.r1 r6 = r9.J(r5)
            if (r6 != 0) goto L_0x00ad
            goto L_0x00c5
        L_0x00ad:
            al.m1$c r7 = new al.m1$c
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f19054a
        L_0x00b4:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto L_0x00bc
            r4 = r2
            goto L_0x00c3
        L_0x00bc:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto L_0x00b4
            r4 = r3
        L_0x00c3:
            if (r4 != 0) goto L_0x00c7
        L_0x00c5:
            r4 = r3
            goto L_0x00cb
        L_0x00c7:
            r9.Y(r6, r1)
            r4 = r2
        L_0x00cb:
            if (r4 == 0) goto L_0x003f
            u9.b r10 = m9.b.f13197b
            goto L_0x0100
        L_0x00d0:
            al.u r5 = new al.u
            r5.<init>(r1, r3)
            java.lang.Object r5 = r9.f0(r4, r5)
            u9.b r6 = m9.b.f13197b
            if (r5 == r6) goto L_0x00e3
            u9.b r4 = m9.b.f13199d
            if (r5 == r4) goto L_0x003f
            r0 = r5
            goto L_0x0101
        L_0x00e3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00fe:
            u9.b r10 = m9.b.f13200e
        L_0x0100:
            r0 = r10
        L_0x0101:
            u9.b r10 = m9.b.f13197b
            if (r0 != r10) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            u9.b r10 = m9.b.f13198c
            if (r0 != r10) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            u9.b r10 = m9.b.f13200e
            if (r0 != r10) goto L_0x0111
            r2 = r3
            goto L_0x0114
        L_0x0111:
            r9.p(r0)
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.r(java.lang.Object):boolean");
    }

    public final boolean start() {
        int c02;
        do {
            c02 = c0(M());
            if (c02 == 0) {
                return false;
            }
        } while (c02 != 1);
        return true;
    }

    public void t(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(W() + '{' + d0(M()) + '}');
        sb2.append('@');
        sb2.append(g0.T(this));
        return sb2.toString();
    }

    public final boolean u(Throwable th2) {
        if (T()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        o oVar = (o) f19055b.get(this);
        if (oVar == null || oVar == s1.f19087a) {
            return z10;
        }
        if (oVar.i(th2) || z10) {
            return true;
        }
        return false;
    }

    public final void v(m1 m1Var) {
        r(m1Var);
    }

    public String w() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (!r(th2) || !H()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean cancel(Throwable th2) {
        CancellationException cancellationException;
        if (th2 != null) {
            cancellationException = e0(this, th2);
        } else {
            cancellationException = new JobCancellationException(w(), (Throwable) null, this);
        }
        t(cancellationException);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[LOOP:2: B:33:0x005c->B:36:0x0067, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final al.t0 invokeOnCompletion(boolean r8, boolean r9, rk.l<? super java.lang.Throwable, ek.i> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof al.j1
            if (r1 == 0) goto L_0x000b
            r1 = r10
            al.j1 r1 = (al.j1) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0025
            al.g1 r1 = new al.g1
            r1.<init>(r10)
            goto L_0x0025
        L_0x0014:
            boolean r1 = r10 instanceof al.l1
            if (r1 == 0) goto L_0x001c
            r1 = r10
            al.l1 r1 = (al.l1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            al.h1 r1 = new al.h1
            r1.<init>(r10)
        L_0x0025:
            r1.f19052d = r7
        L_0x0027:
            java.lang.Object r2 = r7.M()
            boolean r3 = r2 instanceof al.w0
            if (r3 == 0) goto L_0x006a
            r3 = r2
            al.w0 r3 = (al.w0) r3
            boolean r4 = r3.f19100a
            if (r4 == 0) goto L_0x004a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f19054a
        L_0x0038:
            boolean r3 = r4.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0047
        L_0x0040:
            java.lang.Object r3 = r4.get(r7)
            if (r3 == r2) goto L_0x0038
            r2 = 0
        L_0x0047:
            if (r2 == 0) goto L_0x0027
            return r1
        L_0x004a:
            al.r1 r2 = new al.r1
            r2.<init>()
            boolean r4 = r3.f19100a
            if (r4 == 0) goto L_0x0055
            r4 = r2
            goto L_0x005a
        L_0x0055:
            al.d1 r4 = new al.d1
            r4.<init>(r2)
        L_0x005a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f19054a
        L_0x005c:
            boolean r2 = r5.compareAndSet(r7, r3, r4)
            if (r2 == 0) goto L_0x0063
            goto L_0x0027
        L_0x0063:
            java.lang.Object r2 = r5.get(r7)
            if (r2 == r3) goto L_0x005c
            goto L_0x0027
        L_0x006a:
            boolean r3 = r2 instanceof al.e1
            if (r3 == 0) goto L_0x00c6
            r3 = r2
            al.e1 r3 = (al.e1) r3
            al.r1 r3 = r3.a()
            if (r3 != 0) goto L_0x0082
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            sk.j.d(r2, r3)
            al.l1 r2 = (al.l1) r2
            r7.b0(r2)
            goto L_0x0027
        L_0x0082:
            al.s1 r4 = al.s1.f19087a
            if (r8 == 0) goto L_0x00b6
            boolean r5 = r2 instanceof al.m1.c
            if (r5 == 0) goto L_0x00b6
            monitor-enter(r2)
            r5 = r2
            al.m1$c r5 = (al.m1.c) r5     // Catch:{ all -> 0x00b3 }
            java.lang.Throwable r5 = r5.c()     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00a1
            boolean r6 = r10 instanceof al.p     // Catch:{ all -> 0x00b3 }
            if (r6 == 0) goto L_0x00af
            r6 = r2
            al.m1$c r6 = (al.m1.c) r6     // Catch:{ all -> 0x00b3 }
            boolean r6 = r6.e()     // Catch:{ all -> 0x00b3 }
            if (r6 != 0) goto L_0x00af
        L_0x00a1:
            boolean r4 = r7.o(r2, r3, r1)     // Catch:{ all -> 0x00b3 }
            if (r4 != 0) goto L_0x00aa
            monitor-exit(r2)
            goto L_0x0027
        L_0x00aa:
            if (r5 != 0) goto L_0x00ae
            monitor-exit(r2)
            return r1
        L_0x00ae:
            r4 = r1
        L_0x00af:
            ek.i r6 = ek.i.f20112a     // Catch:{ all -> 0x00b3 }
            monitor-exit(r2)
            goto L_0x00b7
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00b6:
            r5 = r0
        L_0x00b7:
            if (r5 == 0) goto L_0x00bf
            if (r9 == 0) goto L_0x00be
            r10.invoke(r5)
        L_0x00be:
            return r4
        L_0x00bf:
            boolean r2 = r7.o(r2, r3, r1)
            if (r2 == 0) goto L_0x0027
            return r1
        L_0x00c6:
            if (r9 == 0) goto L_0x00d7
            boolean r8 = r2 instanceof al.u
            if (r8 == 0) goto L_0x00cf
            al.u r2 = (al.u) r2
            goto L_0x00d0
        L_0x00cf:
            r2 = r0
        L_0x00d0:
            if (r2 == 0) goto L_0x00d4
            java.lang.Throwable r0 = r2.f19094a
        L_0x00d4:
            r10.invoke(r0)
        L_0x00d7:
            al.s1 r8 = al.s1.f19087a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: al.m1.invokeOnCompletion(boolean, boolean, rk.l):al.t0");
    }

    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(w(), (Throwable) null, this);
        }
        t(cancellationException);
    }

    public void P(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }
}
