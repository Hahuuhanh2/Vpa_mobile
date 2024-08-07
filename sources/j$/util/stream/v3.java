package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

final class v3 extends w3 implements Spliterator, Consumer {

    /* renamed from: e  reason: collision with root package name */
    Object f18922e;

    v3(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11);
    }

    v3(Spliterator spliterator, v3 v3Var) {
        super(spliterator, v3Var);
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        while (s() != 1 && this.f18929a.a(this)) {
            if (q(1) == 1) {
                consumer.accept(this.f18922e);
                this.f18922e = null;
                return true;
            }
        }
        return false;
    }

    public final void accept(Object obj) {
        this.f18922e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Z2 z22 = null;
        while (true) {
            int s10 = s();
            if (s10 == 1) {
                return;
            }
            if (s10 == 2) {
                if (z22 == null) {
                    z22 = new Z2();
                } else {
                    z22.f18752a = 0;
                }
                long j10 = 0;
                while (this.f18929a.a(z22)) {
                    j10++;
                    if (j10 >= 128) {
                        break;
                    }
                }
                if (j10 != 0) {
                    long q10 = q(j10);
                    for (int i10 = 0; ((long) i10) < q10; i10++) {
                        consumer.accept(z22.f18746b[i10]);
                    }
                } else {
                    return;
                }
            } else {
                this.f18929a.forEachRemaining(consumer);
                return;
            }
        }
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    /* access modifiers changed from: protected */
    public final Spliterator r(Spliterator spliterator) {
        return new v3(spliterator, this);
    }
}
