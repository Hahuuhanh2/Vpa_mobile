package fl;

import al.g0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sk.j;
import sk.m;

/* compiled from: LockFreeLinkedList.kt */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20240a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20241b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20242c;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends a<i> {

        /* renamed from: b  reason: collision with root package name */
        public final i f20243b;

        /* renamed from: c  reason: collision with root package name */
        public i f20244c;

        public a(i iVar) {
            this.f20243b = iVar;
        }

        public final void b(Object obj, Object obj2) {
            boolean z10;
            i iVar;
            i iVar2 = (i) obj;
            boolean z11 = true;
            if (obj2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                iVar = this.f20243b;
            } else {
                iVar = this.f20244c;
            }
            if (iVar != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f20240a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(iVar2, this, iVar)) {
                        if (atomicReferenceFieldUpdater.get(iVar2) != this) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11 && z10) {
                    i iVar3 = this.f20243b;
                    i iVar4 = this.f20244c;
                    j.c(iVar4);
                    iVar3.f(iVar4);
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public /* synthetic */ class b extends m {
        public b(Object obj) {
            super(obj);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<i> cls2 = i.class;
        f20240a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f20241b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f20242c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r5 = ((fl.p) r5).f20258a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r4.compareAndSet(r3, r2, r5) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r4.get(r3) == r2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        if (r6 != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fl.i e() {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f20241b
            java.lang.Object r0 = r0.get(r10)
            fl.i r0 = (fl.i) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f20240a
            java.lang.Object r5 = r4.get(r2)
            r6 = 0
            r7 = 1
            if (r5 != r10) goto L_0x002c
            if (r0 != r2) goto L_0x0018
            return r2
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f20241b
        L_0x001a:
            boolean r1 = r8.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x0022
            r6 = r7
            goto L_0x0028
        L_0x0022:
            java.lang.Object r1 = r8.get(r10)
            if (r1 == r0) goto L_0x001a
        L_0x0028:
            if (r6 != 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return r2
        L_0x002c:
            boolean r8 = r10.l()
            if (r8 == 0) goto L_0x0033
            return r1
        L_0x0033:
            if (r5 != 0) goto L_0x0036
            return r2
        L_0x0036:
            boolean r8 = r5 instanceof fl.o
            if (r8 == 0) goto L_0x0040
            fl.o r5 = (fl.o) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0040:
            boolean r8 = r5 instanceof fl.p
            if (r8 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x005d
            fl.p r5 = (fl.p) r5
            fl.i r5 = r5.f20258a
        L_0x004a:
            boolean r8 = r4.compareAndSet(r3, r2, r5)
            if (r8 == 0) goto L_0x0052
            r6 = r7
            goto L_0x0058
        L_0x0052:
            java.lang.Object r8 = r4.get(r3)
            if (r8 == r2) goto L_0x004a
        L_0x0058:
            if (r6 != 0) goto L_0x005b
            goto L_0x0000
        L_0x005b:
            r2 = r3
            goto L_0x000a
        L_0x005d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f20241b
            java.lang.Object r2 = r4.get(r2)
            fl.i r2 = (fl.i) r2
            goto L_0x000b
        L_0x0066:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            sk.j.d(r5, r3)
            r3 = r5
            fl.i r3 = (fl.i) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: fl.i.e():fl.i");
    }

    public final void f(i iVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20241b;
        do {
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (h() == iVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20241b;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(iVar, iVar2, this)) {
                        if (atomicReferenceFieldUpdater2.get(iVar) != iVar2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (l()) {
            iVar.e();
        }
    }

    public final Object h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20240a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public final i j() {
        p pVar;
        i iVar;
        Object h10 = h();
        if (h10 instanceof p) {
            pVar = (p) h10;
        } else {
            pVar = null;
        }
        if (pVar != null && (iVar = pVar.f20258a) != null) {
            return iVar;
        }
        j.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (i) h10;
    }

    public final i k() {
        i e10 = e();
        if (e10 == null) {
            Object obj = f20241b.get(this);
            while (true) {
                e10 = (i) obj;
                if (!e10.l()) {
                    break;
                }
                obj = f20241b.get(e10);
            }
        }
        return e10;
    }

    public boolean l() {
        return h() instanceof p;
    }

    public String toString() {
        return new b(this) + '@' + g0.T(this);
    }
}
