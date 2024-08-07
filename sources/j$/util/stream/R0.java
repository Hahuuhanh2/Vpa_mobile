package j$.util.stream;

import j$.util.L;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

class R0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f18680a;

    /* renamed from: b  reason: collision with root package name */
    int f18681b;

    R0(long j10) {
        if (j10 < 2147483639) {
            this.f18680a = new double[((int) j10)];
            this.f18681b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    R0(double[] dArr) {
        this.f18680a = dArr;
        this.f18681b = dArr.length;
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final Object b() {
        double[] dArr = this.f18680a;
        int length = dArr.length;
        int i10 = this.f18681b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    public final void c(int i10, Object obj) {
        System.arraycopy(this.f18680a, 0, (double[]) obj, i10, this.f18681b);
    }

    public final long count() {
        return (long) this.f18681b;
    }

    public final void d(Object obj) {
        C0388n nVar = (C0388n) obj;
        for (int i10 = 0; i10 < this.f18681b; i10++) {
            nVar.accept(this.f18680a[i10]);
        }
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.A0(this, consumer);
    }

    /* renamed from: i */
    public final /* synthetic */ void e(Double[] dArr, int i10) {
        C0501v0.x0(this, dArr, i10);
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.D0(this, j10, j11);
    }

    public final L spliterator() {
        return Spliterators.j(this.f18680a, 0, this.f18681b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m32spliterator() {
        return Spliterators.j(this.f18680a, 0, this.f18681b);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f18680a.length - this.f18681b), Arrays.toString(this.f18680a)});
    }
}
