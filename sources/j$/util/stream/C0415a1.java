package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.L;
import java.util.Arrays;

/* renamed from: j$.util.stream.a1  reason: case insensitive filesystem */
class C0415a1 implements B0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f18749a;

    /* renamed from: b  reason: collision with root package name */
    int f18750b;

    C0415a1(long j10) {
        if (j10 < 2147483639) {
            this.f18749a = new int[((int) j10)];
            this.f18750b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C0415a1(int[] iArr) {
        this.f18749a = iArr;
        this.f18750b = iArr.length;
    }

    public final D0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public final Object b() {
        int[] iArr = this.f18749a;
        int length = iArr.length;
        int i10 = this.f18750b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    public final void c(int i10, Object obj) {
        System.arraycopy(this.f18749a, 0, (int[]) obj, i10, this.f18750b);
    }

    public final long count() {
        return (long) this.f18750b;
    }

    public final void d(Object obj) {
        L l10 = (L) obj;
        for (int i10 = 0; i10 < this.f18750b; i10++) {
            l10.accept(this.f18749a[i10]);
        }
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C0501v0.B0(this, consumer);
    }

    /* renamed from: i */
    public final /* synthetic */ void e(Integer[] numArr, int i10) {
        C0501v0.y0(this, numArr, i10);
    }

    public final /* synthetic */ int j() {
        return 0;
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final /* synthetic */ E0 q(long j10, long j11, IntFunction intFunction) {
        return C0501v0.E0(this, j10, j11);
    }

    public final j$.util.L spliterator() {
        return Spliterators.k(this.f18749a, 0, this.f18750b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m38spliterator() {
        return Spliterators.k(this.f18749a, 0, this.f18750b);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f18749a.length - this.f18750b), Arrays.toString(this.f18749a)});
    }
}
