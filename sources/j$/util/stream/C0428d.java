package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
abstract class C0428d extends C0437f {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f18772h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f18773i;

    protected C0428d(C0428d dVar, Spliterator spliterator) {
        super((C0437f) dVar, spliterator);
        this.f18772h = dVar.f18772h;
    }

    protected C0428d(C0501v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f18772h = new AtomicReference((Object) null);
    }

    public final Object b() {
        if (!(c() == null)) {
            return super.b();
        }
        Object obj = this.f18772h.get();
        return obj == null ? i() : obj;
    }

    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f18785b;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.f18786c;
        if (j10 == 0) {
            j10 = C0437f.f(estimateSize);
            this.f18786c = j10;
        }
        AtomicReference atomicReference = this.f18772h;
        boolean z10 = false;
        C0428d dVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z11 = dVar.f18773i;
            if (!z11) {
                C0437f c10 = dVar.c();
                while (true) {
                    C0428d dVar2 = (C0428d) c10;
                    if (z11 || dVar2 == null) {
                        break;
                    }
                    z11 = dVar2.f18773i;
                    c10 = dVar2.c();
                }
            }
            if (z11) {
                obj = dVar.i();
                break;
            } else if (estimateSize <= j10 || (trySplit = spliterator.trySplit()) == null) {
                obj = dVar.a();
            } else {
                C0428d dVar3 = (C0428d) dVar.d(trySplit);
                dVar.f18787d = dVar3;
                C0428d dVar4 = (C0428d) dVar.d(spliterator);
                dVar.f18788e = dVar4;
                dVar.setPendingCount(1);
                if (z10) {
                    spliterator = trySplit;
                    dVar = dVar3;
                    dVar3 = dVar4;
                } else {
                    dVar = dVar4;
                }
                z10 = !z10;
                dVar3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        dVar.e(obj);
        dVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[LOOP:0: B:7:0x000f->B:10:0x001b, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Object r3) {
        /*
            r2 = this;
            j$.util.stream.f r0 = r2.c()
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x001e
            if (r3 == 0) goto L_0x0021
            java.util.concurrent.atomic.AtomicReference r0 = r2.f18772h
        L_0x000f:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x000f
            goto L_0x0021
        L_0x001e:
            super.e(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0428d.e(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f18773i = true;
    }

    public final Object getRawResult() {
        return b();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        C0428d dVar = this;
        for (C0428d dVar2 = (C0428d) c(); dVar2 != null; dVar2 = (C0428d) dVar2.c()) {
            if (dVar2.f18787d == dVar) {
                C0428d dVar3 = (C0428d) dVar2.f18788e;
                if (!dVar3.f18773i) {
                    dVar3.g();
                }
            }
            dVar = dVar2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object i();
}
