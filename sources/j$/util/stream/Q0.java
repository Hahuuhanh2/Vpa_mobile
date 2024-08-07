package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;

final class Q0 extends G0 {
    Q0(E0 e02, E0 e03) {
        super(e02, e03);
    }

    public final void e(Object[] objArr, int i10) {
        objArr.getClass();
        this.f18612a.e(objArr, i10);
        this.f18613b.e(objArr, i10 + ((int) this.f18612a.count()));
    }

    public final void forEach(Consumer consumer) {
        this.f18612a.forEach(consumer);
        this.f18613b.forEach(consumer);
    }

    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            e(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final E0 q(long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long count = this.f18612a.count();
        if (j10 >= count) {
            return this.f18613b.q(j10 - count, j11 - count, intFunction);
        }
        if (j11 <= count) {
            return this.f18612a.q(j10, j11, intFunction);
        }
        IntFunction intFunction2 = intFunction;
        return C0501v0.S0(1, this.f18612a.q(j10, count, intFunction2), this.f18613b.q(0, j11 - count, intFunction2));
    }

    public final Spliterator spliterator() {
        return new C0447h1(this);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("ConcNode[%s.%s]", new Object[]{this.f18612a, this.f18613b});
        }
        return String.format("ConcNode[size=%d]", new Object[]{Long.valueOf(count())});
    }
}
