package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

class H0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f18628a;

    /* renamed from: b  reason: collision with root package name */
    int f18629b;

    H0(long j10, IntFunction intFunction) {
        if (j10 < 2147483639) {
            this.f18628a = (Object[]) intFunction.apply((int) j10);
            this.f18629b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    H0(Object[] objArr) {
        this.f18628a = objArr;
        this.f18629b = objArr.length;
    }

    public final E0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f18629b;
    }

    public final void e(Object[] objArr, int i10) {
        System.arraycopy(this.f18628a, 0, objArr, i10, this.f18629b);
    }

    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f18629b; i10++) {
            consumer.accept(this.f18628a[i10]);
        }
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f18628a;
        if (objArr.length == this.f18629b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.G0(this, j10, j11, intFunction);
    }

    public final Spliterator spliterator() {
        return Spliterators.m(this.f18628a, 0, this.f18629b);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f18628a.length - this.f18629b), Arrays.toString(this.f18628a)});
    }
}
