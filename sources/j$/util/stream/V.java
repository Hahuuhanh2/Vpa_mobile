package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

final class V extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private Spliterator f18730a;

    /* renamed from: b  reason: collision with root package name */
    private final C0440f2 f18731b;

    /* renamed from: c  reason: collision with root package name */
    private final C0501v0 f18732c;

    /* renamed from: d  reason: collision with root package name */
    private long f18733d;

    V(V v2, Spliterator spliterator) {
        super(v2);
        this.f18730a = spliterator;
        this.f18731b = v2.f18731b;
        this.f18733d = v2.f18733d;
        this.f18732c = v2.f18732c;
    }

    V(C0501v0 v0Var, Spliterator spliterator, C0440f2 f2Var) {
        super((CountedCompleter) null);
        this.f18731b = f2Var;
        this.f18732c = v0Var;
        this.f18730a = spliterator;
        this.f18733d = 0;
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f18730a;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.f18733d;
        if (j10 == 0) {
            j10 = C0437f.f(estimateSize);
            this.f18733d = j10;
        }
        boolean t10 = T2.SHORT_CIRCUIT.t(this.f18732c.e1());
        boolean z10 = false;
        C0440f2 f2Var = this.f18731b;
        V v2 = this;
        while (true) {
            if (t10 && f2Var.h()) {
                break;
            } else if (estimateSize <= j10 || (trySplit = spliterator.trySplit()) == null) {
                v2.f18732c.T0(spliterator, f2Var);
            } else {
                V v10 = new V(v2, trySplit);
                v2.addToPendingCount(1);
                if (z10) {
                    spliterator = trySplit;
                } else {
                    V v11 = v2;
                    v2 = v10;
                    v10 = v11;
                }
                z10 = !z10;
                v2.fork();
                v2 = v10;
                estimateSize = spliterator.estimateSize();
            }
        }
        v2.f18732c.T0(spliterator, f2Var);
        v2.f18730a = null;
        v2.propagateCompletion();
    }
}
